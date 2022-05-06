/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelOrarioDisponibile;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelOrarioDisponibile.StatoCodiceEnum;

public class ModelOrarioDisponibileStringMapper extends BaseMapper<ModelOrarioDisponibile, String> {

	@Override
	public String to(ModelOrarioDisponibile source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelOrarioDisponibile from(String dest) {
		if(dest == null) {
			return null;
		}
		ModelOrarioDisponibile source = new ModelOrarioDisponibile();
		String[] orari = dest.split("-");
		try {
			source.setOra(new StringBuilder(orari[0]).insert(2, ":").toString() );
		}catch(Exception e) {
			
		}
		try {
			source.setOraFine(new StringBuilder(orari[1]).insert(2, ":").toString() );
		}catch(Exception e) {
			
		}
		try {
			source.setOraInizio(new StringBuilder(orari[2]).insert(2, ":").toString() );
		}catch(Exception e) {
			
		}
		try {
			source.setOraSlot(new StringBuilder(orari[3]).insert(2, ":").toString() );
		}catch(Exception e) {
			
		}
		try {			
			source.setProgressivo(orari[4].substring(0, (orari[4].length() -1)));
			source.setStatoCodice(StatoCodiceEnum.valueOf(orari[4].substring((orari[4].length() -1))  ));
		}catch(Exception e) {
			
		}
		return source;
	}

}
