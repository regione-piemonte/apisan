/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.apisanesen.impl.service;

import java.util.StringTokenizer;

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
import it.csi.apisan.apisanesen.exception.ErroreBuilder;
import it.csi.apisan.apisanesen.util.UtilRevoca;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfEsenzioniIdGetService extends EsenRESTBaseService {
	String cf;
	String id;
	String accept;
	String cfBeneficiario;
	@Autowired
	EsenServiceClient client;
	
	public CittadiniCfEsenzioniIdGetService(String cf,String id, String accept, String beneficiarioCf,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.id = id;
		this.accept = accept;
		this.cfBeneficiario = beneficiarioCf;
	}

	@Override
	protected Response execute() {
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(cf);
		//ancora da verificare se serve checkUtenteAutorizzato
		checkUtenteAutorizzato(cf);
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(id, "Filtro non valorizzato");
		checkNotBlank(accept, "Accept non valorizzato");
		checkAcceptValido();
		checkNotNull(cfBeneficiario, ErroreBuilder.from(Status.BAD_REQUEST.getStatusCode(), "cf_beneficiario non valorizzato").exception());
		checkCodiceFiscaleValido(cfBeneficiario);
		UtilRevoca revocaUtil = null;
		try {
			revocaUtil = new UtilRevoca(id);
			
		}catch(java.lang.IndexOutOfBoundsException e) {
			throw  ErroreBuilder.from(Status.BAD_REQUEST).title("Errore nel Parametro path id")
			.dettaglio("ID", "ID non corretto")
			.exception();

		}
		
		//String endPath = "/esenzioni/" + getIdServizioCorretto(id);
		String endPath = "/esenzioni/" + revocaUtil.getIdTrasformato();
		if(accept.equalsIgnoreCase("application/pdf")) {
			byte[] filePdfDecoder = client.getServiceEsenzioniByIdPdf(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, cf, endPath, accept, cfBeneficiario);
			return Response.ok().entity(filePdfDecoder).type("application/pdf").build();
		}else {
			String ret = client.getServiceEsenzioniById(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, cf, endPath, accept, cfBeneficiario);
			return Response.ok(ret).type(MediaType.APPLICATION_JSON).build();
		}
		
	}
	
	
	private String getIdServizioCorretto(String id) {
		StringTokenizer str = new StringTokenizer(id, "-");
		String idRitorno = "";
		if(str.countTokens() == 1) {
			idRitorno = "000-" + id;
		}else {
			String strPrimoToken = str.nextToken();
			
			idRitorno = strPrimoToken.startsWith("010")?  "002-" + id :  "001-" +  strPrimoToken;
		}
		
		return idRitorno;
	}
	
	private void checkAcceptValido() {
		checkCondition((accept.equalsIgnoreCase("application/json") || accept.equalsIgnoreCase("application/pdf")), ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "accept").exception());
	}

}
