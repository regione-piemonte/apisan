/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.EtichettaDocumenti;
import it.csi.apisan.apisanfse.dto.apisanfse.EtichettaEtichette;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichettaNumeroDocumenti;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.EtichettaNumeroDocumenti;

public class ModelEtichettaNumeroDocumentiEtichettaNumeroDocumentiMapper extends BaseMapper<ModelEtichettaNumeroDocumenti, EtichettaNumeroDocumenti> {

	@Override
	public EtichettaNumeroDocumenti to(ModelEtichettaNumeroDocumenti source) {
		
		return null;
	}

	@Override
	public ModelEtichettaNumeroDocumenti from(EtichettaNumeroDocumenti dest) {
		if(dest == null) {
			return null;
		}
		ModelEtichettaNumeroDocumenti source = new ModelEtichettaNumeroDocumenti();
		
		source.setEtichetta(new  ModelEtichettaEtichettaMapper().from(new EtichettaDocumenti( dest.getEtichetta())));
		
		source.setNumeroDocumenti(dest.getNumeroDocumenti());
		return source;
	}

}
