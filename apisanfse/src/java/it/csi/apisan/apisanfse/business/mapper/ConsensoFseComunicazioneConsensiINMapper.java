/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ConsensoFse;
import it.csi.apisan.apisanfse.integration.consensoini.dma.ComunicazioneConsensiIN;

public class ConsensoFseComunicazioneConsensiINMapper extends BaseMapper<ConsensoFse, ComunicazioneConsensiIN> {

	@Override
	public ComunicazioneConsensiIN to(ConsensoFse source) {
		if(source == null) {
			return null;
		}
		// TODO Auto-generated method stub
		ComunicazioneConsensiIN consensi = new ComunicazioneConsensiIN();
		/*consensi.setConsensoAlimentazione(new BooleanStringMapper().to(source.isConsensoAlimentazione()));
		consensi.setConsensoConsultazione(new BooleanStringMapper().to(source.isConsensoConsultazione()));
		consensi.setConsensoPregresso(new BooleanStringMapper().to(source.isConsensoPregresso()));*/
		
		consensi.setConsensoAlimentazione("" + source.isConsensoAlimentazione());
		consensi.setConsensoConsultazione(""+ source.isConsensoConsultazione());
		consensi.setConsensoPregresso("" + source.isConsensoPregresso());
		return consensi;
	}

	@Override
	public ConsensoFse from(ComunicazioneConsensiIN dest) {
		if(dest == null) {
			return null;
		}
		// TODO Auto-generated method stub
		ConsensoFse consenso = new ConsensoFse();
		consenso.setConsensoAlimentazione(new BooleanStringMapper().from(dest.getConsensoAlimentazione()));
		consenso.setConsensoConsultazione(new BooleanStringMapper().from(dest.getConsensoConsultazione()));
		consenso.setConsensoPregresso(new BooleanStringMapper().from(dest.getConsensoPregresso()));
		return consenso;
	}

}
