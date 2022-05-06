/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoDistretto;

public class ModelMedicoDistrettoModelMedicoDistrettoMapper extends BaseMapper<ModelMedicoDistretto, it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoDistretto> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoDistretto to(ModelMedicoDistretto source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoDistretto dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoDistretto();
		dest.setCodice(source.getCodice());
		dest.setDescrizione(source.getDescrizione());
		return dest;
	}

	@Override
	public ModelMedicoDistretto from(it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoDistretto dest) {
		if(dest == null) {
			return null;
		}
		ModelMedicoDistretto source = new ModelMedicoDistretto();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		return source;
	}

}
