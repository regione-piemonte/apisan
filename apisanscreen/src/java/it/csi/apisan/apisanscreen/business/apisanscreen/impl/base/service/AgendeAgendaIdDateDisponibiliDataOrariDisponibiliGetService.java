/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import it.csi.apisan.apisanscreen.business.mapper.ModelOrarioDisponibileStringMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelOrarioDisponibile;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ConstantsScreen;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.GetAppuntamentiWEBFaultException;
import it.csi.screenserviziwebsol.GetAppuntamentiWEBInParametersType;
import it.csi.screenserviziwebsol.GetAppuntamentiWEBOutParametersType;
import it.csi.screenserviziwebsol.ScreenServiziWebSOL;
import it.csi.screenserviziwebsol.TipoScreenType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AgendeAgendaIdDateDisponibiliDataOrariDisponibiliGetService extends ScreenRESTBaseService {
	String agendaId; 
	String data;
	String tipologia; 
	Integer adesioneSpontanea;
	SimpleDateFormat sdfDataArrivo ;
	SimpleDateFormat sdfDataRich ;
	
	@Autowired
	ScreenServiziWebSOL soapClient; 	
	
	public AgendeAgendaIdDateDisponibiliDataOrariDisponibiliGetService(String agendaId, String data,
			String tipologia, Integer adesioneSpontanea, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.agendaId = agendaId; 
		this.data = data;
		this.tipologia = tipologia; 
		this.adesioneSpontanea = adesioneSpontanea;
		sdfDataArrivo = new SimpleDateFormat("yyyy-MM-dd");
		sdfDataRich = new SimpleDateFormat("dd/MM/yyyy");
	}

	

	@Override
	protected Response execute() {
		final String methodName = "execute";
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		checkNotBlank(agendaId, "id agenda non valorizzata");
		checkNotBlank(data, "Data non valorizzata");
		
		checkNotNull(tipologia, "Tipologia non valorizzata");
		checkNotNull(adesioneSpontanea, "Adesione spontanea non valorizzato");
		checkNotBlank(tipologia, "Tipologia non valorizzata");
		String dataRichiesta = "";
		
		try {
			dataRichiesta =  sdfDataRich.format(sdfDataArrivo.parse(data)) ;
		} catch (ParseException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "data in formato errato").exception();
		}
		Integer codAgenda = 0;
		try {
			codAgenda = Integer.valueOf(agendaId);
		}catch(NumberFormatException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Id agenda").exception();
		}
		
		TipoScreenType tipoScreen = null;
		try {
			tipoScreen = TipoScreenType.fromValue(tipologia);
		}catch(IllegalArgumentException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Tipologia").exception();
		}
		
		CredenzialiType credenziali = getCredenzialiType(shibIdentitaCodiceFiscale);
		
		GetAppuntamentiWEBInParametersType request = new GetAppuntamentiWEBInParametersType();
		Holder<ErroriType> errori = new Holder<ErroriType>();
		Holder<GetAppuntamentiWEBOutParametersType> getAppuntamentiWEBOutParameters = new Holder<GetAppuntamentiWEBOutParametersType>();
		
		request.setIADESIONESPONTANEA(adesioneSpontanea);
		request.setICODAGENDA(codAgenda);
		request.setIDATARIF(dataRichiesta);
		request.setIIDUTENTE(ConstantsScreen.ID_UTENTE);
		request.setITIPOSCREEN(tipoScreen);
		request.setIUTENTEUVOS(ConstantsScreen.ID_UTENTE_VOS);
		
		try {
			soapClient.getAppuntamentiWEB(credenziali, request, errori, getAppuntamentiWEBOutParameters);
		} catch (GetAppuntamentiWEBFaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio getAppuntamentiWEB").exception();
		}
		
		checkSuccesso(errori, AgendeAgendaIdDateDisponibiliDataOrariDisponibiliGetService.class);
		List<ModelOrarioDisponibile> listaRes;
		if(getAppuntamentiWEBOutParameters.value.getONUMELEMENTI() >0 ) {
			String res = getAppuntamentiWEBOutParameters.value.getOELENCO();
			
			listaRes = new ModelOrarioDisponibileStringMapper().fromList(Arrays.asList(res.split(";") ));
		}else {
			listaRes = new ArrayList<ModelOrarioDisponibile>();
		}
		
		return Response.ok(listaRes).build();
	}

}
