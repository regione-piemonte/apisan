/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.integration.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import it.csi.apisan.apisanfse.business.integration.dao.dto.ApisanTCategoriaDocumentoDto;
import it.csi.apisan.apisanfse.business.integration.dao.rowmapper.ApisanTCategoriaRowMapper;
import it.csi.apisan.apisanfse.business.integration.dao.rowmapper.CategoriaTipologiaRowMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelCategoria;
import it.csi.apisan.apisanfse.dto.apisanfse.TipoDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.CategoriaTipologia;
import it.csi.apisan.apisanfse.util.LogUtil;

@Repository
public class ApisanTCategoriaTipoDocDao extends JdbcDaoSupport{
	protected LogUtil log = new LogUtil(this.getClass());
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	
	
	private final static String SQL_CATEGORIA_DOC = "select cat.fse_d_categoria_id as idCat, cat.codice as codiceCat, cat.descrizione as descrCat,"
								 + "documento.fse_d_tipo_documento_id as idDocumento, documento.codice  as docCodice, documento.descrizione as documentoDescrizione "
								 +" from apisan_fse_d_categoria cat "
								 + " left outer join apisan_fse_r_categoria_tipodoc rcategoria on (cat.fse_d_categoria_id =  rcategoria.fse_categoria_id) "
								 + " left outer join apisan_fse_d_tipo_documento documento on (rcategoria.fse_tipo_documento_id = documento.fse_d_tipo_documento_id   ) "
								 + " left outer join apisan_fse_d_applicativo_verticale verticale on (verticale.fse_d_applicativo_verticale_id = rcategoria.fse_applicativo_verticale_id) "
								 + " where verticale.codice = upper( :codce_verticale) "
								 + " and now() between validita_inizio and coalesce(validita_fine, to_timestamp('01/01/2999','dd/mm/yyyy'))"
								 + " order by idCat";
	
	private final static String SQL_GETCATEGORIE_DOC = "select  cat.codice as idCat, documento.codice  as docCodice "
						 +" from apisan_fse_d_categoria cat "
						 + " inner join apisan_fse_r_categoria_tipodoc rcategoria on (cat.fse_d_categoria_id =  rcategoria.fse_categoria_id) "
						 + " inner join apisan_fse_d_tipo_documento documento on (rcategoria.fse_tipo_documento_id = documento.fse_d_tipo_documento_id   )"
						 + " inner join apisan_fse_d_applicativo_verticale verticale on (verticale.fse_d_applicativo_verticale_id = rcategoria.fse_applicativo_verticale_id) "
						 + " where verticale.codice = 'FSEDOC' "
						 +" and now() between validita_inizio and coalesce(validita_fine, to_timestamp('01/01/2999','dd/mm/yyyy')) "
						 + " order by idCat";  
	
	
	//CategoriaTipologia

	@Autowired
	public ApisanTCategoriaTipoDocDao(DataSource dataSource, NamedParameterJdbcTemplate  namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
		setDataSource(dataSource);
	}
	
	
	public List<CategoriaTipologia> getCategorieTipologiePerGetTuttiDocs(){
		final String METHOD_NAME = "getCategorieTipologiePerGetTuttiDocs";
		List<CategoriaTipologia> categorie = new ArrayList<CategoriaTipologia>();
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(SQL_GETCATEGORIE_DOC);
			categorie = namedJdbcTemplate.query(sql.toString(), new CategoriaTipologiaRowMapper());
		} catch (EmptyResultDataAccessException e) {
			return categorie;
		}
		
		return categorie;
	}
	
	public List<ModelCategoria> getCategorieDocumenti(String codiceApplicazioneVerticale){
		final String METHOD_NAME = "getCategorieDocumenti";
		log.info(METHOD_NAME, "BEGIN");
		//List<ApisanTCategoriaDocumentoDto> lista = new ArrayList<ApisanTCategoriaDocumentoDto>();
		List<ModelCategoria> listanew = null;

		try {
			StringBuilder sql = new StringBuilder();
			sql.append(SQL_CATEGORIA_DOC);
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue("codce_verticale", codiceApplicazioneVerticale);
			//lista = namedJdbcTemplate.query(sql.toString(),  new ApisanTCategoriaRowMapper());

			listanew = namedJdbcTemplate.query(sql.toString(), params, new ResultSetExtractor<List<ModelCategoria>>() {
				@Override
				public List<ModelCategoria> extractData(ResultSet rs) throws SQLException, DataAccessException {
					Integer idCategoriaTmp = 0;
					Integer idCategoriaPrec = 0;
					List<ModelCategoria> listacategoria = new ArrayList<ModelCategoria>();

					while(rs.next()) {
						idCategoriaTmp = rs.getInt("idCat");
						String codiceCategoria = rs.getString("codiceCat"); 
						TipoDocumento docTmp = new TipoDocumento();
						docTmp.setCodice(rs.getString("docCodice"));
						docTmp.setDescrizione(rs.getString("documentoDescrizione"));

						if (idCategoriaTmp != idCategoriaPrec) {
							ModelCategoria tmp = new ModelCategoria();
							tmp.setCodice(codiceCategoria);
							tmp.setDescrizione(rs.getString("descrCat"));
							List<TipoDocumento> listaTipoDoc = new ArrayList<TipoDocumento>();
							listaTipoDoc.add(docTmp);
							tmp.setTipiDocumento(listaTipoDoc);
							listacategoria.add(tmp);

						} else {
							Optional<ModelCategoria> tmp = listacategoria.stream().filter(c -> c.getCodice().equalsIgnoreCase(codiceCategoria)).findFirst();
							tmp.get().getTipiDocumento().add(docTmp);

						}
						idCategoriaPrec = idCategoriaTmp;
					}
					return listacategoria;
				}

			});

		} catch (EmptyResultDataAccessException e) {
			return new ArrayList<ModelCategoria>();
		}
		return listanew;
	}
	
	
}
