/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisanfse.dto.apisanfse.Dettaglio;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.Ruolo;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.ApplicativoVerticale;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.ApplicazioneRichiedente;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.DocumentoPersonaleService;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.Errore;
import it.csi.apisan.apisanfse.util.CostantiConsenso;
import it.csi.apisan.apisanfse.util.CostantiEtichette;

public abstract class FseDocumentoPersonaleRESTBaseService  extends FseRESTBaseService {
	
	@Autowired
	protected DocumentoPersonaleService documentoPersonaleService;
	

	public FseDocumentoPersonaleRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	public FseDocumentoPersonaleRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
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
	
	protected ErroreRESTException toRESTDocumentoPersonaleException(List<Errore> errori) {
		List<Dettaglio> listaDettagli = errori.stream().map( err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).collect(Collectors.toList()) ;
		
	  it.csi.apisan.apisanfse.dto.apisanfse.Errore errore = erroreDao.getMappingErrore(listaDettagli);
	  return new ErroreRESTException(errore);
	//return toRESTDocumentoPersonaleException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}
					
	protected ErroreRESTException toRESTDocumentoPersonaleException(List<Errore> errori, int status, String msgDefault) {
		
		return ErroreBuilder.from(status,msgDefault).dettagli(errori, err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).exception();
	}

}
