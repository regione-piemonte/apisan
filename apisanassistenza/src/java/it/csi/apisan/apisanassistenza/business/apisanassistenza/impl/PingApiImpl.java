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

import it.csi.apisan.apisanassistenza.business.apisanassistenza.PingApi;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.PingGet;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.ServiceExecutor;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)

public class PingApiImpl implements PingApi {
	
	@Override
	public Response ping(
			SecurityContext securityContext,
			HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(PingGet.class, securityContext, httpHeaders,  httpRequest);
	}


}
