/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisanceliachia.business.integration.dao.ApisanCeliachiaDErroreDao;
import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ErroreDettaglio;
import it.csi.apisan.apisanceliachia.exception.ErroreBuilder;
import it.csi.apisan.apisanceliachia.exception.ErroreRESTException;
import it.csi.celiachia.celiachiabesrv.business.InterfacciaCeliachiaBeSrvPortType;
import it.csi.celiachia.celiachiabesrv.input.xsd.BasicInfoInput;
import it.csi.celiachia.celiachiabesrv.output.xsd.BasicEsitoOutput;
import it.csi.celiachia.celiachiabesrv.output.xsd.Errore;

public abstract class CeliachiaCeSrvRESTBaseService extends CeliachiaDelegheRESTBaseService {
	
	protected String citId;
	@Autowired
	protected InterfacciaCeliachiaBeSrvPortType servizioCeliachia;
	
	@Autowired
	private ApisanCeliachiaDErroreDao erroreDao;
	
	public CeliachiaCeSrvRESTBaseService(String citId, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.citId = citId;
		
	}
	
	protected void checkSuccesso(BasicEsitoOutput service, JAXBElement<Errore> errore) {
		 JAXBElement<String> esito = service.getEsito();
		 if(((esito != null) &&  "KO".equals(esito.getValue())) ) {
			 if(isErroreGestito(errore) ) {
				 
				 ErroreDettaglio dettaglio = new ErroreDettaglio(); 
				 dettaglio.setChiave(errore.getValue().getCodice().getValue());
				 if(errore.getValue().getDescrizione() != null) {
					 dettaglio.setValore(errore.getValue().getDescrizione().getValue());
				 }
				 
				 List<ErroreDettaglio> listaDettagli = new ArrayList<ErroreDettaglio>();
				 listaDettagli.add(dettaglio);
				 it.csi.apisan.apisanceliachia.dto.apisanceliachia.Errore errorePres =  erroreDao.getMappingErrore(listaDettagli);
				 
				 throw new ErroreRESTException(errorePres); 
			 }else {
				 throw ErroreBuilder.from(502, "Errore richiamo celiachia").title("Errore richiamo celiachia").exception();
			 }
		 }
		
	}
	
	protected  <T extends BasicInfoInput> T createNewRichiedente( T request ) {
		
		request.setShibIdentitaCodiceFiscale(getJabXShibIdentitaCf());
		request.setXCodiceServizio(getJabXCodiceServizio());
		request.setXForwardedFor(getJabXForwardedFor());
		request.setXRequestId(getJabXRequestId());
		
		return request;
	}
	
	private boolean isErroreGestito(JAXBElement<Errore> errore) {
		return (errore != null && errore.getValue() != null && errore.getValue().getCodice() != null &&  
				!(StringUtils.isEmpty(errore.getValue().getCodice().getValue())));  
	}
	
	protected JAXBElement<String> getJabXShibIdentitaCf(){
		JAXBElement<String> xShibIdentitaCodiceFiscale = new JAXBElement(new QName("http://input/xsd", "shibIdentitaCodiceFiscale"), String.class, this.shibIdentitaCodiceFiscale);
		return xShibIdentitaCodiceFiscale;
	}
	
	protected JAXBElement<String> getJabXCodiceServizio(){
		JAXBElement<String> codiceServizio = new JAXBElement(new QName("http://input/xsd","xCodiceServizio"), String.class, this.xCodiceServizio);
		return codiceServizio;
	}
	
	protected JAXBElement<String> getJabXRequestId(){
		JAXBElement<String> requestId = new JAXBElement(new QName("http://input/xsd","xRequestId"), String.class, this.xRequestID);
		return requestId;
	}
	
	protected JAXBElement<String> getJabXForwardedFor(){
		JAXBElement<String> forwardedFor = new JAXBElement(new QName("http://input/xsd","xForwardedFor"), String.class, this.xForwardedFor);
		return forwardedFor;
	}
	
	protected JAXBElement<String> getJabCitCf(){
		JAXBElement<String> cit = new JAXBElement(new QName("http://input/xsd", "citId"), String.class, this.citId);
		return cit;
	}
	
	
	

}
