/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelDettRichTelPraticaRicevuta;
import it.csi.gpr.LMSDettRicTelPraticaRicevutaType;

public class ModelDettRichTelPraticaRicevutaLMSDettRicTelPraticaRicevutaTypeMapper extends BaseMapper<ModelDettRichTelPraticaRicevuta, LMSDettRicTelPraticaRicevutaType> {

	@Override
	public LMSDettRicTelPraticaRicevutaType to(ModelDettRichTelPraticaRicevuta source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelDettRichTelPraticaRicevuta from(LMSDettRicTelPraticaRicevutaType dest) {
		if(dest == null) {
			return null;
		}
		ModelDettRichTelPraticaRicevuta source = new ModelDettRichTelPraticaRicevuta();
		source.setRicevuta(new ModelRicevutaDettPraticaRicevutaLMSRicevutaRTDettPraticaRicevutaTypeMapper().fromList(dest.getRICEVUTA()) );
		
		return source;
	}

}
