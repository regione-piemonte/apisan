/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia.impl;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanceliachia.business.apisanceliachia.CittadiniApi;
import it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base.ServiceExecutor;
import it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base.service.CittadiniCitIdCedoliniCorrenteGetService;
import it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base.service.CittadiniCitIdErogazioniGetService;
import it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base.service.CittadiniCitIdPinGetService;
import it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base.service.CittadiniCitIdPinPostService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiServiceImpl implements CittadiniApi {
      public Response cittadiniCitIdCedoliniCorrenteGet(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest  ) {
      
      return ServiceExecutor.execute(CittadiniCitIdCedoliniCorrenteGetService.class, citId,securityContext, httpHeaders, httpRequest);
  }
      public Response cittadiniCitIdCodiceQrGet(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest  ) {
      // do some magic!
      return Response.ok().build();
  }
      public Response cittadiniCitIdErogazioniGet(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,String da,String a,SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest  ) {
      
      return ServiceExecutor.execute(CittadiniCitIdErogazioniGetService.class, citId, da, a,securityContext, httpHeaders, httpRequest );
  }
      public Response cittadiniCitIdPinGet(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest  ) {
      
      return ServiceExecutor.execute(CittadiniCitIdPinGetService.class, citId,securityContext, httpHeaders, httpRequest);
  }
      public Response cittadiniCitIdPinPost(String shibIdentitaCodiceFiscale,String xRequestId,String xForwardedFor,String xCodiceServizio,String citId,SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest  ) {
      return ServiceExecutor.execute(CittadiniCitIdPinPostService.class, citId,securityContext, httpHeaders, httpRequest) ;
  }
}
