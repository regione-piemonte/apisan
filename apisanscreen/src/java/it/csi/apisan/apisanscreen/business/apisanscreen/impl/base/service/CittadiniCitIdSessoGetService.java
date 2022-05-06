/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ScreenDelegheRESTBaseService;
import it.csi.apisan.apisanscreen.business.mapper.ModelCittadinoSessoMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelCittadinoSesso;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.ScreenServiziWebSOL;
import it.csi.screenserviziwebsol.VerificaAssistita;
import it.csi.screenserviziwebsol.VerificaAssistitaFaultException;
import it.csi.screenserviziwebsol.VerificaAssistitaInParametersType;
import it.csi.screenserviziwebsol.VerificaAssistitaOutParametersType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdSessoGetService extends ScreenDelegheRESTBaseService {
	private String citId;
	
	@Autowired
	ScreenServiziWebSOL soapClient; 
	
	public CittadiniCitIdSessoGetService(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor,
			String xCodiceServizio, String citId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId = citId;
	}
	

	@Override
	protected Response execute() {
		final String methodName = "execute";
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		checkNotBlank(citId, "Cit Id non valorizzato");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		VerificaAssistita request = new VerificaAssistita();
		
		CredenzialiType credenziali = getCredenzialiType(citId);
		
		VerificaAssistitaInParametersType inParam = new VerificaAssistitaInParametersType();
		inParam.setPCodFiscale(citId);
		request.setCredenziali(credenziali);
		
		
		Holder<ErroriType> errori = new Holder<ErroriType>();
		Holder<VerificaAssistitaOutParametersType> outParam = new Holder<VerificaAssistitaOutParametersType>();
		
		try {
			soapClient.verificaAssistita(credenziali, errori, outParam);
		} catch (VerificaAssistitaFaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio verificaAssistita").exception();
		}
		checkSuccesso(errori, CittadiniCitIdSessoGetService.class);
		
		ModelCittadinoSesso result = new ModelCittadinoSessoMapper().from(outParam.value);
		
		return Response.ok(result).build();
	}

}
