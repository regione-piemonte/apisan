/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseRESTBaseService;
import it.csi.apisan.apisanfse.business.integration.dao.ApisanDTipoEpisodioDao;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelTipoEpisodio;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DecodificheDocumentiTipiEpisodioGetService extends FseRESTBaseService {
	@Autowired
	ApisanDTipoEpisodioDao episodioDao;
	
	public DecodificheDocumentiTipiEpisodioGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);

	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request id non valorizzata");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		
		List<ModelTipoEpisodio> res = episodioDao.getTipiEpisodio();
		
		return Response.ok().entity(res).build();
	}

}
