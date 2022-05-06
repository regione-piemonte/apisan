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
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ScreenRESTBaseService;
import it.csi.apisan.apisanscreen.business.mapper.ModelAslStringMapper;
import it.csi.apisan.apisanscreen.business.mapper.ModelUnitaOperativaListaStringMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelAsl;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelUnitaOperativaLista;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ResponseStrutturaLista;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ApisanScreenStatus;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.GETSTRUTTUREWEB2FaultException;
import it.csi.screenserviziwebsol.GETSTRUTTUREWEB2InParametersType;
import it.csi.screenserviziwebsol.GETSTRUTTUREWEB2OutParametersType;
import it.csi.screenserviziwebsol.ScreenServiziWebSOL;
import it.csi.screenserviziwebsol.TipoScreenType;	

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class StruttureGetService extends ScreenRESTBaseService {
	
	private String tipologia; 
	private String codiceInterno; 
	private String codiceInternoPrefisso;
	@Autowired
	ScreenServiziWebSOL soapClient; 		
	
	public StruttureGetService(String tipologia, String codiceInterno, String codiceInternoPrefisso, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.tipologia = tipologia; 
		this.codiceInterno = codiceInterno; 
		this.codiceInternoPrefisso = codiceInternoPrefisso;		
	}



	@Override
	protected Response execute() {
		final String methodName = "execute";
		checkNotNull(tipologia, "Tipologia non valorizzata");
		checkNotNull(codiceInterno, "Codice Interno non valorizzato");
		checkNotNull(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");
		
		checkNotBlank(tipologia, "Tipologia non valorizzata");
		checkNotBlank(codiceInterno, "Codice Interno non valorizzato");
		checkNotBlank(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");
		
		CredenzialiType credenziali = getCredenzialiType(shibIdentitaCodiceFiscale);
		
		GETSTRUTTUREWEB2InParametersType inParam = new GETSTRUTTUREWEB2InParametersType();
		try {
			inParam.setICODIDINTERNO(Integer.valueOf(codiceInterno));
		}catch(NumberFormatException e) {
			throw ErroreBuilder.from(ApisanScreenStatus.PARAMETRO_NON_VALIDO, "Codice Interno").exception();
		}
		inParam.setIPREFIDINTERNO(codiceInternoPrefisso);
		
		TipoScreenType tipoScreen = null;
		try {
			tipoScreen = TipoScreenType.fromValue(tipologia);
		}catch(IllegalArgumentException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Tipologia").exception();
		}
		inParam.setITIPOSCREEN(tipoScreen);
		
		Holder<ErroriType> errori = new Holder<ErroriType>();
		Holder<GETSTRUTTUREWEB2OutParametersType> outParam = new Holder<GETSTRUTTUREWEB2OutParametersType>(); 
		
		try {
			soapClient.getSTRUTTUREWEB2(credenziali, inParam, errori, outParam);
		} catch (GETSTRUTTUREWEB2FaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio getSTRUTTUREWEB2").exception();
		}
		
		checkSuccesso(errori,  StruttureGetService.class);
		
		ResponseStrutturaLista response = new ResponseStrutturaLista();
		
		List<ModelAsl> asl = null;
		
		List<ModelUnitaOperativaLista> unitaOperative = null;
		
		if(outParam.value != null && outParam.value.getONUMELEMENTI1() > 0) {
			String res = outParam.value.getOELENCO1();
			asl = new ModelAslStringMapper().fromList(Arrays.asList(res.split(";")) );
			
		}else {
			asl = new ArrayList<>();
		}
		if(outParam.value != null && outParam.value.getONUMELEMENTI2() > 0) {
			String res = outParam.value.getOELENCO2();
			unitaOperative = new ModelUnitaOperativaListaStringMapper().fromList(Arrays.asList(res.split(";")));
		}else {
			unitaOperative = new ArrayList<>();
		}
		
		response.setAsl(asl);
		response.setUnitaOperative(unitaOperative);
		
		return Response.ok(response).build();
	}

}
