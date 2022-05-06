/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import it.csi.apisan.apisanaut.dto.apisanaut.DocumentoFile;

public class DocumentoFileMapper extends BaseMapper<DocumentoFile, it.csi.deleghe.deleghebe.ws.model.DocumentoFile> {

	@Override
	public it.csi.deleghe.deleghebe.ws.model.DocumentoFile to(DocumentoFile source) {
		if(source == null) {
			return null;
		}
		it.csi.deleghe.deleghebe.ws.model.DocumentoFile result = new it.csi.deleghe.deleghebe.ws.model.DocumentoFile();
		result.setNome(source.getNome());
		result.setBase64File(source.getBaseFile());
		result.setDimensioneInBytes(source.getDimensioneInBytes());
		return result;
	}

	@Override
	public DocumentoFile from(it.csi.deleghe.deleghebe.ws.model.DocumentoFile dest) {
		if(dest == null) {
			return null;
		}
		DocumentoFile result = new DocumentoFile();
		result.setNome(dest.getNome());
		result.setBaseFile(dest.getBase64File());
		result.setDimensioneInBytes(dest.getDimensioneInBytes());
		return result;
	}

}
