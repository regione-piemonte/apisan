/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiestaDatiAggiuntivi.LavoroTipologiaEnum;

public class LavoroTipologiaEnumMapper extends BaseMapper<LavoroTipologiaEnum, it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi.LavoroTipologiaEnum> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi.LavoroTipologiaEnum to(
			LavoroTipologiaEnum source) {
		if(source == null) {
			return null;
		}
		switch (source) {
		case AUTONOMO:
			
			return it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi.LavoroTipologiaEnum.AUTONOMO;
		case SUBORDINATO:
			return it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi.LavoroTipologiaEnum.SUBORDINATO;	
		default:
			return null;
		}

		
	}

	@Override
	public LavoroTipologiaEnum from(
			it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaDatiAggiuntivi.LavoroTipologiaEnum dest) {
		if(dest == null) {
			return null;
		}
		switch (dest) {
		case AUTONOMO:
			
			return LavoroTipologiaEnum.AUTONOMO;
		case SUBORDINATO:
			return 	LavoroTipologiaEnum.SUBORDINATO;

		default:
			return null;
		}
	}

}
