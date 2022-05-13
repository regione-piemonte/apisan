/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.impl;

import it.csi.apisan.apisanpresc.business.apisanpresc.ServizioAttivoApi;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.common.ServiceExecutor;
import it.csi.apisan.apisanpresc.business.apisanpresc.service.ServizioAttivoGetService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ServizioAttivoApiServiceImpl implements ServizioAttivoApi {

	@Override
	public Response servizioAttivoGet(String xRequestID, String xCodiceServizio, String xForwardedFor, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest request) {
		
		return ServiceExecutor.execute(ServizioAttivoGetService.class, xRequestID, xCodiceServizio,  securityContext, httpHeaders, request);
	}

}
