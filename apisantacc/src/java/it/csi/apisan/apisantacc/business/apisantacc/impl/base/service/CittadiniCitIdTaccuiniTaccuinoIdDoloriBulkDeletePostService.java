/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseService;
import it.csi.apisan.apisantacc.business.dto.CancellaDoloriRequestExt;
import it.csi.apisan.apisantacc.exception.ErroreBuilder;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.CancellaDoloriResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdDoloriBulkDeletePostService extends TaccTaccuinoRESTBaseService {
		
	CancellaDoloriRequestExt request;

	public CittadiniCitIdTaccuiniTaccuinoIdDoloriBulkDeletePostService(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			List<BigDecimal> payloadDoloreEliminaMassiva, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);		
		
		request = new CancellaDoloriRequestExt(payloadDoloreEliminaMassiva.stream().map(b -> b!=null?b.longValue():null).collect(Collectors.toList()));
		request.setPaziente(citId);
		request.setRichiedente(newRichiedenteTaccuino());
		request.setTaccuino(taccuinoId);
		
	}

	@Override
	protected Response execute() {
		//TODO forse questi controlli sull'header potrebbero essere messi sul costruttore della
		//super classe
		checkNotNull(xRequestID, "xRequestID non impostato");
		checkNotNull(xCodiceServizio, "xRequestID non impostato");
		checkNotNull(shibIdentitaCodiceFiscale, "Cittadino non autenticato");
		checkNotNull(xForwardedFor, "xForwardedFor non impostato");
		
		checkNotBlank(request.getPaziente(), "Codice fiscale cittadino su cui operare non impostato");
		checkNotNull(request.getTaccuino(), "Identificativo taccuino non impostato");
		checkNotNull(request.getListaIdentificaviDolore(), "Dati dolori da rimuovere non impostati");
		checkCondition(request.getListaIdentificaviDolore().size()>0, ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Dati dolori da rimuovere non impostati"));								
	    
	    CancellaDoloriResponse response = taccuinoService.cancellaDolori(request);
	    
	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			
			return Response.ok().build();
		}
	        
	}
}
