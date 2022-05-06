/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.integration.documenti.dmacc.Categoria;

public class StringCategoriaDocumentiMapper extends BaseMapper<String, Categoria>{

	@Override
	public Categoria to(String source) {
		if(source==null) {
			return null;
		}
		return Categoria.valueOf(source);
	}

	@Override
	public String from(Categoria dest) {
		if(dest==null) {
			return null;
		}
		return dest.name();
	}

}
