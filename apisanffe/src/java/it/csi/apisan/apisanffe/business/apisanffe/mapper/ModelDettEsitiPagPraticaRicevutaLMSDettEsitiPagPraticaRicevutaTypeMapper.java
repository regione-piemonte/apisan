/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelDettEsitiPagPraticaRicevuta;
import it.csi.gpr.LMSDettEsitiPagPraticaRicevutaType;

public class ModelDettEsitiPagPraticaRicevutaLMSDettEsitiPagPraticaRicevutaTypeMapper extends BaseMapper<ModelDettEsitiPagPraticaRicevuta, LMSDettEsitiPagPraticaRicevutaType> {

	@Override
	public LMSDettEsitiPagPraticaRicevutaType to(ModelDettEsitiPagPraticaRicevuta source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelDettEsitiPagPraticaRicevuta from(LMSDettEsitiPagPraticaRicevutaType dest) {
		if(dest == null) {
			return null;
		}
		ModelDettEsitiPagPraticaRicevuta source = new ModelDettEsitiPagPraticaRicevuta();
		source.setEsito(new ModelEsitoDettPraticaRicevutaLMSEsitoDettPraticaRicevutaTypeMapper().fromList(dest.getESITO()));
		return source;
	}

}
