/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMotivazioneDomicilio;

public class ModelMotivazioneDomicilioMapper extends BaseMapper<ModelMotivazioneDomicilio, it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio to(ModelMotivazioneDomicilio source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio();
		dest.setDescrizione(source.getDescrizione());
		dest.setId(source.getId());
		return dest;
	}

	@Override
	public ModelMotivazioneDomicilio from(it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio dest) {
		if(dest == null) {
			return null;
		}
		ModelMotivazioneDomicilio  source = new ModelMotivazioneDomicilio();
		source.setDescrizione(dest.getDescrizione());
		source.setId(dest.getId());
		return source;
	}

}
