/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.BeanDefinition;

import it.csi.apisan.apisanesen.business.apisanesen.ServizioAttivoApi;
import it.csi.apisan.apisanesen.business.apisanesen.impl.base.ServiceExecutor;
import it.csi.apisan.apisanesen.business.apisanesen.impl.service.ServizioAttivoGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ServizioAttivoApiServiceImpl implements ServizioAttivoApi {

	@Override
	public Response servizioAttivoGet(String xRequestID, String xCodiceServizio, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(ServizioAttivoGetService.class,  securityContext,
			 httpHeaders);
	}

}
