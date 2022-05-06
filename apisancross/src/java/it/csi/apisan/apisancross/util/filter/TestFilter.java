/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.util.filter;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import it.csi.apisan.apisancross.dto.apisancross.Comune;
import it.csi.apisan.apisancross.dto.apisancross.ComuneFilter;

//import com.fasterxml.jackson.core.JsonParseException;
//import com.fasterxml.jackson.databind.JsonMappingException;

public class TestFilter {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// D:\\workspaces\\workspaceoxigen\\apisancross\\src\\java\\it\csi\\apisan\\apisancross\\util\filter
		/*String filterParam = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisancross\\src\\java\\it\\csi\\apisan\\apisancross\\util\\filter\\filterParam.txt")), "UTF-8");
		
		
		Filter filter = new Filter(filterParam);
		
		
		System.out.println(filter);
		
		Clause clause = filter.getClause("scarpe");
		System.out.println("clause: "+ clause);
		
		
		Literal literal = clause.getLiteral(Operator.GT);
		System.out.println("literal: " + literal);
		
		System.out.println("value: " + literal.getValue()); 
		
		Clause clause2 = filter.getClause("scarpe2");
		System.out.println("scarpe2");//filter.getClause("scarpe").getLiteral(Operator.GT).getValue());*/
		
		
		String strDaDecodificare = "filter=%7B%22data_inizio_validita%22%3A%7B%22gte%22%3A%222020-04-01T15%3A04%3A15.854Z%22%7D%2C%22data_scadenza%22%3A%7B%22lte%22%3A%222021-03-31T15%3A04%3A15.854Z%22%7D%7D";
		
		System.out.println("stringa decodificata: " + URLDecoder.decode(strDaDecodificare));
		
		
		String filterComuni = "%7B\"desc\": %7B\"si\": \"CHAM\"%7D%7D";
		
		List<Comune> listaComuni = new ArrayList<Comune>();
		
		Comune comune1 = new Comune();
		comune1.setCodiceCatasto("B491");
		comune1.setDesc("CHAMOIS");
		
		Comune comune2 = new Comune();
		comune2.setCodiceCatasto("C595");
		comune2.setDesc("CHAMBAVE");		
		
		Comune comune3 = new Comune();
		comune3.setCodiceCatasto("C596");
		comune3.setDesc("CHAMPDEPRAZ");	
		
		Comune comune4 = new Comune();
		comune4.setCodiceCatasto("CXXXX");
		comune4.setDesc("TORINO");			
		
		listaComuni.add(comune1);
		listaComuni.add(comune2);
		listaComuni.add(comune3);
		listaComuni.add(comune4);
		
		
		
		//System.out.println("Stringa codificata: " + URLEncoder.encode(filter!=null?filter:"", "UTF-8"));
		
		System.out.println("*******************************************");
		String chiamata = "https://tst-srv-apisan.isan.csi.it/apisancross/api/v1/comuni?filter= {filter}";
		String filter = "{\"desc\":{\"eq\":\"ROMA\"}}";
		
		Map<String, String> params = new HashMap<>();
		params.put("filter", filter);
		
		RestTemplate rt = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Request-ID", "123456789");
		headers.add("X-Codice-Servizio", "TEST");
		
		String auth = "user1" + ":" + "mypass";
        String encodedAuth = org.jboss.resteasy.util.Base64.encodeBytes(auth.getBytes( ));
        String authHeader = "Basic " + new String( encodedAuth );
		
        headers.add("Authorization", authHeader); 
        HttpEntity<String> httpEntity = new HttpEntity<>(null, headers);
        
        ResponseEntity<String> re =  rt.exchange(chiamata, HttpMethod.GET, httpEntity, String.class, params);
        
        System.out.println(re.getBody());
        
        System.out.println("*******************************************");
		//String map = rt.getForObject(chiamata, String.class);
		
		
		//System.out.println("filterComuni: " + URLDecoder.decode(filterComuni));  
	/*	ComuneFilter f = FilterUtil.init(ComuneFilter.class, filterComuni);
		
		System.out.println("filterComuni si: " + f.getDesc().getSi());
		
		Stream<Comune> stream = listaComuni.stream();
		
		stream = stream.filter(c -> c.getDesc().toUpperCase().startsWith(f.getDesc().getSi().toUpperCase()) );
		
		stream.forEach( c -> System.out.println("Descrizione: " + c.getDesc()));*/

	}

}
