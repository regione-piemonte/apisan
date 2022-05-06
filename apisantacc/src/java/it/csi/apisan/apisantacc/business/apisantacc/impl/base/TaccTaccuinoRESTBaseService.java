/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import it.csi.apisan.apisantacc.business.mapper.DateXMLGregorianCalendarMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.Dettaglio;
import it.csi.apisan.apisantacc.exception.ErroreBuilder;
import it.csi.apisan.apisantacc.exception.ErroreRESTException;
import it.csi.dma.Errore;
import it.csi.dma.dmaclbluc.RequestCommonGet;
import it.csi.dma.dmaclbluc.Richiedente;
import it.csi.dma.dmaclbluc.TaccuinoService;

public abstract class TaccTaccuinoRESTBaseService extends TaccRESTBaseService {
	
	@Autowired
	protected TaccuinoService taccuinoService;
	DateXMLGregorianCalendarMapper dm= new DateXMLGregorianCalendarMapper();
	
	
	@Value("${serviceROLName}")
	private String serviceROLName;
	
	public TaccTaccuinoRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	
	public TaccTaccuinoRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
	}
	
	
	protected ErroreRESTException toRESTException(List<Errore> errori) {
		return toRESTException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}
	
		
	protected ErroreRESTException toRESTException(List<Errore> errori, int status, String msgDefault) {
		
		return ErroreBuilder.from(status, msgDefault).dettagli(errori, err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).exception();
	}
	
	
	protected Richiedente newRichiedenteTaccuino() {
		Richiedente richiedente = new Richiedente();
		richiedente.setApplicazione(this.xCodiceServizio);
		richiedente.setCodiceFiscale(this.shibIdentitaCodiceFiscale);
		richiedente.setIdentificativoIp(this.xForwardedFor);
		richiedente.setNumeroTransazione(this.xRequestID);
		richiedente.setRuolo("CIT");
		richiedente.setApplicativoVerticale("FSETAC");
		return richiedente;
	}
	
	protected Object setGenericGetRequest(RequestCommonGet requestCommonGet,Long taccuinoId, 
			Integer limit,
			Integer offset, 
			String ordinamento, 	
			String da, 
			String a) {
		requestCommonGet.setTaccuino(taccuinoId);
		requestCommonGet.setLimit(limit);
		requestCommonGet.setOffset(offset);
		requestCommonGet.setOrdinamento(ordinamento);
		requestCommonGet.setRichiedente(newRichiedenteTaccuino());
		try {
			requestCommonGet.setDataDa(getGregDateByString(da));
			requestCommonGet.setDataA(getGregDateByString(a));
		} catch(IllegalStateException ise) {
			//TODO comunicato che se date sono in un formato errato non vengono considerate
			//ise.printStackTrace();
		}
		return requestCommonGet;
	}
	
	private XMLGregorianCalendar getGregDateByString(String dateQparam) {
		//final String TIMESTAMP_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";//2020-12-02T00:00:00.000+0100
		final String TIMESTAMP_PATTERN_Z = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";//2020-12-02T15:06:04.211Z
	    DateFormat TIMESTAMP_FORMATTER = null;
	    final TimeZone ROMA_TIMEZONE = TimeZone.getTimeZone("UTC");
	    
	    if(dateQparam == null) {
			return null;
		} 
	    /*else if (dateQparam.indexOf("Z")==-1){
			TIMESTAMP_FORMATTER=new SimpleDateFormat(TIMESTAMP_PATTERN);
		} */else {
			TIMESTAMP_FORMATTER=new SimpleDateFormat(TIMESTAMP_PATTERN_Z);
		}
	    TIMESTAMP_FORMATTER.setTimeZone(ROMA_TIMEZONE);
		try {
			Date d= TIMESTAMP_FORMATTER.parse(dateQparam);
			return dm.to(d);
		} catch (ParseException e) {
			log.error("getGregDateByString", "Errore nella conversione in XMLGregorianCalendar. per "+dateQparam+e.getMessage(), e);
			throw new IllegalStateException("Errore nella conversione in XMLGregorianCalendar. per "+dateQparam+e.getMessage(), e);
			//throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Formato data errato").exception();
		}
	}
	
