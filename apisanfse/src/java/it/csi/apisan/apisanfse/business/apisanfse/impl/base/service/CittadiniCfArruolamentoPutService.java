/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseRESTBaseService;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.integration.arruolamento.preferenze.CCSetPreferenzeArruolabilitaServicePortType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfArruolamentoPutService extends FseRESTBaseService {
	
	@Autowired
	CCSetPreferenzeArruolabilitaServicePortType cCSetPreferenzeArruolabilitaServicePortType;
	private String cf;
	

	public CittadiniCfArruolamentoPutService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio,String xForwardedFor, String cf, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super( securityContext, httpHeaders);
		this.cf = cf;
	}

	@Override
	protected Response execute() {
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(cf);
		checkUtenteAutorizzato(cf);
	
		String result = cCSetPreferenzeArruolabilitaServicePortType.set(cf);
		
		if(result.equals("false")) {
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Impossibile settare la preferenza").exception();
		}
		
		
		return Response.status(Status.NO_CONTENT).build();
		
		
	}

}
