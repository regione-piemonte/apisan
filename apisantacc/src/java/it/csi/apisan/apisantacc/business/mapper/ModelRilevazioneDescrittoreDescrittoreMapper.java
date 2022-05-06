/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazioneDescrittore;
import it.csi.apisan.apisantacc.dto.apisantacc.RilevazioneDescrittoreCodice;
import it.csi.dma.dmaclbluc.Descrittore;

public class ModelRilevazioneDescrittoreDescrittoreMapper extends BaseMapper<ModelRilevazioneDescrittore, Descrittore>{

	@Override
	public Descrittore to(ModelRilevazioneDescrittore source) {
		if(source==null) {
			return null;
		}

		Descrittore descrittore = new Descrittore();
		if(source.getCodice() != null) {
			descrittore.setCodice(source.getCodice());
		}
		descrittore.setDescrizione(source.getDescrizione());
		descrittore.setDescrizioneEstesa(source.getDescrizioneEstesa());
		
		return descrittore;
	}

	@Override
	public ModelRilevazioneDescrittore from(Descrittore dest) {
		if(dest==null) {
			return null;
		}

		ModelRilevazioneDescrittore modelRilevazioneDescrittore = new ModelRilevazioneDescrittore();	
		if(dest.getCodice() != null) {
			modelRilevazioneDescrittore.setCodice(dest.getCodice());
		}
		modelRilevazioneDescrittore.setDescrizione(dest.getDescrizione());
		modelRilevazioneDescrittore.setDescrizioneEstesa(dest.getDescrizioneEstesa());
		
		return modelRilevazioneDescrittore;
	}

}
