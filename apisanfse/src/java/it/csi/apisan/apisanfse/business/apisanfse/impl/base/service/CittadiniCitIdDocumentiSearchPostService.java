/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDocumentiRESTBaseService;
import it.csi.apisan.apisanfse.business.integration.dao.ApisanTCategoriaTipoDocDao;
import it.csi.apisan.apisanfse.business.mapper.DateTStringMapper;
import it.csi.apisan.apisanfse.business.mapper.ModelDocumentoAreaRossaDocumentoAreaRossaMapper;
import it.csi.apisan.apisanfse.business.mapper.ModelDocumentoDocumentoMapper;
import it.csi.apisan.apisanfse.business.mapper.ModelDocumentoVerificaStatoRichiestaResMapper;
import it.csi.apisan.apisanfse.business.mapper.ModelFiltroDocsFiltroDocsMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.FiltroDocsExt;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumento;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelRispostaTuttiDocs;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSearchDocumenti;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSearchDocumenti.AreaEnum;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetTuttiDocsRequest;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.GetTuttiDocsResponse;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.scaricostudi.CCScaricoStudiServicePortType;
import it.csi.apisan.apisanfse.integration.scaricostudi.VerificaStatoRichiestaReq;
import it.csi.apisan.apisanfse.integration.scaricostudi.VerificaStatoRichiestaRes;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiSearchPostService  extends FseDocumentiRESTBaseService {
	
	private String citId; 
	private Integer limit;
	private Integer offset;
	private PayloadSearchDocumenti payloadSearchDocumenti;
	
	@Autowired
	ApisanTCategoriaTipoDocDao apisanTCategoriaTipoDocDao;
	
	
	
	public CittadiniCitIdDocumentiSearchPostService(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, String citId, Integer limit, Integer offset,
			PayloadSearchDocumenti payloadSearchDocumenti, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId=citId; 
		this.limit=limit;
		this.offset=offset;
		this.payloadSearchDocumenti=payloadSearchDocumenti;		
	}	

	@Override
	protected Response execute() {

		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "GetTuttiDocs versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(citId, "Codice fiscale non valorizzato");				
		checkCodiceFiscaleValido(citId);
		checkNotNull(payloadSearchDocumenti, "Dati per la ricerca dei documenti non valorizzati");
							
		GetTuttiDocsRequest request = getGetTuttiDocsRequest(payloadSearchDocumenti.getArea());		    
        GetTuttiDocsResponse response = documentiService.getTuttiDocs(request);
        
        //In caso di fallimento torno errore
  		if(response.getEsito().equals(RisultatoCodice.FALLIMENTO)) {
  			throw toRESTDocumentiException(response.getErrori());
  		}
  			  		
  		ModelRispostaTuttiDocs  modelRispostaTuttiDocs = new ModelRispostaTuttiDocs();
  		modelRispostaTuttiDocs.setNumeroDocumenti(response.getNumeroDocumenti());
  		modelRispostaTuttiDocs.setDocumenti(response.getDocumenti().stream().map( 
  				dest -> {
	  					ModelDocumento modelDocumento = new ModelDocumentoDocumentoMapper().from(dest);
	  					//arricchisciScaricoStudi(modelDocumento, citId);	  					
	  					return modelDocumento;
	  				}
  				).collect(Collectors.toList()));  	
  		modelRispostaTuttiDocs.setDocumentoAreaRossa(new ModelDocumentoAreaRossaDocumentoAreaRossaMapper().fromList(response.getDocumentoAreaRossa()));
  		
  		return Response.ok(modelRispostaTuttiDocs).build();	
	}
	
	private GetTuttiDocsRequest getGetTuttiDocsRequest(AreaEnum area) {
		if(area!=null && area.equals(AreaEnum.ROSSA)) {
			return this.getRequestAreaRossa();
		}
		return this.getRequestAreaBlu();
	}

	private GetTuttiDocsRequest getRequestAreaRossa() {
		GetTuttiDocsRequest request;
		request = new GetTuttiDocsRequest();
		request.setArea(AreaEnum.ROSSA.name());
		request.setCfPaziente(this.citId);
		request.setRichiedente(newRichiedenteInfo(payloadSearchDocumenti.getApplicazioneVerticale()));											
		FiltroDocsExt filtroDocs = new FiltroDocsExt(apisanTCategoriaTipoDocDao.getCategorieTipologiePerGetTuttiDocs());		
		Calendar c= GregorianCalendar.getInstance();
		Date dataFine = c.getTime();
		c.add(Calendar.DATE, -45);
		Date dataInizio=c.getTime();
		request.setLimit(limit);
    	request.setOffSet(offset);
		filtroDocs.setDataFine(new DateTStringMapper("dd/MM/yyyy").to(dataFine));
		filtroDocs.setDataInizio(new DateTStringMapper("dd/MM/yyyy").to(dataInizio));
		request.setFiltroDocs(filtroDocs);
		return request;
	}

	private GetTuttiDocsRequest getRequestAreaBlu() {		
		
        GetTuttiDocsRequest request = new GetTuttiDocsRequest();
        request.setRichiedente(newRichiedenteInfo(payloadSearchDocumenti.getApplicazioneVerticale()));
    	request.setCfPaziente(this.citId);
    	request.setLimit(limit);
    	request.setOffSet(offset);
    	
    	//request.setArea("BLU");    	
    	request.setFiltroDocs(new ModelFiltroDocsFiltroDocsMapper().to(payloadSearchDocumenti.getFiltroDocs()));
		return request;
	}

}

