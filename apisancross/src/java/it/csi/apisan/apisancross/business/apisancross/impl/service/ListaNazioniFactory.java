/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.service;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

import it.csi.apisan.apisancross.dto.apisancross.Nazione;
import it.csi.apisan.apisancross.util.LogUtil;
import it.csi.apisan.apisancross.util.LogUtil.ToLog;

public class ListaNazioniFactory {
	private static LogUtil log = new LogUtil(ListaNazioniFactory.class);
	
	private Map<String, Object> jsonMap;
	
	private static ThreadLocal<SimpleDateFormat> sdf = new ThreadLocal<SimpleDateFormat>() {
		@Override
	    protected SimpleDateFormat initialValue() {
	        return new SimpleDateFormat("YYYY-MM-DD");
	    }
	};
	
	public static ListaNazioniFactory of(String json) {
		return new ListaNazioniFactory(json);
	}
	
	public static ListaNazioniFactory of(InputStream in) {
		return new ListaNazioniFactory(in);
	}
	
	private ListaNazioniFactory(String json) {
		jsonMap = toMap(json);
	}
	
	private ListaNazioniFactory(InputStream in) {
		jsonMap = toMap(in);
	}
	

	public Integer getTotalCount() {
		@SuppressWarnings("unchecked")
		Map<String,Object> d = (Map<String, Object>) jsonMap.get("d");
		
		String count = (String)d.get("__count");
		
		log.debug("getTotalCount", "count: %s", count);
		return new Integer(count);
	}

	public List<Nazione> getListaNazioni() {
		@SuppressWarnings("unchecked")
		Map<String,Object> d = (Map<String, Object>) jsonMap.get("d");
		
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> results = (List<Map<String, Object>>) d.get("results");
		
		
		List<Nazione> nazioni = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		results.stream().forEach(c -> {
			sb.append(c.get("stato")).append(", ");
			Nazione comune = newNazione(c);
			nazioni.add(comune);
		});
		log.debug("getListaNazioni", "Size: %s, Nazioni: %s", (ToLog)()-> nazioni.size(), (ToLog)()-> StringUtils.abbreviate(sb.toString(), 100));
		
		return nazioni;
	}
	
	private static Nazione newNazione(Map<String, Object> c) {
		
		Nazione nazione = new Nazione();
		nazione.setCodiceIstat((String)c.get("codice"));
		nazione.setDesc((String)c.get("stato"));
		nazione.setTerritorio((String)c.get("territorio"));
		nazione.setDataInizioValidita(parseDate((String)c.get("d_start")));
		nazione.setDataFineValidita(parseDate((String)c.get("d_stop")));
		nazione.setContinente((String)c.get("continente"));
		
		return nazione;
	}
	
	/**
	 * Ottiene un {@link Date} a partire da una stringa in formato:
	 * "/Date(599616000000+0060)/".
	 * 
	 * Dal JSON del servizio arriva:
	 * //"d_start": "/Date(599616000000+0060)/", 
	 * //"d_stop": "/Date(1293667200000+0060)/",
	 * 
	 * @param s
	 * @return
	 */
	private static Date parseDate(String input) {
		if(StringUtils.isBlank(input)) {
			return null;
		}

		//Pattern p = Pattern.compile("\\/Date\\(([0-9]+)\\+([0-9]+)\\)\\/");
		//aggiunto - per date inferiori a 1970 non capisco il g2 
		Pattern p = Pattern.compile("\\/Date\\(([-]?[0-9]+)\\+([0-9]+)\\)\\/");
		Matcher m = p.matcher(input);
		if (m.matches()) {
			String g1 = m.group(1);
			String g2 = m.group(2);

			System.out.println("g1: " + g1 + " - g2: " + g2);
			
			//TODO come gestire g2? sembra un offset ma in che formato? per ora non ne tengo conto
			//LocalDateTime dt = LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(g1)), ZoneOffset.ofHours(g2)) ;
			return new Date(Long.parseLong(g1));

		} else {
			System.out.println("No match!!!!");
		}
		return null;
	}


	
	private static Map<String, Object> toMap(InputStream in) {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> result;
		try {
			result = mapper.reader(Map.class).readValue(in);
		} catch (IOException e) {
			throw new IllegalArgumentException("Contenuto JSON non valido. " + e.getMessage(), e);
		}
		return result;
	}
	
	private static Map<String, Object> toMap(String json) {
		ObjectMapper mapper = new ObjectMapper();
		Map<String,Object> result;
		try {
			result = mapper.reader(Map.class).readValue(json);
		} catch (IOException e) {
			throw new IllegalArgumentException("Contenuto JSON non valido. " + e.getMessage(), e);
		}
		return result;
	}

}
