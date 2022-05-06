/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.StatoTransazione;

public class StatoTransazioneStatoTransazioneMapper extends BaseMapper<StatoTransazione, it.csi.apisan.apisanpag.dto.ptw.StatoTransazione> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.StatoTransazione to(StatoTransazione source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.StatoTransazione dest = new it.csi.apisan.apisanpag.dto.ptw.StatoTransazione();
		dest.setStatoErogazione(source.getStatoErogazione());
		return dest;
	}

	@Override
	public StatoTransazione from(it.csi.apisan.apisanpag.dto.ptw.StatoTransazione dest) {
		if(dest == null) {
			return null;
		}
		StatoTransazione source = new StatoTransazione();
		source.setStatoErogazione(dest.getStatoErogazione());
		return source;
	}

}
