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

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseServiceExt;
import it.csi.apisan.apisantacc.business.dto.GenericRequestExt;
import it.csi.apisan.apisantacc.business.dto.ListaPreferenzeRequestExt;
import it.csi.apisan.apisantacc.business.mapper.ModelPreferenzaPreferenzaMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelPreferenza;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadPreferenzaModifica;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.PreferenzaRequest;
import it.csi.dma.dmaclbluc.SetImpostazioniTaccuinoRequest;
import it.csi.dma.dmaclbluc.SetImpostazioniTaccuinoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdPreferenzePutService extends TaccTaccuinoRESTBaseServiceExt {
	
	private List<PayloadPreferenzaModifica> payloadPreferenzaModifica;
	
	public CittadiniCitIdTaccuiniTaccuinoIdPreferenzePutService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			List<PayloadPreferenzaModifica> payloadPreferenzaModifica, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);
		this.payloadPreferenzaModifica=payloadPreferenzaModifica;
		
	}

	@Override
	protected Response execute() {

		checkNotNull(this.payloadPreferenzaModifica, "Dati Preferenza da inserire non impostati");		
		SetImpostazioniTaccuinoRequest setImpostazioniTaccuinoRequest = new SetImpostazioniTaccuinoRequest();
		
		
		
		ListaPreferenzeRequestExt listaPreferenzeRequest = new ListaPreferenzeRequestExt(payloadPreferenzaModifica.stream().map(
				s -> {
					PreferenzaRequest preferenzaRequest = new PreferenzaRequest();
					preferenzaRequest.setId(s.getId());	
					preferenzaRequest.setVisibile(s.isVisibile()?"1":"0");
					if(s.getEntitaCodice()!=null) {
						preferenzaRequest.setCodiceEntita(s.getEntitaCodice().name());
					}
					if(s.getGruppoCodice()!=null) {
						preferenzaRequest.setCodiceGruppo(s.getGruppoCodice());
					}
					return preferenzaRequest;
				}).collect(Collectors.toList()));
		
		setImpostazioniTaccuinoRequest.setListaPreferenze(listaPreferenzeRequest);
		
		GenericRequestExt<SetImpostazioniTaccuinoRequest> genericRequestExt = new GenericRequestExt<SetImpostazioniTaccuinoRequest>(setImpostazioniTaccuinoRequest,this);
		SetImpostazioniTaccuinoRequest request = genericRequestExt.getRequest();			
		SetImpostazioniTaccuinoResponse response = taccuinoService.setImpostazioniTaccuino(request);

	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			List<ModelPreferenza> preferenze =  new ModelPreferenzaPreferenzaMapper().fromList(response.getListaPreferenze().getPreferenza());
			return Response.ok(preferenze).build();
		}
				
	}

}
