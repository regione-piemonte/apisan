/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.util;

import java.util.ArrayList;
import java.util.List;

public class MappingCodiciErrore {
	
	private static volatile MappingCodiciErrore istanza = null; 
	private List<ErrorServer> listaErroriMappati;
	private List<Integer> listaErroriScrApp01DaNonMappare;
	
	private MappingCodiciErrore() {
		this.listaErroriMappati = new ArrayList<>();
		listaErroriMappati.add(new ErrorServer(2053, 404));
		listaErroriMappati.add(new ErrorServer(2061, 400));
		listaErroriMappati.add(new ErrorServer(2062, 404));
		listaErroriMappati.add(new ErrorServer(2063, 404));
		listaErroriMappati.add(new ErrorServer(2103, 404));
		listaErroriMappati.add(new ErrorServer(2104, 400));
		listaErroriMappati.add(new ErrorServer(2111, 404));
		listaErroriMappati.add(new ErrorServer(2112, 404));
		listaErroriMappati.add(new ErrorServer(2113, 404));
		listaErroriMappati.add(new ErrorServer(2114, 404));
		listaErroriMappati.add(new ErrorServer(2115, 400));
		listaErroriMappati.add(new ErrorServer(2116, 404));
		listaErroriMappati.add(new ErrorServer(2117, 400));
		listaErroriMappati.add(new ErrorServer(2118, 400));
		listaErroriMappati.add(new ErrorServer(2119, 400));
		listaErroriMappati.add(new ErrorServer(2120, 400));
		listaErroriMappati.add(new ErrorServer(2121, 400));
		listaErroriMappati.add(new ErrorServer(2122, 400));
		listaErroriMappati.add(new ErrorServer(2123, 404));
		listaErroriMappati.add(new ErrorServer(2133, 404));
		listaErroriMappati.add(new ErrorServer(2141, 404));
		listaErroriMappati.add(new ErrorServer(2142, 400));
		listaErroriMappati.add(new ErrorServer(2151, 404));
		listaErroriMappati.add(new ErrorServer(2024, 400));
		
		listaErroriScrApp01DaNonMappare = new ArrayList<>();
		listaErroriScrApp01DaNonMappare.add(2115);
		listaErroriScrApp01DaNonMappare.add(2116);
		listaErroriScrApp01DaNonMappare.add(2117);
		listaErroriScrApp01DaNonMappare.add(2118);
		listaErroriScrApp01DaNonMappare.add(2119);
		listaErroriScrApp01DaNonMappare.add(2120);
		listaErroriScrApp01DaNonMappare.add(2121);
		listaErroriScrApp01DaNonMappare.add(2122);
 
	}
	
	public static MappingCodiciErrore getInstance() {
		synchronized (MappingCodiciErrore.class) {
			if(istanza == null) {
				istanza = new MappingCodiciErrore();
			}
		}

		return istanza;
	}
	
	public ErrorServer getErrorServerFromCodice(int codice) {
		return listaErroriMappati.stream().filter(c -> c.getStatusCode()==codice ).findFirst().orElse(null);
		
	}
	
	
	public boolean codiceErroreScrApp01DaNonMappare(int error) {
		return listaErroriScrApp01DaNonMappare.stream().anyMatch(c -> c.intValue() == error); 
	}
	
	public List<Integer> getListaErroriScaApp01DaNonMappare(){
		return this.listaErroriScrApp01DaNonMappare;
	}
	
	public List<ErrorServer> getListaErrori(){
		return this.listaErroriMappati;
	}
}
