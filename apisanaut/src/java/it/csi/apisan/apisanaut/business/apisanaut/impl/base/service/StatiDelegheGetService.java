/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AutRESTBaseService;
import it.csi.apisan.apisanaut.business.mapper.CodificaStatoDelegaMapper;
import it.csi.apisan.apisanaut.business.mapper.CodificaTipoDelegaMapper;
import it.csi.apisan.apisanaut.dto.apisanaut.Codifica;
import it.csi.deleghe.deleghebe.ws.DelegheCodificheService;
import it.csi.deleghe.deleghebe.ws.model.StatoDelega;
import it.csi.deleghe.deleghebe.ws.msg.LeggiStatiDelega;
import it.csi.deleghe.deleghebe.ws.msg.LeggiStatiDelegaResponse;
import it.csi.deleghe.deleghebe.ws.msg.LeggiTipiDelega;
import it.csi.deleghe.deleghebe.ws.msg.LeggiTipiDelegaResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class StatiDelegheGetService extends AutRESTBaseService {
	private String filter;
	@Autowired
	DelegheCodificheService delegheCodificheService; 
	
	public StatiDelegheGetService(String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.filter = filter;
	}


	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		
		LeggiStatiDelega request = new LeggiStatiDelega();
		request.setRichiedente(newRichiedente());
		
		
		LeggiStatiDelegaResponse resp = delegheCodificheService.leggiStatiDelegaService(request);
		
		checkSuccesso(resp);
		
		List<StatoDelega> statiDelega = resp.getElencoStatoDelega();
		
		if(filter != null) {
			statiDelega = statiDelega.stream().filter(c -> c.getCodice().equalsIgnoreCase(filter)).collect(Collectors.toList());
		}
		
		List<Codifica> result = new CodificaStatoDelegaMapper().fromList(statiDelega) ;
				
		return Response.ok(result).build();
	}

}
