/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseServiceExt;
import it.csi.apisan.apisantacc.business.mapper.ModelNoteGeneraliNotaGeneraleMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelNoteGenerali;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadNoteGeneraliModifica;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.NotaGeneraleRequest;
import it.csi.dma.dmaclbluc.SetNotaGeneraleRequest;
import it.csi.dma.dmaclbluc.SetNotaGeneraleResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdNotaGeneralePutService extends TaccTaccuinoRESTBaseServiceExt {
	
	private PayloadNoteGeneraliModifica payloadNoteGeneraliModifica;
	SetNotaGeneraleRequest request = new SetNotaGeneraleRequest();
	
	public CittadiniCitIdTaccuiniTaccuinoIdNotaGeneralePutService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadNoteGeneraliModifica payloadNoteGeneraliModifica, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);
		request.setRichiedente(newRichiedenteTaccuino());
		request.setPaziente(citId);
		request.setTaccuino(taccuinoId);;
		this.payloadNoteGeneraliModifica=payloadNoteGeneraliModifica;
	}

	@Override
	protected Response execute() {

		checkNotNull(this.payloadNoteGeneraliModifica, "Dati per Nota Generale da inserire non impostati");		
		
		
		NotaGeneraleRequest value= new NotaGeneraleRequest();
		if (payloadNoteGeneraliModifica.getStatoSalute()!=null)
			value.setStatoSalute(payloadNoteGeneraliModifica.getStatoSalute());
		if (payloadNoteGeneraliModifica.getStileVita()!=null)
			value.setStileVita(payloadNoteGeneraliModifica.getStileVita());
		request.setNotaGenerale(value);
		
		
		SetNotaGeneraleResponse response = taccuinoService.setNotaGenerale(request);

	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			ModelNoteGenerali notaGenerale =  new ModelNoteGeneraliNotaGeneraleMapper().from(response.getNotaGenerale());
			return Response.ok(notaGenerale).build();
		}
				
	}

}
