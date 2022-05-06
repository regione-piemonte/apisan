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
import it.csi.apisan.apisanscreen.business.mapper.ModelPrenotabileMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelPrenotabile;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CheckEtaScreeningFaultException;
import it.csi.screenserviziwebsol.CheckEtaScreeningInParametersType;
import it.csi.screenserviziwebsol.CheckEtaScreeningOutParametersType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.TipoScreenType;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdAppuntamentoTipologiaIdPrenotabileGetService extends ScreenAnagraficaRESTBaseService {


	private String codiceInterno;
	private String codiceInternoPrefisso;
	private String tipologiaId;


	public CittadiniCitIdAppuntamentoTipologiaIdPrenotabileGetService( String citId, String tipologiaId,
			String codiceInterno, String codiceInternoPrefisso, SecurityContext securityContext,
			HttpHeaders httpHeaders) {

		super(citId, securityContext, httpHeaders);
		this.tipologiaId = tipologiaId;
		this.codiceInterno = codiceInterno;
		this.codiceInternoPrefisso = codiceInternoPrefisso;
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkNotBlank(citId, "Cit Id non valorizzato");
		checkNotBlank(tipologiaId, "Id tipologia non valorizzato");
		
		checkNotNull(codiceInterno, "Codice Interno non valorizzata");
		checkNotNull(codiceInternoPrefisso, "Codice Interno prefisso non valorizzato");
		
		checkUtenteAutorizzatoOrDelegato(citId);
		
		Integer codInterno = null;
		
		try {
			codInterno = Integer.valueOf(codiceInterno);
		} catch(NumberFormatException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Codice Interno").exception();
		}
		
		checkIdInternoValido(codInterno, codiceInternoPrefisso);
		
		CredenzialiType credenziali = getCredenzialiType(citId);
		final String methodName = "execute"; 
		
		CheckEtaScreeningInParametersType inParam = new CheckEtaScreeningInParametersType();
		
		inParam.setPCodInterno(codInterno);
		
		inParam.setPPrefInterno(codiceInternoPrefisso);
		
		TipoScreenType tipoScreen = null;
		try {
			tipoScreen = TipoScreenType.fromValue(tipologiaId);
		}catch(IllegalArgumentException e) {
			throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Tipologia").exception();
		}
		
		inParam.setTipoScreen(tipoScreen);
		
		Holder<ErroriType> errori = new Holder<ErroriType>();
		
		Holder<CheckEtaScreeningOutParametersType> outParam = new Holder<CheckEtaScreeningOutParametersType>(); 
		try {
			soapClient.checkEtaScreening(credenziali, inParam, errori, outParam);
		} catch (CheckEtaScreeningFaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio checkEtaScreening").exception();
		}

		checkSuccesso(errori, CittadiniCitIdAppuntamentoTipologiaIdPrenotabileGetService.class);

		ModelPrenotabile result = new ModelPrenotabileMapper().from(outParam.value);

		return Response.ok(result).build();
	}

}
