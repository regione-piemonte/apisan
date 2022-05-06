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
import it.csi.apisan.apisancons.business.apisancons.mapper.SottoTipoConsensoSottoTipoConsensoMapper;
import it.csi.apisan.apisancons.dto.apisancons.SottoTipoConsenso;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsensoBeService;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaSottoTipoBeResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class TipologieGetService extends ConsRESTBaseService {
	@Autowired
	ConsensoBeService service;
	
	public TipologieGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		
		
		ConsultaSottoTipoBeResponse response =	service.consultaSottoTipoBeService(newRequestConsultaCodifiche());
		checkSuccesso(response, "ConsultaTipologie");
		
		List<SottoTipoConsenso> listaTipologie = new SottoTipoConsensoSottoTipoConsensoMapper().fromList(response.getSottotipiConsenso()); 
		return Response.ok(listaTipologie).build();
	}

}
