/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanfse.business.apisanfse.DecodificheAccessiApi;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.DecodificheAccessiGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.ServiceExecutor;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.DecodificheAccessiCodiceServizioAccessoGetService;


@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class DecodificheAccessiApiServiceImpl implements DecodificheAccessiApi {


	@Override
	public Response decodificheAccessiCodiceServizioAccessoGet(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String codiceServizioAccesso,
			SecurityContext securityContext, HttpHeaders httpHeaders) {

		//return ServiceExecutor.execute(serviceClass, args);
		return ServiceExecutor.execute(DecodificheAccessiCodiceServizioAccessoGetService.class, codiceServizioAccesso,
				securityContext, httpHeaders);
	}

	@Override
	public Response decodificheAccessiGet(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, SecurityContext securityContext, HttpHeaders httpHeaders) {

		return ServiceExecutor.execute(DecodificheAccessiGetService.class, securityContext, httpHeaders);
	}

}
