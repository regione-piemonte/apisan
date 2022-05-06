/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazioneUnitaMisura;
import it.csi.dma.dmaclbluc.UnitaMisura;

public class ModelRilevazioneUnitaMisuraUnitaMisuraMapper extends BaseMapper<ModelRilevazioneUnitaMisura, UnitaMisura>{

	@Override
	public UnitaMisura to(ModelRilevazioneUnitaMisura source) {
		if(source==null) {
			return null;
		}

		UnitaMisura unitaMisura = new UnitaMisura();		
		unitaMisura.setCodice(source.getCodice());		
		unitaMisura.setDescrizione(source.getDescrizione());		
		
		return unitaMisura;
	}

	@Override
	public ModelRilevazioneUnitaMisura from(UnitaMisura dest) {
		if(dest==null) {
			return null;
		}

		ModelRilevazioneUnitaMisura modelRilevazioneUnitaMisura = new ModelRilevazioneUnitaMisura();	
		modelRilevazioneUnitaMisura.setCodice(dest.getCodice());		
		modelRilevazioneUnitaMisura.setDescrizione(dest.getDescrizione());		
		
		return modelRilevazioneUnitaMisura;
	}

}
