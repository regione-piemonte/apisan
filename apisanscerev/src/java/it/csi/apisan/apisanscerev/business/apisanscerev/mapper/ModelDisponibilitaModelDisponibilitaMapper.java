/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelDisponibilita;

public class ModelDisponibilitaModelDisponibilitaMapper extends BaseMapper<ModelDisponibilita, it.csi.apisan.apisanscerev.dto.scerev.ModelDisponibilita> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelDisponibilita to(ModelDisponibilita source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelDisponibilita dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelDisponibilita();
		
		dest.setMonitorabile(source.isMonitorabile());
		dest.setSelezionabile(source.isSelezionabile());
		dest.setSelezionabileAssistenzaTemporanea(source.isSelezionabileAssistenzaTemporanea());
		dest.setSelezionabileInfanzia(source.isSelezionabileInfanzia());
		dest.setSelezionabileRicongiungimentoFamiliare(source.isSelezionabileRicongiungimentoFamiliare());
		
		
		return dest;
	}

	@Override
	public ModelDisponibilita from(it.csi.apisan.apisanscerev.dto.scerev.ModelDisponibilita dest) {
		if(dest == null) {
			return null;
		}
		ModelDisponibilita source = new ModelDisponibilita();
		
		source.setMonitorabile(dest.isMonitorabile());
		source.setSelezionabile(dest.isSelezionabile());
		source.setSelezionabileAssistenzaTemporanea(dest.isSelezionabileAssistenzaTemporanea());
		source.setSelezionabileInfanzia(dest.isSelezionabileInfanzia());
		source.setSelezionabileRicongiungimentoFamiliare(dest.isSelezionabileRicongiungimentoFamiliare());
		
		return source;
	}

}
