/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanfarm.business.apisanfarm.FarmaciaOccasionaleApi;
import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.ServiceExecutor;
import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service.FarmaciaOccasionaleAutorizzazionePostService;
import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service.FarmaciaOccasionaleGetService;
import it.csi.apisan.apisanfarm.dto.apisanfarm.PayloadFarmaciaOccasionaleAutorizzazione;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class FarmaciaOccasionaleApiServiceImpl implements FarmaciaOccasionaleApi {

	@Override
	public Response farmaciaOccasionaleAutorizzazionePost(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String codiceVerticaleDelega,
			PayloadFarmaciaOccasionaleAutorizzazione payloadFarmaciaOccasionaleAutorizzazione,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(FarmaciaOccasionaleAutorizzazionePostService.class, codiceVerticaleDelega,
				payloadFarmaciaOccasionaleAutorizzazione,
				securityContext, httpHeaders, httpRequest);
	}

	@Override
	public Response farmaciaOccasionaleGet(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String deviceUuid, String codiceVerticaleDelega, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(FarmaciaOccasionaleGetService.class, deviceUuid,  codiceVerticaleDelega,  securityContext,  httpHeaders,
				 httpRequest);
	}




}
