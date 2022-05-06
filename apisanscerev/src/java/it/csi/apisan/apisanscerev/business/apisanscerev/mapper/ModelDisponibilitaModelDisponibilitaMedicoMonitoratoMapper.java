/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelDisponibilita;
import it.csi.apisan.apisanscerev.dto.scerev.ModelDisponibilitaMedicoMonitorato;

public class ModelDisponibilitaModelDisponibilitaMedicoMonitoratoMapper extends BaseMapper<ModelDisponibilita, ModelDisponibilitaMedicoMonitorato> {

	@Override
	public ModelDisponibilitaMedicoMonitorato to(ModelDisponibilita source) {
		if(source == null) {
			return null;
		}
		ModelDisponibilitaMedicoMonitorato dest = new ModelDisponibilitaMedicoMonitorato();
		dest.setSelezionabile(source.isSelezionabile());
		dest.setSelezionabileAssistenzaTemporanea(source.isSelezionabileAssistenzaTemporanea());
		dest.setSelezionabileInfanzia(source.isSelezionabileInfanzia());
		dest.setSelezionabileRicongiungimentoFamiliare(source.isSelezionabileRicongiungimentoFamiliare());
		
		
		return dest;
	}

	@Override
	public ModelDisponibilita from(ModelDisponibilitaMedicoMonitorato dest) {
		// TODO Auto-generated method stub
		return null;
	}

}
