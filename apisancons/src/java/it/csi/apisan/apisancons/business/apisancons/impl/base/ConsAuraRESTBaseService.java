/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import org.apache.cxf.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisancons.business.helper.CittadinoCache;
import it.csi.apisan.apisancons.business.helper.CittadinoConsenso;
import it.csi.apisan.apisancons.dto.apisancons.Consenso;
import it.csi.apisan.apisancons.dto.apisancons.Dettaglio;
import it.csi.apisan.apisancons.dto.apisancons.TipoAsr;
import it.csi.apisan.apisancons.dto.apisancons.TipoStato;
import it.csi.apisan.apisancons.exception.ErroreBuilder;
import it.csi.apisan.apisancons.exception.ErroreRESTException;
import it.csi.apisan.apisancons.util.ApisanConsStatus;
import it.csi.apisan.apisancons.util.Constants;
import it.csi.aura.auraws.services.central.anagrafefind.AnagrafeFindSoap;
import it.csi.aura.auraws.services.central.anagrafefind.DatiAnagrafici;
import it.csi.aura.auraws.services.central.anagrafefind.DatiAnagraficiMsg;
import it.csi.aura.auraws.services.central.anagrafefind.FindProfiliAnagraficiRequest;
import it.csi.aura.auraws.services.central.anagrafefind.Message;
import it.csi.aura.auraws.services.central.anagrafesanitaria.AnagrafeSanitariaSoap;
import it.csi.aura.auraws.services.central.anagrafesanitaria.SoggettoAuraBody;
import it.csi.aura.auraws.services.central.anagrafesanitaria.SoggettoAuraMsg;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.model.Richiedente;
import it.csi.deleghe.deleghebe.ws.msg.RicercaCittadini;
import it.csi.deleghe.deleghebe.ws.msg.RicercaCittadiniResponse;

public abstract class ConsAuraRESTBaseService extends ConsDelegheRestBaseService {
	
	@Autowired
	private AnagrafeFindSoap anagrafeFind;
	@Autowired
	private AnagrafeSanitariaSoap profiloSanitario;

	
	//Inventarsi un modo per cachare le chiamate a deleghe e ad aura
	protected CittadinoCache cittadinoCache;
	
