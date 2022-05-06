/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.TrovaUnLoccsiRESTBaseService;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelFarmacia;
import it.csi.apisan.apisantrovaun.dto.loccsi.ResponseService;
import it.csi.apisan.apisantrovaun.exception.ErroreBuilder;
import it.csi.celiachia.celiachiabesrv.business.InterfacciaCeliachiaBeSrvPortType;
import it.csi.celiachia.celiachiabesrv.business.endpoint.InterfacciaCeliachiaGocPortType;
import it.csi.celiachia.celiachiabesrv.input.xsd.Richiedente;
import it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie;
import it.csi.celiachia.celiachiabesrv.output.xsd.ErogazioneFarmacia;
import it.csi.celiachia.celiachiabesrv.output.xsd.VerificaErogazioniFarmacieResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class FarmacieGetService extends TrovaUnLoccsiRESTBaseService {
	
	private String s;
	private Boolean datiAggiuntiviCeliachia; 
	private String disponibiliAlimentiCeliaci;
	@Autowired
	private InterfacciaCeliachiaBeSrvPortType serviceEscon;
	
	public FarmacieGetService(String s,Integer limit,Integer offset,String latitudine,String longitudine,BigDecimal distanza,Boolean datiAggiuntiviCeliachia, String disponibiliAlimentiCeliaci, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(latitudine, longitudine, distanza, offset, limit, securityContext, httpHeaders);
		this.s = s;
		this.datiAggiuntiviCeliachia = datiAggiuntiviCeliachia; 
		this.disponibiliAlimentiCeliaci = disponibiliAlimentiCeliaci;
	}

	@Override
	protected Response execute() {

		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xForwardedFor, "XForwardedFor non valorizzato");
		checkCondition(( checkCoordinate() || StringUtils.isNotEmpty(s) ),ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Impostare almeno un query param").exception());
		checkNotNull(datiAggiuntiviCeliachia, "Impostare dati aggiuntivi celiachia");
		checkCondition(checkDisponibiliAlimentiCeliaciCorretto(), ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO: disponibiliAlimentiCeliaci", "non corretto").exception());
		
		 
		ResponseService<List<ModelFarmacia>> resp = service.getFarmacie(s, longitudine, latitudine, distanza, limit, offset);
		setHeadersResponse(resp.getHeaders());
		List<ModelFarmacia> listaFarmacie = resp.getBody();		
		
		if(datiAggiuntiviCeliachia) {
			
			//ricavo tutti gli id
			List<String> codici = listaFarmacie.stream().map(c -> c.getCodice()).collect(Collectors.toList());
			VerificaErogazioniFarmacieResponse response = serviceEscon.verificaErogazioniFarmacie(getRequestVerificaInformazioni(codici));
			List<ErogazioneFarmacia> respFarmacie = response.getElencoErogazioniFarmacia();
			
			//TODO verificare l'esito
			if(verificaEsito(response) && respFarmacie != null && respFarmacie.size() > 0) {
				 listaFarmacie.stream().forEach(c -> {
						respFarmacie.stream().forEach(d -> {
							if(d.getCnu().getValue().equals(c.getCodice())) {
								c.setDisponibiliAlimentiCeliaci(d.isErogato() ? "S": "N");
								
							}
						});
					});

			}
			
			
			if(StringUtils.isEmpty(disponibiliAlimentiCeliaci)) {
				listaFarmacie = listaFarmacie.stream().filter(c -> (!c.getDisponibiliAlimentiCeliaci().equalsIgnoreCase("U"))).collect(Collectors.toList());
			}else {
				listaFarmacie = listaFarmacie.stream().filter(c -> (c.getDisponibiliAlimentiCeliaci().equalsIgnoreCase(disponibiliAlimentiCeliaci))).collect(Collectors.toList());
			}
		}
		
		
		return Response.ok(listaFarmacie).build();
	}
	
	private boolean verificaEsito(VerificaErogazioniFarmacieResponse response) {
		boolean corretto = true;
		if(!response.getEsito().getValue().getCodice().getValue().equalsIgnoreCase("200")) {
			corretto = false;
		}
		return corretto;
	}
	
	private VerificaErogazioniFarmacie getRequestVerificaInformazioni(List<String> codiciUnpr) {
		
		/*
		 *   @XmlElementRef(name = "input", namespace = "http://endpoint.business.celiachiabesrv.celiachia.csi.it", type = JAXBElement.class, required = false)
    		protected JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie> input;
		 * */
		
		VerificaErogazioniFarmacie request = new VerificaErogazioniFarmacie();
		
		Richiedente rich = new Richiedente();
		JAXBElement<String> xShibIdentitaCodiceFiscale = new JAXBElement(new QName("http://input/xsd","shibIdentitaCodiceFiscale"), String.class, this.shibIdentitaCodiceFiscale);
		JAXBElement<String> codiceServizio = new JAXBElement(new QName("http://input/xsd","xCodiceServizio"), String.class, this.xCodiceServizio);
		JAXBElement<String> requestId = new JAXBElement(new QName("http://input/xsd","xRequestId"), String.class, this.xRequestID);
		JAXBElement<String> forwardedFor = new JAXBElement(new QName("http://input/xsd","xForwardedFor"), String.class, this.xForwardedFor);
		
		rich.setShibIdentitaCodiceFiscale(xShibIdentitaCodiceFiscale);
		rich.setXCodiceServizio(codiceServizio);
		rich.setXForwardedFor(forwardedFor);
		rich.setXRequestId(requestId);
		
		JAXBElement<Richiedente> richiedente = new JAXBElement(new QName("http://input/xsd","richiedente"), Richiedente.class, rich );
		
		request.setRichiedente(richiedente);
		codiciUnpr.stream().forEach( c -> request.getElencoCnu().add(c));
		
		/*JAXBElement<it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie> inputReq = new JAXBElement(new QName("http://endpoint.business.celiachiabesrv.celiachia.csi.it"),
				it.csi.celiachia.celiachiabesrv.input.xsd.VerificaErogazioniFarmacie.class, input);
		
		request.setInput(inputReq);*/
		return request;
	}
	
	private boolean checkDisponibiliAlimentiCeliaciCorretto() {
		boolean corretto = true;
		if(! StringUtils.isEmpty(disponibiliAlimentiCeliaci)) {
			return (disponibiliAlimentiCeliaci.equalsIgnoreCase("S") || disponibiliAlimentiCeliaci.equalsIgnoreCase("N")); 
		}
		return corretto;
	}

}
