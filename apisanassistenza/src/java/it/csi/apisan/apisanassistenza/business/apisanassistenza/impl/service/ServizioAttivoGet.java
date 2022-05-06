/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelInfoServizio;
import it.csi.apisan.apisanassistenza.util.ConstantApisanAssistenza;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ServizioAttivoGet extends AssistenzaRESTService{

	public ServizioAttivoGet(SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
	}

	public ServizioAttivoGet() {
	}

	public ModelInfoServizio get() {
		ModelInfoServizio info = new ModelInfoServizio();
		info.setData(new Date());
		info.setNome(ConstantApisanAssistenza.COMPONENT_NAME);
		info.setDescrizione("API servizio gestione ticket di assistenza ai cittadini");
		info.setServizioAttivo(true);
		return info;
	}

	@Override
	protected Response execute() {
		return Response.ok().entity(get()).build();
	}

}
