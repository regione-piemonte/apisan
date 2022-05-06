/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.integration.dao;

import java.util.List;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import it.csi.apisan.apisanceliachia.dto.apisanceliachia.Errore;
import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ErroreDettaglio;
import it.csi.apisan.apisanceliachia.util.LogUtil;




@Repository
public class ApisanCeliachiaDErroreDao extends JdbcDaoSupport {
	
	protected LogUtil log = new LogUtil(this.getClass());
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	
	/*
 SELECT celiachia_d_errore_business_id, cod_err, celiachia_d_presentation_id
FROM apisantracdb.apisan_celiachia_d_errore_business;

SELECT id, code, status, title
FROM apisantracdb.apisan_celiachia_d_errore_presentation;

	 * 
	 * */
	
	
	private final static String SQL_SELECT_FIND_ERROR="SELECT id,max(status) as stat,code,title " + 
			"	FROM apisan_celiachia_d_errore_presentation " + 
			"	where id in (" + 
			"		SELECT distinct celiachia_d_presentation_id " + 
			"	FROM apisan_celiachia_d_errore_business  " + 
			"	where cod_err in (:chiavi) " + 
			"	) group by id order by 2 desc limit 1 ";
	
	@Autowired
	public ApisanCeliachiaDErroreDao(DataSource dataSource, NamedParameterJdbcTemplate namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
		setDataSource(dataSource);
	}
	
	public Errore getMappingErrore(List<ErroreDettaglio> dettagli) {
		log.debug("getMappingErrore ", "BEGIN");
		SqlParameterSource parameters;
		if( dettagli!=null && dettagli.size()>0 ) {
			parameters = new MapSqlParameterSource("chiavi", dettagli.stream().map(d -> d.getChiave()).collect(Collectors.toList()));
		}else {
			parameters = new MapSqlParameterSource("chiavi", "UC_ERR_000");
		}
		Errore errore = new Errore();
		errore.setCode("9999"); 
		errore.setStatus(502); 
		errore.setTitle("Errore richiamo celiachia"); 
		
		errore.setDetail(dettagli);
		namedJdbcTemplate.query(SQL_SELECT_FIND_ERROR, parameters,(rs, rowNum) -> {
		  
			String code = rs.getString("code");
			int stat = rs.getInt("stat");
			String title = rs.getString("title");
			errore.setCode(code!=null?code.trim():errore.getCode());
			errore.setStatus(stat!=0?stat:errore.getStatus());
			errore.setTitle(title!=null?title.trim():errore.getTitle());
		    return errore;
		});
		
		return errore;
	}
}
