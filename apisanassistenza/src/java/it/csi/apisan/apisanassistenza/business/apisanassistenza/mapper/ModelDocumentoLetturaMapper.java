/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper;

import java.util.List;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelAttachments;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelDocumentoLettura;

public class ModelDocumentoLetturaMapper extends BaseMapper<ModelDocumentoLettura, ModelAttachments> {

	@Override
	public ModelAttachments to(ModelDocumentoLettura source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelDocumentoLettura from(ModelAttachments dest) {
		if (dest == null) {
			return null;
		}
		ModelDocumentoLettura documento = new ModelDocumentoLettura();
		documento.setId(dest.getId().toString());
		documento.setDimensione(dest.getSize());
		documento.setNomeFile(dest.getFilename());
		return documento;
	}

}
