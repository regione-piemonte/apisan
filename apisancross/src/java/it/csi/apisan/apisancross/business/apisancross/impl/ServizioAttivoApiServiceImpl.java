/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.business.apisancross.ServizioAttivoApi;
import it.csi.apisan.apisancross.business.apisancross.impl.base.ServiceExecutor;
import it.csi.apisan.apisancross.business.apisancross.impl.service.ServizioAttivoGetService;

@Component
public class ServizioAttivoApiServiceImpl implements ServizioAttivoApi {

	@Override
	public Response servizioAttivoGet(String xRequestID, String xCodiceServizio, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute( ServizioAttivoGetService.class,  xRequestID,  xCodiceServizio,  securityContext, httpHeaders);
	}

}
