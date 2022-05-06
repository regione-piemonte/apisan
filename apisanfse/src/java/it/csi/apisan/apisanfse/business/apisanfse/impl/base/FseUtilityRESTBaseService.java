/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisanfse.dto.apisanfse.Dettaglio;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.utility.dma.ServiceResponse;
import it.csi.apisan.apisanfse.integration.utility.dmacc.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.utility.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.utility.dma.Ruolo;
import it.csi.apisan.apisanfse.integration.utility.dmacc.ApplicativoVerticale;
import it.csi.apisan.apisanfse.integration.utility.dmacc.ApplicazioneRichiedente;
import it.csi.apisan.apisanfse.integration.utility.dmacc.Errore;
import it.csi.apisan.apisanfse.integration.utility.dmacc.UtilityService;
import it.csi.apisan.apisanfse.util.CostantiConsenso;
import it.csi.apisan.apisanfse.util.CostantiEtichette;

public abstract class FseUtilityRESTBaseService extends FseDelegheRESTBaseService {
	
	@Autowired
	protected UtilityService serviceUtility;
	
	public FseUtilityRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
	}

	protected RichiedenteInfo newRichiedenteInfo() {
		return newRichiedenteInfo(null,null);
	}
	
	protected RichiedenteInfo newRichiedenteInfo(String codiceAppRichiedente,String ruoloStr) {
		RichiedenteInfo richiedente = new RichiedenteInfo();
        ApplicativoVerticale applicativoVerticale = new ApplicativoVerticale();
        if(codiceAppRichiedente == null) {
            applicativoVerticale.setCodice(CostantiEtichette.APPLICAZIONE_VERTICALE_CODICE);
            applicativoVerticale.setDescrizione(CostantiEtichette.APPLICAZIONE_VERTICALE_DESCRIZIONE);
        }else {
        	applicativoVerticale.setCodice(codiceAppRichiedente);
        }
        richiedente.setApplicativoVerticale(applicativoVerticale);
        
        ApplicazioneRichiedente applicazioneRichiedente = new ApplicazioneRichiedente();
        applicazioneRichiedente.setCodice(this.xCodiceServizio);
        richiedente.setApplicazione(applicazioneRichiedente);
        
        richiedente.setCodiceFiscale(this.shibIdentitaCodiceFiscale);
        
        
        richiedente.setIp(this.xForwardedFor);
        richiedente.setNumeroTransazione(this.xRequestID);
        
        Ruolo ruolo = new Ruolo();
       
        if(StringUtils.isEmpty(ruoloStr)) {
        	ruolo.setCodice(CostantiConsenso.RUOLO);
        }else {
        	ruolo.setCodice(ruoloStr);
        }
        richiedente.setRuolo(ruolo);
		return richiedente;
	}
	
	protected ErroreRESTException toRESTUtilityException(List<Errore> errori) {
		//Nuova gestione degli errori
		List<Dettaglio> listaDettagli = errori.stream().map( err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).collect(Collectors.toList()) ;
		
	  it.csi.apisan.apisanfse.dto.apisanfse.Errore errore = erroreDao.getMappingErrore(listaDettagli);
	  return new ErroreRESTException(errore);
	//return toRESTUtilityException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}
					
	protected ErroreRESTException toRESTUtilityException(List<Errore> errori, int status, String msgDefault) {
		
		return ErroreBuilder.from(status,msgDefault).dettagli(errori, err -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(err.getCodice());
			d.setValore(err.getDescrizione());
			return d;
		}).exception();
	}
	
	
	protected void checkSuccessoServiceUtility(ServiceResponse response) {
		if(RisultatoCodice.FALLIMENTO.equals(response.getEsito()) || (response.getErrori() != null && response.getErrori().size() >0)) {
  			throw toRESTUtilityException(response.getErrori());
  		}
	}

}
