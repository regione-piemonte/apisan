/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoRecapiti;

public class ModelCittadinoRecapitiMapper extends BaseMapper<ModelCittadinoRecapiti, it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoRecapiti> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoRecapiti to(ModelCittadinoRecapiti source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoRecapiti dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoRecapiti();
		dest.setIndirizzoEmail(source.getIndirizzoEmail());
		dest.setTelefono(source.getTelefono());
		dest.setTelefonoSecondario(source.getTelefonoSecondario());
		return dest;
	}

	@Override
	public ModelCittadinoRecapiti from(it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoRecapiti dest) {
		if(dest == null) {
			return null;
		}
		ModelCittadinoRecapiti source = new ModelCittadinoRecapiti();
		source.setIndirizzoEmail(dest.getIndirizzoEmail());
		source.setTelefono(dest.getTelefono());
		source.setTelefonoSecondario(dest.getTelefonoSecondario());
		return source;
	}

}
