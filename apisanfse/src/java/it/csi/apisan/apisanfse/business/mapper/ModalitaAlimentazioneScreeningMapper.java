/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import org.springframework.beans.BeanUtils;

import it.csi.apisan.apisanfse.dto.apisanfse.ModalitaAlimentazione;
import it.csi.apisan.apisanfse.integration.screening.dma.ModalitaDiAlimentazione;


public class ModalitaAlimentazioneScreeningMapper extends BaseMapper<ModalitaAlimentazione , ModalitaDiAlimentazione>{

	@Override
	public ModalitaDiAlimentazione to(ModalitaAlimentazione source) {
		if(source == null)
			return null;
		ModalitaDiAlimentazione modalitaDiAlimentazione = new ModalitaDiAlimentazione();
		BeanUtils.copyProperties(source, modalitaDiAlimentazione);
		return modalitaDiAlimentazione;
	}

	@Override
	public ModalitaAlimentazione from(ModalitaDiAlimentazione dest) {
		if(dest == null)
			return null;
		ModalitaAlimentazione modalitaAlimentazione = new ModalitaAlimentazione();
		BeanUtils.copyProperties(dest, modalitaAlimentazione);
		return modalitaAlimentazione;
	}

	
	

}
