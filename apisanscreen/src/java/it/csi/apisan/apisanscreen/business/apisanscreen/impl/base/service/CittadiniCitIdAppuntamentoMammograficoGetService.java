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
import it.csi.apisan.apisanscreen.business.mapper.ModelAppuntamentoListaScrMam01OutParametersTypeMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelAppuntamentoLista;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ApisanScreenStatus;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.ScrMam01FaultException;
import it.csi.screenserviziwebsol.ScrMam01InParametersType;
import it.csi.screenserviziwebsol.ScrMam01OutParametersType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdAppuntamentoMammograficoGetService extends ScreenAnagraficaRESTBaseService {
	
	String codiceInterno;
	String codiceInternoPrefisso;


	
	public CittadiniCitIdAppuntamentoMammograficoGetService(String citId, String codiceInterno,
			String codiceInternoPrefisso, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(citId, securityContext, httpHeaders);
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
		checkNotBlank(codiceInterno, "Codice Interno non valorizzato");
		checkNotBlank(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");
		checkUtenteAutorizzatoOrDelegato(citId);
		Integer i = null;
		try {
			i = Integer.valueOf(codiceInterno);
			
		} catch(NumberFormatException nfe) {
			throw ErroreBuilder.from(ApisanScreenStatus.PARAMETRO_NON_VALIDO, "Codice Interno").exception();
		}
		checkIdInternoValido(i, codiceInternoPrefisso);
		
		CredenzialiType credenziali = getCredenzialiType(citId);
		
		ScrMam01InParametersType scrMam01InParameters = new ScrMam01InParametersType();
		scrMam01InParameters.setPCodInterno(i);

		scrMam01InParameters.setPPrefInterno(codiceInternoPrefisso);
		Holder<ErroriType> errori = new Holder<ErroriType>();
		Holder<ScrMam01OutParametersType> scrMam01OutParameters = new Holder<ScrMam01OutParametersType>();
		try {
			soapClient.scrMam01(credenziali, scrMam01InParameters, errori, scrMam01OutParameters);
		} catch (ScrMam01FaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio scrMam01").exception();
		}
		checkSuccesso(errori, CittadiniCitIdAppuntamentoMammograficoGetService.class);
		ModelAppuntamentoLista result = new ModelAppuntamentoListaScrMam01OutParametersTypeMapper().from(scrMam01OutParameters.value);
		valorizzatAppuntamentoLista(result);
		return Response.ok(result).build();
	}

}
