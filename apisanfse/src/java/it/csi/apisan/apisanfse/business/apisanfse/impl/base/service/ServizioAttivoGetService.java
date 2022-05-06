/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.Date;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseRESTBaseService;
import it.csi.apisan.apisanfse.dto.apisanfse.InfoServizio;
import it.csi.apisan.apisanfse.util.ConstantsFse;;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ServizioAttivoGetService extends FseRESTBaseService {

	
	
	public ServizioAttivoGetService( String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super( securityContext, httpHeaders);
		
	}

	@Override
	protected Response execute() {
		
		InfoServizio info = new InfoServizio();
		info.setData(new Date());
		info.setNome(ConstantsFse.COMPONENT_NAME);
		info.setDescrizione("API del Fascicolo Sanitario Elettronico versione 1.9.2");
		info.setServizioAttivo(true);
		
		
		return Response.ok().entity(info).build();
	}
	

}
