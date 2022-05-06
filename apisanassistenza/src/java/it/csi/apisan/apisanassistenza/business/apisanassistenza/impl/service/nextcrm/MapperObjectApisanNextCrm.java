/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelAttachments;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelCustomer;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicket;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicketNew;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicketPayload;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicketUpdate;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelUserNew;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsStatusTicket;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsTicket;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.MappingServizioOnLine;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.MappingTicketStatus;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.IdentitaDigitale;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelDocumentoLettura;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelMessaggio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaCittadino;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaDettaglio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaLista;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaStato;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelTipologiaMessaggio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadRichiestaNuova;
import it.csi.apisan.apisanassistenza.exception.ErroreBuilder;
import it.csi.apisan.apisanassistenza.util.ApisanAssistenzaErrorStatusCode;
import it.csi.apisan.apisanassistenza.util.ConstantApisanAssistenzaTestiStatici;
import it.csi.apisan.apisanassistenza.util.LogUtil;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class MapperObjectApisanNextCrm {

	protected LogUtil log = new LogUtil(this.getClass());
	

	@Deprecated
	public ModelRichiestaLista mapNewTicketOnRichiestaLista(ModelTicket ticket, ModelArticle lastArticle, ModelArticle articleAutomaticallyGenerated) {
		ModelRichiestaLista richiesta = new ModelRichiestaLista();
		richiesta.setId(ticket.getId().toString());
		richiesta.setDataCreazione(ticket.getCreatedAt());
		richiesta.setDataAggiornamento(ticket.getUpdatedAt());
		
		if (ticket.getStateId() != null) {
			richiesta.setModificabile(isRichiestaModificabile(ticket.getStateId()));
			richiesta.setArchiviata(isRichiestaArchiviata(ticket.getStateId()));
		}
		
		if (ticket.getNotificationEmail() != null)
			richiesta.setEmail(ticket.getNotificationEmail());
		
		if (ticket.getRecallPhone() != null)
			richiesta.setTelefono(ticket.getRecallPhone());
		
		if (ticket.getAssetId() != null)
			richiesta.setAssetId(ticket.getAssetId().toString());
		
		if (ticket.getNumber() != null)
			richiesta.setRichiestaNumero(ticket.getNumber());
		
		ModelRichiestaStato stato = new ModelRichiestaStato();
		stato.setCodice(ticket.getStateId().toString());
		stato.setDescrizione(ticket.getState());
		richiesta.setStato(stato);
		
		richiesta.setTipologia(ticket.getTitle());
		
		if (articleAutomaticallyGenerated != null) {
			richiesta.setAssegnatario(articleAutomaticallyGenerated.getBody());	
		}		
		
		/*
		ModelRichiestaCittadino cittadino = new ModelRichiestaCittadino();
		cittadino.setNome(payloadNuovaRichiesta.getCittadino().getNome());
		cittadino.setCognome(payloadNuovaRichiesta.getCittadino().getCognome());
		cittadino.setCodiceFiscale(payloadNuovaRichiesta.getCittadino().getCodiceFiscale());
		richiesta.setCittadino(cittadino);
		*/
		ModelMessaggio messaggio = null;
		if (lastArticle != null) {
			messaggio = mapArticleToMessaggio(lastArticle);			
		}
		richiesta.setUltimoMessaggio(messaggio);
		
		return richiesta;
	}

	
	@Deprecated
	private List<ModelMessaggio> mapArticlesToMessaggi(List<ModelArticle> articles) {
		List<ModelMessaggio> messaggi = new ArrayList<ModelMessaggio>();
		for (ModelArticle article : articles) {
			ModelMessaggio modelMessaggio = mapArticleToMessaggio(article);
			if (modelMessaggio != null)
				messaggi.add(modelMessaggio);
		}
		return messaggi;
	}	
	
	@Deprecated
	private ModelMessaggio mapArticleToMessaggio(ModelArticle article) {
		
		// messaggio da escludere
		if (article.getTypeId() != null && article.getTypeId() == ConstantsArticle.TYPE_ID_EMAIL_TO_EXCLUDE) {
			return null;
		}
		if (article.getTypeId() != null && article.getTypeId() == ConstantsArticle.TYPE_ID_OPERATORE_OR_AUTOMATICO
				&& article.getSubject() != null && article.getSubject().toUpperCase().startsWith("[EXT]")) {
			return null;
		}
		ModelMessaggio messaggio;
		messaggio = new ModelMessaggio();
		messaggio.setId(article.getId().toString());
		messaggio.setAutore(article.getFrom());
		messaggio.setTesto(article.getBody());
		messaggio.setDataCreazione(article.getCreatedAt());
		String tipologiaAutore = null;
		if (isTipologiaAutoreCittadino(article)) {
			tipologiaAutore = ModelTipologiaMessaggio.CITTADINO.toString();
		} else 	if (isTipologiaAutoreOperatore(article)) {
			tipologiaAutore = ModelTipologiaMessaggio.OPERATORE.toString();
		} else if  (
				isTipologiaAutoreAutomatico(article)) {
			tipologiaAutore = ModelTipologiaMessaggio.AUTOMATICO.toString();
		} else {
			// ERROR?
		}
		
		messaggio.setTipologiaAutore(tipologiaAutore);
		ModelDocumentoLettura documento = null;
		if (article.getAttachments().size() > 0) {
			documento = new ModelDocumentoLettura();
			List<ModelAttachments> modelAttachments = article.getAttachments();
			ModelAttachments attachment = modelAttachments.get(0);
			documento.setId(attachment.getId().toString());
			documento.setDimensione(attachment.getSize());
			documento.setNomeFile(attachment.getFilename());
		}
		messaggio.setAllegato(documento);
		return messaggio;
	}


	private boolean isTipologiaAutoreAutomatico(ModelArticle article) {
		return article.getTypeId() != null && article.getTypeId() == ConstantsArticle.TYPE_ID_OPERATORE_OR_AUTOMATICO
				&& article.getFrom() != null && article.getFrom().toUpperCase().equalsIgnoreCase(ConstantsArticle.FROM_OPERATORE.toUpperCase()) 
				&& article.getSubject() != null && article.getSubject().toUpperCase().startsWith(ConstantsArticle.SUBJECT_AUTOMATICO.toUpperCase());
	}

	private boolean isTipologiaAutoreCittadino(ModelArticle article) {
		return article.getTypeId() != null && article.getTypeId() == ConstantsArticle.TYPE_ID_API;
	}	
	
	private boolean isTipologiaAutoreOperatore (ModelArticle article) {
		return article.getTypeId() != null && article.getTypeId() == ConstantsArticle.TYPE_ID_OPERATORE_OR_AUTOMATICO
				&& article.getFrom() != null && article.getFrom().toUpperCase().equalsIgnoreCase(ConstantsArticle.FROM_OPERATORE.toUpperCase())
				&& article.getSubject() != null && article.getSubject().toUpperCase().startsWith(ConstantsArticle.SUBJECT_OPERATORE.toUpperCase());
	}
	

	@Deprecated
	public ModelRichiestaDettaglio mapNewTicketOnRichiestaDettaglio(ModelTicketNew newTicket, PayloadRichiestaNuova payloadNuovaRichiesta, IdentitaDigitale identita) {
		ModelRichiestaDettaglio richiestaDettaglio = new ModelRichiestaDettaglio();
		richiestaDettaglio.setId(newTicket.getId().toString());
		richiestaDettaglio.setDataCreazione(newTicket.getCreatedAt());
		richiestaDettaglio.setDataAggiornamento(newTicket.getUpdatedAt());
		richiestaDettaglio.setModificabile(isRichiestaModificabile(newTicket.getStateId()));
		richiestaDettaglio.setArchiviata(isRichiestaArchiviata(newTicket.getStateId()));
		
		// logica email
		String email = null;
		if (payloadNuovaRichiesta.getEmail() != null) 
			email = payloadNuovaRichiesta.getEmail();
		
		if (identita.getEmail() != null) 
			email = identita.getEmail();
		
		richiestaDettaglio.setEmail(email);
		
		richiestaDettaglio.setTelefono(payloadNuovaRichiesta.getTelefono());
		richiestaDettaglio.setTipologia(newTicket.getTitle());
		richiestaDettaglio.setAssetId(payloadNuovaRichiesta.getAssetId());
		richiestaDettaglio.setAssegnatario(null);
		ModelRichiestaStato stato = new ModelRichiestaStato();
		stato.setCodice(newTicket.getStateId().toString());
		stato.setDescrizione(newTicket.getState());
		richiestaDettaglio.setStato(stato);
		
		/*
		ModelRichiestaCittadino cittadino = new ModelRichiestaCittadino();
		cittadino.setNome(payloadNuovaRichiesta.getCittadino().getNome());
		cittadino.setCognome(payloadNuovaRichiesta.getCittadino().getCognome());
		cittadino.setCodiceFiscale(payloadNuovaRichiesta.getCittadino().getCodiceFiscale());
		richiestaDettaglio.setCittadino(cittadino);
		*/
		
		List<ModelMessaggio> messaggi = new ArrayList<ModelMessaggio>();
		richiestaDettaglio.setMessaggi(messaggi);
		return richiestaDettaglio;
	}

	@Deprecated
	public ModelRichiestaDettaglio mapTicketOnRichiestaDettaglio(ModelTicket ticket, List<ModelArticle> articles) {
		ModelRichiestaDettaglio richiestaDettaglio = new ModelRichiestaDettaglio();
		richiestaDettaglio.setId(ticket.getId().toString());
		richiestaDettaglio.setDataCreazione(ticket.getCreatedAt());
		richiestaDettaglio.setDataAggiornamento(ticket.getUpdatedAt());
		richiestaDettaglio.setModificabile(isRichiestaModificabile(ticket.getStateId()));
		richiestaDettaglio.setArchiviata(isRichiestaArchiviata(ticket.getStateId()));
		richiestaDettaglio.setEmail(ticket.getNotificationEmail());
		richiestaDettaglio.setTelefono(ticket.getRecallPhone());
		
		richiestaDettaglio.setAssetId(ticket.getAssetId().toString());
		richiestaDettaglio.setRichiestaNumero(ticket.getNumber());
		
		richiestaDettaglio.setTipologia(ticket.getTitle());
		richiestaDettaglio.setAssegnatario(null);
		ModelRichiestaStato stato = new ModelRichiestaStato();
		stato.setCodice(ticket.getStateId().toString());
		stato.setDescrizione(ticket.getState());
		richiestaDettaglio.setStato(stato);
		
		// articles to messaggi
		List<ModelMessaggio> messaggi  = mapArticlesToMessaggi(articles);
		addStatusApertoMessage(messaggi, ticket.getCreatedAt());
		richiestaDettaglio.setMessaggi(messaggi);
		
		return richiestaDettaglio;
	}
	
	@Deprecated
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


	@Deprecated
	private ModelRichiestaCittadino mapCustomerToCittadino(ModelCustomer customer) {
		ModelRichiestaCittadino cittadino = new ModelRichiestaCittadino();
		cittadino.setNome(customer.getFirstname());
		cittadino.setCognome(customer.getLastname());
		cittadino.setCodiceFiscale(customer.getCodiceFiscale());		
		return cittadino;
	}

	private boolean isRichiestaArchiviata(Integer ticketStateId) {
		return ticketStateId.equals(ConstantsStatusTicket.CHIUSO);
	}

	private boolean isRichiestaModificabile(Integer ticketStateId) {
		return ticketStateId.equals(ConstantsStatusTicket.NUOVO) || ticketStateId.equals(ConstantsStatusTicket.APERTO) || ticketStateId.equals(ConstantsStatusTicket.IN_ATTESA_DI_RISPOSTA) || ticketStateId.equals(ConstantsStatusTicket.RISOLTO);
	}
	
	@Deprecated
	public ModelTicketPayload mapRichiestaOnTicket(IdentitaDigitale identita, PayloadRichiestaNuova payloadNuovaRichiesta) {
		
		ModelTicketPayload ticket = new ModelTicketPayload();
		ModelArticle article = new ModelArticle();
		
		buildCustomerAndContactInfo(identita, payloadNuovaRichiesta, ticket, article);
		
		ticket.setGroupId(ConstantsTicket.GROUP_ID);
		ticket.setPriorityId(ConstantsTicket.PRIORITY_ID);
		ticket.setTypeId(ConstantsTicket.TYPE_ID);
		
		ticket.setTitle(payloadNuovaRichiesta.getTipologia());
		
		ticket.setAssetId(Integer.parseInt(payloadNuovaRichiesta.getAssetId()));
		
		boolean isUtenteRiconosciuto = (identita.getCodiceFiscale() != null);
		ticket.setUtenteRiconosciuto(isUtenteRiconosciuto ? ConstantsTicket.CITTADINO_AUTENTICATO : ConstantsTicket.CITTADINO_NON_AUTENTICATO);
		ticket.setNote(null);
		
		boolean isRichiestaDaDelegato = (isUtenteRiconosciuto && payloadNuovaRichiesta.getCittadino().getCodiceFiscale() != null && !identita.getCodiceFiscale().equalsIgnoreCase(payloadNuovaRichiesta.getCittadino().getCodiceFiscale())) ? true : false;

		StringBuilder testoRichiesta = new StringBuilder();
		if (isRichiestaDaDelegato) 
			testoRichiesta.append(String.format(ConstantApisanAssistenzaTestiStatici.NUOVA_RICHIESTA_UTENTE_DELEGATO, identita.getCodiceFiscale(), payloadNuovaRichiesta.getCittadino().getCodiceFiscale()));
		
		if (!isUtenteRiconosciuto) 
			testoRichiesta.append(ConstantApisanAssistenzaTestiStatici.NUOVA_RICHIESTA_UTENTE_NON_AUTENTICATO);
		
		testoRichiesta.append(payloadNuovaRichiesta.getMessaggio().getTesto());
		article.setBody(testoRichiesta.toString());
		article.setTypeId(ConstantsArticle.TYPE_ID_API);
		article.setContentType(ConstantsArticle.CONTENT_TYPE);
		
		List<ModelAttachments> attachments = new ArrayList<ModelAttachments>();
		if (payloadNuovaRichiesta.getMessaggio() != null && payloadNuovaRichiesta.getMessaggio().getAllegato() != null) {
			ModelAttachments attachment = new ModelAttachments();
			attachment.setFilename(payloadNuovaRichiesta.getMessaggio().getAllegato().getNomeFile());
			String[] tokens = payloadNuovaRichiesta.getMessaggio().getAllegato().getBase64().split(":|;|,");
			// [0] data
			// [1] application/pdf
			// [2] base64
			// [3] CgoKCmN...
			String mimeType = tokens[1];
			String base64 = tokens[3];
			attachment.setData(base64);
			// ModelMimeType mtype = new ModelMimeType();
			// mtype.setMimeType("text/plain");
			// attachment.setPreferences(mtype);   // 
			attachment.setMimeType(mimeType); // mapping con estensione
			attachments.add(attachment);
		}
		article.setAttachments(attachments);
		ticket.setArticle(article);
		
		return ticket;
	}
	
	@Deprecated
	private void buildCustomerAndContactInfo(final IdentitaDigitale identita, final PayloadRichiestaNuova payloadNuovaRichiesta, final ModelTicketPayload ticket, final ModelArticle article) {
		ModelCustomer customer = new ModelCustomer();
		// String codiceFiscale = (identita.getCodiceFiscale() == null) ? payloadNuovaRichiesta.getCittadino().getCodiceFiscale() : identita.getCodiceFiscale();
		// customer.setCodiceFiscale(codiceFiscale);
		
		boolean isRichiestaNonAutenticata = identita.getCodiceFiscale() == null && (payloadNuovaRichiesta.getCittadino().getCodiceFiscale() != null);
		boolean isRichiestaAutenticata = (identita.getCodiceFiscale() != null);
		boolean isRichestaValorizzataConDueCodiciFiscali = (identita.getCodiceFiscale() != null) && (payloadNuovaRichiesta.getCittadino().getCodiceFiscale() != null);
		boolean isCodiceFiscaleIdentitaDiversoDaCodiceFiscaleParam = isRichestaValorizzataConDueCodiciFiscali && !identita.getCodiceFiscale().equalsIgnoreCase(payloadNuovaRichiesta.getCittadino().getCodiceFiscale());
		boolean isRichiestaAutenticataEDelegata = isRichiestaAutenticata && isRichestaValorizzataConDueCodiciFiscali && isCodiceFiscaleIdentitaDiversoDaCodiceFiscaleParam;
		log.info("buildCustomerAndContactInfo", "isRichiestaNonAutenticata %s, isRichiestaAutenticataEDelegata %s, isRichiestaAutenticata %s", isRichiestaNonAutenticata, isRichiestaAutenticata, isRichiestaAutenticataEDelegata);

		String codiceFiscale = null;
		if (isRichiestaNonAutenticata || isRichiestaAutenticataEDelegata) {
			codiceFiscale = payloadNuovaRichiesta.getCittadino().getCodiceFiscale();
		} else {
			codiceFiscale = identita.getCodiceFiscale();
		}
		customer.setCodiceFiscale(codiceFiscale);
		if (payloadNuovaRichiesta.getCittadino().getNome() != null)
			customer.setFirstname(payloadNuovaRichiesta.getCittadino().getNome());
		if (payloadNuovaRichiesta.getCittadino().getCognome() != null)
			customer.setLastname(payloadNuovaRichiesta.getCittadino().getCognome());

		boolean emailOnlyCertified = ((identita.getEmail() != null) && (payloadNuovaRichiesta.getEmail() == null));
		boolean emailOnlyNotCertified = ((identita.getEmail() == null) && (payloadNuovaRichiesta.getEmail() != null));
		boolean emailCertifiedAndNotCertified = ((identita.getEmail() != null) && (payloadNuovaRichiesta.getEmail() != null));
		log.info("buildCustomerAndContactInfo", "emailOnlyCertified %s, emailOnlyNotCertified %s, emailCertifiedAndNotCertified %s", emailOnlyCertified, emailOnlyNotCertified, emailCertifiedAndNotCertified);
		
		String customerEmail = null;
		String ticketNotificationEmail = null;
		String ticketEmail = null;
		
		if (emailOnlyCertified) {
			customerEmail = identita.getEmail();
			ticketNotificationEmail = identita.getEmail();
			ticketEmail = identita.getEmail();
		} else if (emailOnlyNotCertified) {
			customerEmail = payloadNuovaRichiesta.getEmail();
			ticketNotificationEmail = payloadNuovaRichiesta.getEmail();
			ticketEmail = payloadNuovaRichiesta.getEmail();
		} else if (emailCertifiedAndNotCertified) {
			customerEmail = identita.getEmail();
			ticketNotificationEmail = payloadNuovaRichiesta.getEmail();
			ticketEmail = payloadNuovaRichiesta.getEmail();
		}
		customer.setEmail(customerEmail);
		ticket.setNotificationEmail(ticketNotificationEmail);
		article.setFrom(ticketEmail);		
		

		customer.setPhone(payloadNuovaRichiesta.getTelefono());
		ticket.setCustomer(customer);
		ticket.setRecallPhone(payloadNuovaRichiesta.getTelefono());
	}
	
	@Deprecated
	private Integer mapIdServizioOnLine(String codiceApplicazione) {
		return MappingServizioOnLine.getServiceAssetId(Integer.parseInt(codiceApplicazione));
	}
	
	@Deprecated
	private String mapDescrizioneServizioOnLine(String codiceApplicazione) {
		return MappingServizioOnLine.getServiceDescription(Integer.parseInt(codiceApplicazione));
	}

	@Deprecated
	public ModelTicketUpdate mapRichiestaAnnullataOnTicket(Integer stateId) {
		ModelTicketUpdate ticketToUpdate = new ModelTicketUpdate();
		if (stateId == null)
			throw  ErroreBuilder
			.from(ApisanAssistenzaErrorStatusCode.PARAMETRO_NON_VALIDO, stateId)
			.dettaglio("STATO TICKET", stateId+"")
			.exception();
		
		ticketToUpdate.setStateId(stateId);
		return ticketToUpdate;
	}
	
	@Deprecated
	public ModelTicketUpdate mapRichiestaModificataOnTicket(Integer stateId, Integer priorityId, String title, String customer, Integer typeId, Integer utenteRiconosciuto, String note, Integer assetId ) {
		ModelTicketUpdate ticketToUpdate = new ModelTicketUpdate();
		if (stateId != null)
			ticketToUpdate.setStateId(stateId);
		if (priorityId != null)
			ticketToUpdate.setPriorityId(priorityId);
		if (title != null)
			ticketToUpdate.setTitle(title);
		if (customer != null)
			ticketToUpdate.setCustomer(customer);
		if (typeId != null)
			ticketToUpdate.setTypeId(typeId);
		if (utenteRiconosciuto != null)
			ticketToUpdate.setUtenteRiconosciuto(utenteRiconosciuto);
		if (note != null)
			ticketToUpdate.setNote(note);
		if (assetId != null)
			ticketToUpdate.setAssetId(assetId);
		
		return ticketToUpdate;
	}
	
	@Deprecated
	private ModelUserNew buildUser(final String codiceFiscale, final String email, final String nome,
			final String cognome, final String telefono) {
		ModelUserNew userToCreate = new ModelUserNew();
		userToCreate.setCodiceFiscale(codiceFiscale);
		userToCreate.setFirstname(nome);
		userToCreate.setLastname(cognome);
		userToCreate.setEmail(email);
		userToCreate.setPhone(telefono);
		return userToCreate;
	}
		
	
}
