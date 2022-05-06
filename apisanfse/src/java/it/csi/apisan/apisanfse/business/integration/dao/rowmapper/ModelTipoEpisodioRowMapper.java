/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.integration.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelTipoEpisodio;

public class ModelTipoEpisodioRowMapper implements RowMapper<ModelTipoEpisodio> {

	@Override
	public ModelTipoEpisodio mapRow(ResultSet rs, int rowNum) throws SQLException {
		ModelTipoEpisodio episodio = new ModelTipoEpisodio();
		episodio.setCodice(rs.getString("codice"));
		episodio.setDescrizione(rs.getString("descrizione"));
		return episodio;
	}

	
}
