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
import it.csi.apisan.apisanscreen.business.mapper.ModelDocumentoDettaglioGetDettaglioDocumentoDigitaleOutParametersTypeMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelDocumentoDettaglio;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.GetDettaglioDocumentoDigitaleFaultException;
import it.csi.screenserviziwebsol.GetDettaglioDocumentoDigitaleInParametersType;
import it.csi.screenserviziwebsol.GetDettaglioDocumentoDigitaleOutParametersType;
import it.csi.screenserviziwebsol.ScreenServiziWebSOL;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiDocumentoIdGetService extends ScreenDelegheRESTBaseService {
	
	private Integer documentoId; 
	private String citId;
	@Autowired
	protected ScreenServiziWebSOL soapClient;
	
	
	public CittadiniCitIdDocumentiDocumentoIdGetService(String citId, Integer documentoId, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super( securityContext, httpHeaders);
		this.documentoId = documentoId; 
		this.citId = citId;

	}

	@Override
	protected Response execute() {
		final String methodName = "execute";
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkNotBlank(citId, "Cit Id non valorizzato");
	
		checkUtenteAutorizzatoOrDelegato(citId);
	
		
		CredenzialiType credenziali = getCredenzialiType(citId);
		GetDettaglioDocumentoDigitaleInParametersType inParam = new GetDettaglioDocumentoDigitaleInParametersType();
		
		inParam.setPIdDocumento(documentoId);
		
		Holder<ErroriType> errori = new Holder<ErroriType>();
		
		Holder<GetDettaglioDocumentoDigitaleOutParametersType> outParam = new Holder<GetDettaglioDocumentoDigitaleOutParametersType>();
		
		//JaxWsProxyFactoryBean factoy = new JaxWsProxyFactoryBean();
		//factoy.setProperties(properties);
		
		try {
			soapClient.getDettaglioDocumentoDigitale(credenziali, inParam, errori, outParam);
		} catch (GetDettaglioDocumentoDigitaleFaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio getDettaglioDocumentoDigitale").exception();
		}
		ModelDocumentoDettaglio res = new ModelDocumentoDettaglioGetDettaglioDocumentoDigitaleOutParametersTypeMapper().from(outParam.value);
		return Response.ok(res).build();
	}

}
