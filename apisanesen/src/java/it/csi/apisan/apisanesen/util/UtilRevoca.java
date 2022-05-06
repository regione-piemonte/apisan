/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.util;

import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class UtilRevoca {
	private String tipoRevoca;
	private String id;
	private String idTrasformato;
	private String dataInizio;
	
	
	public UtilRevoca(String idProvenienza) {
		this.id = idProvenienza;
		costruisciRevoca(idProvenienza);
	}
	
	
	private void costruisciRevoca(String id) {
		
		 List<String> tokenList = Collections.list(new StringTokenizer(id, "-")).stream()
	      .map(token -> (String) token)
	      .collect(Collectors.toList());
		
		 if(tokenList.size() ==1) {
			 this.tipoRevoca = TipoRevoca.AUTOCERTIFICATA.getTipoRevoca();
			 this.idTrasformato = "000-" + id;
		 }else if(tokenList.get(0).startsWith("010") || tokenList.get(0).equalsIgnoreCase("0") ) {
			 this.tipoRevoca = TipoRevoca.CERTIFICATA.getTipoRevoca();
			 idTrasformato = "002-" + id;
			 dataInizio = tokenList.get(2);
		 }else {
			 this.tipoRevoca = TipoRevoca.AUTOCERTIFICATA_SISTEMA_ESTERNO.getTipoRevoca();
			 idTrasformato = "001-" +  tokenList.get(0);
			 dataInizio = tokenList.get(2);
		 }
			 
			 
		 
		/*
		StringTokenizer str = new StringTokenizer(id, "-");
		String idRitorno = "";
		if(str.countTokens() == 1) {
			idTrasformato = "000-" + id;
		}else {
			String strPrimoToken = str.nextToken();
			if(strPrimoToken.startsWith("010")) {
				idTrasformato = "002-" + id;
				str.
			}else {
				idTrasformato = "001-" +  strPrimoToken;
			}
			
			//idRitorno = strPrimoToken.startsWith("010")?  "002-" + id :  "001-" +  strPrimoToken;
		}*/
		
		
	}
	
	public String getTipoRevoca() {
		return tipoRevoca;
	}
	public String getId() {
		return id;
	}
	public String getIdTrasformato() {
		return idTrasformato;
	}
	public String getDataInizio() {
		return dataInizio;
	}
	
	
	
}
