/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancons.business.apisancons.impl.base.ConsAuraRESTBaseService;
import it.csi.apisan.apisancons.business.apisancons.mapper.ConsensoConsensoMapper;
import it.csi.apisan.apisancons.dto.apisancons.Consenso;
import it.csi.apisan.apisancons.exception.ErroreBuilder;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsensoBeService;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaConsensoBe;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaConsensoBeResponse;
import it.csi.apisan.apisancons.util.ApisanConsStatus;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadinoCfConsensiIdInformativaAslIdAslGetService extends ConsAuraRESTBaseService {
	@Autowired
	ConsensoBeService service;
	String cf; 
	String idInformativa; 
	String idAsl;

	public CittadinoCfConsensiIdInformativaAslIdAslGetService(String cf, String idInformativa, String idAsl, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.idInformativa = idInformativa;
		this.idAsl = idAsl;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkUtenteAutorizzatoOrDelegato(cf);
		
		System.out.println("CittadinoCfConsensiIdInformativaAslIdAslGetService cf: " + cf + " idInformativa: " + idInformativa + " idAsl: " + idAsl);
	ConsultaConsensoBe request = new ConsultaConsensoBe();
		
		request.setFonte(newFonteCittadinoRequest());
		request.setCfCittadino(cf);
		request.setRichiedente(newRichiedente());
		request.setIdInformativa(idInformativa);
		request.setCodAsr(idAsl);
		request.setVerificaAura(true);
		
		ConsultaConsensoBeResponse response =  service.consultaConsensoBeService(request);
		
		checkSuccesso(response, "CittadinoCfConsensiGetService");
		
		List<Consenso> listaConsensi = new ArrayList<Consenso>();
		
		if(erroreNonTrovateOccorrenze(response)) {
						
			throw ErroreBuilder.from(ApisanConsStatus.RISORSA_NON_TROVATA, "CittadinoCfConsensiIdInformativaAslIdAslGetService").title(ApisanConsStatus.RISORSA_NON_TROVATA.getMessage()).exception();
		}
		
		listaConsensi =		new ConsensoConsensoMapper().fromList(response.getConsensi().getConsenso());	
		listaConsensi.forEach(c -> arricchisciCittadinoEDelegato(c));
		return Response.ok(listaConsensi).build();
	}

}
