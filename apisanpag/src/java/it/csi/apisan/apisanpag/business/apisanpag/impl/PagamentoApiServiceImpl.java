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

import it.csi.apisan.apisanpag.business.apisanpag.PagamentoApi;
import it.csi.apisan.apisanpag.business.apisanpag.impl.base.ServiceExecutor;
import it.csi.apisan.apisanpag.business.apisanpag.impl.service.PagamentoIdTransazioneRicevutaPostService;
import it.csi.apisan.apisanpag.business.apisanpag.impl.service.PagamentoPostService;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitarioBody;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class PagamentoApiServiceImpl implements PagamentoApi {
	

	@Override
	public Response pagamentoIdTransazioneRicevutaPost(String xRequestID, String xCodiceServizio, String xForwardedFor, String idTransazione,
			 SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(PagamentoIdTransazioneRicevutaPostService.class, xRequestID, xCodiceServizio, xForwardedFor, idTransazione,
				securityContext, httpHeaders);
	}

	@Override
	public Response pagamentoPost(String xRequestID, String xCodiceServizio, String xForwardedFor,
			PagamentoSanitarioBody elencoPraticheEVersante,  SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(PagamentoPostService.class, xRequestID, xCodiceServizio, xForwardedFor,
				elencoPraticheEVersante, securityContext, httpHeaders);
	}
}
