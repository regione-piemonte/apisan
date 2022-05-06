/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import it.csi.apisan.apisanaut.dto.apisanaut.Documento;

public class DocumentoMapper extends BaseMapper<Documento, it.csi.deleghe.deleghebe.ws.model.Documento> {

	@Override
	public it.csi.deleghe.deleghebe.ws.model.Documento to(Documento source) {
		if(source == null) {
			return null;
		}
		it.csi.deleghe.deleghebe.ws.model.Documento result = new it.csi.deleghe.deleghebe.ws.model.Documento();
		
		result.setId(source.getId());
		result.setDesc(source.getDesc());
		result.setDocumentoTipo(new DocumentoTipoMapper().to(source.getTipo()));
		
		result.setFile(new DocumentoFileMapper().to(source.getFile()));
		return result;
	}

	@Override
	public Documento from(it.csi.deleghe.deleghebe.ws.model.Documento dest) {
		if(dest == null) {
			return null;
		}
		Documento result = new Documento();
		result.setId(dest.getId());
		result.setDesc(dest.getDesc());
		result.setTipo(new DocumentoTipoMapper().from(dest.getDocumentoTipo()));
		
		result.setFile(new DocumentoFileMapper().from(dest.getFile()));
		return result;
	}

}
