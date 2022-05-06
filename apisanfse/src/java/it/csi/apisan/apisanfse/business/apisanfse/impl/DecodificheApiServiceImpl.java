/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanfse.business.apisanfse.DecodificheApi;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.ServiceExecutor;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.DecodificheDocumentiCategorieGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.DecodificheDocumentiTipiEpisodioGetService;



@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class DecodificheApiServiceImpl implements DecodificheApi {

	@Override
	public Response decodificheDocumentiCategorieGet(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, String codiceAppVerticale, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(DecodificheDocumentiCategorieGetService.class, codiceAppVerticale, securityContext, httpHeaders);
	}

	@Override
	public Response decodificheDocumentiTipiEpisodioGet(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(DecodificheDocumentiTipiEpisodioGetService.class, securityContext, httpHeaders);
	}
	
	
	
}
