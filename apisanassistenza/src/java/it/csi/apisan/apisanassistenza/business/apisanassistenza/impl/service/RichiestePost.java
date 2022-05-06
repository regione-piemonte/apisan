/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.NextCrmApiClient;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaDettaglio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadRichiestaNuova;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class RichiestePost extends AssistenzaRESTService {

	PayloadRichiestaNuova payloadRichiestaNuova;
	@Autowired
	NextCrmApiClient nextCrmApiClient;

	public RichiestePost(PayloadRichiestaNuova payloadRichiestaNuova, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.payloadRichiestaNuova = payloadRichiestaNuova;
	}

	public RichiestePost() {
	}

	@Override
	protected Response execute() {
		log.info("execute", "BEGIN");
		validateCommonRequiredData();
		validateOptionalCodiceFiscaleIdentitaDigitale();
		validateOptionalEmailIdentitaDigitale();
		log.debug("execute", "payload nuova richiesta %s", payloadRichiestaNuova);
		/*
		 * String randomEmail = RandomStuff.anEmail(); String randomNome =
		 * RandomStuff.aString(); String randomCognome = RandomStuff.aString();
		 */
		// boolean hasUtenteIdentitaDigitale = (shibIdentitaCodiceFiscale != null); // TODO da migliorare il cf coincide?
//		String codiceFiscale = hasUtenteIdentitaDigitale ? shibIdentitaCodiceFiscale : payloadRichiestaNuova.getCittadino().getCodiceFiscale();

		/*
		 * ModelUser user = nextCrmApiClient.getOrCreateUser(hasUtenteIdentiDigitale,
		 * codiceFiscale, payloadRichiestaNuova.getEmail(),
		 * payloadRichiestaNuova.getCittadino().getNome(),
		 * payloadRichiestaNuova.getCittadino().getCognome(),
		 * payloadRichiestaNuova.getTelefono()); log.info("execute", "user %s", user);
		 * 
		 */
		// 
		ModelRichiestaDettaglio richiesta = nextCrmApiClient.createNewTicket(identitaDigitale, payloadRichiestaNuova);
		log.info("execute", "END");
		return Response.ok().entity(richiesta).build();
	}

	/*
	 * public ModelRichiestaDettaglio post() { ModelRichiestaDettaglio richiesta =
	 * buildRichiesta(); return richiesta; }
	 */

	/*
	 * private static PayloadRichiestaNuova buildPayloadNuovaRichiesta(String email,
	 * String cf) { PayloadRichiestaNuova nuovaRichiesta = new
	 * PayloadRichiestaNuova(); nuovaRichiesta.setEmail(email);
	 * nuovaRichiesta.setApplicazioneCodice("1");
	 * nuovaRichiesta.setTelefono("123456789"); ModelRichiestaCittadino cittadino =
	 * new ModelRichiestaCittadino(); cittadino.setCodiceFiscale(cf);
	 * cittadino.setCognome("Etha"); cittadino.setNome("Theta");
	 * nuovaRichiesta.setCittadino(cittadino);
	 * 
	 * RichiesteMessaggio messaggio = new RichiesteMessaggio();
	 * messaggio.setTesto("uno due tre"); ModelDocumentoScrittura allegato = new
	 * ModelDocumentoScrittura(); allegato.setNomeFile("documento1.txt");
	 * allegato.setBase64("YWxmYSBiZXRhIGdhbW1h"); messaggio.setAllegato(allegato);
	 * 
	 * nuovaRichiesta.setMessaggio(messaggio);
	 * 
	 * return nuovaRichiesta; }
	 */

	/*
	 * private ModelRichiestaDettaglio buildRichiesta() { ModelRichiestaDettaglio
	 * richiesta = new ModelRichiestaDettaglio(); final String id = "123";
	 * richiesta.setId(id); final String dataCreazione = "2021-01-07";
	 * richiesta.setDataCreazione(dataCreazione); final String dataAggiornamento =
	 * "2021-06-15"; richiesta.setDataAggiornamento(dataAggiornamento); final
	 * Boolean modificabile = true; richiesta.setModificabile(modificabile); final
	 * Boolean archiviata = false; richiesta.setArchiviata(archiviata); final String
	 * email = "alfa@beta.com"; richiesta.setEmail(email); final String telefono =
	 * "01234567890"; richiesta.setTelefono(telefono); final String statoCodice =
	 * "aperto"; richiesta.setStatoCodice(statoCodice); final String
	 * applicazioneCodice = "1";
	 * richiesta.setApplicazioneCodice(applicazioneCodice); final String
	 * assegnatario = "Altiero Spinelli"; richiesta.setAssegnatario(assegnatario);
	 * final ModelRichiestaStato stato = new ModelRichiestaStato();
	 * stato.setCodice("alfa"); stato.setDescrizione("alfa alfa alfa alfa");
	 * richiesta.setStato(stato);
	 * 
	 * final ModelRichiestaCittadino cittadino = new ModelRichiestaCittadino();
	 * cittadino.setNome("Mario"); cittadino.setCognome("Rossi");
	 * cittadino.setCodiceFiscale("MNCPLA74S27E425F");
	 * richiesta.setCittadino(cittadino);
	 * 
	 * final List<ModelMessaggio> messaggi = new ArrayList<ModelMessaggio>();
	 * ModelMessaggio messaggio = new ModelMessaggio(); messaggio.setId("1");
	 * messaggio.setAutore("Alfa Bravo"); messaggio.setDataCreazione("2012-05-29");
	 * messaggio.setTesto("alfa bravo charlie delta epsilon");
	 * messaggio.setInviatoDaCittadino(true); ModelDocumentoLettura allegato = new
	 * ModelDocumentoLettura(); allegato.setDimensione(100); allegato.setId("99");
	 * allegato.setNomeFile("documento.pdf"); messaggio.setAllegato(allegato);
	 * messaggi.add(messaggio); richiesta.setMessaggi(messaggi);
	 * 
	 * final List<ModelRichiestaStorico> storico = new
	 * ArrayList<ModelRichiestaStorico>(); richiesta.setStorico(storico); return
	 * richiesta; }
	 */

}
