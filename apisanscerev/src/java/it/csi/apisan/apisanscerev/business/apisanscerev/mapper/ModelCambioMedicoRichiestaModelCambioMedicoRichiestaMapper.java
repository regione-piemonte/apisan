/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiesta;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiesta.TipologiaEnum;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoMedicoAltraRegione;
import it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaStato;

public class ModelCambioMedicoRichiestaModelCambioMedicoRichiestaMapper extends BaseMapper<ModelCambioMedicoRichiesta, it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta to(ModelCambioMedicoRichiesta source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta();
		dest.setRinnovoAssistenza(source.isRinnovoAssistenza());
		//dest.setAllegati(new ModelCambioMedicoRichiestaAllegatiModelCambioMedicoRichiestaAllegatiMapper().to(source.getAllegati()));
		dest.setAllegati(new ModelDocumentoLetturaModelDocumentoLetturaMapper().toList(source.getAllegati()));
		dest.setAnnullabile(source.isAnnullabile());
		dest.setBozza(source.isBozza());
		dest.setChatOperatore(new ModelCambioRichiestaMedicoChatOperatoreMapper().toList(source.getChatOperatore()));
		dest.setCittadinanza(new ModelCittadinanzaModelCittadinanzaMapper().to(source.getCittadinanza()));
		dest.setDatiAggiuntivi(new ModelCambioMedicoRichiestaDatiAggiuntiviMapper().to(source.getDatiAggiuntivi()));
		dest.setDomicilio(new ModelCittadinoDomicilioModelCittadinoDomicilioMapper().to(source.getDomicilio()));
		dest.setId(source.getId());
		dest.setMedico(new ModelCittadinoInfoMedicoModelCittadinoInfoMedicoMapper().to(source.getMedico()));
		dest.setMedicoAltraRegione(new ModelCambioMedicoMedicoAltraRegioneMapper().to(source.getMedicoAltraRegione()));
		dest.setRecapiti(new ModelCittadinoRecapitiMapper().to(source.getRecapiti()));
		dest.setResidenza(new ModelCittadinoResidenzaModelCittadinoResidenzaMapper().to(source.getResidenza()));
		dest.setRettificabile(source.isRettificabile());
		dest.setStato(new ModelCambioMedicoRichiestaStatoMapper().to(source.getStato()));
		if(source.getTipologia() != null && !source.getTipologia().toString().isEmpty()) {
			it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta.TipologiaEnum enumTipologia = it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta.TipologiaEnum.valueOf(source.getTipologia().toString());
			dest.setTipologia(enumTipologia);
		}
		return dest;
	}

	@Override
	public ModelCambioMedicoRichiesta from(it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiesta dest) {
		if(dest == null) {
			return null;
		}
		ModelCambioMedicoRichiesta source = new ModelCambioMedicoRichiesta();
		source.setRinnovoAssistenza(dest.isRinnovoAssistenza());
		//source.setAllegati(new ModelCambioMedicoRichiestaAllegatiModelCambioMedicoRichiestaAllegatiMapper().from(dest.getAllegati()));
		source.setAllegati(new ModelDocumentoLetturaModelDocumentoLetturaMapper().fromList(dest.getAllegati()));
		source.setAnnullabile(dest.isAnnullabile());
		source.setBozza(dest.isBozza());
		source.setChatOperatore(new ModelCambioRichiestaMedicoChatOperatoreMapper().fromList(dest.getChatOperatore()));
		source.setCittadinanza(new ModelCittadinanzaModelCittadinanzaMapper().from(dest.getCittadinanza()));
		source.setDatiAggiuntivi(new ModelCambioMedicoRichiestaDatiAggiuntiviMapper().from(dest.getDatiAggiuntivi()));
		source.setDomicilio(new ModelCittadinoDomicilioModelCittadinoDomicilioMapper().from(dest.getDomicilio()));
		source.setId(dest.getId());
		source.setMedico(new ModelCittadinoInfoMedicoModelCittadinoInfoMedicoMapper().from(dest.getMedico()));
		source.setMedicoAltraRegione(new ModelCambioMedicoMedicoAltraRegioneMapper().from(dest.getMedicoAltraRegione()));
		source.setRecapiti(new ModelCittadinoRecapitiMapper().from(dest.getRecapiti()));
		source.setResidenza(new ModelCittadinoResidenzaModelCittadinoResidenzaMapper().from(dest.getResidenza()));
		source.setRettificabile(dest.isRettificabile());
		source.setStato(new ModelCambioMedicoRichiestaStatoMapper().from(dest.getStato()));
		try {
			if(dest.getTipologia() != null && ! dest.getTipologia().toString().isEmpty()) {
				TipologiaEnum enumTipologia = TipologiaEnum.valueOf(dest.getTipologia().toString());
				source.setTipologia(enumTipologia);
			}			
		}catch(IllegalArgumentException e) {
			
		}


		return source;
	}

}
