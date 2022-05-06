/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.ModelDieta;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelNoteGenerali;
import it.csi.dma.dmaclbluc.DietaResponse;
import it.csi.dma.dmaclbluc.NotaGenerale;

public class ModelNoteGeneraliNotaGeneraleMapper extends BaseMapper<ModelNoteGenerali, NotaGenerale> {

	@Override
	public NotaGenerale to(ModelNoteGenerali source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelNoteGenerali from(NotaGenerale dest) {
		if(dest == null) {
			return null;
		}
		ModelNoteGenerali source = new ModelNoteGenerali();
		
		DateXMLGregorianCalendarMapper m=new DateXMLGregorianCalendarMapper();
		source.setDataCreazione(m.from(dest.getDataCreazione()));
		source.setDataAggiornamento(m.from(dest.getDataAggiornamento()));
		source.setStatoSalute(dest.getStatoSalute());
		source.setStileVita(dest.getStileVita());
		
		return source;
	}

}
