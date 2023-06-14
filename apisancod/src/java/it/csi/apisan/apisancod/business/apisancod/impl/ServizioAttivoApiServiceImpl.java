/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisancod.business.apisancod.ServizioAttivoApi;
import it.csi.apisan.apisancod.business.apisancod.impl.base.ServiceExecutor;
import it.csi.apisan.apisancod.business.apisancod.impl.base.service.ServizioAttivoGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ServizioAttivoApiServiceImpl implements ServizioAttivoApi {

	@Override
	public Response servizioAttivoGet(SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {

		return ServiceExecutor.execute(ServizioAttivoGetService.class, securityContext, httpHeaders , httpRequest);
	}
}
