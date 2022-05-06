/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ScreenAnagraficaRESTBaseService;
import it.csi.apisan.apisanscreen.business.mapper.ModelDocumentoListaGetElencoDocumentiDigitaliOutParametersTypeMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelDocumentoLista;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ApisanScreenStatus;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.ArrayOfGetElencoDocumentiDigitaliOutParametersType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.GetElencoDocumentiDigitaliFaultException;
import it.csi.screenserviziwebsol.GetElencoDocumentiDigitaliInParametersType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiGetService extends ScreenAnagraficaRESTBaseService {
	
	private String codiceInterno;
	private String codiceInternoPrefisso;
	
	
	public CittadiniCitIdDocumentiGetService(String citId, String codiceInterno,
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
		
		checkNotNull(codiceInterno, "Codice Interno non valorizzato");
		checkNotNull(codiceInternoPrefisso, "Codice Interno Prefisso non valorizzato");		
		
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
		
		GetElencoDocumentiDigitaliInParametersType inParam = new GetElencoDocumentiDigitaliInParametersType();
		

		inParam.setPCodIdInterno(i);
		inParam.setPPrefIdInterno(codiceInternoPrefisso);
		
		Holder<ErroriType> errori = new Holder<ErroriType>();
		
		Holder<ArrayOfGetElencoDocumentiDigitaliOutParametersType> outParam = new Holder<ArrayOfGetElencoDocumentiDigitaliOutParametersType>();
		
		try {
			soapClient.getElencoDocumentiDigitali(credenziali, inParam, errori, outParam);
		} catch (GetElencoDocumentiDigitaliFaultException e) {
			log.error(methodName, e.getMessage(), e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore durante la chiamata al servizio getElencoDocumentiDigitali").exception();
		}
		
		checkSuccesso(errori, CittadiniCitIdDocumentiGetService.class);
		
		List<ModelDocumentoLista> res = new ArrayList<ModelDocumentoLista>();
		if(outParam.value != null) {
			res = new ModelDocumentoListaGetElencoDocumentiDigitaliOutParametersTypeMapper().fromList(outParam.value.getGetElencoDocumentiDigitaliOutParameters());
		}
		
		return Response.ok(res).build();
	}

}
