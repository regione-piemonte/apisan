/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.service;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

import it.csi.apisan.apisancross.dto.apisancross.Comune;
import it.csi.apisan.apisancross.dto.apisancross.Nazione;
import it.csi.apisan.apisancross.dto.apisancross.Provincia;
import it.csi.apisan.apisancross.dto.apisancross.Regione;
import it.csi.apisan.apisancross.util.LogUtil;
import it.csi.apisan.apisancross.util.LogUtil.ToLog;

public class ListaComuniFactory {
	private static LogUtil log = new LogUtil(ListaComuniFactory.class);
	
	private Map<String, Object> jsonMap;
	private static List<String> formati = new ArrayList(Arrays.asList("dd/mm/yyyy", "yyyy-MM-dd"));
	
	/*private static ThreadLocal<SimpleDateFormat> sdf = new ThreadLocal<SimpleDateFormat>() {
		@Override
	    protected SimpleDateFormat initialValue() {
	        return new SimpleDateFormat("dd/mm/yyyy");
	    }
	};*/
	
	private static List<ThreadLocal<SimpleDateFormat>> sdf = new ArrayList( );
	
	/*	@Override
	    protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("dd/mm/yyyy");
	        //return new SimpleDateFormat("YYYY-MM-DD");
	    }
	};*/
	
	static {
		for (final String format : formati) {
			ThreadLocal<SimpleDateFormat> dateFormatTL = ThreadLocal.withInitial(() -> {return new SimpleDateFormat(format);});
			sdf.add(dateFormatTL);
		}
	}
		 
	public static ListaComuniFactory of(String json) {
		return new ListaComuniFactory(json);
	}
	
	public static ListaComuniFactory of(InputStream in) {
		return new ListaComuniFactory(in);
	}
	
	private ListaComuniFactory(String json) {
		jsonMap = toMap(json);
	}
	
	private ListaComuniFactory(InputStream in) {
		jsonMap = toMap(in);
	}
	

	public Integer getTotalCount() {
		@SuppressWarnings("unchecked")
		Map<String,Object> d = (Map<String, Object>) jsonMap.get("d");
		
		String count = (String)d.get("__count");
		
		log.debug("getTotalCount", "count: %s", count);
		return new Integer(count);
	}

	public List<Comune> getListaComuni() {
		@SuppressWarnings("unchecked")
		Map<String,Object> d = (Map<String, Object>) jsonMap.get("d");
		
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> results = (List<Map<String, Object>>) d.get("results");
		
		
		List<Comune> comuni = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		results.stream().forEach(c -> {
			sb.append(c.get("Desc_comune")).append(" ").append(c.get("D_start")).append(", ");
			Comune comune = newComune(c);
			comuni.add(comune);
			//TODO da togliere!!! solo per debug
			log.debug("getListaComuni ", "desc comune: %s - D_start -  %s - D_Stop %s - cap %s", (ToLog)()-> c.get("Desc_comune") , (ToLog)()-> c.get("D_start") , (ToLog)()-> c.get("D_stop") , (ToLog)()-> c.get("Cap"));
		});
		log.debug("getListaComuni", "Size: %s, Comuni: %s", (ToLog)()-> comuni.size(), (ToLog)()-> StringUtils.abbreviate(sb.toString(), 100));
		
		return comuni;
	}
	
	private static Comune newComune(Map<String, Object> c) {
		log.debug("newComune", " Istat_comune: " + (String)c.get("Istat_comune") + "Desc Comune: " + (String)c.get("Desc_comune"));
		Comune comune = new Comune();
		comune.setCodiceCatasto((String)c.get("Cod_catasto"));
		comune.setCodiceCap((String)c.get("Cap"));
		//per mail di Napoli/Pennone venerdi 11/10/2019
		comune.setCodiceIstat((String)c.get("Istat_comune"));
		//comune.setCodiceIstat((String)c.get("Id_comune"));
		comune.setDesc((String)c.get("Desc_comune"));
		comune.setDataInizioValidita(parseDate((String)c.get("D_start")));
		comune.setDataFineValidita(parseDate((String)c.get("D_stop")));
		
		Provincia provincia = new Provincia();
		provincia.setCodiceIstat((String)c.get("Istat_provincia"));
		provincia.setDesc((String)c.get("Desc_provincia"));
		provincia.setSigla((String)c.get("Sigla_prov"));
		comune.setProvincia(provincia);
		
		Regione regione = new Regione();
		regione.setCodiceIstat((String)c.get("Istat_regione"));
		regione.setDesc((String)c.get("Desc_regione"));
		provincia.setRegione(regione);
		
		Nazione nazione = new Nazione();
		nazione.setCodiceIstat((String)c.get("Cod_stato"));
		nazione.setDesc((String)c.get("Desc_stato"));
		regione.setNazione(nazione);
		
		return comune;
	}
	
	private static Date parseDate(String s) {
		return parseDate(s, null);
	}

	
	/*private static Date parseDate(String s, Date defaultDate) {
		if (s == null) {
			return null;
		}
		try {
			return sdf.get().parse(s);
		} catch (ParseException e) {
			return defaultDate;
		}

	}*/
	
	private static Date parseDate(String s, Date defaultDate) {
		if (s == null) {
			return null;
		}
		for (ThreadLocal<SimpleDateFormat> tl : sdf) {
			SimpleDateFormat sdf = tl.get();
			try {
				return sdf.parse(s);
			} catch (ParseException e) {
			}
		}
		return defaultDate;
	}       

	
	public static void main(String[] args) {
		
		String data = "2007-12-31";
		String data2 = "2008-01-01";
		
		System.out.println("data1 parse: "  + parseDate(data) + "data2 parse: " + parseDate(data2));
		
		SimpleDateFormat simple1 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			System.out.println("data1 parse: "  + simple1.parse(data) + "data2 parse: " + simple1.parse(data2)  );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
