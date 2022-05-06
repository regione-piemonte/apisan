/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelDettPraticaRicevuta;
import it.csi.gpr.LMSDettPraticaRicevutaType;

public class ModelDettPraticaRicevutaLMSDettPraticaRicevutaTypeMapper extends BaseMapper<ModelDettPraticaRicevuta, LMSDettPraticaRicevutaType> {

	@Override
	public LMSDettPraticaRicevutaType to(ModelDettPraticaRicevuta source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelDettPraticaRicevuta from(LMSDettPraticaRicevutaType dest) {
		if(dest == null) {
			return null;
		}
		ModelDettPraticaRicevuta source = new ModelDettPraticaRicevuta();
		source.setRicevuta(new ModelRicevutaDettaglioPraticaLMSRicevutaDettPraticaRicevutaTypeMapper().fromList(dest.getRICEVUTA()) );
		source.setRimborso(new ModelRimborsoDettaglioPraticaRicevutaLMSRimborsoDettPraticaRicevutaTypeMapper().fromList(dest.getRIMBORSO()));
		return source;
	}

}
