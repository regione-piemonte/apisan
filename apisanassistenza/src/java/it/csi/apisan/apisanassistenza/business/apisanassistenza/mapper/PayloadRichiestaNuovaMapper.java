/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper;

import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelAttachments;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelCustomer;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicketPayload;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsTicket;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.IdentitaDigitale;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadRichiestaNuova;
import it.csi.apisan.apisanassistenza.util.ConstantApisanAssistenzaTestiStatici;
import it.csi.apisan.apisanassistenza.util.LogUtil;

public class PayloadRichiestaNuovaMapper extends BaseMapper<PayloadRichiestaNuova, ModelTicketPayload> {
	
	protected LogUtil log = new LogUtil(this.getClass());
	
	IdentitaDigitale identitaDigitale;

	public PayloadRichiestaNuovaMapper(IdentitaDigitale identitaDigitale) {
		super();
		this.identitaDigitale = identitaDigitale;
	}
	

	public PayloadRichiestaNuovaMapper() {
		super();
	}


	@Override
	public ModelTicketPayload to(PayloadRichiestaNuova source) {
		
		ModelTicketPayload ticket = new ModelTicketPayload();
		ModelArticle article = new ModelArticle();
		
		buildCustomerAndContactInfo(this.identitaDigitale, source, ticket, article);
		
		ticket.setGroupId(ConstantsTicket.GROUP_ID);
		ticket.setPriorityId(ConstantsTicket.PRIORITY_ID);
		ticket.setTypeId(ConstantsTicket.TYPE_ID);
		
		ticket.setTitle(source.getTipologia());
		
		ticket.setAssetId(Integer.parseInt(source.getAssetId()));
		
		boolean isUtenteRiconosciuto = (this.identitaDigitale.getCodiceFiscale() != null);
		ticket.setUtenteRiconosciuto(isUtenteRiconosciuto ? ConstantsTicket.CITTADINO_AUTENTICATO : ConstantsTicket.CITTADINO_NON_AUTENTICATO);
		ticket.setNote(null);
		
		boolean isRichiestaDaDelegato = (isUtenteRiconosciuto && source.getCittadino().getCodiceFiscale() != null && !this.identitaDigitale.getCodiceFiscale().equalsIgnoreCase(source.getCittadino().getCodiceFiscale())) ? true : false;

		StringBuilder testoRichiesta = new StringBuilder();
		if (isRichiestaDaDelegato) 
			testoRichiesta.append(String.format(ConstantApisanAssistenzaTestiStatici.NUOVA_RICHIESTA_UTENTE_DELEGATO, this.identitaDigitale.getCodiceFiscale(), source.getCittadino().getCodiceFiscale()));
		
		if (!isUtenteRiconosciuto) 
			testoRichiesta.append(ConstantApisanAssistenzaTestiStatici.NUOVA_RICHIESTA_UTENTE_NON_AUTENTICATO);
		
		testoRichiesta.append(source.getMessaggio().getTesto());
		article.setBody(testoRichiesta.toString());
		article.setTypeId(ConstantsArticle.TYPE_ID_API);
		article.setContentType(ConstantsArticle.CONTENT_TYPE);

		if (source.getMessaggio() != null && source.getMessaggio().getAllegato() != null) {
			List<ModelAttachments> modelAttachments = new ArrayList<ModelAttachments>();
			ModelAttachments attach = new ModelDocumentoScritturaMapper().to(source.getMessaggio().getAllegato());
			modelAttachments.add(attach);
			article.setAttachments(modelAttachments);
		}		
		
		ticket.setArticle(article);		
		
		return ticket;
		
	}

	@Override
	public PayloadRichiestaNuova from(ModelTicketPayload dest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	private void buildCustomerAndContactInfo(final IdentitaDigitale identita, final PayloadRichiestaNuova payloadNuovaRichiesta, final ModelTicketPayload ticket, final ModelArticle article) {
		ModelCustomer customer = new ModelCustomer();
		// String codiceFiscale = (identita.getCodiceFiscale() == null) ? payloadNuovaRichiesta.getCittadino().getCodiceFiscale() : identita.getCodiceFiscale();
		// customer.setCodiceFiscale(codiceFiscale);
		
		boolean isRichiestaNonAutenticata = identita.getCodiceFiscale() == null && (payloadNuovaRichiesta.getCittadino().getCodiceFiscale() != null);
		boolean isRichiestaAutenticata = (identita.getCodiceFiscale() != null);
		boolean isRichestaValorizzataConDueCodiciFiscali = (identita.getCodiceFiscale() != null) && (payloadNuovaRichiesta.getCittadino().getCodiceFiscale() != null);
		boolean isCodiceFiscaleIdentitaDiversoDaCodiceFiscaleParam = isRichestaValorizzataConDueCodiciFiscali && !identita.getCodiceFiscale().equalsIgnoreCase(payloadNuovaRichiesta.getCittadino().getCodiceFiscale());
		boolean isRichiestaAutenticataEDelegata = isRichiestaAutenticata && isRichestaValorizzataConDueCodiciFiscali && isCodiceFiscaleIdentitaDiversoDaCodiceFiscaleParam;
		// log.debug("buildCustomerAndContactInfo", "isRichiestaNonAutenticata %s, isRichiestaAutenticataEDelegata %s, isRichiestaAutenticata %s", isRichiestaNonAutenticata, isRichiestaAutenticata, isRichiestaAutenticataEDelegata);

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
		log.debug("buildCustomerAndContactInfo", "emailOnlyCertified %s, emailOnlyNotCertified %s, emailCertifiedAndNotCertified %s", emailOnlyCertified, emailOnlyNotCertified, emailCertifiedAndNotCertified);
		
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
	
}
