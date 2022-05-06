/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.integration.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import it.csi.apisan.apisanfse.business.integration.dao.rowmapper.CategoriaTipologiaRowMapper;
import it.csi.apisan.apisanfse.business.integration.dao.rowmapper.ModelTipoEpisodioRowMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelTipoEpisodio;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.CategoriaTipologia;
import it.csi.apisan.apisanfse.util.LogUtil;

@Repository
public class ApisanDTipoEpisodioDao extends JdbcDaoSupport {
	protected LogUtil log = new LogUtil(this.getClass());
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	
	private static final String SQL_TIPO_EPISODIO = "select fse_d_tipo_episodio_id, codice, descrizione from apisan_fse_d_tipo_episodio";
	
	@Autowired
	public ApisanDTipoEpisodioDao(DataSource dataSource, NamedParameterJdbcTemplate  namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
		setDataSource(dataSource);
	}
	
	
	
	public List<ModelTipoEpisodio> getTipiEpisodio(){
		final String METHOD_NAME = "getTipiEpisodio";
		List<ModelTipoEpisodio> lista = new ArrayList<ModelTipoEpisodio>();
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(SQL_TIPO_EPISODIO);
			lista = namedJdbcTemplate.query(sql.toString(), new ModelTipoEpisodioRowMapper());
			
		}catch(EmptyResultDataAccessException e) {
			return lista;
		}
		
		
		return lista;
		
	}
}
