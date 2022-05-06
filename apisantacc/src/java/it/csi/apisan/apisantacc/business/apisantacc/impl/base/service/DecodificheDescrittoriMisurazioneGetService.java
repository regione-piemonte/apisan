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

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseService;
import it.csi.apisan.apisantacc.business.mapper.ModelDoloreDoloreMapper;
import it.csi.apisan.apisantacc.business.mapper.ModelUnitaMisuraDecodificaDescrittoreMisurazioneMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelDolore;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelUnitaMisuraDecodifica;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.DescrittoreMisurazione;
import it.csi.dma.dmaclbluc.GetDescrittoriMisurazioneRequest;
import it.csi.dma.dmaclbluc.GetDescrittoriMisurazioneResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DecodificheDescrittoriMisurazioneGetService  extends TaccTaccuinoRESTBaseService {
	
	public DecodificheDescrittoriMisurazioneGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}

	@Override
	protected Response execute() {

		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		
		GetDescrittoriMisurazioneRequest request = new GetDescrittoriMisurazioneRequest();				
		
		GetDescrittoriMisurazioneResponse response = taccuinoService.getDescrittoriMisurazione(request);
		
		if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			List<ModelUnitaMisuraDecodifica> modelUnitaMisuraDecodifica =  new ModelUnitaMisuraDecodificaDescrittoreMisurazioneMapper().fromList(response.getListaDescrittoreMisurazione().getDescrittoreMisurazione());
			//List<String> unitaMisuraCodice = response.getListaDescrittoreMisurazione().getDescrittoreMisurazione().stream().map(DescrittoreMisurazione::getUnitaMisuraCodice).collect(Collectors.toList());
			return Response.ok(modelUnitaMisuraDecodifica).build();
		}
		
	}

}
