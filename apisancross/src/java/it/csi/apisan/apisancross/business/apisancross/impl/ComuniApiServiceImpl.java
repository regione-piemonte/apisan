/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.business.apisancross.ComuniApi;
import it.csi.apisan.apisancross.business.apisancross.impl.base.ServiceExecutor;
import it.csi.apisan.apisancross.business.apisancross.impl.service.ComuniGetService;

@Component
public class ComuniApiServiceImpl implements ComuniApi {
		
	@Override
	public Response comuniGet(String xCodiceFiscale, String xRequestID, String xCodiceServizio, Integer offset,
			Integer limit, String filter, String descrizione, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(ComuniGetService.class, offset, limit, filter,  descrizione, securityContext, httpHeaders);
	}
	
	
	


}
