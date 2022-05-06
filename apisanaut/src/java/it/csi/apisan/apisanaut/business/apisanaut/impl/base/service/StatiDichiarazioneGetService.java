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
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AutRESTBaseService;
import it.csi.apisan.apisanaut.business.mapper.CodificaStatiDichiarazioneMapper;
import it.csi.apisan.apisanaut.business.mapper.CodificaStatoDelegaMapper;
import it.csi.apisan.apisanaut.dto.apisanaut.Codifica;
import it.csi.deleghe.deleghebe.ws.DelegheCodificheService;
import it.csi.deleghe.deleghebe.ws.model.StatoDichiarazione;
import it.csi.deleghe.deleghebe.ws.msg.LeggiStatiDelega;
import it.csi.deleghe.deleghebe.ws.msg.LeggiStatiDelegaResponse;
import it.csi.deleghe.deleghebe.ws.msg.LeggiStatiDichiarazione;
import it.csi.deleghe.deleghebe.ws.msg.LeggiStatiDichiarazioneResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class StatiDichiarazioneGetService extends AutRESTBaseService {
	private String filter;
	@Autowired
	DelegheCodificheService delegheCodificheService; 
	
	public StatiDichiarazioneGetService(String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.filter = filter;
	}


	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		
		LeggiStatiDichiarazione request = new LeggiStatiDichiarazione();
		request.setRichiedente(newRichiedente());
		
		
		LeggiStatiDichiarazioneResponse resp = delegheCodificheService.leggiStatiDichiarazioneService(request);
		
		checkSuccesso(resp);
		
		List<StatoDichiarazione> lista = resp.getElencoStatoDichiarazione();
		
		if(filter != null) {
			lista = lista.stream().filter(c -> c.getCodice().equalsIgnoreCase(filter)).collect(Collectors.toList());
		}
		
		List<Codifica> result = new CodificaStatiDichiarazioneMapper().fromList(lista) ;
				
		return Response.ok(result).build();
	}

}
