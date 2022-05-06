/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.Response.Status;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ContainerTicketAndArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelAttachments;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelCustomer;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicket;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicketNew;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicketPayload;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicketUpdate;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsNextCrmApi;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsStatusTicket;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsTicket;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.UrlBuilder;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.DocumentoAllegatoMapper;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.JsonMapper;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.ModelDocumentoScritturaMapper;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.ModelMessaggioMapper;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.ModelRichiestaDettaglioMapper;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.ModelRichiestaListaMapper;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.PayloadRichiestaNuovaMapper;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.util.ArticleUtils;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.DocumentoAllegato;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.IdentitaDigitale;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelDocumentoScrittura;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelMessaggio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaDettaglio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaLista;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadMessaggioNuovo;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadRichiestaNuova;
import it.csi.apisan.apisanassistenza.exception.ErroreBuilder;
import it.csi.apisan.apisanassistenza.exception.RESTException;
import it.csi.apisan.apisanassistenza.util.ApisanAssistenzaErrorStatusCode;
import it.csi.apisan.apisanassistenza.util.LogUtil;
import okhttp3.Response;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class NextCrmApiClient {

	protected LogUtil log = new LogUtil(this.getClass());
	
	@Value("${apiManagerConsumerKey}")
	private String apiManagerConsumerKey;
	@Value("${apiManagerConsumerSecret}")
	private String apiManagerConsumerSecret;
	@Value("${apiManagerUrlToken}")	
	private String apiManagerUrlToken;
	@Value("${apiManagerUrlNextCrm}")	
	private String apiManagerUrlNextCrm;	
	
	httpClient client;

	@PostConstruct
	public void init() throws IOException {
		client = new httpClient(apiManagerConsumerKey, apiManagerConsumerSecret, apiManagerUrlToken);
	}

	public List<ModelRichiestaLista> searchRichieste(String codiceFiscale, Boolean archiviata, String applicazione,
			String parolaChiave, String da, String a, String id) {
		log.info("searchRichieste", "BEGIN");
		List<ContainerTicketAndArticle> elencoContainerTicketAndArticle = new ArrayList<ContainerTicketAndArticle>();
		List<ModelRichiestaLista> elencoRichieste = new ArrayList<ModelRichiestaLista>();
		try {
			String filter = createFilterByMultipleParams(codiceFiscale, id, archiviata, applicazione, parolaChiave, da,
					a);
			log.info("searchRichieste", "filter %s", filter);
			String url = new UrlBuilder(apiManagerUrlNextCrm).path(ConstantsNextCrmApi.TICKETS_SEARCH)
					.filter(filter).buildUrl();
			log.debug("searchRichieste", "url %s", url);
			Response response = client.get(url);
			if (!response.isSuccessful())
				throw ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.ERRORE_SERVIZIO_INTERNO, response.message())
						.title("Errore nella chiamata al servizio di NEXTCRM")
						.dettaglio(response.code() + "", response.message()).exception();
			List<ModelTicket> listTicket = deserializeListTicket(response.body().string());
			for (ModelTicket ticket : listTicket) {
				log.debug("searchRichieste", "dump ticket %s ", ticket);
				String urlArticle = new UrlBuilder(apiManagerUrlNextCrm)
						.path(ConstantsNextCrmApi.ARTICLES, ticket.getId().toString()).buildUrl();
				log.info("searchRichieste", "url article %s - [%s]", ticket.getId().toString(), urlArticle);
				Response responseArticle = client.get(urlArticle);
				if (!responseArticle.isSuccessful())
					throw ErroreBuilder
							.from(ApisanAssistenzaErrorStatusCode.ERRORE_SERVIZIO_INTERNO, responseArticle.message())
							.title("Errore nella chiamata al servizio di NEXTCRM")
							.dettaglio(responseArticle.code() + "", responseArticle.message()).exception();
				String jsonArticles = responseArticle.body().string();
				log.debug("searchRichieste", "article response %s", jsonArticles);
				List<ModelArticle> articles = deserializeArticles(jsonArticles);
				ModelArticle lastArticle = null;
				ModelArticle articleAutomaticallyGenerated = null;
				// prendi la lista
				// estrai l'ultimo messaggio di stato
				// estrai l'ultimo messaggio utente	
				/*
				if (articles.size() > 0) {
					try {
						int last = articles.size() - 1;
						log.info("searchRichieste", "size: %s, last %s ", articles.size(), last);
						
						articleAutomaticallyGenerated = articles.get(last);
						lastArticle = articles.get(last - 1);
					} catch (Exception e) {
					}
				}
				*/
				if (articles.size() > 0) {
					ListIterator<ModelArticle> li = articles.listIterator(articles.size());
					while(li.hasPrevious()) {
						ModelArticle article = li.previous();
						if (ArticleUtils.isTipologiaAutoreCittadino(article) || ArticleUtils.isTipologiaAutoreOperatore(article)) {
							lastArticle = article;
							break;
						}
					}
					ListIterator<ModelArticle> li2 = articles.listIterator(articles.size());
					while(li2.hasPrevious()) {
						ModelArticle article = li2.previous();
						if (ArticleUtils.isTipologiaAutoreAutomatico(article)) {
							articleAutomaticallyGenerated = article;
							break;
						}
					}
				}
				/*
				for (ModelArticle article : articles) {
					log.debug("searchRichieste", "article %s", article);
				}
				*/
				elencoContainerTicketAndArticle.add(new ContainerTicketAndArticle(ticket, lastArticle, articleAutomaticallyGenerated));
				
			}
			elencoRichieste = buildElencoRichieste(elencoContainerTicketAndArticle);
		} catch (RESTException e) {
			throw e;
		} catch (Exception e) {
			log.error("searchRichieste", "exception %s", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata al servizio di NEXTCRM")
					.exception();
		}
		return elencoRichieste;
	}
	
	

	public ModelMessaggio addMessageToRichiesta(String citId, String richiestaId, PayloadMessaggioNuovo payloadMessaggioNuovo,
			ModelTicket ticket) {
		log.info("addMessageToRichiesta", "BEGIN");
		ModelMessaggio messaggio = new ModelMessaggio();
		try {
			messaggio = addAnArticleToTicket(richiestaId, payloadMessaggioNuovo, ticket);
		} catch (RESTException e) {
			throw e;
		} catch (Exception e) {
			log.error("fetchUser", "exception %s", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata al servizio di NEXTCRM")
					.exception();
		}
		log.info("addMessageToRichiesta", "END");
		return messaggio;
	}	
	
	
	public ModelTicket checkTicketExists(String citId, String richiestaId) {
		List<ModelTicket> tickets = searchForTicketByCodiceFiscaleAndIdentifier(citId, richiestaId);
		if (tickets.size() == 0)
			throw ErroreBuilder
			.from(ApisanAssistenzaErrorStatusCode.RICHIESTA_NON_TROVATA, richiestaId, citId)
			.dettaglio("CODICE_FISCALE", citId)
			.exception();
		return tickets.get(0);
	}	

	public List<ModelTicket> searchForTicketByCodiceFiscaleAndIdentifier(String codiceFiscale, String ticketId) {
		log.info("searchForTicketByCodiceFiscaleAndIdentifier", "BEGIN");
		String filter = createFilterByMultipleParams(codiceFiscale, ticketId, null, null, null, null, null);
		String url = new UrlBuilder(apiManagerUrlNextCrm).path(ConstantsNextCrmApi.TICKETS_SEARCH)
				.filter(filter).buildUrl();
		log.debug("searchForTicketByCodiceFiscaleAndIdentifier", "url %s", url);
		List<ModelTicket> tickets = new ArrayList<ModelTicket>();
		try {
			Response response = client.get(url);
			if (!response.isSuccessful())
				throw ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.ERRORE_SERVIZIO_INTERNO, response.message())
						.title("Errore nella chiamata al servizio di NEXTCRM")
						.dettaglio(response.code() + "", response.message()).exception();
			String jsonSearchTickets = response.body().string();
			ObjectMapper mapper = new ObjectMapper();
			log.debug("searchForTicketByCodiceFiscaleAndIdentifier", "dump response %s", jsonSearchTickets);
			tickets = mapper.readValue(jsonSearchTickets, new TypeReference<List<ModelTicket>>() {
			});
			log.info("searchForTicketByCodiceFiscaleAndIdentifier", "ticket trovati %s", tickets.size());
		} catch (RESTException e) {
			throw e;
		} catch (Exception e) {
			log.error("fetchUser", "exception %s", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata al servizio di NEXTCRM")
					.exception();
		}
		return tickets;
	}
	
	public ModelRichiestaDettaglio getRichiesta(String citId, String richiestaId, IdentitaDigitale identitaDigitale) {
		log.info("getRichiesta", "BEGIN");
		ModelRichiestaDettaglio richiesta = new ModelRichiestaDettaglio();
		try {
			String url = new UrlBuilder(apiManagerUrlNextCrm).path(ConstantsNextCrmApi.TICKETS_ID, richiestaId).buildUrl();
			log.debug("getRichiesta", "url %s", url);
			Response response = client.get(url);
			if (!response.isSuccessful())
				throw ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.ERRORE_SERVIZIO_INTERNO, response.message())
						.title("Errore nella chiamata al servizio di NEXTCRM")
						.dettaglio(response.code() + "", response.message()).exception();
			ModelTicket ticket = deserializeTicket(response.body().string());
			String urlArticle = new UrlBuilder(apiManagerUrlNextCrm)
					.path(ConstantsNextCrmApi.ARTICLES, ticket.getId().toString()).buildUrl();
			log.info("getRichiesta", "url article %s - [%s]", ticket.getId().toString(), urlArticle);
			Response responseArticle = client.get(urlArticle);
			if (!responseArticle.isSuccessful())
				throw ErroreBuilder
						.from(ApisanAssistenzaErrorStatusCode.ERRORE_SERVIZIO_INTERNO, responseArticle.message())
						.title("Errore nella chiamata al servizio di NEXTCRM")
						.dettaglio(responseArticle.code() + "", responseArticle.message()).exception();	
			String jsonArticles = responseArticle.body().string();
			// log.debug("searchRichieste", "article response %s", jsonArticles);
			List<ModelArticle> articles = deserializeArticles(jsonArticles);
			richiesta = new ModelRichiestaDettaglioMapper().from(ticket, articles); 
		} catch (RESTException e) {
			throw e;
		} catch (Exception e) {
			log.error("fetchUser", "exception %s", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata al servizio di NEXTCRM")
					.exception();
		}		
		log.info("getRichiesta", "END");
		return richiesta;
	}	

	public ModelCustomer searchForUserByCodiceFiscale(String codiceFiscale) {
		log.info("searchForUserByCodiceFiscale", "BEGIN");
		String url = new UrlBuilder(apiManagerUrlNextCrm).path(ConstantsNextCrmApi.USERS_SEARCH)
				.filter(createFilterByCodiceFiscaleUser(codiceFiscale)).buildUrl();
		log.info("searchForUserByCodiceFiscale", "url %s", url);
		return fetchUser(url);
	}

	public ModelCustomer searchForUserByEmail(String userEmail) {
		log.info("searchForUserByEmail", "BEGIN");
		String url = new UrlBuilder(apiManagerUrlNextCrm).path(ConstantsNextCrmApi.USERS_SEARCH)
				.filter(createFilterByEmail(userEmail)).buildUrl();
		log.info("searchForUserByEmail", "url %s", url);
		return fetchUser(url);
	}

	private ModelCustomer fetchUser(String url) {
		log.info("fetchUser", "BEGIN");
		ModelCustomer user = null;
		try {
			Response response = client.get(url);
			if (!response.isSuccessful())
				throw ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.ERRORE_SERVIZIO_INTERNO, response.message())
						.title("Errore nella chiamata al servizio di NEXTCRM")
						.dettaglio(response.code() + "", response.message()).exception();
			String jsonSearchUser = response.body().string();
			ObjectMapper mapper = new ObjectMapper();
			log.debug("fetchUser", "dump response %s", jsonSearchUser);
			List<ModelCustomer> users = mapper.readValue(jsonSearchUser, new TypeReference<List<ModelCustomer>>() {
			});
			if (users.size() > 0) {
				log.info("fetchUser", "utenti trovati %s", users.size());
				return users.get(0);
				// TODO: verificare casi in cui c'è più di un utente, sollevare eccezione
			}
		} catch (RESTException e) {
			throw e;
		} catch (Exception e) {
			log.error("fetchUser", "exception %s", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata al servizio di NEXTCRM")
					.exception();
		}
		log.info("fetchUser", "END");
		return user;
	}

	public ModelRichiestaDettaglio createNewTicket(IdentitaDigitale identita, PayloadRichiestaNuova payloadNuovaRichiesta) {
		log.info("createNewTicket", "BEGIN");
		ModelRichiestaDettaglio nuovaRichiestaCreata = null;
		try {
			String url = new UrlBuilder(apiManagerUrlNextCrm).path(ConstantsNextCrmApi.TICKETS).buildUrl();
			log.debug("createNewTicket", "url %s", url);
			ModelTicketPayload ticket = new PayloadRichiestaNuovaMapper(identita).to(payloadNuovaRichiesta);
			String payloadTicketToCreate = new JsonMapper().toJson(ticket);
			log.debug("createNewTicket", "payloadTicketToCreate %s", payloadTicketToCreate);
			// payloadTicketToCreate = "{\"article\":{\"body\":\"prova utente autenticato\"}"; 
			Response response = client.post(url, payloadTicketToCreate);
			log.debug("createNewTicket", "response %s", response.body().toString());
			if (!response.isSuccessful())
				throw ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.ERRORE_SERVIZIO_INTERNO, response.message())
						.title("Errore nella chiamata al servizio di NEXTCRM")
						.dettaglio(response.code() + "", response.message()).exception();
			ModelTicketNew newTicket = new ObjectMapper().readValue(response.body().string(), new TypeReference<ModelTicketNew>() {
			});
			nuovaRichiestaCreata =  new ModelRichiestaDettaglioMapper(identita, payloadNuovaRichiesta).from(newTicket);
		} catch (RESTException e) {
			throw e;
		} catch (Exception e) {
			log.error("createNewTicket", "exception %s", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata al servizio di NEXTCRM")
					.exception();
		}
		log.info("createNewTicket", "END");
		return nuovaRichiestaCreata;
	}
	
	private ModelMessaggio addAnArticleToTicket(String richiestaId, PayloadMessaggioNuovo payloadMessaggioNuovo, ModelTicket ticket)
			throws JsonGenerationException, JsonMappingException, IOException {
		log.info("addAnArticleToTicket", "BEGIN");
		ModelMessaggio messaggioCreato = null;
		try {
			log.debug("addAnArticleToTicket", "payloadMessaggioNuovo %s", payloadMessaggioNuovo);
			String url =new UrlBuilder(apiManagerUrlNextCrm).path(ConstantsNextCrmApi.ARTICLES, richiestaId).buildUrl();
			log.debug("addAnArticleToTicket", "url %s", url);
			String payloadForAddingAnArticle = buildPayloadForCreateAnArticle(payloadMessaggioNuovo, ticket);
			log.debug("addAnArticleToTicket", "payloadForAddingAnArticle %s", payloadForAddingAnArticle);
			Response response = client.post(url, payloadForAddingAnArticle);
			if (!response.isSuccessful())
				throw ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.ERRORE_SERVIZIO_INTERNO, response.message())
						.title("Errore nella chiamata al servizio di NEXTCRM")
						.dettaglio(response.code() + "", response.message()).exception();
			// messaggioCreato = transformArticleToMessaggio(response.body().string());
			ModelArticle article = new ObjectMapper().readValue(response.body().string(), new TypeReference<ModelArticle>() {
			});
			messaggioCreato = new ModelMessaggioMapper().from(article);			
			log.error("addAnArticleToTicket", "messaggioCreato %s", messaggioCreato);
		} catch (RESTException e) {
			throw e;
		} catch (Exception e) {
			log.error("addAnArticleToTicket", "exception %s", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata al servizio di NEXTCRM")
					.exception();
		}
		log.info("addAnArticleToTicket", "END");
		return messaggioCreato;		
	}
	
	

	public DocumentoAllegato getDocumentoAllegato(String citId, String richiestaId, String documentoId) {
		log.info("getDocumentoAllegato", "BEGIN");
		DocumentoAllegato documento = new DocumentoAllegato();
		// ottenere lista di messaggi
		// scorrere lista messaggi
		// ottenere messaggio by id
		// scorrere attachments
		// ottenere il primo attachment
		// popolare oggetto DocumentoAllegato
		try {
			
			String urlArticle = new UrlBuilder(apiManagerUrlNextCrm).path(ConstantsNextCrmApi.ARTICLES, richiestaId).buildUrl();
			log.debug("getDocumentoAllegato", "url article %s", urlArticle);
			Response responseArticle = client.get(urlArticle);
			if (!responseArticle.isSuccessful())
				throw ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.ERRORE_SERVIZIO_INTERNO, responseArticle.message())
					.title("Errore nella chiamata al servizio di NEXTCRM")
					.dettaglio(responseArticle.code() + "", responseArticle.message()).exception();	
			List<ModelArticle> articles = deserializeArticles(responseArticle.body().string());
			Integer articleId = null;
			ModelAttachments attachmentIdentified = null;
			for (ModelArticle article : articles) {
				List<ModelAttachments> attachments = article.getAttachments();
				for (ModelAttachments attachment : attachments) {
					if (attachment.getId() == Integer.parseInt(documentoId)) {
						articleId = article.getId();
						attachmentIdentified = attachment;
						break;
					}
				}
			}
			if (attachmentIdentified == null)
				throw  ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.ERRORE_LETTURA_DOCUMENTO, documentoId)
				.dettaglio("ECCEZIONE LETTURA DOCUMENTO", "documento non trovato")
				.exception();
			
			String urlAttachment = new UrlBuilder(apiManagerUrlNextCrm).path(ConstantsNextCrmApi.ATTACHMENTS, richiestaId, articleId, attachmentIdentified.getId()).buildUrl();
			log.debug("getDocumentoAllegato", "url article %s", urlAttachment);
			Response responseAttachment = client.get(urlAttachment);
			if (!responseAttachment.isSuccessful())
				throw ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.ERRORE_SERVIZIO_INTERNO, responseAttachment.message())
					.title("Errore nella chiamata al servizio di NEXTCRM")
					.dettaglio(responseAttachment.code() + "", responseAttachment.message()).exception();
			// String fileContentBase64 = responseAttachment.body().string();
			ModelAttachments attachment = attachmentIdentified;
			log.debug("getDocumentoAllegato", "attachment data %s", attachment);
			documento = new DocumentoAllegatoMapper(responseAttachment.body().bytes()).from(attachment);
        } catch (UnsupportedEncodingException e) {
        	throw  ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.ERRORE_LETTURA_DOCUMENTO, documentoId)
			.dettaglio("ECCEZIONE LETTURA DOCUMENTO", e.getMessage())
			.exception();        	
		} catch (RESTException e) {
			throw e;
		} catch (Exception e) {
			log.error("getDocumentoAllegato", "exception %s", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata al servizio di NEXTCRM")
					.exception();
		}
		log.info("getDocumentoAllegato", "END");
		return documento;
	}	
	
	
	private List<ModelTicket> deserializeListTicket(String jsonListTicket)
			throws JsonParseException, JsonMappingException, IOException {
		List<ModelTicket> tickets = new ArrayList<ModelTicket>();
		ObjectMapper mapper = new ObjectMapper();
		// log.debug("transformTicketToRichiestaLista", "jsonListTicket %s",
		// jsonListTicket);
		tickets = mapper.readValue(jsonListTicket, new TypeReference<List<ModelTicket>>() {
		});
		return tickets;
	}

	private ModelTicket deserializeTicket(String jsonTicket)
			throws JsonParseException, JsonMappingException, IOException {
		ModelTicket ticket = new ModelTicket();
		ObjectMapper mapper = new ObjectMapper();
		ticket = mapper.readValue(jsonTicket, new TypeReference<ModelTicket>() {
		});
		return ticket;
	}
	
	private List<ModelArticle> deserializeArticles(String jsonArticles)
			throws JsonParseException, JsonMappingException, IOException {
		List<ModelArticle> articles = new ArrayList<ModelArticle>();
		ObjectMapper mapper = new ObjectMapper();
		articles = mapper.readValue(jsonArticles, new TypeReference<List<ModelArticle>>() {
		});
		return articles;
	}

	private List<ModelRichiestaLista> buildElencoRichieste(List<ContainerTicketAndArticle> elencoContainerTicketAndArticle)
			throws JsonParseException, JsonMappingException, IOException {
		List<ModelRichiestaLista> elencoRichieste = new ArrayList<ModelRichiestaLista>();
		log.info("transformTicketToRichiestaLista", "ticket trovati %s", elencoContainerTicketAndArticle.size()+"");
		elencoContainerTicketAndArticle.forEach(container -> {
			log.info("transformTicketToRichiestaLista", "ticket id %s", container.getTicket());
			try {
				elencoRichieste.add(
					new ModelRichiestaListaMapper(container.getArticle(), container.getArticleAutomaticallyGenerated()).from(container.getTicket())
				);
			} catch (NullPointerException e) {
				log.error("transformTicketToRichiestaLista", "error %s", e);
			}
		});
		log.info("transformTicketToRichiestaLista", "richieste restituite %s", elencoRichieste.size());
		return elencoRichieste;
	}

	public void closeTicket(String citId, String richiestaId, ModelTicket ticket) {
		log.info("deleteTicket", "BEGIN");
		try {
			String url = new UrlBuilder(apiManagerUrlNextCrm).path(ConstantsNextCrmApi.TICKETS_ID, richiestaId).buildUrl();
			/*
			ModelTicketUpdate ticketToUpdate = mapperObjectApisanNextCrm
					.mapRichiestaAnnullataOnTicket(ConstantsStatusTicket.RISOLTO);
			*/
			ModelTicketUpdate ticketToUpdate = new ModelTicketUpdate();
			ticketToUpdate.setStateId(ConstantsStatusTicket.RISOLTO);
			ObjectMapper mapper = new ObjectMapper();
			mapper.setSerializationInclusion(Inclusion.NON_NULL);
			String jsonBodyPayloadTicketToUpdate = mapper.writeValueAsString(ticketToUpdate);
			log.debug("deleteTicket", "dump payload ticket to update %s", jsonBodyPayloadTicketToUpdate);
			Response response = client.put(url, jsonBodyPayloadTicketToUpdate);
			if (!response.isSuccessful())
				throw ErroreBuilder.from(ApisanAssistenzaErrorStatusCode.ERRORE_SERVIZIO_INTERNO, response.message())
						.title("Errore nella chiamata al servizio di NEXTCRM")
						.dettaglio(response.code() + "", response.message()).exception();
			
			PayloadMessaggioNuovo payloadMessaggioNuovo = new PayloadMessaggioNuovo();
			payloadMessaggioNuovo.setTesto(ConstantsArticle.TESTO_MESSAGGIO_CHIUSO_DA_UTENTE);
			addAnArticleToTicket(richiestaId, payloadMessaggioNuovo, ticket);
		} catch (RESTException e) {
			throw e;
		} catch (Exception e) {
			log.error("deleteTicket", "exception %s", e);
			throw ErroreBuilder.from(Status.INTERNAL_SERVER_ERROR).title("Errore nella chiamata al servizio di NEXTCRM")
					.exception();
		}

	}

	private String createFilterByEmail(final String email) {
		Map<String, Object> filter = new HashMap<>();
		String key = "email";
		String operator = "eq";
		Map<String, Object> expression = createExpressionFilter(operator, email);
		filter.put(key, expression);
		try {
			return new ObjectMapper().writeValueAsString(filter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	private String createFilterByCodiceFiscaleUser(final String codiceFiscale) {
		Map<String, Object> filter = new HashMap<>();
		String key = "codice_fiscale";
		String operator = "eq";
		Map<String, Object> expression = createExpressionFilter(operator, codiceFiscale);
		filter.put(key, expression);
		try {
			return new ObjectMapper().writeValueAsString(filter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	private String createFilterByMultipleParams(final String codiceFiscale, final String id, final Boolean archiviata,
			final String applicazione, final String parolaChiave, final String da, final String a) {
		log.info("createFilterByMultipleParams", "createFilterByMultipleParams: %s %s %s %s %s %s %s", codiceFiscale, id, archiviata,
				applicazione, parolaChiave, da, a);
		try {
			Map<String, Object> filter = new HashMap<>();
			createCustomerTicketCodiceFiscaleFilter(filter, codiceFiscale);
			createIdentifierFilter(filter, id);
			createArchiviataFilter(filter, archiviata);
			createApplicazioneFilter(filter, applicazione);
			createParolaChiaveFilter(filter, parolaChiave);
			createDaAFilter(filter, da, a);
			createOnlyTicketCustomerAutenticatedFilter(filter, ConstantsTicket.CITTADINO_AUTENTICATO.toString());
			return new ObjectMapper().writeValueAsString(filter);
		} catch (Exception e) {
			e.printStackTrace(); // TODO: manage this
		}
		return "";
	}

	private void createCustomerTicketCodiceFiscaleFilter(Map<String, Object> filter, final String codiceFiscale) {
		if (codiceFiscale == null)
			return;
		String key = "customer.codice_fiscale";
		String operator = "eq";
		Map<String, Object> expression = createExpressionFilter(operator, codiceFiscale);
		filter.put(key, expression);
	}

	private void createIdentifierFilter(Map<String, Object> filter, final String identifier) {
		if (identifier == null)
			return;
		String key = "id";
		String operator = "eq";
		Map<String, Object> expression = createExpressionFilter(operator, identifier);
		filter.put(key, expression);
	}

	private void createApplicazioneFilter(Map<String, Object> filter, String applicazione) {
		if (applicazione == null)
			return;
		String key = "asset_id";
		String operator = "eq";
		Map<String, Object> expression = createExpressionFilter(operator, applicazione);
		filter.put(key, expression);
	}

	private void createArchiviataFilter(Map<String, Object> filter, Boolean archiviata) {
		String key = "state_id";
		if (archiviata == null)
			return;
		if (archiviata == true) {
			String operator = "eq";
			Map<String, Object> expression = createExpressionFilter(operator, ConstantsStatusTicket.CHIUSO.toString());
			filter.put(key, expression);
		} else {
			String operator = "eq";
			StringBuilder builder = new StringBuilder();
			builder.append(ConstantsStatusTicket.NUOVO.toString());
			builder.append(" OR ");
			builder.append(ConstantsStatusTicket.APERTO.toString());
			builder.append(" OR ");
			builder.append(ConstantsStatusTicket.RISOLTO.toString());
			builder.append(" OR ");
			builder.append(ConstantsStatusTicket.IN_ATTESA_DI_RISPOSTA.toString());
			builder.append(" OR ");
			builder.append(ConstantsStatusTicket.IN_LAVORAZIONE_ESTERNA.toString());
			String valuesInOr = builder.toString();
			Map<String, Object> expression = createExpressionFilter(operator, valuesInOr);
			filter.put(key, expression);
		}
	}

	private void createParolaChiaveFilter(Map<String, Object> filter, String parolaChiave) {
		if (parolaChiave == null)
			return;
		String key = "article.body";
		String operator = "ci";
		Map<String, Object> expression = createExpressionFilter(operator, parolaChiave);
		filter.put(key, expression);		
	}

	private void createDaAFilter(Map<String, Object> filter, String da, String a) {
		if ((da == null) || (a == null))
			return;
	}
	
	private void createOnlyTicketCustomerAutenticatedFilter(Map<String, Object> filter, String flagCittadinoAutenticato) {
		if (flagCittadinoAutenticato == null)
			return;
		String key = "utente_riconosciuto";
		String operator = "eq";
		Map<String, Object> expression = createExpressionFilter(operator, flagCittadinoAutenticato);
		filter.put(key, expression);
	}	

	private Map<String, Object> createExpressionFilter(final String operator, final String value) {
		try {
			Map<String, Object> expression = new HashMap<>();
			expression.put(operator, value);
			return expression;
		} catch (Exception e) {
			e.printStackTrace(); // TODO: manage this
		}
		return null;
	}

	private String buildPayloadForCreateAnArticle(PayloadMessaggioNuovo payloadMessaggioNuovo, ModelTicket ticket) throws JsonGenerationException, JsonMappingException, IOException {
		ModelArticle article = new ModelArticle();
		article.setBody(payloadMessaggioNuovo.getTesto());
		article.setContentType(ConstantsArticle.CONTENT_TYPE);
		article.setTypeId(ConstantsArticle.TYPE_ID_API);
		article.setFrom(ticket.getNotificationEmail());
		article.setTicketId(ticket.getId());
		article.setSubject(null); // necessario per determinare tipologia autore articolo
		
		if (payloadMessaggioNuovo.getAllegato() != null) {
			ModelAttachments attach = new ModelDocumentoScritturaMapper().to(payloadMessaggioNuovo.getAllegato());
			List<ModelAttachments> attachments = new ArrayList<ModelAttachments>();
			attachments.add(attach);
			article.setAttachments(attachments);
		}
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Inclusion.NON_NULL);
		return mapper.writeValueAsString(article);
	}	

}
