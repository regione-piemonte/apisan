/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.service;

import java.math.BigDecimal;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.TrovaUnLoccsiRESTBaseService;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelStrutturaSanitaria;
import it.csi.apisan.apisantrovaun.dto.loccsi.ResponseService;
import it.csi.apisan.apisantrovaun.exception.ErroreBuilder;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class StruttureSanitarieGetService extends TrovaUnLoccsiRESTBaseService {
	private String s;
	
	private String tipologiaAssistenza;
	
	public StruttureSanitarieGetService(String s,Integer limit,Integer offset,String latitudine,String longitudine,BigDecimal distanza,String tipologiaAssistenza,SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(latitudine,longitudine, distanza, offset, limit, securityContext, httpHeaders);
		this.s = s;
		this.tipologiaAssistenza = tipologiaAssistenza;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkCondition(( checkCoordinate() || StringUtils.isNotEmpty(s) || StringUtils.isNotEmpty(tipologiaAssistenza) ),ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Impostare almeno un query param").exception());
		
		ResponseService<List<ModelStrutturaSanitaria>> resp = service.getStruttureSanitarie(s, longitudine, latitudine, distanza, limit, offset, tipologiaAssistenza);
		setHeadersResponse(resp.getHeaders());
		
		List<ModelStrutturaSanitaria> listaStrutture = resp.getBody();
		
		
		return Response.ok(listaStrutture).build();
	}

}
