/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelPaziente.SessoEnum;
import it.csi.apisan.apisanfse.integration.screening.dma.Sesso;

public class SessoEnumSessoScreeningMapper extends BaseMapper<SessoEnum, Sesso>{

	@Override
	public Sesso to(SessoEnum source) {
		if(source==null) {
			return null;
		}
		
		
		return Sesso.valueOf(source.name());
	}

	@Override
	public SessoEnum from(Sesso dest) {
		if(dest==null) {
			return null;
		}
		return SessoEnum.valueOf(dest.name());
	}

}
