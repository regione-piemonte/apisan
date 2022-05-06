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

import it.csi.apisan.apisanscerev.business.apisanscerev.MotivazioniSoggiornoApi;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ServiceExecutor;
import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service.MotivazioniSoggiornoGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class MotivazioniSoggiornoApiServiceImpl implements MotivazioniSoggiornoApi {
      public Response motivazioniSoggiornoGet(String xRequestId,String xForwardedFor,String xCodiceServizio,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return ServiceExecutor.execute(MotivazioniSoggiornoGetService.class,securityContext, httpHeaders);
  }
}
