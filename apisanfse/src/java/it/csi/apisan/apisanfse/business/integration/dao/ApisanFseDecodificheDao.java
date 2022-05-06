/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.integration.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import it.csi.apisan.apisanfse.business.integration.dao.rowmapper.ModelDecodificaAccessoRowMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDecodificaAccesso;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.util.LogUtil;

@Repository
public class ApisanFseDecodificheDao extends JdbcDaoSupport {
	protected LogUtil log = new LogUtil(this.getClass());
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	
	private final static String SQL_GET_VALORE = "SELECT valore FROM apisantracdb.apisan_fse_d_costanti where chiave = :chiave";
	private final static String SQL_GET_DECODIFICHE_ACCESSI = "SELECT fse_d_accessi_servizio_id, codice_verticale, codice_servizio, descrizione_servizio FROM apisantracdb.apisan_fse_d_accessi_servizio ";
	
	@Autowired
	public ApisanFseDecodificheDao(DataSource dataSource, NamedParameterJdbcTemplate  namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
		setDataSource(dataSource);
	}
	
	
	public String getParametroConfigurazione(String chiave) {
		String ret = "";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("chiave", chiave);
		try {
			ret = (String) namedJdbcTemplate.queryForObject(SQL_GET_VALORE,  params, String.class);
		} catch (DataAccessException e) {
			return ret;
		}
		return ret; 
	}
	
	
	public List<ModelDecodificaAccesso> getDecodificheAccessiServizio(){
		
		List<ModelDecodificaAccesso> lista = new ArrayList<ModelDecodificaAccesso>();
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(SQL_GET_DECODIFICHE_ACCESSI);
			lista = namedJdbcTemplate.query(sql.toString(), new ModelDecodificaAccessoRowMapper());
			
		}catch(EmptyResultDataAccessException e) {
			e.printStackTrace();
			return lista;
		}
		return lista;
	}
	
	public ModelDecodificaAccesso getDecodificaAccessiServizioFromCodice(String codice) {
		ModelDecodificaAccesso ret = null;
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("codice", codice);
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(SQL_GET_DECODIFICHE_ACCESSI);
			sql.append(" WHERE codice_servizio = :codice");
			ret = (ModelDecodificaAccesso)  namedJdbcTemplate.queryForObject(sql.toString(), params, new ModelDecodificaAccessoRowMapper());
			
			/*List<ModelDecodificaAccesso> lista =  namedJdbcTemplate..query(sql.toString(), params, new ModelDecodificaAccessoRowMapper());
			if(lista != null && lista.size() > 0) {
				ret = lista.get(0);
			}*/
			
		}  catch (DataAccessException e) {
			throw ErroreBuilder.from(Status.NOT_FOUND).title("Decodifica non trovata").exception();
		}
		return ret; 
		
	}
}
