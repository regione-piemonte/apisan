/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen.impl.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanesen.business.apisanesen.impl.base.EsenRESTBaseService;
import it.csi.apisan.apisanesen.dto.apisanesen.Revoca;
import it.csi.apisan.apisanesen.exception.ErroreBuilder;
import it.csi.apisan.apisanesen.util.TipoRevoca;
import it.csi.apisan.apisanesen.util.UtilRevoca;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfEsenzioniIdRevocaPutService extends EsenRESTBaseService {
	String cf;
	String id;
	Revoca revocaBody;
	
	@Autowired
	EsenServiceClient client;
	
	public CittadiniCfEsenzioniIdRevocaPutService(String cf,String id,  Revoca revocaBody, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.id = id;
		this.revocaBody = revocaBody;
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(cf);
		//ancora da verificare se serve checkUtenteAutorizzato
		checkUtenteAutorizzato(cf);
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotNull(revocaBody, ErroreBuilder.from(Status.BAD_REQUEST.getStatusCode(), "Motivazione revoca non valorizzata").exception());
		
		UtilRevoca revocaUtil = null;
		try {
			revocaUtil = new UtilRevoca(id);
			
		}catch(java.lang.IndexOutOfBoundsException e) {
			throw  ErroreBuilder.from(Status.BAD_REQUEST).title("Errore nel Parametro path id")
			.dettaglio("ID", "ID non corretto")
			.exception();

		}
		String ret = "";
		if(revocaUtil.getTipoRevoca().equals(TipoRevoca.AUTOCERTIFICATA_SISTEMA_ESTERNO.getTipoRevoca())) {
			throw  ErroreBuilder.from(Status.BAD_REQUEST).title("Errore nel Parametro path id")
			.dettaglio("ID", "ID ESENZIONE AUTOCERTIFICATA SISTEMA ESTERNO non gestito")
			.exception();
		}
		
		if(revocaUtil.getTipoRevoca().equals(TipoRevoca.AUTOCERTIFICATA.getTipoRevoca())) {	
			String cfBeneficiario = revocaBody.getCfBeneficiario();
			checkNotNull(cfBeneficiario, ErroreBuilder.from(Status.BAD_REQUEST.getStatusCode(), "cf_beneficiario non valorizzato").exception());
			checkCodiceFiscaleValido(cfBeneficiario);
			
			ret = client.modificaEsenzione(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, cf, id, revocaBody, cfBeneficiario);			
		} else {
			String codEsenzione = revocaBody.getCodiceEsenzione();
			checkNotNull(codEsenzione, ErroreBuilder.from(Status.BAD_REQUEST.getStatusCode(), "codice_esenzione non valorizzata").exception());
			String dataInizio = revocaUtil.getDataInizio();
			
			ret = client.modificaEsenzioneCertificata(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, cf, codEsenzione, dataInizio, revocaBody);
		}
 		
		
		

		return Response.ok(ret).type(MediaType.APPLICATION_JSON).build();
	}

}
