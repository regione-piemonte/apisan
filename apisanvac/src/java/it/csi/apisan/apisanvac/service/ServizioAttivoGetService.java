/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.service;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanvac.common.RESTBaseService;
import it.csi.apisan.apisanvac.model.ModelInfoServizio;
import it.csi.apisan.apisanvac.util.Constants;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.Date;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ServizioAttivoGetService extends RESTBaseService {
	public ServizioAttivoGetService( String _shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio, SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
		super(_shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
	}

	@Override
	protected Response execute() {
		ModelInfoServizio info = new ModelInfoServizio();
		info.setData(new Date());
		info.setNome(Constants.COMPONENT_NAME);
		info.setDescrizione("API per Vaccinazioni versione 1.3.4");
		info.setServizioAttivo(true);
        return Response.ok(info, MediaType.APPLICATION_JSON_TYPE).build();
	}

}
