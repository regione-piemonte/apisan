/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import java.util.Base64;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagRESTBaseService;
import it.csi.apisan.apisanpag.dto.apisanpag.RicevutaFilter;
import it.csi.apisan.apisanpag.util.filter.FilterUtil;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UtentiCfRicevutePagamentiSanitariGetService extends PagRESTBaseService {
	@Autowired
	private PtwServiceClient ptwServiceClient;
	
	String cf;
	String filter;
	
	public UtentiCfRicevutePagamentiSanitariGetService(String cf, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.filter = filter;
	}

	@Override
	protected Response execute() {
		
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkNotBlank(filter, "impostare il filtro");
		checkCodiceFiscaleValido(cf);
		
		RicevutaFilter ricevutaFilter = FilterUtil.init(RicevutaFilter.class, filter);
		
		checkRicevutaFilter(ricevutaFilter);
		byte[] filePdf = null;
		if(isIdRicevutaEqValorizzato(ricevutaFilter)) {
			filePdf = ptwServiceClient.getIcevutePagamentiSanitari(xRequestID, xCodiceServizio, cf, ricevutaFilter.getIdRicevuta().getEq().toString());	
		}else {
			filePdf = ptwServiceClient.getRIcevutePagamentiSanitariPerNumPratica(xRequestID, xCodiceServizio, cf, ricevutaFilter.getNumeroPraticaRegionale().getEq());
		}
		byte[] filePdfDecoder = Base64.getDecoder().decode(filePdf);
		return Response.ok().entity(filePdfDecoder).type("application/pdf").build();
	}
	
	private void checkRicevutaFilter(RicevutaFilter ricevutaFilter) {
		checkCondition(isIdRicevutaEqValorizzato(ricevutaFilter) || isNumeroPraticaValorizzato(ricevutaFilter), "Impostare id ricevuta o numero pratica regionale");
	}
	
	public boolean isIdRicevutaEqValorizzato(RicevutaFilter pf){
		return (pf.getIdRicevuta()!=null && pf.getIdRicevuta().getEq()!=null);
	}
	
	public boolean isNumeroPraticaValorizzato(RicevutaFilter pf) {
		return (pf.getNumeroPraticaRegionale()!= null && StringUtils.isNotBlank(pf.getNumeroPraticaRegionale().getEq()) );
	}

}
