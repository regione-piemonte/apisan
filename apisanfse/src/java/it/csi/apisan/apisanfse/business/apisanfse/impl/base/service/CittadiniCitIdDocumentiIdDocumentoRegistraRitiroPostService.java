/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDocumentiRESTBaseService;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadRegistraDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.IdentificativoDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.RegistraAvvenutoRitiroRequest;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.RegistraAvvenutoRitiroResponse;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.RisultatoCodice;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiIdDocumentoRegistraRitiroPostService extends FseDocumentiRESTBaseService {
	
	private String citId; 
	private String idDocumento; 	
	private PayloadRegistraDocumento payloadRegistraDocumento;
	@Value("${serviceROLName}")
	private String serviceROLName;
		
	public CittadiniCitIdDocumentiIdDocumentoRegistraRitiroPostService(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, 
			String citId, 
			String idDocumento,
			PayloadRegistraDocumento payloadRegistraDocumento, 
			SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId=citId;
		this.idDocumento=idDocumento;
		this.payloadRegistraDocumento=payloadRegistraDocumento;
	
	}

	@Override
	protected Response execute() {

		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "PostRegistraRitiroDocumento versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(idDocumento, "Identificativo del documento non valorizzato");
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(citId);
		checkNotNull(payloadRegistraDocumento, "Dati da inserite per a registrazione del documento non valorizzati");
				 
	    
	    
	    RegistraAvvenutoRitiroResponse response = documentiService.registraAvvenutoRitiro(createRequest(null, citId));
	    
		//09/06/2021 Verifica con Veronica se err_185 rifare la chiamata con ritiro referti 
		if(isErrore185or188(response)) {
			response = documentiService.registraAvvenutoRitiro(createRequest(serviceROLName, citId));
		}
	    
	    //In caso di fallimento torno errore
	    if(response.getEsito().equals(RisultatoCodice.FALLIMENTO)) {
	    	throw toRESTDocumentiException(response.getErrori());
	    }		    
	    
		return Response.ok().build();
	}
	
	
	private RegistraAvvenutoRitiroRequest createRequest(String codiceServizio, String citId) {
		
		RegistraAvvenutoRitiroRequest request = new RegistraAvvenutoRitiroRequest() ;
	    request.setCfPaziente(this.citId);
	    //13/09/2021 da telefonata con Veronica necessario distinguere tra cittadino e delegato
	    request.setRichiedente(newRichiedenteInfoRegistraRitiro(codiceServizio, citId));
	    
	    IdentificativoDocumento identificativoDocumento = new IdentificativoDocumento();
	    identificativoDocumento.setCodiceCL(this.payloadRegistraDocumento.getCodiceCl());
	    identificativoDocumento.setIdDocumentoIlec(this.idDocumento);
	    request.setIdentificativoDocumento(identificativoDocumento);
	    
	    return request;
	}

}
