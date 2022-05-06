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

import it.csi.apisan.apisanpag.business.apisanpag.MandatoPagamentoApi;
import it.csi.apisan.apisanpag.business.apisanpag.impl.base.ServiceExecutor;
import it.csi.apisan.apisanpag.business.apisanpag.impl.service.MandatoPagamentoIdRicevutaGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class MandatoPagamentoApiServiceImpl implements MandatoPagamentoApi {
	
	
	@Override
	public Response mandatoPagamentoIdRicevutaGet(String xRequestID, String xCodiceServizio, String  xForwardedFor,String idRicevuta,
			 SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(MandatoPagamentoIdRicevutaGetService.class, idRicevuta, securityContext, httpHeaders);
	}
}
