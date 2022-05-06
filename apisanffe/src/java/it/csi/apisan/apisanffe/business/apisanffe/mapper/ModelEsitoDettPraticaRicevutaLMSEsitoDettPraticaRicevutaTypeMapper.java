/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelEsitoDettPraticaRicevuta;
import it.csi.gpr.LMSEsitoDettPraticaRicevutaType;

public class ModelEsitoDettPraticaRicevutaLMSEsitoDettPraticaRicevutaTypeMapper extends BaseMapper<ModelEsitoDettPraticaRicevuta, LMSEsitoDettPraticaRicevutaType> {

	@Override
	public LMSEsitoDettPraticaRicevutaType to(ModelEsitoDettPraticaRicevuta source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelEsitoDettPraticaRicevuta from(LMSEsitoDettPraticaRicevutaType dest) {
		if(dest == null) {
			return null;
		}
		ModelEsitoDettPraticaRicevuta source = new ModelEsitoDettPraticaRicevuta();
		source.setDataPagamento(dest.getDATAPAGAMENTO());
		source.setIdEsito(dest.getIDESITO());
		source.setStampa(dest.getSTAMPA());
		return source;
	}

}
