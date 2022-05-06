/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelGeneralitaAssistito;

public class ModelGeneralitaAssistitoModelGeneralitaAssistitoMapper extends BaseMapper<ModelGeneralitaAssistito, it.csi.apisan.apisanscerev.dto.scerev.ModelGeneralitaAssistito> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelGeneralitaAssistito to(ModelGeneralitaAssistito source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelGeneralitaAssistito dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelGeneralitaAssistito();
		dest.setCognome(source.getCognome());
		dest.setComuneNascita(source.getComuneNascita());
		dest.setDataNascita(source.getDataNascita());
		dest.setNome(source.getNome());
		return dest;
	}

	@Override
	public ModelGeneralitaAssistito from(it.csi.apisan.apisanscerev.dto.scerev.ModelGeneralitaAssistito dest) {
		if(dest == null) {
			return null;
		}
		ModelGeneralitaAssistito source = new ModelGeneralitaAssistito();
		source.setCognome(dest.getCognome());
		source.setComuneNascita(dest.getComuneNascita());
		source.setDataNascita(dest.getDataNascita());
		source.setNome(dest.getNome());
		return source;
		
	}

}
