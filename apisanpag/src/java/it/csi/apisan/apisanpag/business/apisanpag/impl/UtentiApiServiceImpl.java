/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanpag.business.apisanpag.UtentiApi;
import it.csi.apisan.apisanpag.business.apisanpag.impl.base.ServiceExecutor;
import it.csi.apisan.apisanpag.business.apisanpag.impl.service.UtentiCfAvvisoPagamentoNumeroPraticaGetService;
import it.csi.apisan.apisanpag.business.apisanpag.impl.service.UtentiCfPagamentiSanitariGetService;
import it.csi.apisan.apisanpag.business.apisanpag.impl.service.UtentiCfPagamentiSanitariNumeroPraticaGetService;
import it.csi.apisan.apisanpag.business.apisanpag.impl.service.UtentiCfRicevutePagamentiSanitariGetService;
import it.csi.apisan.apisanpag.business.apisanpag.impl.service.UtentiCfRicevutePagamentiSanitariIdRicevutaGetService;
import it.csi.apisan.apisanpag.business.apisanpag.impl.service.UtentiCfRimborsiGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class UtentiApiServiceImpl implements UtentiApi {

	/*@Override
	public Response utentiCfAvvisoPagamentoNumeroPraticaGet(String xRequestID, String xCodiceServizio, String cf,
			String numeroPratica, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(UtentiCfAvvisoPagamentoNumeroPraticaGetService.class, cf, numeroPratica, securityContext, httpHeaders);
	}*/

	@Override
	public Response utentiCfPagamentiSanitariGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String cf, String filter, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(UtentiCfPagamentiSanitariGetService.class, cf, filter,  securityContext, httpHeaders) ;
	}

	/*@Override
	public Response utentiCfPagamentiSanitariNumeroPraticaGet(String xRequestID, String xCodiceServizio, String cf,
			String numeroPratica, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(UtentiCfPagamentiSanitariNumeroPraticaGetService.class,  cf, numeroPratica, securityContext, httpHeaders);
	}*/

	@Override
	public Response utentiCfRicevutePagamentiSanitariGet(String xRequestID, String xCodiceServizio, String xForwardedFor, String cf,
			String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(UtentiCfRicevutePagamentiSanitariGetService.class, cf, filter, securityContext,  httpHeaders) ;
	}

	@Override
	public Response utentiCfRicevutePagamentiSanitariIdRicevutaGet(String xRequestID, String xCodiceServizio, String xForwardedFor, String cf,
			String idRicevuta, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(UtentiCfRicevutePagamentiSanitariIdRicevutaGetService.class, cf, idRicevuta, securityContext, httpHeaders);
	}

	
	@Override
	public Response utentiCfAvvisoPagamentoNumeroPraticaRegionaleGet(String xRequestID, String xCodiceServizio, String xForwardedFor,
			String cf, String numeroPraticaRegionale, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(UtentiCfAvvisoPagamentoNumeroPraticaGetService.class, cf, numeroPraticaRegionale, securityContext, httpHeaders);
	}

	
	
	@Override
	public Response utentiCfPagamentiSanitariNumeroPraticaRegionaleGet(String xRequestID, String xCodiceServizio, String xForwardedFor,
			String cf, String numeroPraticaRegionale, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(UtentiCfPagamentiSanitariNumeroPraticaGetService.class, cf, numeroPraticaRegionale, securityContext,httpHeaders) ;
	}

	@Override
	public Response utentiCfRimborsiGet(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String xForwardedFor, String cf, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(UtentiCfRimborsiGetService.class, cf, filter, securityContext, httpHeaders);
	}
	

 
}
