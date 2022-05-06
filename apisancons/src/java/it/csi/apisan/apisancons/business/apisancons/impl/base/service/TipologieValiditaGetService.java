/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancons.business.apisancons.impl.base.ConsRESTBaseService;
import it.csi.apisan.apisancons.business.apisancons.mapper.TipoConsensoTipoConsensoMapper;
import it.csi.apisan.apisancons.dto.apisancons.TipoConsenso;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsensoBeService;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaTipoBeResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class TipologieValiditaGetService extends ConsRESTBaseService {
	@Autowired
	ConsensoBeService service;
	
	public TipologieValiditaGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		
		
		ConsultaTipoBeResponse response =	service.consultaTipoBeService(newRequestConsultaCodifiche());
		checkSuccesso(response, "ConsultaTipologieValidita");
		
		List<TipoConsenso> listaTipologie = new TipoConsensoTipoConsensoMapper().fromList(response.getTipiConsenso());
		
		return Response.ok(listaTipologie).build();
	}

}
