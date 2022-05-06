/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.stereotype.Component;

import it.csi.apisan.apisancross.business.apisancross.ProvinceApi;

@Component
public class ProvinceApiServiceImpl implements ProvinceApi {
	

	@Override
	public Response provinceGet(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			Integer offset, Integer limit, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return Response.status(501).type(MediaType.TEXT_HTML).entity("NON RICHIAMARE QUESTO SERVIZIO! (Per ora)").build();
	}
	
	
}
