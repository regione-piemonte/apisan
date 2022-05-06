/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisanfse.dto.apisanfse.Dettaglio;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.etichette.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.etichette.dma.Ruolo;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.ApplicativoVerticale;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.ApplicazioneRichiedente;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.Errore;
import it.csi.apisan.apisanfse.integration.etichette.dmacc.EtichetteService;
import it.csi.apisan.apisanfse.util.CostantiConsenso;
import it.csi.apisan.apisanfse.util.CostantiEtichette;

public abstract class FseEtichetteRESTBaseService  extends FseRESTBaseService {
	
	@Autowired
	protected EtichetteService etichetteService;

	public FseEtichetteRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	public FseEtichetteRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	protected RichiedenteInfo newRichiedenteInfo() {
		RichiedenteInfo richiedente = new RichiedenteInfo();
        ApplicativoVerticale applicativoVerticale = new ApplicativoVerticale();
        applicativoVerticale.setCodice(CostantiEtichette.APPLICAZIONE_VERTICALE_CODICE);
        applicativoVerticale.setDescrizione(CostantiEtichette.APPLICAZIONE_VERTICALE_DESCRIZIONE);
        richiedente.setApplicativoVerticale(applicativoVerticale);
        
        ApplicazioneRichiedente applicazioneRichiedente = new ApplicazioneRichiedente();
        applicazioneRichiedente.setCodice(this.xCodiceServizio);
        richiedente.setApplicazione(applicazioneRichiedente);
        
        richiedente.setCodiceFiscale(this.shibIdentitaCodiceFiscale);
        
        
        
        richiedente.setIp(this.xForwardedFor);
        richiedente.setNumeroTransazione(this.xRequestID);
        
        Ruolo ruolo = new Ruolo();
        ruolo.setCodice(CostantiConsenso.RUOLO);
        richiedente.setRuolo(ruolo);
		return richiedente;
	}
	
	protected it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo newRichiedenteInfoDocumenti() {
		it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo richiedente = new it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo();
		it.csi.apisan.apisanfse.integration.documenti.dmacc.ApplicativoVerticale applicativoVerticale = new it.csi.apisan.apisanfse.integration.documenti.dmacc.ApplicativoVerticale();
        applicativoVerticale.setCodice(CostantiEtichette.APPLICAZIONE_VERTICALE_CODICE);
        applicativoVerticale.setDescrizione(CostantiEtichette.APPLICAZIONE_VERTICALE_DESCRIZIONE);
        richiedente.setApplicativoVerticale(applicativoVerticale);
        
        it.csi.apisan.apisanfse.integration.documenti.dmacc.ApplicazioneRichiedente applicazioneRichiedente = new it.csi.apisan.apisanfse.integration.documenti.dmacc.ApplicazioneRichiedente();
        applicazioneRichiedente.setCodice(this.xCodiceServizio);
        richiedente.setApplicazione(applicazioneRichiedente);
        
        richiedente.setCodiceFiscale(this.shibIdentitaCodiceFiscale);
                        
        richiedente.setIp(this.xForwardedFor);
        richiedente.setNumeroTransazione(this.xRequestID);
        
        it.csi.apisan.apisanfse.integration.documenti.dma.Ruolo ruolo = new it.csi.apisan.apisanfse.integration.documenti.dma.Ruolo();
        ruolo.setCodice(CostantiConsenso.RUOLO);
        richiedente.setRuolo(ruolo);
		return richiedente;
	}
	
	protected ErroreRESTException toRESTEtichetteException(List<Errore> errori) {
		//Nuova gestione degli errori
		List<Dettaglio> listaDettagli = errori.stream().map( err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).collect(Collectors.toList()) ;
		
	  it.csi.apisan.apisanfse.dto.apisanfse.Errore errore = erroreDao.getMappingErrore(listaDettagli);
	  return new ErroreRESTException(errore);
	 //return toRESTEtichetteException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}
					
	protected ErroreRESTException toRESTEtichetteException(List<Errore> errori, int status, String msgDefault) {
		
		return ErroreBuilder.from(status,msgDefault).dettagli(errori, err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).exception();
	}
	
	protected ErroreRESTException toRESTDocumentiException(List<it.csi.apisan.apisanfse.integration.documenti.dmacc.Errore> errori) {
		return toRESTDocumentiException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}
					
	protected ErroreRESTException toRESTDocumentiException(List<it.csi.apisan.apisanfse.integration.documenti.dmacc.Errore> errori, int status, String msgDefault) {
		
		return ErroreBuilder.from(status,msgDefault).dettagli(errori, err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).exception();
	}
	
	@Override
	protected Response execute() {
		validateRequestParameters();
		setSoapRequest();		
		callService();
		checkErrors();
        return getResponse();
	}
	
	protected abstract void validateRequestParameters();
	protected abstract void setSoapRequest();
	protected abstract void callService();
	protected abstract void checkErrors() throws ErroreRESTException;
	protected abstract javax.ws.rs.core.Response getResponse();

}
