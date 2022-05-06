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
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.Errore;
import it.csi.apisan.apisanfse.integration.documentoPersonale.dmacc.RisultatoCodice;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiIdDocumentoDocumentoPersonaleDeleteService  extends FseDocumentoPersonaleRESTBaseService{

	private String citId;
	private String idDocumento;
	
	public CittadiniCitIdDocumentiIdDocumentoDocumentoPersonaleDeleteService(String xRequestId, String xForwardedFor,
	String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento,
	SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId=citId;
		this.idDocumento=idDocumento;
	}

	@Override
	protected Response execute() {
		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "DeleteDocumentoPersonale versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(citId, "Codice fiscale non valorizzato");		
		checkNotBlank(idDocumento, "Identificativo documento non valorizzato");
		checkCodiceFiscaleValido(citId);	   
	   
	    Holder<List<Errore>> errori = new Holder<List<Errore>>();
	    Holder<RisultatoCodice> esito = new Holder<RisultatoCodice>();
	    documentoPersonaleService.deleteDocumentoPersonale(this.idDocumento, newRichiedenteInfo(), this.citId, errori, esito);
	
	    //In caso di fallimento torno errore
        if(esito.value.equals(RisultatoCodice.FALLIMENTO)) {
        	throw toRESTDocumentoPersonaleException(errori.value);
        }
    	                       	                		
        return Response.ok().build();
	}
}
