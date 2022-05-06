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
import it.csi.apisan.apisancons.business.apisancons.mapper.TipoStatoTipoStatoMapper;
import it.csi.apisan.apisancons.dto.apisancons.TipoStato;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsensoBeService;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaStatoBeResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class StatiConsensoGetService extends ConsRESTBaseService {
	@Autowired
	ConsensoBeService service;
	
	
	public StatiConsensoGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");

		ConsultaStatoBeResponse response = service.consultaStatoBeService(newRequestConsultaCodifiche());
		checkSuccesso(response, "StatoConsensoGetService");
		
		List<TipoStato> listaStati = new TipoStatoTipoStatoMapper().fromList(response.getStati());
		
		return Response.ok(listaStati).build();
	}

}
