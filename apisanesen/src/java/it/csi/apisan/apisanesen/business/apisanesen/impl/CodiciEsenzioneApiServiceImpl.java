/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanesen.business.apisanesen.CodiciEsenzioneApi;
import it.csi.apisan.apisanesen.business.apisanesen.impl.base.ServiceExecutor;
import it.csi.apisan.apisanesen.business.apisanesen.impl.service.CodiciEsenzioneGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CodiciEsenzioneApiServiceImpl implements CodiciEsenzioneApi {
      public Response codiciEsenzioneGet(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestID,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return ServiceExecutor.execute(CodiciEsenzioneGetService.class, securityContext, httpHeaders);
  }
}
