/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.business.apisancross.IndirizziApi;
import it.csi.apisan.apisancross.business.apisancross.impl.base.ServiceExecutor;
import it.csi.apisan.apisancross.business.apisancross.impl.service.IndirizziSearchGetService;

@Component
public class IndirizziApiServiceimpl implements IndirizziApi {


	@Override
	public Response indirizziSearchGet(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String indirizzo, Integer offset, Integer limit, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(IndirizziSearchGetService.class, indirizzo, offset, limit, securityContext, httpHeaders);
	}

}
