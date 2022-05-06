/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm;

import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicketNew;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.IdentitaDigitale;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelDocumentoScrittura;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaCittadino;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadRichiestaNuova;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.RichiesteMessaggio;

public class EntityBuilderForTesting {
	
	
	
	public ModelTicketNew buildAFakeTIcketNew (String assetId) {
		String number = "1";
		Integer id = 1;
		String title = "aa";
		Integer groupId = 1;
		Integer priorityId = 1;
		Integer stateId = 1;
		String state = "bb";
		Integer customerId = 1;
		String utenteRiconosciuto = "1";
		String note = "cc";
		Integer typeId = 1;
		String asset = "dd";
		Integer articleCount = 1;
		List<Integer> articleIds = new ArrayList<Integer>();
		String createdAt = "ee";
		String updatedAt = "ff";
		
		ModelTicketNew newTicket = new ModelTicketNew(number, id, title, groupId, priorityId, stateId, state,
				customerId, utenteRiconosciuto, note, typeId, asset, assetId, articleCount, articleIds, createdAt,
				updatedAt);
		
		return newTicket;
	}
	
	public PayloadRichiestaNuova buildAFakeRichiestaNuova(IdentitaDigitale identitaDigitale) {
		String email = identitaDigitale.getEmail();
		String codiceFiscale = identitaDigitale.getCodiceFiscale();
		String nome = "c";
		String cognome = "d";
		ModelRichiestaCittadino cittadino = modelRichiestaCittadino(codiceFiscale, nome, cognome);
		String nomeFile = "alfa";
		String base64 = "data:application/pdf;base64,JVBERi0xLjUKJcOkw7zDtsOfCjIgMCBvYmoKPDwvTGVuZ3RoIDMgMCBSL0ZpbHRlci9GbGF0ZURlY29kZT4";
		ModelDocumentoScrittura allegato = modelDocumentoScrittura(nomeFile, base64);
		String testo = "abc";
		RichiesteMessaggio messaggio = richiesteMessaggio(allegato, testo);
		String tipologia = "e";
		String telefono = "f";
		String assetId = "1";
		PayloadRichiestaNuova nuovaRichiesta = payloadRichiestaNuova(email, cittadino, messaggio, tipologia, telefono,
				assetId);
		return nuovaRichiesta;
		
	}

	public PayloadRichiestaNuova payloadRichiestaNuova(String email, ModelRichiestaCittadino cittadino,
			RichiesteMessaggio messaggio, String tipologia, String telefono, String assetId) {
		PayloadRichiestaNuova nuovaRichiesta = new PayloadRichiestaNuova(email, telefono, cittadino, messaggio, tipologia, assetId);
		return nuovaRichiesta;
	}


	public RichiesteMessaggio richiesteMessaggio(ModelDocumentoScrittura allegato, String testo) {
		RichiesteMessaggio messaggio = new RichiesteMessaggio(testo, allegato);
		return messaggio;
	}


	public ModelDocumentoScrittura modelDocumentoScrittura(String nomeFile, String base64) {
		ModelDocumentoScrittura allegato = new ModelDocumentoScrittura(nomeFile, base64);
		return allegato;
	}


	public ModelRichiestaCittadino modelRichiestaCittadino(String codiceFiscale, String nome, String cognome) {
		ModelRichiestaCittadino cittadino = new ModelRichiestaCittadino(nome, cognome, codiceFiscale);
		return cittadino;
	}


	public IdentitaDigitale identitaDigitale(String email, String codiceFiscale) {
		return new IdentitaDigitale(codiceFiscale, email);
	}
		
	
}
