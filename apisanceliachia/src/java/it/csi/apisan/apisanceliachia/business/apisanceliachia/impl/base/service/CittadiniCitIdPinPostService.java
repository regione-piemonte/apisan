/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base.CeliachiaCeSrvRESTBaseService;
import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelPin;
import it.csi.celiachia.celiachiabesrv.input.xsd.RigeneraPinRequest;
import it.csi.celiachia.celiachiabesrv.output.xsd.RigeneraPinResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdPinPostService extends CeliachiaCeSrvRESTBaseService {

	public CittadiniCitIdPinPostService(String citId, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(citId, securityContext, httpHeaders, httpRequest);
		
	}

	@Override
	protected Response execute() {
		checkNotNull(xRequestID, "Inserire x-Request-ID");
		checkNotNull(xCodiceServizio, "Inserire codice servizio");
		checkNotNull(shibIdentitaCodiceFiscale, "Inserire l'identità");
		checkNotBlank(citId, "Inserire il codice fiscale");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		RigeneraPinRequest input = new RigeneraPinRequest();
		
		createNewRichiedente(input);
		input.setCitId(getJabCitCf());
		
		RigeneraPinResponse res = servizioCeliachia.rigeneraPinAssistito(input);
		
		checkSuccesso(res, res.getErrore());
		
		String pin = res.getPin().getValue();
		
		ModelPin response = new ModelPin();
		response.setCodice(pin);
		
		return Response.ok(response).build() ;
	}

}
