/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.ErrorePrenotazione;

public class ErrorePrenotazioneErrorePrenotazioneMapper extends BaseMapper<ErrorePrenotazione, it.csi.apisan.apisanpag.dto.ptw.ErrorePrenotazione> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.ErrorePrenotazione to(ErrorePrenotazione source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.ErrorePrenotazione dest = new it.csi.apisan.apisanpag.dto.ptw.ErrorePrenotazione();
		dest.setCodice(source.getCodice());
		dest.setMessaggio(source.getMessaggio());
		return dest;
	}

	@Override
	public ErrorePrenotazione from(it.csi.apisan.apisanpag.dto.ptw.ErrorePrenotazione dest) {
		if(dest == null) {
			return null;
		}
		ErrorePrenotazione source = new ErrorePrenotazione();
		source.setCodice(dest.getCodice());
		source.setMessaggio(dest.getMessaggio());
		return source;
	}

}
