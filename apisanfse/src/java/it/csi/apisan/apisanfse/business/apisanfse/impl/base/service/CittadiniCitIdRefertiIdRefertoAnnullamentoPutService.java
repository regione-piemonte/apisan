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
import it.csi.apisan.apisanfse.integration.dma.ComponenteLocale;
import it.csi.apisan.apisanfse.integration.dma.MetadatiDocumentoSR;
import it.csi.apisan.apisanfse.integration.dma.Paziente;
import it.csi.apisan.apisanfse.integration.dma.Richiedente;
import it.csi.apisan.apisanfse.integration.dma.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.dmacc.AnnullaRefertoSR;
import it.csi.apisan.apisanfse.integration.dmacc.AnnullaRefertoSRResponse;
import it.csi.apisan.apisanfse.integration.dmacc.CCScaricoRefertoServicePortType;
import it.csi.apisan.apisanfse.integration.dmacc.GetListaRefertiSR;
import it.csi.apisan.apisanfse.integration.dmacc.GetListaRefertiSRResponse;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdRefertiIdRefertoAnnullamentoPutService extends FseDelegheRESTBaseService {
	
	@Autowired
	private CCScaricoRefertoServicePortType cCScaricoRefertoServicePortType;
	
	private String citId;
	private String idReferto;
	private String pin;
	

	public CittadiniCitIdRefertiIdRefertoAnnullamentoPutService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String citId, String idReferto, String pin, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.citId = citId;
		this.idReferto = idReferto;
		this.pin = pin;
	}



	@Override
	protected Response execute() {
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(citId);
		//checkUtenteAutorizzato(citId);
		checkUtenteAutorizzatoOrDelegato(citId);
		
		checkNotBlank(pin, "Codice PIN non valorizzato");
		checkNotBlank(idReferto, "Identificativo del referto mancante");
		
		
		//devo recuperare l'idReferto recupero dalla getListaReferti (idReferto che uso io ha come id il codicedocumentodipartimentale)
		GetListaRefertiSR requestLR = newGetListaRefertiSR(citId);

		GetListaRefertiSRResponse response = cCScaricoRefertoServicePortType.getListaRefertiSR(requestLR);
		if(!RisultatoCodice.SUCCESSO.equals(response.getEsito())) {
			throw toRESTException(response.getErrori());
		}
		
		List<MetadatiDocumentoSR> metadatiDocumenti = getMetadatiDocumentoDistinctIdReferto(response.getMetadatiDocumenti());
		
		MetadatiDocumentoSR refertoDaAnnullare = getMetadatiDocumentoFromLista(metadatiDocumenti, idReferto);
		
		AnnullaRefertoSR requestAR = newAnnullaRefertoSR(citId, refertoDaAnnullare.getIdDocumentoCL(), pin, refertoDaAnnullare.getComponenteLocale());
		AnnullaRefertoSRResponse annullaRefertoSRResponse = cCScaricoRefertoServicePortType.annullaRefertoSR(requestAR); 
		
		if(!RisultatoCodice.SUCCESSO.equals(annullaRefertoSRResponse.getEsito())) {
			throw toRESTException(annullaRefertoSRResponse.getErrori());
		}
		
		return Response.ok().build();
	}
	
	public AnnullaRefertoSR newAnnullaRefertoSR(String citId, String idReferto, String pinCode, ComponenteLocale comp) {
		//vedere pacchettoPinaction riga 447
		AnnullaRefertoSR result = new AnnullaRefertoSR();
		Richiedente richiedente = newRichiedente();
		result.setRichiedente(richiedente);
		Paziente paziente = new Paziente();
		paziente.setCodiceFiscale(citId);
		result.setPaziente(paziente);
		result.setIdDocumento(idReferto);
		result.setPinCode(pinCode);
		result.setComponenteLocale(comp);
		return result;
	}







}
