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

import it.csi.apisan.apisancons.business.apisancons.CittadinoApi;
import it.csi.apisan.apisancons.business.apisancons.impl.base.ServiceExecutor;
import it.csi.apisan.apisancons.business.apisancons.impl.base.service.CittadinoCfConsensiGetService;
import it.csi.apisan.apisancons.business.apisancons.impl.base.service.CittadinoCfConsensiIdInformativaAslIdAslGetService;
import it.csi.apisan.apisancons.business.apisancons.impl.base.service.CittadinoCfConsensiIdInformativaAslIdAslPutService;
import it.csi.apisan.apisancons.business.apisancons.impl.base.service.CittadinoCfConsensiInformativeGetService;
import it.csi.apisan.apisancons.business.apisancons.impl.base.service.CittadinoCfConsensiPost;
import it.csi.apisan.apisancons.business.apisancons.impl.base.service.InformativeInformativaPdfGet;
import it.csi.apisan.apisancons.dto.apisancons.Consenso;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadinoApiServiceImpl implements CittadinoApi {
    /*  public Response cittadinoCfConsensiGet(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestId,String cf,String xForwardedFor,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
    	  return ServiceExecutor.execute(CittadinoCfConsensiGetService.class,  cf,  securityContext,  httpHeaders);
  }*/
      public Response cittadinoCfConsensiPost(String cf,Consenso cosenso,SecurityContext securityContext, HttpHeaders httpHeaders ) {
      // do some magic!
      return ServiceExecutor.execute(CittadinoCfConsensiPost.class, cf,cosenso,securityContext, httpHeaders);
  }
      
   @Override
  	public Response cittadinoCfConsensiIdInformativaAslIdAslPut(String shibIdentitaCodiceFiscale,
  			String xCodiceServizio, String xRequestId, String cf, String idInformativa, String idAsl,
  			String xForwardedFor, Consenso consenso, SecurityContext securityContext, HttpHeaders httpHeaders) {
  		// TODO Auto-generated method stub
  		return ServiceExecutor.execute(CittadinoCfConsensiIdInformativaAslIdAslPutService.class, cf, idInformativa, idAsl, consenso, securityContext, httpHeaders);
  	}
   
	@Override
	public Response cittadinoCfConsensiGet(String shibIdentitaCodiceFiscale, String xCodiceServizio, String xRequestId,
			String cf, String xForwardedFor, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadinoCfConsensiGetService.class,  cf, filter, securityContext,  httpHeaders);
	}
	@Override
	public Response cittadinoCfConsensiInformativeGet(String shibIdentitaCodiceFiscale, String xCodiceServizio,
			String xRequestId, String cf, String xForwardedFor, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadinoCfConsensiInformativeGetService.class, cf, securityContext, httpHeaders );
	}
	@Override
	public Response cittadinoCfConsensiIdInformativaAslIdAslGet(String shibIdentitaCodiceFiscale,
			String xCodiceServizio, String xRequestId, String cf, String idInformativa, String idAsl,
			String xForwardedFor, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadinoCfConsensiIdInformativaAslIdAslGetService.class, cf, idInformativa, idAsl, securityContext, httpHeaders);
	}
	

	/*@Override
	public Response cittadinoCfConsensiUuidConsensoGet(String shibIdentitaCodiceFiscale, String xCodiceServizio,
			String xRequestId, String cf, UUID uuidConsenso, String xForwardedFor, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadinoCfConsensiUuidConsensoGetService.class, cf,  uuidConsenso,   securityContext,
				httpHeaders);
	}*/

}
