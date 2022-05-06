/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base;

import java.util.Date;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisanaut.dto.apisanaut.Cittadino;
import it.csi.apisan.apisanaut.dto.apisanaut.Dettaglio;
import it.csi.apisan.apisanaut.exception.ErroreBuilder;
import it.csi.apisan.apisanaut.exception.ErroreRESTException;
import it.csi.apisan.apisanaut.util.ApisanAutStatus;
import it.csi.aura.auraws.services.central.anagrafefind.AnagrafeFindSoap;
import it.csi.aura.auraws.services.central.anagrafefind.DatiAnagrafici;
import it.csi.aura.auraws.services.central.anagrafefind.DatiAnagraficiMsg;
import it.csi.aura.auraws.services.central.anagrafefind.FindProfiliAnagraficiRequest;
import it.csi.aura.auraws.services.central.anagrafefind.Message;
import it.csi.aura.auraws.services.central.anagrafesanitaria.AnagrafeSanitariaSoap;
import it.csi.aura.auraws.services.central.anagrafesanitaria.SoggettoAuraBody;
import it.csi.aura.auraws.services.central.anagrafesanitaria.SoggettoAuraMsg;

public abstract class AuraAutRESTBaseService extends AutRESTBaseService {

	@Autowired
	private AnagrafeFindSoap anagrafeFind;
	@Autowired
	private AnagrafeSanitariaSoap profiloSanitario;

	public AuraAutRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}

	public AuraAutRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
		
	}

	/**
	 * Ricerca un cittadino su Aura
	 * 
	 * @param cf codice fiscale da cercare
	 * @return il Cittadino se trovato
	 * @throws ErroreRESTException se il cittadino non viene trovato su Aura
	 */
	protected Cittadino findCittadino(String cf) {
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

		Cittadino result = null;
		// Per ogni profilo...
		for (DatiAnagrafici dati : resFPA.getBody().getElencoProfili().getDatianagrafici()) {
			
			if(dati.getIdProfiloAnagrafico()==null) {
				continue;
			}

			// Chiamata servizo Aura getProfiloSanitarioNew
			SoggettoAuraMsg soggetto = profiloSanitario.getProfiloSanitario("" + dati.getIdProfiloAnagrafico());
			if (soggetto.getBody().getInfoAnag().getDatiPrimari().getStatoProfiloAnagrafico().equalsIgnoreCase("1")) {
				// devo mappare
				result = toCittadino(dati, soggetto.getBody());
				break;
			}
		}

		if (result == null) {
			throw nessunProfilo("Response_findProfiliAnagrafici", "profilo sanitario non trovato.");
		}
		return result;

	}

	
	protected boolean isCittadinoPiemontese(String cf) {
		FindProfiliAnagraficiRequest reqFPA = new FindProfiliAnagraficiRequest();
		reqFPA.setCodiceFiscale(cf);
		reqFPA.setFlagDecesso("0");
		DatiAnagraficiMsg resFPA = anagrafeFind.findProfiliAnagrafici(reqFPA);
		if (!"1".equals(resFPA.getHeader().getCodiceRitorno())) {
			throw toRestAuraAnagrafeFindException(resFPA.getFooter().getMessages().getMessage());
		}
		
		if(resFPA.getBody() == null) {
			return false;
		}
		if(resFPA.getBody().getElencoProfili() == null) {
			return false;
		}
		if(resFPA.getBody().getElencoProfili().getDatianagrafici() == null) {
			return false;
		}

		boolean result = false;
		// Per ogni profilo...
		for (DatiAnagrafici dati : resFPA.getBody().getElencoProfili().getDatianagrafici()) {
			
			if(dati.getIdProfiloAnagrafico()==null) {
				continue;
			}

			// Chiamata servizo Aura getProfiloSanitarioNew
			SoggettoAuraMsg soggetto = profiloSanitario.getProfiloSanitario("" + dati.getIdProfiloAnagrafico());
			if (soggetto.getBody().getInfoAnag().getDatiPrimari().getStatoProfiloAnagrafico().equalsIgnoreCase("1")) {
				// devo verificare che sia piemontese
				if(soggetto.getBody().getInfoSan() != null && StringUtils.isNotEmpty(soggetto.getBody().getInfoSan().getAslAssistenza())) {
					if(soggetto.getBody().getInfoSan().getDataFineASL() == null) {
						result = true;
					}else if(soggetto.getBody().getInfoSan().getDataFineASL().toGregorianCalendar().getTime().after(new Date())) {
						result = true;
					}
				}
				break;
			}
		}

		return result;

	}
	
	private Cittadino toCittadino(DatiAnagrafici dati, SoggettoAuraBody sogg) {
		Cittadino c = new Cittadino();
		c.setIdAura(dati.getIdProfiloAnagrafico().intValue());
		c.setCodiceFiscale(dati.getCodiceFiscale());
		c.setCognome(dati.getCognome());
		c.setDataNascita(dati.getDataNascita().toGregorianCalendar().getTime());
		if(sogg != null  && sogg.getInfoSan() != null) {
			c.setAslAssistenza(sogg.getInfoSan().getAslAssistenza());
		}
		if(dati.getComuneNascita() != null) {
			c.setComuneNascita(dati.getComuneNascita());
		}else {
			c.setComuneNascita(dati.getStatoNascita());
		}
		
		c.setSesso(dati.getSesso());
		c.setNome(dati.getNome());
		return c;
	}

	private ErroreRESTException nessunProfilo(String chiave, String valore) {
		return ErroreBuilder.from(ApisanAutStatus.RISORSA_NON_TROVATA).dettaglio(chiave, valore).exception();
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
