/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ScerevRESTBaseService;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelDisponibilitaModelDisponibilitaMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelMedicoLoccsiModelAmbulatorioLoccsiMedicoMapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelDisponibilita;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelMedicoLoccsi;
import it.csi.apisan.apisanscerev.dto.scerev.ModelAmbulatorioLoccsiMedico;
import it.csi.apisan.apisanscerev.exception.RESTException;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MediciMedicoIdGetService extends ScerevRESTBaseService {
	
	private String medicoId;
	@Autowired
	LoccsiServiceClient loccsiClient;
	@Autowired
	ScerevServiceClient scerevService;
	
	
	public MediciMedicoIdGetService(String medicoId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.medicoId = medicoId;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		
		ModelMedicoLoccsi medico = loccsiClient.getMedicoLoccsi(medicoId);
		//Devo aggiungere le disponibilita
		try {
			List<ModelAmbulatorioLoccsiMedico> listaMedici = new ArrayList<ModelAmbulatorioLoccsiMedico>();
			listaMedici.add(new ModelMedicoLoccsiModelAmbulatorioLoccsiMedicoMapper().to(medico));

			List<ModelDisponibilita> listaDisponibilita = new ModelDisponibilitaModelDisponibilitaMapper().fromList(scerevService.postDisponibilita(listaMedici, httpHeaders));
			if(listaDisponibilita != null &&  listaDisponibilita.size() > 0 && listaDisponibilita.get(0) != null ) {
				medico.setDisponibilita(listaDisponibilita.get(0));
			}				

		} catch(RESTException e) {
			log.error("execute", "ERROR", e);
		}
		
		return Response.ok().entity(medico).build();
	}

}
