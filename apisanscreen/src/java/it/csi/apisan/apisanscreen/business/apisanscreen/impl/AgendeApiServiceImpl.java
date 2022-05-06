/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanscreen.business.apisanscreen.AgendeApi;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ServiceExecutor;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.AgendeAgendaIdDateDisponibiliDataOrariDisponibiliGetService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.AgendeAgendaIdDateDisponibiliGetService;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AgendeApiServiceImpl implements AgendeApi {

	public AgendeApiServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Response agendeAgendaIdDateDisponibiliDataOrariDisponibiliGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String agendaId, String data,
			String tipologia, Integer adesioneSpontanea, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(AgendeAgendaIdDateDisponibiliDataOrariDisponibiliGetService.class, agendaId, data, tipologia,  adesioneSpontanea,
				securityContext, httpHeaders);
	}

	@Override
	public Response agendeAgendaIdDateDisponibiliGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String agendaId, String tipologia, String mese, String anno,
			Integer adesioneSpontanea, SecurityContext securityContext, HttpHeaders httpHeaders) {

		return ServiceExecutor.execute(AgendeAgendaIdDateDisponibiliGetService.class, agendaId, tipologia, mese, anno, adesioneSpontanea,
				securityContext, httpHeaders);
	}
	
	

}