/*	protected void checkUtenteAutorizzatoOrDelegato(String cf) {
		checkUtenteAutorizzatoOrDelegato( cf, serviceROLName); 
	}
	//aggiunta nella condizione che l'utente sia delegato
	protected void checkUtenteAutorizzatoOrDelegato(String cf, String codiceServizio) {
		checkNotNull(shibIdentitaCodiceFiscale, ErroreBuilder.from(ApisanTaccStatus.UTENTE_NON_AUTORIZZATO).exception());
		if(!isUtenteAutorizzato(cf)) {
			checkCondition(isUtenteDelegato( cf, codiceServizio), ErroreBuilder.from(ApisanTaccStatus.UTENTE_NON_AUTORIZZATO).exception());
		}
	}	
	//metodo che verifica se l'utente sia delegato o meno e in caso in cui lo sia riempie l'oggetto delega
	protected void verificaUtenteAutorizzatoODelegato(String cf, String codiceServizio, Delega delega) {
		checkNotNull(shibIdentitaCodiceFiscale, ErroreBuilder.from(ApisanTaccStatus.UTENTE_NON_AUTORIZZATO).exception());
		if(!isUtenteAutorizzato(cf)) {
			checkCondition(isUtenteDelegatoGradoTipo( cf, codiceServizio, delega), ErroreBuilder.from(ApisanTaccStatus.UTENTE_NON_AUTORIZZATO).exception());
		}
	}
	
	private GetDelegantiResponse chiamataDeleghe(String cf , String codiceServizio) {
		GetDeleganti req = new GetDeleganti();
		it.csi.deleghe.deleghebe.ws.model.Richiedente richiedente = new it.csi.deleghe.deleghebe.ws.model.Richiedente(xRequestID, xCodiceServizio, shibIdentitaCodiceFiscale);
		req.setRichiedente(richiedente);

		Cittadino cittDelegante = new Cittadino();
		cittDelegante.setCodiceFiscale(cf);
		req.setCittadinoDelegante(cittDelegante);
		//req.setCodiciServizio(Arrays.asList(serviceROLName));
		req.setCodiciServizio(Arrays.asList(codiceServizio));
		req.setStatiDelega(Arrays.asList(StatoDelega.ATTIVA.toString(), StatoDelega.INSCADENZA.toString()));
				
		Cittadino cittDelegato = new Cittadino();
		cittDelegato.setCodiceFiscale(shibIdentitaCodiceFiscale);
		req.setCittadinoDelegato(cittDelegato);
		
		//per verificare se il cf in path abbia delegato l'utente nell'header (shibidentitacf) preferisco fare una chiamata sui deleganti (ovvero chi ha effettuato l'autenticazione
		// richiama il servizio per vedere se il cf del path sia un suo delegante in questo modo per l'audit la catena ha preciso chi effettua la chiamata 
		GetDelegantiResponse gdResp = delegheCittadiniService.getDelegantiService(req);
		return gdResp;
	}
	
	
	protected boolean isUtenteDelegatoGradoTipo(String cf, String codiceServizio, Delega delega) {
		String METHOD_NAME = "isUtenteDelegatoGradoTipo";
		GetDelegantiResponse gdResp = chiamataDeleghe(cf, codiceServizio);

		if (!it.csi.deleghe.deleghebe.ws.model.RisultatoCodice.SUCCESSO.equals(gdResp.getEsito())) {
			List<it.csi.deleghe.deleghebe.ws.model.Errore> errori = gdResp.getErrori();
			if(errori!=null) {
				log.error(METHOD_NAME, "Errore getDelegatiService service:");
				errori.forEach(e -> {
					log.error(METHOD_NAME, "   Codice: %s, Descrizione: %s", e.getCodice(), e.getDescrizione());
				});
			}

			return false;
		}

		boolean presentiDeleghe = (gdResp.getDeleganti() != null && !gdResp.getDeleganti().isEmpty() );
		
		if(presentiDeleghe) {
			Optional<DelegaServizio> delegaServ = gdResp.getDeleganti().get(0).getDeleghe().stream().filter(delRol -> codiceServizio.equals(delRol.getCodiceServizio()) 
					&& (StatoDelega.ATTIVA.toString().equals(delRol.getStatoDelega())
							|| StatoDelega.INSCADENZA.toString().equals(delRol.getStatoDelega() )))
					.filter(del ->  del.getDataInizioDelega().compareTo(new Date()) <=0 && del.getDataFineDelega().compareTo(new Date()) >=0).findFirst();
					//.collect(Collectors.toList()) ;
			
			if(delegaServ.isPresent()) {
				delega.setGradoDelega(delegaServ.get().getGradoDelega());
				delega.setTipoDelega(delegaServ.get().getTipoDelega());
			}
			
			return delegaServ.isPresent();
		}else {
			return false;
		}
	}
	
	
	protected boolean isUtenteDelegato(String cf, String codiceServizio) {
		final String METHOD_NAME = "isUtenteDelegato";
		GetDelegantiResponse gdResp = chiamataDeleghe(cf, codiceServizio);
		if (!it.csi.deleghe.deleghebe.ws.model.RisultatoCodice.SUCCESSO.equals(gdResp.getEsito())) {
			List<it.csi.deleghe.deleghebe.ws.model.Errore> errori = gdResp.getErrori();
			if(errori!=null) {
				log.error(METHOD_NAME, "Errore getDelegatiService service:");
				errori.forEach(e -> {
					log.error(METHOD_NAME, "   Codice: %s, Descrizione: %s", e.getCodice(), e.getDescrizione());
				});
			}
			
			return false;
		}
		
		
		return isPresenteDeleganteAttivo(gdResp, codiceServizio);
	}	
	
	private boolean isPresenteDeleganteAttivo(GetDelegantiResponse gdResp, String servizioName) {

		boolean presentiDeleghe = (gdResp.getDeleganti() != null && !gdResp.getDeleganti().isEmpty() );

		return	(presentiDeleghe && gdResp.getDeleganti().stream().anyMatch(c ->  c.getDeleghe().stream().filter(delRol -> servizioName.equals(delRol.getCodiceServizio()) 
				&& (StatoDelega.ATTIVA.toString().equals(delRol.getStatoDelega())
						|| StatoDelega.INSCADENZA.toString().equals(delRol.getStatoDelega() )))
				.anyMatch(del ->  del.getDataInizioDelega().compareTo(new Date()) <=0 && del.getDataFineDelega().compareTo(new Date()) >=0)   )) ;
	}*/

	
}
	