/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AutRESTBaseService;
import it.csi.apisan.apisanaut.business.mapper.CittadinoMapper;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.msg.RicercaCittadini;
import it.csi.deleghe.deleghebe.ws.msg.RicercaCittadiniResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniGetService extends AutRESTBaseService {
	
	@Autowired
	private DelegheCittadiniService delegheCittadiniService;
	
	private String filter;

	public CittadiniGetService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		
		this.filter = filter;
	}

	@Override
	protected Response execute() {
		String METHOD_NAME = "execute";
		
		RicercaCittadini rcReq = new RicercaCittadini();
		rcReq.setRichiedente(newRichiedente());
		
		//TODO aggiungere CittadiniFilter.
//		CittadiniFilter f;
//		try {
//			//f = new Filter(filter);
//			f = FilterUtil.init(CittadiniFilter.class, filter);
//		} catch (IllegalArgumentException iae) {
//			log.error(METHOD_NAME, iae.getMessage(), iae);
//			return Response.status(Status.BAD_REQUEST).build();
//		}
//
//		populateFilters(rcReq, f);
		
		
		RicercaCittadiniResponse rcResp = delegheCittadiniService.ricercaCittadiniService(rcReq);
		checkSuccesso(rcResp);
		
		return Response.ok().entity(new CittadinoMapper().fromList(rcResp.getCittadini())).build();
	}

}
