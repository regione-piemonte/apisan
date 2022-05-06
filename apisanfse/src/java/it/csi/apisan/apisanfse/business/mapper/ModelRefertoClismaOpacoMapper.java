/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelScreeningPolipo;
import it.csi.apisan.apisanfse.integration.screening.dma.ScreeningPolipoClisma;

public class ModelRefertoClismaOpacoMapper extends BaseMapper<ModelScreeningPolipo, ScreeningPolipoClisma>{

	@Override
	public ScreeningPolipoClisma to(ModelScreeningPolipo source) {
		if(source == null) {
			return null;
		}
		ScreeningPolipoClisma screeningPolipoClisma = new ScreeningPolipoClisma();
		screeningPolipoClisma.setDimensione(source.getDimensione());
		//TODO propieta' mancante  
		//screeningPolipoClisma.setLesioneSospettaCA(modelScreeningPolipo.get);
		screeningPolipoClisma.setPolipo(source.getPolipo());
		screeningPolipoClisma.setSede(source.getSede());
		return screeningPolipoClisma;
	}

	@Override
	public ModelScreeningPolipo from(ScreeningPolipoClisma dest) {
		if(dest == null) {
			return null;
		}
		ModelScreeningPolipo modelScreeningPolipo = new ModelScreeningPolipo();
		modelScreeningPolipo.setDimensione(dest.getDimensione());
		//TODO modelScreeningPolipo.setDimIsto(dimIsto);
		//screeningPolipoClisma.getLesioneSospettaCA();
		//modelScreeningPolipo.setPolipectomiaBiopsia(polipectomiaBiopsia);
		modelScreeningPolipo.setPolipo(dest.getPolipo());
		//modelScreeningPolipo.setRecupero(recupero);
		modelScreeningPolipo.setSede(dest.getSede());
		//modelScreeningPolipo.setTipo(tipo);
		//modelScreeningPolipo.setTipoIsto(tipoIsto);
		return modelScreeningPolipo;
	}

}
