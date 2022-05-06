/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import it.csi.apisan.apisanaut.dto.apisanaut.DichiarazioneDettaglioStato;

public class DichiarazioneDettaglioStatoMapper extends BaseMapper<DichiarazioneDettaglioStato, it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglioStato> {

	@Override
	public it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglioStato to(DichiarazioneDettaglioStato source) {
		if(source == null) {
			return null;
		}
		it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglioStato result = new it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglioStato();
		result.setCodice(source.getCodice());
		result.setDescrizione(source.getDescrizione());
		return result;
	}

	@Override
	public DichiarazioneDettaglioStato from(it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglioStato dest) {
		if(dest == null) {
			return null;
		}
		DichiarazioneDettaglioStato result = new DichiarazioneDettaglioStato();
		result.setCodice(dest.getCodice());
		result.setDescrizione(dest.getDescrizione());
		return result;
	}

}
