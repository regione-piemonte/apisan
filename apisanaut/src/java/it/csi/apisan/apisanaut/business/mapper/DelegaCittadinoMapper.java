/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisanaut.dto.apisanaut.DelegaCittadino;
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaServizio;
import it.csi.deleghe.deleghebe.ws.model.Sesso;

public class DelegaCittadinoMapper extends BaseMapper<DelegaCittadino, it.csi.deleghe.deleghebe.ws.model.DelegaCittadino> {

	@Override
	public it.csi.deleghe.deleghebe.ws.model.DelegaCittadino to(DelegaCittadino dc) {
		if(dc==null) {
			return null;
		}
		it.csi.deleghe.deleghebe.ws.model.DelegaCittadino result = new it.csi.deleghe.deleghebe.ws.model.DelegaCittadino();
		
		result.setCodiceFiscale(dc.getCodiceFiscaleDelega());
		result.setCognome(dc.getCognomeDelega());
		result.setNome(dc.getNomeDelega());
		result.setSesso(dc.getSessoDelega()!=null?Sesso.valueOf(dc.getSessoDelega()):null);
		result.setLuogoNascita(dc.getLuogoNascitaDelega());
		result.setDataDiNascita(dc.getDataNascitaDelega());
		result.setStato(dc.getStatoAnagrafica());
		List<it.csi.deleghe.deleghebe.ws.model.DelegaServizio> deleghe = new ArrayList<>();
		for(DelegaServizio ds : dc.getDeleghe()) {
			it.csi.deleghe.deleghebe.ws.model.DelegaServizio d = new DelegaServizioMapper().to(ds);
			deleghe.add(d);
		}
		result.setDeleghe(deleghe);
		result.setUuid(dc.getUuid());

		it.csi.deleghe.deleghebe.ws.model.Delegato delegato = new it.csi.deleghe.deleghebe.ws.model.Delegato();
		delegato.setCodiceFiscale(dc.getCodiceFiscaleDelega());
		delegato.setCognome(dc.getCognomeDelega());
		delegato.setNome(dc.getNomeDelega());
		delegato.setSesso(dc.getSessoDelega());
		delegato.setComuneNascita(dc.getLuogoNascitaDelega());
		delegato.setDataNascita(dc.getDataNascitaDelega());
		
		result.setDelegatoInput(delegato);
		
		return result;
	}

	@Override
	public DelegaCittadino from(it.csi.deleghe.deleghebe.ws.model.DelegaCittadino dc) {
		if(dc==null) {
			return null;
		}
		DelegaCittadino result = new DelegaCittadino();
		
		result.setCodiceFiscaleDelega(dc.getCodiceFiscale());
		result.setCognomeDelega(dc.getCognome());
		result.setDataNascitaDelega(dc.getDataDiNascita());
		List<DelegaServizio> deleghe = new ArrayList<>();
		for(it.csi.deleghe.deleghebe.ws.model.DelegaServizio ds : dc.getDeleghe()) {
			DelegaServizio d = new DelegaServizioMapper().from(ds);
			deleghe.add(d);
		}
		result.setDeleghe(deleghe);
		result.setLuogoNascitaDelega(dc.getLuogoNascita());
		result.setNomeDelega(dc.getNome());
		result.setSessoDelega(dc.getSesso()!=null?dc.getSesso().name():null);
		result.setStatoAnagrafica(dc.getStato());
		result.setUuid(dc.getUuid());
		
		return result;
	}

}
