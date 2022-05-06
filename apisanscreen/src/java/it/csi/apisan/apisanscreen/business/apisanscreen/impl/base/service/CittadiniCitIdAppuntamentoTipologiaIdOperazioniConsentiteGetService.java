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

import org.apache.commons.lang3.StringUtils;
import org.apache.ws.security.util.StringUtil;
import org.bouncycastle.jcajce.provider.asymmetric.RSA;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ScreenAnagraficaRESTBaseService;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelOperazioniAppuntamento;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ApisanScreenStatus;
import it.csi.apisan.apisanscreen.util.MappingCodiciErrore;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CheckEtaScreeningFaultException;
import it.csi.screenserviziwebsol.CheckEtaScreeningInParametersType;
import it.csi.screenserviziwebsol.CheckEtaScreeningOutParametersType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.ScrApp01FaultException;
import it.csi.screenserviziwebsol.ScrApp01InParametersType;
import it.csi.screenserviziwebsol.ScrApp01OutParametersType;
import it.csi.screenserviziwebsol.ScrCit01;
import it.csi.screenserviziwebsol.ScrCit01FaultException;
import it.csi.screenserviziwebsol.ScrCit01InParametersType;
import it.csi.screenserviziwebsol.ScrCit01OutParametersType;
import it.csi.screenserviziwebsol.ScrMam01FaultException;
import it.csi.screenserviziwebsol.ScrMam01InParametersType;
import it.csi.screenserviziwebsol.ScrMam01OutParametersType;
import it.csi.screenserviziwebsol.TipoScreenType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdAppuntamentoTipologiaIdOperazioniConsentiteGetService
		extends ScreenAnagraficaRESTBaseService {
	
	private String tipologiaId;
	private String codiceInterno; 
	private String codiceInternoPrefisso;
	

	public CittadiniCitIdAppuntamentoTipologiaIdOperazioniConsentiteGetService(String citId,  String tipologiaId,
			String codiceInterno, String codiceInternoPrefisso, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(citId, securityContext, httpHeaders);
		this.tipologiaId = tipologiaId;
		this.codiceInterno = codiceInterno; 
		this.codiceInternoPrefisso = codiceInternoPrefisso;
	}

	@Override
	protected Response execute() {
		final String methodName = "execute";
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkNotBlank(citId, "Cit Id non valorizzato");
		checkNotBlank(tipologiaId, "TipologiaId Id non valorizzato");
		checkNotNull(codiceInterno, "Codice Interno non valorizzato");
		checkNotNull(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");		
		checkNotBlank(codiceInterno, "Codice Interno non valorizzato");
		checkNotBlank(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");
		
		checkUtenteAutorizzatoOrDelegato(citId);
		Integer codInterno = null;
		try {
			codInterno = Integer.valueOf(codiceInterno);
			
		} catch(NumberFormatException nfe) {
			throw ErroreBuilder.from(ApisanScreenStatus.PARAMETRO_NON_VALIDO, "Codice Interno").exception();
		}		
		checkIdInternoValido(codInterno, codiceInternoPrefisso);
		
		TipoScreenType tipoScreen = null;
		try {
			tipoScreen = TipoScreenType.fromValue(tipologiaId);
		}catch(IllegalArgumentException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Tipologia").exception();
		}
		
		//distinguo se appuntamento citologico o mammografico
		String dataApp = null;
		CitoMammoWrapper appuntamento = null;
		switch (tipoScreen) {
		case CV:
			appuntamento = richiamoAppuntamentoCitologico(codInterno);  
			break;
		case MX:
			appuntamento = richiamoAppuntamentoMammografico(codInterno); 
			break;

		default:
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Tipologia").exception();
			
		}
		ModelOperazioniAppuntamento modelOperazioni = new ModelOperazioniAppuntamento();
		if(StringUtils.isNotEmpty(appuntamento.getMessaggioErrore())  ) {
			modelOperazioni = creaModelOperazione(false, false, false);
			modelOperazioni.setMessaggio(appuntamento.getMessaggioErrore());
			return Response.ok(modelOperazioni).build();
		}
		
		dataApp = appuntamento.getDataApp();
		//Richiamo il servizio src_app_01
		ScrApp01Wrapper outSrcApp = richiamoAppuntamento(codInterno, dataApp != null);
		
		//Verifico i casi
		if(dataApp != null) {
			if(isPresenteErrore(outSrcApp.getErrori())) {
				// appuntamento visualizzaabile				
				modelOperazioni = creaModelOperazione(true, false, false);

			}else {
				modelOperazioni = creaModelOperazione(true, true, false);				
			}
		}else {
			String messaggio = "Nessuna prenotazione e' attiva in questo momento";
			//richiamo checkEta
			CheckEtaScreeningWrapper checkEta = richiamoCheckEta(codInterno, tipoScreen);
			if(isPresenteErrore(outSrcApp.getErrori()) && outSrcApp.getMessaggio() == null) {
				
				//se flag = 0 Assistito fuori fascia età di adesione spontanea
				/*if(checkEta.getOutParam() != null && checkEta.getOutParam().getFlag().intValue() == 1 ) {
					modelOperazioni = creaModelOperazione(false, false, true);
					modelOperazioni.setMessaggio(messaggio);
				}else {
					modelOperazioni = creaModelOperazione(false, false, false);
					//modelOperazioni.getModificabile().setMessaggio(messaggio);
					modelOperazioni.setMessaggio("Assistito fuori fascia eta' di adesione spontanea");
				}*/
				modelOperazioni = controlloCheckEta(checkEta, modelOperazioni, messaggio);
				
			} else  if(isPresenteErrore(outSrcApp.getErrori()) && outSrcApp.getMessaggio() != null) {
				modelOperazioni = creaModelOperazione(false, false, false);
				modelOperazioni.setMessaggio(messaggio + " "  + outSrcApp.getMessaggio());
			}
			else {
				//devo richiamare il controllo età 
				modelOperazioni = controlloCheckEta(checkEta, modelOperazioni, messaggio);
/*				modelOperazioni = creaModelOperazione(false, false, true);
				modelOperazioni.setMessaggio(messaggio);*/
			}
			
		}
		
		return Response.ok(modelOperazioni).build();
	}
	
	
	private ModelOperazioniAppuntamento controlloCheckEta(CheckEtaScreeningWrapper checkEta,  ModelOperazioniAppuntamento modelOperazioni, String messaggio) {
		//se flag = 0 Assistito fuori fascia età di adesione spontanea
		if(checkEta.getOutParam() != null && checkEta.getOutParam().getFlag().intValue() == 1 ) {
			modelOperazioni = creaModelOperazione(false, false, true);
			modelOperazioni.setMessaggio(messaggio);
		}else {
			modelOperazioni = creaModelOperazione(false, false, false);
			//modelOperazioni.getModificabile().setMessaggio(messaggio);
			modelOperazioni.setMessaggio("Assistito fuori fascia eta' di adesione spontanea");
		}
		return modelOperazioni;
	}
	
	private ModelOperazioniAppuntamento creaModelOperazione(boolean isVisualizzabile, boolean isModificabile, boolean isPrenotabile ) {
		ModelOperazioniAppuntamento modelOperazioni = new ModelOperazioniAppuntamento();
		
		modelOperazioni.setModificabile(isModificabile);
		modelOperazioni.setPrenotabile(isPrenotabile);
		modelOperazioni.setVisualizzabile(isVisualizzabile);
		
		return modelOperazioni;
	}
	
	private CitoMammoWrapper richiamoAppuntamentoCitologico( Integer codInterno) {
		CitoMammoWrapper res = new CitoMammoWrapper();
		final String methodName = "richiamoAppuntamentoMammografico";
		String dataApp = null;		
		ScrCit01 request = new ScrCit01();

		CredenzialiType credenziali = getCredenzialiType(citId);

		ScrCit01InParametersType inParam = new ScrCit01InParametersType();
		inParam.setPCodInterno(codInterno);
		inParam.setPPrefInterno(codiceInternoPrefisso);

		request.setScrCit01InParameters(inParam);
		Holder<ErroriType> errori = new Holder<ErroriType>();
		Holder<ScrCit01OutParametersType> outParam = new Holder<ScrCit01OutParametersType>();

		try {
			soapClient.scrCit01(credenziali, inParam, errori, outParam);
		}
		catch (ScrCit01FaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio scrCit01").exception();
		}
		String messaggioErrore = checkSuccessoMammoCito(errori);
		res.setMessaggioErrore(messaggioErrore);
		if(outParam != null && outParam.value != null) {
			dataApp = outParam.value.getPDataApp();
			res.setDataApp(dataApp);
		}
		return res;
	}
	
	private CitoMammoWrapper  richiamoAppuntamentoMammografico( Integer codInterno) {
		CitoMammoWrapper res = new CitoMammoWrapper();
		final String methodName = "richiamoAppuntamentoMammografico";
		String dataApp = null;
		CredenzialiType credenziali = getCredenzialiType(citId);
		
		ScrMam01InParametersType scrMam01InParameters = new ScrMam01InParametersType();
		scrMam01InParameters.setPCodInterno(codInterno);

		scrMam01InParameters.setPPrefInterno(codiceInternoPrefisso);
		Holder<ErroriType> errori = new Holder<ErroriType>();
		Holder<ScrMam01OutParametersType> scrMam01OutParameters = new Holder<ScrMam01OutParametersType>();
		try {
			soapClient.scrMam01(credenziali, scrMam01InParameters, errori, scrMam01OutParameters);
		} catch (ScrMam01FaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio scrMam01").exception();
		}
		String messaggioErrore = checkSuccessoMammoCito(errori);
		
		res.setMessaggioErrore(messaggioErrore);
		if(scrMam01OutParameters != null && scrMam01OutParameters.value != null) {
			dataApp = scrMam01OutParameters.value.getPDataApp();
			res.setDataApp(dataApp);
		}
		return res;
	}
	
	private String checkSuccessoMammoCito(Holder<ErroriType> errori ) {
		final String methodName = "checkSuccessoMammoCito"; 
		String messaggio = null;
		ErroriType errore = errori.value;
		if (errore.getCodice() != 0) {
			log.error(methodName, "Risposta dal servizio %s andata in errore con codice $s. Errore: %s", methodName,
					errore.getCodice(), errore.getDescrizione());
			messaggio = errore.getDescrizione();
		}
		return messaggio;
	}
	
	
	private ScrApp01Wrapper richiamoAppuntamento(Integer codInterno, boolean dataAppPresente) {
		final String methodName = "richiamoAppuntamento";
		CredenzialiType credenziali = getCredenzialiType(citId);
		ScrApp01InParametersType inParam = new ScrApp01InParametersType();
			
		inParam.setPCodInterno(codInterno);
		TipoScreenType tipoScreen = null;
		try {
			tipoScreen = TipoScreenType.fromValue(tipologiaId);
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
		
		if(errori.value != null) {
			//distinguo i casi data app non presente:
			if(dataAppPresente) {
				if(! MappingCodiciErrore.getInstance().codiceErroreScrApp01DaNonMappare(errori.value.getCodice())  ) {
					checkSuccesso(errori, CittadiniCitIdAppuntamentoTipologiaIdOperazioniConsentiteGetService.class);
				}
			}else {
				if( errori.value.getCodice() != 2112 &&  errori.value.getCodice() != 2111 && errori.value.getCodice() != 2113 ) {
					checkSuccesso(errori, CittadiniCitIdAppuntamentoTipologiaIdOperazioniConsentiteGetService.class);
				}
			}

		}
		ScrApp01Wrapper output = new ScrApp01Wrapper();
		output.setOutParam(outParam.value);
		output.setErrori(errori.value);
		if(errori.value.getCodice() == 2113) {
			output.setMessaggio(errori.value.getDescrizione());
		}
		return output;
	}
	
	
	private CheckEtaScreeningWrapper richiamoCheckEta(Integer codInterno, TipoScreenType tipoScreen) {
		final String methodName = "richiamoCheckEta"; 
		CredenzialiType credenziali = getCredenzialiType(citId);
				
		CheckEtaScreeningInParametersType inParam = new CheckEtaScreeningInParametersType();
		
		inParam.setPCodInterno(codInterno);
		
		inParam.setPPrefInterno(codiceInternoPrefisso);
				
		inParam.setTipoScreen(tipoScreen);
		
		Holder<ErroriType> errori = new Holder<ErroriType>();
		
		Holder<CheckEtaScreeningOutParametersType> outParam = new Holder<CheckEtaScreeningOutParametersType>(); 
		try {
			soapClient.checkEtaScreening(credenziali, inParam, errori, outParam);
		} catch (CheckEtaScreeningFaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio checkEtaScreening").exception();
		}

		//checkSuccesso(errori, CittadiniCitIdAppuntamentoTipologiaIdPrenotabileGetService.class);
		
		CheckEtaScreeningWrapper output = new CheckEtaScreeningWrapper();
		output.setErrori(errori.value);
		output.setOutParam(outParam.value);
		
		return output;
	}
	
	private boolean isPresenteErrore(ErroriType errore) {
	 	return (errore != null && errore.getCodice() != 0);
	}
	
	class CheckEtaScreeningWrapper{
		CheckEtaScreeningOutParametersType outParam;
		ErroriType  errori;
		
		public CheckEtaScreeningOutParametersType getOutParam() {
			return outParam;
		}
		public void setOutParam(CheckEtaScreeningOutParametersType outParam) {
			this.outParam = outParam;
		}
		public ErroriType getErrori() {
			return errori;
		}
		public void setErrori(ErroriType errori) {
			this.errori = errori;
		}
		
		
	}
	
	class ScrApp01Wrapper {
		ScrApp01OutParametersType outParam;
		ErroriType  errori;
		String messaggio;
		public ScrApp01OutParametersType getOutParam() {
			return outParam;
		}
		public void setOutParam(ScrApp01OutParametersType outParam) {
			this.outParam = outParam;
		}
		public ErroriType getErrori() {
			return errori;
		}
		public void setErrori(ErroriType errori) {
			this.errori = errori;
		}
		public String getMessaggio() {
			return messaggio;
		}
		public void setMessaggio(String messaggio) {
			this.messaggio = messaggio;
		}
		
		
	}
	
	class CitoMammoWrapper{
		private String dataApp;
		private String messaggioErrore;
		public String getDataApp() {
			return dataApp;
		}
		public void setDataApp(String dataApp) {
			this.dataApp = dataApp;
		}
		public String getMessaggioErrore() {
			return messaggioErrore;
		}
		public void setMessaggioErrore(String messaggioErrore) {
			this.messaggioErrore = messaggioErrore;
		}
		
		
	}
}
