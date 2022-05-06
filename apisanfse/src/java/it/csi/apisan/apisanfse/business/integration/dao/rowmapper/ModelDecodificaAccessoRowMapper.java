/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.integration.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelDecodificaAccesso;

public class ModelDecodificaAccessoRowMapper implements RowMapper<ModelDecodificaAccesso> {

	

	@Override
	public ModelDecodificaAccesso mapRow(ResultSet rs, int rowNum) throws SQLException {
		ModelDecodificaAccesso model = new ModelDecodificaAccesso();
		model.setCodiceServizio(rs.getString("codice_servizio"));
		model.setCodiceVerticale(rs.getString("codice_verticale"));
		model.setDescrizioneServizio(rs.getString("descrizione_servizio"));
		return model;
	}

}
