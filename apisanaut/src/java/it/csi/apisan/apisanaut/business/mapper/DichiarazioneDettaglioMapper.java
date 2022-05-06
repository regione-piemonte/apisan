/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import it.csi.apisan.apisanaut.dto.apisanaut.DichiarazioneDettaglio;

public class DichiarazioneDettaglioMapper extends BaseMapper<DichiarazioneDettaglio, it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglio> {

	@Override
	public it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglio to(DichiarazioneDettaglio source) {
		if(source == null) {
			return null;
		}
		it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglio result = new it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglio();
		result.setUuid(new UUIDMapper().from(source.getUuid()));
		
		result.setCittadino1(new CittadinoMapper().to(source.getGenitoreTutoreCuratore()));
		result.setRuoloCittadino1(new DichiarazioneRuoloMapper().to(source.getRuoloGenitoreTutoreCuratore()));
		
		result.setCittadino2(new CittadinoMapper().to(source.getFiglioTutelatoCurato()));
		result.setRuoloCittadino2(new DichiarazioneRuoloMapper().to(source.getRuoloFiglioTutelatoCurato()));
		
		result.setStato(new DichiarazioneDettaglioStatoMapper().to(source.getStato()));
		
		result.setDocumento( new DocumentoMapper().to(source.getDocumentoFamiglia()));
		
		return result;
	}

	@Override
	public DichiarazioneDettaglio from(it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglio dest) {
		if(dest == null) {
			return null;
		}
		DichiarazioneDettaglio result = new DichiarazioneDettaglio();
		result.setUuid(new UUIDMapper().to(dest.getUuid()));
		
		result.setGenitoreTutoreCuratore(new CittadinoMapper().from(dest.getCittadino1()));
		result.setRuoloGenitoreTutoreCuratore(new DichiarazioneRuoloMapper().from(dest.getRuoloCittadino1()));
		
		result.setFiglioTutelatoCurato(new CittadinoMapper().from(dest.getCittadino2()));
		result.setRuoloFiglioTutelatoCurato(new DichiarazioneRuoloMapper().from(dest.getRuoloCittadino2()));
		
		result.setStato(new DichiarazioneDettaglioStatoMapper().from(dest.getStato()));
		
		result.setDocumentoFamiglia(new DocumentoMapper().from(dest.getDocumento()));
		
		return result;
	}

}
