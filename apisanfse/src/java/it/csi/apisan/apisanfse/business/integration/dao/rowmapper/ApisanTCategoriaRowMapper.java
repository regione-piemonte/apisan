/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.integration.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import it.csi.apisan.apisanfse.business.integration.dao.dto.ApisanTCategoriaDocumentoDto;

public class ApisanTCategoriaRowMapper implements RowMapper<ApisanTCategoriaDocumentoDto> {

	

	@Override
	public ApisanTCategoriaDocumentoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ApisanTCategoriaDocumentoDto row = new ApisanTCategoriaDocumentoDto();
		row.setCodiceCategoria(rs.getString("codiceCat"));
		row.setCodiceDocumento(rs.getString("docCodice"));
		row.setDescrizioneCategoria(rs.getString("descrCat"));
		row.setDescrizioneDocumento(rs.getString("documentoDescrizione"));
		row.setIdCategoria(rs.getInt("idCat"));
		row.setIdDocumento(rs.getInt("idDocumento"));
				
		return row;
	}

}
