/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.RichiesteApi;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.RichiestePost;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.ServiceExecutor;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadRichiestaNuova;


@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)

public class RichiesteApiImpl implements RichiesteApi {

	@Override
	public Response richiestePost(String shibIdentitaCodiceFiscale, String shibIdentitaEmail, String xRequestId, String xForwardedFor, String xCodiceServizio,
			PayloadRichiestaNuova payloadRichiestaNuova,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {

		return ServiceExecutor.execute(RichiestePost.class, payloadRichiestaNuova, securityContext, httpHeaders,  httpRequest);
	}

}
