/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoResidenza;

public class ModelCittadinoResidenzaModelCittadinoResidenzaMapper extends BaseMapper<ModelCittadinoResidenza, it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoResidenza> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoResidenza to(ModelCittadinoResidenza source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoResidenza dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoResidenza();
		dest.setCap(source.getCap());
		dest.setCivico(source.getCivico());
		dest.setCodComune(source.getCodComune());
		dest.setComune(source.getComune());
		dest.setIndirizzo(source.getIndirizzo());
		dest.setNazione(source.getNazione());
		dest.setRegione(source.getRegione());

		return dest;
	}

	@Override
	public ModelCittadinoResidenza from(it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoResidenza dest) {
		if(dest == null) {
			return null;
		}
		ModelCittadinoResidenza source = new ModelCittadinoResidenza();
		source.setCap(dest.getCap());
		source.setCivico(dest.getCivico());
		source.setCodComune(dest.getCodComune());
		source.setComune(dest.getComune());
		source.setIndirizzo(dest.getIndirizzo());
		source.setNazione(dest.getNazione());
		source.setRegione(dest.getRegione());
		
		return source;
		
	}

}
