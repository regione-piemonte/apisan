/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.integration.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import it.csi.apisan.apisanfse.integration.documenti.dmacc.Categoria;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.CategoriaTipologia;

public class CategoriaTipologiaRowMapper implements RowMapper<CategoriaTipologia> {

	@Override
	public CategoriaTipologia mapRow(ResultSet rs, int rowNum) throws SQLException {
		CategoriaTipologia categoria = new CategoriaTipologia();
		String cat = rs.getString("idCat");
		categoria.setCategoria(Categoria.fromValue(cat));
		categoria.setTipologia(rs.getString("docCodice"));
		
		return categoria;
	}

	

}
