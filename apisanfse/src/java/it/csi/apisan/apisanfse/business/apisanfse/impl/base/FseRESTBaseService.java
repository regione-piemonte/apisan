/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base;

import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisanfse.business.integration.dao.ApisanFseDErroreDao;
import it.csi.apisan.apisanfse.dto.apisanfse.Dettaglio;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.dma.ApplicazioneRichiedente;
import it.csi.apisan.apisanfse.integration.dma.Errore;
import it.csi.apisan.apisanfse.integration.dma.MetadatiDocumentoSR;
import it.csi.apisan.apisanfse.integration.dma.Paziente;
import it.csi.apisan.apisanfse.integration.dma.RegimeDMA;
import it.csi.apisan.apisanfse.integration.dma.Richiedente;
import it.csi.apisan.apisanfse.integration.dma.RuoloDMA;
import it.csi.apisan.apisanfse.integration.dmacc.GetListaRefertiSR;
import it.csi.apisan.apisanfse.util.ApisanFseStatus;
import it.csi.apisan.apisanfse.util.CostantiConsenso;
import it.csi.apisan.apisanfse.util.DateIsoStringUtil;


public abstract class FseRESTBaseService extends RESTBaseService {

	@Autowired
	protected ApisanFseDErroreDao erroreDao;


	public FseRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
		
