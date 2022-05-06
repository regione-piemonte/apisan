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

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ScreenAnagraficaRESTBaseService;
import it.csi.apisan.apisanscreen.business.mapper.PayloadLuogoModificaSetSituazioneAssIndWEBInParametersTypeMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.PayloadLuogoModifica;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ApisanScreenStatus;
import it.csi.apisan.apisanscreen.util.ConstantsScreen;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.SetSituazioneAssIndWEBFaultException;
import it.csi.screenserviziwebsol.SetSituazioneAssIndWEBInParametersType;
import it.csi.screenserviziwebsol.SetSituazioneAssIndWEBOutParametersType;
import it.csi.screenserviziwebsol.TipoScreenType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdLuogoPutService extends ScreenAnagraficaRESTBaseService {
	
	 private String codiceInterno;
	 private String codiceInternoPrefisso;
	 private PayloadLuogoModifica payloadLuogoModifica;  
	
	public CittadiniCitIdLuogoPutService(String citId, String codiceInterno, String codiceInternoPrefisso,
			PayloadLuogoModifica payloadLuogoModifica, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(citId, securityContext, httpHeaders);
		
		 this.codiceInterno = codiceInterno;
		 this.codiceInternoPrefisso = codiceInternoPrefisso;
		 this.payloadLuogoModifica = payloadLuogoModifica;  
	}

	@Override
	protected Response execute() {
		final String methodName = "execute";
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkNotBlank(citId, "Cit Id non valorizzato");
		
		checkNotNull(codiceInterno, "Codice Interno non valorizzato");
		checkNotNull(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");		
		checkNotNull(payloadLuogoModifica, "Payload non valorizzato");
		
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
		
		CredenzialiType credenziali = getCredenzialiType(citId);
		
		SetSituazioneAssIndWEBInParametersType inParam = new PayloadLuogoModificaSetSituazioneAssIndWEBInParametersTypeMapper().to(payloadLuogoModifica);
		inParam.setICODIDINTERNO(codInterno);
		inParam.setIPREFIDINTERNO(codiceInternoPrefisso);
		
		inParam.setIIDUTENTE(ConstantsScreen.ID_UTENTE);
		inParam.setIUTENTEUVOS(ConstantsScreen.ID_UTENTE_VOS);
		inParam.setITIPOSCREENING(TipoScreenType.CV);
		
	    Holder<ErroriType> errori = new Holder<ErroriType>();
	    Holder<SetSituazioneAssIndWEBOutParametersType> outParam = new Holder<SetSituazioneAssIndWEBOutParametersType>();  
		
		try {
			soapClient.setSituazioneAssIndWEB(credenziali, inParam, errori, outParam);
		} catch (SetSituazioneAssIndWEBFaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio setSituazioneAssIndWEB").exception();
		}
		checkSuccesso(errori, CittadiniCitIdLuogoPutService.class);
		
		return Response.status(204).build();
		
	}

}
