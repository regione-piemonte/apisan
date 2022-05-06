/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelRicevutaDettPraticaRicevuta;
import it.csi.gpr.LMSRicevutaRTDettPraticaRicevutaType;

public class ModelRicevutaDettPraticaRicevutaLMSRicevutaRTDettPraticaRicevutaTypeMapper extends BaseMapper<ModelRicevutaDettPraticaRicevuta, LMSRicevutaRTDettPraticaRicevutaType> {

	@Override
	public LMSRicevutaRTDettPraticaRicevutaType to(ModelRicevutaDettPraticaRicevuta source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelRicevutaDettPraticaRicevuta from(LMSRicevutaRTDettPraticaRicevutaType dest) {
		if(dest == null) {
			return null;
		}
		ModelRicevutaDettPraticaRicevuta source = new ModelRicevutaDettPraticaRicevuta();
		source.setDataPagamento(dest.getDATAPAGAMENTO());
		source.setIdRt(dest.getIDRT());
		source.setStampa(dest.getSTAMPA());
		return source;
	}

}
