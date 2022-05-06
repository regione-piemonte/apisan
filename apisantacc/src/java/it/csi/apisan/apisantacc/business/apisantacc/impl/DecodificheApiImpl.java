/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisantacc.business.apisantacc.DecodificheApi;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.ServiceExecutor;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.DecodificheContattoTipiGetService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.DecodificheDescrittoriMisurazioneGetService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.DecodificheIntensitaDoloreGetService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.DecodificheModalitaRilevazioneGetService;
import it.csi.apisan.apisantacc.business.apisantacc.impl.base.service.DecodificheStrutturaTipiGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class DecodificheApiImpl implements DecodificheApi {

	@Override
	public Response decodificheContattoTipiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, SecurityContext securityContext, HttpHeaders httpHeaders) {

		return ServiceExecutor.execute(DecodificheContattoTipiGetService.class, securityContext, httpHeaders);

	}

	@Override
	public Response decodificheIntensitaDoloreGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(DecodificheIntensitaDoloreGetService.class, securityContext, httpHeaders);

	}

	@Override
	public Response decodificheModalitaRilevazioneGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(DecodificheModalitaRilevazioneGetService.class, securityContext, httpHeaders);

	}

	@Override
	public Response decodificheStrutturaTipiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(DecodificheStrutturaTipiGetService.class, securityContext, httpHeaders);
	}

	@Override
	public Response decodificheDescrittoriMisurazioneGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(DecodificheDescrittoriMisurazioneGetService.class, securityContext, httpHeaders);
	}

}
