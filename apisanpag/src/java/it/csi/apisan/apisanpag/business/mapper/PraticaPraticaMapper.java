/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.Pratica;

public class PraticaPraticaMapper extends BaseMapper<Pratica, it.csi.apisan.apisanpag.dto.ptw.Pratica> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.Pratica to(Pratica source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.Pratica dest = new it.csi.apisan.apisanpag.dto.ptw.Pratica();
		dest.setCodiceVersamento(source.getCodiceVersamento());
		dest.setImportoPratica(new ImportoMapper().to(source.getImportoPratica()));
		dest.setPrenotazione(new PrenotazionePrenotazioneMapper().to(source.getPrenotazione()));
		dest.setPrestazioneErogata(source.getPrestazioneErogata());
		return dest;
	}

	@Override
	public Pratica from(it.csi.apisan.apisanpag.dto.ptw.Pratica dest) {
		if(dest == null) {
			return null;
		}
		Pratica source = new Pratica();
		source.setCodiceVersamento(dest.getCodiceVersamento());
		source.setImportoPratica(new ImportoMapper().from(dest.getImportoPratica()));
		source.setPrenotazione(new PrenotazionePrenotazioneMapper().from(dest.getPrenotazione()));
		source.setPrestazioneErogata(dest.getPrestazioneErogata());
		return source;
	}

}
