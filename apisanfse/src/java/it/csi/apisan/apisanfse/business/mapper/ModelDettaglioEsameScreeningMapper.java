/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;
import java.util.stream.Collectors;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelDettaglioEsame;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelRefertoClismaOpaco;
import it.csi.apisan.apisanfse.integration.screening.dma.ScreeningDettaglio;
import it.csi.apisan.apisanfse.integration.screening.dma.ScreeningPolipoClisma;
import it.csi.apisan.apisanfse.integration.screening.dma.ScreeningRefertoClismaOpaco;

public class ModelDettaglioEsameScreeningMapper extends BaseMapper<ModelDettaglioEsame, ScreeningDettaglio>{

	@Override
	public ScreeningDettaglio to(ModelDettaglioEsame source) {
		if(source == null) {
			return null;
		}
		ScreeningDettaglio screeningDettaglio = new ScreeningDettaglio();	
		screeningDettaglio.setIndicazioneFinale(new ModelIndicazioneFinaleScreeningMapper().to(source.getIndicazioneFinale()));
		screeningDettaglio.setInterventoErogato(new ModelInterventoErogatoScreeningMapper().to(source.getInterventoErogato()));
		
		ScreeningRefertoClismaOpaco screeningRefertoClismaOpaco = new ScreeningRefertoClismaOpaco();
		List<ScreeningPolipoClisma> polipi = screeningRefertoClismaOpaco.getPolipi();
		polipi = source.getRefertoClismaOpaco().getPolipi().stream().map(modelScreeningPolipo -> new ModelRefertoClismaOpacoMapper().to(modelScreeningPolipo)).collect(Collectors.toList());
		screeningDettaglio.setRefertoClismaOpaco(screeningRefertoClismaOpaco);
		
		screeningDettaglio.setRefertoColonscopia(new ModelRefertoColonscopiaMapper().to(source.getRefertoColonscopia()));
		return screeningDettaglio;
	}

	@Override
	public ModelDettaglioEsame from(ScreeningDettaglio dest) {
		if(dest == null) {
			return null;
		}
		ModelDettaglioEsame screeningDettaglio = new ModelDettaglioEsame();
		screeningDettaglio.setIndicazioneFinale(new ModelIndicazioneFinaleScreeningMapper().from(dest.getIndicazioneFinale()));
		screeningDettaglio.setInterventoErogato(new ModelInterventoErogatoScreeningMapper().from(dest.getInterventoErogato()));
		
		ModelRefertoClismaOpaco modelRefertoClismaOpaco = new ModelRefertoClismaOpaco();		
		if(dest.getRefertoClismaOpaco()!=null){
			modelRefertoClismaOpaco.setPolipi(new ModelRefertoClismaOpacoMapper().fromList(dest.getRefertoClismaOpaco().getPolipi()));
		}
		screeningDettaglio.setRefertoClismaOpaco(modelRefertoClismaOpaco);
		screeningDettaglio.setRefertoColonscopia(new ModelRefertoColonscopiaMapper().from(dest.getRefertoColonscopia()));
		return screeningDettaglio;
	}

	
}
