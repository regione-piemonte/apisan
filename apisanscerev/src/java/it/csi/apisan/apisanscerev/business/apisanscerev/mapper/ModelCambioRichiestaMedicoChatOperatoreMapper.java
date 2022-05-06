/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiestaChatOperatore;

public class ModelCambioRichiestaMedicoChatOperatoreMapper extends BaseMapper<ModelCambioMedicoRichiestaChatOperatore, it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaChatOperatore> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaChatOperatore to(
			ModelCambioMedicoRichiestaChatOperatore source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaChatOperatore dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaChatOperatore();
		dest.setCittadino(source.isCittadino());
		dest.setData(source.getData());
		dest.setTesto(source.getTesto());
		return dest;
	}

	@Override
	public ModelCambioMedicoRichiestaChatOperatore from(
			it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaChatOperatore dest) {
		if(dest == null) {
			return null;
		}
		ModelCambioMedicoRichiestaChatOperatore source = new ModelCambioMedicoRichiestaChatOperatore();
		source.setCittadino(dest.isCittadino());
		source.setData(dest.getData());
		source.setTesto(dest.getTesto());
		return source;
	}

}
