/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelDataDisponibile;

public class ModelDataDisponibileStringMapper extends BaseMapper<ModelDataDisponibile, String> {

	@Override
	public String to(ModelDataDisponibile source) {
		return null;
	}

	@Override
	public ModelDataDisponibile from(String dest) {
		if(dest == null) {
			return null;
		}
		ModelDataDisponibile source = new ModelDataDisponibile();
		source.setData( new DateStringMapper("dd-MM-yyyy").from(dest));
		return source;
	}

}
