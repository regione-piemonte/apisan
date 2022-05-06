/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen.impl.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanesen.business.apisanesen.impl.base.EsenRESTBaseService;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CodiciEsenzioneGetService extends EsenRESTBaseService {
	@Autowired
	EsenServiceClient client;
	public CodiciEsenzioneGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		String ret = client.getServiceWithoutParam(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, "codici-esenzione");
		return Response.ok(ret).type(MediaType.APPLICATION_JSON).build();
	}

}
