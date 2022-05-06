/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDelegheRESTBaseService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseRESTBaseService;
import it.csi.apisan.apisanfse.dto.apisanfse.Delega;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.integration.arruolamento.dmacc.ArruolabileFSEService;
import it.csi.apisan.apisanfse.util.ApisanFseStatus;
import it.csi.apisan.apisanfse.util.CostantiEtichette;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfConsultazionePreferenzePutService extends FseDelegheRESTBaseService {
		
	@Autowired
	ArruolabileFSEService arruolabileFSEService;
	private String cf;
	

	public CittadiniCfConsultazionePreferenzePutService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio,String xForwardedFor, String cf, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super( securityContext, httpHeaders);
		this.cf = cf;
	}

	@Override
	protected Response execute() {
		final String GRADODELEGAFORTE = "FORTE";
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(cf);
		// 23-02-2021 tolta verifica sul cf come richiesto da Veronica inserita verifica su delega forte 
		Delega delega = new Delega();
		verificaUtenteAutorizzatoODelegato(cf, CostantiEtichette.APPLICAZIONE_VERTICALE_CODICE, delega);
		if(delega != null && !shibIdentitaCodiceFiscale.equalsIgnoreCase(cf)) {
			//metto qui la verifica per non modificare metodi usati da altri
			checkCondition( GRADODELEGAFORTE.equalsIgnoreCase(delega.getGradoDelega()),ErroreBuilder.from(ApisanFseStatus.UTENTE_NON_AUTORIZZATO).exception());
		}
		
	
		String result = arruolabileFSEService.setPreferenzeConsultazione(cf);
		
		if(result.equals("false")) {
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Impossibile settare la preferenza").exception();
		}
		
		
		return Response.status(Status.NO_CONTENT).build();
		
		
	}

}
