/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ConsensoFse;
import it.csi.apisan.apisanfse.integration.consensoini.dma.StatoConsensiOUT;

public class ConsensoFseStatoConsensiOUTMapper extends BaseMapper<ConsensoFse, StatoConsensiOUT> {

	@Override
	public StatoConsensiOUT to(ConsensoFse source) {
		if(source == null) {
			return null;
		}
		StatoConsensiOUT dest = new StatoConsensiOUT();
		dest.setConsensoAlimentazione(new BooleanStringMapper().to(source.isConsensoAlimentazione()));
		dest.setConsensoConsultazione(new BooleanStringMapper().to(source.isConsensoConsultazione()));
		dest.setConsensoPregresso(new BooleanStringMapper().to(source.isConsensoPregresso()));
		dest.setIdentificativoInformativaConsensi(source.getIdentificativoInformativa());
		return dest;
	}

	@Override
	public ConsensoFse from(StatoConsensiOUT dest) {
		if(dest == null) {
			return null;
		}
		ConsensoFse source = new ConsensoFse();
		source.setConsensoAlimentazione(new BooleanStringMapper("true", "false").from(dest.getConsensoAlimentazione()));
		source.setConsensoConsultazione(new BooleanStringMapper("true", "false").from(dest.getConsensoConsultazione()));
		source.setConsensoPregresso(new BooleanStringMapper("true", "false").from(dest.getConsensoPregresso()));
		source.setIdentificativoInformativa(dest.getIdentificativoInformativaCorrente());
		return source;
	}
	
}
