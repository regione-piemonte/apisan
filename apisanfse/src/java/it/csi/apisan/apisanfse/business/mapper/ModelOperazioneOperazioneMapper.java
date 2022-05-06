/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelOperazione;
import it.csi.apisan.apisanfse.integration.documenti.dma.ComponenteLocaleOperazione;

public class ModelOperazioneOperazioneMapper extends BaseMapper<ModelOperazione, ComponenteLocaleOperazione> {

	@Override
	public ComponenteLocaleOperazione to(ModelOperazione source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelOperazione from(ComponenteLocaleOperazione dest) {
		if(dest == null) {
			return null;
		}
		ModelOperazione source = new ModelOperazione();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		source.setRiferimento(dest.getRiferimento());
		source.setTimeoutMaxOperazione(dest.getTimeoutMaxElaborazione());
		
		return source;
	}

}
