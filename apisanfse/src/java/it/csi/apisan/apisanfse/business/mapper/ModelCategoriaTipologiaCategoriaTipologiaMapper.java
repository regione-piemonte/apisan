/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelCategoriaTipologia;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.CategoriaTipologia;

public class ModelCategoriaTipologiaCategoriaTipologiaMapper extends BaseMapper<ModelCategoriaTipologia, CategoriaTipologia>{

	@Override
	public CategoriaTipologia to(ModelCategoriaTipologia source) {
		if(source == null) {
			return null;
		}
		
		CategoriaTipologia categoriaTipologia = new CategoriaTipologia();
		categoriaTipologia.setCategoria(new StringCategoriaDocumentiMapper().to(source.getCategoria()));
		categoriaTipologia.setTipologia(source.getTipologia());

		return categoriaTipologia;
	}

	@Override
	public ModelCategoriaTipologia from(CategoriaTipologia dest) {
		if(dest == null) {
			return null;
		}

		ModelCategoriaTipologia modelCategoriaTipologia = new ModelCategoriaTipologia();
		modelCategoriaTipologia.setCategoria(new StringCategoriaDocumentiMapper().from(dest.getCategoria()));
		modelCategoriaTipologia.setTipologia(dest.getTipologia());
		return modelCategoriaTipologia;
	}

}
