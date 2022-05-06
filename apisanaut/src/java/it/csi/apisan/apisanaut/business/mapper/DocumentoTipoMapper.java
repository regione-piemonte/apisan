/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import it.csi.apisan.apisanaut.dto.apisanaut.DocumentoTipo;

public class DocumentoTipoMapper extends BaseMapper<DocumentoTipo, it.csi.deleghe.deleghebe.ws.model.DocumentoTipo> {

	@Override
	public it.csi.deleghe.deleghebe.ws.model.DocumentoTipo to(DocumentoTipo source) {
		if(source == null) {
			return null;
		}
		it.csi.deleghe.deleghebe.ws.model.DocumentoTipo result = new it.csi.deleghe.deleghebe.ws.model.DocumentoTipo();
		result.setCodice(source.getCodice());
		result.setDescrizione(source.getDescrizione());
		return result;
	}

	@Override
	public DocumentoTipo from(it.csi.deleghe.deleghebe.ws.model.DocumentoTipo dest) {
		if(dest == null) {
			return null;
		}
		DocumentoTipo result = new DocumentoTipo();
		result.setCodice(dest.getCodice());
		result.setDescrizione(dest.getDescrizione());
		return result;
	}

}
