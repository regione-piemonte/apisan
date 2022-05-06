/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDocumentoPersonaleRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.MetadatiDocumentoPersonaleMapper;
import it.csi.apisan.apisanfse.business.mapper.ModelDocumentoPersonaleMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoPersonale;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelMetadatiDocumentoPersonale;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadDocumentoPersonale;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.DocumentoPersonale;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.MetadatiDocumentoPersonale;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.Errore;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.RisultatoCodice;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiDocumentoPersonalePostService extends FseDocumentoPersonaleRESTBaseService{

	
	private String citId;
	private PayloadDocumentoPersonale payloadDocumentoPersonale;
		
	public CittadiniCitIdDocumentiDocumentoPersonalePostService(String xRequestId, String xForwardedFor,
	String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId,
	PayloadDocumentoPersonale payloadDocumentoPersonale, SecurityContext securityContext,
	HttpHeaders httpHeaders){
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId=citId;
		this.payloadDocumentoPersonale=payloadDocumentoPersonale;
	}

	@Override
	protected Response execute() {
		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "DeleteDocumentoPersonale versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotNull(payloadDocumentoPersonale, "Dati documento non valorizzati");
		checkNotBlank(citId, "Codice fiscale non valorizzato");				
		checkCodiceFiscaleValido(citId);	   
		
		ModelDocumentoPersonale modelDocumentoPersonale  = payloadDocumentoPersonale.getDocumento();
		ModelMetadatiDocumentoPersonale  modelMetadatiDocumentoPersonale  = payloadDocumentoPersonale.getMetadatiDocumento();
		
		checkNotNull(modelDocumentoPersonale, "Dati documento non valorizzati");
		checkNotNull(modelMetadatiDocumentoPersonale, "Dati documento non valorizzati");
		
	    DocumentoPersonale documento = new ModelDocumentoPersonaleMapper().to(modelDocumentoPersonale); 
	    MetadatiDocumentoPersonale metadatiDocumento = new MetadatiDocumentoPersonaleMapper().to(modelMetadatiDocumentoPersonale); 	       
	   
	    Holder<List<Errore>> errori = new Holder<List<Errore>>();
	    Holder<RisultatoCodice> esito = new Holder<RisultatoCodice>();
	    Holder<String> idDocumento = new Holder<String>();
	    documentoPersonaleService.setDocumentoPersonale(newRichiedenteInfo(), this.citId, documento, metadatiDocumento, errori, esito, idDocumento);	    
	
	    //In caso di fallimento torno errore
        if(esito.value.equals(RisultatoCodice.FALLIMENTO)) {
        	throw toRESTDocumentoPersonaleException(errori.value);
        }
    	                       	                		
        return Response.ok(idDocumento.value).build();
	}
}
