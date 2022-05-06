/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.Date;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FsePazienteRESTBaseSerivce;
import it.csi.apisan.apisanfse.business.mapper.DateXMLGregorianCalendarMapper;
import it.csi.apisan.apisanfse.business.mapper.ModelResponseAccessiGetAccessi2Response;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelResponseAccessi;
import it.csi.apisan.apisanfse.integration.paziente.dmaccbl.GetAccessi2Request;
import it.csi.apisan.apisanfse.integration.paziente.dmaccbl.GetAccessi2Response;
import it.csi.apisan.apisanfse.util.CostantiEtichette;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdAccessiGetService extends FsePazienteRESTBaseSerivce {
	
	private String citId; 
	private String dataInizioRicerca; 
	private String dataFineRicerca;
	
	private Date dataInizio;
	private Date dataFine;
	
	public CittadiniCitIdAccessiGetService(String citId, String dataInizioRicerca, String dataFineRicerca,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.dataInizioRicerca = dataInizioRicerca;
		this.dataFineRicerca = dataFineRicerca;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Valorizzare il codice servizio");
		checkNotBlank(xRequestID, "Valorizzare X-Request-ID");
		checkNotBlank(shibIdentitaCodiceFiscale, "Valorizzare l'identita");
		checkNotBlank(dataInizioRicerca, "valorizzare data inizio ricerca");
		checkNotBlank(dataFineRicerca, "valorizzare data fine ricerca");
		
		dataInizio = dateIsoFromString(dataInizioRicerca, "Data Inizio");
		dataFine = dateIsoFromString(dataFineRicerca, "Data Fine");
		
		GetAccessi2Response response = servicePaziente.getAccessi2(createRequest());
		
		checkSuccessoServicePaziente(response);
		
		ModelResponseAccessi res = new ModelResponseAccessiGetAccessi2Response().from(response);
		
		return Response.ok(res).build();
	}
	
	
	private GetAccessi2Request createRequest() {
		GetAccessi2Request request = new GetAccessi2Request();
		//TODO nel richiedente bisogna passare accessi come applicativo verticale
		request.setRichiedente(newRichiedenteInfo(CostantiEtichette.APPLICAZIONE_VERTICALE_ACCESSI ));
		request.setCfPaziente(citId);
		request.setDataInizioRicerca(new DateXMLGregorianCalendarMapper().to(dataInizio));
		request.setDataFineRicerca(new DateXMLGregorianCalendarMapper().to(dataFine));
		return request;
	}
}
