/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelScreeningPolipo;
import it.csi.apisan.apisanfse.integration.screening.dma.ScreeningPolipoColon;

public class ModelScreeningPolipoMapper extends BaseMapper<ModelScreeningPolipo, ScreeningPolipoColon>{

	@Override
	public ScreeningPolipoColon to(ModelScreeningPolipo source) {
		if(source == null) {
			return null;
		}
		ScreeningPolipoColon screeningPolipoColon = new ScreeningPolipoColon();
		screeningPolipoColon.setDimensione(source.getDimensione());
		screeningPolipoColon.setDimIsto(source.getDimIsto());
		screeningPolipoColon.setDisplasia(source.getDisplasia());
		screeningPolipoColon.setPolipectomiaBiopsia(source.getPolipectomiaBiopsia());
		screeningPolipoColon.setPolipo(source.getPolipo());
		screeningPolipoColon.setRecupero(source.getRecupero());
		screeningPolipoColon.setSede(source.getSede());
		screeningPolipoColon.setTipo(source.getTipo());
		screeningPolipoColon.setTipoIsto(source.getTipoIsto());
		return screeningPolipoColon;
	}

	@Override
	public ModelScreeningPolipo from(ScreeningPolipoColon dest) {
		if(dest == null) {
			return null;
		}
		ModelScreeningPolipo modelScreeningPolipo = new ModelScreeningPolipo();
		modelScreeningPolipo.setDimensione(dest.getDimensione());
		modelScreeningPolipo.setDimIsto(dest.getDimIsto());
		modelScreeningPolipo.setDisplasia(dest.getDisplasia());
		modelScreeningPolipo.setPolipectomiaBiopsia(dest.getPolipectomiaBiopsia());
		modelScreeningPolipo.setPolipo(dest.getPolipo());
		modelScreeningPolipo.setRecupero(dest.getRecupero());		
		modelScreeningPolipo.setSede(dest.getSede());
		modelScreeningPolipo.setTipo(dest.getTipo());
		modelScreeningPolipo.setTipoIsto(dest.getTipoIsto());
		return modelScreeningPolipo;
	}

}
