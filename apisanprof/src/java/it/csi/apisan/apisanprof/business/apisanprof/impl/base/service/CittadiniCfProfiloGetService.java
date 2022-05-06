/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.apisanprof.impl.base.service;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Map;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanprof.business.apisanprof.impl.base.ProfRESTBaseService;
import it.csi.apisan.apisanprof.business.integration.dao.ApisanprofConfigurazioniDao;
import it.csi.apisan.apisanprof.business.mapper.ProfiloMapper;
import it.csi.apisan.apisanprof.dto.apisanprof.Dettaglio;
import it.csi.apisan.apisanprof.dto.apisanprof.Profilo;
import it.csi.apisan.apisanprof.exception.RestErroreException;
import it.csi.apisan.apisanprof.util.ApisanProfStatus;
import it.csi.apisan.apisanprof.util.Constants;
import it.csi.aura.auraws.services.central.anagrafefind.AnagrafeFindSoap;
import it.csi.aura.auraws.services.central.anagrafefind.DatiAnagrafici;
import it.csi.aura.auraws.services.central.anagrafefind.DatiAnagraficiMsg;
import it.csi.aura.auraws.services.central.anagrafefind.FindProfiliAnagraficiRequest;
import it.csi.aura.auraws.services.central.anagrafesanitaria.AnagrafeSanitariaSoap;
import it.csi.aura.auraws.services.central.anagrafesanitaria.SoggettoAuraMsg;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfProfiloGetService extends ProfRESTBaseService {
	
	@Autowired
	private AnagrafeFindSoap anagrafeFind;
	@Autowired
	private AnagrafeSanitariaSoap profiloSanitario;
	@Autowired
	ApisanprofConfigurazioniDao configurazioniDao;
	
	private String cf;
	
	
	public CittadiniCfProfiloGetService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String cf, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.cf = cf;
	}
	
	@Override
	protected Response execute() {
		checkCodiceFiscaleValido(cf);
		checkUtenteAutorizzato(cf);
		FindProfiliAnagraficiRequest request = new FindProfiliAnagraficiRequest();
		request.setCodiceFiscale(cf);
		request.setFlagDecesso("0");
		request.setIdEnte(Constants.ID_ENTE);
		
		int timeout = configurazioniDao.getValoreConfigurazione(Constants.MILLIS_TIMEOUT_RECEIVE_AURA);
		
		//chiamata distinguendo il cf di Yvonne
		String res = "";
		/*if(cf.equalsIgnoreCase("CRPYNN77A61B791K")) {
			try {				
				res = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/Yvonne.json")))
						   .lines().collect(Collectors.joining("\n"));
				Profilo citt = init(Profilo.class, res);
				
				return Response.ok(citt).type(MediaType.APPLICATION_JSON).build();
			} catch (Exception e) {				
				log.error("execute", "Errore nel caricare i file");
			} 			
		} else if(cf.equalsIgnoreCase("PNPPLA10L17L219U")){
			try {				
				res = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/Paolo.json")))
						   .lines().collect(Collectors.joining("\n"));
				Profilo citt = init(Profilo.class, res);
				
				return Response.ok(citt).type(MediaType.APPLICATION_JSON).build();
			} catch (Exception e) {				
				log.error("execute", "Errore nel caricare i file");
			} 						
		} else if(cf.equalsIgnoreCase("PNPMCL71R04L219Q")){
			try {				
				res = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/MarcoAlberto.json")))
						   .lines().collect(Collectors.joining("\n"));
				Profilo citt = init(Profilo.class, res);
				
				return Response.ok(citt).type(MediaType.APPLICATION_JSON).build();
			} catch (Exception e) {				
				log.error("execute", "Errore nel caricare i file");
			} 						
		}*/
		
		
		//Chiamata servizo Aura findProfiliAnagrafici
		Profilo result = null;
		//TODO DECOMMENTARE QUANDO RICHIEDONO DI INSERIRE TIMEOUT
		
		try {
			Map<String, Object> requestContext = ((BindingProvider)anagrafeFind).getRequestContext();
			requestContext.put("javax.xml.ws.client.receiveTimeout", timeout); // Timeout in millis
//		requestContext.put(BindingProviderProperties.CONNECT_TIMEOUT, 1000); // Timeout in millis
//TOGLIERE COMMENTO SOTTO
			
			DatiAnagraficiMsg resFPA = anagrafeFind.findProfiliAnagrafici(request);
			if(!"1".equals(resFPA.getHeader().getCodiceRitorno())) {
				throw toRestAuraAnagrafeFindException(resFPA.getFooter().getMessages().getMessage());
			}
			checkCondition(resFPA.getBody() != null, nessunProfilo("Response_findProfiliAnagrafici", "Body is null"));
			checkCondition(resFPA.getBody().getElencoProfili() != null, nessunProfilo("Response_findProfiliAnagrafici", "Elenco profili is null"));
			checkCondition(resFPA.getBody().getElencoProfili().getDatianagrafici() != null, nessunProfilo("Response_findProfiliAnagrafici", "Elenco profili vuoto"));
			
			result = null;
			//Per ogni profilo...
			for (DatiAnagrafici dati : resFPA.getBody().getElencoProfili().getDatianagrafici()) {
				
				//Chiamata servizo Aura getProfiloSanitarioNew
				//TODO DECOMMENTARE QUANDO RICHIEDONO DI INSERIRE TIMEOUT
						
				Map<String, Object> requestContextAnagrafe = ((BindingProvider)profiloSanitario).getRequestContext();
				requestContextAnagrafe.put("javax.xml.ws.client.receiveTimeout", timeout); // Timeout in millis
				
				SoggettoAuraMsg soggetto = profiloSanitario.getProfiloSanitario("" + dati.getIdProfiloAnagrafico());
				if(soggetto.getBody().getInfoAnag().getDatiPrimari().getStatoProfiloAnagrafico().equalsIgnoreCase("1")) {
					//devo mappare
					result = new ProfiloMapper().from(soggetto.getBody());
					break;
				}
			}
			
			if(result==null) {
				throw nessunProfilo("Response_findProfiliAnagrafici", "profilo sanitario non trovato.");
			}
			//TODO DECOMMENTARE QUANDO RICHIEDONO DI INSERIRE TIMEOUT
							
		} catch (WebServiceException e) {
			log.error("CittadiniCfProfiloGetService", "Eccezione nel richiamo di aura", e);
			if(e.getCause() instanceof SocketTimeoutException) {
				throw auraTimeOut("Response_findProfiliAnagrafici", "Timeout");
			}else
				throw e;	
		}
		
		return Response.ok(result).build();
	}
	
	private RestErroreException nessunProfilo(String chiave, String valore) {
		Dettaglio dettaglio = new Dettaglio();
		dettaglio.setChiave(chiave);
		dettaglio.setValore(valore);
		return ApisanProfStatus.RISORSA_NON_TROVATA.getRestException("Nessun profilo trovato.", Arrays.asList(dettaglio));
	}
	
	
	private RestErroreException auraTimeOut(String chiave, String valore) {
		Dettaglio dettaglio = new Dettaglio();
		dettaglio.setChiave(chiave);
		dettaglio.setValore(valore);
		return ApisanProfStatus.REQUEST_TIME_OUT.getRestException("Time out nella chiamata ad aura.", Arrays.asList(dettaglio));		
	}
	
	public  <T> T init(Class<T> clazz, String filter) {
		if(StringUtils.isBlank(filter)) {
			Constructor<T> constructor;
			try {
				constructor = clazz.getConstructor();
			} catch (NoSuchMethodException | SecurityException e) {
				throw new IllegalStateException("Impossibile ottenere il costruttore vuoto della classe: "+ clazz.getSimpleName());
			}
			try {
				return constructor.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				throw new IllegalStateException("Impossibile ottenere una nuova istanza della classe: "+ clazz.getSimpleName());
			}
		}
		ObjectMapper mapper = new ObjectMapper();
		T f;
		try {
			//mapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
			f = mapper.reader(clazz).readValue(filter.getBytes());
		} catch (IOException e) {
			throw new IllegalArgumentException("Filtro errato per " + clazz.getSimpleName() 
				+ ": " + filter + ". " + e.getMessage(), e);
		}
		return f;
	}
}
