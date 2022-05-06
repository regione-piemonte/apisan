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

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ScerevStampeRESTBaseService;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelMedicoLoccsiModelAmbulatorioLoccsiMedicoMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.PayloadDelegantePayload3Mapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoLoccsi;
import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadDelegante;
import it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico;
import it.csi.apisan.apisanscerev.dto.scerev.Payload3;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdModuloDelegantePdfPostService extends ScerevStampeRESTBaseService {
	
	private String citId;
	private PayloadDelegante payloadDelegante;
	@Autowired
	LoccsiServiceClient loccsiService;	
	@Autowired
	ScerevServiceClient scerevService;	
	
	public CittadiniCitIdModuloDelegantePdfPostService(String citId, PayloadDelegante payloadDelegante,
			String contentDisposition, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.payloadDelegante = payloadDelegante;
		this.fileName = "modulo-delegante.pdf";
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(citId, "Id cittadino valorizzato");
		checkNotNull(payloadDelegante, "Payolad non valorizzato");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		Payload3 payloadStampa = new PayloadDelegantePayload3Mapper().to(payloadDelegante);	
		ModelMedicoLoccsi medico = loccsiService.getMedicoLoccsi(payloadDelegante.getCodiceFiscaleMedico());
		ModelAmbulatorioLoccsiMedico medicoPayload = new ModelMedicoLoccsiModelAmbulatorioLoccsiMedicoMapper().to(medico);
		payloadStampa.setMedico(medicoPayload);
		byte[] biteResp = scerevService.postModuloDelegantePdf(httpHeaders, citId, payloadStampa, contentDisposition);
		
		return Response.ok().entity(biteResp).type("application/pdf").build();
	}

}
