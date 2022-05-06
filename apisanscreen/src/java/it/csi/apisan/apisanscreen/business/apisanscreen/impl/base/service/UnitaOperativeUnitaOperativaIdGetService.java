/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ScreenRESTBaseService;
import it.csi.apisan.apisanscreen.business.mapper.ModelUnitaOperativaDettaglioStringMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelUnitaOperativaDettaglio;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.GetDettaglioStruttureWEBFaultException;
import it.csi.screenserviziwebsol.GetDettaglioStruttureWEBInParametersType;
import it.csi.screenserviziwebsol.GetDettaglioStruttureWEBOutParametersType;
import it.csi.screenserviziwebsol.ScreenServiziWebSOL;
import it.csi.screenserviziwebsol.TipoScreenType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UnitaOperativeUnitaOperativaIdGetService extends ScreenRESTBaseService {
	String unitaOperativaId; 
	String tipologia;
	String codiceInterno; 
	String codiceInternoPrefisso; 
	String asl;
	
	
	@Autowired
	ScreenServiziWebSOL soapClient; 	
	
	public UnitaOperativeUnitaOperativaIdGetService(String unitaOperativaId, String tipologia,
			String codiceInterno, String codiceInternoPrefisso, String asl, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.unitaOperativaId = unitaOperativaId; 
		this.tipologia = tipologia;
		this.codiceInterno = codiceInterno; 
		this.codiceInternoPrefisso = codiceInternoPrefisso;  
		this.asl = asl;
		
	}

	

	@Override
	protected Response execute() {
		final String methodName = "execute";
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		checkNotBlank(unitaOperativaId, "Id unita operativa non valorizzata");
		
		checkNotNull(tipologia, "Tipologia non valorizzata");
		checkNotNull(codiceInterno, "Codice Interno non valorizzato");
		checkNotNull(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");
		checkNotNull(asl, "Asl non valorizzata");
		
		checkNotBlank(tipologia, "Tipologia non valorizzata");
		checkNotBlank(codiceInterno, "Codice Interno non valorizzato");
		checkNotBlank(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");
		checkNotBlank(asl, "Asl non valorizzata");

		Integer codAzienda = 0;
		Integer codInterno = 0;
		try {
			codAzienda = Integer.valueOf(asl);
			
		}catch(NumberFormatException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "asl").exception();
		}
		try {
			codInterno = Integer.valueOf(codiceInterno);
			
		}catch(NumberFormatException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Codice Interno").exception();
		}
		TipoScreenType tipoScreen = null;
		try {
			tipoScreen = TipoScreenType.fromValue(tipologia);
		}catch(IllegalArgumentException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Tipologia").exception();
		}
		
		CredenzialiType credenziali = getCredenzialiType(shibIdentitaCodiceFiscale);
		GetDettaglioStruttureWEBInParametersType request = new GetDettaglioStruttureWEBInParametersType();
		request.setICODAZIENDA(codAzienda);
		request.setICODIDINTERNO(codInterno);
		request.setIPREFIDINTERNO(codiceInternoPrefisso);
		request.setICODUNPR(unitaOperativaId);
		request.setITIPOSCREEN(tipoScreen);
		request.setIISTAT("");
		
		Holder<ErroriType> errori = new Holder<ErroriType>();
		Holder<GetDettaglioStruttureWEBOutParametersType> getDettaglioStruttureWEBOutParameters = new Holder<GetDettaglioStruttureWEBOutParametersType>();

		try {
			soapClient.getDettaglioStruttureWEB(credenziali, request, errori, getDettaglioStruttureWEBOutParameters);
		} catch (GetDettaglioStruttureWEBFaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio getDettaglioStruttureWEB").exception();
		}
		checkSuccesso(errori, UnitaOperativeUnitaOperativaIdGetService.class);

		ModelUnitaOperativaDettaglio resModel;
		if(getDettaglioStruttureWEBOutParameters.value.getONUMELEMENTI() > 0) {

			String res = getDettaglioStruttureWEBOutParameters.value.getOELENCO();
			List<String> listares = Arrays.asList(res.split(";"));
			
			resModel = new ModelUnitaOperativaDettaglioStringMapper().from(listares.get(0));  
			
		}else {
			throw ErroreBuilder.from(Status.NOT_FOUND).title("Non sono state trovate occorrenze").exception();
		}
		
		return Response.ok(resModel).build();
	}

}
