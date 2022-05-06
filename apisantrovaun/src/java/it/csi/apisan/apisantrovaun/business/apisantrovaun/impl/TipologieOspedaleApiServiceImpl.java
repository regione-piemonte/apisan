/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisantrovaun.business.apisantrovaun.TipologieOspedaleApi;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class TipologieOspedaleApiServiceImpl implements TipologieOspedaleApi {
      public Response tipologieOspedaleGet(String xRequestId,String xForwardedFor,String xCodiceServizio,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return Response.ok().build();
  }
}
