/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AutRESTBaseService;
import it.csi.apisan.apisanaut.business.mapper.CittadinoMapper;
import it.csi.apisan.apisanaut.dto.apisanaut.Cittadino;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.msg.InserisciCittadino;
import it.csi.deleghe.deleghebe.ws.msg.InserisciCittadinoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniPostService extends AutRESTBaseService {
	
	@Autowired
	private DelegheCittadiniService delegheCittadiniService;
	
	private Cittadino cittadino;

	public CittadiniPostService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			Cittadino cittadino, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		
		this.cittadino = cittadino;
	}

	@Override
	protected Response execute() {
		String METHOD_NAME = "execute";
		
		InserisciCittadino acReq = new InserisciCittadino();
		acReq.setRichiedente(newRichiedente());
		
		acReq.setCittadino(new CittadinoMapper().to(cittadino));
		InserisciCittadinoResponse acResp = delegheCittadiniService.inserisciCittadinoService(acReq);
		checkSuccesso(acResp);
		
		return Response.status(201).type(MediaType.APPLICATION_JSON).entity(new CittadinoMapper().from(acResp.getCittadino())).build();
	}

}
