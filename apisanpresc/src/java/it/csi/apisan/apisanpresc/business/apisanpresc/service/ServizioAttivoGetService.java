/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.business.apisanpresc.service;

import it.csi.apisan.apisanpresc.business.apisanpresc.service.common.PrescRESTBaseService;
import it.csi.apisan.apisanpresc.dto.apisanpresc.InfoServizio;
import it.csi.apisan.apisanpresc.util.Constants;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.Date;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ServizioAttivoGetService extends PrescRESTBaseService {

	public ServizioAttivoGetService( String xRequestID, String xCodiceServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request) {
		super( securityContext, httpHeaders, request);
		
	}

	@Override
	protected Response execute() {
		
		InfoServizio info = new InfoServizio();
		info.setData(new Date());
		info.setNome(Constants.COMPONENT_NAME);
		info.setDescrizione("API delle Prescrizioni Farmaceutiche e Specialistiche versione 1.3.2");
		info.setServizioAttivo(true);
		return Response.ok().entity(info).build();
	}
	

}
