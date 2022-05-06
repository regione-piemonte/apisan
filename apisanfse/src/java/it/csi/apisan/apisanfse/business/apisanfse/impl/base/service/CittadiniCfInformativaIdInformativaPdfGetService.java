/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseConsensiRESTBaseService;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)	
public class CittadiniCfInformativaIdInformativaPdfGetService extends FseConsensiRESTBaseService {
	
	private String cf;
	private String idInformativa;
	
	public CittadiniCfInformativaIdInformativaPdfGetService(String cf, String idInformativa,SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.idInformativa = idInformativa;
	}

	@Override
	protected Response execute() {
		throw  ErroreBuilder.from(421, "Servizio non ancora disponibile").exception(); 
	}

}
