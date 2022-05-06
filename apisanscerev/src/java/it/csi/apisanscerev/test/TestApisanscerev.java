/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisanscerev.test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.DateTStringMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelOrarioAmbulatioStringMapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCodifica;
import it.csi.apisan.apisanscerev.dto.loccsi.Feature;
import it.csi.apisan.apisanscerev.dto.loccsi.FeatureCollection;
import it.csi.apisan.apisanscerev.dto.loccsi.Loccsi;
import it.csi.apisan.apisanscerev.dto.loccsi.Propertie;
import it.csi.apisan.apisanscerev.util.ScerevConstants;
import it.csi.apisan.apisanscerev.util.rest.ResponseService;
import it.csi.apisan.apisanscerev.util.rest.UrlLoccsiBuilder;


public class TestApisanscerev {
	
	
	
	
	private static boolean checkCoordinate(String longitudine, String latitudine, BigDecimal distanza) {
		return (!StringUtils.isEmpty(longitudine) && ! StringUtils.isEmpty(latitudine) && distanza != null);
	}
	
	private static UrlLoccsiBuilder aggiungiTipologiaSesso(UrlLoccsiBuilder urlBuilder, String tipologia, String sesso) {
		if(tipologia != null) {
			urlBuilder = urlBuilder.query(ScerevConstants.MAP_FILTRI.get(tipologia));
		}
		if(sesso != null) {
			urlBuilder = urlBuilder.query(ScerevConstants.MAP_FILTRI.get(sesso));
		}
		return urlBuilder;
	}	
	
	
	private static Date formatDate(String formato, String date) {
		 DateTimeFormatter fullDTF = DateTimeFormatter.ofPattern(formato);
		LocalDateTime ldt = LocalDateTime.parse(date, fullDTF);
		return Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant()); 
	}
			
	
	private static Date formatDate2(String formato, String date) {
		 DateTimeFormatter fullDTF = DateTimeFormatter.ofPattern(formato, Locale.UK);
		LocalDate ldt = LocalDate.parse(date, fullDTF);
		return Date.from(ldt.atStartOfDay(ZoneId.systemDefault()).toInstant()); 
	}	
	
	private static Date formatDate3( String date) {
		Locale l = Locale.UK ; 
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate( FormatStyle.MEDIUM).withLocale( l );
		LocalDate ldt = LocalDate.parse(date, f);
		return Date.from(ldt.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
	
	private static Date formatFunz( String date) throws java.text.ParseException {
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);
		return df.parse(date);
	}
	
	public static void main(String[] args) {
		
		try {
			
			
			//Formattazione ora 
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			String orario = "0159";
		
			
			
			DateTimeFormatter dataDF = DateTimeFormatter.ofPattern("ddMMyyyy");
			String dataValida = "12112020";
			
			try {
				System.out.println("Data:" + dataDF.parse(dataValida) );
			}catch(java.time.format.DateTimeParseException ex) {
				ex.printStackTrace();
			}
			
			
			DateTimeFormatter dt = DateTimeFormatter.ofPattern("HHmm");
			
			try {
				System.out.println("DateTimeFormatter: " + dt.parse(orario));
			} catch(java.time.format.DateTimeParseException ex) {
				ex.printStackTrace();
			}
			
			SimpleDateFormat dataProvaSdf = new SimpleDateFormat("dd-MM-yy");
			LocalDate dataProva = dataProvaSdf.parse("05-05-63").toInstant()
				      .atZone(ZoneId.systemDefault())
				      .toLocalDate();
			
			
			LocalDate now = LocalDate.now();
			DateTimeFormatter f = DateTimeFormatter.ofPattern( "dd-MMM-yy" , Locale.US ) ;
			
			System.out.println("DDDDDDDD: " +   dataProva.format( f));
			
			String provaData = "05-MAY-63";
			
			System.out.println("formatFunz: " + formatFunz(provaData));
			
			DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);
			
			System.out.println("DDDDDDDD: " + df.format(new Date())); 
			
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy"); 
			
			System.out.println("Data parse: " +   df.parse(provaData));
			
			System.out.println("sdf2: " + sdf2.format(df.parse(provaData)));
			
			System.out.println("Data: " + formatDate3( provaData));
			
			System.out.println("Data: " + formatDate2("dd-MMM-yy", provaData)); 
			
			
			
			
			
			String dest = "17-OCT-73";
			
			
			//String dest2 = "1950-10-01 00:00:00.0";
			//DateTimeFormatter date1 = DateTimeFormatter.ofPattern("dd-MMM-yy").withLocale(Locale.UK);
			
			
			
			DateTimeFormatter date1 =  new DateTimeFormatterBuilder()
		        .parseCaseInsensitive()
		        .appendPattern( "dd-MMM-yy" )
		        .toFormatter( Locale.UK ) ;
			//DateTimeFormatter fullDTF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.0");
			
			
			/*
			 *  DateTimeFormatter.ofLocalizedDate( FormatStyle.FULL )
	                     .withLocale( Locale.UK )
			 * 
			
			
			LocalDate.parse ( 
	    "13-oct-2005" , 
	    new DateTimeFormatterBuilder()
	        .parseCaseInsensitive()
	        .appendPattern( "dd-MMM-uuuu" )
	        .toFormatter( Locale.US ) 
	)
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
		
			try {
				System.out.println("Data dest: " + sdf.parse(dest));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			LocalDateTime ldt1 = LocalDateTime.parse(dest2, fullDTF);
			System.out.println("" + sdf.format(Date.from(ldt1.atZone(ZoneId.systemDefault()).toInstant())));
			*/
			
			
			LocalDateTime ldt = LocalDateTime.parse(dest, date1);
			System.out.println("Data format: " + Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant()));
			
			String loccsiMediciBaseurl = "http://10.138.172.5/oapi/v1/catalogs";
			String nomeMedico = null; //"ROSSI MAURO"; 
			String sesso  = null; //"M"; 
			String tipologia = null; //"PLS";
			String longitudine = "33"; 
			String latitudine = "666"; 
			BigDecimal distanza = new BigDecimal(5); 
			Integer limit = 20; 
			Integer offset = 0;
			UrlLoccsiBuilder urlBuilder;
			
			if(checkCoordinate(longitudine, latitudine, distanza)) {
				urlBuilder = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("medici").path(longitudine)
						.path(latitudine).path(distanza.toString()).query(nomeMedico);
				urlBuilder = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("medici").path("buffer").query(nomeMedico);
				urlBuilder = aggiungiTipologiaSesso(urlBuilder, tipologia, sesso).query("x", longitudine).query("y", latitudine).query("dist", distanza.toString());
						
				//.path(latitudine).path(distanza.toString()
			}else {
				urlBuilder = new UrlLoccsiBuilder(loccsiMediciBaseurl).path("medici")
				.query(nomeMedico);
				urlBuilder = aggiungiTipologiaSesso(urlBuilder, tipologia, sesso);
			}
			
			urlBuilder = urlBuilder.limitOffset("limit", limit).limitOffset("offset", offset);
			
			System.out.println("Url builder: " + urlBuilder.buildUrl());
			
			
			
			String progressivo = "25";
			
			System.out.println("Progressivo: " + Integer.parseInt(progressivo));
			
			String prog = "00L";
			
			System.out.println("primo numero: " + prog.substring(0, (prog.length() -1)));
			System.out.println("secondo numero: " + prog.substring((prog.length() -1)));
			
			//<Get_Dettaglio_Strutture_WEBOutParameters codiceDiRitorno="0" O_ELENCO="1*301*07*1505*DISPENSARIO DI IGIENE SOCIALE*L.GO DORA SAVONA*24*10100*TORINO;" O_NUM_ELEMENTI="1" O_COD_ERRORE="0"/>
			String mese = "12";
			String anno = "2020";
			
			int mm = Integer.parseInt(mese);
			System.out.println("mese:" + mm);
			
			boolean mesenonvalido =  (mm > 12 || mm < 0);
			
			System.out.println("mese non valido: " + mesenonvalido);
			
			
			String mese2 = "13";
			int mm2 = Integer.parseInt(mese2);
			
			boolean mesenonvalido2 =  (mm2 > 12 || mm2 < 0);
			
			System.out.println("mese non valido2: " + mesenonvalido2);
			
			String dest1 = "\"1*301*07*1505*DISPENSARIO DI IGIENE SOCIALE*L.GO DORA SAVONA*24*10100*TORINO";
			String[] unita = dest1.split("\\*");
			Arrays.asList(unita).stream().forEach( ( c -> System.out.println("stringa: " + c))) ;
			
			
			String pp = "1505";
			Integer prova = Integer.parseInt(pp);
			System.out.println("prova. " + prova);
			
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(1608854400000l);
			Date data = new Date(1608854400000l);
			SimpleDateFormat datasdf = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("Data: " + datasdf.format(data)); 
			
			ModelCodifica codifica = new ModelCodifica();
			codifica.setCodice("codice1");
			codifica.setDescrizione("descrizione1");
			
			
			ResponseService<ModelCodifica> resp = new ResponseService<ModelCodifica>(null, codifica);
			
			ModelCodifica codifica2 =  resp.getBody();
			System.out.println("codifica2: " + codifica2.getCodice());
			
			
			ModelCodifica codifica1 = new ModelCodifica();
			codifica1.setCodice("codice11");
			codifica1.setDescrizione("descrizione11");

			ModelCodifica codifica3 = new ModelCodifica();
			codifica3.setCodice("codice3");
			codifica3.setDescrizione("descrizione3");
			
			List<ModelCodifica> listaModelle = new ArrayList<ModelCodifica>();
			listaModelle.add(codifica1);
			listaModelle.add(codifica3);

			listaModelle.stream().forEach(c -> System.out.println("Sono nella listamodelle: " + c.getCodice() + c.getDescrizione()));
			
			//(new TypeReference<List<Disclaimer>>(){})
			ResponseService<List<ModelCodifica>> resplista = new ResponseService<List<ModelCodifica>>(null, listaModelle);
			
			List<ModelCodifica> listaModelleresp =  resplista.getBody(); 
			
			listaModelleresp.stream().forEach(c -> System.out.println("Sono nella lista: " + c.getCodice() + c.getDescrizione()));
			
			
			
			
			String dateT =  "1951-02-27 00:00:00.0";
			Date t  = new DateTStringMapper().from(dateT); 
			SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Formattata: " + simple.format(t));
			
			
			String orario1 = "09:00 - 12:00$$$SU APPUNTAMENTO###14:00 - 15:00$$$SU APPUNTAMENTO###15:00 - 16:00$$$ACCESSO LIBERO###";
			String orario2 = " $$$ ###";
			String orario3 = "08:30 - 12:00$$$ACCESSO LIBERO###";
			String orario4 = "16:00 - 19:00$$$011641136###";
			
			/*
			 * model orario1 apertura:09:00  chiusura:  12:00note: SU APPUNTAMENTO
model orario1 apertura:14:00  chiusura:  15:00note: SU APPUNTAMENTO
model orario1 apertura:15:00  chiusura:  16:00note: ACCESSO LIBERO
orario2 apertura: chiusura: nullnote:  
orario3 apertura:08:30 chiusura:  12:00note: ACCESSO LIBERO
orario4 apertura:16:00 chiusura:  19:00note: 011641136
			 * 
			 * */
			
			System.out.println("*******************************************************");
			
			
			ModelOrarioAmbulatioStringMapper modelorario1 =  new ModelOrarioAmbulatioStringMapper(orario1);
			
			ModelOrarioAmbulatioStringMapper modelorario2 =  new ModelOrarioAmbulatioStringMapper(orario2);
			
			ModelOrarioAmbulatioStringMapper modelorario3 =  new ModelOrarioAmbulatioStringMapper(orario3);
			
			ModelOrarioAmbulatioStringMapper modelorario4 =  new ModelOrarioAmbulatioStringMapper(orario4);
			
			modelorario1.getModelOrari().stream().forEach(c -> System.out.println("model orario1 apertura:" + c.getApertura() + " chiusura: " + c.getChiusura() + "note: " + c.getNote()));
			
			modelorario2.getModelOrari().stream().forEach(c -> System.out.println("orario2 apertura:" + c.getApertura() + "chiusura: " + c.getChiusura() + "note: " + c.getNote()));
			
			modelorario3.getModelOrari().stream().forEach(c -> System.out.println("orario3 apertura:" + c.getApertura() + "chiusura: " + c.getChiusura() + "note: " + c.getNote()));
			
			modelorario4.getModelOrari().stream().forEach(c -> System.out.println("orario4 apertura:" + c.getApertura() + "chiusura: " + c.getChiusura() + "note: " + c.getNote()));
			
			System.out.println("***********************************************************");
			
			
			
			StringTokenizer orari =   new StringTokenizer(orario1, "###");
			//orario1.split("$$$");
			
			/*while(orari.hasMoreTokens() ) {
				StringTokenizer orariNote = new StringTokenizer(orari.nextToken(), "$$$");
				String orarichiusuraApertura = orariNote.nextToken();
				System.out.println("orario1 ora: " + orariNote.nextToken());
				System.out.println("orario1 note: " + orariNote.nextToken());
			}
			
			
			
			StringTokenizer orari2 =  new StringTokenizer(orario2, "###");
			
			while(orari2.hasMoreElements()) {
				StringTokenizer orariNote = new StringTokenizer(orari2.nextToken(), "$$$");
				System.out.println("orario2 ora: " + orariNote.nextToken());
				System.out.println("orario2 note: " + orariNote.nextToken());
			}
			
			
			StringTokenizer orari3 = new StringTokenizer( orario3, "###");
			while(orari3.hasMoreElements()) {
				StringTokenizer orariNote = new StringTokenizer(orari3.nextToken(), "$$$");
				System.out.println("orario3 ora: " + orariNote.nextToken());
				System.out.println("orario3 note: " + orariNote.nextToken());
			}
			
			
			StringTokenizer orari4 = new StringTokenizer( orario4, "###");
			while(orari4.hasMoreElements()) {
				StringTokenizer orariNote = new StringTokenizer(orari4.nextToken(), "$$$");
				System.out.println("orario4 ora: " + orariNote.nextToken());
				System.out.println("orario4 note: " + orariNote.nextToken());
			}
			*/
			BigDecimal bb = new BigDecimal("7.6934");
			BigDecimal bb2 = new BigDecimal("45.0002");
			
			System.out.println("bb: " + bb);
			System.out.println("bb2: " + bb2);
			
			String propertie = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanscerev\\docs\\properties.json")), "UTF-8");
			Propertie prop = init(Propertie.class, propertie);
			System.out.println(prop.getCognomeMedico()); 
			
			String feature = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanscerev\\docs\\feature.json")), "UTF-8");
			Feature fea = init(Feature.class, feature);
			System.out.println(fea.getId());
			
			
			
			String featureCollection = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanscerev\\docs\\featureCollection.json")), "UTF-8");
			FeatureCollection feaColl = init(FeatureCollection.class, featureCollection);
			System.out.println(feaColl.getType());
			
			
			String loccsi = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanscerev\\docs\\rispostaloccsi.json")), "UTF-8");
			System.out.println("prenotazione: " + loccsi);
			Loccsi pren = init(Loccsi.class, loccsi);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//System.out.println("Codice versamento: " + pren.getListaTicket().get(0).getListaprenotazione().getListaPratica().get(0).getCodiceVersamento()); 
		

	}
	
	public static <T> T init(Class<T> clazz, String filter) {
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
