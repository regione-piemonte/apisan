/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.FarmRESTBaseService;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelInfoServizio;
import it.csi.apisan.apisanfarm.util.ConstantsFarm;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ServizioAttivoGetService extends FarmRESTBaseService {

	public ServizioAttivoGetService(SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		
	}

	@Override
	protected Response execute() {
		ModelInfoServizio info = new ModelInfoServizio();
		info.setData(new Date());
		info.setNome(ConstantsFarm.COMPONENT_NAME);
		info.setDescrizione("Api per la gestione delle farmacie abituali del cittadino v1.0.0");
		info.setServizioAttivo(true);
		return Response.ok().entity(info).build();
	}

}
