/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.ScerevRESTBaseService;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelAssociazioneAssociazioneAggregazioneMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelAssociazioneMediciOperatoreMapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAssociazione;
import it.csi.associazioni.def.opessanws.opessan.Associazioni.AssociazioneAggregazione;
import it.csi.associazioni.def.opessanws.opessan.AssociazioniAggregazioniBody;
import it.csi.associazioni.def.opessanws.opessan.ElencoAssociazioni;
import it.csi.associazioni.def.opessanws.opessan.GetAssociazioniAggregazioni.Arg0;
import it.csi.associazioni.def.opessanws.opessan.GetAssociazioniAggregazioniResponse.Return;
import it.csi.associazioni.def.opessanws.opessan.InfoRapportoDiLavoro;
import it.csi.operatori.def.opessanws.opessan.AssociazioneBody;
import it.csi.operatori.def.opessanws.opessan.ElencoOperatiori;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MediciMedicoIdAuraAssociazioniGetService extends ScerevRESTBaseService {
	
	String medicoIdAura;
	@Autowired
	ElencoAssociazioni associazioni;
	@Autowired
	ElencoOperatiori elencoOperatori;
	
	public MediciMedicoIdAuraAssociazioniGetService(String medicoIdAura, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.medicoIdAura = medicoIdAura;
	}

	@Override
	protected Response execute() {
		
		
		Arg0 request = new Arg0();
		
		AssociazioniAggregazioniBody body = new AssociazioniAggregazioniBody();
		body.setIdAura(medicoIdAura);
		body.setIndAdesioniAttive("1");
		request.setBody(body);
		Return resp =  associazioni.getAssociazioniAggregazioni(request);
		
		List<ModelAssociazione> listaRet = new ArrayList<ModelAssociazione>();
		if(checkSuccesso(resp) ) {
			//devo fare un ciclo non riesco a mappare in quanto sono due cicli interni
			if(respNotNull(resp)) {
			 	for(InfoRapportoDiLavoro rappTmp: resp.getBody().getInfoRappLavoro().getInfoRapportoLavoro()) {
			 		if(rappTmp != null && rappTmp.getAssociazioniAggregazioni().getAssociazioneAggregazione() != null ) {
			 			for(AssociazioneAggregazione assTmp : rappTmp.getAssociazioniAggregazioni().getAssociazioneAggregazione()) {
			 				//devo verificare che l'associazione abbia una data valida
			 				if(checkAssociazioneValida(assTmp.getDataFineAdesione()) && assTmp.getDataCessazione() == null) {
				 				ModelAssociazione tmp = new ModelAssociazioneAssociazioneAggregazioneMapper().from(assTmp);
				 				//richiamo l'elenco de medici per l'associazione in questione
				 				it.csi.operatori.def.opessanws.opessan.FindOperatoriPerAssociazione.Arg0 requestOperatori = new it.csi.operatori.def.opessanws.opessan.FindOperatoriPerAssociazione.Arg0();
				 				AssociazioneBody bodyOperatori = new AssociazioneBody();
				 				bodyOperatori.setCodiceAssociazione(tmp.getCodAssociazione());
				 				bodyOperatori.setAzienda(tmp.getCodAsl());
				 				bodyOperatori.setIndAdesioniAttive("1");
				 				bodyOperatori.setTipo(assTmp.getTipo());
				 				requestOperatori.setBody(bodyOperatori);
				 				it.csi.operatori.def.opessanws.opessan.FindOperatoriPerAssociazioneResponse.Return respOperatori = elencoOperatori.findOperatoriPerAssociazione(requestOperatori);
				 				if(checkSuccesso(respOperatori) && respOperatori.getBody() != null && respOperatori.getBody().getElencoOperatori() != null) {
				 					tmp.setMedici(new ModelAssociazioneMediciOperatoreMapper().fromList(respOperatori.getBody().getElencoOperatori().getOperatore()));
				 				}
				 				listaRet.add(tmp);			 					
			 				}
			 			}
			 			
			 		}
			 		
			 	}				
			}

		}
				
		return Response.ok(listaRet).build();
	}
	
	
	public boolean checkAssociazioneValida(XMLGregorianCalendar dataFineAdesione) {
		if(dataFineAdesione == null) {
			return true;
		}else {
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			if(dataFineAdesione.toGregorianCalendar().after(new Date())) {
				return true;
			} else {
				return false;
			}
				
		}
	}
	
	private boolean respNotNull(Return resp) {
		return resp.getBody() != null && resp.getBody().getInfoRappLavoro() != null &&  resp.getBody().getInfoRappLavoro().getInfoRapportoLavoro() != null;
	}
	
	private boolean checkSuccesso(Return resp) {
		if(resp != null && resp.getHeader() != null && (resp.getHeader().getCodiceRitorno() == 0)) {
			return true;
		}else {
			//log dell'errore e ritorno false
			if(resp.getFooter() != null && resp.getFooter().getMessages() != null && resp.getFooter().getMessages().getMessage() != null 
					&& resp.getFooter().getMessages().getMessage().size() > 0) {
				log.error("checkSuccesso", "Errore nella chiamata a getAssociazioniAggregazioni", resp.getFooter().getMessages().getMessage().get(0));
			}else {
				log.error("checkSuccesso", "");
			}
			
			return false;
		}
		  
	}
	
	
	private boolean checkSuccesso(it.csi.operatori.def.opessanws.opessan.FindOperatoriPerAssociazioneResponse.Return resp) {
		if(resp != null && resp.getHeader() != null && (resp.getHeader().getCodiceRitorno() == 0)) {
			return true;
		}else {
			//log dell'errore e ritorno false
			if(resp.getFooter() != null && resp.getFooter().getMessages() != null && resp.getFooter().getMessages().getMessage() != null 
					&& resp.getFooter().getMessages().getMessage().size() > 0) {
				log.error("checkSuccesso", "Errore nella chiamata a findOperatoriPerAssociazione", resp.getFooter().getMessages().getMessage().get(0));
			}else {
				log.error("checkSuccesso", "");
			}
			
			return false;
		}
		  
	}	
}
