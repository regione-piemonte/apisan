/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelRicevutaDettaglioPratica;
import it.csi.gpr.LMSRicevutaDettPraticaRicevutaType;

public class ModelRicevutaDettaglioPraticaLMSRicevutaDettPraticaRicevutaTypeMapper extends BaseMapper<ModelRicevutaDettaglioPratica, LMSRicevutaDettPraticaRicevutaType> {

	@Override
	public LMSRicevutaDettPraticaRicevutaType to(ModelRicevutaDettaglioPratica source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelRicevutaDettaglioPratica from(LMSRicevutaDettPraticaRicevutaType dest) {
		if(dest == null) {
			return null;
		}
		ModelRicevutaDettaglioPratica source = new ModelRicevutaDettaglioPratica();
		source.setDataPagamento(dest.getDATAPAGAMENTO());
		source.setIdRicevuta(dest.getIDRICEVUTA());
		source.setStampa(dest.getSTAMPA());
		return source;
	}

}
