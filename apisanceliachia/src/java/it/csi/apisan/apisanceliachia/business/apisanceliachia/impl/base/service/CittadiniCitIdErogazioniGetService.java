/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base.service;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanceliachia.business.apisanceliachia.impl.base.CeliachiaCeSrvRESTBaseService;
import it.csi.apisan.apisanceliachia.business.apisanceliachia.mapper.DateXMLGregorianCalendarMapper;
import it.csi.apisan.apisanceliachia.business.apisanceliachia.mapper.ModelErogazioneElencoErogazioniMapper;
import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelErogazione;
import it.csi.celiachia.celiachiabesrv.output.xsd.RicercaErogazioniAssistitoResponse;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdErogazioniGetService extends CeliachiaCeSrvRESTBaseService {
	private String da;
	private String a;
	
	
	public CittadiniCitIdErogazioniGetService(String citId,String da,String a,SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest ) {
		super(citId, securityContext, httpHeaders, httpRequest);
		this.da = da;
		this.a = a;
	}

	@Override
	protected Response execute() {
		checkNotNull(xRequestID, "Inserire x-Request-ID");
		checkNotNull(xCodiceServizio, "Inserire codice servizio");
		checkNotNull(shibIdentitaCodiceFiscale, "Inserire l'identità");
		checkNotBlank(citId, "Inserire il codice fiscale");
		
		checkUtenteAutorizzatoOrDelegato(citId);
		
		it.csi.celiachia.celiachiabesrv.input.xsd.RicercaErogazioniAssistito request = new it.csi.celiachia.celiachiabesrv.input.xsd.RicercaErogazioniAssistito();
		
		createNewRichiedente(request);
				
		request.setCitId(getJabCitCf());
		
		if (!StringUtils.isEmpty(da)  && !StringUtils.isEmpty(a)) {
			Date dateDa = dateIsoFromString(da, "da");
			Date dateA = dateIsoFromString(a, "a");
			
			
			//JAXBElement<String> requestId = new JAXBElement(new QName("http://input/xsd","xRequestId"), String.class, this.xRequestID);
			XMLGregorianCalendar dataDa = new DateXMLGregorianCalendarMapper().to(dateDa);
			XMLGregorianCalendar dataA = new DateXMLGregorianCalendarMapper().to(dateA);
			JAXBElement<XMLGregorianCalendar> jaxbDatada = new JAXBElement(
					new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "dataInizio"), XMLGregorianCalendar.class, dataDa);
			JAXBElement<XMLGregorianCalendar> jaxbDataA = new JAXBElement(
					new QName("http://input.celiachiabesrv.celiachia.csi.it/xsd", "dataFine"), XMLGregorianCalendar.class, dataA);
			request.setDataInizio(jaxbDatada);
			request.setDataFine(jaxbDataA);
		}
		RicercaErogazioniAssistitoResponse res = servizioCeliachia.ricercaErogazioniAssistito(request);
		
		checkSuccesso(res, res.getErrore());
		
		List<ModelErogazione>  response = new ModelErogazioneElencoErogazioniMapper().fromList(res.getElencoErogazioni()); 
		
		return Response.ok().entity(response).build();
	}

}
