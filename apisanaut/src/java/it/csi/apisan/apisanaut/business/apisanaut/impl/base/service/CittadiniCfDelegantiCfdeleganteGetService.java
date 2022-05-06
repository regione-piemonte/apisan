/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AutRESTBaseService;
import it.csi.apisan.apisanaut.business.mapper.DelegaCittadinoMapper;
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaCittadino;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.msg.GetDeleganti;
import it.csi.deleghe.deleghebe.ws.msg.GetDelegantiResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfDelegantiCfdeleganteGetService extends AutRESTBaseService {
	
	@Autowired
	private DelegheCittadiniService delegheCittadiniService;
	
	private String cf;
	private String cfdelegante; 
	

	public CittadiniCfDelegantiCfdeleganteGetService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, String cfdelegante, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.cf = cf;
		this.cfdelegante = cfdelegante;
	}



	@Override
	protected Response execute() {
		checkUtenteAutorizzato(cf);
		checkCodiceFiscaleValido(cf);
		
		
		GetDeleganti req = new GetDeleganti();
		req.setRichiedente(newRichiedente());

		Cittadino cittadinoDelegato = new Cittadino();
		cittadinoDelegato.setCodiceFiscale(cf);
		req.setCittadinoDelegato(cittadinoDelegato);

		Cittadino cittadinoDelegante = new Cittadino();
		cittadinoDelegante.setCodiceFiscale(cfdelegante);
		req.setCittadinoDelegante(cittadinoDelegante);

		GetDelegantiResponse gdResp = delegheCittadiniService.getDelegantiService(req);
		checkSuccesso(gdResp);

		List<DelegaCittadino> result = new DelegaCittadinoMapper().fromList(gdResp.getDeleganti());

		return Response.ok(result).build();
	}

}
