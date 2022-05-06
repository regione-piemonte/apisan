/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelAttachments;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelDocumentoScrittura;

public class ModelDocumentoScritturaMapper extends BaseMapper<ModelDocumentoScrittura, ModelAttachments> {

	@Override
	public ModelAttachments to(ModelDocumentoScrittura source) {
		if (source == null) {
			return null;
		}
		ModelAttachments modelAttachments = new ModelAttachments();
		modelAttachments.setFilename(source.getNomeFile());
		String[] tokens = source.getBase64().split(":|;|,");
		// [0] data
		// [1] application/pdf
		// [2] base64
		// [3] CgoKCmN...
		String mimeType = tokens[1];
		String base64 = tokens[3];
		modelAttachments.setData(base64);
		modelAttachments.setSize(base64.length());
		// ModelMimeType mtype = new ModelMimeType();
		// mtype.setMimeType("text/plain");
		// attachment.setPreferences(mtype);   // 
		modelAttachments.setMimeType(mimeType); // mapping con estensione
		return modelAttachments;
	}

	@Override
	public ModelDocumentoScrittura from(ModelAttachments dest) {
		if (dest == null) {
			return null;
		}
		return null;
	}



}
