/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioOrarioGiorno;
import it.csi.apisan.apisanscerev.util.GiornoSettimana;
import it.csi.apisan.apisanscerev.util.ScerevConstants;

public class ModelAmbulatorioOrarioGiornoStringMapper {
	GiornoSettimana giorno;
	String orario;
	
	public ModelAmbulatorioOrarioGiornoStringMapper(GiornoSettimana giorno, String orario) {
		this.giorno = giorno;
		this.orario = orario;
	}
	
	public ModelAmbulatorioOrarioGiorno getModelOrarioGiorno() {
		ModelAmbulatorioOrarioGiorno giornoOrario = new ModelAmbulatorioOrarioGiorno();
		giornoOrario.setNome(this.giorno.value());
		if(StringUtils.isNotEmpty(orario) && !orario.equalsIgnoreCase(ScerevConstants.INTERVALLO_ORARIO)) {
			giornoOrario.setIntervalli(new ModelOrarioAmbulatioStringMapper(orario).getModelOrari());
		}
		return giornoOrario;
	}
	
}
