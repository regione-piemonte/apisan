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

import it.csi.apisan.apisanesen.business.apisanesen.StatiEsenzioneApi;
import it.csi.apisan.apisanesen.business.apisanesen.impl.base.ServiceExecutor;
import it.csi.apisan.apisanesen.business.apisanesen.impl.service.StatiEsenzioneGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class StatiEsenzioneApiServiceImpl implements StatiEsenzioneApi {
      public Response statiEsenzioneGet(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestID,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return ServiceExecutor.execute(StatiEsenzioneGetService.class, securityContext, httpHeaders);
  }
}
