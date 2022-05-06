/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDelegheRESTBaseService;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.integration.dma.ComponenteLocale;
import it.csi.apisan.apisanfse.integration.dma.DocumentoSR;
import it.csi.apisan.apisanfse.integration.dma.Paziente;
import it.csi.apisan.apisanfse.integration.dma.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.dmacc.CCScaricoRefertoServicePortType;
import it.csi.apisan.apisanfse.integration.dmacc.GetRefertoSR;
import it.csi.apisan.apisanfse.integration.dmacc.GetRefertoSRResponse;
import it.csi.apisan.apisanfse.util.ApisanFseStatus;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdRefertiPdfGetService extends FseDelegheRESTBaseService {
	
	@Autowired
	private CCScaricoRefertoServicePortType cCScaricoRefertoServicePortType;
	
	private String citId; 
	private String componenteLocale; 
	private String idDocumentoCl; 
	private String pin;
	private String firmato; 
	
	public CittadiniCitIdRefertiPdfGetService(String citId, String componenteLocale, String idDocumentoCl, String pin,
			String firmato, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
		this.citId = citId; 
		this.componenteLocale = componenteLocale; 
		this.idDocumentoCl = idDocumentoCl; 
		this.pin = pin;
		this.firmato = firmato; 		
	}

	

	@Override
	protected Response execute() {
		final String METHOD_NAME = "execute";
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Identita non valorizzata");
		checkNotBlank(xRequestID, "Request id non valorizzata");
		checkNotBlank(componenteLocale, "Componente locale non valorizzata");
		checkNotBlank(idDocumentoCl, "Id documento Componente locale non valorizzato");
		checkCodiceFiscaleValido(citId);
		checkUtenteAutorizzatoOrDelegato(citId);
		
		GetRefertoSR requestLRReferto = newGetRefertoSR(citId, idDocumentoCl, pin, componenteLocale);

		GetRefertoSRResponse refertoSRResponse = cCScaricoRefertoServicePortType.getRefertoSR(requestLRReferto);
		if(!RisultatoCodice.SUCCESSO.equals(refertoSRResponse.getEsito())) {
			throw toRESTException(refertoSRResponse.getErrori());
		}
		
		if(refertoSRResponse.getDocumenti().size()>1) {
			log.error(METHOD_NAME, "Mi aspetto un solo referto! Trovati %s.", refertoSRResponse.getDocumenti().size());
			//throw???
		}
		
		DocumentoSR documentoSR = refertoSRResponse.getDocumenti().stream().findFirst().orElse(null); //TODO prendo solo il primo! mi aspetto un solo Documento!!
		if(documentoSR==null) {
			throw ErroreBuilder.from(ApisanFseStatus.REFERTO_NON_TROVATO).exception();
		}
		
		byte[] bytes = null; 
				//"S".equals(firmato) ? documentoSR.getDocumentoFirmato() : documentoSR.getDocumentoNonFirmato();
		
		if("S".equals(firmato) && documentoSR.getDocumentoFirmato() != null) {
			bytes = documentoSR.getDocumentoFirmato();
		}else {
			bytes = documentoSR.getDocumentoNonFirmato();
		}
		
		

		return Response.ok().entity(bytes).type("application/pdf").build();
	}
	
	
	private GetRefertoSR newGetRefertoSR(String citId, String idReferto, String pinCode, String codComp) {
		//this.IsValidRequest(citId, idReferto, pinCode);
		GetRefertoSR parameters = new GetRefertoSR();
		parameters.setRichiedente(newRichiedente());
		Paziente paziente = new Paziente();
		paziente.setCodiceFiscale(citId);
		parameters.setPaziente(paziente);
		parameters.setIdDocumento(idReferto);
		parameters.setPinCode(pinCode);
		parameters.setRichiestoPinCode(true);
		parameters.setNumeroGiorniDownload(30l);
		parameters.setPinBruciato(false);
		ComponenteLocale comp = new ComponenteLocale();
		comp.setCodice(codComp);
		parameters.setComponenteLocale(comp);
		return parameters;
	}

}
