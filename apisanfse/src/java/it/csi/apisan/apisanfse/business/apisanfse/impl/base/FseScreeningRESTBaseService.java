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
import it.csi.apisan.apisanfse.integration.screening.dma.ApplicativoVerticale;
import it.csi.apisan.apisanfse.integration.screening.dma.ApplicazioneRichiedente;
import it.csi.apisan.apisanfse.integration.screening.dma.Errore;
import it.csi.apisan.apisanfse.integration.screening.dma.RegimeDMA;
import it.csi.apisan.apisanfse.integration.screening.dma.Richiedente;
import it.csi.apisan.apisanfse.integration.screening.dma.RuoloDMA;
import it.csi.apisan.apisanfse.integration.screening.dmacc.ScreeningService;
import it.csi.apisan.apisanfse.util.CostantiConsenso;

public abstract class FseScreeningRESTBaseService  extends FseDelegheRESTBaseService {
	
	@Autowired
	protected ScreeningService screeningService;

	public FseScreeningRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	public FseScreeningRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	protected Richiedente newRichiedenteInfo(String servizio) {
		Richiedente richiedente = new Richiedente();
        ApplicativoVerticale applicativoVerticale = new ApplicativoVerticale();
        applicativoVerticale.setCodice(servizio);
        //applicativoVerticale.setCodice(CostantiEtichette.APPLICAZIONE_VERTICALE_CODICE);
        //applicativoVerticale.setDescrizione(CostantiEtichette.APPLICAZIONE_VERTICALE_DESCRIZIONE);
        richiedente.setApplicativoVerticale(applicativoVerticale);
        
        ApplicazioneRichiedente applicazioneRichiedente = new ApplicazioneRichiedente();
        //TODO solo per ora da modificare assolutamente
        applicazioneRichiedente.setCodice("APISAN");
        //applicazioneRichiedente.setCodice(this.xCodiceServizio);
        richiedente.setApplicazione(applicazioneRichiedente);
        
        richiedente.setCodiceFiscale(this.shibIdentitaCodiceFiscale);
        
        
        
        richiedente.setIp(this.xForwardedFor.split(",")[0]);
        richiedente.setNumeroTransazione(this.xRequestID);
        
        RuoloDMA ruolo = new RuoloDMA();
        ruolo.setCodice(CostantiConsenso.RUOLO);
        richiedente.setRuolo(ruolo);
        
        RegimeDMA regime = new RegimeDMA();
        regime.setCodice("");
        regime.setDescrizione("");
        regime.setRiferimento("");
        richiedente.setRegime(regime);
		return richiedente;
	}
	
	protected ErroreRESTException toRESTScreeningException(List<Errore> errori) {
		//Nuova gestione degli errori
		List<Dettaglio> listaDettagli = errori.stream().map( err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).collect(Collectors.toList()) ;
		
	  it.csi.apisan.apisanfse.dto.apisanfse.Errore errore = erroreDao.getMappingErrore(listaDettagli);
	  return new ErroreRESTException(errore);
		//return toRESTScreeningException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}
					
	protected ErroreRESTException toRESTScreeningException(List<Errore> errori, int status, String msgDefault) {
		
		return ErroreBuilder.from(status,msgDefault).dettagli(errori, err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).exception();
	}

}
