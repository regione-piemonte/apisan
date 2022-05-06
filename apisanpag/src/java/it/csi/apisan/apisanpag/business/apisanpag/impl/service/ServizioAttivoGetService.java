/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import java.util.Date;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagRESTBaseService;
import it.csi.apisan.apisanpag.dto.apisanpag.InfoServizio;
import it.csi.apisan.apisanpag.util.Constants;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ServizioAttivoGetService extends PagRESTBaseService {

	public ServizioAttivoGetService( String xRequestID, String xCodiceServizio, String xForwardedFor,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
	}

	@Override
	protected Response execute() {
		InfoServizio info = new InfoServizio();
		info.setData(new Date());
		info.setNome(Constants.COMPONENT_NAME);
		info.setDescrizione("Api per la gestione dei pagamenti77");
		info.setServizioAttivo(true);
		return Response.ok().entity(info).build();
	}

}
