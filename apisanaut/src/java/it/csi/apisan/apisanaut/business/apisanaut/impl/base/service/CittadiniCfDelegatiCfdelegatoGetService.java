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
import it.csi.apisan.apisanaut.business.mapper.DelegaCittadinoMapper;
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaCittadino;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.msg.GetDelegati;
import it.csi.deleghe.deleghebe.ws.msg.GetDelegatiResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfDelegatiCfdelegatoGetService extends AutRESTBaseService {

	@Autowired
	private DelegheCittadiniService delegheCittadiniService;
	
	private String cf;
	private String cfdelegato;
	
	
	public CittadiniCfDelegatiCfdelegatoGetService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, String cfdelegato, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale,xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.cf = cf;
		this.cfdelegato = cfdelegato;
	}


	@Override
	protected Response execute() {
		checkUtenteAutorizzato(cf);
		checkCodiceFiscaleValido(cf);
		
		GetDelegati req = new GetDelegati();
		req.setRichiedente(newRichiedente());
		
		Cittadino cittadinoDelegante = new Cittadino();
		cittadinoDelegante.setCodiceFiscale(cf);
		req.setCittadinoDelegante(cittadinoDelegante);

		Cittadino cittadinoDelegato = new Cittadino();
		cittadinoDelegato.setCodiceFiscale(cfdelegato);
		req.setCittadinoDelegato(cittadinoDelegato);

		GetDelegatiResponse gdRes = delegheCittadiniService.getDelegatiService(req);
		checkSuccesso(gdRes, false);

		//DelegaCittadino result = new DelegaCittadinoMapper().fromList(gdRes.getDelegati()).isEmpty()? null : .get(0);
		
		DelegaCittadino result = new DelegaCittadinoMapper().fromList(gdRes.getDelegati()).get(0);
		return Response.ok(result).build();
	}

}
