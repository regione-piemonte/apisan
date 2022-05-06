/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.Prenotazione;

public class PrenotazionePrenotazioneMapper extends BaseMapper<Prenotazione, it.csi.apisan.apisanpag.dto.ptw.Prenotazione> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.Prenotazione to(Prenotazione source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.Prenotazione dest = new it.csi.apisan.apisanpag.dto.ptw.Prenotazione();
		dest.setAsrBeneficiaria(source.getAsrBeneficiaria());
		dest.setCodiceServizio(source.getCodiceServizio());
		dest.setDataCreazionePrenotazione(new DateStringMapper().to(source.getDataCreazionePrenotazione()));
		dest.setImportoDaPagare(new ImportoMapper().to(source.getImportoDaPagare()));
		dest.setImportoPagato(new ImportoMapper().to(source.getImportoPagato()));
		dest.setImportoRimborsato(new ImportoMapper().to(source.getImportoRimborsato()));
		dest.setMotivoPagamento(source.getModalitaRimborso());
		dest.setModalitaRimborso(source.getModalitaRimborso());
		dest.setNumeroPratica(source.getNumeroPratica());
		dest.setNumeroQuietanza(source.getNumeroQuietanza());
		dest.setOpposizione730(source.getOpposizione730());
		dest.setRimborsoInErogazione(new ImportoMapper().to(source.getRimborsoInErogazione()));
		dest.setListaNre(dest.getListaNre());
		dest.setIban(source.getIban());
		dest.setListaNre(source.getListaNre());
		return dest;
	}

	@Override
	public Prenotazione from(it.csi.apisan.apisanpag.dto.ptw.Prenotazione dest) {
		if(dest == null) {
			return null;
		}
		Prenotazione source = new Prenotazione();
		source.setAsrBeneficiaria(dest.getAsrBeneficiaria());
		source.setCodiceServizio(dest.getCodiceServizio());
		source.setDataCreazionePrenotazione(new DateStringMapper().from(dest.getDataCreazionePrenotazione()));
		source.setImportoDaPagare(new ImportoMapper().from(dest.getImportoDaPagare()));
		source.setImportoDaRimborsare(new ImportoMapper().from(dest.getImportoDaRimborsare()));
		source.setImportoPagato(new ImportoMapper().from(dest.getImportoPagato()));
		source.setImportoRimborsato(new ImportoMapper().from(dest.getImportoRimborsato()));
		source.setMotivoPagamento(dest.getMotivoPagamento());
		source.setModalitaRimborso(dest.getModalitaRimborso());
		source.setNumeroPratica(dest.getNumeroPratica());
		source.setNumeroQuietanza(dest.getNumeroQuietanza());
		source.setOpposizione730(dest.getOpposizione730());
		source.setRimborsoInErogazione(new ImportoMapper().from(dest.getRimborsoInErogazione()));
		source.setIban(dest.getIban());
		source.setListaNre(dest.getListaNre());
		return source;
	}

}
