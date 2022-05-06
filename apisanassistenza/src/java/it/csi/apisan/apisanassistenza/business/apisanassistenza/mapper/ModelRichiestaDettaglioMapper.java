/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper;

import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicket;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicketNew;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsStatusTicket;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.MappingTicketStatus;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.util.RichiestaUtils;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.IdentitaDigitale;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelMessaggio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaDettaglio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaStato;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelTipologiaMessaggio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadRichiestaNuova;

public class ModelRichiestaDettaglioMapper extends BaseMapper<ModelRichiestaDettaglio, ModelTicketNew> {
	
	IdentitaDigitale identitaDigitale;
	PayloadRichiestaNuova payloadNuovaRichiesta;
	
	public ModelRichiestaDettaglioMapper(IdentitaDigitale identitaDigitale, PayloadRichiestaNuova payloadNuovaRichiesta) {
		super();
		this.identitaDigitale = identitaDigitale;
		this.payloadNuovaRichiesta = payloadNuovaRichiesta;
	}
	
	public ModelRichiestaDettaglioMapper() {
		super();
	}



	@Override
	public ModelTicketNew to(ModelRichiestaDettaglio source) {
		return null;
	}

	@Override
	public ModelRichiestaDettaglio from(ModelTicketNew dest) {
		if (dest == null) {
			return null;
		}
		
		ModelRichiestaDettaglio richiestaDettaglio = new ModelRichiestaDettaglio();
		richiestaDettaglio.setId(dest.getId().toString());
		richiestaDettaglio.setDataCreazione(dest.getCreatedAt());
		richiestaDettaglio.setDataAggiornamento(dest.getUpdatedAt());
		richiestaDettaglio.setModificabile(RichiestaUtils.isRichiestaModificabile(dest.getStateId()));
		richiestaDettaglio.setArchiviata(RichiestaUtils.isRichiestaArchiviata(dest.getStateId()));
		
		// logica email
		String email = null;
		if (payloadNuovaRichiesta.getEmail() != null) 
			email = payloadNuovaRichiesta.getEmail();
		
		if (identitaDigitale.getEmail() != null) 
			email = identitaDigitale.getEmail();
		
		richiestaDettaglio.setEmail(email);
		
		richiestaDettaglio.setTelefono(payloadNuovaRichiesta.getTelefono());
		richiestaDettaglio.setTipologia(dest.getTitle());
		richiestaDettaglio.setAssetId(payloadNuovaRichiesta.getAssetId());
		richiestaDettaglio.setAssegnatario(null);
		ModelRichiestaStato stato = new ModelRichiestaStato();
		stato.setCodice(dest.getStateId().toString());
		stato.setDescrizione(dest.getState());
		richiestaDettaglio.setStato(stato);
		
		List<ModelMessaggio> messaggi = new ArrayList<ModelMessaggio>();
		richiestaDettaglio.setMessaggi(messaggi);
		return richiestaDettaglio;		
		
	}
	
	
	public ModelRichiestaDettaglio from(ModelTicket dest, List<ModelArticle> articles) {
		if (dest == null) {
			return null;
		}
		ModelRichiestaDettaglio richiestaDettaglio = new ModelRichiestaDettaglio();
		richiestaDettaglio.setId(dest.getId().toString());
		richiestaDettaglio.setDataCreazione(dest.getCreatedAt());
		richiestaDettaglio.setDataAggiornamento(dest.getUpdatedAt());
		richiestaDettaglio.setModificabile(RichiestaUtils.isRichiestaModificabile(dest.getStateId()));
		richiestaDettaglio.setArchiviata(RichiestaUtils.isRichiestaArchiviata(dest.getStateId()));
		richiestaDettaglio.setEmail(dest.getNotificationEmail());
		richiestaDettaglio.setTelefono(dest.getRecallPhone());
		
		richiestaDettaglio.setAssetId(dest.getAssetId().toString());
		richiestaDettaglio.setRichiestaNumero(dest.getNumber());
		
		richiestaDettaglio.setTipologia(dest.getTitle());
		richiestaDettaglio.setAssegnatario(null);
		ModelRichiestaStato stato = new ModelRichiestaStato();
		stato.setCodice(dest.getStateId().toString());
		stato.setDescrizione(dest.getState());
		richiestaDettaglio.setStato(stato);
		
		// articles to messaggi
		List<ModelMessaggio> messaggi  = mapArticlesToMessaggi(articles);
		addStatusApertoMessage(messaggi, dest.getCreatedAt());
		richiestaDettaglio.setMessaggi(messaggi);
		
		return richiestaDettaglio;
	}
	
	
	private List<ModelMessaggio> mapArticlesToMessaggi(List<ModelArticle> articles) {
		List<ModelMessaggio> messaggi = new ArrayList<ModelMessaggio>();
		for (ModelArticle article : articles) {
			ModelMessaggio modelMessaggio = new ModelMessaggioMapper().from(article);
			if (modelMessaggio != null)
				messaggi.add(modelMessaggio);
		}
		return messaggi;
	}
	
	private void addStatusApertoMessage(List<ModelMessaggio> messaggi, String dataCreazioneTicket) {
		ModelMessaggio messaggio = new ModelMessaggio();
		Integer idStatusMessageFake = 0;
		messaggio.setId(idStatusMessageFake.toString());
		messaggio.setAutore(ConstantsArticle.FROM_OPERATORE.toString());
		messaggio.setTesto(MappingTicketStatus.getDescriptionById(ConstantsStatusTicket.APERTO));
		messaggio.setDataCreazione(dataCreazioneTicket);
		messaggio.setTipologiaAutore(ModelTipologiaMessaggio.AUTOMATICO.toString());
		messaggi.add(0, messaggio);
	}	
	

}
