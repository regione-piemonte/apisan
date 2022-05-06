/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanffe.business.apisanffe.ServizioAttivoApi;
import it.csi.apisan.apisanffe.business.apisanffe.impl.base.ServiceExecutor;
import it.csi.apisan.apisanffe.business.apisanffe.impl.base.service.ServizioAttivoGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ServizioAttivoApiServiceImpl implements ServizioAttivoApi {
      public Response servizioAttivoGet(String xRequestId,String xForwardedFor,String xCodiceServizio,SecurityContext securityContext, HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest ) {
      // do some magic!
      return ServiceExecutor.execute(ServizioAttivoGetService.class, securityContext, httpHeaders , httpRequest);
  }
}
