/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.service;

import it.csi.apisan.apisanesenpat.util.Constants;
import it.csi.apisan.apisanesenpat.model.ModelInfoServizio;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
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
		info.setDescrizione("API per Esenzioni Patologie");
		info.setServizioAttivo(true);
		return Response.ok().entity(info).build();
	}

}
