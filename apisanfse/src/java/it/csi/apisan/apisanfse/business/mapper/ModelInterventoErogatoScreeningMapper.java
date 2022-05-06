/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import it.csi.apisan.apisanfse.dto.apisanfse.Codifica;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelInterventoErogato;
import it.csi.apisan.apisanfse.integration.screening.dma.ScreeningTrattamentoErogato;
import it.csi.apisan.apisanfse.integration.screening.dma.StrutturaSanitaria;

public class ModelInterventoErogatoScreeningMapper extends BaseMapper<ModelInterventoErogato, ScreeningTrattamentoErogato>{

	@Override
	public ScreeningTrattamentoErogato to(ModelInterventoErogato source) {
		if(source == null) {
			return null;
		}
		ScreeningTrattamentoErogato screeningTrattamentoErogato = new ScreeningTrattamentoErogato();
		screeningTrattamentoErogato.setData(new DateXMLGregorianCalendarMapper().to(source.getData()));
		screeningTrattamentoErogato.setEsito(source.getEsito());
		if(source.getStrutturaSanitaria()!=null) {
			StrutturaSanitaria strutturaSanitaria = new StrutturaSanitaria();
			BeanUtils.copyProperties(source.getStrutturaSanitaria(), strutturaSanitaria);
			screeningTrattamentoErogato.setStrutturaSanitaria(strutturaSanitaria);
		}
		
		return screeningTrattamentoErogato;
	}

	@Override
	public ModelInterventoErogato from(ScreeningTrattamentoErogato dest) {
		if(dest == null) {
			return null;
		}
		ModelInterventoErogato modelInterventoErogato = new ModelInterventoErogato();
		modelInterventoErogato.setData(new DateXMLGregorianCalendarMapper().from(dest.getData()));
		modelInterventoErogato.setEsito(dest.getEsito());
		it.csi.apisan.apisanfse.dto.apisanfse.StrutturaSanitaria strutturaSanitaria = new it.csi.apisan.apisanfse.dto.apisanfse.StrutturaSanitaria();
		if(dest.getStrutturaSanitaria()!=null) {
			BeanUtils.copyProperties(dest.getStrutturaSanitaria(), strutturaSanitaria);
			modelInterventoErogato.setStrutturaSanitaria(strutturaSanitaria);
		}
		if(dest.getStrutturaSanitaria()!=null) {
			modelInterventoErogato.setTrattamenti(dest.getTrattamenti().stream().map(screeningTrattamento -> {
				Codifica codifica = new Codifica();
				if(screeningTrattamento!=null) {
					BeanUtils.copyProperties(screeningTrattamento, codifica);
				}
				return codifica;
				}).collect(Collectors.toList()));
		}
		
		return modelInterventoErogato;
	}

}
