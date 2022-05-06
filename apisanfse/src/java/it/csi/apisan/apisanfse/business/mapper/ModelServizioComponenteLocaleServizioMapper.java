/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelServizio;
import it.csi.apisan.apisanfse.integration.documenti.dma.ComponenteLocaleServizio;

public class ModelServizioComponenteLocaleServizioMapper extends BaseMapper<ModelServizio, ComponenteLocaleServizio> {

	@Override
	public ComponenteLocaleServizio to(ModelServizio source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelServizio from(ComponenteLocaleServizio dest) {
		if(dest == null) {
			return null;
		}
		ModelServizio source = new ModelServizio();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		source.setOperazioni(new ModelOperazioneOperazioneMapper().fromList(dest.getOperazioni()));
		source.setRiferimento(dest.getRiferimento());
		source.setUrlServizio(dest.getUrlServizio());
		
		return source;
	}

}
