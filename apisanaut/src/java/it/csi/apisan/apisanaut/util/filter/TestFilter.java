/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.util.filter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import it.csi.apisan.apisanaut.dto.apisanaut.Cittadino;
import it.csi.apisan.apisanaut.dto.apisanaut.Dichiarazione;
import it.csi.apisan.apisanaut.dto.apisanaut.Documento;
import it.csi.apisan.apisanaut.dto.apisanaut.DocumentoFile;

public class TestFilter {
	
	
	
	
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
			f = mapper.reader(clazz).readValue(filter.getBytes());
		} catch (IOException e) {
			throw new IllegalArgumentException("Filtro errato per " + clazz.getSimpleName() 
				+ ": " + filter + ". " + e.getMessage(), e);
		}
		return f;
	}
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		
		/*Cittadino cittadino = new Cittadino();
		
		cittadino.setCodiceFiscale("LLNSRN61S48A337W");
		Documento doc = new Documento();
		DocumentoFile file = new DocumentoFile();
		file.setBase64File("ppppppppppppppp");
		file.setDimensioneInBytes(51867);
		file.setNome("apisanriscre-0.0.5.yaml");
		doc.setFile(file);
		cittadino.setDocumento(doc);
		
		
		Dichiarazione dic = new Dichiarazione();
		dic.setCittadino(cittadino);
		
		
		
		ObjectMapper objectMapper = new ObjectMapper();


		objectMapper.writeValue(
		    new FileOutputStream("D:\\workspaces\\workspaceoxigen\\apisanaut\\output-2.json"), dic);*/
		
		//String filterParam = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanaut\\dichiarazionepost.json")), "UTF-8");
		String filterParam = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanaut\\dichiarazione2.json")), "UTF-8");
		
		Dichiarazione citt = init(Dichiarazione.class, filterParam);
		
		System.out.println("cf: " + citt.getCittadino().getCodiceFiscale());
		
		System.out.println("bytes: " + citt.getCittadino().getDocumento().getFile().getDimensioneInBytes());
		
		System.out.println("base64: " + citt.getCittadino().getDocumento().getFile().getBaseFile());
		
		/*
		Integer a = new Integer (4);
		Integer b = new Integer (4);
		

		Integer c = new Integer(a +b);
		
		System.out.println("somma = " + c);
		
		String pass = "Nasipa!";
		
		System.out.println("pass base64: " + Base64.getUrlEncoder().encode(pass.getBytes()));
		
		String filterParam = new String(Files.readAllBytes(Paths.get("C:\\workspaces\\apisan\\testFilter\\src\\it\\csi\\apisan\\apisancross\\util\\filter\\filterParam.txt")), "UTF-8");
		
		
		
		Filter filter = new Filter(filterParam);
		
		
		System.out.println(filter);
		
		Clause clause = filter.getClause("scarpe");
		System.out.println("clause: "+ clause);
		
		Literal literal = clause.getLiteral(Operator.GT);
		System.out.println("literal: " + literal);
		
		System.out.println("value: " + literal.getValue()); //filter.getClause("scarpe").getLiteral(Operator.GT).getValue());
		
		Optional<Object> scarpeGt = filter.get("scarpe", Operator.GT);
		System.out.println("scarpeGt: " + scarpeGt);
		System.out.println("scarpeGt.get(): " + scarpeGt.get());
		
		Optional<String> scarpeLt = filter.getString("scarpe", Operator.IN);
		System.out.println("scarpeLt: " + scarpeLt);
		scarpeLt.ifPresent(v -> System.out.println("scarpeLt.get(): " +v));
*/
	}

}
