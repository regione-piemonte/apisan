/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseConsensiRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ConsensoFseStatoConsensiOUTMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ConsensoFse;
import it.csi.apisan.apisanfse.dto.apisanfse.Delega;
//import it.csi.apisan.apisanfse.integration.consensoini.dma.CCConsensoINIServicePortType;
import it.csi.apisan.apisanfse.integration.consensoini.dma.Errore;
import it.csi.apisan.apisanfse.integration.consensoini.dma.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.consensoini.dma.StatoConsensiIN;
import it.csi.apisan.apisanfse.integration.consensoini.dmacc.CCConsensoINIExtServicePortType;
import it.csi.apisan.apisanfse.integration.consensoini.dmacc.StatoConsensiExtRequeste;
import it.csi.apisan.apisanfse.integration.consensoini.dmacc.StatoConsensiResponse;
import it.csi.apisan.apisanfse.util.CostantiConsenso;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)	
public class CittadiniCfConsensoGetService extends FseConsensiRESTBaseService {
	
	private String cf;
	private String servizio;
	
	@Autowired
	CCConsensoINIExtServicePortType cCConsensoINIExtServicePortType;	
	
	
	public CittadiniCfConsensoGetService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf,String servizio, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.cf = cf;
		this.servizio = servizio;
	}
	
	@Override
	protected Response execute() {
		
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(cf);
		
		Delega delega = null;
		if(StringUtils.isNotBlank(servizio)) {
			delega = new Delega();
			verificaUtenteAutorizzatoODelegato(cf, servizio,  delega);
		} else {
			checkUtenteAutorizzato(cf);  
		}
		
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		
		//compongo la request per chiamare il servizio statoconsensi
		StatoConsensiExtRequeste statoConsensiRequest = new StatoConsensiExtRequeste();
		StatoConsensiIN statoConsensiIn = new StatoConsensiIN();
		statoConsensiIn.setContestoOperativo(CostantiConsenso.CONTESTO_OPERATIVO);
		statoConsensiIn.setIdentificativoAssistitoConsenso(cf); //path param
		statoConsensiIn.setIdentificativoAssistitoGenitoreTutore(shibIdentitaCodiceFiscale);//identita
		statoConsensiIn.setIdentificativoOrganizzazione(CostantiConsenso.IDENTIFICATIVO_ORGANIZZAZIONE);
		statoConsensiIn.setIdentificativoUtente(shibIdentitaCodiceFiscale); //identita
		statoConsensiIn.setStrutturaUtente(CostantiConsenso.STRUTTURA_UTENTE);
		
		statoConsensiIn.setRuoloUtente(CostantiConsenso.RUOLO_UTENTE);
		
		statoConsensiIn.setPresaInCarico(CostantiConsenso.PRESA_IN_CARICO);
		statoConsensiIn.setTipoAttivita(CostantiConsenso.TIPO_ATTIVITA);
		//Riempio la request di statoConsensi
		statoConsensiRequest.setPaziente(newPaziente(cf));// cf path param
		//TODO verificare il consenso
		statoConsensiRequest.setRichiedente(newRichiedenteConsenso(cf, delega)); //cf identita
		statoConsensiRequest.setStatoConsensiIN(statoConsensiIn);
	

		//prima faccio la chiamata allo statoconsensi per recuperare l'informativa corrente
		StatoConsensiResponse responseStatoConsensi = cCConsensoINIExtServicePortType.statoConsensi(statoConsensiRequest);
		if(responseStatoConsensi.getEsito().equals(RisultatoCodice.FALLIMENTO)) {
			for(Errore err : responseStatoConsensi.getErrori()) {
				
				//mail Veronica del 08/04/2021 in caso di errore 185 rifaccio la chiamata a statoconsensi passando su richiedente il cf del paziente
				if("CC_ER_185".equals(err.getCodice()) ) {
					statoConsensiRequest.setRichiedente(newRichiedenteConsenso(cf, delega, cf));
					statoConsensiIn.setIdentificativoUtente(cf);
					statoConsensiIn.setIdentificativoUtente(cf);
					statoConsensiIn.setIdentificativoAssistitoGenitoreTutore(cf);
					responseStatoConsensi = cCConsensoINIExtServicePortType.statoConsensi(statoConsensiRequest);
					if(responseStatoConsensi.getEsito().equals(RisultatoCodice.FALLIMENTO)) {
						for(Errore err2 : responseStatoConsensi.getErrori()) {
							if(!"2035".equals(err.getCodice())) { //2035 viene restituito quando non esiste un fascicolo aperto per l'utente.
								throw toRESTConsensiException(responseStatoConsensi.getErrori());			
							}
						}
					}
					break;
				}
				
				else if(!"2035".equals(err.getCodice())) { //2035 viene restituito quando non esiste un fascicolo aperto per l'utente.
					throw toRESTConsensiException(responseStatoConsensi.getErrori());			
				}
			}
		} 
		
		ConsensoFse consenso = new ConsensoFseStatoConsensiOUTMapper().from(responseStatoConsensi.getStatoConsensiOUT());
		return Response.ok(consenso).build();
		
	}

}
