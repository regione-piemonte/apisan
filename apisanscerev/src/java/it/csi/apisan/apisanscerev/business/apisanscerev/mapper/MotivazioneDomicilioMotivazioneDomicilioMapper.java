/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMotivazioneDomicilio;

public class MotivazioneDomicilioMotivazioneDomicilioMapper extends BaseMapper<ModelMotivazioneDomicilio, it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio to(ModelMotivazioneDomicilio source) {
		it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio();
		dest.setId(source.getId());
		dest.setDescrizione(source.getDescrizione());
		return dest;
	}

	@Override
	public ModelMotivazioneDomicilio from(it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneDomicilio dest) {
		ModelMotivazioneDomicilio source = new ModelMotivazioneDomicilio();
		source.setId(dest.getId());
		source.setDescrizione(dest.getDescrizione());
		return source;
	}

}
