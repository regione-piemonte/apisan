/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseServiceExt;
import it.csi.apisan.apisantacc.business.dto.GenericRequestExt;
import it.csi.apisan.apisantacc.business.mapper.ModelContattoContattiStruttureMapper;
import it.csi.apisan.apisantacc.business.mapper.PayloadContattoStrutturaNuovoContattoStrutturaMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelContatto;
import it.csi.apisan.apisantacc.dto.apisantacc.PayloadContattoStrutturaNuovo;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.SetContattoStrutturaRequest;
import it.csi.dma.dmaclbluc.SetContattoStrutturaResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdContattiStrutturePostService extends TaccTaccuinoRESTBaseServiceExt{
	
	private PayloadContattoStrutturaNuovo payloadContattoStrutturaNuovo;
	
	public CittadiniCitIdTaccuiniTaccuinoIdContattiStrutturePostService(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId,
			PayloadContattoStrutturaNuovo payloadContattoStrutturaNuovo, SecurityContext securityContext,
			HttpHeaders httpHeaders){
		super(shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,xCodiceServizio, securityContext, httpHeaders,citId,taccuinoId);
		this.payloadContattoStrutturaNuovo=payloadContattoStrutturaNuovo;		
	}

	@Override
	protected Response execute() {	
				
		checkNotNull(this.payloadContattoStrutturaNuovo, "Dati contatti con struttuta  da inserire non impostati");										
		
		GenericRequestExt<SetContattoStrutturaRequest> genericRequestExt = new GenericRequestExt<SetContattoStrutturaRequest>(new SetContattoStrutturaRequest(),this);
		SetContattoStrutturaRequest request = genericRequestExt.getRequest();
		request.setContattoStruttura(new PayloadContattoStrutturaNuovoContattoStrutturaMapper().to(this.payloadContattoStrutturaNuovo));		
		SetContattoStrutturaResponse response = taccuinoService.setContattoStruttura(request);

	    if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			ModelContatto contattoStruttura =  new ModelContattoContattiStruttureMapper().from(response.getContattoStruttura());
			return Response.status(Status.CREATED).entity(contattoStruttura).build();
		}
	}

}
