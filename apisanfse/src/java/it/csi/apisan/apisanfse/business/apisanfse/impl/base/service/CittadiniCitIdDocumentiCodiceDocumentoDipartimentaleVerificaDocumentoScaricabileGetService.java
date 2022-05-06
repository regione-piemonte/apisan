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
import it.csi.apisan.apisanfse.business.mapper.ModelVerificaDocumentoVerificaDocumentoScaricabileResponseMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelVerificaDocumento;
import it.csi.apisan.apisanfse.integration.documenti.dma.RichiedenteInfo;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.VerificaDocumentoScaricabileRequest;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.VerificaDocumentoScaricabileResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiCodiceDocumentoDipartimentaleVerificaDocumentoScaricabileGetService extends FseDocumentiRESTBaseService {
	
	private String citId;
	private String idDocumento; 
	private String codiceAppVerticale; 
	private String componenteLocale;
	private String codiceRuolo;
	@Value("${serviceROLName}")
	private String serviceROLName;
	
	
	public CittadiniCitIdDocumentiCodiceDocumentoDipartimentaleVerificaDocumentoScaricabileGetService(String citId,
			String idDocumento, String codiceAppVerticale, String componenteLocale, String codiceRuolo, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.idDocumento = idDocumento; 
		this.codiceAppVerticale = codiceAppVerticale; 
		this.componenteLocale = componenteLocale;
		this.codiceRuolo = codiceRuolo;
	}

	

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Valorizzare il codice servizio");
		checkNotBlank(xRequestID, "Valorizzare xRequestid");
		checkNotBlank(xForwardedFor, "Valorizzare ipclient");
		checkNotBlank(shibIdentitaCodiceFiscale, "Valorizzare l'identita");
		checkNotBlank(idDocumento, "Valorizzare id Documento");
		checkNotBlank(componenteLocale, "Valorizzare componente locale");
		checkNotNull(codiceAppVerticale, "Valorizzare il codice componente verticale");
		
		VerificaDocumentoScaricabileResponse response = documentiService.verificaDocumentoScaricabile(createDocumentoScaricabileRequest());
		
		checkSuccessoServiceDocumenti(response);
		
		ModelVerificaDocumento res = new ModelVerificaDocumentoVerificaDocumentoScaricabileResponseMapper().from(response);
		
		return Response.ok().entity(res).build();
	}
	
	
	private VerificaDocumentoScaricabileRequest createDocumentoScaricabileRequest() {
		VerificaDocumentoScaricabileRequest request = new VerificaDocumentoScaricabileRequest();
		request.setCfPaziente(citId);
		request.setCodiceCL(componenteLocale);
		request.setIdDocumento(idDocumento);
		RichiedenteInfo richiedente = newRichiedenteInfo(codiceAppVerticale);
		//Modifica per applicazione medico
		if(this.codiceRuolo!=null) {
			richiedente.getRuolo().setCodice(this.codiceRuolo);
		}
		request.setRichiedente(richiedente);
		
		
		return request;
	}

}
