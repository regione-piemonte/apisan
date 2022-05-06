/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.integration.dao.ApisanFseDecodificheDao;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDecodificaAccesso;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DecodificheAccessiGetService extends FseRESTBaseService {
	@Autowired
	ApisanFseDecodificheDao decodificheDao;
	
	
	public DecodificheAccessiGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Valorizzare xRequestId");
		checkNotBlank(xCodiceServizio, "valorizzare codice servizio");
		
		List<ModelDecodificaAccesso> lista = decodificheDao.getDecodificheAccessiServizio();
		
		return Response.ok(lista).build();
	}

}
