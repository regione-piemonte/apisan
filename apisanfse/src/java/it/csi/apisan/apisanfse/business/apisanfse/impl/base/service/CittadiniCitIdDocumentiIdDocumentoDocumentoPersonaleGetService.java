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
import it.csi.apisan.apisanfse.business.mapper.ModelDocumentoPersonaleMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoPersonale;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dma.DocumentoPersonale;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.Errore;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.RisultatoCodice;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiIdDocumentoDocumentoPersonaleGetService extends FseDocumentoPersonaleRESTBaseService {
	
	private String citId;	
	private String idDocumento;
		
	public CittadiniCitIdDocumentiIdDocumentoDocumentoPersonaleGetService(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId=citId;		
		this.idDocumento=idDocumento;
	}

	@Override
	protected Response execute() {
		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "GetDocumentoPersonale versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(citId, "Codice fiscale non valorizzato");		
		checkNotBlank(idDocumento, "Identificativo documento non valorizzato");
		checkCodiceFiscaleValido(citId);
		        
        Holder<List<Errore>> errori = new Holder<java.util.List<Errore>>();
        Holder<RisultatoCodice> esito = new Holder<RisultatoCodice>();
        Holder<DocumentoPersonale> documentoPersonale = new Holder<DocumentoPersonale>();
        documentoPersonaleService.getDocumentoPersonale(this.idDocumento, this.citId, newRichiedenteInfo(), errori, esito, documentoPersonale);
        
		//In caso di fallimento torno errore
        if(esito.value.equals(RisultatoCodice.FALLIMENTO)) {
        	throw toRESTDocumentoPersonaleException(errori.value);
        }
    	               
        ModelDocumentoPersonale modelDocumentoPersonale = new ModelDocumentoPersonaleMapper().from(documentoPersonale.value);	                			
		return Response.ok(modelDocumentoPersonale).build();
	}
	

}
