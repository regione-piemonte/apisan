/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ScerevDelegheRESTBaseService;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelDisponibilitaModelDisponibilitaMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelDisponibilitaModelDisponibilitaMedicoMonitoratoMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelMedicoLoccsiModelAmbulatorioLoccsiMedicoMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelMedicoLoccsiModelMonitoraMedicoMapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelDisponibilita;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoLoccsi;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMonitoraMedico;
import it.csi.apisan.apisanscerev.exception.ErroreBuilder;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdMediciMonitoratiPostService extends ScerevDelegheRESTBaseService {
	private String citId;
	private ModelMonitoraMedico payload;
	@Autowired
	LoccsiServiceClient loccsiService;
	@Autowired
	ScerevServiceClient scerevService;	
	
	
	public CittadiniCitIdMediciMonitoratiPostService(String citId, ModelMonitoraMedico payload, SecurityContext securityContext, HttpHeaders httpHeaders) {
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
		checkUtenteAutorizzatoOrDelegato(citId);
		checkNotNull(payload, "Payloan non valorizzato");
		checkNotNull(payload.getCodiceFiscale(), "Codice fiscale medico non valorizzato");
		checkNotBlank(payload.getCodiceFiscale(), "Codice fiscale medico non valorizzato");
		//checkNotNull(payload.getDisponibilita(),  "Disponibilità medico non valorizzata");
		//checkCondition(checkDisponibilita(payload.getDisponibilita()),  ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("Disponibilita non valida", "Richiesta non consentita").exception());
		
		ModelMedicoLoccsi medico = loccsiService.getMedicoLoccsi(payload.getCodiceFiscale());
		List<it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico> listaMedici = new ArrayList<it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico>();
		listaMedici.add(new ModelMedicoLoccsiModelAmbulatorioLoccsiMedicoMapper().to(medico));
		
		it.csi.apisan.apisanscerev.dto.scerev.ModelMonitoraMedico payloadMonitoraMedico = new ModelMedicoLoccsiModelMonitoraMedicoMapper().to(medico);
		
		List<ModelDisponibilita> listaDisponibilita = new ModelDisponibilitaModelDisponibilitaMapper().fromList(scerevService.postDisponibilita(listaMedici, httpHeaders));
		
		//payloadMonitoraMedico.setDisponibilita(new ModelDisponibilitaModelDisponibilitaMedicoMonitoratoMapper().to(payload.getDisponibilita()) );
		
		checkCondition(checkDisponibilita(listaDisponibilita.get(0)) ,  ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("Medico non monitorabile", "Richiesta non consentita").exception());
		
		payloadMonitoraMedico.setDisponibilita(new ModelDisponibilitaModelDisponibilitaMedicoMonitoratoMapper().to(listaDisponibilita.get(0)) );
		
		scerevService.postMedicoMonitorato(citId, payloadMonitoraMedico, httpHeaders);
		return Response.status(201).build();
	}
	
	
	public boolean checkDisponibilita(ModelDisponibilita disponibilita) {
		return ( disponibilita.isMonitorabile() && (!disponibilita.isSelezionabile() || !disponibilita.isSelezionabileAssistenzaTemporanea() || ! disponibilita.isSelezionabileInfanzia()
				|| ! disponibilita.isSelezionabileRicongiungimentoFamiliare()));
	}

}
