/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelIndicazioneFinale;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelMedicoScreening;
import it.csi.apisan.apisanfse.integration.screening.dma.ScreeningGiudizio;
import it.csi.apisan.apisanfse.integration.screening.dma.ScreeningIndicazioneFinale;

public class ModelIndicazioneFinaleScreeningMapper extends BaseMapper<ModelIndicazioneFinale, ScreeningIndicazioneFinale>{

	@Override
	public ScreeningIndicazioneFinale to(ModelIndicazioneFinale source) {
		if(source == null) {
			return null;
		}
		ScreeningIndicazioneFinale screeningIndicazioneFinale = new ScreeningIndicazioneFinale();
		screeningIndicazioneFinale.setGiudizio(new GiudizioCodificaScreeningMapper<ScreeningGiudizio>(new ScreeningGiudizio()).to(source.getGiudizio()));
		return screeningIndicazioneFinale;
	}

	@Override
	public ModelIndicazioneFinale from(ScreeningIndicazioneFinale dest) {
		if(dest == null) {
			return null;
		}
		ModelIndicazioneFinale modelIndicazioneFinale = new ModelIndicazioneFinale();
		modelIndicazioneFinale.setGiudizio(new GiudizioCodificaScreeningMapper<ScreeningGiudizio>(new ScreeningGiudizio()).from(dest.getGiudizio()));
		if(dest.getMedici()!=null) {
			modelIndicazioneFinale.setMedici(dest.getMedici().stream().map(m -> {
				ModelMedicoScreening model = new ModelMedicoScreening();
				if(m!=null) {
					BeanUtils.copyProperties(m, model);
				}
				return model;
				}).collect(Collectors.toList()));
		}
		return modelIndicazioneFinale;
	}

}
