/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.core.Response.Status;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.BeanUtils;

import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoFilter;
import it.csi.apisan.apisanpag.dto.apisanpag.PraticaInCarrello;
import it.csi.apisan.apisanpag.dto.ptw.ListaTicket;
import it.csi.apisan.apisanpag.dto.ptw.Pratica;
import it.csi.apisan.apisanpag.dto.ptw.Prenotazione;
import it.csi.apisan.apisanpag.dto.ptw.Ticket;
import it.csi.apisan.apisanpag.exception.ErroreBuilder;
import it.csi.apisan.apisanpag.exception.RESTException;
import it.csi.apisan.apisanpag.util.ApisanPagStatus;

public class TestApisanpag {
	
	public static boolean checkCf(String cf) {
		int c;

		int setdisp[] = { 1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 2, 4, 18, 20, 11, 3, 6, 8, 12, 14, 16, 10, 22, 25, 24, 23 };
		if (cf.length() == 0)	return false;
		if (cf.length() != 16)	return false;
		String cf2 = cf.toUpperCase();
		for (int i = 0; i < 16; i++) {
			c = cf2.charAt(i);
			if (!(c >= '0' && c <= '9' || c >= 'A' && c <= 'Z')) return false;
		}
		int s = 0;
		for (int i = 1; i <= 13; i += 2) {
			c = cf2.charAt(i);
			if (c >= '0' && c <= '9')
				s = s + c - '0';
			else
				s = s + c - 'A';
		}
		for (int i = 0; i <= 14; i += 2) {
			c = cf2.charAt(i);
			if (c >= '0' && c <= '9')
				c = c - '0' + 'A';
			s = s + setdisp[c - 'A'];
		}
		
		return (s % 26 + 'A' == cf2.charAt(15));
	}
	
	
	private static Prenotazione newPrenotazione() {
		
		Prenotazione pre = new Prenotazione();
		pre.setAsrBeneficiaria("asr");
		pre.setCodiceServizio("codiceServizio");
		pre.setImportoDaPagare(new BigDecimal(2.10));
		pre.setDataCreazionePrenotazione("");
		pre.setImportoRimborsato(new BigDecimal(3.10));
		pre.setModalitaRimborso("modalitaRimborso");
		
		return pre;
	}
	
	private static Pratica newPratica(Prenotazione pre) {
		Pratica prat = new Pratica();
		prat.setCodiceVersamento("codiceVersamento");
		prat.setImportoPratica(new BigDecimal(10.10));
		prat.setPrenotazione(pre);
		prat.setPrestazioneErogata("prestazioneErogata");
		
		return prat;
	}
	
	public static String addZeroEnd(String importo) {
		try {
			String[] split = importo.split(",");
			while(split[1].length() < 2) {
				split[1] += "0";
			}
			return split[0] + "," + split[1] ;
		}catch(ArrayIndexOutOfBoundsException e) {
			return importo + ",00";
		}
		
	}
	
