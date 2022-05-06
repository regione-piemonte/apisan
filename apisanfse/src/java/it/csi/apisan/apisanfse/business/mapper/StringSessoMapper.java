/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.integration.dma.Sesso;

public class StringSessoMapper extends BaseMapper<String, Sesso>{

	@Override
	public Sesso to(String source) {
		if(source==null) {
			return null;
		}
	
		return Sesso.fromValue(source);
	}

	@Override
	public String from(Sesso dest) {
		if(dest==null) {
			return null;	
		}
		return dest.name();
	}

}
