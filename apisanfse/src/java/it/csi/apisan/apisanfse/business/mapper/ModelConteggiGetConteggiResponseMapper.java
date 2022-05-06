/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelConteggio;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetConteggiResponse;

public class ModelConteggiGetConteggiResponseMapper extends BaseMapper<ModelConteggio, GetConteggiResponse> {

	@Override
	public GetConteggiResponse to(ModelConteggio source) {
		return null;
	}

	@Override
	public ModelConteggio from(GetConteggiResponse dest) {
		if(dest == null) {
			return null;
		}
		ModelConteggio source = new ModelConteggio();
		source.setEtichetteNumeroDocumenti(new ModelEtichettaNumeroDocumentiEtichettaNumeroDocumentiMapper().fromList(dest.getEtichettaToNumeroDocumenti()));
		source.setNumeroDocumentiSenzaEtichette(dest.getNumeroDocumentiSenzaEtichette());
		source.setNumeroDocumentiTotali(dest.getNumeroDocumentiTotali());
		source.setNumeroEpisodi(dest.getNumeroEpisodi());
		
		return source;
	}

}
