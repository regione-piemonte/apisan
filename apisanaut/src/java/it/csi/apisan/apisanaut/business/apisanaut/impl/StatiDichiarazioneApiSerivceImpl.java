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

import it.csi.apisan.apisanaut.business.apisanaut.StatiDichiarazioneApi;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.ServiceExecutor;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.StatiDichiarazioneGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class StatiDichiarazioneApiSerivceImpl implements StatiDichiarazioneApi {

	@Override
	public Response statiDichiarazioneGet(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(StatiDichiarazioneGetService.class, filter, securityContext, httpHeaders);
	}



}
