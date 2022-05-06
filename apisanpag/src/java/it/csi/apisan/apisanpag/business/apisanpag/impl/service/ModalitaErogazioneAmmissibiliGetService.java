/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagRESTBaseService;
import it.csi.apisan.apisanpag.business.mapper.ModalitaErogazioneModalitaAmmissibileTypeMapper;
import it.csi.apisan.apisanpag.dto.apisanpag.ModalitaErogazione;
import it.csi.apisan.apisanpag.exception.ErroreBuilder;
import it.csi.gpr.GetModalitaErogazioneAmmissibiliGPRRequest;
import it.csi.gpr.ModalitaErogazioneAmmissibiliGPRResultType;
import it.csi.gpr.ProxyGPRPortType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ModalitaErogazioneAmmissibiliGetService extends PagRESTBaseService {

	@Autowired
	ProxyGPRPortType proxyGPRPortType;
	private static DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public ModalitaErogazioneAmmissibiliGetService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request non valorizzata");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");

		LocalDateTime oggi = LocalDateTime.now();
        String formatOggi = oggi.format(formatData);
		JAXBElement<String> dataRiferimento =new JAXBElement(new QName("http://csi.it","DATA_RIFERIMENTO"), String.class, formatOggi);
		GetModalitaErogazioneAmmissibiliGPRRequest richiesta = new GetModalitaErogazioneAmmissibiliGPRRequest();
		
		String uuid = xRequestID.length() > 36 ? xRequestID.substring(0, 35) : xRequestID;  
		richiesta.setUUID(uuid);
		richiesta.setDATARIFERIMENTO(dataRiferimento);
		
		ModalitaErogazioneAmmissibiliGPRResultType modalitaAmmissibile = proxyGPRPortType.getModalitaErogazioneAmmissibiliGPR(richiesta);
		checkSuccesso(modalitaAmmissibile);
		List<ModalitaErogazione> listaErogazioni = new ArrayList<ModalitaErogazione>(); 
		if(modalitaAmmissibile.getERRORE().getCODICE().equals("000")) {
			listaErogazioni = new ModalitaErogazioneModalitaAmmissibileTypeMapper().fromList(modalitaAmmissibile.getLISTAMODALITA().getMODALITAAMMISSIBILE());
		}
		
		return Response.ok(listaErogazioni).build() ;
	}
	
	//metto qui in quanto non ho altre classi che richiamano il servizio altrimenti sarebbe da mettere in una superclasse
	private void checkSuccesso(ModalitaErogazioneAmmissibiliGPRResultType result) {
		if(result.getERRORE() != null ){
			if(result.getERRORE().getCODICE().equals("000") || result.getERRORE().getCODICE().equals("001")){
				return;
			}else {
				throw ErroreBuilder.from(502, "Errore Richiamo GPR").dettaglio(result.getERRORE().getCODICE(), result.getERRORE().getMESSAGGIO()).exception();
			}
			
		}
	}

}
