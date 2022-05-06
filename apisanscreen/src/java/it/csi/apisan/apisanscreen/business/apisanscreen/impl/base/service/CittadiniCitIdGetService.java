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
import it.csi.apisan.apisanscreen.business.mapper.ModelCittadinoScrAna01OutParametersTypeMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelCittadino;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.ScrAna01FaultException;
import it.csi.screenserviziwebsol.ScrAna01InParametersType;
import it.csi.screenserviziwebsol.ScrAna01OutParametersType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdGetService extends ScreenAnagraficaRESTBaseService {
	
	

	
	public CittadiniCitIdGetService( String citId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(citId, securityContext, httpHeaders);
	}


	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale,  "Utente non autorizzato");
		checkNotBlank(citId, "Cit Id non valorizzato");
		checkUtenteAutorizzatoOrDelegato(citId);
		
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
		
		checkSuccesso(errori, ScreenAnagraficaRESTBaseService.class);
		
		ModelCittadino cittadino = new ModelCittadinoScrAna01OutParametersTypeMapper().from(outParam.value);
				
		return Response.ok(cittadino).build();
	}

}
