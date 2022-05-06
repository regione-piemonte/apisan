/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ScerevDelegheRESTBaseService;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.PayloadRevocaMedicoPayloadRevocaMedicoMapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadRevocaMedico;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdRevocaMedicoPostService extends ScerevDelegheRESTBaseService {
	
	String citId;
	@Autowired
	ScerevServiceClient scerevServiceClient;
	PayloadRevocaMedico payloadRevocaMedico;
	
	public CittadiniCitIdRevocaMedicoPostService(String citId, PayloadRevocaMedico payloadRevocaMedico, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.payloadRevocaMedico = payloadRevocaMedico;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(citId, "Cit id non valorizzato");
		checkUtenteAutorizzatoOrDelegato(citId);
		it.csi.apisan.apisanscerev.dto.scerev.PayloadRevocaMedico payload = new PayloadRevocaMedicoPayloadRevocaMedicoMapper().to(payloadRevocaMedico);
		
		String resp = scerevServiceClient.postRevocaMedico(httpHeaders, citId, payload);
		
		return Response.ok().entity(resp).build();
	}

}
