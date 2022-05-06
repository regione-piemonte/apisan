/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.AccessoConsultazionePersonale;
import it.csi.apisan.apisanfse.dto.apisanfse.AccessoOperazionePersonale;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelResponseAccessi;
import it.csi.apisan.apisanfse.integration.paziente.dma.AccessoConsultazione;
import it.csi.apisan.apisanfse.integration.paziente.dma.AccessoOperazione;
import it.csi.apisan.apisanfse.integration.paziente.dma.TipoAccessoConsultazione;
import it.csi.apisan.apisanfse.integration.paziente.dma.TipoAccessoOperazione;
import it.csi.apisan.apisanfse.integration.paziente.dmaccbl.GetAccessi2Response;

public class ModelResponseAccessiGetAccessi2Response extends BaseMapper<ModelResponseAccessi, GetAccessi2Response> {

	@Override
	public GetAccessi2Response to(ModelResponseAccessi source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelResponseAccessi from(GetAccessi2Response dest) {
		if(dest == null) {
			return null;
		}
		ModelResponseAccessi source = new ModelResponseAccessi();
		
		for(AccessoConsultazione tmp : dest.getConsultazioni()) {
			source.getConsultazioni().add(new ModelAccessoAccessibleMapper<TipoAccessoConsultazione>().from(new AccessoConsultazionePersonale(tmp)) );
		}
		
		for(AccessoOperazione tmpOper :  dest.getOperazioni()) {
			source.getOperazioni().add(new ModelAccessoAccessibleMapper<TipoAccessoOperazione>().from(new AccessoOperazionePersonale(tmpOper)) );
			
		}
		
		return source;
	}

}
