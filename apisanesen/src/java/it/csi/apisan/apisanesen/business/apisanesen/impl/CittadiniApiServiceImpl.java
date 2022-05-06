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

import it.csi.apisan.apisanesen.business.apisanesen.CittadiniApi;
import it.csi.apisan.apisanesen.business.apisanesen.impl.base.ServiceExecutor;
import it.csi.apisan.apisanesen.business.apisanesen.impl.service.CittadiniCfBeneficiariGetService;
import it.csi.apisan.apisanesen.business.apisanesen.impl.service.CittadiniCfEsenzioniGetService;
import it.csi.apisan.apisanesen.business.apisanesen.impl.service.CittadiniCfEsenzioniIdGetService;
import it.csi.apisan.apisanesen.business.apisanesen.impl.service.CittadiniCfEsenzioniIdRevocaPutService;
import it.csi.apisan.apisanesen.business.apisanesen.impl.service.CittadiniCfEsenzioniPostService;
import it.csi.apisan.apisanesen.business.apisanesen.impl.service.CittadiniCfInfoGetService;
import it.csi.apisan.apisanesen.business.apisanesen.impl.service.CittadiniCfTitolariGetService;
import it.csi.apisan.apisanesen.dto.apisanesen.EsenzionePost;
import it.csi.apisan.apisanesen.dto.apisanesen.Revoca;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiServiceImpl implements CittadiniApi {
	public Response cittadiniCfBeneficiariGet(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestID,String cf,SecurityContext securityContext, HttpHeaders httpHeaders ) {
		// do some magic!
		return ServiceExecutor.execute(CittadiniCfBeneficiariGetService.class, cf, securityContext, httpHeaders);
	}
	public Response cittadiniCfEsenzioniGet(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestID,String cf,String filter,SecurityContext securityContext, HttpHeaders httpHeaders ) {
		// do some magic!
		return  ServiceExecutor.execute(CittadiniCfEsenzioniGetService.class,  shibIdentitaCodiceFiscale, xCodiceServizio, xRequestID, cf, filter,
				securityContext,  httpHeaders);
	}
/*	public Response cittadiniCfEsenzioniIdGet(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestID,String cf,String id,String accept,SecurityContext securityContext, HttpHeaders httpHeaders ) {
		// do some magic!
		return ServiceExecutor.execute(CittadiniCfEsenzioniIdGetService.class, cf, id, accept, securityContext, httpHeaders);
	}
	public Response cittadiniCfEsenzioniIdRevocaPut(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestID,String cf,String id,Revoca revocaBody,SecurityContext securityContext, HttpHeaders httpHeaders ) {
		// do some magic!
		//String cf,String id,Revoca revocaBody, SecurityContext securityContext, HttpHeaders httpHeaders
		return ServiceExecutor.execute(CittadiniCfEsenzioniIdRevocaPutService.class, cf, id, revocaBody, securityContext, httpHeaders);
	}*/
	public Response cittadiniCfEsenzioniPost(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestID,String cf,EsenzionePost esenzione,SecurityContext securityContext, HttpHeaders httpHeaders ) {
		// do some magic!
		return ServiceExecutor.execute(CittadiniCfEsenzioniPostService.class, cf, esenzione, securityContext, httpHeaders);
	}
	public Response cittadiniCfInfoGet(String shibIdentitaCodiceFiscale,String xCodiceServizio,String xRequestID,String cf,SecurityContext securityContext, HttpHeaders httpHeaders ) {
		// do some magic!
		return ServiceExecutor.execute(CittadiniCfInfoGetService.class, cf, securityContext, httpHeaders);
	}
	@Override
	public Response cittadiniCfTitolariGet(String shibIdentitaCodiceFiscale, String xCodiceServizio, String xRequestID,
			String cf, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCfTitolariGetService.class,  cf,  securityContext,  httpHeaders );
	}
	@Override
	public Response cittadiniCfEsenzioniIdGet(String shibIdentitaCodiceFiscale, String xCodiceServizio,
			String xRequestID, String cf, String id, String cfBeneficiario, String accept,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCfEsenzioniIdGetService.class, cf, id, accept, cfBeneficiario, securityContext, httpHeaders);
	}
	
	@Override
	public Response cittadiniCfEsenzioniIdRevocaPut(String shibIdentitaCodiceFiscale, String xCodiceServizio,
			String xRequestID, String cf, String id, Revoca revoca, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCfEsenzioniIdRevocaPutService.class, cf, id, revoca, securityContext, httpHeaders);
	}

}
