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
import it.csi.apisan.apisanfse.business.mapper.RefertoMetadatiDocumentoSRMapper;
import it.csi.apisan.apisanfse.business.mapper.StatoRichiestaEnumStatoRichiestaMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.Referto;
import it.csi.apisan.apisanfse.integration.dma.Codifica;
import it.csi.apisan.apisanfse.integration.dma.MetadatiDocumentoSR;
import it.csi.apisan.apisanfse.integration.dma.Paziente;
import it.csi.apisan.apisanfse.integration.dma.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.dmacc.CCScaricoRefertoServicePortType;
import it.csi.apisan.apisanfse.integration.dmacc.GetListaRefertiSR;
import it.csi.apisan.apisanfse.integration.dmacc.GetListaRefertiSRResponse;
import it.csi.apisan.apisanfse.integration.dmacc.GetRefertoSR;
import it.csi.apisan.apisanfse.integration.scaricostudi.CCScaricoStudiServicePortType;
import it.csi.apisan.apisanfse.integration.scaricostudi.VerificaStatoRichiestaReq;
import it.csi.apisan.apisanfse.integration.scaricostudi.VerificaStatoRichiestaRes;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdRefertiIdRefertoGetService extends FseDelegheRESTBaseService {
	
	@Autowired
	private CCScaricoRefertoServicePortType cCScaricoRefertoServicePortType; 

	@Autowired
	private CCScaricoStudiServicePortType scaricoStudiPort;
	
	private String citId;
	private String idReferto;
	

	public CittadiniCitIdRefertiIdRefertoGetService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String citId, String idReferto, 
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.citId = citId;
		this.idReferto = idReferto;
	}



	@Override
	protected Response execute() {
		final String METHOD_NAME = "execute";
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(citId);
		//checkUtenteAutorizzato(citId);
		checkUtenteAutorizzatoOrDelegato(citId);
		
		checkNotBlank(idReferto, "Identificativo del referto mancante");
		
		
		//GetRefertoSR requestLR = newGetRefertoSR(citId, idReferto, pin);
		
		/*
		 * La get sul singolo referto deve fare una get list referti e poi applicare una lambda 
		 * per ritornare un solo referto. Per fare una getReferto singola dovrei passare il pin 
		 * ma non vogliono passarlo e gli basta visualizzare solo i metadati ritornati dalla getlista.
		 * Per aggiungere i dati su idPacchetto e stato scarico dell'immagine devo chiamare per forza
		 */
		
		
		GetListaRefertiSR requestLR = newGetListaRefertiSR(citId);

		GetListaRefertiSRResponse response = cCScaricoRefertoServicePortType.getListaRefertiSR(requestLR);
		if(!RisultatoCodice.SUCCESSO.equals(response.getEsito())) {
			throw toRESTException(response.getErrori());
		}
		
		List<MetadatiDocumentoSR> metadatiDocumenti = getMetadatiDocumentoDistinctIdReferto(response.getMetadatiDocumenti());
		List<Codifica> codifiche = response.getCodifiche();
		MetadatiDocumentoSR metadatiDocumentoFromLista = getMetadatiDocumentoFromLista(metadatiDocumenti, idReferto);
		
		Referto refertoOut = new RefertoMetadatiDocumentoSRMapper(codifiche).from(metadatiDocumentoFromLista);
		
		try {
			//TODO devo eseguire una chiamata a getListaStudi per verificare (se c'è) lo stato della richiesta dello stato immagine			
			
			//Richiamo il servizio di 
			VerificaStatoRichiestaReq reqStatoRichiesta = new VerificaStatoRichiestaReq();
			reqStatoRichiesta.setCodiceFiscale(citId);
			reqStatoRichiesta.setIdReferto(refertoOut.getIdReferto());
			reqStatoRichiesta.setPin("0");
			
			VerificaStatoRichiestaRes resStatoRichiesta = scaricoStudiPort.verificaStatoRichiesta(reqStatoRichiesta);
			
			if(resStatoRichiesta.getEsito().equals(it.csi.apisan.apisanfse.integration.scaricostudi.RisultatoCodice.SUCCESSO)) {
				refertoOut.setIdPacchetto(resStatoRichiesta.getIdPacchetto() );
				refertoOut.setStatoRichiesta(new StatoRichiestaEnumStatoRichiestaMapper().from(resStatoRichiesta.getStatoRichiesta()));
			}
			
			/*
			 * TODO tengo il codice che richiama la lista di richieste
			 * ArrayOfidRefertoString arrayIdReferti = new ArrayOfidRefertoString();

			//List<String> listaReferti = referti.stream().map(c -> c.getIdReferto()).collect(Collectors.toList());
			//arrayIdReferti.
			arrayIdReferti.getIdReferto().addAll(Arrays.asList(refertoOut.getIdReferto()) );  // idReferto = codicedocumentodipartimentale

			VerificaStatoListaRichiesteReq req = new VerificaStatoListaRichiesteReq();

			req.setCodiceFiscale(citId);
			req.setIdReferti(arrayIdReferti);
			
			VerificaStatoListaRichiesteRes resVerificaStatoLista = scaricoStudiPort.verificaStatoListaRichieste(req);

			if(resVerificaStatoLista.getEsito().equals(it.csi.apisan.apisanfse.integration.scaricostudi.RisultatoCodice.SUCCESSO)) {

				for(StatoRichiestaScarico statoTmp : resVerificaStatoLista.getStatoRichiesteScarico()) {
					if(refertoOut.getIdReferto().equals(statoTmp.getIdReferto())) {
						refertoOut.setIdPacchetto(statoTmp.getIdPacchetto());
						refertoOut.setStatoRichiesta(new StatoRichiestaEnumStatoRichiestaMapper().from(statoTmp.getStatoRichiesta()) );
						break;
					}
				}

			}*/
			
		}catch(Exception e) {
			log.error("execute", "Errore nel richiamo del servizio verificaStatoListaRichieste", e);
		}
		
		
		return Response.ok(refertoOut).build();
		
	}


	
	
	public GetRefertoSR newGetRefertoSR(String citId, String idReferto, String pinCode) {
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
		return parameters;
	}

}
