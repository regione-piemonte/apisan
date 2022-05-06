/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisancons.dto.apisancons.TipoAsr;
import it.csi.apisan.apisancons.exception.ErroreBuilder;
import it.csi.apisan.apisancons.exception.ErroreRESTException;
import it.csi.apisan.apisancons.integration.conspref.consensocittadino.Consenso;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ApplicazioneRichiedente;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaCodificaBe;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaConsensoBeResponse;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.Richiedente;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.RisultatoCodice;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ServiceResponse;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.TipoFonte;
import it.csi.apisan.apisancons.integration.conspref.errorecittadino.Errore;
import it.csi.apisan.apisancons.integration.conspref.fontecittadino.Fonte;
import it.csi.apisan.apisancons.util.ApisanConsStatus;
import it.csi.apisan.apisancons.util.Constants;


public abstract class ConsRESTBaseService extends RESTBaseService {

	protected String shibIdentitaCodiceFiscale;
	protected String xRequestID;
	protected String xCodiceServizio;
	protected String xForwardedFor;

	public ConsRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

		this.shibIdentitaCodiceFiscale = getHeaderParam("Shib-Identita-CodiceFiscale");
		this.xRequestID = getHeaderParam("X-Request-ID");
		this.xCodiceServizio = getHeaderParam("X-Codice-Servizio");
		this.xForwardedFor = getHeaderParam("X-Forwarded-For");
		logRequestContext();
	}
	
	protected ConsultaCodificaBe newRequestConsultaCodifiche() {
		ConsultaCodificaBe request = new ConsultaCodificaBe();
		request.setRichiedente(newRichiedente());
		return request;
	}
	
	protected TipoAsr getAsrDefault() {
		TipoAsr asr = new TipoAsr();
		asr.setCodice(Constants.ASR_CODICE_DEFAULT);
		asr.setDescrizione(Constants.ASR_DESCR_DEFAULT); 
		return asr;
	}

	@Override
	public Response executeService() {
		if(StringUtils.isBlank(xRequestID)) {
			return ErroreBuilder.from(ApisanConsStatus.PARAMETRO_NON_VALIDO, "X-Request-ID").exception().getResponse();
		}
		
		super.executeService();
		if(xRequestID!=null && res != null && res.getMetadata() != null) {
			res.getMetadata().add("X-Request-ID", xRequestID);
		}
		
		return res;
	}
	

	protected List<TipoAsr> listaAsrNonContenute(List<TipoAsr> asr, List<it.csi.apisan.apisancons.dto.apisancons.Consenso> listaConsensi) {
		List<TipoAsr> listaAsrConsensi = listaConsensi.stream()
				.map(s-> s.getAsr()).collect(Collectors.toList());
		
		asr.removeAll(listaAsrConsensi);
		
		return asr; 		
	}


	
	protected boolean isUtenteAutorizzato(String cf) {
		return shibIdentitaCodiceFiscale != null && shibIdentitaCodiceFiscale.equalsIgnoreCase(cf);
	}

	protected void checkUtenteAutorizzato(String cf) {
		checkCondition(isUtenteAutorizzato(cf), ErroreBuilder.from(ApisanConsStatus.UTENTE_NON_AUTORIZZATO).dettaglio("CODICE_FISCALE", cf).exception());
	}

	protected boolean isCodiceFiscaleValido(String cf) {
		return cf != null && (cf.length() == 16);
		//return cf != null && cf.matches("[a-zA-Z]{6}\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d\\d[a-zA-Z]");
	}

	protected void checkCodiceFiscaleValido(String cf) {
		checkCondition(isCodiceFiscaleValido(cf), ErroreBuilder.from(ApisanConsStatus.CODICE_FISCALE_NON_VALIDO, cf).dettaglio("CODICE_FISCALE", cf).exception());
	}

	protected String getHeaderParam(String headerParam) {
		List<String> values = httpHeaders.getRequestHeader(headerParam);
		if (values == null || values.isEmpty()) {
			return null;
		}
		return values.get(0);
	}
	
	protected Richiedente newRichiedente() {
		Richiedente richiedente = new Richiedente();
		ApplicazioneRichiedente ap = new ApplicazioneRichiedente();
		richiedente.setCodiceFiscale(shibIdentitaCodiceFiscale);
		ap.setCodice(xCodiceServizio);
		ap.setIdRequest(xRequestID);
		richiedente.setServizio(ap);
		return richiedente;
	}
	
	
	protected Fonte newFonteCittadinoRequest() {
		TipoFonte tipoFonte = new TipoFonte();
		tipoFonte.setCodice(Constants.TIPO_FONTE_CODICE);
		Fonte fonte = new Fonte();
		fonte.setCodice(Constants.FONTE_CODICE);
		fonte.setTipoFonte(tipoFonte);
		return fonte;
	}
	
	protected boolean erroreNonTrovateOccorrenze(ServiceResponse sr) {
		boolean nonTrovateOccorrenze = false;
		if(!RisultatoCodice.SUCCESSO.equals(sr.getEsito())  || (sr.getElencoErrori() != null && (sr.getElencoErrori().size() > 0)) ) {
			Optional<Errore> errCONSE10 = sr.getElencoErrori().stream().filter(errore -> Constants.RESPONSE_VUOTA.equalsIgnoreCase(errore.getCodice())).findFirst();
			if(errCONSE10.isPresent()) {
				nonTrovateOccorrenze = true;
			}
		}
		return nonTrovateOccorrenze;
	}
	
	public boolean isConsensoAziendale(ConsultaConsensoBeResponse sr) {
		boolean consensoAziendale = false;
		if(sr.getConsensi() != null) {
			Optional<Consenso> consAzindale = sr.getConsensi().getConsenso().stream().filter(cons -> Constants.CONSENSO_AZIENDALE.equalsIgnoreCase(cons.getInformativa().getTipoConsenso().getCodice()) ).findFirst();
			if(consAzindale.isPresent()) {
				consensoAziendale = true;
			}
		}
		return consensoAziendale; 
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	protected void checkSuccesso(ServiceResponse sr, String servizioFault) {
		if(!RisultatoCodice.SUCCESSO.equals(sr.getEsito())  || (sr.getElencoErrori() != null && (!sr.getElencoErrori().isEmpty())) ) {
			//se trovo delle eccezioni le richiamo eccetto se trovo l'errore di on trovate occorrenze
			if(erroreNonTrovateOccorrenze(sr)) {
				return;
			}
			if((sr.getElencoErrori() != null) && (!sr.getElencoErrori().isEmpty())){
				throw toRESTErroreCittadinoException(sr.getElencoErrori(), 502, servizioFault, "");
			}
		}
	}
	
	protected ErroreRESTException toRESTErroreCittadinoException(List<Errore> errori, int status, String servizioFault, String msgDefault) {
		ErroreBuilder erroreBuilder = ErroreBuilder.from(status, servizioFault).title(msgDefault);
		
		if(errori!=null) {
			errori.stream().forEach(e -> erroreBuilder.dettaglio(e.getCodice(), e.getDescrizione()));
		}
		
		return erroreBuilder.exception();
	}
/*	protected void checkSuccesso(ServiceResponse sr, boolean isArrayRit) {
		String METHOD_NAME = "checkSuccesso";
		if(!RisultatoCodice.SUCCESSO.equals(sr.getEsito()) || (sr.getErrori() != null && (sr.getErrori().size() > 0))) {
			
			
			if(sr.getErrori()!=null) {
				Optional<Errore> errDAR02 = sr.getErrori().stream().filter(errore -> {
					return "DA.R02".equals(errore.getCodice());
				}).findFirst();
				
				if(errDAR02.isPresent()) {
					if(sr.getErrori().size()==1) {
						//esco permettendo al chiamante di ritornare la lista vuota (in questo caso un 200 con lista vuota).
						if(isArrayRit) {
							return;
						}else {
							throw ErroreBuilder.from(ApisanAutStatus.RISORSA_NON_TROVATA).exception();
						}
						
					}
					throw ErroreBuilder.from(ApisanAutStatus.RISORSA_NON_TROVATA).exception();
				}
			}
			
			log.error(METHOD_NAME, "Risposta dal servizio %s andata in errore.", sr.getClass().getName());
			throw toErroreRESTException(sr.getErrori());
		}		
	}
	
	protected void checkSuccesso(ServiceResponse sr) {
		checkSuccesso(sr, true);
	}
	
	protected ErroreRESTException toErroreRESTException(List<Errore> errori) {
		return toRESTErroreException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}

	protected ErroreRESTException toRESTErroreException(List<Errore> errori, int status, String msgDefault) {
		ErroreBuilder erroreBuilder = ErroreBuilder.from(status, "ERRORE_DELEGHEBE").title(msgDefault);
		
		if(errori!=null) {
			errori.stream().forEach(e -> erroreBuilder.dettaglio(e.getCodice(), e.getDescrizione()));
		}
		
		return erroreBuilder.exception();
	}
	protected Richiedente newRichiedente() {
		return new Richiedente(xRequestID, xCodiceServizio, shibIdentitaCodiceFiscale);
	}
	*/
	
	protected void logRequestContext() {
		log.info("logRequestContext", "shibIdentitaCodiceFiscale: %s - xRequestID: %s - xCodiceServizio: %s - UserPrincipal: %s - xForwardedFor: %s", shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext!= null && securityContext.getUserPrincipal()!= null? securityContext.getUserPrincipal().getName() :"DEFAULT", xForwardedFor);
	}

	
	
}
