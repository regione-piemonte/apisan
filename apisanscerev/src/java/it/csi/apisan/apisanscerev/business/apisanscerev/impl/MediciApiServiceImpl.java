/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanscerev.business.apisanscerev.MediciApi;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ServiceExecutor;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.MediciMedicoIdAuraAssociazioniGetService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.MediciMedicoIdGetService;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.MediciSearchGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class MediciApiServiceImpl implements MediciApi {
     
      public Response mediciMedicoIdGet(String xRequestId,String xForwardedFor,String xCodiceServizio,String medicoId,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      
      return ServiceExecutor.execute(MediciMedicoIdGetService.class,  medicoId, securityContext,  httpHeaders);
  }
	@Override
	public Response mediciSearchGet(String xRequestId, String xForwardedFor, String xCodiceServizio, String s,
			Integer limit, Integer offset, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(MediciSearchGetService.class,  s,limit, offset, securityContext, httpHeaders);
	}
	@Override
	public Response mediciMedicoIdAuraAssociazioniGet(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String medicoIdAura, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(MediciMedicoIdAuraAssociazioniGetService.class, medicoIdAura, securityContext, httpHeaders);
	}
     
}
