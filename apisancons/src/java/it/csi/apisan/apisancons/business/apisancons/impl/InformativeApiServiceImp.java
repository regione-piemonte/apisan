/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisancons.business.apisancons.InformativeApi;
import it.csi.apisan.apisancons.business.apisancons.impl.base.ServiceExecutor;
import it.csi.apisan.apisancons.business.apisancons.impl.base.service.InformativeInformativaPdfGet;
import it.csi.apisan.apisancons.business.apisancons.impl.base.service.InformativeGetService;
import it.csi.apisan.apisancons.business.apisancons.impl.base.service.InformativeInformativaHtmlGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class InformativeApiServiceImp implements InformativeApi {

	@Override
	public Response informativeGet(String shibIdentitaCodiceFiscale, String xCodiceServizio, String xRequestId,
			String xForwardedFor, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(InformativeGetService.class,  securityContext,  httpHeaders) ;
	}

	@Override
	public Response informativeInformativaPdfGet(String shibIdentitaCodiceFiscale, String xCodiceServizio,
			String xRequestId, String xForwardedFor, String filter, String xContentDisposition,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(InformativeInformativaPdfGet.class, filter, securityContext,  httpHeaders);
	}

	@Override
	public Response informativeInformativaHtmlGet(String shibIdentitaCodiceFiscale, String xCodiceServizio,
			String xRequestId, String xForwardedFor, String filter, String xContentDisposition,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(InformativeInformativaHtmlGetService.class, filter, securityContext,  httpHeaders);
	}

	
	
	
	/*
	 *      public Response cittadinoCfConsensoPdfGet(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestId,String cf,String xForwardedFor,String filter,String xContentDisposition,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return ServiceExecutor.execute(CittadinoCfConsensoPdfGet.class, cf, filter, securityContext, httpHeaders);
  }
	 * */
}
