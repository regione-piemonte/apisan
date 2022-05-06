/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service;

import java.util.Date;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ScreenRESTBaseService;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelInfoServizio;
import it.csi.apisan.apisanscreen.util.ConstantsScreen;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ServizioAttivoGetService extends ScreenRESTBaseService {

	public ServizioAttivoGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	
	}

	

	@Override
	protected Response execute() {
		ModelInfoServizio info = new ModelInfoServizio();
		info.setData(new Date());
		info.setNome(ConstantsScreen.COMPONENT_NAME);
		info.setDescrizione("Api per la gestione dello screening");
		info.setServizioAttivo(true);
		return Response.ok().entity(info).build();
	}

}
