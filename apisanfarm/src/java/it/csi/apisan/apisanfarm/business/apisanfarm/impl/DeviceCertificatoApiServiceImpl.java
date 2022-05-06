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

import it.csi.apisan.apisanfarm.business.apisanfarm.DeviceCertificatoApi;
import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.ServiceExecutor;
import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service.DeviceCertificatoPostService;
import it.csi.apisan.apisanfarm.dto.apisanfarm.PayloadDeviceCertificatoOtp;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class DeviceCertificatoApiServiceImpl implements DeviceCertificatoApi{

	@Override
	public Response deviceCertificatoPost(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String codiceVerticaleDelega, PayloadDeviceCertificatoOtp payloadDeviceCertificatoOtp,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(DeviceCertificatoPostService.class, codiceVerticaleDelega, payloadDeviceCertificatoOtp,  securityContext,
				 httpHeaders,  httpRequest);
	}



}
