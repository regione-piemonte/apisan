/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisanscreen.business.mapper.ModelAppuntamentoDettaglioScrApp01OutParametersTypeMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelAppuntamentoDettaglio;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelAppuntamentoLista;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ApisanScreenStatus;
import it.csi.apisan.apisanscreen.util.MappingCodiciErrore;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.ScrAna01FaultException;
import it.csi.screenserviziwebsol.ScrAna01InParametersType;
import it.csi.screenserviziwebsol.ScrAna01OutParametersType;
import it.csi.screenserviziwebsol.ScrApp01FaultException;
import it.csi.screenserviziwebsol.ScrApp01InParametersType;
import it.csi.screenserviziwebsol.ScrApp01OutParametersType;
import it.csi.screenserviziwebsol.ScreenServiziWebSOL;
import it.csi.screenserviziwebsol.TipoScreenType;
import it.csi.screenserviziwebsol.VerificaAssistita;
import it.csi.screenserviziwebsol.VerificaAssistitaFaultException;
import it.csi.screenserviziwebsol.VerificaAssistitaInParametersType;
import it.csi.screenserviziwebsol.VerificaAssistitaOutParametersType;

public abstract class ScreenAnagraficaRESTBaseService extends ScreenDelegheRESTBaseService {
	
	protected String citId;
	@Autowired
	protected ScreenServiziWebSOL soapClient;
	
	public ScreenAnagraficaRESTBaseService(String citId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
	}
	
