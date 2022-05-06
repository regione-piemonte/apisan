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


import it.csi.apisan.apisanaut.business.apisanaut.TipiDelegheApi;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.ServiceExecutor;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.TipiDelegheGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class TipiDelegheApiServiceImpl implements TipiDelegheApi {

	@Override
	public Response tipiDelegheGet(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(TipiDelegheGetService.class, filter, securityContext, httpHeaders);
	}


	

}
