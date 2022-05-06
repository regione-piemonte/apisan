/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

import java.util.Arrays;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
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
import it.csi.deleghe.deleghebe.ws.msg.SaveDelegati;
import it.csi.deleghe.deleghebe.ws.msg.SaveDelegatiResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfDelegatiCfdelegatoPutService extends AutRESTBaseService {

	@Autowired
	private DelegheCittadiniService delegheCittadiniService;
	
	String cfdelegato;
	String cf;
	DelegaCittadino cittadinoDelega;
	
	
	public CittadiniCfDelegatiCfdelegatoPutService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cfdelegato, String cf, DelegaCittadino cittadinoDelega,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale,xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.cfdelegato = cfdelegato;
		this.cf = cf;
		this.cittadinoDelega = cittadinoDelega;
	}


	@Override
	protected Response execute() {
		
		checkUtenteAutorizzato(cf);
		checkCodiceFiscaleValido(cf);
		
		SaveDelegati req = new SaveDelegati();
		req.setRichiedente(newRichiedente());

		Cittadino cittadinoDelegante = new Cittadino();
		cittadinoDelegante.setCodiceFiscale(cf);
		req.setCittadinoDelegante(cittadinoDelegante);

		req.setDelegati(Arrays.asList(new DelegaCittadinoMapper().to(cittadinoDelega)));

		SaveDelegatiResponse sdRes = delegheCittadiniService.saveDelegatiService(req);
		checkSuccesso(sdRes);
		

		if (sdRes.getDelegati().size() != 1) {
			return Response.status(Status.SEE_OTHER)
					.entity("Risposta errata del servizio. Uno ed un solo Delegato atteso nella Response.").build();
		}

		it.csi.deleghe.deleghebe.ws.model.DelegaCittadino delegaCittadino = sdRes.getDelegati().get(0);
		DelegaCittadino result = new DelegaCittadinoMapper().from(delegaCittadino);

		return Response.ok(result).build();
	}

}
