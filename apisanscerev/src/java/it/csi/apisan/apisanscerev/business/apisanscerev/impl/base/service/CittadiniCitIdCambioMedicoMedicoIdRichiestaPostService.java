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
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.CittadinoModelDelegatoMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelCambioMedicoRichiestaModelCambioMedicoRichiestaMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelMedicoLoccsiModelAmbulatorioLoccsiMedicoMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.PayloadCambioMedicoPayload1Mapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoLoccsi;
import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadCambioMedico;
import it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta;
import it.csi.apisan.apisanscerev.dto.scerev.Payload1;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.model.Richiedente;
import it.csi.deleghe.deleghebe.ws.msg.RicercaCittadini;
import it.csi.deleghe.deleghebe.ws.msg.RicercaCittadiniResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdCambioMedicoMedicoIdRichiestaPostService extends ScerevDelegheRESTBaseService {
	
	String citId;
	String medicoId;
	PayloadCambioMedico payload;
	@Autowired
	LoccsiServiceClient loccsiService;
	@Autowired
	ScerevServiceClient scerevService;	
	
	public CittadiniCitIdCambioMedicoMedicoIdRichiestaPostService(String citId, String medicoId, PayloadCambioMedico payload,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.medicoId = medicoId;
		this.payload = payload;		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotNull(payload, "Payload non valorizzato");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		
		
		
		ModelMedicoLoccsi medico = loccsiService.getMedicoLoccsi(medicoId);
		ModelAmbulatorioLoccsiMedico medicoPayload = new ModelMedicoLoccsiModelAmbulatorioLoccsiMedicoMapper().to(medico);
		
		Payload1 payload1 = new PayloadCambioMedicoPayload1Mapper().to(payload);
		
		payload1.setMedico(medicoPayload);
		
		if(!shibIdentitaCodiceFiscale.equalsIgnoreCase(citId)) {
			//devo ricercare il delegato
			RicercaCittadini rcReq = new RicercaCittadini();
			Cittadino cittadinoDeleghe = new Cittadino();
			cittadinoDeleghe.setCodiceFiscale(shibIdentitaCodiceFiscale);
			rcReq.setRichiedente(newRichiedenteDeleghe());
			rcReq.setCittadino(cittadinoDeleghe);
			RicercaCittadiniResponse cittadinoResp = delegheCittadiniService.ricercaCittadiniService(rcReq);
			Cittadino cittDelegato = cittadinoResp.getCittadini().get(0);
			
			payload1.setDelegato(new CittadinoModelDelegatoMapper().to(cittDelegato));
		}
		
		ModelCambioMedicoRichiesta modelCambioRic = scerevService.postCambioMedicoRichiesta(citId, payload1, httpHeaders);
		it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiesta modelResp = new ModelCambioMedicoRichiestaModelCambioMedicoRichiestaMapper().from(modelCambioRic);
		return Response.status(201).entity(modelResp).build();
	}
	
	
	protected Richiedente newRichiedenteDeleghe() {
		return new Richiedente(xRequestID, xCodiceServizio, shibIdentitaCodiceFiscale);
	}
}