	public ConsAuraRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);	
		this.cittadinoCache = new CittadinoCache();
	}
	
	
	protected Cittadino ricercaDelegato(String cf) {
		RicercaCittadini rcReq = new RicercaCittadini();
		Cittadino cittadinoDeleghe = new Cittadino();
		cittadinoDeleghe.setCodiceFiscale(cf);
		rcReq.setRichiedente(newRichiedenteDeleghe());
		rcReq.setCittadino(cittadinoDeleghe);
		RicercaCittadiniResponse cittadinoResp = delegheCittadiniService.ricercaCittadiniService(rcReq);
		return cittadinoResp.getCittadini().get(0);
	}
	
	
	protected CittadinoConsenso getCittadinoConsenso(boolean fromAura, String cf) {
		if((!cittadinoCache.cittadinoPresente(cf))) {
			if(fromAura) {
				cittadinoCache.addCittadinoFromAura(findCittadino(cf));
			}else {
				cittadinoCache.addCittadinoFromDeleghe(ricercaDelegato(cf));
			}	
		}
		return cittadinoCache.getCittadino(cf);
	}
	
	protected Consenso arricchisciCittadinoEDelegato(Consenso consTmp) {
		if(consTmp != null) {
			CittadinoConsenso cittadino = getCittadinoConsenso(true, consTmp.getCfCittadino());
			consTmp.setNome(cittadino.getNome());
			consTmp.setCognome(cittadino.getCognome());
		}
		if(consTmp != null && !StringUtils.isEmpty(consTmp.getCfDelegato()) ) {
			CittadinoConsenso cittadino = getCittadinoConsenso(false, consTmp.getCfDelegato());
			consTmp.setNomeDelegato(cittadino.getNome());
			consTmp.setCognomeDelegato(cittadino.getCognome());
		}
		return consTmp;
	}
	
	//protected TipoAsr getAsrRegionale()
	
	protected it.csi.apisan.apisancons.dto.apisancons.Consenso newConsensoNonEspresso(TipoAsr asr, String cf, Integer idInformativa){
		it.csi.apisan.apisancons.dto.apisancons.Consenso consensonew = new it.csi.apisan.apisancons.dto.apisancons.Consenso();
		CittadinoConsenso cittadino = getCittadinoConsenso(true, cf);
		if(asr != null) {
			consensonew.setAsr(asr);
		}else {
			consensonew.setAsr(getAsrDefault());
		}
		
		consensonew.setCfCittadino(cittadino.getCodiceFisacle());
		consensonew.setCognome(cittadino.getCognome());
		consensonew.setNome(cittadino.getNome());
		consensonew.setIdAura(cittadino.getIdAura());
		consensonew.setIdInformativa(idInformativa);
		TipoStato nonEspresso = new TipoStato();
		nonEspresso.setCodice("NON ESPRESSO");
		nonEspresso.setDescrizione("NON ESPRESSO");
		consensonew.setTipoStato(nonEspresso);
		
		return consensonew;
	}
	
	
	protected Richiedente newRichiedenteDeleghe() {
		return new Richiedente(xRequestID, xCodiceServizio, shibIdentitaCodiceFiscale);
	}
	
	protected SoggettoAuraBody findCittadino(String cf) {
		
		SoggettoAuraBody result = null;
		//DatiAnagrafici result = null;
		FindProfiliAnagraficiRequest reqFPA = new FindProfiliAnagraficiRequest();
		reqFPA.setCodiceFiscale(cf);
		reqFPA.setFlagDecesso("0");
		DatiAnagraficiMsg resFPA = anagrafeFind.findProfiliAnagrafici(reqFPA);
		if (!"1".equals(resFPA.getHeader().getCodiceRitorno())) {
			throw toRestAuraAnagrafeFindException(resFPA.getFooter().getMessages().getMessage());
		}

		checkCondition(resFPA.getBody() != null, nessunProfilo("Response_findProfiliAnagrafici", "Body is null"));
		checkCondition(resFPA.getBody().getElencoProfili() != null, nessunProfilo("Response_findProfiliAnagrafici", "Elenco profili is null"));
		checkCondition(resFPA.getBody().getElencoProfili().getDatianagrafici() != null, nessunProfilo("Response_findProfiliAnagrafici", "Elenco profili vuoto"));

		//result = resFPA.getBody().getElencoProfili().getDatianagrafici().get(0);
		// Per ogni profilo... tolta chiamata su profilo sanitario per velocizzare i servizi in questo modo manca la verifica su stato profiloanagrafico
		for (DatiAnagrafici dati : resFPA.getBody().getElencoProfili().getDatianagrafici()) {
			
			if(dati.getIdProfiloAnagrafico()==null) {
				continue;
			}

			// Chiamata servizo Aura getProfiloSanitarioNew
			SoggettoAuraMsg soggetto = profiloSanitario.getProfiloSanitario("" + dati.getIdProfiloAnagrafico());
			if (soggetto.getBody().getInfoAnag().getDatiPrimari().getStatoProfiloAnagrafico().equalsIgnoreCase("1")) {
				result = soggetto.getBody();
				break;
			}
		}

		if (result == null) {
			throw nessunProfilo("Response_findProfiliAnagrafici", "profilo sanitario non trovato.");
		}
		return result;
		
	}
	
	private ErroreRESTException nessunProfilo(String chiave, String valore) {
		return ErroreBuilder.from(ApisanConsStatus.RISORSA_NON_TROVATA).dettaglio(chiave, valore).exception();
	}

	protected ErroreRESTException toRestAuraAnagrafeFindException(List<Message> errorAura) {
		return toRestAuraAnagrafeFindException(errorAura, 502, "Errore invocazione servizio ",
				"Errore esecuzione servizio " + this.getClass().getSimpleName(),
				"Problema nella chiamata al servizio Aura");
	}

	protected ErroreRESTException toRestAuraAnagrafeFindException(List<Message> errorAura, int status, String code,
			String message, String title) {
		
		return ErroreBuilder.from(status, code).title(title).dettagli(errorAura, ea -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(ea.getCodice());
			d.setValore(ea.getDescrizione());
			return d;
		}).exception(message);
		
		
	}
}
