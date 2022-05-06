/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.impl;

import it.csi.apisan.apisanprof.business.apisanprof.*;
import it.csi.apisan.apisanprof.business.apisanprof.impl.base.ServiceExecutor;
import it.csi.apisan.apisanprof.business.apisanprof.impl.base.service.CittadiniCfMedicoStudiMediciGet;
import it.csi.apisan.apisanprof.business.apisanprof.impl.base.service.CittadiniCfProfiloGetService;
import it.csi.apisan.apisanprof.business.apisanprof.impl.base.service.CittadiniCfVerificaTeamGetService;
import it.csi.apisan.apisanprof.dto.apisanprof.*;



import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiServiceImpl implements CittadiniApi {
      public Response cittadiniCfProfiloGet(String shibIdentitaCodiceFiscale,String xRequestID,String xCodiceServizio,String cf,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      System.out.println("************************************ CittadiniApiServiceImpl **************************");
      return ServiceExecutor.execute(CittadiniCfProfiloGetService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, cf, securityContext, httpHeaders);
  }

	@Override
	public Response cittadiniCfMedicoStudiMediciGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCfMedicoStudiMediciGet.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, cf, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCfVerificaTeamGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, String team, String servizio, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCfVerificaTeamGetService.class, cf, team, servizio, securityContext, httpHeaders);
	}


     
}
