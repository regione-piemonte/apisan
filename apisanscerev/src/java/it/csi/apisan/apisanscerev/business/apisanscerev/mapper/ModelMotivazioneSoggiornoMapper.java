/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMotivazioneSoggiorno;

public class ModelMotivazioneSoggiornoMapper extends BaseMapper<ModelMotivazioneSoggiorno, it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno to(ModelMotivazioneSoggiorno source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno();
		dest.setDescrizione(source.getDescrizione());
		dest.setId(source.getId());
		dest.setCittadiniComunitari(source.isCittadiniComunitari());
		return dest;
	}

	@Override
	public ModelMotivazioneSoggiorno from(it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno dest) {
		if(dest == null) {
			return null;
		}
		ModelMotivazioneSoggiorno source = new ModelMotivazioneSoggiorno();
		source.setDescrizione(dest.getDescrizione());
		source.setId(dest.getId());
		source.setCittadiniComunitari(dest.isCittadiniComunitari());
		return source;
	}

}
