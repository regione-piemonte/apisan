/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseRESTBaseService;
import it.csi.apisan.apisanfse.business.integration.dao.ApisanFseDecodificheDao;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDecodificaAccesso;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DecodificheAccessiCodiceServizioAccessoGetService extends FseRESTBaseService {
	@Autowired
	ApisanFseDecodificheDao decodificheDao;
	String codiceServizioAccesso;
	
	public DecodificheAccessiCodiceServizioAccessoGetService(String codiceServizioAccesso, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.codiceServizioAccesso = codiceServizioAccesso;
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Valorizzare xRequestId");
		checkNotBlank(xCodiceServizio, "Valorizzare codice servizio");
		checkNotBlank(codiceServizioAccesso, "Valorizzare path param");
		
		ModelDecodificaAccesso res = decodificheDao.getDecodificaAccessiServizioFromCodice(codiceServizioAccesso);
		
		return Response.ok(res).build();
	}

}
