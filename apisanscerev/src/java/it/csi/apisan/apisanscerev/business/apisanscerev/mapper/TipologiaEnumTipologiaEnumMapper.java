/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiesta.TipologiaEnum;

public class TipologiaEnumTipologiaEnumMapper extends BaseMapper<TipologiaEnum, it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta.TipologiaEnum> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta.TipologiaEnum to(TipologiaEnum source) {
		if(source == null) {
			return null;
		}
		switch (source) {
		case AUTOMATICA:
			return it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta.TipologiaEnum.AUTOMATICA;
		case BACK_OFFICE:
			return it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta.TipologiaEnum.BACK_OFFICE;
		case BOZZA:
			return it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta.TipologiaEnum.BOZZA;
		default:
			return null;
		
		}
	}

	@Override
	public TipologiaEnum from(it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta.TipologiaEnum dest) {
		if(dest == null) {
			return null;
		}
		switch (dest) {
		case AUTOMATICA:
			return TipologiaEnum.AUTOMATICA ;
		case BACK_OFFICE:
			return TipologiaEnum.BACK_OFFICE;
		case BOZZA:
			return TipologiaEnum.BOZZA;
		default:
			return null;
		}
		
	}

}
