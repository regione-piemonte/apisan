/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.mapper;

import it.csi.apisan.apisancross.dto.apisancross.Servizio;

public class ServizioMapper extends BaseMapper<Servizio, it.csi.deleghe.deleghebe.ws.model.Servizio> {

	@Override
	public it.csi.deleghe.deleghebe.ws.model.Servizio to(Servizio source) {
		if(source == null) {
			return null;
		}
		it.csi.deleghe.deleghebe.ws.model.Servizio s = new it.csi.deleghe.deleghebe.ws.model.Servizio();
		s.setCodice(source.getCodiceServizio());
		s.setArruolabile(source.isArruolabile());
		s.setDataFineValidita(source.getDataFineValidita());
		s.setDataInizioValidita(source.getDataFineValidita());
		s.setDelegabile(source.isDelegabile());
		s.setDescrizione(source.getDescrizione());
		s.setDescrizioneEstesa(source.getDescrizioneEstesa());
		s.setNotificabile(source.isNotificabile());
		s.setNumeroGiorniDelegabili(source.getNumeroGiorniDelegabile());
		s.setObbligatorioArruolamento(source.isObbligatorioArruolamento());
		s.setUrl(source.getUrl());
		
		return s;
	}

	@Override
	public Servizio from(it.csi.deleghe.deleghebe.ws.model.Servizio dest) {
		if(dest == null) {
			return null;
		}
		Servizio s = new Servizio();
		s.setCodiceServizio(dest.getCodice());
		s.setArruolabile(dest.getArruolabile());
		s.setDataFineValidita(dest.getDataFineValidita());
		s.setDataInizioValidita(dest.getDataFineValidita());
		s.setDelegabile(dest.getDelegabile());
		s.setDescrizione(dest.getDescrizione());
		s.setDescrizioneEstesa(dest.getDescrizioneEstesa());
		s.setNotificabile(dest.getNotificabile());
		s.setNumeroGiorniDelegabile(dest.getNumeroGiorniDelegabili());
		s.setObbligatorioArruolamento(dest.getObbligatorioArruolamento());
		s.setUrl(dest.getUrl());
		
		return s;
	}

}
