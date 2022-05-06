/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.service;

import java.util.Date;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.TrovaUnRESTBaseService;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.InfoServizio;
import it.csi.apisan.apisantrovaun.util.TrovaUnConstants;
//import it.csi.apisan.apisanpag.util.Constants;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ServizioAttivoGetService extends TrovaUnRESTBaseService {

	public ServizioAttivoGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
	}

	@Override
	protected Response execute() {
		InfoServizio info = new InfoServizio();
		info.setData(new Date());
		info.setNome(TrovaUnConstants.COMPONENT_NAME);
		info.setDescrizione("Api per la gestione dei servizi di ricerca strutture mediche e farmaceutiche");
		info.setServizioAttivo(true);
		return Response.ok().entity(info).build();
	}

}
