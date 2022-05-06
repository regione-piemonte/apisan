/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioOrarioIntervallo;
import it.csi.apisan.apisanscerev.util.ApisanscerevUtil;

/*
 * Mapper che differisce dagli altri   
 * */
public class ModelOrarioAmbulatioStringMapper {
	
	String orari;
	public static final String DELIMITATORE_NOTE =  "###"; 
	public static final String DELIMITATORE_ORARIO = "$$$";
	public static final String SEPARATORE_ORARI = "-";
	
	public ModelOrarioAmbulatioStringMapper(String orari){
		this.orari = orari;
	}
	
	public List<ModelAmbulatorioOrarioIntervallo> getModelOrari(){
		List<ModelAmbulatorioOrarioIntervallo> listaOrari = new ArrayList<ModelAmbulatorioOrarioIntervallo>();
		StringTokenizer orariTkn =   new StringTokenizer(orari, DELIMITATORE_NOTE);
		while(orariTkn.hasMoreTokens() ) {
			StringTokenizer orariNote = new StringTokenizer(orariTkn.nextToken(), DELIMITATORE_ORARIO);
			ModelAmbulatorioOrarioIntervallo intervallo = new ModelAmbulatorioOrarioIntervallo();
			String orarichiusuraApertura = orariNote.hasMoreTokens()? orariNote.nextToken():"";
			if(StringUtils.containsAny(orarichiusuraApertura, SEPARATORE_ORARI)) {
				String[] aperturaChiusura = StringUtils.split(orarichiusuraApertura, SEPARATORE_ORARI);
				if(ApisanscerevUtil.verificaStringaValorizzata(aperturaChiusura[0])) {
					intervallo.setApertura(aperturaChiusura[0]);
				}
				if(ApisanscerevUtil.verificaStringaValorizzata((aperturaChiusura[1]))) {
					intervallo.setChiusura(aperturaChiusura[1]);
				}
				
			}else {
				if(ApisanscerevUtil.verificaStringaValorizzata((orarichiusuraApertura))) {
					intervallo.setApertura(orarichiusuraApertura);
				}
			}
			
			String note = orariNote.hasMoreTokens()? orariNote.nextToken() : null;
			if(note != null) {
				intervallo.setNote(note.trim());
			}
			
			
			listaOrari.add(intervallo);
		}
		
		return listaOrari;
	}
}
