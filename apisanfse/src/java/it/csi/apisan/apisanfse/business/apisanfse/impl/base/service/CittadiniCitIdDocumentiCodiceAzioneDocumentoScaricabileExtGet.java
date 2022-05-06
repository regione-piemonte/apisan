/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.text.MessageFormat;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDocumentiRESTBaseService;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumentoScaricabileExt;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiCodiceAzioneDocumentoScaricabileExtGet extends FseDocumentiRESTBaseService {
	
	private String taxCode;	 
	private String documentoId;
	private String codiceAppVerticale; 
	private String codiceAzione;
	@Value("${serviceROLUrl}")
	private String serviceROLUrl;
	@Value("${serviceFSEUrl}")
	private String serviceFSEUrl;
	
	private final static String ROL = "ROL";
	private final static String FSE = "FSE";
	
	public CittadiniCitIdDocumentiCodiceAzioneDocumentoScaricabileExtGet(String taxCode,
			String codiceAzione, String codiceAppVerticale, String documentoId, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.taxCode = taxCode;
		this.codiceAzione = codiceAzione; 
		this.codiceAppVerticale = codiceAppVerticale;
		this.documentoId = documentoId;
	}

	

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Valorizzare il codice servizio");
		checkNotBlank(xRequestID, "Valorizzare xRequestid");
		checkNotBlank(xForwardedFor, "Valorizzare ipclient");
		checkNotBlank(shibIdentitaCodiceFiscale, "Valorizzare l'identita");
		checkNotBlank(codiceAzione, "Valorizzare il codice azione");		
		checkNotNull(codiceAppVerticale, "Valorizzare il codice componente verticale");						
		
		ModelDocumentoScaricabileExt res = new ModelDocumentoScaricabileExt();
		
		if(FSE.equalsIgnoreCase(codiceAzione)) {
			checkNotBlank(documentoId, "Valorizzare l'id documento");
			res = createDocumentoScaricabileExtResponseFSE(codiceAzione);
		}
		
		if(ROL.equalsIgnoreCase(codiceAzione)) {
			res = createDocumentoScaricabileExtResponseROL(codiceAzione);
		}		
		
		return Response.ok().entity(res).build();
	}
	
	
	private ModelDocumentoScaricabileExt createDocumentoScaricabileExtResponseFSE(String codiceAzione) {
		
		ModelDocumentoScaricabileExt res = new ModelDocumentoScaricabileExt();
		res.setServizioAzione(MessageFormat.format(serviceFSEUrl, new Object[] {taxCode,documentoId}));
		return res;

	}

	private ModelDocumentoScaricabileExt createDocumentoScaricabileExtResponseROL(String codiceAzione) {
		
		ModelDocumentoScaricabileExt res = new ModelDocumentoScaricabileExt();			
		res.setServizioAzione(MessageFormat.format(serviceROLUrl, new Object[] {taxCode}));		
		return res;

	}

}
