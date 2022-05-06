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
import it.csi.apisan.apisanaut.business.mapper.CodificaTipoDichiarazioneMapper;
import it.csi.apisan.apisanaut.dto.apisanaut.Codifica;
import it.csi.deleghe.deleghebe.ws.DelegheCodificheService;
import it.csi.deleghe.deleghebe.ws.model.TipoDichiarazione;
import it.csi.deleghe.deleghebe.ws.msg.LeggiStatiDichiarazione;
import it.csi.deleghe.deleghebe.ws.msg.LeggiStatiDichiarazioneResponse;
import it.csi.deleghe.deleghebe.ws.msg.LeggiTipiDichiarazione;
import it.csi.deleghe.deleghebe.ws.msg.LeggiTipiDichiarazioneResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class TipiDichiarazioneGetService extends AutRESTBaseService {
	String filter;
	@Autowired
	DelegheCodificheService delegheCodificheService; 
	
	
	public TipiDichiarazioneGetService(String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.filter = filter;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		
		LeggiTipiDichiarazione request = new LeggiTipiDichiarazione();
		request.setRichiedente(newRichiedente());
		
		
		LeggiTipiDichiarazioneResponse resp = delegheCodificheService.leggiTipiDichiarazioneService(request);
		
		checkSuccesso(resp);
		
		List<TipoDichiarazione> lista = resp.getElencoTipoDichiarazione();
		if(filter != null) {
			lista = lista.stream().filter(c -> c.getCodice().equalsIgnoreCase(filter)).collect(Collectors.toList());
		}
		
		List<Codifica> result = new CodificaTipoDichiarazioneMapper().fromList(lista) ;
				
		return Response.ok(result).build();
	}

}
