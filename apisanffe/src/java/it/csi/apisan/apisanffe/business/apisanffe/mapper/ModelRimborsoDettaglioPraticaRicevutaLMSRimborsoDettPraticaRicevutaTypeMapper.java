/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelRimborsoDettaglioPraticaRicevuta;
import it.csi.gpr.LMSRimborsoDettPraticaRicevutaType;

public class ModelRimborsoDettaglioPraticaRicevutaLMSRimborsoDettPraticaRicevutaTypeMapper extends BaseMapper<ModelRimborsoDettaglioPraticaRicevuta, LMSRimborsoDettPraticaRicevutaType> {

	@Override
	public LMSRimborsoDettPraticaRicevutaType to(ModelRimborsoDettaglioPraticaRicevuta source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelRimborsoDettaglioPraticaRicevuta from(LMSRimborsoDettPraticaRicevutaType dest) {
		if(dest == null) {
			return null;	
		}
		ModelRimborsoDettaglioPraticaRicevuta source = new ModelRimborsoDettaglioPraticaRicevuta();
		source.setDataRimborso(dest.getDATARIMBORSO());
		source.setIdRimborso(dest.getIDRIMBORSO());
		source.setStampa(dest.getSTAMPA());
		return source;
	}

}
