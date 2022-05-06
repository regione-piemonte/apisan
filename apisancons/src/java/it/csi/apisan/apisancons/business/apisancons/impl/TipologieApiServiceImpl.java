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

import it.csi.apisan.apisancons.business.apisancons.TipologieApi;
import it.csi.apisan.apisancons.business.apisancons.impl.base.ServiceExecutor;
import it.csi.apisan.apisancons.business.apisancons.impl.base.service.TipologieGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class TipologieApiServiceImpl implements TipologieApi {
      public Response tipologieGet(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestId,String xForwardedFor,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return ServiceExecutor.execute(TipologieGetService.class, securityContext, httpHeaders);
  }
}
