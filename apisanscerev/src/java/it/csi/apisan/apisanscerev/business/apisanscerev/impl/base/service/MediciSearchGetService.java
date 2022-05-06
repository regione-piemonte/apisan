/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.LoccsiScerevRESTBaseService;
import it.csi.apisan.apisanscerev.util.Page;
import it.csi.apisan.apisanscerev.util.rest.ResponseService;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MediciSearchGetService extends LoccsiScerevRESTBaseService {
	String search;
	Integer offset;
	Integer limit;
	@Autowired
	LoccsiServiceClient service;
	
	public MediciSearchGetService(String search, Integer offset, Integer limit, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.search = search;
		this.offset = offset == null?Page.DEFAULT_OFFSET.getValue() : offset ;
		this.limit = limit==null? Page.DEFAULT_LIMIT.getValue() : limit;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		
		ResponseService<List<String>> respone = service.getNomiMedici(search, limit, offset);
		setHeadersResponse(respone.getHeaders());
		List<String> listaNomi = respone.getBody();
		setPageSize(listaNomi.size());
		return Response.ok().entity(respone.getBody()).build();
	}

}
