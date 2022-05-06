/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service;

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
import it.csi.apisan.apisanscreen.business.mapper.ModelDataDisponibileStringMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelDataDisponibile;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ConstantsScreen;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.GetDateDisponibiliWEBFaultException;
import it.csi.screenserviziwebsol.GetDateDisponibiliWEBInParametersType;
import it.csi.screenserviziwebsol.GetDateDisponibiliWEBOutParametersType;
import it.csi.screenserviziwebsol.ScreenServiziWebSOL;
import it.csi.screenserviziwebsol.TipoScreenType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AgendeAgendaIdDateDisponibiliGetService extends ScreenRESTBaseService {
	
	private String agendaId; 
	private String tipologia; 
	private String mese; 
	private String anno;
	private Integer adesioneSpontanea;
	
	@Autowired
	ScreenServiziWebSOL soapClient; 	
	
	public AgendeAgendaIdDateDisponibiliGetService(String agendaId, String tipologia, String mese, String anno, Integer adesioneSpontanea, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.agendaId = agendaId; 
		this.tipologia = tipologia; 
		this.mese = mese; 
		this.anno = anno;
		this.adesioneSpontanea = adesioneSpontanea;
	}



	@Override
	protected Response execute() {
		final String methodName = "execute";
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		checkNotBlank(agendaId, "id agenda non valorizzata");
		
		checkNotNull(tipologia, "Tipologia non valorizzata");
		checkNotNull(mese, "Mese non valorizzato");
		checkNotNull(anno, "Anno non valorizzata");
		
		checkNotBlank(tipologia, "Tipologia non valorizzata");
		checkNotBlank(mese, "Mese non valorizzata");
		checkNotBlank(anno, "Anno non valorizzata");
		
		
		try {
			int mm = Integer.parseInt(mese);
			if(mm > 12 || mm < 0) {
				throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "mese").exception();
			}
			
		}catch(NumberFormatException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "mese").exception();
		}
		
		try {
			int annoN = Integer.parseInt(anno);
			
		}catch(NumberFormatException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "anno").exception();
		}
		
		CredenzialiType credenziali = getCredenzialiType(shibIdentitaCodiceFiscale);
		GetDateDisponibiliWEBInParametersType inParam = new GetDateDisponibiliWEBInParametersType();
		
		try {
			inParam.setICODAGENDA(Integer.valueOf(agendaId));
		}catch(NumberFormatException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Id agenda").exception();
		}
		
		inParam.setIDATA(checkMese(mese) + anno);
		
		TipoScreenType tipoScreen = null;
		try {
			tipoScreen = TipoScreenType.fromValue(tipologia);
		}catch(IllegalArgumentException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Tipologia").exception();
		}
		inParam.setPTipoScreen(tipoScreen);
		
		//dati statici
		inParam.setPUtenteUvos(1);
		inParam.setIADESIONESPONTANEA(adesioneSpontanea == null? 0 : adesioneSpontanea);
		inParam.setPIdUtente(ConstantsScreen.ID_UTENTE);
		inParam.setPUtenteUvos(ConstantsScreen.ID_UTENTE_VOS);
		
		Holder<ErroriType> errori = new Holder<ErroriType>();
		Holder<GetDateDisponibiliWEBOutParametersType> outParam = new Holder<GetDateDisponibiliWEBOutParametersType> (); 

		try {
			soapClient.getDateDisponibiliWEB(credenziali, inParam, errori, outParam);
		} catch (GetDateDisponibiliWEBFaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio getDateDisponibiliWEB").exception();
		}
		checkSuccesso(errori, AgendeAgendaIdDateDisponibiliGetService.class);
		List<ModelDataDisponibile> listaRes = null;
		if(outParam.value != null && outParam.value.getONUMELEMENTI() > 0) {
			String res = outParam.value.getOELENCO();
			listaRes = new ModelDataDisponibileStringMapper().fromList(Arrays.asList(res.split(";")));
		}else {
			listaRes = new ArrayList<>();
		}
		return Response.ok(listaRes).build();
	}
	
	
	private String checkMese(String mese) {
		if(mese != null && mese.length() == 1) {
			return "0" + mese;
		}else {
			return mese;
		}
		
	}
}
