/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

import java.util.Arrays;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AutRESTBaseService;
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaServizio;
import it.csi.apisan.apisanaut.exception.ErroreBuilder;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.msg.RinunciaDelegato;
import it.csi.deleghe.deleghebe.ws.msg.RinunciaDelegatoResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfDelegantiCfdeleganteServiziUuidPutService extends AutRESTBaseService {
	
	@Autowired
	private DelegheCittadiniService delegheCittadiniService;
	
	private String cf; 
	private String cfdelegante; 
	private String uuid;
	private DelegaServizio delegheServizio; 
	
	public CittadiniCfDelegantiCfdeleganteServiziUuidPutService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, String cfdelegante, String uuid, DelegaServizio delegheServizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.cf = cf;
		this.cfdelegante = cfdelegante;
		this.uuid = uuid;
		this.delegheServizio = delegheServizio;
	}



	@Override
	protected Response execute() {
		checkUtenteAutorizzato(cf);
		checkCodiceFiscaleValido(cf);
		checkParamDelegheServizio();
		//checkStatoRinuncia();
		
		RinunciaDelegato req = new RinunciaDelegato();
		req.setRichiedente(newRichiedente());

		Cittadino cittadinoDelegato = new Cittadino();
		cittadinoDelegato.setCodiceFiscale(cf);
		req.setCittadinoDelegato(cittadinoDelegato);

		Cittadino cittadinoDelegante = new Cittadino();
		cittadinoDelegante.setCodiceFiscale(cfdelegante);
		req.setCittadinoDelegante(cittadinoDelegante);

		req.setUuidDelegaServizii(Arrays.asList(uuid));
		
		
		
		RinunciaDelegatoResponse rdRes = delegheCittadiniService.rinunciaDelegatoService(req);
		checkSuccesso(rdRes);

		return Response.ok().build();
	}


	private void checkParamDelegheServizio() {
		checkNotNull(delegheServizio, "Parametro deleghe servizio obbligatorio");
	}



	/**
	 * Controlla che lo stato che si vuole modificare sia "RIUNCIATO" in quanto il servizio 
	 * {@link DelegheCittadiniService} per ora implementa solo la funzione di rinunciaDelegatoService.
	 */
	private void checkStatoRinuncia() {
		//NB: per ora il servizio delegheCittadiniService prevede solo la funzione rinuncia!
		if(!"RINUNCIATO".equals(delegheServizio.getStatoDelega())) { //TODO verificare correttezza del codice RINUNCIATO
			
			throw ErroreBuilder.from(Status.BAD_REQUEST)
				.title("Per ora è implemenato solo il passaggio a stato Rinuncia")
				.dettaglio("IMPL", "Per ora è implemenato solo il passaggio a stato Rinuncia")
				.exception();
		}
	}

}
