/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.service;

import static it.csi.apisan.apisancross.util.ApisanCrossUtil.applyOffsetAndLimit;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancross.business.apisancross.impl.base.CrossRESTBaseService;
import it.csi.apisan.apisancross.business.cache.AppCacheManager;
import it.csi.apisan.apisancross.business.cache.initiator.ListaNazioniCache;
import it.csi.apisan.apisancross.dto.apisancross.Nazione;
import it.csi.apisan.apisancross.filter.NazioniFilter;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class NazioniGetService extends CrossRESTBaseService {

	private Integer offset;
	private Integer limit;
	private String filter;
	
	@Autowired
    AppCacheManager cacheManager;

	public NazioniGetService(Integer offset, Integer limit, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.offset = offset;
		this.limit = limit;
		this.filter = filter;
	}

	@Override
	protected Response execute() {
		final String METHOD_NAME = "execute";
		log.debug(METHOD_NAME, "xRequestID: %s, xCodiceServizio: %s, filter: %s", xRequestID, xCodiceServizio, filter);

		List<Nazione> nazioni = cacheManager.get(ListaNazioniCache.class); //MockNazioni.getInstance().getNazioni();
		
		List<Nazione> nazioniFiltrate = filtraNazioni(nazioni, filter, offset, limit);

		return Response.ok(nazioniFiltrate).header("X-Totale-Elementi", nazioni.size()).build();
	}

	private List<Nazione> filtraNazioni(List<Nazione> nazioni, String filter, Integer offset, Integer limit) {
		final String METHOD_NAME = "filtraNazioni";
		log.debug(METHOD_NAME, "invoked with Filter: %s, offset: %s, limit: %s", filter, offset, limit);


		List<Nazione> result;

		try {
			result = new NazioniFilter().doFilter(nazioni, filter);

		} catch (IllegalArgumentException e) {
			// caso in cui sono stati impostati dei filtri non consensentiti ritorno la
			// lista
			result = nazioni;
		}

		return applyOffsetAndLimit(result, offset, limit);

	}

}
