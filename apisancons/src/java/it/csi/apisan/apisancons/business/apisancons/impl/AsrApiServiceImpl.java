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

import it.csi.apisan.apisancons.business.apisancons.AsrApi;
import it.csi.apisan.apisancons.business.apisancons.impl.base.ServiceExecutor;
import it.csi.apisan.apisancons.business.apisancons.impl.base.service.AsrGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AsrApiServiceImpl implements AsrApi {
      public Response asrGet(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestId,String xForwardedFor,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return ServiceExecutor.execute(AsrGetService.class, securityContext,  httpHeaders);
  }
}
