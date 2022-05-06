/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ScerevDelegheRESTBaseService;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelControlloAllegatiModelControlloAllegatiMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.PayloadControlloAllegatiPayload4Mapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadControlloAllegati;
import it.csi.apisan.apisanscerev.dto.scerev.ModelControlloAllegati;
import it.csi.apisan.apisanscerev.dto.scerev.Payload4;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdControlloAllegatiPostService extends ScerevDelegheRESTBaseService {
	String citId;
	PayloadControlloAllegati payloadControlloAllegati;
	@Autowired
	ScerevServiceClient scerevService;	
	
	public CittadiniCitIdControlloAllegatiPostService(String citId, PayloadControlloAllegati payloadControlloAllegati,SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.payloadControlloAllegati = payloadControlloAllegati;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotNull(payloadControlloAllegati, "Payload non valorizzato");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		Payload4 payload = new PayloadControlloAllegatiPayload4Mapper().to(payloadControlloAllegati);
		
		ModelControlloAllegati risposta = scerevService.postControlloAllegati(citId, payload, httpHeaders);
		
		it.csi.apisan.apisanscerev.dto.apisanscerev.ModelControlloAllegati resp = new ModelControlloAllegatiModelControlloAllegatiMapper().from(risposta);
		
		return Response.status(Status.CREATED).entity(resp).build();
	}

}
