/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoTipologia;

public class ModelMedicoTipologiaModelMedicoTipologiaMapper extends BaseMapper<ModelMedicoTipologia, it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoTipologia> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoTipologia to(ModelMedicoTipologia source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoTipologia dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoTipologia();
		dest.setId(source.getId());
		dest.setDescrizione(source.getDescrizione());
		return dest;
	}

	@Override
	public ModelMedicoTipologia from(it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoTipologia dest) {
		if(dest == null) {
			return null;
		}
		ModelMedicoTipologia source = new ModelMedicoTipologia();
		source.setId(dest.getId());
		source.setDescrizione(dest.getDescrizione());
		return source;
	}

}
