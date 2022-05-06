/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAsl;

public class ModelAslModelAslMapper extends BaseMapper<ModelAsl, it.csi.apisan.apisanscerev.dto.scerev.ModelAsl> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelAsl to(ModelAsl source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelAsl dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelAsl();
		dest.setId(source.getId());
		dest.setDescrizione(source.getDescrizione());
		return dest;
	}

	@Override
	public ModelAsl from(it.csi.apisan.apisanscerev.dto.scerev.ModelAsl dest) {
		if(dest == null) {
			return null;
		}
		ModelAsl source = new ModelAsl();
		source.setId(dest.getId());
		source.setDescrizione(dest.getDescrizione());
		return source;
	}

}
