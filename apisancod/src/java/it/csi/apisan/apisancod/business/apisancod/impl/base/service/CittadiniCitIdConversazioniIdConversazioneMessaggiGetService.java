/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.impl.base.service;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancod.business.apisancod.impl.base.CodCitPaginazioneRESTBaseService;
import it.csi.apisan.apisancod.exception.ErroreBuilder;
import it.csi.apisan.apisancod.util.ApisanCodUrl;
import it.csi.apisan.apisancod.util.ConstantsCod;
import it.csi.apisan.apisancod.util.rest.ResponseRest;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdConversazioniIdConversazioneMessaggiGetService extends CodCitPaginazioneRESTBaseService {
	
	private String citId; 
	private String idConversazione;
	private Integer limit; 
	private Integer offset;
	
	public CittadiniCitIdConversazioniIdConversazioneMessaggiGetService(String citId, String idConversazione,
			Integer limit, Integer offset, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		
		this.citId = citId; 
		this.idConversazione = idConversazione;
		this.limit = limit; 
		this.offset = offset;		
	}

	@Override
	protected Response execute() {
		checkNotBlank(shibIdentitaCodiceFiscale, "Impostare identità");
		checkNotBlank(xCodiceServizio, "Impostare Codice servizio");
		checkNotBlank(xForwardedFor, "Impostare X-Forwarded-For");
		checkNotBlank(citId, "Impostare il codice fiscale");
		checkNotBlank(idConversazione, "Impostare id conversazione");
		checkNotNull(limit, "Impostare limit");
		checkNotNull(offset, "Impostare offset");
		
		StringBuffer url = new StringBuffer( codcitbaseurl + ApisanCodUrl.LISTA_MESSAGGI.getUrlClient(citId, idConversazione));
		url.append(httpRequest.getQueryString());
		try {
			ResponseRest resp = service.eseguiGet(this.httpHeaders, url.toString(), true, Arrays.asList(ConstantsCod.X_TOTAL_ELEMENTS));
			setResponseRest(resp);
			return Response.status(resp.getStatusCode()).entity(resp.getJson()).type(MediaType.APPLICATION_JSON).build();
		} catch (Exception e) {
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).code("Errore in chiamata").exception();
		}		
	}

}
