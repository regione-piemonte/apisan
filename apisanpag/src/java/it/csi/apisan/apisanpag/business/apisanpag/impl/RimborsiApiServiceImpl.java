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

import it.csi.apisan.apisanpag.business.apisanpag.RimborsiApi;
import it.csi.apisan.apisanpag.business.apisanpag.impl.base.ServiceExecutor;
import it.csi.apisan.apisanpag.business.apisanpag.impl.service.RimborsiIdTransazioneStatoErogazionePutService;
import it.csi.apisan.apisanpag.dto.apisanpag.StatoTransazione;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class RimborsiApiServiceImpl implements RimborsiApi {


	@Override
	public Response rimborsiIdTransazioneStatoErogazionePut(String xRequestID, String xCodiceServizio,
			String xForwardedFor, String idTransazione, StatoTransazione statoTransazione,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(RimborsiIdTransazioneStatoErogazionePutService.class, idTransazione, statoTransazione,
				securityContext, httpHeaders);
	}

}
