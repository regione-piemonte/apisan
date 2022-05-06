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
import it.csi.apisan.apisanaut.business.mapper.DichiarazioneMapper;
import it.csi.apisan.apisanaut.dto.apisanaut.Dichiarazione;
import it.csi.apisan.apisanaut.exception.ErroreBuilder;
import it.csi.apisan.apisanaut.util.ApisanAutStatus;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.msg.AggiornaDichiarazione;
import it.csi.deleghe.deleghebe.ws.msg.AggiornaDichiarazioneResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfDichiarazioniIdDichiarazionePutService extends AutRESTBaseService {
	
	@Autowired
	private DelegheCittadiniService delegheCittadiniService;

	private String cf;
	private String uuidDichiarazione;
	private Dichiarazione dichiarazione;
	

	public CittadiniCfDichiarazioniIdDichiarazionePutService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, String uuidDichiarazione, Dichiarazione dichiarazione,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		
		this.cf = cf;
		this.uuidDichiarazione = uuidDichiarazione;
		this.dichiarazione = dichiarazione;
		
	}

	@Override
	protected Response execute() {
		checkUtenteAutorizzato(cf);
		checkCodiceFiscaleValido(cf);
		checkNotNull(dichiarazione, ErroreBuilder.from(ApisanAutStatus.PARAMETRO_NON_VALIDO, "dichiarazione").dettaglio("parametro", "dichiarazione").exception());
		checkNotNull(uuidDichiarazione, ErroreBuilder.from(ApisanAutStatus.PARAMETRO_NON_VALIDO, "uuidDichiarazione").dettaglio("parametro", "id dichiarazione").exception());
		
		AggiornaDichiarazione req = new AggiornaDichiarazione();
		req.setRichiedente(newRichiedente());
		
		dichiarazione.setUuid(uuidDichiarazione);
		req.setDichiarazione(new DichiarazioneMapper().to(dichiarazione));
		AggiornaDichiarazioneResponse response = delegheCittadiniService.aggiornaDichiarazioneService(req);
		checkSuccesso(response);
		
		return Response.status(201).type(MediaType.APPLICATION_JSON).entity(new DichiarazioneMapper().from(response.getDichiarazione())).build();
	}

}
