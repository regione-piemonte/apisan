/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.integration.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import it.csi.apisan.apisanprof.util.LogUtil;

@Repository
public class ApisanprofConfigurazioniDao extends JdbcDaoSupport {
	protected LogUtil log = new LogUtil(this.getClass());
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	private static final String SELECT_CONFIGURAZIONE = "SELECT valore " 
			+ "FROM apisan_prof_d_configurazione WHERE codice = :CODICE";
	
	
	@Autowired
	public ApisanprofConfigurazioniDao(DataSource dataSource, NamedParameterJdbcTemplate  namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
		setDataSource(dataSource);
	}
	
	
	public int getValoreConfigurazione(String codice) {
		final String METHOD_NAME = "getValoreConfigurazione";
		int timeout;
		try {
			MapSqlParameterSource params = new MapSqlParameterSource();
			
			params.addValue("CODICE", codice);
			
			timeout = namedJdbcTemplate.queryForObject(SELECT_CONFIGURAZIONE, params, Integer.class);
		} catch (DataAccessException e) {

			return 10000;
		}
		
		return timeout;
	}
}
