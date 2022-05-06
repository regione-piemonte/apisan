/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import it.csi.apisan.apisanaut.dto.apisanaut.DichiarazioneRuolo;

public class DichiarazioneRuoloMapper extends BaseMapper<DichiarazioneRuolo, it.csi.deleghe.deleghebe.ws.model.DichiarazioneRuolo> {

	@Override
	public it.csi.deleghe.deleghebe.ws.model.DichiarazioneRuolo to(DichiarazioneRuolo source) {
		if(source == null) {
			return null;
		}
		it.csi.deleghe.deleghebe.ws.model.DichiarazioneRuolo result = new it.csi.deleghe.deleghebe.ws.model.DichiarazioneRuolo();
		result.setCodice(source.getCodice());
		result.setDescrizione(source.getDescrizione());
		return result;
	}

	@Override
	public DichiarazioneRuolo from(it.csi.deleghe.deleghebe.ws.model.DichiarazioneRuolo dest) {
		if(dest == null) {
			return null;
		}
		DichiarazioneRuolo result = new DichiarazioneRuolo();
		result.setCodice(dest.getCodice());
		result.setDescrizione(dest.getDescrizione());
		return result;
	}

}
