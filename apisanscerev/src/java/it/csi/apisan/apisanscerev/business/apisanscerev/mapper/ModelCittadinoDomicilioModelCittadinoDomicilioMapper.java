/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoDomicilio;

public class ModelCittadinoDomicilioModelCittadinoDomicilioMapper extends BaseMapper<ModelCittadinoDomicilio, it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoDomicilio> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoDomicilio to(ModelCittadinoDomicilio source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoDomicilio dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoDomicilio();
		dest.setCap(source.getCap());
		dest.setCivico(source.getCivico());
		dest.setCodComune(source.getCodComune());
		dest.setComune(source.getComune());
		dest.setIndirizzo(source.getIndirizzo());
		return dest;
	}

	@Override
	public ModelCittadinoDomicilio from(it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoDomicilio dest) {
		if(dest == null) {
			return null;
		}
		
		ModelCittadinoDomicilio source = new ModelCittadinoDomicilio();
		source.setCap(dest.getCap());
		source.setCivico(dest.getCivico());
		source.setCodComune(dest.getCodComune());
		source.setComune(dest.getComune());
		source.setIndirizzo(dest.getIndirizzo());
		
		return source;
	}

}
