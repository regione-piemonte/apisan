/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base.service;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base.CeliachiaRESTBaseService;
import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelInfoServizio;
import it.csi.apisan.apisanceliachia.util.ConstantsCeliachia;
//import it.csi.apisan.apisanpag.util.Constants;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ServizioAttivoGetService extends CeliachiaRESTBaseService {

	public ServizioAttivoGetService(SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		
	}

	@Override
	protected Response execute() {
		ModelInfoServizio info = new ModelInfoServizio();
		info.setData(new Date());
		info.setNome(ConstantsCeliachia.COMPONENT_NAME);
		info.setDescrizione("Api per la gestione dei consensi");
		info.setServizioAttivo(true);
		return Response.ok().entity(info).build();
	}

}
