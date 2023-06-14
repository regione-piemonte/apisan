/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.impl.base.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;

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
public class CittadiniCitIdConversazioniGetService extends CodCitPaginazioneRESTBaseService {
	private String citId; 
	private String solaLettura; 
	private Integer limit;
	private Integer offset; 
	private String cfMedico; 
	private String argomento; 
	private String idConversazione; 
	
	public CittadiniCitIdConversazioniGetService(String citId, String solaLettura, Integer limit,
			Integer offset, String cfMedico, String argomento, String idConversazione, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		
		this.citId = citId; 
		this.solaLettura = solaLettura; 
		this.limit = limit;
		this.offset = offset; 
		this.cfMedico = cfMedico; 
		this.argomento = argomento; 
		this.idConversazione = idConversazione; 
	}

	@Override
	protected Response execute() {
		checkNotBlank(shibIdentitaCodiceFiscale, "Impostare identità");
		checkNotBlank(xCodiceServizio, "Impostare Codice servizio");
		checkNotBlank(xForwardedFor, "Impostare X-Forwarded-For");
		checkNotBlank(citId, "Impostare il codice fiscale");
		checkNotBlank(solaLettura, "Impostare sola lettura");
		checkNotNull(limit, "Impostare limit");
		checkNotNull(offset, "Impostare offset");
		
		StringBuffer url = new StringBuffer( codcitbaseurl + ApisanCodUrl.LISTA_CONVERSAZIONI.getUrlClient(citId));
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
