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
import it.csi.apisan.apisanaut.dto.apisanaut.Cittadino;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.msg.AggiornaCittadino;
import it.csi.deleghe.deleghebe.ws.msg.AggiornaCittadinoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfPutService extends AutRESTBaseService {

	@Autowired
	private DelegheCittadiniService delegheCittadiniService;
	
	private String cf;
	private Cittadino cittadino;
	

	public CittadiniCfPutService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String cf, Cittadino cittadino, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		
		this.cf = cf;
		this.cittadino = cittadino;
	}

	@Override
	protected Response execute() {
		String METHOD_NAME = "execute";
		checkUtenteAutorizzato(cf);
		checkCodiceFiscaleValido(cf);
		
		AggiornaCittadino acReq = new AggiornaCittadino();
		acReq.setRichiedente(newRichiedente());
		
		acReq.setCittadino(new CittadinoMapper().to(cittadino));
		AggiornaCittadinoResponse acResp = delegheCittadiniService.aggiornaCittadinoService(acReq);
		checkSuccesso(acResp);
		
		return Response.ok().entity(new CittadinoMapper().from(acResp.getCittadino())).build();
	}

}
