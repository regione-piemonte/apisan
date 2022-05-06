/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class InformativeInformativaHtmlGetService extends InformativeFileBaseSetrvice {

	public InformativeInformativaHtmlGetService( String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(filter, securityContext, httpHeaders );

	}

	@Override
	protected Response execute() {
		String METHOD_NAME = "execute";
		byte[] informativaHtml = getByte(false);
		return Response.ok().entity(informativaHtml).type("application/html").build();
	}

}
