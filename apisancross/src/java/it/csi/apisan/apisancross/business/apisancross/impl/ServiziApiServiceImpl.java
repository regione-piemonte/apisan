/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.business.apisancross.ServiziApi;
import it.csi.apisan.apisancross.business.apisancross.impl.base.ServiceExecutor;
import it.csi.apisan.apisancross.business.apisancross.impl.service.ServiziGetService;

@Component
public class ServiziApiServiceImpl implements ServiziApi {
	
	@Override
	public Response serviziGet(String xCodiceFiscale, String xRequestID, String xCodiceServizio, String filter,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(ServiziGetService.class, filter, securityContext, httpHeaders);
	}
	
	
}
