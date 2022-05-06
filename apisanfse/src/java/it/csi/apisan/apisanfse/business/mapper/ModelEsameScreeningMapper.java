/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import org.springframework.beans.BeanUtils;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelEsameScreening;
import it.csi.apisan.apisanfse.integration.screening.dma.ScreeningEsame;

public class ModelEsameScreeningMapper extends BaseMapper<ModelEsameScreening, ScreeningEsame>{

	@Override
	public ScreeningEsame to(ModelEsameScreening source) {
		if(source == null)
			return null;
		ScreeningEsame screeningEsame = new ScreeningEsame();		
		if(source.getAziendaSanitaria()!=null) {
			it.csi.apisan.apisanfse.integration.screening.dma.AziendaSanitaria aziendaSanitaria =new it.csi.apisan.apisanfse.integration.screening.dma.AziendaSanitaria();
			BeanUtils.copyProperties(source.getAziendaSanitaria(), aziendaSanitaria);
			screeningEsame.setAziendaSanitaria(aziendaSanitaria);
		}
				
		screeningEsame.setData(new DateXMLGregorianCalendarMapper().to(source.getData()));
		screeningEsame.setDettaglio(new ModelDettaglioEsameScreeningMapper().to(source.getDettaglio()));
		screeningEsame.setEsito(source.getEsito());		
		screeningEsame.setOscurato(source.getOscurato());		
		if(source.getTipoEsame()!=null) {
			it.csi.apisan.apisanfse.integration.screening.dma.ScreeningEsameTipo tipoEsame = new it.csi.apisan.apisanfse.integration.screening.dma.ScreeningEsameTipo();
			BeanUtils.copyProperties(source.getTipoEsame(), tipoEsame);
			screeningEsame.setTipoEsame(tipoEsame);
		}
		if(source.getUnitaOperativa()!=null) {
			it.csi.apisan.apisanfse.integration.screening.dma.UnitaOperativaSanitaria unitaOperativaSanitaria = new it.csi.apisan.apisanfse.integration.screening.dma.UnitaOperativaSanitaria();
			BeanUtils.copyProperties(source.getUnitaOperativa(), unitaOperativaSanitaria);
			screeningEsame.setUnitaOperativa(unitaOperativaSanitaria);
		}
		return screeningEsame;
	}

	@Override
	public ModelEsameScreening from(ScreeningEsame dest) {
		if(dest == null)
			return null;
		ModelEsameScreening screeningEsame = new ModelEsameScreening();
		if(dest.getAziendaSanitaria()!=null) {
			it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria aziendaSanitaria =new it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria();
			BeanUtils.copyProperties(dest.getAziendaSanitaria(), aziendaSanitaria);
			screeningEsame.setAziendaSanitaria(aziendaSanitaria);
		}
		screeningEsame.setData(new DateXMLGregorianCalendarMapper().from(dest.getData()));
		screeningEsame.setDettaglio(new ModelDettaglioEsameScreeningMapper().from(dest.getDettaglio()));
		screeningEsame.setEsito(dest.getEsito());		
		screeningEsame.setOscurato(dest.getOscurato());
		if(dest.getTipoEsame()!=null) {
			it.csi.apisan.apisanfse.dto.apisanfse.TipoEsame tipoEsame = new it.csi.apisan.apisanfse.dto.apisanfse.TipoEsame();
			BeanUtils.copyProperties(dest.getTipoEsame(), tipoEsame);
			screeningEsame.setTipoEsame(tipoEsame);
		}
		if(dest.getUnitaOperativa()!=null) {
			it.csi.apisan.apisanfse.dto.apisanfse.UnitaOperativaSanitaria unitaOperativaSanitaria = new it.csi.apisan.apisanfse.dto.apisanfse.UnitaOperativaSanitaria();
			BeanUtils.copyProperties(dest.getUnitaOperativa(), unitaOperativaSanitaria);
			screeningEsame.setUnitaOperativa(unitaOperativaSanitaria);
		}
		return screeningEsame;
	}

}
