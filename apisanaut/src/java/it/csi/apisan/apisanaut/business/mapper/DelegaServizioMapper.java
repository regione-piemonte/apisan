/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import it.csi.apisan.apisanaut.dto.apisanaut.DelegaServizio;

public class DelegaServizioMapper extends BaseMapper<DelegaServizio, it.csi.deleghe.deleghebe.ws.model.DelegaServizio> {

	@Override
	public it.csi.deleghe.deleghebe.ws.model.DelegaServizio to(DelegaServizio ds) {
		if(ds==null) {
			return null;
		}
		it.csi.deleghe.deleghebe.ws.model.DelegaServizio result = new it.csi.deleghe.deleghebe.ws.model.DelegaServizio();
		result.setCodiceServizio(ds.getCodiceServizio());
		result.setDataInizioDelega(ds.getDataInizioDelega());
		result.setDataFineDelega(ds.getDataFineDelega());
		result.setDataRevoca(ds.getDataRevocaDelega());
		result.setStatoDelega(ds.getStatoDelega());
		result.setUUID(ds.getUuid());
		result.setDataRinuncia(ds.getDataRinunciaDelega());
		result.setGradoDelega(ds.getGradoDelega());
		result.setTipoDelega(ds.getTipoDelega());
		return result;
	}

	@Override
	public DelegaServizio from(it.csi.deleghe.deleghebe.ws.model.DelegaServizio ds) {
		if(ds==null) {
			return null;
		}
		DelegaServizio result = new DelegaServizio();
		result.setCodiceServizio(ds.getCodiceServizio());
		result.setDataInizioDelega(ds.getDataInizioDelega());
		result.setDataFineDelega(ds.getDataFineDelega());
		result.setDataRevocaDelega(ds.getDataRevoca());
		result.setStatoDelega(ds.getStatoDelega());
		result.setUuid(ds.getUUID());
		result.setDataRinunciaDelega(ds.getDataRinuncia());
		result.setTipoDelega(ds.getTipoDelega());
		result.setGradoDelega(ds.getGradoDelega());
		
		return result;
	}

}
