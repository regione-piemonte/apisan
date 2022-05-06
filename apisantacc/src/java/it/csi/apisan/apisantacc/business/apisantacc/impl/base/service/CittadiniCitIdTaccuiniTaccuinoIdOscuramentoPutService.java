/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseServiceExt;
import it.csi.apisan.apisantacc.business.mapper.ModelPreferenzaPreferenzaMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelPreferenza;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadOscuratoModifica;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.SetOscuramentoTaccuinoRequest;
import it.csi.dma.dmaclbluc.SetOscuramentoTaccuinoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdOscuramentoPutService extends TaccTaccuinoRESTBaseServiceExt {
	
	private PayloadOscuratoModifica payloadOscuratoModifica;
	SetOscuramentoTaccuinoRequest setOscuramentoTaccuinoRequest = new SetOscuramentoTaccuinoRequest();
	
	public CittadiniCitIdTaccuiniTaccuinoIdOscuramentoPutService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadOscuratoModifica payloadOscuratoModifica, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);
		setOscuramentoTaccuinoRequest.setRichiedente(newRichiedenteTaccuino());
		setOscuramentoTaccuinoRequest.setPaziente(citId);
		setOscuramentoTaccuinoRequest.setTaccuino(taccuinoId);;
		this.payloadOscuratoModifica=payloadOscuratoModifica;
	}

	@Override
	protected Response execute() {

		checkNotNull(this.payloadOscuratoModifica, "Dati Oscuramento da inserire non impostati");		
		
		
		setOscuramentoTaccuinoRequest.setOscurato(payloadOscuratoModifica.isOscurato()?"S":"N");
		
		
		SetOscuramentoTaccuinoResponse response = taccuinoService.setOscuramentoTaccuino(setOscuramentoTaccuinoRequest);

	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			PayloadOscuratoModifica oscurato= new PayloadOscuratoModifica();
			oscurato.setOscurato("S".equalsIgnoreCase(response.getOscurato())?new Boolean(true):new Boolean(false));
			return Response.ok(oscurato).build();
		}
				
	}

}
