/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseService;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelDoloreIntensita;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.DescrittoreMisurazione;
import it.csi.dma.dmaclbluc.GetDecodificaIntensitaDoloreRequest;
import it.csi.dma.dmaclbluc.GetDecodificaIntensitaDoloreResponse;
import it.csi.dma.dmaclbluc.IntensitaDolore;
import it.csi.dma.dmaclbluc.ListaIntensitaDolore;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DecodificheIntensitaDoloreGetService extends TaccTaccuinoRESTBaseService {
	
	/*public static Map<String, String> doloreIntensita;
	static {
	    doloreIntensita = new HashMap<>();
	    doloreIntensita.put("0", "nessun dolore");
	    doloreIntensita.put("2", "molto lieve");
	    doloreIntensita.put("4", "lieve");
	    doloreIntensita.put("6", "moderato");
	    doloreIntensita.put("8", "forte");
	    doloreIntensita.put("10", "molto forte");
	}
	*/
	public DecodificheIntensitaDoloreGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		
		GetDecodificaIntensitaDoloreRequest request = new GetDecodificaIntensitaDoloreRequest();						
		GetDecodificaIntensitaDoloreResponse response = taccuinoService.getDecodificaIntensitaDolore(request);
		
		if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			List<ModelDoloreIntensita> lista = new ArrayList<ModelDoloreIntensita>();
			for (IntensitaDolore intensitaDolore: response.getListaIntensitaDolore().getIntensitaDolore()) {
				ModelDoloreIntensita modelDoloreIntensita = new ModelDoloreIntensita();
				modelDoloreIntensita.setValore((new Integer(intensitaDolore.getValore())));
				modelDoloreIntensita.setDescrizione(intensitaDolore.getDescrizione());
				lista.add(modelDoloreIntensita);			
			}
			return Response.ok(lista).build();
		}	
	}
	/*
	public List<ModelDoloreIntensita> buildList(){
		List<ModelDoloreIntensita> lista = new ArrayList<ModelDoloreIntensita>();
		for (Map.Entry<String, String> entry : doloreIntensita.entrySet()) {
			ModelDoloreIntensita modelDoloreIntensita = new ModelDoloreIntensita();
			//modelDoloreIntensita.setCodice(entry.getKey());
			modelDoloreIntensita.setDescrizione(entry.getValue());
			lista.add(modelDoloreIntensita);
			
		}
		return lista;
	}
	*/
	

}
