/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancons.business.apisancons.impl.base.ConsRESTBaseService;
import it.csi.apisan.apisancons.business.apisancons.mapper.InformativaInformativaMapper;
import it.csi.apisan.apisancons.dto.apisancons.Informativa;
import it.csi.apisan.apisancons.dto.apisancons.InformativaFilter;
import it.csi.apisan.apisancons.exception.ErroreBuilder;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsensoBeService;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaInformativa;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaInformativaResponse;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.Richiedente;
import it.csi.apisan.apisancons.util.filter.FilterUtil;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class InformativeInformativaPdfGet extends InformativeFileBaseSetrvice {
	
	
	public InformativeInformativaPdfGet( String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(filter, securityContext, httpHeaders );

	}

	@Override
	protected Response execute() {
		String METHOD_NAME = "execute";
		byte[] informativaPdf = getByte(true);
		return Response.ok().entity(informativaPdf).type("application/pdf").build();
	}
	


}
