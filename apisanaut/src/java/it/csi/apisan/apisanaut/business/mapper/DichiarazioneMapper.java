/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import java.util.ArrayList;

import it.csi.apisan.apisanaut.dto.apisanaut.Dichiarazione;
import it.csi.apisan.apisanaut.dto.apisanaut.DichiarazioneDettaglio;

public class DichiarazioneMapper extends BaseMapper<Dichiarazione, it.csi.deleghe.deleghebe.ws.model.Dichiarazione> {

	@Override
	public it.csi.deleghe.deleghebe.ws.model.Dichiarazione to(Dichiarazione source) {
		if(source==null) {
			return null;
		}
		it.csi.deleghe.deleghebe.ws.model.Dichiarazione result = new it.csi.deleghe.deleghebe.ws.model.Dichiarazione();
				
		result.setUuid(new UUIDMapper().from(source.getUuid()));
		
		result.setStato(new DichiarazioneStatoMapper().to(source.getStato()));
		result.setModo(new DichiarazioneModoMapper().to(source.getModo()));
		result.setTipo(new DichiarazioneTipoMapper().to(source.getTipo()));
		
		result.setRuoloOperazione(ruoloOperazioneCittadino());
		result.setCittadino(new CittadinoMapper().to(source.getCittadino()));
		
		result.setNumeroDocumento(source.getNumeroDocumento());
		result.setAutorita(source.getAutorita());
		result.setDataFineTutela(source.getDataFineTutela());
		result.setDataInizioTutela(source.getDataInizioTutela());
		
		result.setDettagli(new ArrayList<it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglio>());
		for(DichiarazioneDettaglio dettaglio : source.getDettagli()){
			result.getDettagli().add(new DichiarazioneDettaglioMapper().to(dettaglio));
		}
		
		return result;
	}

	@Override
	public Dichiarazione from(it.csi.deleghe.deleghebe.ws.model.Dichiarazione dest) {
		if(dest==null) {
			return null;
		}
		Dichiarazione result = new Dichiarazione();
		
		result.setUuid(new UUIDMapper().to(dest.getUuid()));
		
		result.setStato(new DichiarazioneStatoMapper().from(dest.getStato()));
		result.setModo(new DichiarazioneModoMapper().from(dest.getModo()));
		result.setTipo(new DichiarazioneTipoMapper().from(dest.getTipo()));
		
		result.setCittadino(new CittadinoMapper().from(dest.getCittadino()));
		
		result.setNumeroDocumento(dest.getNumeroDocumento());
		result.setAutorita(dest.getAutorita());
		result.setDataFineTutela(dest.getDataFineTutela());
		result.setDataInizioTutela(dest.getDataInizioTutela());
		
		result.setDettagli(new ArrayList<DichiarazioneDettaglio>());
		for(it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglio dettaglio : dest.getDettagli()){
			result.getDettagli().add(new DichiarazioneDettaglioMapper().from(dettaglio));
		}
		
		return result;
	}

}
