/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.impl.base.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanffe.business.apisanffe.mapper.ModelPraticaRicevutaLMSPraticaRicevutaTypeMapper;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelPraticaRicevuta;
import it.csi.apisan.apisanffe.dto.apisanffe.PayloadStampaRichiestaRimborso;
import it.csi.apisan.apisanffe.exception.ErroreBuilder;
import it.csi.apisan.apisanffe.util.ConstantsFfe;
import it.csi.apisan.apisanffe.util.PdfHandler;
import it.csi.gpr.LMSDettPraticaRicevutaType;
import it.csi.gpr.LMSGetRicevutaRequest;
import it.csi.gpr.LMSGetRicevutaRequestType;
import it.csi.gpr.LMSGetRicevutaResponse;
import it.csi.gpr.LMSPraticaRicevutaType;
import it.csi.gpr.ProxyGPRPortType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTicketPagatiTicketIdRichiestaRimborsoPdfPostService extends FfeStampeRESTBaseService {

	@Autowired
	private ProxyGPRPortType gprService;
	private String citId; 
	private String ticketId;
	private PayloadStampaRichiestaRimborso payloadStampaRichiestaRimborso;
	
	
	public CittadiniCitIdTicketPagatiTicketIdRichiestaRimborsoPdfPostService(String citId, String ticketId,
			PayloadStampaRichiestaRimborso payloadStampaRichiestaRimborso, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId; 
		this.ticketId = ticketId;
		this.payloadStampaRichiestaRimborso = payloadStampaRichiestaRimborso;
	}

	@Override
	protected Response execute() {
		checkNotBlank(shibIdentitaCodiceFiscale, "Valorizzare identita");
		checkNotBlank(xCodiceServizio, "Valorizzare il codice servizio");
		checkNotBlank(citId, "Valorizzare il codice fiscale del cittadino");
		checkNotBlank(ticketId, "Valorizzare ticketid");
		checkNotNull(payloadStampaRichiestaRimborso, "Valorizzare l'id dell'asr");
		checkPayload();
		checkUtenteAutorizzatoOrDelegato(citId);
		LMSGetRicevutaResponse res = gprService.lmsGetRicevuta(createRequest());
		
		checkSuccesso(res.getERRORE());
		
		if(richiestoIlJson()) {
			ModelPraticaRicevuta resJson = new ModelPraticaRicevutaLMSPraticaRicevutaTypeMapper().from(res.getRISPOSTA().getPRATICA());
			return Response.ok().entity(resJson).type("application/json").build();
		}
		
		LMSPraticaRicevutaType pratica = res.getRISPOSTA().getPRATICA();
		byte[] pdf = null;
		StringBuilder nomeAttachement = null;
		LMSDettPraticaRicevutaType dettaglioPraticaRicevuta = null;
		ByteArrayOutputStream bo = null;
		bo = new ByteArrayOutputStream(res.toString().getBytes().length);
		ZipOutputStream out = createZipDaStream(bo);
		
		/*
		 * Come nome del file mettere ricevuta_id ricevuta per le ricevute  e rimborso id_rimborso per i rimborsi
		 * */
		//primo step capire se si tratta di un file pdf o un array
		int numFile = 0;
		
		if(rispostaAttestatoRichiestaRimborso(pratica) ) {
			numFile = 1;
			pdf = getFileCodificatoFromString(pratica.getATTESTATORICHIESTARIMBORSO().getSTAMPA());
			nomeAttachement = new StringBuilder( ConstantsFfe.HEADER_FILE_NAME).append( pratica.getNUMEROPRATICA()).append(".pdf");
			//da togliere
			aggiungiFileAZip(out, pratica.getNUMEROPRATICA() + ".pdf", getFileCodificatoFromString(pratica.getATTESTATORICHIESTARIMBORSO().getSTAMPA()));			
		} if(valorizzatoRicevuteTelematiche(pratica)) {
			//Stampa ricevute telematiche
			if(pratica.getELENCORICEVUTETELEMATICHE().getRICEVUTA().size() == 1) {
				numFile++;
				pdf = getFileCodificatoFromString(pratica.getELENCORICEVUTETELEMATICHE().getRICEVUTA().get(0).getSTAMPA());
				nomeAttachement = new StringBuilder( ConstantsFfe.HEADER_FILE_NAME).append(pratica.getELENCORICEVUTETELEMATICHE().getRICEVUTA().get(0).getIDRT()).append(".pdf");
				aggiungiFileAZip(out, pratica.getELENCORICEVUTETELEMATICHE().getRICEVUTA().get(0).getIDRT() + ".pdf", getFileCodificatoFromString(pratica.getELENCORICEVUTETELEMATICHE().getRICEVUTA().get(0).getSTAMPA()));
				
			}else {
				numFile += pratica.getELENCORICEVUTETELEMATICHE().getRICEVUTA().size();
				pratica.getELENCORICEVUTETELEMATICHE().getRICEVUTA().stream().forEach(c -> aggiungiFileAZip(out, c.getIDRT() + ".pdf", getFileCodificatoFromString( c.getSTAMPA())));     
			}
			
		} if(valorizzatoEsitiPagamento(pratica)) {
			//Stampa esiti pagamento
			if(pratica.getELENCOESITIPAGAMENTO().getESITO().size() == 1) {
				numFile++;
				pdf = getFileCodificatoFromString(pratica.getELENCOESITIPAGAMENTO().getESITO().get(0).getSTAMPA());
				nomeAttachement = new StringBuilder( ConstantsFfe.HEADER_FILE_NAME).append(pratica.getELENCOESITIPAGAMENTO().getESITO().get(0).getIDESITO()).append(".pdf");
				aggiungiFileAZip(out, pratica.getELENCOESITIPAGAMENTO().getESITO().get(0).getIDESITO() + ".pdf", getFileCodificatoFromString(pratica.getELENCOESITIPAGAMENTO().getESITO().get(0).getSTAMPA()));
				
			}else {
				numFile += pratica.getELENCOESITIPAGAMENTO().getESITO().size();
				pratica.getELENCOESITIPAGAMENTO().getESITO().stream().forEach(c ->    aggiungiFileAZip(out, c.getIDESITO() + ".pdf" , getFileCodificatoFromString(c.getSTAMPA()) ) );
			}
		}
		 if(valorizzatoRicevutaStampaAsr(pratica) ) {
			
			 
			PdfHandler pdfHandler = aggiungiDettaglioPratica(pratica.getELENCORICEVUTESTAMPAASR(), out, numFile, pdf, nomeAttachement);
			numFile = pdfHandler.getNumFile();
			pdf = pdfHandler.getPdf();
			nomeAttachement = pdfHandler.getNomeAttachement();
			
		} if(valorizzatoRicevuteCortesia(pratica)) {
			
			PdfHandler pdfHandler = aggiungiDettaglioPratica(pratica.getELENCORICEVUTECORTESIA(), out, numFile, pdf, nomeAttachement);
			numFile = pdfHandler.getNumFile();
			pdf = pdfHandler.getPdf();
			nomeAttachement = pdfHandler.getNomeAttachement();
			
		} if(valorizzatoRicevuteStampaRegionale(pratica)) {
			PdfHandler pdfHandler =aggiungiDettaglioPratica(pratica.getELENCORICEVUTESTAMPAREGIONALE(), out, numFile, pdf, nomeAttachement);
			numFile = pdfHandler.getNumFile();
			pdf = pdfHandler.getPdf();
			nomeAttachement = pdfHandler.getNomeAttachement();
		}
		
		chiudiOutputStream(out);
		if(numFile > 1) {
			byte[] fileByte = bo.toByteArray();
			return Response.ok().entity(fileByte).header(ConstantsFfe.HEADER_CONTENT_DISPOSITION, ticketId + ".zip").type("application/zip").build();
		}else {
			return Response.ok().entity(pdf).header(ConstantsFfe.HEADER_CONTENT_DISPOSITION, nomeAttachement.toString()).type("application/pdf").build();
		}
		
	}
	
	
	
	private PdfHandler aggiungiDettaglioPratica(LMSDettPraticaRicevutaType dettaglioPraticaRicevuta , ZipOutputStream out, int numFile, byte[] pdf, StringBuilder nomeAttachement) {
		PdfHandler tmpFile = new PdfHandler();
		if(dettaglioPraticaRicevuta != null) {
			//sono in un elenco di stampaasr o cortesia o stampa regionale
			if(isRicevutaFromDettpraticaType(dettaglioPraticaRicevuta) ) {
				//si tratta di array di pratiche
				if(dettaglioPraticaRicevuta.getRICEVUTA().size() == 1) {
					//Si tratta di un singolo pdf
					numFile++;
					pdf = getFileCodificatoFromString(dettaglioPraticaRicevuta.getRICEVUTA().get(0).getSTAMPA());
					nomeAttachement = new StringBuilder( ConstantsFfe.HEADER_FILE_NAME).append( dettaglioPraticaRicevuta.getRICEVUTA().get(0).getIDRICEVUTA()).append(".pdf"); 
					aggiungiFileAZip(out, dettaglioPraticaRicevuta.getRICEVUTA().get(0).getIDRICEVUTA() + ".pdf", getFileCodificatoFromString(dettaglioPraticaRicevuta.getRICEVUTA().get(0).getSTAMPA()));
				}else {
					aggiungiZipADettaglioPraticaRicevuta(dettaglioPraticaRicevuta, out, true);
				}
				
			}else {
				//si tratta di array di rimborsi
				if(dettaglioPraticaRicevuta.getRIMBORSO().size() == 1) {
					numFile++;
					pdf = getFileCodificatoFromString(dettaglioPraticaRicevuta.getRIMBORSO().get(0).getSTAMPA());
					nomeAttachement = new StringBuilder( ConstantsFfe.HEADER_FILE_NAME).append(dettaglioPraticaRicevuta.getRIMBORSO().get(0).getIDRIMBORSO()).append(".pdf");
					aggiungiFileAZip(out, dettaglioPraticaRicevuta.getRIMBORSO().get(0).getIDRIMBORSO() + ".pdf", getFileCodificatoFromString(dettaglioPraticaRicevuta.getRIMBORSO().get(0).getSTAMPA()));
				}else {
					aggiungiZipADettaglioPraticaRicevuta(dettaglioPraticaRicevuta, out, false);
				}
			}	
		}
		tmpFile.setNumFile(numFile);
		tmpFile.setPdf(pdf);
		tmpFile.setNomeAttachement(nomeAttachement);
		
		return tmpFile;
	}
	
	
	private void checkPayload() {		
		checkCondition( (payloadStampaRichiestaRimborso.getModalitaRimborso() == null && checkArrayDefiniti() == 1) || 
				(payloadStampaRichiestaRimborso.getModalitaRimborso() != null && checkArrayDefiniti() == 0), "Impostare o modalita rimborso o solo un array");

		
	}
	
	private int checkArrayDefiniti() {
		int i = 0;
		if( payloadStampaRichiestaRimborso.getIdRicevute() != null && !payloadStampaRichiestaRimborso.getIdRicevute().isEmpty()) {
			i++;
		}
		if (payloadStampaRichiestaRimborso.getEsitiId() != null && !payloadStampaRichiestaRimborso.getEsitiId().isEmpty()) {
			i++;
		}
		if(payloadStampaRichiestaRimborso.getIdRimborso() != null &&  ! payloadStampaRichiestaRimborso.getIdRimborso().isEmpty()) {
			i++;
		}
		if(payloadStampaRichiestaRimborso.getRtId() != null &&  ! payloadStampaRichiestaRimborso.getRtId().isEmpty()) {
			i++;
		}
		return i;
	}	
	
	private boolean checkAlmenoUnArrayDefinito() {
		return (payloadStampaRichiestaRimborso.getIdRicevute() != null && !payloadStampaRichiestaRimborso.getIdRicevute().isEmpty())
		|| (payloadStampaRichiestaRimborso.getEsitiId() != null && payloadStampaRichiestaRimborso.getEsitiId().isEmpty())
		|| (payloadStampaRichiestaRimborso.getIdRimborso() != null &&  ! payloadStampaRichiestaRimborso.getIdRimborso().isEmpty())
		|| (payloadStampaRichiestaRimborso.getRtId() != null &&  ! payloadStampaRichiestaRimborso.getRtId().isEmpty());
	}
	

	
	private void aggiungiZipADettaglioPraticaRicevuta(LMSDettPraticaRicevutaType dettPratica, ZipOutputStream out, boolean isRicevuta) {
		if(isRicevuta) {
			//Sono nell'array delle ricevute
			dettPratica.getRICEVUTA().stream().forEach(c -> aggiungiFileAZip(out, c.getIDRICEVUTA() + ".pdf",  getFileCodificatoFromString(c.getSTAMPA())));
		}else {
			//Sono nell'array dei rimborsi
			dettPratica.getRIMBORSO().stream().forEach(c -> aggiungiFileAZip(out, c.getIDRIMBORSO() + ".pdf",  getFileCodificatoFromString(c.getSTAMPA())));
		}
	}
	
	private boolean rispostaAttestatoRichiestaRimborso(LMSPraticaRicevutaType response) {
		return response.getATTESTATORICHIESTARIMBORSO() != null && response.getATTESTATORICHIESTARIMBORSO().getSTAMPA() != null;
	}
	
	private boolean richiestoIlJson() {
		return payloadStampaRichiestaRimborso.isStampabile() != null && payloadStampaRichiestaRimborso.isStampabile().booleanValue() == false; 
	}
	
	private LMSGetRicevutaRequest createRequest() {
		
		LMSGetRicevutaRequest request = new LMSGetRicevutaRequest();
		
		LMSGetRicevutaRequestType richiesta = new LMSGetRicevutaRequestType();
		richiesta.setCODICEFISCALE(citId);
		richiesta.setCODICESERVIZIO(ConstantsFfe.CODICE_SERVIZIO);
		richiesta.setUUID(xRequestID);
		richiesta.setNUMEROPRATICA(this.ticketId);
		richiesta.setCODICEASR(payloadStampaRichiestaRimborso.getCodiceAsr());
		if(payloadStampaRichiestaRimborso.getModalitaRimborso() != null) {
			richiesta.setMODALITARIMBORSO(BigInteger.valueOf( (payloadStampaRichiestaRimborso.getModalitaRimborso().intValue())));
		}
		if(valorizzatPayloadoEsitiId()) {
			payloadStampaRichiestaRimborso.getEsitiId().stream().forEach(c -> richiesta.getIDESITO().add(c));
		}
		
		if(valorizzatoIdRicevutaPayload()) {
			payloadStampaRichiestaRimborso.getIdRicevute().stream().forEach(c -> richiesta.getIDRICEVUTA().add(c));
		}
		
		if(valorizzatoRimborsoPayload()) {
			payloadStampaRichiestaRimborso.getIdRimborso().stream().forEach(c -> richiesta.getIDRIMBORSO().add(c));
		}
		
		if(valorizzatoIdRtPayload()) {
			payloadStampaRichiestaRimborso.getRtId().stream().forEach(c -> richiesta.getIDRT().add(c));
		}
		request.setRICHIESTA(richiesta);
		
		return request;
	}
	
	private boolean valorizzatPayloadoEsitiId() {
		return payloadStampaRichiestaRimborso.getEsitiId() != null && payloadStampaRichiestaRimborso.getEsitiId().size() > 0;
	}
	
	private boolean valorizzatoIdRicevutaPayload() {
		return payloadStampaRichiestaRimborso.getIdRicevute() != null && payloadStampaRichiestaRimborso.getIdRicevute().size() > 0;
	}
	
	private boolean valorizzatoRimborsoPayload() {
		return payloadStampaRichiestaRimborso.getIdRimborso() != null && payloadStampaRichiestaRimborso.getIdRimborso().size() > 0;
	}
	
	private boolean valorizzatoIdRtPayload() {
		return payloadStampaRichiestaRimborso.getRtId() != null && payloadStampaRichiestaRimborso.getRtId().size() > 0;
	}
	
	private  ZipOutputStream createZipDaStream(ByteArrayOutputStream bo) {
		ZipOutputStream out = new ZipOutputStream(bo);
		return out;		
	}
	
	
	private  void aggiungiFileAZip(ZipOutputStream out, String nomeFile, byte[] data) {
		try {
			ZipEntry e = new ZipEntry(nomeFile);
			out.putNextEntry(e);
			out.write(data, 0, data.length);
			out.closeEntry();
		} catch (IOException e) {
			log.error("CittadiniCitIdTicketPagatiTicketIdRichiestaRimborsoPdfPostService", "aggiungiFileAZip", e);
			throw ErroreBuilder.from(502, "Errore nello scarico del file").exception(); 
		}
	}
	
	private  void chiudiOutputStream(ZipOutputStream out) {
		try {
			out.close();
		} catch (IOException e) {
			log.error("CittadiniCitIdTicketPagatiTicketIdRichiestaRimborsoPdfPostService", "chiudiOutputStream", e);
			throw ErroreBuilder.from(502, "Errore nella chiusura dell'outputSream").exception();
		}
	}
}
