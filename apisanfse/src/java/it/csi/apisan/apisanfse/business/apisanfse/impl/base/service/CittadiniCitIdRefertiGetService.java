/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
import it.csi.apisan.apisanfse.integration.dma.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.dmacc.CCScaricoRefertoServicePortType;
import it.csi.apisan.apisanfse.integration.dmacc.GetListaRefertiSR;
import it.csi.apisan.apisanfse.integration.dmacc.GetListaRefertiSRResponse;
import it.csi.apisan.apisanfse.integration.scaricostudi.CCScaricoStudiServicePortType;
import it.csi.apisan.apisanfse.integration.scaricostudi.VerificaStatoRichiestaReq;
import it.csi.apisan.apisanfse.integration.scaricostudi.VerificaStatoRichiestaRes;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdRefertiGetService extends FseDelegheRESTBaseService {
	
	@Autowired
	private CCScaricoRefertoServicePortType cCScaricoRefertoServicePortType; 
	@Autowired
	CCScaricoStudiServicePortType scaricoStudiPort;
	
	
	private String citId;
	

	public CittadiniCitIdRefertiGetService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio, 
			String citId,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.citId = citId;
	}



	@Override
	protected Response execute() {
		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "GetReferti versione 1.1.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(citId);
		checkUtenteAutorizzatoOrDelegato(citId);

		GetListaRefertiSR requestLR = newGetListaRefertiSR(citId);

		GetListaRefertiSRResponse response = cCScaricoRefertoServicePortType.getListaRefertiSR(requestLR);		
		log.debug(METHOD_NAME, "Risultato codice: " + response.getEsito());
		if(!RisultatoCodice.SUCCESSO.equals(response.getEsito())) {
			throw toRESTException(response.getErrori());
		}
		
		List<MetadatiDocumentoSR> metadatiDocumenti = getMetadatiDocumentoDistinctIdReferto(response.getMetadatiDocumenti());
		  
		List<Codifica> codifiche = response.getCodifiche();
		List<Referto> referti = new RefertoMetadatiDocumentoSRMapper(codifiche).fromList(metadatiDocumenti);
		
		//referti.stream().map
	
		//metto in un try catch in quanto i referti devono essere ritornati anche quando il servizio di verificaStatoRichiesta non funziona

		for(Referto refertoTmp : referti) {

			if(refertoTmp.getAccessionNumbers() != null && refertoTmp.getAccessionNumbers().size() > 0) {
				VerificaStatoRichiestaReq reqStatoRichiesta = new VerificaStatoRichiestaReq();
				reqStatoRichiesta.setCodiceFiscale(citId);
				reqStatoRichiesta.setIdReferto(refertoTmp.getIdReferto());
				reqStatoRichiesta.setPin("0");
				try {
					VerificaStatoRichiestaRes resStatoRichiesta = scaricoStudiPort
							.verificaStatoRichiesta(reqStatoRichiesta);
					if (resStatoRichiesta.getEsito()
							.equals(it.csi.apisan.apisanfse.integration.scaricostudi.RisultatoCodice.SUCCESSO)) {
						refertoTmp.setIdPacchetto(resStatoRichiesta.getIdPacchetto());
						refertoTmp.setStatoRichiesta(new StatoRichiestaEnumStatoRichiestaMapper()
								.from(resStatoRichiesta.getStatoRichiesta()));
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					log.error("execute", "Errore nel richiamo del servizio verificaStatoListaRichieste", e);
				} 
			}
		}
			
			/*
			 * 
			 
			//TODO devo eseguire una chiamata a getListaStudi per verificare (se c'è) lo stato della richiesta dello stato immagine			
			ArrayOfidRefertoString arrayIdReferti = new ArrayOfidRefertoString();
			
			Stream<Referto> streamReferti = referti.stream();
			arrayIdReferti.getIdReferto().addAll(streamReferti.map(c -> c.getIdReferto()).collect(Collectors.toList())); 
			
			VerificaStatoListaRichiesteReq req = new VerificaStatoListaRichiesteReq();
			
			req.setCodiceFiscale(citId);
			req.setIdReferti(arrayIdReferti);
			
			VerificaStatoListaRichiesteRes resVerificaStatoLista = scaricoStudiPort.verificaStatoListaRichieste(req);
			
			if(resVerificaStatoLista.getEsito().equals(it.csi.apisan.apisanfse.integration.scaricostudi.RisultatoCodice.SUCCESSO)) {

				for(Referto refertoTmp : referti) {
					for(StatoRichiestaScarico statoTmp : resVerificaStatoLista.getStatoRichiesteScarico()) {
						if(refertoTmp.getIdReferto().equals(statoTmp.getIdReferto())) {
							refertoTmp.setIdPacchetto(statoTmp.getIdPacchetto());
							refertoTmp.setStatoRichiesta(new StatoRichiestaEnumStatoRichiestaMapper().from(statoTmp.getStatoRichiesta()) );
						}
					}

				}

			} */
	
		
		referti = ordinaPerDataInizioEpisodioDesc(referti);
		
		return Response.ok(referti).build();

	}


	/**
	 * Ordina la lista dei referti in ordine decrescente di data inizio episodio.
	 * (vedi mail di Veronica Berti  del 16 maggio 2019 alle 9.57 con oggetto "Modifica etichette del ROL" )
	 * 
	 * @param referti
	 * @return
	 */
	private List<Referto> ordinaPerDataInizioEpisodioDesc(List<Referto> referti) {

		return referti.stream()
				.sorted(Comparator.comparing(Referto::getDataEpisodio).reversed())
				.collect(Collectors.toList());
	}
	
	

}
