/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseService;
import it.csi.apisan.apisantacc.business.mapper.ModelDoloreDoloreMapper;
import it.csi.apisan.apisantacc.business.mapper.PayloadDoloreNuovoDoloreMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelDolore;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadDoloreNuovo;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.SetDoloreRequest;
import it.csi.dma.dmaclbluc.SetDoloreResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdDoloriPostService  extends TaccTaccuinoRESTBaseService {

	private String citId;
	private Long taccuinoId;
	private PayloadDoloreNuovo payloadDoloreNuovo;
	
	public CittadiniCitIdTaccuiniTaccuinoIdDoloriPostService(String shibIdentitaCodiceFiscale, String xRequestId,
	String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
	PayloadDoloreNuovo payloadDoloreNuovo, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId=citId;
		this.taccuinoId=taccuinoId;
		this.payloadDoloreNuovo=payloadDoloreNuovo;
	}

	@Override
	protected Response execute() {
		//TODO forse questi controlli sull'header potrebbero essere messi sul costruttore della
		//super classe
		checkNotNull(xRequestID, "xRequestID non impostato");
		checkNotNull(xCodiceServizio, "xRequestID non impostato");
		checkNotNull(shibIdentitaCodiceFiscale, "Cittadino non autenticato");
		checkNotNull(xForwardedFor, "xForwardedFor non impostato");
		
		checkNotBlank(citId, "Codice fiscale cittadino su cui operare non impostato");
		checkNotNull(taccuinoId, "Identificativo taccuino non impostato");
		checkNotNull(payloadDoloreNuovo, "Dati dolore da inserire non impostati");
		
        SetDoloreRequest request = new SetDoloreRequest();                               
        request.setDolore(new PayloadDoloreNuovoDoloreMapper().to(this.payloadDoloreNuovo));
        request.setPaziente(this.citId);
        request.setRichiedente(newRichiedenteTaccuino());
        request.setTaccuino(this.taccuinoId);        
        
        SetDoloreResponse response = taccuinoService.setDolore(request);        
        
        if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			ModelDolore dolore =  new ModelDoloreDoloreMapper().from(response.getDolore());
			return Response.status(Status.CREATED).entity(dolore).build();
		}
        
	}
}
