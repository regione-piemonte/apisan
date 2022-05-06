/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancross.business.apisancross.impl.base.CrossRESTBaseService;
import it.csi.apisan.apisancross.business.mapper.ServizioMapper;
import it.csi.apisan.apisancross.dto.apisancross.Servizio;
import it.csi.apisan.apisancross.dto.apisancross.ServizioFilter;
import it.csi.apisan.apisancross.exception.ErroreBuilder;
import it.csi.apisan.apisancross.filter.ServiziFilter;
import it.csi.apisan.apisancross.util.filter.FilterUtil;
import it.csi.deleghe.deleghebe.ws.DelegheBackOfficeService;
import it.csi.deleghe.deleghebe.ws.model.Richiedente;
import it.csi.deleghe.deleghebe.ws.model.RisultatoCodice;
import it.csi.deleghe.deleghebe.ws.msg.RicercaServizi;
import it.csi.deleghe.deleghebe.ws.msg.RicercaServiziResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ServiziGetService extends CrossRESTBaseService {
	
	@Autowired
	private DelegheBackOfficeService delegheBackOfficeService;
	
	
	private String filter;
	
	
	public ServiziGetService( String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.filter = filter;
	}



	@Override
	protected Response execute() {
		final String METHOD_NAME = "execute";
		log.debug(METHOD_NAME, "xRequestID: %s, xCodiceServizio: %s, filter: %s", xRequestID, xCodiceServizio, filter);

		List<Servizio> servizi = getListaServizi(filter);
		
		return Response.ok(servizi).build() ;
	}
	
	
	private List<Servizio> getListaServizi(String filter) {
		final String METHOD_NAME = "getListaServizi";
		log.debug(METHOD_NAME, "invoked with Filter: %s,", filter);

		
		RicercaServizi reqRS = new RicercaServizi();
		reqRS.setRichiedente(newRichiedente());
		populateFilterParams(reqRS, filter);
		RicercaServiziResponse resRS = delegheBackOfficeService.ricercaServiziService(reqRS);
		if (!RisultatoCodice.SUCCESSO.equals(resRS.getEsito())) {
			
			ErroreBuilder erroreBuilder = ErroreBuilder.from(Status.BAD_REQUEST).title("Errore nel richiamo a ricercaServizi");
			if(resRS.getErrori()!=null) {
				resRS.getErrori().stream().forEach(e -> erroreBuilder.dettaglio(e.getCodice(), e.getDescrizione()));
			}
			throw erroreBuilder.exception();
			
		}
		
		List<Servizio> servizi = new ServizioMapper().fromList(resRS.getServizi());
//		List<Servizio> servizi = MockServizi.getInstance().getServizi();
		
		List<Servizio> result;
		try {
			result = new ServiziFilter().doFilter(servizi, filter);

		} catch (IllegalArgumentException e) {
			// caso in cui sono stati impostati dei filtri non consensentiti ritorno la
			// lista
			result = servizi;
		}

		return result;

	}
	
	private void populateFilterParams(RicercaServizi reqRS, String filter) {
		String METHOD_NAME = "populateFilterParams";
		if (StringUtils.isBlank(filter)) {
			return;
		}
		
		ServizioFilter f = FilterUtil.init(ServizioFilter.class, filter);
		log.debug(METHOD_NAME, "f: "+f);
		
		it.csi.deleghe.deleghebe.ws.model.Servizio servizio = new it.csi.deleghe.deleghebe.ws.model.Servizio();
		reqRS.setServizio(servizio);
		
		if(f.getCodiceServizio() !=null && StringUtils.isNotBlank(f.getCodiceServizio().getEq())) {
			servizio.setCodice(f.getCodiceServizio().getEq());
		}
		
		if(f.getArruolabile()!=null) {
			servizio.setArruolabile(f.getArruolabile().isEq());
		}
		
		if(f.getDelegabile() != null) {
			servizio.setDelegabile(f.getDelegabile().isEq());
		}
		
		if(f.getNotificabile() != null) {
			servizio.setNotificabile(f.getNotificabile().isEq());
		}
		
		if(f.getObbligatorioArruolamento() != null) {
			servizio.setObbligatorioArruolamento(f.getObbligatorioArruolamento().isEq());
		}		
		
	}



	protected Richiedente newRichiedente() {
		return new Richiedente(xRequestID, xCodiceServizio, shibIdentitaCodiceFiscale);
	}

}
