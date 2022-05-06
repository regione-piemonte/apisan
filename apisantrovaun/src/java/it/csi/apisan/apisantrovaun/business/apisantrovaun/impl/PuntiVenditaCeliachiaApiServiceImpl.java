/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.impl;

import java.math.BigDecimal;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisantrovaun.business.apisantrovaun.PuntiVenditaCeliachiaApi;
import it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.ServiceExecutor;
import it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.service.PuntiVenditaCeliachiaGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class PuntiVenditaCeliachiaApiServiceImpl implements PuntiVenditaCeliachiaApi {



	@Override
	public Response puntiVenditaCeliachiaGet(String xRequestId, String xForwardedFor, String xCodiceServizio, String s,
			Integer limit, Integer offset, String latitudine, String longitudine, BigDecimal distanza, String tipologia,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(PuntiVenditaCeliachiaGetService.class, s,
				limit, offset, latitudine, longitudine, distanza, tipologia, securityContext, httpHeaders);
	}

}
