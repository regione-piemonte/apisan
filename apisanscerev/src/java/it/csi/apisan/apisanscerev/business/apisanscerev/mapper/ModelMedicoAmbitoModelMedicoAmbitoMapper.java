/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoAmbito;

public class ModelMedicoAmbitoModelMedicoAmbitoMapper extends BaseMapper<ModelMedicoAmbito, it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoAmbito> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoAmbito to(ModelMedicoAmbito source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoAmbito dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoAmbito();
		dest.setAmbitoCodice(source.getAmbitoCodice());
		dest.setAmbitoDescrizione(source.getAmbitoDescrizione());
		
		return dest;
	}

	@Override
	public ModelMedicoAmbito from(it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoAmbito dest) {
		if(dest == null) {
			return null;
		}
		ModelMedicoAmbito source = new ModelMedicoAmbito();
		source.setAmbitoCodice(dest.getAmbitoCodice());
		source.setAmbitoDescrizione(dest.getAmbitoDescrizione());
		return source;
	}

}