		logRequestContext();
	}

	/*public FseRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String xForwardedFor, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

		this.shibIdentitaCodiceFiscale = shibIdentitaCodiceFiscale;
		this.xRequestID = xRequestID;
		this.xCodiceServizio = xCodiceServizio;
		this.xForwardedFor = xForwardedFor;
		logRequestContext();
	}*/
	
	
	
	protected Date dateIsoFromString(String date, String campo) {
		try {
			if(StringUtils.isNotEmpty(date))  
				return DateIsoStringUtil.parseRFC339(date);
			else return null;
			
		} catch (DateTimeParseException e) {
			throw  ErroreBuilder.from(ApisanFseStatus.PARAMETRO_NON_VALIDO, campo).exception();
		}
	}
	
	@Override
	public Response executeService() {
		if(StringUtils.isBlank(xRequestID)) {
			return ErroreBuilder.from(ApisanFseStatus.PARAMETRO_NON_VALIDO, "X-Request-ID").exception().getResponse();
		}
		
		super.executeService();
		if(xRequestID!=null && res != null && res.getMetadata() != null) {
			res.getMetadata().add("X-Request-ID", xRequestID);
		}
		
		return res;
	}

	protected boolean isUtenteAutorizzato(String cf) {
		return shibIdentitaCodiceFiscale != null && shibIdentitaCodiceFiscale.equalsIgnoreCase(cf);
	}

	protected void checkUtenteAutorizzato(String cf) {
		checkCondition( isUtenteAutorizzato(cf), ErroreBuilder.from(ApisanFseStatus.UTENTE_NON_AUTORIZZATO).exception());
	}
	
	protected boolean isCodiceFiscaleValido(String cf) {
		return cf != null && (cf.length() == 16);
		//return cf != null && cf.matches("[a-zA-Z]{6}\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d\\d[a-zA-Z]");
	}
	
	

	protected void checkCodiceFiscaleValido(String cf) {
		checkCondition(isCodiceFiscaleValido(cf), ErroreBuilder.from(ApisanFseStatus.CODICE_FISCALE_NON_VALIDO, cf).exception());
	}


	
	protected ErroreRESTException toRESTException(List<Errore> errori) {
		return toRESTException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}
	
	
	protected ErroreRESTException toRESTDelegheException(List<it.csi.deleghe.deleghebe.ws.model.Errore> errori) {
		return toRESTDelegheException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}
	
	protected ErroreRESTException toRESTDelegheException(List<it.csi.deleghe.deleghebe.ws.model.Errore> errori, int status, String msgDefault) {
		
		
		return ErroreBuilder.from(status, msgDefault).dettagli(errori, err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).exception();
		
	}	
	
	protected ErroreRESTException toRESTException(List<Errore> errori, int status, String msgDefault) {
		
		return ErroreBuilder.from(status, msgDefault).dettagli(errori, err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).exception();
	}
	
	@Deprecated
	protected ResponseBuilder headerCrossSite(ResponseBuilder rb) {
		return rb.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET")
				.header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With");
	}
	
	protected Richiedente newRichiedente() {
		Richiedente richiedente = new Richiedente();
		ApplicazioneRichiedente applicazione = new ApplicazioneRichiedente();
		applicazione.setCodice(CostantiConsenso.APPLICAZIONE_RICHIEDENTE);
		richiedente.setApplicazione(applicazione);
		richiedente.setCodiceFiscale(shibIdentitaCodiceFiscale); //TODO usare shibIdentitaCodiceFiscale?
		RegimeDMA regime = new RegimeDMA();
		regime.setCodice(CostantiConsenso.CODICE_REGIME);//"AMB"
		richiedente.setRegime(regime);
		RuoloDMA ruolo = new RuoloDMA();
		ruolo.setCodice(CostantiConsenso.RUOLO);
		richiedente.setRuolo(ruolo);
		richiedente.setTokenOperazione(xRequestID);// TODO xRequestID??
		richiedente.setNumeroTransazione(xRequestID);// TODO
		return richiedente;
	}
	
	protected void logRequestContext() {
		log.info("logRequestContext", "shibIdentitaCodiceFiscale: %s - xRequestID: %s - xCodiceServizio: %s xForwardedFor: %s - UserPrincipal: %s", shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, xForwardedFor, securityContext!= null && securityContext.getUserPrincipal()!= null? securityContext.getUserPrincipal().getName() :"DEFAULT");
	}
	
	protected GetListaRefertiSR newGetListaRefertiSR(String citId) {
		GetListaRefertiSR parameters = new GetListaRefertiSR();
		parameters.setRichiedente(newRichiedente());//visto con Michele nel richiedente mettere chi compie l'operazione
		Paziente paziente = new Paziente();
		paziente.setCodiceFiscale(citId);
		parameters.setPaziente(paziente);
		return parameters;
	}	
	
	
	protected MetadatiDocumentoSR getMetadatiDocumentoFromLista(List<MetadatiDocumentoSR> metadatiDocumenti, String idReferto) {
		
		//Prendere il referto con data maggiore
		
		MetadatiDocumentoSR ref = metadatiDocumenti.stream().filter(c -> c.getCodiceDocumentoDipartimentale().equals(idReferto)).findFirst().orElse(null);
		//ref.getComponenteLocale().getComponenteLocaleTipo()
		if(ref == null) {
			throw ErroreBuilder.from(ApisanFseStatus.REFERTO_NON_TROVATO).exception();
		}
		
		return ref;
	}
	
	/**
	 * Ottiene la lista dei {@link MetadatiDocumentoSR} senza "doppioni": ovvero con lo stesso CodiceDocumentoDipartimentale.
	 * Di questi, viene preso quello con la data di inserimento più recente.
	 * Vedi mail di Nicola Gaudenzi del 20 marzo 2019 alle 9.41 con oggetto "Re: Problema sul codice documento dipartimentale"
	 * 
	 * 
	 * @param metadatiDocumenti
	 * @return
	 */
	protected List<MetadatiDocumentoSR> getMetadatiDocumentoDistinctIdReferto(List<MetadatiDocumentoSR> metadatiDocumenti) {
		return metadatiDocumenti.stream()
				.map(MetadatiDocumentoSRWrapper::new)
				.sorted()
				.distinct()
				.map(MetadatiDocumentoSRWrapper::unwrap)
				.collect(Collectors.toList());
		
	}
	
	public static class MetadatiDocumentoSRWrapper implements Comparable<MetadatiDocumentoSRWrapper>{
		private final MetadatiDocumentoSR referto;

		public MetadatiDocumentoSRWrapper(MetadatiDocumentoSR referto) {
			this.referto = referto;
		}

		public MetadatiDocumentoSR unwrap() {
			return referto;
		}

		public boolean equals(Object other) {
			if (other instanceof MetadatiDocumentoSRWrapper) {
				return ((MetadatiDocumentoSRWrapper) other).referto.getCodiceDocumentoDipartimentale()
						.equals(this.referto.getCodiceDocumentoDipartimentale());
			}

			return false;

		}

		public int hashCode() {
			return referto.getCodiceDocumentoDipartimentale().hashCode();
		}

		@Override
		public int compareTo(MetadatiDocumentoSRWrapper other) {
			return new CompareToBuilder()
					// Ordino prima per codice documento dipartimentale...
					.append(this.referto.getCodiceDocumentoDipartimentale(),
							other.referto.getCodiceDocumentoDipartimentale())
					
					// ...e poi per data inserimento DESC. Infatti, mi interessa (se trovo dei doppioni) prendere quello con 
					// data inserimento più recente!
					.append(other.referto.getDataInserimento()!=null?other.referto.getDataInserimento().toGregorianCalendar():null,
							this.referto.getDataInserimento()!=null?this.referto.getDataInserimento().toGregorianCalendar():null)
					
					
					.toComparison();

		}

	}
	

}
