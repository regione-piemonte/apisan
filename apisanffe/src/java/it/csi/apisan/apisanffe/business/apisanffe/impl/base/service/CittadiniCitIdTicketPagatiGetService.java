/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.impl.base.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanffe.business.apisanffe.impl.base.FfeDelegheRESTBaseService;
import it.csi.apisan.apisanffe.business.apisanffe.mapper.ModelTicketPagatoLMSPraticaTicketPagatiTypeMapper;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelTicketPagato;
import it.csi.apisan.apisanffe.util.ConstantsFfe;
import it.csi.gpr.LMSGetTicketPagatiRequest;
import it.csi.gpr.LMSGetTicketPagatiRequestType;
import it.csi.gpr.LMSGetTicketPagatiResponse;
import it.csi.gpr.ProxyGPRPortType;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTicketPagatiGetService extends FfeDelegheRESTBaseService {
	
	@Autowired
	private ProxyGPRPortType gprService;
	private String citId;
	private Integer annoPagamento;
	
	public CittadiniCitIdTicketPagatiGetService(String citId, Integer annoPagamento, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.annoPagamento = annoPagamento;		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Valorizzare il codice servizio");
		checkNotBlank(shibIdentitaCodiceFiscale, "Valorizzare l'identita");
		checkNotNull(annoPagamento, "Valorizzare l'anno di pagamento");
		checkNotBlank(citId, "Valorizzare il codice fiscale");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		List<ModelTicketPagato>  res = new ArrayList<ModelTicketPagato>();		
		LMSGetTicketPagatiResponse response = gprService.lmsGetTicketPagati(createRequestTicketPagati());
		
		checkSuccesso(response.getERRORE());
		
		if(response.getRISPOSTA() != null && response.getRISPOSTA().getPRATICHEDELEGATO() != null) {
			res=		new ModelTicketPagatoLMSPraticaTicketPagatiTypeMapper().fromList(response.getRISPOSTA().getPRATICHEDELEGATO().getPRATICA());
		}
		
		return Response.ok().entity(res).build();
	}
	
	
	private LMSGetTicketPagatiRequest createRequestTicketPagati() {
		LMSGetTicketPagatiRequest request = new LMSGetTicketPagatiRequest();
		LMSGetTicketPagatiRequestType richiesta = new LMSGetTicketPagatiRequestType();
		
		richiesta.setANNOPAGAMENTO(annoPagamento.toString());
		richiesta.setCODICEFISCALE(citId);
		richiesta.setCODICESERVIZIO(ConstantsFfe.CODICE_SERVIZIO);
		richiesta.setUUID(xRequestID);
		
		request.setRICHIESTA(richiesta);
		
		return request;
	}
}
