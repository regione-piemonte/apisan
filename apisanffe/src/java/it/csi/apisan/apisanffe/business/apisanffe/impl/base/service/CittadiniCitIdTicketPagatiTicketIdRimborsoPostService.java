/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.impl.base.service;

import java.math.BigInteger;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanffe.business.apisanffe.impl.base.FfeDelegheRESTBaseService;
import it.csi.apisan.apisanffe.dto.apisanffe.PayloadRimborsoNuovo;
import it.csi.apisan.apisanffe.util.ConstantsFfe;
import it.csi.gpr.ProxyGPRPortType;
import it.csi.gpr.SetModalitaErogazioneRimborsoGPRRequest;
import it.csi.gpr.SetModalitaErogazioneRimborsoGPRResultType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTicketPagatiTicketIdRimborsoPostService extends FfeDelegheRESTBaseService {
	
	@Autowired
	private ProxyGPRPortType gprService;	
	private String citId;
	private String ticketId;
	private PayloadRimborsoNuovo payloadRimborsoNuovo;
	
	public CittadiniCitIdTicketPagatiTicketIdRimborsoPostService(String citId,String ticketId,PayloadRimborsoNuovo payloadRimborsoNuovo,SecurityContext securityContext, HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.ticketId = ticketId;
		this.payloadRimborsoNuovo = payloadRimborsoNuovo;
	}

	@Override
	protected Response execute() {
		checkNotBlank(shibIdentitaCodiceFiscale, "Valorizzare identita");
		checkNotBlank(xCodiceServizio, "Valorizzare il codice servizio");
		checkNotBlank(citId, "Valorizzare il codice fiscale del cittadino");
		checkNotBlank(ticketId, "Valorizzare il ticket id");
		checkNotNull(payloadRimborsoNuovo, "Valorizzare il path param ricevutaid");
		checkUtenteAutorizzatoOrDelegato(citId);
		SetModalitaErogazioneRimborsoGPRResultType response = gprService.setModalitaErogazioneRimborsoGPR(createRequest());
		
		checkSuccesso(response.getERRORE()); 
		
		return Response.status(Status.CREATED).build();
	}
	
	private SetModalitaErogazioneRimborsoGPRRequest createRequest() {
		SetModalitaErogazioneRimborsoGPRRequest request = new SetModalitaErogazioneRimborsoGPRRequest();
		
		checkNotNull(payloadRimborsoNuovo.getRimborsoModalitaCodice(), "Valorizzare il codice della modalità di rimborso");
		BigInteger modalitaRimborso = BigInteger.valueOf(payloadRimborsoNuovo.getRimborsoModalitaCodice().intValue());
		
		request.setIBAN(getJaxbElement(ConstantsFfe.NAMESPACE, "IBAN", String.class, payloadRimborsoNuovo.getIban()));
		request.setMODALITARIMBORSO(modalitaRimborso);
		request.setNUMEROPRATICA(ticketId);
		request.setUUID(xRequestID);
		
		return request;
	}

}
