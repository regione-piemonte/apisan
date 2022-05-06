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
import it.csi.apisan.apisantacc.dto.apisantacc.ModelContattoTipo;
import it.csi.dma.dmaclbluc.ContattoTipo;
import it.csi.dma.dmaclbluc.GetDecodificaContattoTipoRequest;
import it.csi.dma.dmaclbluc.GetDecodificaContattoTipoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DecodificheContattoTipiGetService extends TaccTaccuinoRESTBaseService{
	/*
	public static Map<String, String> codificheContattoTipi;
	static {
	    codificheContattoTipi = new HashMap<>();
	    codificheContattoTipi.put("VIS", "visita");
	    codificheContattoTipi.put("RIC", "ricovero");
	    codificheContattoTipi.put("DIA", "diagnostica");
	    codificheContattoTipi.put("TRATMED", "trattamenti medici");
	    codificheContattoTipi.put("PS", "pronto soccorso");
	    codificheContattoTipi.put("ALTRO", "altro");
	}*/


	public DecodificheContattoTipiGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		
		GetDecodificaContattoTipoRequest request = new GetDecodificaContattoTipoRequest();
		GetDecodificaContattoTipoResponse response = taccuinoService.getDecodificaContattoTipo(request);
		
		List<ModelContattoTipo> lista = new ArrayList<ModelContattoTipo>();
		for (ContattoTipo contattoTipo : response.getListaContattoTipo().getContattoTipo()) {
			ModelContattoTipo modelContattoTipo = new ModelContattoTipo();
			modelContattoTipo.setCodice(contattoTipo.getCodice());
			modelContattoTipo.setDescrizione(contattoTipo.getDescrizione());
			lista.add(modelContattoTipo);
			
		}
		return Response.ok(lista).build();
	}

	
	/*
	public List<ModelContattoTipo> buildList(){
		List<ModelContattoTipo> lista = new ArrayList<ModelContattoTipo>();
		for (Map.Entry<String, String> entry : codificheContattoTipi.entrySet()) {
			ModelContattoTipo modelContattoTipo = new ModelContattoTipo();
			modelContattoTipo.setCodice(entry.getKey());
			modelContattoTipo.setDescrizione(entry.getValue());
			lista.add(modelContattoTipo);
			
		}
		return lista;
	}*/
}
