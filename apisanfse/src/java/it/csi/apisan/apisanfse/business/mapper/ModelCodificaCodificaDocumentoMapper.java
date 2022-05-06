/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import  it.csi.apisan.apisanfse.dto.apisanfse.ModelCodifica;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.Codifica;

public class ModelCodificaCodificaDocumentoMapper<D extends Codifica> extends BaseMapper<ModelCodifica , D> {
		
	private D d;
	
	public ModelCodificaCodificaDocumentoMapper(D d) {		
		this.d=d;
	}	
	 

	@Override
	public D to(ModelCodifica source) {	
		if(source == null)
			return null;
		d.setCodice(source.getCodice());
		d.setDescrizione(source.getDescrizione());		
		return d;
	}

	@Override
	public ModelCodifica from(D dest) {	
		if(dest == null)
			return null;
		ModelCodifica modelCodifica = new ModelCodifica();
		modelCodifica.setCodice(dest.getCodice());
		modelCodifica.setDescrizione(dest.getDescrizione());
		return modelCodifica;
	}
}
