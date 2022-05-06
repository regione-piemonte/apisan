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
import it.csi.apisan.apisanscreen.business.mapper.ModelAppuntamentoListaScrCit01OutParametersTypeMapper;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelAppuntamentoLista;
import it.csi.apisan.apisanscreen.exception.ErroreBuilder;
import it.csi.apisan.apisanscreen.util.ApisanScreenStatus;
import it.csi.gestutility.ErroriType;
import it.csi.screenserviziwebsol.CredenzialiType;
import it.csi.screenserviziwebsol.ScrCit01;
import it.csi.screenserviziwebsol.ScrCit01FaultException;
import it.csi.screenserviziwebsol.ScrCit01InParametersType;
import it.csi.screenserviziwebsol.ScrCit01OutParametersType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdAppuntamentoCitologicoGetService extends ScreenAnagraficaRESTBaseService {

	private String codiceInterno;
	private String codiceInternoPrefisso;


	public CittadiniCitIdAppuntamentoCitologicoGetService( String citId, String codiceInterno,
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
		
		ScrCit01 request = new ScrCit01();

		CredenzialiType credenziali = getCredenzialiType(citId);

		ScrCit01InParametersType inParam = new ScrCit01InParametersType();
		inParam.setPCodInterno(i);
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
		checkSuccesso(errori, CittadiniCitIdAppuntamentoCitologicoGetService.class);

		ModelAppuntamentoLista result = new ModelAppuntamentoListaScrCit01OutParametersTypeMapper().from(outParam.value);
		valorizzatAppuntamentoLista(result);
		
		return Response.ok(result).build();
	}

}
