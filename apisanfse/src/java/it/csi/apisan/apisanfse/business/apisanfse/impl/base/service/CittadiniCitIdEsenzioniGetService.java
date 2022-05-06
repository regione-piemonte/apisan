/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseEsenzioniRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelEsenzioneEsenzioniMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEsenzione;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEsenzioneEsenzioni;
import it.csi.apisan.apisanfse.integration.esenzioni.dma.PazienteSOL;
import it.csi.apisan.apisanfse.integration.esenzioni.dma.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.esenzioni.dmacc.EsenzioniRequest;
import it.csi.apisan.apisanfse.integration.esenzioni.dmacc.EsenzioniResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdEsenzioniGetService extends FseEsenzioniRESTBaseService {
	
	private String citId;
	private String servizio;
		
	public CittadiniCitIdEsenzioniGetService(String xRequestId, String xForwardedFor, String xCodiceServizio,
	String shibIdentitaCodiceFiscale, String citId, String servizio, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId=citId;
		this.servizio=servizio;	
	}

	@Override
	protected Response execute() {
		 
		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "GetEsenzioni versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(citId, "Codice fiscale non valorizzato");		
		checkCodiceFiscaleValido(citId);
		checkNotNull(servizio, "Codice del servizio non valorizzata");
		checkNotBlank(servizio, "Codice del servizio non valorizzato");
						
	    EsenzioniRequest request = new EsenzioniRequest();
	    PazienteSOL pazienteSOL = new PazienteSOL();
	    pazienteSOL.setCodiceFiscale(this.citId);
	    request.setPaziente(pazienteSOL);
	    request.setRichiedente(newRichiedenteInfo(this.servizio, this.citId));
	    
	    EsenzioniResponse response = esenzioniService.getEsenzioni(request);
	        
	    //In caso di fallimento torno errore
	    if(response.getEsito().equals(RisultatoCodice.FALLIMENTO)) {
	    	throw toRESTEsenzioniException(response.getErrori());
	    }
	    
	    ModelEsenzione modelEsenzione = new ModelEsenzione();
	    modelEsenzione.setOscuramentoEsenzioni(response.getOscuramentoEsenzioni());
	    
	    List<ModelEsenzioneEsenzioni> modelEsenzioneEsenzioni = new ModelEsenzioneEsenzioniMapper().fromList(response.getEsenzioni());
	    modelEsenzione.setEsenzioni(modelEsenzioneEsenzioni);	    	                   
	    	                			
		return Response.ok(modelEsenzione).build();
	  
	}

}
