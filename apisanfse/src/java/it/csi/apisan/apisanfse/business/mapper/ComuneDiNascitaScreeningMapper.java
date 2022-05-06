/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import org.springframework.beans.BeanUtils;

public class ComuneDiNascitaScreeningMapper  extends BaseMapper<it.csi.apisan.apisanfse.dto.apisanfse.ComuneDiNascita, it.csi.apisan.apisanfse.integration.screening.dma.ComuneDiNascita>{

	@Override
	public it.csi.apisan.apisanfse.integration.screening.dma.ComuneDiNascita to(it.csi.apisan.apisanfse.dto.apisanfse.ComuneDiNascita source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanfse.integration.screening.dma.ComuneDiNascita comuneDiNascita = new it.csi.apisan.apisanfse.integration.screening.dma.ComuneDiNascita();
		BeanUtils.copyProperties(source, comuneDiNascita);
		return comuneDiNascita;
	}

	@Override
	public it.csi.apisan.apisanfse.dto.apisanfse.ComuneDiNascita from(it.csi.apisan.apisanfse.integration.screening.dma.ComuneDiNascita dest) {
		if(dest == null) {
			return null;
		}
		it.csi.apisan.apisanfse.dto.apisanfse.ComuneDiNascita comuneDiNascita = new it.csi.apisan.apisanfse.dto.apisanfse.ComuneDiNascita();				
		BeanUtils.copyProperties(dest, comuneDiNascita);		
		return comuneDiNascita;
	}

}
