/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelAsl;

public class ModelAslStringMapper extends BaseMapper<ModelAsl, String> {

	@Override
	public String to(ModelAsl source) {
		return null;
	}

	@Override
	public ModelAsl from(String dest) {
		if(dest == null) {
			return null;
		}
		ModelAsl source = new ModelAsl();
		String[] asl = dest.split("\\~");
		try {
			source.setCodice(asl[0]);
		}catch(Exception e) {
			
		}
		try {
			source.setDescrizione(asl[1]);
		} catch(Exception e) {
			
		}
		
		return source;
	}

}
