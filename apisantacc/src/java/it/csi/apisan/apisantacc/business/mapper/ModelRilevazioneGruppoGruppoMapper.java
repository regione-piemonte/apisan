/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazioneGruppo;
import it.csi.apisan.apisantacc.dto.apisantacc.RilevazioneGruppoCodice;
import it.csi.dma.dmaclbluc.Gruppo;

public class ModelRilevazioneGruppoGruppoMapper extends BaseMapper<ModelRilevazioneGruppo, Gruppo>{

	@Override
	public Gruppo to(ModelRilevazioneGruppo source) {
		if(source==null) {
			return null;
		}

		Gruppo gruppo = new Gruppo();
		if(source.getCodice()!=null) {
			gruppo.setCodice(source.getCodice());
		}
		gruppo.setDescrizione(source.getDescrizione());
		gruppo.setDescrizioneEstesa(source.getDescrizioneEstesa());
		
		return gruppo;
	}

	@Override
	public ModelRilevazioneGruppo from(Gruppo dest) {
		if(dest==null) {
			return null;
		}

		ModelRilevazioneGruppo modelRilevazioneGruppo = new ModelRilevazioneGruppo();	
		if(dest.getCodice()!=null) {
			modelRilevazioneGruppo.setCodice(dest.getCodice());
		}
		modelRilevazioneGruppo.setDescrizione(dest.getDescrizione());
		modelRilevazioneGruppo.setDescrizioneEstesa(dest.getDescrizioneEstesa());
		
		return modelRilevazioneGruppo;
	}

}
