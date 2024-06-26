/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.impl.base.service;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancod.business.apisancod.impl.base.CodRESTBaseService;
import it.csi.apisan.apisancod.dto.apisancod.ModelInfoServizio;
import it.csi.apisan.apisancod.util.ConstantsCod;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ServizioAttivoGetService extends CodRESTBaseService {
	
/*	@Autowired
	RestServiceClient service;
	*/
	public ServizioAttivoGetService(SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		
	}

	@Override
	protected Response execute() {
		
		
		ModelInfoServizio info = new ModelInfoServizio();
		info.setData(new Date());
		info.setNome(ConstantsCod.COMPONENT_NAME);
		info.setDescrizione("Api per la gestione del contatto digitale del cittadino versione 1.0.0");
		info.setServizioAttivo(true);
		return Response.ok().entity(info).build();
	}

}
