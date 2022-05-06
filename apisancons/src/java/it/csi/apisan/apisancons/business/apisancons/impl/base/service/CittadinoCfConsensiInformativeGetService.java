/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import it.csi.apisan.apisancons.business.apisancons.impl.base.ConsAuraRESTBaseService;
import it.csi.apisan.apisancons.business.apisancons.mapper.ConsensoConsensoMapper;
import it.csi.apisan.apisancons.business.apisancons.mapper.InformativaInformativaMapper;
import it.csi.apisan.apisancons.business.apisancons.mapper.TipoAsrTipoAsrMapper;
import it.csi.apisan.apisancons.dto.apisancons.Consenso;
import it.csi.apisan.apisancons.dto.apisancons.ConsensoInformativa;
import it.csi.apisan.apisancons.dto.apisancons.Informativa;
import it.csi.apisan.apisancons.dto.apisancons.StatoNotificaDipartimentale;
import it.csi.apisan.apisancons.dto.apisancons.TipoAsr;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsensoBeService;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaAsrBeResponse;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaConsensoBe;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaConsensoBeResponse;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaInformativa;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaInformativaResponse;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaNotificheBe;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaNotificheBeResponse;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaNotificheBeResponse.StatoNotifiche;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.Richiedente;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.StatoNotifica;
import it.csi.apisan.apisancons.integration.conspref.fontecittadino.Fonte;
import it.csi.apisan.apisancons.util.Constants;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadinoCfConsensiInformativeGetService extends ConsAuraRESTBaseService {
	private String cf;
	@Autowired
	ConsensoBeService service;
	
	
	public CittadinoCfConsensiInformativeGetService(String cf, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkUtenteAutorizzatoOrDelegato(cf);
		
		//recupero la lista delle informative
		Richiedente richiedenteRequest = newRichiedente();
		List<Informativa> listaRet = recuperaInformative(richiedenteRequest);
		
		//recupero la lista delle asr
		List<TipoAsr> listaAsr = recuperaAsr();
		
		Fonte fonteCittadino = newFonteCittadinoRequest();
		
		List<ConsensoInformativa> listaConsensinformative = new ArrayList();
		//per ogni informativa cerco i consensi espressi dal cittadino
		for(Informativa informativaTmp : listaRet) {
			ConsensoInformativa consensoInformativa = new ConsensoInformativa();
			
			ConsultaConsensoBe requestConsultaConsenso = new ConsultaConsensoBe();
			
			requestConsultaConsenso.setFonte(fonteCittadino);
			requestConsultaConsenso.setCfCittadino(cf);
			requestConsultaConsenso.setRichiedente(richiedenteRequest);
			requestConsultaConsenso.setIdInformativa(informativaTmp.getIdInformativa().toString());
			
			//da verificare in quanto da nuove specifiche aura sul back end serve per ricavare nome e cognome
			requestConsultaConsenso.setVerificaAura(CollectionUtils.isEmpty(listaConsensinformative));
			
			ConsultaConsensoBeResponse responseConsultaConsenso =  service.consultaConsensoBeService(requestConsultaConsenso);
			checkSuccesso(responseConsultaConsenso, "CittadinoCfConsensiGetService");
			List<Consenso> listaConsensi = new ArrayList();
			if(!erroreNonTrovateOccorrenze(responseConsultaConsenso)) {
			
				listaConsensi = new ConsensoConsensoMapper().fromList(responseConsultaConsenso.getConsensi().getConsenso());
				if(!CollectionUtils.isEmpty(listaConsensi)) {
					//cittadinoCache.addCittadinoFromConsenso( listaConsensi.get(0));
					getCittadinoConsenso(true, listaConsensi.get(0).getCfCittadino());
				}
				
				if(isConsensoAziendale(responseConsultaConsenso)) {
					List<TipoAsr> asrNonContenute = listaAsrNonContenute(listaAsr, listaConsensi);

					for(TipoAsr asrTmp : asrNonContenute) {
						listaConsensi.add(newConsensoNonEspresso(asrTmp, cf, informativaTmp.getIdInformativa()));
					}					
				} 
			}else {
				//Aggiungo consensi non espressi per ogni asr
				if(!Constants.CONSENSO_AZIENDALE.equalsIgnoreCase(informativaTmp.getTipoConsenso().getCodice())) {
					listaConsensi.add(newConsensoNonEspresso(null, cf, informativaTmp.getIdInformativa()));
				}else {
					for(TipoAsr asrTmp : listaAsr) {
						listaConsensi.add(newConsensoNonEspresso(asrTmp, cf, informativaTmp.getIdInformativa()));
					}
				}
			}
			
			consensoInformativa.setInformativa(informativaTmp);
			consensoInformativa.setConsensi(listaConsensi);
			List<StatoNotificaDipartimentale> statoNotificaDipartimentale=recuperaNotifiche(richiedenteRequest, cf,fonteCittadino, listaConsensi );
			consensoInformativa.setStatoNotificheDipartimentali(statoNotificaDipartimentale);
			listaConsensinformative.add(consensoInformativa);
			
			
		}
		//aggiungo nome cognome del delegato prendendolo (se lo trova) dalla cache
		listaConsensinformative.forEach(c -> c.getConsensi().forEach(d -> arricchisciCittadinoEDelegato(d) ));
		
		return Response.ok(listaConsensinformative).build();
	}
	
	
	private List<Informativa> recuperaInformative(Richiedente richiedenteRequest){
		ConsultaInformativa request = new ConsultaInformativa();
		request.setRichiedente(richiedenteRequest);
		ConsultaInformativaResponse response = service.consultaInformativaBeService(request);
		checkSuccesso(response, "Ricerca informative");
		return new InformativaInformativaMapper().fromList(response.getInformative().getInformativa());
	}
	
	private List<TipoAsr> recuperaAsr(){
		ConsultaAsrBeResponse responseAsr = service.consultaAsrBeService(newRequestConsultaCodifiche());
		checkSuccesso(responseAsr, "ConsultaAsr");
		return new TipoAsrTipoAsrMapper().fromList(responseAsr.getAsr().getAsr());
	}
	
	private List<StatoNotificaDipartimentale> recuperaNotifiche(Richiedente richiedenteRequest, String cf,Fonte fonteCittadino, List<Consenso> listaConsensi ){
		log.info("CittadinoCfConsensiInformativeGetService::recuperaNotifiche", "Entro in recuperaNotifiche");
		List<StatoNotificaDipartimentale> res= new ArrayList<StatoNotificaDipartimentale>();
		
		ConsultaNotificheBe consultaNotificheBe =new ConsultaNotificheBe();
		consultaNotificheBe.setRichiedente(richiedenteRequest);
		consultaNotificheBe.setCfCittadino(cf);
		//fonte
		consultaNotificheBe.setFonte(fonteCittadino);
		List<String> uuids =  new ArrayList<String>();
		//verifico che ci sia almeno un uuid altrimenti vuol dire che il cittadino non si è mai espresso
		for (Consenso consenso:listaConsensi) {
			if(consenso.getUuid()!=null && consenso.getUuid().toString().length()>5) {
				uuids.add(consenso.getUuid().toString());
			} 
		}
		if (!uuids.isEmpty()) {
			//devo ricercare almeno un uuid
			consultaNotificheBe.setUuid(uuids);
			ConsultaNotificheBeResponse consultaNotificheBeResponse=service.consultaNotificheBeService(consultaNotificheBe);
			if (consultaNotificheBeResponse != null && !consultaNotificheBeResponse.getStatoNotifiche().getStatoNotifica().isEmpty()) {
				for (StatoNotifica statoNotifica:consultaNotificheBeResponse.getStatoNotifiche().getStatoNotifica()) {
					StatoNotificaDipartimentale snDip= new StatoNotificaDipartimentale();
					snDip.setCfCittadino(cf);
					snDip.setUuid(statoNotifica.getUuid());
					TipoAsr tipoAsr=new TipoAsr();
					tipoAsr.setCodice(statoNotifica.getCodASR());
					snDip.setAsr(tipoAsr);
					snDip.setDipartimentale(statoNotifica.getDipartimentale());
					if ("C".equalsIgnoreCase(statoNotifica.getStatoNotifica())){
						snDip.setStatoDipartimentale("C");
					} else {
						//richiesto dal guppo di Pennone la forzatura a "in attesa di invio" anche per errore!
						snDip.setStatoDipartimentale("A");
					}
					if ("C".equalsIgnoreCase(snDip.getStatoDipartimentale())) {
						//vedi yaml
						snDip.setStatoDecodificato("CONSEGNATO");
					} else {
						snDip.setStatoDecodificato("IN ATTESA DI INVIO");
					}
					snDip.setStatoNotifica(statoNotifica.getStatoNotifica());
					res.add(snDip);
				}
			}
		}
		log.info("CittadinoCfConsensiInformativeGetService::recuperaNotifiche", "Esco da recuperaNotifiche");
		return res;
	}

}
