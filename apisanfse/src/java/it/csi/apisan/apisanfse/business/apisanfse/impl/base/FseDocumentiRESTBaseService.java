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

import it.csi.apisan.apisanfse.business.integration.dao.ApisanFseDErroreDao;
import it.csi.apisan.apisanfse.business.mapper.ModelDocumentoVerificaStatoRichiestaResMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.Dettaglio;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumento;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.documenti.dma.Ruolo;
import it.csi.apisan.apisanfse.integration.documenti.dma.ServiceResponse;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.ApplicativoVerticale;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.ApplicazioneRichiedente;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.DocumentiService;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.Errore;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetDocumentoResponse;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.scaricostudi.CCScaricoStudiServicePortType;
import it.csi.apisan.apisanfse.integration.scaricostudi.VerificaStatoRichiestaReq;
import it.csi.apisan.apisanfse.integration.scaricostudi.VerificaStatoRichiestaRes;
import it.csi.apisan.apisanfse.util.ConstantsFse;
import it.csi.apisan.apisanfse.util.CostantiConsenso;
import it.csi.apisan.apisanfse.util.CostantiEtichette;

public abstract class FseDocumentiRESTBaseService  extends FseRESTBaseService {
	
	@Autowired
	protected DocumentiService documentiService;	 
	
	@Autowired
	protected CCScaricoStudiServicePortType scaricoStudiPort;
	

	public FseDocumentiRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	public FseDocumentiRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	
	protected RichiedenteInfo newRichiedenteInfo() {
		return newRichiedenteInfo(null);
	}
	
	protected RichiedenteInfo newRichiedenteInfo(String appverticale) {
		RichiedenteInfo richiedente = new RichiedenteInfo();
        ApplicativoVerticale applicativoVerticale = new ApplicativoVerticale();
        if(appverticale == null) {
            applicativoVerticale.setCodice(CostantiEtichette.APPLICAZIONE_VERTICALE_CODICE);
            applicativoVerticale.setDescrizione(CostantiEtichette.APPLICAZIONE_VERTICALE_DESCRIZIONE);

        }else {
        	applicativoVerticale.setCodice(appverticale);
        }
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
	
	
	protected RichiedenteInfo newRichiedenteInfoRegistraRitiro(String appverticale, String citId) {
		RichiedenteInfo richiedente = new RichiedenteInfo();
        ApplicativoVerticale applicativoVerticale = new ApplicativoVerticale();
        if(appverticale == null) {
            applicativoVerticale.setCodice(CostantiEtichette.APPLICAZIONE_VERTICALE_CODICE);
            applicativoVerticale.setDescrizione(CostantiEtichette.APPLICAZIONE_VERTICALE_DESCRIZIONE);

        }else {
        	applicativoVerticale.setCodice(appverticale);
        }
        richiedente.setApplicativoVerticale(applicativoVerticale);
        
        ApplicazioneRichiedente applicazioneRichiedente = new ApplicazioneRichiedente();
        applicazioneRichiedente.setCodice(this.xCodiceServizio);
        richiedente.setApplicazione(applicazioneRichiedente);
        
        richiedente.setCodiceFiscale(this.shibIdentitaCodiceFiscale);
        
        
        
        richiedente.setIp(this.xForwardedFor);
        richiedente.setNumeroTransazione(this.xRequestID);
        
        Ruolo ruolo = new Ruolo();
        if(shibIdentitaCodiceFiscale.equalsIgnoreCase(citId)) {
        	ruolo.setCodice(CostantiConsenso.RUOLO);
        }else {
        	ruolo.setCodice(CostantiConsenso.RUOLO_DEL);
        }
        richiedente.setRuolo(ruolo);
		return richiedente;
	}
	
	protected void checkSuccessoServiceDocumenti(ServiceResponse response) {
		if(RisultatoCodice.FALLIMENTO.equals(response.getEsito()) || (response.getErrori() != null && response.getErrori().size() >0)) {
  			throw toRESTDocumentiException(response.getErrori());
  		}
	}
	
	protected boolean isErrore185or188(ServiceResponse res) {
		boolean isErrore185 = false; 
		
		if(res.getEsito().equals(RisultatoCodice.FALLIMENTO)) {
			isErrore185 = res.getErrori().stream( ).filter(c -> (ConstantsFse.ERRORE_185.equalsIgnoreCase( c.getCodice()) || ConstantsFse.ERRORE_188.equalsIgnoreCase( c.getCodice()))  ).findFirst().isPresent();
		}
		
		return isErrore185;
	}
	
	protected ErroreRESTException toRESTDocumentiException(List<Errore> errori) {
		//TODO Nuova gestione degli errori con il prosismo rilascio
		List<Dettaglio> listaDettagli = errori.stream().map( err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).collect(Collectors.toList()) ;
		
	  it.csi.apisan.apisanfse.dto.apisanfse.Errore errore = erroreDao.getMappingErrore(listaDettagli);
	
	  return new ErroreRESTException(errore);
		
		//return toRESTDocumentiException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}
					
	protected ErroreRESTException toRESTDocumentiException(List<Errore> errori, int status, String msgDefault) {
		
		//TODO Nuova gestione degli errori con il prosismo rilascio
/*		List<Dettaglio> listaDettagli = errori.stream().map( err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).collect(Collectors.toList()) ;
		
	  it.csi.apisan.apisanfse.dto.apisanfse.Errore errore = erroreDao.getMappingErrore(listaDettagli);
	
	  return new ErroreRESTException(errore);*/

	  return ErroreBuilder.from(status,msgDefault).dettagli(errori, err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).exception();
	}
	
	protected void arricchisciScaricoStudi(ModelDocumento modelDocumento, String citId) {
		VerificaStatoRichiestaReq reqStatoRichiesta = new VerificaStatoRichiestaReq();
		reqStatoRichiesta.setCodiceFiscale(citId);		
		reqStatoRichiesta.setPin("0");
		reqStatoRichiesta.setIdReferto(modelDocumento.getIdDocumentoIlec());
		try {
				VerificaStatoRichiestaRes resStatoRichiesta = scaricoStudiPort.verificaStatoRichiesta(reqStatoRichiesta);
				if (resStatoRichiesta.getEsito().equals(it.csi.apisan.apisanfse.integration.scaricostudi.RisultatoCodice.SUCCESSO)) {
					modelDocumento = new ModelDocumentoVerificaStatoRichiestaResMapper(modelDocumento).from(resStatoRichiesta);
				}
		} catch (Exception e) {	
			log.error("execute", "Errore nel richiamo del servizio verificaStatoListaRichieste", e);
		}
		
	}
	


}
