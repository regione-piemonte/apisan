/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.ServizioAttivoApi;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.ServiceExecutor;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.ServizioAttivoGet;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)

public class ServizioAttivoApiImpl implements ServizioAttivoApi {

	@Override
	public Response servizioAttivo(
			
			String xRequestId,
			String xForwardedFor,
			String xCodiceServizio,
			SecurityContext securityContext,
			HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(ServizioAttivoGet.class, securityContext, httpHeaders,  httpRequest);
	}
		
}
