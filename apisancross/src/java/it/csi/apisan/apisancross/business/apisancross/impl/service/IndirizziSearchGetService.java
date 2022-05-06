/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancross.business.apisancross.impl.base.CrossRESTBaseService;
import it.csi.apisan.apisancross.business.apisancross.service.LoccsiTopoServiceClient;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class IndirizziSearchGetService extends CrossRESTBaseService {
	
	@Autowired
	LoccsiTopoServiceClient client;
	String indirizzo;
	Integer offset;
	Integer limit;
	
	public IndirizziSearchGetService(String indirizzo, Integer offset, Integer limit, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.indirizzo = indirizzo;
		
		this.offset = offset == null? 0 : offset ;
		this.limit = limit==null? 20 : limit;
		
	}


	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(indirizzo, "Query param non valorizzato");
		
		String ret = client.getIndirizzi(indirizzo, limit, offset);
		
		return Response.ok(ret).type(MediaType.APPLICATION_JSON).build();
	}

}
