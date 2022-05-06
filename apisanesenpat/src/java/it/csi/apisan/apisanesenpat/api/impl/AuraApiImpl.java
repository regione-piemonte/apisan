/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.api.impl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanesenpat.api.AuraApi;
import it.csi.apisan.apisanesenpat.model.ModelEsenzioneAura;
import it.csi.apisan.apisanesenpat.service.ApisanEsenPatService;
import it.csi.apisan.apisanesenpat.service.ServiceExecutor;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AuraApiImpl implements AuraApi{

	@Override
	public Response cittadiniCitIdEsenzioniAuraCodEsenzioneGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String codEsenzione, String codMalattia, String filter,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest request, HttpServletResponse response) {
        ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_codEsenzione(codEsenzione);
		service.set_codMalattia(codMalattia);
        return service.executeService();
/*		Mock mock = new Mock(); 
		return mock.getMockResponse("SCLSCL00A55G273T");*/
						
	}		

	@Override
	public Response cittadiniCitIdEsenzioniAuraCodEsenzioneRevocaPut(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String codEsenzione, String codMalattia,
			String filter, SecurityContext securityContext, HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response) {
		ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);
        service.set_codEsenzione(codEsenzione);
        service.set_codMalattia(codMalattia);
		return service.executeService();
	}

	@Override
	public Response cittadiniCitIdEsenzioniAuraGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String filter, SecurityContext securityContext,
			HttpHeaders httpHeaders, @Context HttpServletRequest request, @Context HttpServletResponse response) {
		ApisanEsenPatService service = ServiceExecutor.getApisanService(ApisanEsenPatService.class, shibIdentitaCodiceFiscale, securityContext, httpHeaders, request, response);
        service.set_xRequestId(xRequestId);
        service.set_xForwardedFor(xForwardedFor);
        service.set_xCodiceServizio(xCodiceServizio);
        service.set_citId(citId);    
		return service.executeService();
		/*Mock mock = new Mock(); 
		return mock.getMockResponse("SCLSCL00A55G273T");*/
	}

}
