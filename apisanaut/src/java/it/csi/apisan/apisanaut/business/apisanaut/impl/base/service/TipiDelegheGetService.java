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
import org.springframework.stereotype.Service;

import io.swagger.annotations.Scope;
import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AutRESTBaseService;
import it.csi.apisan.apisanaut.business.mapper.CodificaTipoDelegaMapper;
import it.csi.apisan.apisanaut.dto.apisanaut.Codifica;
import it.csi.deleghe.deleghebe.ws.DelegheCodificheService;
import it.csi.deleghe.deleghebe.ws.model.Richiedente;
import it.csi.deleghe.deleghebe.ws.model.TipoDelega;
import it.csi.deleghe.deleghebe.ws.msg.LeggiTipiDelega;
import it.csi.deleghe.deleghebe.ws.msg.LeggiTipiDelegaResponse;


@Service
@org.springframework.context.annotation.Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class TipiDelegheGetService extends AutRESTBaseService {
	String filter;
	@Autowired
	DelegheCodificheService delegheCodificheService; 
	
	public TipiDelegheGetService(String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.filter = filter;
	}

	
	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		
		LeggiTipiDelega request = new LeggiTipiDelega();
		request.setRichiedente(newRichiedente());
		
		
		LeggiTipiDelegaResponse resp = delegheCodificheService.leggiTipiDelegaService(request);
		
		checkSuccesso(resp);
		
		List<TipoDelega> lista = resp.getElencoTipoDelega();
		
		if(filter != null) {
			lista = lista.stream().filter(c-> c.getCodice().equalsIgnoreCase(filter)).collect(Collectors.toList());
		}
		
		List<Codifica> result = new CodificaTipoDelegaMapper().fromList(lista) ;
				
		return Response.ok(result).build();
	}

}
