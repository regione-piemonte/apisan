/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanaut.business.apisanaut.CittadiniApi;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.ServiceExecutor;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfAssistitoPiemonteseGetService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfDelegantiCfdeleganteGetService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfDelegantiCfdeleganteServiziUuidPutService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfDelegantiGetService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfDelegatiCfdelegatoGetService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfDelegatiCfdelegatoPutService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfDelegatiDelegheValideGetService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfDelegatiGetService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfDelegatiPostService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfDichiarazioniGetService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfDichiarazioniIdDichiarazionePutService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfDichiarazioniPostService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniCfPutService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniGetService;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.service.CittadiniPostService;
import it.csi.apisan.apisanaut.dto.apisanaut.Cittadino;
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaCittadino;
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaServizio;
import it.csi.apisan.apisanaut.dto.apisanaut.Dichiarazione;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiServiceImpl implements CittadiniApi {
	
	@Override
	public Response cittadiniCfDelegantiCfdeleganteGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, String cfdelegante, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCfDelegantiCfdeleganteGetService.class, shibIdentitaCodiceFiscale, xRequestID,
				xCodiceServizio, cf, cfdelegante, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCfDelegantiCfdeleganteServiziUuidPut(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, String cfdelegante, String uuid, DelegaServizio delegheServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCfDelegantiCfdeleganteServiziUuidPutService.class, shibIdentitaCodiceFiscale, xRequestID,
				xCodiceServizio, cf, cfdelegante, uuid, delegheServizio,
				securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCfDelegantiGet(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String cf, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCfDelegantiGetService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				cf, filter, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCfDelegatiCfdelegatoGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, String cfdelegato, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCfDelegatiCfdelegatoGetService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				 cf, cfdelegato, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCfDelegatiCfdelegatoPut(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cfdelegato, String cf, DelegaCittadino cittadinoDelega,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCfDelegatiCfdelegatoPutService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				cfdelegato, cf, cittadinoDelega, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCfDelegatiGet(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String cf, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCfDelegatiGetService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				cf, filter, securityContext, httpHeaders);
	}

	
	
	@Override
	public Response cittadiniCfDelegatiPost(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			 String cf,List<DelegaCittadino> delegati, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCfDelegatiPostService.class,shibIdentitaCodiceFiscale,  xRequestID, xCodiceServizio,
				 cf, delegati, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCfDichiarazioniGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, String filter, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCfDichiarazioniGetService.class,shibIdentitaCodiceFiscale, xRequestID,
				xCodiceServizio, cf, filter, securityContext,
				httpHeaders);
	}

	@Override
	public Response cittadiniCfDichiarazioniUuidDichiarazionePut(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, String uuidDichiarazione, Dichiarazione dichiarazione,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCfDichiarazioniIdDichiarazionePutService.class, shibIdentitaCodiceFiscale, xRequestID,
				xCodiceServizio, cf, uuidDichiarazione, dichiarazione,
				securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCfDichiarazioniPost(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, Dichiarazione dichiarazione, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCfDichiarazioniPostService.class, shibIdentitaCodiceFiscale, xRequestID,
				xCodiceServizio, cf, dichiarazione, securityContext,
				httpHeaders);
	}

	@Override
	public Response cittadiniCfPut(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String cf, Cittadino cittadino, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCfPutService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				cf, cittadino, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniGet(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniGetService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				filter, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniPost(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			Cittadino cittadino, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniPostService.class, xRequestID, xCodiceServizio,
				cittadino, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCfDelegatiDelegheValideGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, String filter, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCfDelegatiDelegheValideGetService.class, shibIdentitaCodiceFiscale,  xRequestID,
				xCodiceServizio, cf, filter, securityContext,httpHeaders) ;
	}

	@Override
	public Response cittadiniCfAssistitoPiemonteseGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub)
		return ServiceExecutor.execute(CittadiniCfAssistitoPiemonteseGetService.class, cf, securityContext, httpHeaders ) ;
	}

	

	
}
