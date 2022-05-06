/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ScerevDelegheRESTBaseService;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelControlloCombinazioneModelControlloCombinazioneMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelMedicoLoccsiModelAmbulatorioLoccsiMedicoMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.PayloadPayloadMapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoLoccsi;
import it.csi.apisan.apisanscerev.dto.apisanscerev.Payload;
import it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico;
import it.csi.apisan.apisanscerev.dto.scerev.ModelControlloCombinazione;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdControlloCombinazionePostService extends ScerevDelegheRESTBaseService {
	
	String citId;
	Payload payload;
	@Autowired
	LoccsiServiceClient loccsiService;
	@Autowired
	ScerevServiceClient scerevService;	
	
	public CittadiniCitIdControlloCombinazionePostService(String citId,Payload payload, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.payload = payload;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotNull(payload, "Payload non valorizzato");
		checkNotBlank(payload.getCodiceFiscaleMedico(), "Codice Fiscale medico non valorizzato");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		
		ModelMedicoLoccsi medico = loccsiService.getMedicoLoccsi(payload.getCodiceFiscaleMedico());
		
		ModelAmbulatorioLoccsiMedico medicoPayload = new ModelMedicoLoccsiModelAmbulatorioLoccsiMedicoMapper().to(medico);
		
		it.csi.apisan.apisanscerev.dto.scerev.Payload payloadControllo = new PayloadPayloadMapper().to(payload);
		payloadControllo.setMedico(medicoPayload);

		ModelControlloCombinazione respScerev = scerevService.postControlloCombinazione(citId, payloadControllo, httpHeaders);
		
		it.csi.apisan.apisanscerev.dto.apisanscerev.ModelControlloCombinazione resp = new ModelControlloCombinazioneModelControlloCombinazioneMapper().from(respScerev);
		
		return Response.status(201).entity(resp).build();
	}

}
