/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelCodifica;
import it.csi.apisan.apisanfse.integration.paziente.dma.Codifica;

public class ModelCodificaCodificaPersonaleMapper<D extends Codifica> extends BaseMapper<ModelCodifica, D> {

	@Override
	public D to(ModelCodifica source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelCodifica from(D dest) {
		if(dest == null) {
			return null;
		}
		ModelCodifica source = new ModelCodifica();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		return source;
	}



}
