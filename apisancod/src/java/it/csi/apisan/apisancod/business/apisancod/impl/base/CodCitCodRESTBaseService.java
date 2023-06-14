/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.impl.base;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestClientException;

import it.csi.apisan.apisancod.business.apisancod.impl.base.service.rest.RestServiceClient;

public abstract class CodCitCodRESTBaseService extends CodRESTBaseService {
	
	@Value("${codcitbaseurl}")
	protected String codcitbaseurl;
	@Autowired
	protected RestServiceClient service;
	
	public CodCitCodRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		
	}

	protected String getStringFromBody(Object body) {
		String jsonFromBody = null;
		try {
			if(body != null) {
				ObjectMapper mapper = new ObjectMapper();
				jsonFromBody = mapper.writeValueAsString(body);
				log.debug("getStringFromBody", "jsonFromBody: %s", jsonFromBody);
			}
		}catch(Exception e) {
			String msg =  String.format("Error in body class %s ", body!= null?body.getClass():null);
			log.error("getStringFromBody", msg, e);
			throw new RestClientException(msg, e);
		}
		return jsonFromBody;
	}

}
