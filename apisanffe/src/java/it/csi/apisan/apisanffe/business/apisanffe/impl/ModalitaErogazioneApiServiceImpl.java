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

import it.csi.apisan.apisanffe.business.apisanffe.ModalitaErogazioneApi;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ModalitaErogazioneApiServiceImpl implements ModalitaErogazioneApi {
      public Response modalitaErogazioneGet(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,SecurityContext securityContext, HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest ) {
      // do some magic!
      return Response.ok().build();
  }
}
