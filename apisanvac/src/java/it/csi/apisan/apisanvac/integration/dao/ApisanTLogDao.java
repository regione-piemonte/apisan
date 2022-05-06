/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.integration.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import it.csi.apisan.apisanvac.integration.dao.dto.ApisanTrace;
import it.csi.apisan.apisanvac.util.ConstantsVac;

@Repository
public class ApisanTLogDao extends JdbcDaoSupport {
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	
	
	private final static String SQL_INSERT_T_LOG_CHIAMATA = 
			"insert into " + ConstantsVac.TABELLA_LOG + " ( x_request_id, cf_chiamante, x_codice_servizio, ip_chiamante, cf_richiedente, componente, esito_chiamata,"
			+ "request_payload, response_payload, request_date, response_date, metodo, request_uri ) "
			+ "values ( :x_request_id, :cf_chiamante, :x_codice_servizio, :ip_chiamante, :cf_richiedente, :componente, :esito_chiamata,"
			+ " pgp_sym_encrypt_bytea(:request_payload, :encryption_key ), pgp_sym_encrypt_bytea(:response_payload, :encryption_key ), now(), :response_date, :metodo, :request_uri)";
	
	private final static String SQL_UPDATE_T_LOG_CHIAMATA = 
			"update " + ConstantsVac.TABELLA_LOG + " set response_payload = pgp_sym_encrypt_bytea(:response_payload, :encryption_key ),  response_date = now(), esito_chiamata = :esito_chiamata, millis_response = :millis_response"
			+ " where vac_t_log_chiamate_id = :vac_t_log_chiamate_id";
	
	
	
	@Autowired 
	public ApisanTLogDao(DataSource dataSource, NamedParameterJdbcTemplate  namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
		
		setDataSource(dataSource);
		
	}
	
	
	public long insertTLogChiamata(ApisanTrace trace) throws DataAccessException{
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		MapSqlParameterSource params = new MapSqlParameterSource();
		
		params.addValue("x_request_id", trace.getxRequestId()  , Types.VARCHAR);  
		params.addValue("cf_chiamante", trace.getCfChiamante()  , Types.VARCHAR);  
		params.addValue("x_codice_servizio", trace.getxCodiceServizio()  , Types.VARCHAR);  
		params.addValue("ip_chiamante", trace.getIpChiamante()  , Types.VARCHAR);  
		params.addValue("cf_richiedente",  trace.getCfRichiedente() , Types.VARCHAR);  
		params.addValue("componente", trace.getComponente()  , Types.VARCHAR);  
		params.addValue("esito_chiamata", trace.getEsitoChiamata(), Types.INTEGER);
		//params.addValue("request_payload", trace.getRequestPayload()  , Types.BINARY);
		//params.addValue("request_payload", "pgp_sym_encrypt_bytea(" + trace.getRequestPayload()+", '@encryption_key@')", Types.BINARY); 
		params.addValue("request_payload",  trace.getRequestPayload(), Types.BINARY);
		//params.addValue("encryption_key",  "@encryptionkey@", Types.VARCHAR);
		params.addValue("encryption_key",  "@encryptionkey@", Types.VARCHAR);
		params.addValue("response_payload",  trace.getResponsePayload() , Types.BINARY);
		
		
		params.addValue("response_date",  trace.getResponseDate() , Types.DATE);   
		params.addValue("metodo",  trace.getMetodo() , Types.VARCHAR);
		params.addValue("request_uri",  trace.getRequestUri() , Types.VARCHAR);
				
		namedJdbcTemplate.update(SQL_INSERT_T_LOG_CHIAMATA, params, keyHolder, new String[]{"vac_t_log_chiamate_id"} ); 
		return keyHolder.getKey().longValue();
	}
	
	public int updateTLogChiamata(ApisanTrace trace, Long id) {
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		
		params.addValue("response_payload",  trace.getResponsePayload() , Types.BINARY);
		params.addValue("encryption_key",  "@encryptionkey@", Types.VARCHAR);
		params.addValue("esito_chiamata", trace.getEsitoChiamata(), Types.INTEGER);
		params.addValue("millis_response", trace.getMillisResponse(), Types.BIGINT);
		
		params.addValue("vac_t_log_chiamate_id", id, Types.BIGINT);  
		
		return namedJdbcTemplate.update(SQL_UPDATE_T_LOG_CHIAMATA, params);
	}
	
	

	
	
}
