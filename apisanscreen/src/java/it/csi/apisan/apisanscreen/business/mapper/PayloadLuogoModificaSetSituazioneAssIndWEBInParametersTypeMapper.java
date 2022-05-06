/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import it.csi.apisan.apisanscreen.dto.apisanscreen.PayloadLuogoModifica;
import it.csi.screenserviziwebsol.SetSituazioneAssIndWEBInParametersType;

public class PayloadLuogoModificaSetSituazioneAssIndWEBInParametersTypeMapper extends BaseMapper<PayloadLuogoModifica, SetSituazioneAssIndWEBInParametersType> {

	@Override
	public SetSituazioneAssIndWEBInParametersType to(PayloadLuogoModifica source) {
		if(source == null) {
			return null;
		}
		SetSituazioneAssIndWEBInParametersType dest = new SetSituazioneAssIndWEBInParametersType();
		dest.setICAPALT(source.getCap());
		dest.setICOMUNEALT(source.getCodComune());
		dest.setIINDIRIZZOALT(source.getIndirizzo());
		dest.setINUMCIVALT(source.getCivico());
		return dest;
	}

	@Override
	public PayloadLuogoModifica from(SetSituazioneAssIndWEBInParametersType dest) {
		// TODO Auto-generated method stub
		return null;
	}

}
