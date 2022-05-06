/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanpag.business.apisanpag.PagamentoSpontaneoApi;
import it.csi.apisan.apisanpag.business.apisanpag.impl.base.ServiceExecutor;
import it.csi.apisan.apisanpag.business.apisanpag.impl.service.PagamentoSpontaneoPostService;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSpontaneoBody;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class PagamentoSpontaneoApiServiceImpl implements PagamentoSpontaneoApi {

	@Override
	public Response pagamentoSpontaneoPost(String xRequestID, String xCodiceServizio, String xForwardedFor,
			PagamentoSpontaneoBody pagamentoSpontaneo,  SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(PagamentoSpontaneoPostService.class, xRequestID, xCodiceServizio, xForwardedFor,
				pagamentoSpontaneo, securityContext, httpHeaders);
	}
}
