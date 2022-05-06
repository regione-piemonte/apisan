/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagDelegheRESTBaseService;
import it.csi.apisan.apisanpag.business.mapper.DateStringMapper;
import it.csi.apisan.apisanpag.dto.apisanpag.DateCrit;
import it.csi.apisan.apisanpag.dto.apisanpag.IntegerCrit;
import it.csi.apisan.apisanpag.dto.apisanpag.RimborsoFilter;
import it.csi.apisan.apisanpag.dto.apisanpag.StringCrit;
import it.csi.apisan.apisanpag.dto.apisanpag.Ticket;
import it.csi.apisan.apisanpag.util.FiltroRimborsiWrapper;
import it.csi.apisan.apisanpag.util.filter.FilterUtil;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UtentiCfRimborsiGetService extends PagDelegheRESTBaseService {
	
	String cf;
	String filter;
	@Autowired
	private PtwServiceClient ptwServiceClient;	
	
	
	public UtentiCfRimborsiGetService(String cf, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.filter = filter;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkUtenteAutorizzatoOrDelegato(cf);
		checkNotNull(filter, "filtro obligatorio");
		checkNotBlank(filter, "filtro obbligatorio");
		
		//TODO verificare il filtro
		RimborsoFilter rimborsoFilter = FilterUtil.init(RimborsoFilter.class, filter);
		
		FiltroRimborsiWrapper filtroRimborsiWrapper = newFiltroRimborsiWrapper(rimborsoFilter);
		
		if(filtroRimborsiWrapper != null) {
			System.out.println("Filtro id asr: " + filtroRimborsiWrapper.getIdAsr());
		}
		
		List<Ticket> lista = ptwServiceClient.getListaRimborsi(xRequestID, xCodiceServizio, cf, filtroRimborsiWrapper);
		
		return Response.ok(lista).build();
	}
	
	private FiltroRimborsiWrapper newFiltroRimborsiWrapper(RimborsoFilter rimborsoFilter) {
		FiltroRimborsiWrapper filtroRimborsiWrapper = new FiltroRimborsiWrapper();
		if(rimborsoFilter.getIdAsr() != null && rimborsoFilter.getIdAsr().getEq() != null) {
			filtroRimborsiWrapper.setIdAsr(rimborsoFilter.getIdAsr().getEq().toString());
		}
		if(rimborsoFilter.getStatoTicket() != null && rimborsoFilter.getStatoTicket().getEq() != null) {
			filtroRimborsiWrapper.setStatoTicket("" +rimborsoFilter.getStatoTicket().getEq().toString());
		}
		if(rimborsoFilter.getInErogazione() != null && rimborsoFilter.getInErogazione().getEq() != null) {
			filtroRimborsiWrapper.setInErogazione("" + rimborsoFilter.getInErogazione().getEq().toString());
		}
		if(rimborsoFilter.getMotivoPagamento() != null && rimborsoFilter.getMotivoPagamento().getEq() != null) {
			filtroRimborsiWrapper.setMotivoPagamento(rimborsoFilter.getMotivoPagamento().getEq());
		}
		if(rimborsoFilter.getCodiceVersamento() != null && rimborsoFilter.getCodiceVersamento().getEq() != null) {
			filtroRimborsiWrapper.setCodiceVersamento(rimborsoFilter.getCodiceVersamento().getEq());
		}
		if(rimborsoFilter.getModalitaRimborso() != null && rimborsoFilter.getModalitaRimborso().getEq() != null) {
			filtroRimborsiWrapper.setModalitaRimborso(rimborsoFilter.getModalitaRimborso().getEq()); 
		}
		if(rimborsoFilter.getDataDal() != null && rimborsoFilter.getDataDal().getEq() != null) {
			filtroRimborsiWrapper.setDataDal(new DateStringMapper().to(rimborsoFilter.getDataDal().getEq()));
		}
		if(rimborsoFilter.getDataAl() != null && rimborsoFilter.getDataAl().getEq() != null) {
			filtroRimborsiWrapper.setDataAl(new DateStringMapper().to(rimborsoFilter.getDataAl().getEq()));
		}
		
		return filtroRimborsiWrapper;
	}
	
	


}
