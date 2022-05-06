/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanfarm.business.apisanfarm.CittadiniApi;
import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.ServiceExecutor;
import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service.CittadiniCitIdDeviceCertificatoDeleteService;
import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service.CittadiniCitIdDeviceCertificatoGetService;
import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service.CittadiniCitIdDeviceCertificatoPost;
import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service.CittadiniCitIdFarmacieAbitualiGetService;
import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service.CittadiniCitIdFarmacieAbitualiPostService;
import it.csi.apisan.apisanfarm.dto.apisanfarm.PayloadDeviceCertificato;
import it.csi.apisan.apisanfarm.dto.apisanfarm.PayloadFarmaciaAbituale;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiServiceImpl implements CittadiniApi {

	public CittadiniApiServiceImpl() {
		// TODO Auto-generated constructor stub
	}

/*	@Override
	public Response cittadiniCitIdDeviceCertificatoDelete(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdDeviceCertificatoDeleteService.class, citId, securityContext,
				httpHeaders, httpRequest);
	}
*/


	

	@Override
	public Response cittadiniCitIdFarmacieAbitualiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String codiceVerticaleDelega,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdFarmacieAbitualiGetService.class, citId, codiceVerticaleDelega,
				securityContext, httpHeaders, httpRequest);
	}

	@Override
	public Response cittadiniCitIdFarmacieAbitualiPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String codiceVerticaleDelega,
			PayloadFarmaciaAbituale payloadFarmaciaAbituale, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdFarmacieAbitualiPostService.class,  citId,  codiceVerticaleDelega,
				 payloadFarmaciaAbituale,  securityContext,  httpHeaders,
				 httpRequest);
	}

	@Override
	public Response cittadiniCitIdDeviceCertificatoPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String codiceVerticaleDelega,
			PayloadDeviceCertificato payloadDeviceCertificato, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdDeviceCertificatoPost.class, citId,  codiceVerticaleDelega,
				payloadDeviceCertificato, securityContext, httpHeaders,
				httpRequest);
	}

	@Override
	public Response cittadiniCitIdDeviceCertificatoGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String codiceVerticaleDelega,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdDeviceCertificatoGetService.class, citId, codiceVerticaleDelega, securityContext,
				httpHeaders, httpRequest);
	}

	@Override
	public Response cittadiniCitIdDeviceCertificatoDelete(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String codiceVerticaleDelega,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdDeviceCertificatoDeleteService.class, citId, codiceVerticaleDelega,
			securityContext, httpHeaders, httpRequest);
	}
	
	/*	@Override
	public Response cittadiniCitIdDeviceCertificatoDelete(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdDeviceCertificatoDeleteService.class, citId, securityContext,
				httpHeaders, httpRequest);
	}
*/	


}
