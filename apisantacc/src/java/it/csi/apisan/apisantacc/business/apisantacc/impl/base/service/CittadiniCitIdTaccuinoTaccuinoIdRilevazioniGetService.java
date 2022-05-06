/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseService;
import it.csi.apisan.apisantacc.business.mapper.ModelRilevazioneRilevazioneResponseMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazione;
import it.csi.apisan.apisantacc.dto.apisantacc.ResponseRilevazioni;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.GetRilevazioniRequest;
import it.csi.dma.dmaclbluc.GetRilevazioniResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuinoTaccuinoIdRilevazioniGetService extends TaccTaccuinoRESTBaseService {


	String citId;
	Long taccuinoId;
	String gruppo;
	String descrittore;
	Integer limit;
	Integer offset;
	String ordinamento;
	String da;
	String a;

	public CittadiniCitIdTaccuinoTaccuinoIdRilevazioniGetService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId, String gruppo, String descrittore, Integer limit,
			Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId = citId;
		this.taccuinoId = taccuinoId;
		this.gruppo = gruppo;
		this.descrittore = descrittore; 
		this.limit = limit;
		this.offset = offset;
		this.ordinamento = ordinamento;
		this.da = da;
		this.a = a;

	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(citId);
		checkNotNull(taccuinoId, "Taccuino id non valorizzato");
		
		GetRilevazioniRequest request = new GetRilevazioniRequest();
		request= (GetRilevazioniRequest)setGenericGetRequest(request, taccuinoId, limit, offset, ordinamento, da, a);
		request.setPaziente(this.citId);
		request.getListaCodiceGruppo().add(gruppo);
		request.getListaCodiceDescrittore().add(descrittore);
		
		GetRilevazioniResponse response = taccuinoService.getRilevazioni(request);
	
		if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			ResponseRilevazioni responseRilevazioni = new ResponseRilevazioni();						
			List<ModelRilevazione> modelRilevazione = response.getListaRilevazioni().getRilevazione().stream().map(r -> new ModelRilevazioneRilevazioneResponseMapper().from(r)).collect(Collectors.toList());
			responseRilevazioni.setLista(modelRilevazione);
			return Response.ok(responseRilevazioni).build();
		}
		

	}


	
}