	//TODO da rifare bisogna richiamare 	Scr_App_01 e non GETSTRUTTUREWEB2e e verificare anche tutti i servizi da sostituire
	protected ModelAppuntamentoDettaglio getUnitaOperativa(Integer codiceInterno, String codiceInternoPrefisso, String strTipoScreen, Class<?> clazz) {
		final String methodName = "getUnitaOperativa";
		ModelAppuntamentoDettaglio resp = null;
		CredenzialiType credenziali = getCredenzialiType(shibIdentitaCodiceFiscale);
		
		
		//Richiamare Scr_App_01 al posto di GETSTRUTTUREWEB2
		
		ScrApp01InParametersType inParam = new ScrApp01InParametersType();
		
		inParam.setPCodInterno(codiceInterno);
		TipoScreenType tipoScreen = null;
		try {
			tipoScreen = TipoScreenType.fromValue(strTipoScreen);
		}catch(IllegalArgumentException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Tipologia").exception();
		}
		
		inParam.setPTipoScreening(tipoScreen);
		inParam.setPPrefInterno(codiceInternoPrefisso);
		
		Holder<ErroriType> errori = new Holder<ErroriType>();
		Holder<ScrApp01OutParametersType> outParam = new Holder<ScrApp01OutParametersType>();

		try {
			soapClient.scrApp01(credenziali, inParam, errori, outParam);
		} catch (ScrApp01FaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio scrApp01").exception();
		}
		boolean isOk = false;
		if(errori.value != null) {
			if(! MappingCodiciErrore.getInstance().codiceErroreScrApp01DaNonMappare(errori.value.getCodice())  ) {
				isOk = checkSuccessoNotifica(errori, clazz);
			}
		}
		
		if(isOk) {
			resp = new ModelAppuntamentoDettaglioScrApp01OutParametersTypeMapper(tipoScreen).from(outParam.value);
		}
		
		
		
		
		
		/*GETSTRUTTUREWEB2InParametersType inParam = new GETSTRUTTUREWEB2InParametersType();
		inParam.setICODIDINTERNO(Integer.valueOf(codiceInterno));
		
		inParam.setIPREFIDINTERNO(codiceInternoPrefisso);
		
		TipoScreenType tipoScreen = null;
		try {
			tipoScreen = TipoScreenType.fromValue(strTipoScreen);
		}catch(IllegalArgumentException e) {
			return unitaOperativa;
		}
		inParam.setITIPOSCREEN(tipoScreen);
		
		Holder<ErroriType> errori = new Holder<ErroriType>();
		Holder<GETSTRUTTUREWEB2OutParametersType> outParam = new Holder<GETSTRUTTUREWEB2OutParametersType>(); 
		
		try {
			soapClient.getSTRUTTUREWEB2(credenziali, inParam, errori, outParam);
		} catch (GETSTRUTTUREWEB2FaultException e) {
			log.error(methodName, e.getMessage(), e);
			return unitaOperativa;
		}
		
		boolean isOk = checkSuccessoNotifica(errori,  clazz);
		
		ResponseStrutturaLista response = new ResponseStrutturaLista();
		
		List<ModelUnitaOperativaLista> unitaOperative = null;
		
		if (isOk) {
			if (outParam.value != null && outParam.value.getONUMELEMENTI2() > 0) {
				String res = outParam.value.getOELENCO2();
				unitaOperative = new ModelUnitaOperativaListaStringMapper().fromList(Arrays.asList(res.split(";")));
			} else {
				return unitaOperativa;
			}
			unitaOperativa = unitaOperative.stream().filter(c -> (c.getCodice().equalsIgnoreCase(idUo) && c.getAslCodice().equalsIgnoreCase(codiceAsl))   ).findFirst()
					.get();
		}*/
		return resp;
	}
	
	
	protected ScrAna01OutParametersType chiamataScrAna(Class<?> clazz) {
		CredenzialiType credenziali = getCredenzialiType(citId);
		ScrAna01InParametersType inParam = new ScrAna01InParametersType();
		inParam.setPCodFiscale(citId);
		Holder<ErroriType> errori = new Holder<ErroriType>();
		Holder<ScrAna01OutParametersType> outParam = new Holder<ScrAna01OutParametersType>( ) ;
		
		try {
			soapClient.scrAna01(credenziali, inParam, errori, outParam);
		} catch (ScrAna01FaultException e) {
			log.error("execute", "errore nel richianmo del servizio scrAna01 ", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata del servizio scrAna01").exception();
		}
		boolean isOk = checkSuccessoNotifica(errori, clazz);
		
		if(isOk) {
			return outParam.value;
		}else {
			return null;
		}
		
	}
	
	protected VerificaAssistitaOutParametersType chiamataVerificaAssistita() {
		final String methodName = "chiamataVerificaAssistita";
		
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
		checkSuccesso(errori, ScreenAnagraficaRESTBaseService.class);
		
		return outParam.value;
	}
	
	
	protected boolean isIdInternoValido(Integer idInterno, String codInternoPrefisso) {
		VerificaAssistitaOutParametersType outParam = chiamataVerificaAssistita();
		return ((outParam.getPCodIdInterno().compareTo(idInterno) == 0) && codInternoPrefisso.equalsIgnoreCase(outParam.getPPrefIdInterno()) );
		
	}
	
	protected void checkIdInternoValido(Integer idInternoPrefisso, String codInternoPrefisso) {
		checkCondition(isIdInternoValido( idInternoPrefisso, codInternoPrefisso), ErroreBuilder.from(ApisanScreenStatus.UTENTE_NON_AUTORIZZATO).exception());
	}
	
	
	protected void valorizzatAppuntamentoLista(ModelAppuntamentoLista appuntamento) {
		
		if("NO".equalsIgnoreCase(appuntamento.getAppVisibile()))  {
			appuntamento.setAgendaCodice(null);
			appuntamento.setData(null);
			appuntamento.setDataConvocazioneUltimo(null);
			appuntamento.setDataEsitoUltimo(null);
			appuntamento.setDataSollecitoUltimo(null);
			appuntamento.setLuogo(null);
			appuntamento.setOra(null);
			appuntamento.setStatoCodice(null);
			
		}else if("UO".equalsIgnoreCase(appuntamento.getAppVisibile())) {
			appuntamento.setData(null);
			appuntamento.setOra(null);
		}
		
	}
}
