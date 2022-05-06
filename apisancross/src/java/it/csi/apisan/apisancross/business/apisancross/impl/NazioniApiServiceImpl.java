/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.business.apisancross.NazioniApi;
import it.csi.apisan.apisancross.business.apisancross.impl.base.ServiceExecutor;
import it.csi.apisan.apisancross.business.apisancross.impl.service.NazioniGetService;

@Component
public class NazioniApiServiceImpl implements NazioniApi {
	
	@Override
	public Response nazioniGet(String xCodiceFiscale, String xRequestID, String xCodiceServizio, Integer offset,
			Integer limit, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(NazioniGetService.class, offset, limit, filter, securityContext, httpHeaders);
	}
	
	
	
	
	
}
