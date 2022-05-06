/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria;
import it.csi.apisan.apisanfse.util.TipoOscuramento;

public class FseCodificheBaseMapperTest {

	
	public static void main(String[] args) {
		testEnumTipoOscuramento();
		test1();
		test2();
		test3();
	}

	
	private static void testEnumTipoOscuramento() {
		String doc = "DOCPER";
		TipoOscuramento tipo = TipoOscuramento.valueOf(doc);
		String descrTipo = tipo.toString();
		String codiceTipo =  tipo.name(); 
		
		String stampa = "codice, descr %s %s ";
		
		System.out.println( String.format(stampa, codiceTipo, descrTipo) );
	}
	
	private static void test3() {
	/*	AziendaSanitariaAziendaSanitariaMapper m = new AziendaSanitariaAziendaSanitariaMapper(null);
		
		AziendaSanitaria source = new AziendaSanitaria();
		source.setCodice("bla bla");
		source.setDescrizione("bla bla bla");
		source.setRiferimento("mio rif");
		it.csi.apisan.apisanfse.integration.dma.AziendaSanitaria result = m.to(source);
		
		System.out.println("result: "+ToStringBuilder.reflectionToString(result, ToStringStyle.MULTI_LINE_STYLE)); */
		
	}
	
	private static void test2() {
	/*	List<Codifica> listaCodifiche = new ArrayList<>();
		
		Codifica c1 = new Codifica();
		c1.setCodice("codice1");
		c1.setDescrizione("desc codice1");
		c1.setRiferimento("rif1");
		listaCodifiche.add(c1);
		
		AziendaSanitariaAziendaSanitariaMapper m = new AziendaSanitariaAziendaSanitariaMapper(listaCodifiche);
		
		it.csi.apisan.apisanfse.integration.dma.AziendaSanitaria dest = new it.csi.apisan.apisanfse.integration.dma.AziendaSanitaria();
		dest.setRiferimento("rif1");
		AziendaSanitaria result = m.from(dest);
		
		System.out.println("result: "+result);*/
		
	}


	private static void test1() {
		BeanWrapper bw = new BeanWrapperImpl(AziendaSanitaria.class);
		bw.setPropertyValue("codice", "c11");
		bw.setPropertyValue("descrizione", "centro undici");
		bw.setPropertyValue("riferimento", "rif c11");
		
		Object wrappedInstance = bw.getWrappedInstance();
		System.out.println(wrappedInstance);
	}
}
