/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service;

import java.math.BigDecimal;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ScreenLoccsiRESTBaseService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.rest.LoccsiServiceClient;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelUnitaOperativaLoccsi;
import it.csi.apisan.apisanscreen.dto.loccsi.ResponseService;
import it.csi.apisan.apisanscreen.util.Page;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UnitaOperativeGetService extends ScreenLoccsiRESTBaseService {

	private String tipologia; 
	private String lat; 
	private String lon; 
	private BigDecimal distanza; 
	private Integer limit;
	private Integer offset; 
	@Autowired
	LoccsiServiceClient loccsiService;
	
	
	public UnitaOperativeGetService(String tipologia, String lat, String lon, BigDecimal distanza, Integer limit,
			Integer offset, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
		this.tipologia = tipologia; 
		this.lat = lat; 
		this.lon = lon; 
		this.distanza = distanza; 
		this.offset = offset == null?Page.DEFAULT_OFFSET.getValue() : offset ;
		this.limit = limit==null? Page.DEFAULT_LIMIT.getValue() : limit;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkNotBlank(tipologia, "Tipologia non valorizzata");
		
		ResponseService<List<ModelUnitaOperativaLoccsi>> respUnitaOperative =  loccsiService.getUnitaOperative(tipologia, lon, lat, distanza, limit, offset);
		setHeadersResponse(respUnitaOperative.getHeaders());
		List<ModelUnitaOperativaLoccsi> listaUnitaOperative = respUnitaOperative.getBody(); 
		
		return Response.ok().entity(listaUnitaOperative).build();
	}

}
