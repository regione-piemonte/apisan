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
import it.csi.apisan.apisanscreen.business.mapper.ModelAppuntamentoDettaglioScrApp01OutParametersTypeMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelAppuntamentoDettaglio;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.MappingCodiciErrore;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.ScrApp01FaultException;
import it.csi.screenserviziwebsol.ScrApp01InParametersType;
import it.csi.screenserviziwebsol.ScrApp01OutParametersType;
import it.csi.screenserviziwebsol.TipoScreenType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdAppuntamentoTipologiaIdGetService extends ScreenAnagraficaRESTBaseService {
	
	
	private String tipologiaId; 
	private String codiceInterno;
	private String codiceInternoPrefisso;
		
	
	public CittadiniCitIdAppuntamentoTipologiaIdGetService(String citId, String tipologiaId, String codiceInterno,
			String codiceInternoPrefisso, SecurityContext securityContext, HttpHeaders httpHeaders) {
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
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		checkNotBlank(citId, "Cit Id non valorizzato");
		checkNotBlank(tipologiaId, "Id tipologia non valorizzato");

		checkNotNull(codiceInterno, "Codice Interno non valorizzata");
		checkNotNull(codiceInternoPrefisso, "Codice Interno prefisso non valorizzato");
		checkNotBlank(codiceInterno, "Codice Interno non valorizzata");
		checkNotBlank(codiceInternoPrefisso, "Codice Interno prefisso non valorizzato");
		
		checkUtenteAutorizzatoOrDelegato(citId);
		
		Integer codInterno = null;
		
		try {
			codInterno = Integer.valueOf( codiceInterno);
		} catch(NumberFormatException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Codice Interno").exception();
		}
		
		checkIdInternoValido(codInterno, codiceInternoPrefisso);
		
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
			if(! MappingCodiciErrore.getInstance().codiceErroreScrApp01DaNonMappare(errori.value.getCodice())  ) {
				checkSuccesso(errori, CittadiniCitIdAppuntamentoTipologiaIdOperazioniConsentiteGetService.class);
			}
		}
		
		ModelAppuntamentoDettaglio resp = new ModelAppuntamentoDettaglioScrApp01OutParametersTypeMapper(tipoScreen).from(outParam.value); 
		
		return Response.ok(resp).build();
	}

}
