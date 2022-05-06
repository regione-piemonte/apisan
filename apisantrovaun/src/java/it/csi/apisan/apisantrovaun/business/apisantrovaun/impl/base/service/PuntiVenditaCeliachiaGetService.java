/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.service;

import java.math.BigDecimal;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.TrovaUnLoccsiRESTBaseService;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelPuntoVenditaCeliachia;
import it.csi.apisan.apisantrovaun.dto.loccsi.ResponseService;
import it.csi.apisan.apisantrovaun.exception.ErroreBuilder;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PuntiVenditaCeliachiaGetService extends TrovaUnLoccsiRESTBaseService {
	String s;
	String tipologia;
	
	public PuntiVenditaCeliachiaGetService(String s,
			Integer limit, Integer offset, String latitudine, String longitudine, BigDecimal distanza, String tipologia,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(latitudine, longitudine, distanza, offset, limit, securityContext, httpHeaders);
		this.s = s;
		this.tipologia = tipologia;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkCondition(( checkCoordinate() || StringUtils.isNotEmpty(s) || StringUtils.isNotEmpty(tipologia) ),ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Impostare almeno un query param").exception());
		
		
		ResponseService<List<ModelPuntoVenditaCeliachia>> resp = service.getPuntiVenditaCeliachia(s, longitudine, latitudine, distanza, limit, offset, tipologia);
		
		setHeadersResponse(resp.getHeaders());
		
		List<ModelPuntoVenditaCeliachia> listaPuntiVendita = resp.getBody();
		
		return Response.ok(listaPuntiVendita).build() ;
	}

}
