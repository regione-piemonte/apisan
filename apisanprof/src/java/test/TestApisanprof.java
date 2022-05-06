/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

import it.csi.apisan.apisanprof.dto.apisanprof.Profilo;

public class TestApisanprof {

	public TestApisanprof() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		                     
		String filterParam;
		try {
			filterParam = new String(Files.readAllBytes(Paths.get("D:\\workspaces\\workspaceoxigen\\apisanprof\\conf\\web\\apisanprof\\rest\\WEB-INF\\classes\\Yvonne.json")), "UTF-8");
			Profilo citt = init(Profilo.class, filterParam);
			
			System.out.println(citt.getIdAura());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*		InputStream is = this.getClass().getResourceAsStream("/Yvonne.json");
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		filterParam = new String(buffer.toByteArray());*/
		

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
