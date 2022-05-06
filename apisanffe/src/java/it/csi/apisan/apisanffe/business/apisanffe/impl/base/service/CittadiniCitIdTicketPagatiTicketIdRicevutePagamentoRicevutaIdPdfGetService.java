/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.impl.base.service;

import java.math.BigInteger;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanffe.business.apisanffe.impl.base.FfeDelegheRESTBaseService;
import it.csi.apisan.apisanffe.exception.ErroreBuilder;
import it.csi.apisan.apisanffe.util.ConstantsFfe;
import it.csi.gpr.LMSGetRicevutaRequest;
import it.csi.gpr.LMSGetRicevutaRequestType;
import it.csi.gpr.LMSGetRicevutaResponse;
import it.csi.gpr.LMSRicevutaDettPraticaRicevutaType;
import it.csi.gpr.ProxyGPRPortType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTicketPagatiTicketIdRicevutePagamentoRicevutaIdPdfGetService
		extends FfeDelegheRESTBaseService {

	@Autowired
	private ProxyGPRPortType gprService;
	private String citId;
	private String ricevutaId;
	private String ticketId;
	private BigInteger modalitaRimborso;
	private String idAsr;

	public CittadiniCitIdTicketPagatiTicketIdRicevutePagamentoRicevutaIdPdfGetService(String citId,String ticketId,String ricevutaId, 
			String idAsr, SecurityContext securityContext, HttpHeaders httpHeaders , @Context HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);	
		
		this.citId = citId;
		this.ricevutaId = ricevutaId;
		this.ticketId = ticketId;
		this.idAsr = idAsr;
	}

	@Override
	protected Response execute() {
		checkNotBlank(shibIdentitaCodiceFiscale, "Valorizzare identita");
		checkNotBlank(xCodiceServizio, "Valorizzare il codice servizio");
		checkNotBlank(citId, "Valorizzare il codice fiscale del cittadino");
		checkNotBlank(ricevutaId, "Valorizzare il query param xricevutaid");
		checkNotBlank(idAsr, "Valorizzare l'id dell'asr");
		checkUtenteAutorizzatoOrDelegato(citId);
		
		//TODO verificare con paola e Contini quale servizio richimare: lmsGetRicevuta ritorna una struttura con 
		LMSGetRicevutaResponse res = gprService.lmsGetRicevuta(createRequest());
		
		checkSuccesso(res.getERRORE());
		
		List<LMSRicevutaDettPraticaRicevutaType> lista = null;
		
		if(res.getRISPOSTA().getPRATICA() != null) {
			if (res.getRISPOSTA().getPRATICA().getELENCORICEVUTESTAMPAASR() != null
					&& res.getRISPOSTA().getPRATICA().getELENCORICEVUTESTAMPAASR().getRICEVUTA() != null
					&& res.getRISPOSTA().getPRATICA().getELENCORICEVUTESTAMPAASR().getRICEVUTA().size() > 0) {

				lista = res.getRISPOSTA().getPRATICA().getELENCORICEVUTESTAMPAASR().getRICEVUTA();

			} else if (res.getRISPOSTA().getPRATICA().getELENCORICEVUTECORTESIA() != null
					&& res.getRISPOSTA().getPRATICA().getELENCORICEVUTECORTESIA().getRICEVUTA() != null
					&& res.getRISPOSTA().getPRATICA().getELENCORICEVUTECORTESIA().getRICEVUTA().size() > 0) {
				lista = res.getRISPOSTA().getPRATICA().getELENCORICEVUTECORTESIA().getRICEVUTA();
			} 
		}
		if(lista == null) {
			throw ErroreBuilder.from(Status.NOT_FOUND).title("Ricevuta non trovata").exception();
		}
		LMSRicevutaDettPraticaRicevutaType tmp = lista.get(0);
		String fileCodificato = tmp.getSTAMPA();
		
		StringBuilder fileName = new StringBuilder( ConstantsFfe.HEADER_FILE_NAME).append(this.citId).append("_").append(tmp.getIDRICEVUTA()).append(".pdf");
		
		return Response.ok().entity(getFileCodificatoFromString(fileCodificato)).header(ConstantsFfe.HEADER_CONTENT_DISPOSITION, fileName.toString()).type("application/pdf").build();
	}
	
	

	
	private LMSGetRicevutaRequest createRequest() {
		
		LMSGetRicevutaRequest request = new LMSGetRicevutaRequest();
		
		LMSGetRicevutaRequestType richiesta = new LMSGetRicevutaRequestType();
		richiesta.setCODICEFISCALE(citId);
		richiesta.setNUMEROPRATICA(ticketId);
		richiesta.getIDRICEVUTA().add(ricevutaId);
		richiesta.setCODICESERVIZIO(ConstantsFfe.CODICE_SERVIZIO);
		richiesta.setCODICEASR(idAsr);
		request.setRICHIESTA(richiesta);
		
		return request;
	}

}
