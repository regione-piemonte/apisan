/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.impl.base.service;

import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
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
import it.csi.gpr.LMSPraticaRicevutaType;
import it.csi.gpr.LMSRicevutaDettPraticaRicevutaType;
import it.csi.gpr.ProxyGPRPortType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTicketPagatiTicketIdRicevuteRimborsoRicevutaIdPdfGetService
		extends FfeStampeRESTBaseService {
	
	@Autowired
	private ProxyGPRPortType gprService;
	private String citId;
	private String ticketId;
	private String ricevutaId;
	private String rimborsoModalitaCodice;
	 
	
	public CittadiniCitIdTicketPagatiTicketIdRicevuteRimborsoRicevutaIdPdfGetService(String citId,String ticketId,
			String ricevutaId,String rimborsoModalitaCodice,SecurityContext securityContext, HttpHeaders httpHeaders , HttpServletRequest httpRequest ) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		this.ticketId = ticketId;
		this.ricevutaId = ricevutaId;
		this.rimborsoModalitaCodice = rimborsoModalitaCodice;		
	}

	@Override
	protected Response execute() {
		checkNotBlank(shibIdentitaCodiceFiscale, "Valorizzare identita");
		checkNotBlank(xCodiceServizio, "Valorizzare il codice servizio");
		checkNotBlank(citId, "Valorizzare il codice fiscale del cittadino");
		checkNotBlank(ticketId, "Valorizzare il ticket id");
		checkNotBlank(ricevutaId, "Valorizzare il path param ricevutaid");
		checkUtenteAutorizzatoOrDelegato(citId);
		LMSGetRicevutaResponse res = gprService.lmsGetRicevuta(createRequest());
		
		checkSuccesso(res.getERRORE());
		String fileCodificato = null;
		StringBuilder fileName = null; 
		
		if (isResponseNotNull(res)) {
			LMSPraticaRicevutaType pratica = res.getRISPOSTA().getPRATICA();
			if (StringUtils.isEmpty(rimborsoModalitaCodice)) {
				//Si tratta di una ricevuta di rimborso
				
				List<LMSRicevutaDettPraticaRicevutaType> lista = null;
				if(isNotEmptyRicevutaStampaAsrRimborso(pratica)){
					fileCodificato  = pratica.getELENCORICEVUTESTAMPAASR().getRIMBORSO().get(0).getSTAMPA();
					fileName = new StringBuilder( ConstantsFfe.HEADER_FILE_NAME).append(pratica.getELENCORICEVUTESTAMPAASR().getRIMBORSO().get(0).getIDRIMBORSO());
				}else if(isNotEmptyRicevuteCortesiaRimborso(pratica)) {
					fileCodificato  = pratica.getELENCORICEVUTECORTESIA().getRIMBORSO().get(0).getSTAMPA();
					fileName = new StringBuilder( ConstantsFfe.HEADER_FILE_NAME).append(pratica.getELENCORICEVUTECORTESIA().getRIMBORSO().get(0).getIDRIMBORSO());
				}
				
			} else {
				//SI TRATTA di un voucher
				fileName = new StringBuilder( ConstantsFfe.HEADER_FILE_NAME).append(pratica.getNUMEROPRATICA());
				if(pratica.getATTESTATORICHIESTARIMBORSO() != null) {
					fileCodificato = pratica.getATTESTATORICHIESTARIMBORSO().getSTAMPA();
				}
					
			} 
		}
		
		if(StringUtils.isEmpty(fileCodificato)) {
			throw ErroreBuilder.from(Status.NOT_FOUND).title("Stampa non trovata").exception();
		}
		
		return Response.ok().entity(getFileCodificatoFromString(fileCodificato)).header(ConstantsFfe.HEADER_CONTENT_DISPOSITION, fileName.toString()) .type("application/pdf").build();
		
		
	}
	
	private LMSGetRicevutaRequest createRequest() {
		
		LMSGetRicevutaRequest request = new LMSGetRicevutaRequest();
		
		LMSGetRicevutaRequestType richiesta = new LMSGetRicevutaRequestType();
		richiesta.setCODICEFISCALE(citId);
		if(StringUtils.isEmpty(rimborsoModalitaCodice)) {
			richiesta.setNUMEROPRATICA(ticketId);
			richiesta.getIDRICEVUTA().add(ricevutaId);
		}else {
			try {
				richiesta.setMODALITARIMBORSO(new BigInteger(rimborsoModalitaCodice));
			} catch (NumberFormatException e) {
				
				throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "rimborso_modalita_codice").exception();
			}
		}
		request.setRICHIESTA(richiesta);
		return request;
	}

}
