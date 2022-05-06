/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseConsensiRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ConsensoFseComunicazioneConsensiINMapper;
import it.csi.apisan.apisanfse.business.mapper.ConsensoFseStatoConsensiOUTMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ConsensoFse;
import it.csi.apisan.apisanfse.dto.apisanfse.Delega;
import it.csi.apisan.apisanfse.integration.aura.auraws.services.central.ricercateam.RicercaTEAMSoap;
import it.csi.apisan.apisanfse.integration.consensoini.dma.ComunicazioneConsensiIN;
import it.csi.apisan.apisanfse.integration.consensoini.dma.RichiedenteExt;
import it.csi.apisan.apisanfse.integration.consensoini.dma.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.consensoini.dma.StatoConsensiIN;
import it.csi.apisan.apisanfse.integration.consensoini.dmacc.CCConsensoINIExtServicePortType;
import it.csi.apisan.apisanfse.integration.consensoini.dmacc.ComunicazioneConsensiExtRequeste;
import it.csi.apisan.apisanfse.integration.consensoini.dmacc.ComunicazioneConsensiResponse;
import it.csi.apisan.apisanfse.integration.consensoini.dmacc.StatoConsensiExtRequeste;
import it.csi.apisan.apisanfse.integration.consensoini.dmacc.StatoConsensiResponse;
import it.csi.apisan.apisanfse.util.CostantiConsenso;
import it.csi.apisan.apisanfse.util.TipoDelega;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfConsensoPostService extends FseConsensiRESTBaseService {
	
	
	private String cf;
	private ConsensoFse consensoFse;
	private String servizio;
	
	@Autowired
	CCConsensoINIExtServicePortType cCConsensoINIExtServicePortType;
	@Autowired
	RicercaTEAMSoap ricercaTeamSoap;
	

	public CittadiniCfConsensoPostService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String cf, ConsensoFse consensoFse, String servizio,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.cf = cf;
		this.consensoFse = consensoFse;
		this.servizio = servizio;
	}



	@Override
	protected Response execute() {
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(cf);
		
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotNull(consensoFse, "consensoFse non valorizzato");
		checkNotBlank(consensoFse.getIdentificativoInformativa(), "identificativo informativa consensoFse non valorizzato");
		Delega delega = null;
		if(StringUtils.isNotBlank(servizio)) {
			delega = new Delega();
			verificaUtenteAutorizzatoODelegato(cf, servizio,  delega);
			
			//TODO Verificare oltre alla delega sul codice servizio passato bisogna anche verificare su FSEDOC
			//31/03/2021 tolta in call con Veronica la verifica su teams
			//devo aggiungere la verifica sulla teams nel caso in cui sia stata eseguita la ricerca per un delegato
		/*	if(!shibIdentitaCodiceFiscale.equalsIgnoreCase(cf) && delega.getTipoDelega().equalsIgnoreCase(TipoDelega.CONGIUNTA.toString())) {
				checkNotBlank(consensoFse.getCodiceTesseraTeam(), "Tessera teams non valorizzata");
				String ret =ricercaTeamSoap.ricercaTEAM(cf, consensoFse.getCodiceTesseraTeam());
				checkCondition(StringUtils.containsIgnoreCase(ret, "OK"), "Tessera teams non valida");
			}*/			
		} else {
			checkUtenteAutorizzato(cf);  //delegato
		}

		ComunicazioneConsensiExtRequeste requestComunicaConsensi = new ComunicazioneConsensiExtRequeste();
		ComunicazioneConsensiIN comunicaConsensiIn = new ConsensoFseComunicazioneConsensiINMapper().to(consensoFse) ;
		comunicaConsensiIn.setContestoOperativo(CostantiConsenso.CONTESTO_OPERATIVO);
		comunicaConsensiIn.setIdentificativoAssistitoConsenso(cf);   //cf path parma
		comunicaConsensiIn.setIdentificativoAssistitoGenitoreTutore(shibIdentitaCodiceFiscale); // identita
		comunicaConsensiIn.setIdentificativoGenitoreConsenso(shibIdentitaCodiceFiscale);  //identita
		comunicaConsensiIn.setIdentificativoInformativa(consensoFse.getIdentificativoInformativa());
		comunicaConsensiIn.setIdentificativoOrganizzazione(CostantiConsenso.IDENTIFICATIVO_ORGANIZZAZIONE);
		comunicaConsensiIn.setIdentificativoUtente(shibIdentitaCodiceFiscale);  // identita
		comunicaConsensiIn.setPresaInCarico(CostantiConsenso.PRESA_IN_CARICO);
		comunicaConsensiIn.setRuoloUtente(CostantiConsenso.RUOLO_UTENTE);// tipo grado separati da trattino
		comunicaConsensiIn.setStrutturaUtente(CostantiConsenso.STRUTTURA_UTENTE);
		comunicaConsensiIn.setTipoAttivita(CostantiConsenso.TIPO_ATTIVITA);
		
		requestComunicaConsensi.setComunicazioneConsensiIN(comunicaConsensiIn);
		requestComunicaConsensi.setPaziente(newPaziente(cf));
		//TODO verificare con Michele
		RichiedenteExt richiedenteConsenso = newRichiedenteConsenso(cf, delega);
		requestComunicaConsensi.setRichiedente(richiedenteConsenso);
		
		ComunicazioneConsensiResponse responseComunicazioneConsensi = cCConsensoINIExtServicePortType.comunicazioneConsensi(requestComunicaConsensi);
		
		
		if(responseComunicazioneConsensi.getEsito().equals(RisultatoCodice.FALLIMENTO)) {
			
			throw toRESTConsensiException(responseComunicazioneConsensi.getErrori());	
		}
		
		//Viene rifatta una stato consensi successiva per recuperare i dati del consenso (sarebbe post con payload)
		StatoConsensiExtRequeste statoConsensiRequest = new StatoConsensiExtRequeste();
		StatoConsensiIN statoConsensiIn = new StatoConsensiIN();
		statoConsensiIn.setContestoOperativo(CostantiConsenso.CONTESTO_OPERATIVO);
		statoConsensiIn.setIdentificativoAssistitoConsenso(cf);
		statoConsensiIn.setIdentificativoAssistitoGenitoreTutore(shibIdentitaCodiceFiscale);
		statoConsensiIn.setIdentificativoOrganizzazione(CostantiConsenso.IDENTIFICATIVO_ORGANIZZAZIONE);
		statoConsensiIn.setIdentificativoUtente(shibIdentitaCodiceFiscale);
		statoConsensiIn.setStrutturaUtente(CostantiConsenso.STRUTTURA_UTENTE);
		statoConsensiIn.setRuoloUtente(CostantiConsenso.RUOLO_UTENTE);
		statoConsensiIn.setPresaInCarico(CostantiConsenso.PRESA_IN_CARICO);
		statoConsensiIn.setTipoAttivita(CostantiConsenso.TIPO_ATTIVITA);
		
		//Riempio la request di statoConsensi
		statoConsensiRequest.setPaziente(newPaziente(cf));
		//TODO verificare
		statoConsensiRequest.setRichiedente(richiedenteConsenso);
		statoConsensiRequest.setStatoConsensiIN(statoConsensiIn);
		StatoConsensiResponse responseStatoConsensiRet = cCConsensoINIExtServicePortType.statoConsensi(statoConsensiRequest);
		ConsensoFse consensoFseRet = new ConsensoFseStatoConsensiOUTMapper().from(responseStatoConsensiRet.getStatoConsensiOUT());
		
		return Response.status(Status.CREATED).entity(consensoFseRet).build();
	}
	
	

}
