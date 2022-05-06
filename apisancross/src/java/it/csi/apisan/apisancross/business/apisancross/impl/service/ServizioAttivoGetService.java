/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.service;

import java.util.Date;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancross.business.apisancross.impl.base.CrossRESTBaseService;
import it.csi.apisan.apisancross.dto.apisancross.InfoServizio;
import it.csi.apisan.apisancross.util.Constants;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ServizioAttivoGetService extends CrossRESTBaseService {

	public ServizioAttivoGetService( String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
	}

	@Override
	protected Response execute() {
		InfoServizio info = new InfoServizio();
		info.setData(new Date());
		info.setNome(Constants.COMPONENT_NAME);
		info.setDescrizione("Api risorse per gestire le deleghe e le dichiarazioni (deleghe minori) v.1.4.0");
		info.setServizioAttivo(true);
		return Response.ok().entity(info).build();
	}

}
