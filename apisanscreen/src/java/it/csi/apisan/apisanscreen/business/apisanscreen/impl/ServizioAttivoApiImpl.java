/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanscreen.business.apisanscreen.ServizioAttivoApi;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ServiceExecutor;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.ServizioAttivoGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ServizioAttivoApiImpl implements ServizioAttivoApi {



	@Override
	public Response servizioAttivoGet(String xRequestId, String xForwardedFor, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(ServizioAttivoGetService.class, securityContext, httpHeaders);
	}

}