	public static void main(String[] args) {
		
		Pratica pratica1 = new Pratica();
		pratica1.setCodiceVersamento("codiceVersamento  pratica 1");
		Prenotazione prenotazionePratica1 = new Prenotazione();
		prenotazionePratica1.setCodiceServizio("codiceServiziopratica1");
		pratica1.setPrenotazione(prenotazionePratica1);
		
		Pratica pratica2 = new Pratica();
		BeanUtils.copyProperties(pratica1, pratica2); 
		pratica2.setCodiceVersamento("codiceVersamento  pratica 2");
		
		
		
		System.out.println("*************************************");
		System.out.println("pratica1: " + pratica1.getCodiceVersamento() + " pratica1 codiceservizioprenotazione: " + pratica1.getPrenotazione().getCodiceServizio()  
				+ " pratica2: " + pratica2.getCodiceVersamento() + "pratica2 codiceservizioprenotazione:: " + pratica2.getPrenotazione().getCodiceServizio());
		System.out.println("*************************************");
		
		
		String add = "1,0";
		System.out.println("add: " + addZeroEnd(add));
		
		String add2 = "1";
		System.out.println("add2: " + addZeroEnd(add2));
		
		String add3 = "1,00";
		System.out.println("add3: " + addZeroEnd(add3));		
		
		
		String strNull = null;
		String strBlank = "";
		String strSpace = "  ";
		String notNull = "abc";
		
		
		String provaSplit = "OSPEDALE MARTINI|VIA TOFANE 71 TORINO";
		String[] split =  provaSplit.split("|");
		System.out.println("Split1: " + split[0]);
		System.out.println("Split2: " + split[1]);
		
		StringTokenizer split2 =  new StringTokenizer(provaSplit, "|");
		System.out.println(" Token1: " + split2.nextToken());
		System.out.println(" Token2: " + split2.nextToken());
		
		
		
		System.out.println("strNull: " + StringUtils.isNotBlank(strNull)); 
		System.out.println("strBlank: " + StringUtils.isNotBlank(strBlank));
		System.out.println("strSpace: " + StringUtils.isNotBlank(strSpace));
		System.out.println("notNull: " + StringUtils.isNotBlank(notNull));
		
		
		String provaDouble = "10,20";
		
		Double db = Double.parseDouble(provaDouble);
		
		System.out.println("db: " + db);
		
		String ipAddress = "192.192.192";
		ipAddress = StringUtils.contains(ipAddress, ",")?  ipAddress.substring(0, ipAddress.indexOf(",")): ipAddress;
		
		
		String ipAddress2 = "192.192.192, 198.198.198";
		ipAddress2 = StringUtils.contains(ipAddress2, ",")?  ipAddress2.substring(0, ipAddress2.indexOf(",")): ipAddress2;
		
		String ipAddress3 = "";
		ipAddress3 = StringUtils.contains(ipAddress3, ",")?  ipAddress3.substring(0, ipAddress3.indexOf(",")): ipAddress3;
		
		
		System.out.println("ipAddress: " + ipAddress + "ipAddress2" + ipAddress2 + "ipAddress3" + ipAddress3);
		
		Float fl = new Float(36.5);
		System.out.println("Float fl: " + fl.doubleValue());
		BigDecimal bd  = BigDecimal.valueOf(fl);
		System.out.println("BigDecimal bd: " + bd.doubleValue());
		
		boolean superaticontrolli = checkCf("BRSXXX99C08Z129M");
		System.out.println("superati controlli: " + superaticontrolli);
		
		
		String prova = "Pratica giÃ  pagata o rimborsata (032)";
		
		System.out.println("String acontenuta: " + StringUtils.containsIgnoreCase(prova,"(000)"));
		

		String provaPagamentoPagato;
		try {
			
			
			String prenotazione = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanpag\\docs\\listaRimborsi.json")), "UTF-8");
			System.out.println("prenotazione: " + prenotazione);
			ListaTicket pren = FilterUtil.init(ListaTicket.class, prenotazione);
			System.out.println("Codice versamento: " + pren.getListaTicket().get(0).getListaprenotazione().getListaPratica().get(0).getCodiceVersamento()); 
			
			String prenotazioneErrore = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanpag\\docs\\listaRimborsiErroreC.json")), "UTF-8");
			System.out.println("prenotazione: " + prenotazioneErrore);
			ListaTicket prenErrore = FilterUtil.init(ListaTicket.class, prenotazioneErrore);			
			System.out.println("prenErrore.getErrore().getCodice():" + prenErrore.getErrore().getCodice());
			
			String filter =  new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanpag\\docs\\pagamentofilter.json")), "UTF-8");
			PagamentoFilter filterPag = FilterUtil.init(PagamentoFilter.class, filter);
			provaPagamentoPagato = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanpag\\docs\\pagamentosanitario1.json")), "UTF-8");
			it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario pagamento =  init(it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario.class, provaPagamentoPagato);
			System.out.println("Stato: " + pagamento.getStato());
			List<it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario> lisat = new ArrayList();
			lisat.add(pagamento);
			
			Stream<it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario> stream =  lisat.stream();
			//stream.forEach(c -> System.out.println("ciclo prima di filter: stato: " + c.getStato() + " Numero pratica regionale: " + c.getNumeroPraticaRegionale() ) ); 
			
			//stream = stream.filter(c -> c.getStato() != null && StringUtils.containsIgnoreCase(c.getStato(),"(032)"));
			
			
			if(filterPag.getStato()!=null && filterPag.getStato().getEq()!=null) {
				stream = stream.filter(c -> c.getStato() != null && c.getStato().equals(filterPag.getStato().getEq()));
			}
			if(filterPag.getStato()!=null && filterPag.getStato().getC()!=null) {
				stream = stream.filter(c -> c.getStato() != null && c.getStato().contains(filterPag.getStato().getC()));
			}
			if(filterPag.getStato()!=null && filterPag.getStato().getCi()!=null) {
				System.out.println("Sono nel filtro dello stato ci");
				stream = stream.filter(c -> c.getStato() != null && StringUtils.containsIgnoreCase(c.getStato(),filterPag.getStato().getCi()));
			}
			
			System.out.println("Siaze: " + stream.collect(Collectors.toList()).size()); 
			//stream.forEach(c -> System.out.println("ciclo dopo di filter: stato: " + c.getStato() + " Numero pratica regionale: " + c.getNumeroPraticaRegionale() ) ); 
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
			/*String ritorno = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanpag\\docs\\pagamento_sanitario2.json")), "UTF-8");
			
		
			
			
			System.out.println("compare null: "+ BigDecimal.ZERO.compareTo(null));
			String pattern = "\\d{3}[A-Za-z]{1}\\d{11}";
			String nre = "010D04001361501";
			System.out.println("Pattern match: " + nre.matches(pattern));
			
			
			
			String paz = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanpag\\docs\\pagamento_sanitario.json")), "UTF-8");
			System.out.println("paz: " + paz);
			ObjectMapper mapper = new ObjectMapper();
			PagamentoSanitario paziente = init(PagamentoSanitario.class, paz) ; 
			
			String now = "15/06/1968";
			SimpleDateFormat sd = new SimpleDateFormat("dd/mm/yyyy");
			System.out.println("Data formattata: " + sd.parse(now));
	       
	        String numeroPraticaRegionale = "S30101000012349854589602750";
	        String idAsr = numeroPraticaRegionale.substring(1, 4);
	        System.out.println("idAsr: " + idAsr);*/
			
			//PROVA CHECKCONDITION
		
			String rispostaRicevuta;
/*			boolean superatiControlli = true;
			try {
				/*pagamentoBody = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanpag\\docs\\testPost\\UnPosCorretta.json")), "UTF-8");
				it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitarioBody body = init(it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitarioBody.class, pagamentoBody);
				checkPagamentoSanitarioBody(body);*/
				
				
				
/*				byte[] filePdf = Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanpag\\test\\filebase64"));
				byte[] filePdfDecoder = Base64.getDecoder().decode(filePdf);
				String file =  "D:\\workspaces\\workspaceoxigen\\apisanpag\\test\\filebase64.pdf";
				Path path = Paths.get(file);
				Files.write(path, filePdfDecoder);
				
				rispostaRicevuta = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanpag\\docs\\testPost\\rispostaRicevutaidricevuta2.json")), "UTF-8");
				
				
				
				it.csi.apisan.apisanpag.dto.ptw.RicevutaPagamento ricevuta = init(it.csi.apisan.apisanpag.dto.ptw.RicevutaPagamento.class, rispostaRicevuta);
				System.out.println("ok mandato pagamento: " + ricevuta.getIdMandatoPagamento());
				RicevutaPagamento ricevutaApisan = new RicevutaPagamentoMapper().from(ricevuta); 
				System.out.println("Id mandato pagamento ricevutaApisan: " + ricevutaApisan.getIdMandatoPagamento());
				System.out.println("***************************** Stringa dall'oggetto: ");
				
				System.out.println(getStringFromObject(ricevutaApisan));
				System.out.println("***************************** Fine Stringa dall'oggetto: ");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				superatiControlli = false;
				e.printStackTrace();
			}catch(RESTException e) {
				superatiControlli = false;
				e.printStackTrace();
			}
			
			System.out.println("superatiControlli: " + superatiControlli);*/
			
			
	    /*    try {	
	        	
	        	/*String date = "1971-07-01";
	        	SimpleDateFormat sdTo = new SimpleDateFormat("yyyy-MM-dd");
	        	Date data = sdTo.parse(date);
	        	
	        	SimpleDateFormat sdFrom = new SimpleDateFormat ("dd/MM/yyyy");
	        	
	        	System.out.println("Data formattata: " + sdFrom.format(data));*/
	        	
		    /*    String url = "http://tst-ptw-integrazione.isan.csi.it/ptwsrvrest/services/pagamento";
		        String ritornoPagamentoBody = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanpag\\docs\\pagamento_sanitario_body.json")), "UTF-8");
		        
	        	//provo prima con httppos
		        
		        //ora con resttemplate
		        
		        
		        PagamentoSanitarioBody body = init(PagamentoSanitarioBody.class, ritornoPagamentoBody);
		        System.out.println("email: " + body.getMail());
		        
		        //provo a richiamare il servizio
		        HttpHeaders headers = new HttpHeaders();
		        
		        RestTemplate rest = new RestTemplate();
		        HttpEntity<Object> entity = new HttpEntity<>(body, headers);
	        	
		        ResponseEntity<String> re = rest.exchange(url, HttpMethod.POST, entity, String.class);*/
	        	
	        	/*String url = "http://tst-ptw-integrazione.isan.csi.it/ptwsrvrest/services/pagamento-spontaneo";
		        String ritornoPagamentoBody = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanpag\\docs\\pagamento_spontaneo_body2.json")), "UTF-8");
		        
		        PagamentoSpontaneoBody bodyApisanpag = init(PagamentoSpontaneoBody.class, ritornoPagamentoBody);
		        
		        String jsonBody = getStringFromObject(bodyApisanpag);
		        System.out.println("jsonBody: " + jsonBody);
		        
		        it.csi.apisan.apisanpag.dto.ptw.PagamentoSpontaneoBody bodyPtw = new PagamentoSpontaneoBodyMapper().to(bodyApisanpag);
		        
		        String json = getStringFromObject(bodyPtw);
		        System.out.println("json: " + json);
		        
		        HttpHeaders headers = new HttpHeaders();
		        headers.add("X-Request-ID", "e0f636a0-8ff5-4461-a57a-87a70f852382");
		        headers.add("X-Codice-Servizio", "SANSOL");
		        headers.setContentType(MediaType.APPLICATION_JSON);
		        
		        headers.keySet().stream().forEach(c -> System.out.println("header: " + c + headers.get(c)));*/
		        
		      /*  for ( Iterator<Entry<String, List<String>>> iter = headers.entrySet().iterator(); iter.hasNext();) {
		        	iter.next()
		        }*/
		        
		     /*   RestTemplate rest = new RestTemplate();
		    
		        HttpEntity<String> entity = new HttpEntity<>(json, headers);
	        	
		        
		       ResponseEntity<String> re = rest.exchange(url, HttpMethod.POST, entity, String.class);
		        
		        System.out.println("StatusCode: " + re.getStatusCode());
		        if(re.hasBody()) {
		        	System.out.println("body: " + re.getBody());
		        }*/
	        	
	     /*   } catch(Exception e) {
	        	e.printStackTrace();
	        }*/

	        
	       
	        
	        //LocalDateTime formatDateTime = LocalDateTime.parse(now, formatter);
			
			//paziente = mapper.reader(Cittadino.class).readValue(paz.getBytes());
			
			
		
		
	}
	
	
	private static void checkPagamentoSanitarioBody(it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitarioBody body) {
		checkCondition(body.getPraticheDaPagare() != null, "Inserire la pratica da pagare");
		checkCondition(!(!body.isPsp() && body.getPraticheDaPagare().size() > 1), "Inserire al massimo una pratica");
		//Verificare la condizione che ci sia o psp o pos
		checkCondition(!( body.getPos() != null && body.isPsp()), "Scegliere un solo metodo di pagamento");
		checkPratica(body.getPraticheDaPagare());
		
	}
	
	private static void checkPratica(List<PraticaInCarrello> pratiche) {
		
		pratiche.stream().forEach(c -> {
			checkCodiceFiscaleValido(c.getCodiceFiscale()  );
			checkCondition(c.getNumeroPraticaRegionale().length() == 27, "Numero pratica regionale non valido");
			checkCondition((c.getOpposizione730() == 0 || c.getOpposizione730() == 1), "Opposizione730 non corretto");
		});
		
		//pratiche.stream().forEach(c -> checkCodiceFiscaleValido(c.getCodiceFiscale()  ); 
		//checkCodiceFiscaleValido(pratica.getCodiceFiscale());
		//checkCondition(pratica.getNumeroPraticaRegionale().length() == 27, "Numero pratica regionale non valido");
	}
	
	protected static void checkCondition(boolean isOk, String message) {
		checkCondition(isOk, ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", message).exception());
	}
	
	protected static void checkCondition(boolean isOk, RESTException re) {
		if(!isOk) {
			throw re;
		}
	}
	
	protected static void checkCodiceFiscaleValido(String cf) {
		checkCondition(isCodiceFiscaleValido(cf), ErroreBuilder.from(ApisanPagStatus.CODICE_FISCALE_NON_VALIDO, cf).exception());
	}

	protected static boolean isCodiceFiscaleValido(String cf) {
		return (cf.length() == 16);
		//return cf.matches("[a-zA-Z]{6}\\d\\d[a-zA-Z]\\d\\d[a-zA-Z]\\d\\d\\d[a-zA-Z]");
	}
	public static String getStringFromObject(Object obj) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = null;
		try {
			jsonInString = mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonInString;
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
