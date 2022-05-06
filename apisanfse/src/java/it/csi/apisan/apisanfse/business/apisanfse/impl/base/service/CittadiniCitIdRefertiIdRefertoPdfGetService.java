/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.List;

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
import it.csi.apisan.apisanfse.integration.dma.MetadatiDocumentoSR;
import it.csi.apisan.apisanfse.integration.dma.Paziente;
import it.csi.apisan.apisanfse.integration.dma.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.dmacc.CCScaricoRefertoServicePortType;
import it.csi.apisan.apisanfse.integration.dmacc.GetListaRefertiSR;
import it.csi.apisan.apisanfse.integration.dmacc.GetListaRefertiSRResponse;
import it.csi.apisan.apisanfse.integration.dmacc.GetRefertoSR;
import it.csi.apisan.apisanfse.integration.dmacc.GetRefertoSRResponse;
import it.csi.apisan.apisanfse.util.ApisanFseStatus;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdRefertiIdRefertoPdfGetService extends FseDelegheRESTBaseService {
	
	@Autowired
	private CCScaricoRefertoServicePortType cCScaricoRefertoServicePortType;
	
	private String citId;
	private String idReferto;
	private String pin;
	private String firmato;
	

	public CittadiniCitIdRefertiIdRefertoPdfGetService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String citId, String idReferto, String pin, String firmato,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.citId = citId;
		this.idReferto = idReferto;
		this.pin = pin;
		this.firmato = firmato;
	}



	@Override
	protected Response execute() {
		final String METHOD_NAME = "execute";
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(citId);
		//checkUtenteAutorizzato(citId);
		checkUtenteAutorizzatoOrDelegato(citId);
		
		//Tolgo l'obbligatorietà sul codice pin lo lascio sullo yaml
		//checkNotBlank(pin, "Codice PIN non valorizzato");
		checkNotBlank(idReferto, "Identificativo del referto mancante");
		
		//devo prima di tutto eseguire una getListaReferti in quanto idReferto per me = codiceDocumentoDipartimentale
		GetListaRefertiSR requestLR = newGetListaRefertiSR(citId);
		

		GetListaRefertiSRResponse response = cCScaricoRefertoServicePortType.getListaRefertiSR(requestLR);
		System.out.println("Risultato codice: " + response.getEsito());
		if(!RisultatoCodice.SUCCESSO.equals(response.getEsito())) {
			throw toRESTException(response.getErrori());
		}
		
		List<MetadatiDocumentoSR> metadatiDocumenti = getMetadatiDocumentoDistinctIdReferto(response.getMetadatiDocumenti());
		MetadatiDocumentoSR refertoDaAnnullare = getMetadatiDocumentoFromLista(metadatiDocumenti, idReferto);
		
		GetRefertoSR requestLRReferto = newGetRefertoSR(citId, refertoDaAnnullare.getIdDocumentoCL(), pin, refertoDaAnnullare.getComponenteLocale());

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
		
		byte[] bytes = "S".equals(firmato) ? documentoSR.getDocumentoFirmato() : documentoSR.getDocumentoNonFirmato();
		
		
//		RefertoMapper rm = new RefertoMapper();
//		byte[] bytes = rm.GetRefertoPFDSR(refertoSRResponse, firmato);
		
		return Response.ok().entity(bytes).type("application/pdf").build();
		
	}
	
	
	public GetRefertoSR newGetRefertoSR(String citId, String idReferto, String pinCode, ComponenteLocale comp) {
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
		parameters.setComponenteLocale(comp);
		return parameters;
	}
	

}
