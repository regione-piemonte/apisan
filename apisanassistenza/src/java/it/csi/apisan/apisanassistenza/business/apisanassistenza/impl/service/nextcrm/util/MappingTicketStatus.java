/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MappingTicketStatus {
	
    private static final Map<Integer, String> mapStatusTicketDescription;
    
    static {
        Map<Integer, String> aMap = new HashMap<>();
        aMap.put(ConstantsStatusTicket.NUOVO, "Nuovo");   
        aMap.put(ConstantsStatusTicket.APERTO, "Aperto");   
        aMap.put(ConstantsStatusTicket.CHIUSO, "Chiuso");   
        aMap.put(ConstantsStatusTicket.RISOLTO, "Risolto");   
        aMap.put(ConstantsStatusTicket.IN_ATTESA_DI_RISPOSTA, "in attesa di risposta utente");   
        mapStatusTicketDescription = Collections.unmodifiableMap(aMap);
    }
    
    public static String getDescriptionById(Integer key) {
    	return mapStatusTicketDescription.get(key);
    }    

}
