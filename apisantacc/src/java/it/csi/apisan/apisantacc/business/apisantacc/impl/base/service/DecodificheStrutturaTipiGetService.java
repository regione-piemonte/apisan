/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseService;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelContattoStrutturaTipo;
import it.csi.dma.dmaclbluc.GetDecodificaStrutturaTipoRequest;
import it.csi.dma.dmaclbluc.GetDecodificaStrutturaTipoResponse;
import it.csi.dma.dmaclbluc.StrutturaTipo;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DecodificheStrutturaTipiGetService extends TaccTaccuinoRESTBaseService{

	/*public static Map<String, String> strutturaTipi;
	static {
	    strutturaTipi = new HashMap<>();
	    strutturaTipi.put("STRUT_SAN", "Struttura sanitaria");
	    strutturaTipi.put("MNC", "Struttura medicina non convenzionale");
	}*/
	
	public DecodificheStrutturaTipiGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		GetDecodificaStrutturaTipoRequest request= new GetDecodificaStrutturaTipoRequest();
		GetDecodificaStrutturaTipoResponse response = taccuinoService.getDecodificaStrutturaTipo(request);
		
		List<ModelContattoStrutturaTipo> lista = new ArrayList<ModelContattoStrutturaTipo>();
		for (StrutturaTipo strutturaTipo : response.getListaStrutturaTipo().getStrutturaTipo()) {
			ModelContattoStrutturaTipo modelRilevazioneModalita = new ModelContattoStrutturaTipo();
			modelRilevazioneModalita.setCodice(strutturaTipo.getCodice());
			modelRilevazioneModalita.setDescrizione(strutturaTipo.getDescrizione());
			lista.add(modelRilevazioneModalita);
			
		}
		return Response.ok(lista).build();
	}
	/*
	public List<ModelContattoStrutturaTipo> buildList(){
		List<ModelContattoStrutturaTipo> lista = new ArrayList<ModelContattoStrutturaTipo>();
		for (Map.Entry<String, String> entry : strutturaTipi.entrySet()) {
			ModelContattoStrutturaTipo modelRilevazioneModalita = new ModelContattoStrutturaTipo();
			modelRilevazioneModalita.setCodice(entry.getKey());
			modelRilevazioneModalita.setDescrizione(entry.getValue());
			lista.add(modelRilevazioneModalita);
			
		}
		return lista;
	}
	*/

}
