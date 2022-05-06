/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanaut.business.apisanaut.ServizioAttivoApi;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.ServiceExecutor;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.ServizioAttivoGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ServizioAttivoApiServiceImpl implements ServizioAttivoApi {

	@Override
	public Response servizioAttivoGet(String xRequestID, String xCodiceServizio, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(ServizioAttivoGetService.class,  xRequestID,  xCodiceServizio,  securityContext,httpHeaders);
	}



}
