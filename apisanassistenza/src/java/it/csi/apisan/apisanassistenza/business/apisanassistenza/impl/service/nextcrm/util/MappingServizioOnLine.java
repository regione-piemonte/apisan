/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MappingServizioOnLine {
	
    private static final Map<Integer, String> mapServiceDescription;
    private static final Map<Integer, Integer> mapServiceAssetId;
    
    static {
        Map<Integer, String> aMap = new HashMap<>();
        aMap.put(1, "Scelta revoca web");   
        aMap.put(2, "AURA - Archivio Unico Regionale Assistiti");   
        aMap.put(3, "AURA - integrazione con OPESSAN");
        aMap.put(4, "AURA - integrazione con SANITX");   
        aMap.put(5, "Componente sovracup per i cittadini");   
        aMap.put(6, "Dematerializzazione buoni pazienti celiaci");   
        aMap.put(7, "DWH Extranet");
        aMap.put(8, "FSE - Documenti inseriti da te per cittadino");   
        aMap.put(9, "FSE - Taccuino per cittadino");   
        aMap.put(10, "FSE mobile per operatori sanitari");   
        aMap.put(11, "FSE per cittadino");   
        aMap.put(12, "FSE per operatori sanitari");   
        aMap.put(13, "FSE per punto assistito");   
        aMap.put(14, "Gestione appuntamenti screening tumori femminili (cittadini)");   
        aMap.put(15, "Gestore Pagamenti Aziendali (GPA)");   
        aMap.put(16, "La Mia Salute");   
        aMap.put(17, "Pagamento ticket via web");   
        aMap.put(18, "Ricetta elettronica");   
        aMap.put(19, "ROL mobile per cittadino");   
        aMap.put(20, "ROL per cittadino");   
        aMap.put(21, "ROL per punto assistito");   
        aMap.put(22, "Scelta revoca web"); 
        mapServiceDescription = Collections.unmodifiableMap(aMap);
        
        Map<Integer, Integer> aSecondMap = new HashMap<>();
        aSecondMap.put(1, 1);
        aSecondMap.put(2, 2);
        aSecondMap.put(3, 3);
        aSecondMap.put(4, 4);
        aSecondMap.put(5, 5);
        aSecondMap.put(6, 6);
        aSecondMap.put(7, 7);
        aSecondMap.put(8, 8);
        aSecondMap.put(9, 9);
        aSecondMap.put(10, 10);
        aSecondMap.put(11, 11);
        aSecondMap.put(12, 12);
        aSecondMap.put(13, 13);
        aSecondMap.put(14, 14);
        aSecondMap.put(15, 15);
        aSecondMap.put(16, 16);
        aSecondMap.put(17, 17);
        aSecondMap.put(18, 18);
        aSecondMap.put(19, 19);
        aSecondMap.put(20, 20);
        aSecondMap.put(21, 21);
        aSecondMap.put(22, 22);
        mapServiceAssetId = Collections.unmodifiableMap(aSecondMap);        
        
    }
    
    
    public static String getServiceDescription(Integer key) {
    	return mapServiceDescription.get(key);
    }
    
    public static Integer getServiceAssetId(Integer key) {
    	return mapServiceAssetId.get(key);
    }    

}
