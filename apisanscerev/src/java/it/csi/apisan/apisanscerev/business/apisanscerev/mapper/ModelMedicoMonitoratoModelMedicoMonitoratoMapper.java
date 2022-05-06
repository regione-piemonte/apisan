/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoMonitorato;

public class ModelMedicoMonitoratoModelMedicoMonitoratoMapper extends BaseMapper<ModelMedicoMonitorato, it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoMonitorato> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoMonitorato to(ModelMedicoMonitorato source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelMedicoMonitorato from(it.csi.apisan.apisanscerev.dto.scerev.ModelMedicoMonitorato dest) {
		if(dest == null) {
			return null;
		}
		ModelMedicoMonitorato source = new ModelMedicoMonitorato();
		source.setCodiceFiscale(dest.getCodiceFiscale());
		source.setCognome(dest.getCognome());
		source.setId(dest.getId());
		source.setNome(dest.getNome());
		return source;
	}

}
