/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.integration.dma.SiNo;

public class BooleanSiNoMapper extends BaseMapper<Boolean, SiNo> {
	

	public BooleanSiNoMapper() {
		//Costruttore vuoto
	}
	

	@Override
	public SiNo to(Boolean source) {
		if(source==null) {
			return null;
		}
		
		return source.booleanValue()?SiNo.SI:SiNo.NO;
	}

	@Override
	public Boolean from(SiNo dest) {
		if(dest==null) {
			return null;
		}
		
		return SiNo.SI.equals(dest);
	}

}
