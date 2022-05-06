/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Informativa;
import it.csi.apisan.apisanfse.integration.consensoini.dma.InformativaOUT;

public class InformativaInformativaMapper extends BaseMapper<Informativa, InformativaOUT> {

	@Override
	public InformativaOUT to(Informativa source) {
		if(source == null) {
			return null;
		}
		InformativaOUT result = new InformativaOUT();
		result.setIdentificativoInformativa(source.getIdentificativoInformativa());
		return result;
	}

	@Override
	public Informativa from(InformativaOUT dest) {
		if(dest == null) {
			return null;
		}
		Informativa result = new Informativa();
		result.setIdentificativoInformativa(dest.getIdentificativoInformativa());
		return result;
	}

}
