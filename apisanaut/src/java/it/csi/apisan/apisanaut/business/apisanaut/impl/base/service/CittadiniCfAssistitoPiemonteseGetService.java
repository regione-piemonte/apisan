/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AuraAutRESTBaseService;
import it.csi.apisan.apisanaut.dto.apisanaut.AssistitoPiemontese;
import it.csi.apisan.apisanaut.dto.apisanaut.Cittadino;
import it.csi.apisan.apisanaut.exception.RESTException;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfAssistitoPiemonteseGetService extends AuraAutRESTBaseService {
	String cf;
	
	public CittadiniCfAssistitoPiemonteseGetService(String cf, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
	}


	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		
		AssistitoPiemontese assistito = new AssistitoPiemontese();
		
		assistito.setPiemontese(isCittadinoPiemontese(cf));
		
		return Response.ok(assistito).build();
	}

}
