/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.impl.base.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancod.business.apisancod.impl.base.CodCitCodRESTBaseService;
import it.csi.apisan.apisancod.dto.apisancod.PayloadMessaggio;
import it.csi.apisan.apisancod.exception.ErroreBuilder;
import it.csi.apisan.apisancod.util.ApisanCodStatus;
import it.csi.apisan.apisancod.util.ApisanCodUrl;
import it.csi.apisan.apisancod.util.rest.ResponseRest;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdConversazioniIdConversazioneMessaggiPostService extends CodCitCodRESTBaseService {
	private String citId;
	private String idConversazione;
	private PayloadMessaggio payloadMessaggio;
	
	
	public CittadiniCitIdConversazioniIdConversazioneMessaggiPostService(String citId, String idConversazione,
			PayloadMessaggio payloadMessaggio, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.idConversazione = idConversazione;
		this.payloadMessaggio = payloadMessaggio;
	}

	@Override
	protected Response execute() {
		checkNotBlank(shibIdentitaCodiceFiscale, "Impostare identità");
		checkNotBlank(xCodiceServizio, "Impostare Codice servizio");
		checkNotBlank(xForwardedFor, "Impostare X-Forwarded-For");
		checkNotBlank(citId, "Impostare il codice fiscale");
		checkNotBlank(idConversazione, "Impostare l'id conversazione");
		checkNotNull(payloadMessaggio, "Impostare il payload");
		
	
		String url = codcitbaseurl + ApisanCodUrl.NUOVO_MESSAGGIO.getUrlClient(citId, idConversazione);
		String jsonBody = getStringFromBody(payloadMessaggio);
		try {
			ResponseRest resp = service.eseguiPost(this.httpHeaders, url, jsonBody, true);
			return Response.status(resp.getStatusCode()).entity(resp.getJson()).type(MediaType.APPLICATION_JSON).build();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).code("Errore in chiamata").exception();
		}		
		
	}

}
