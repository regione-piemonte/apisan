/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.helper;

import java.util.HashMap;
import java.util.Objects;

import it.csi.apisan.apisancons.dto.apisancons.Consenso;
import it.csi.aura.auraws.services.central.anagrafefind.DatiAnagrafici;
import it.csi.aura.auraws.services.central.anagrafesanitaria.SoggettoAuraBody;

public class CittadinoCache {
	
	HashMap<String, CittadinoConsenso> cacheCittadino;	
	
	public CittadinoCache(){
		cacheCittadino = new HashMap();
	}
	
	public boolean cittadinoPresente(String cf) {
		return cacheCittadino.containsKey(cf);
	}
	
	public boolean cittadinoConIdAura(String cf) {
		return (cacheCittadino.get(cf) != null && cacheCittadino.get(cf).getIdAura() != null); 
	}
	
	public void addCittadinoFromConsenso( Consenso cons) {
		if(!cacheCittadino.containsKey(cons.getCfCittadino()))
			cacheCittadino.put(cons.getCfCittadino(), getCittadinoFromConsenso(cons));
	}
	
	public CittadinoConsenso getCittadino(String cf) {
		return cacheCittadino.get(cf);
	}
	
	public void addCittadinoFromAura(SoggettoAuraBody datiAnagrafici) {
		if(!cacheCittadino.containsKey(datiAnagrafici.getInfoAnag().getDatiPrimari().getCodiceFiscale()))
			cacheCittadino.put(datiAnagrafici.getInfoAnag().getDatiPrimari().getCodiceFiscale(), getCittadinoFromSoggettoAura(datiAnagrafici)) ;
	}
	
	public void addCittadinoFromAura(DatiAnagrafici datiAnagrafici) {
		if(!cacheCittadino.containsKey(datiAnagrafici.getCodiceFiscale()))
			cacheCittadino.put(datiAnagrafici.getCodiceFiscale(), getCittadinoFromDatiAnagrafici(datiAnagrafici)) ;
	}
	
	public void addCittadinoFromDeleghe(it.csi.deleghe.deleghebe.ws.model.Cittadino cittadinoDeleghe) {
		if(!cacheCittadino.containsKey(cittadinoDeleghe.getCodiceFiscale()))
				cacheCittadino.put(cittadinoDeleghe.getCodiceFiscale(), getCittadinoFromCittadinoDeleghe(cittadinoDeleghe));	
	}
	
	private CittadinoConsenso getCittadinoFromCittadinoDeleghe(it.csi.deleghe.deleghebe.ws.model.Cittadino cittadinoDeleghe) {
		CittadinoConsenso citt = new CittadinoConsenso();
		citt.setCodiceFiscale(cittadinoDeleghe.getCodiceFiscale());
		citt.setNome(cittadinoDeleghe.getNome());
		citt.setCognome(cittadinoDeleghe.getCognome());
		citt.setIdAura(Objects.toString(cittadinoDeleghe.getIdAura(), null) );
		return citt;		
	}
	
	private CittadinoConsenso getCittadinoFromConsenso(Consenso cons) {
		CittadinoConsenso citt = new CittadinoConsenso();
		citt.setCodiceFiscale(cons.getCfCittadino());
		citt.setNome(cons.getNome());
		citt.setCognome(cons.getCognome());
		citt.setIdAura(cons.getIdAura());
		return citt;
	}
	
	private CittadinoConsenso getCittadinoFromSoggettoAura(SoggettoAuraBody datiAnagrafici) {
		CittadinoConsenso citt = new CittadinoConsenso();
		citt.setCodiceFiscale(datiAnagrafici.getInfoAnag().getDatiPrimari().getCodiceFiscale());
		citt.setNome(datiAnagrafici.getInfoAnag().getDatiPrimari().getNome());
		citt.setCognome(datiAnagrafici.getInfoAnag().getDatiPrimari().getCognome());
		citt.setIdAura(datiAnagrafici.getIdAura().toString());
		return citt;
	}
	
	private CittadinoConsenso getCittadinoFromDatiAnagrafici(DatiAnagrafici datiAnagrafici) {
		CittadinoConsenso citt = new CittadinoConsenso();
		citt.setCodiceFiscale(datiAnagrafici.getCodiceFiscale());
		citt.setNome(datiAnagrafici.getNome());
		citt.setCognome(datiAnagrafici.getCognome());
		citt.setIdAura(datiAnagrafici.getIdProfiloAnagrafico().toString());
		return citt;
	}
	
}
