/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.business.apisancross.impl.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonProcessingException;
import org.springframework.web.client.RestTemplate;

import it.csi.apisan.apisancross.dto.apisancross.Nazione;

public class ListaNazioniServiceClientTest {

	public static void main(String[] args) throws Exception {
		getJSONDateTime();
		testDateParse();
		testParsedate2();
		//test1();
		//test2();
	}
	
	private static void test2() throws JsonProcessingException, IOException {
		ListaNazioniServiceClient lcsc = new ListaNazioniServiceClient();
		lcsc.setSmartDatanetBaseUrl("http://xxx.smartdatanet.it/api/");
		List<Nazione> entries = lcsc.getListaNazioni();
		System.out.println(">>> entries: " + entries);
		System.out.println(">>> Totale Nazioni ottenuti: " + entries.size());
	}


	private static void test1() {
		RestTemplate rt = new RestTemplate();
		String url = "http://xxx.smartdatanet.it/api/Limiti_ammin_1239/DataEntities?$format=json&$top=1000";
		String map = rt.getForObject(url, String.class);
		System.out.println("ListaNazioniCache map: " + map);
	}
	
	private static void getJSONDateTime() {
		//Date data = getJSONDateTime("/Date(-157766400000+0060)/");
		Date data = getJSONDateTime("/Date(599616000000+0060)/");
		
		System.out.println("data getJSONDateTime: " + data);
	}
	
	private static void testDateParse() {
		
		Date date1 = parseDate("/Date(-157766400000+0060)/");
		Pattern p = Pattern.compile("\\/Date\\(([-]?[0-9]+)\\+([0-9]+)\\)\\/");
	}
	
	private static void testParsedate2() {
		
		Date date1 = parseDate2("/Date(-157766400000+0060)/");
		Date date2 = parseDate("/Date(631065600000+0060)/");
		
		Date date = new Date(1293667200000L);
		
		System.out.println("data testDateParse2: " + date1);
		
		System.out.println("data testDateParse2: " + date2);
		
		
		/*System.out.println(ZoneOffset.getAvailableZoneIds());*/
		
	}
	/**
	 * 	// "d_start": "/Date(599616000000+0060)/",
        //"d_stop": "/Date(1293667200000+0060)/",
         * 
	 * @param s
	 * @return
	 */
	private static Date parseDate(String input) {
		//Pattern p = Pattern.compile("\\/Date\\(([0-9]+)\\+([0-9]+)\\)\\/");
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
	
	
	private static Date parseDate2(String input) {
		Pattern p = Pattern.compile("\\/Date\\(([-]?[0-9]+)\\+([0-9]+)\\)\\/");
		Matcher m = p.matcher(input);
		if (m.matches()) {
			String g1 = m.group(1);
			String g2 = m.group(2);
			
			//aggiunta Egidio
			Date dt = null;
			
			dt = new Date(Long.parseLong(g1));
			
			//fine aggiunta Egidio
			
			//LocalDateTime dt = LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(g1)), ZoneOffset.ofHours(1)) ;
			//return new Date(Long.parseLong(g1));
			return dt;
		} 
		return null;
	}
	
	private static Date getJSONDateTime(String jsonDate) {
		Pattern pt = Pattern.compile("\\/Date\\((\\d+)([\\-\\+]\\d+)\\)\\/");
		Matcher mt = pt.matcher(jsonDate);
		String smillis = null;
		String tz = null;
		if (mt.find() && mt.groupCount() == 2) {
			smillis = mt.group(1);
			tz = mt.group(2);
		}
		if (tz == null) {
			tz = "+0000";
		}
		if (tz.isEmpty())
			tz = "+0000";
		String sign = tz.substring(0, 1);
		int hh = Integer.parseInt(tz.substring(1, 3));
		int mm = Integer.parseInt(tz.substring(3, 5));
		long millis = Long.parseLong(smillis);
		//long offset_errato = hh  (60 ^ 2)  1000 + mm  60  1000;
		long offset=Long.parseLong(tz.substring(1))*60*1000;
		Date dt = null;
		if (sign.contains("+")) {
			dt = new Date(millis - offset);
		}
		else if (sign.contains("-")) {
			dt = new Date(millis + offset);
		}
		return dt;

	}
	
}
