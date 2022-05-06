/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseOscuramentoRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelOscuramentoOscuramentoMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.Delega;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelOscuramento;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadOscuramento;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.oscuramento.dma.Paziente;
import it.csi.apisan.apisanfse.integration.oscuramento.dma.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.oscuramento.dmacc.SetOscuramento;
import it.csi.apisan.apisanfse.integration.oscuramento.dmacc.SetOscuramentoResponse;
import it.csi.apisan.apisanfse.util.TipoOscuramento;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdOscuramentoPutService extends FseOscuramentoRESTBaseService{
	
	private String citId;
	private String servizio;
	private PayloadOscuramento payloadOscuramento;
			
	private SetOscuramento request;
	private SetOscuramentoResponse response;
	
	
	public CittadiniCitIdOscuramentoPutService(String xRequestId, String xForwardedFor, String xCodiceServizio,
	String shibIdentitaCodiceFiscale, String citId, String servizio, PayloadOscuramento payloadOscuramento,
	SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId = citId;
		this.servizio = servizio;
		this.payloadOscuramento=payloadOscuramento;
		
	}

	@Override
	protected void validateRequestParameters() {
		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "PutOscuramento versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotNull(servizio, "Codice del servizio non valorizzata");
		checkNotBlank(servizio, "Codice del servizio non valorizzato");
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(citId);
		verificaUtenteAutorizzatoODelegato(citId, servizio, new Delega());
		checkNotNull(payloadOscuramento, "Dati per oscurare un documento o uno screening non valorizzato");
		//TODO verificare payloadOscuramento.getPaziente().getCodiceFiscale() e citId?
		
	}

	private void checkOscuramento() {
		checkNotNull(payloadOscuramento.getOscuramento(), "Oscuramento non valorizzato ");
		checkCondition(payloadOscuramento.getOscuramento().size() > 0 , "Oscuramento non valorizzato ");
		
		for(ModelOscuramento tmp : payloadOscuramento.getOscuramento() ) {
			//Verifioc che sia impostato il tipo di dato e che sia corretto
			checkNotNull(tmp.getTipoDiDato(), "Tipo di dato non valorizzato");
			
			try {
				TipoOscuramento tipoOscuramento = TipoOscuramento.valueOf(tmp.getTipoDiDato().getCodice());
			} catch (IllegalArgumentException e) {
				throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Tipo di dato").exception();
			}
		}
	}
	
	@Override
	protected void setSoapRequest() {
		request = new SetOscuramento();
		//request.setPaziente(new ModelPazientePazienteMapper().to(payloadOscuramento.getPaziente()));
		Paziente paz = new Paziente();
		paz.setCodiceFiscale(citId);
		request.setPaziente(paz);
		request.setRichiedente(newRichiedenteInfo(this.servizio));
		for(ModelOscuramento tmp : payloadOscuramento.getOscuramento()) {
			request.getOscuramento().add(new ModelOscuramentoOscuramentoMapper().to(tmp));
		}
	}

	@Override
	protected void callService() {
		response = oscuramentoService.setOscuramento(request);
		
	}

	@Override
	protected void checkErrors() throws ErroreRESTException {
		//In caso di fallimento torno errore
		if(response.getEsito().equals(RisultatoCodice.FALLIMENTO)) {
			throw toRESTOscuramentoException(response.getErrori());
		}
		
	}

	@Override
	protected Response getResponse() {
		return Response.ok().header("X-Request-ID", xRequestID).build();
	}

}

