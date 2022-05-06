/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMotivazioneSoggiorno;

public class MotivazioneSoggiornoMotivazioneSoggiornoMapper extends BaseMapper<ModelMotivazioneSoggiorno, it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno to(ModelMotivazioneSoggiorno source) {
		it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno();
		dest.setId(source.getId());
		dest.setDescrizione(source.getDescrizione());
		dest.setCittadiniComunitari(source.isCittadiniComunitari());
		return dest;
	}

	@Override
	public ModelMotivazioneSoggiorno from(it.csi.apisan.apisanscerev.dto.scerev.ModelMotivazioneSoggiorno dest) {
		ModelMotivazioneSoggiorno source = new ModelMotivazioneSoggiorno();
		source.setId(dest.getId());
		source.setDescrizione(dest.getDescrizione());
		source.setCittadiniComunitari(dest.isCittadiniComunitari());
		return source;
	}

}
