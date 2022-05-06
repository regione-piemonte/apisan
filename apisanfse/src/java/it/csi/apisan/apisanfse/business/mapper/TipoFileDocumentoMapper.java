/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;

import it.csi.apisan.apisanfse.dto.apisanfse.TipoFileDocumento;
import it.csi.apisan.apisanfse.integration.dma.Codifica;

public class TipoFileDocumentoMapper extends FseCodificheBaseMapper<TipoFileDocumento, it.csi.apisan.apisanfse.integration.dma.TipoFileDocumento> {

	public TipoFileDocumentoMapper(List<Codifica> codifiche) {
		super(codifiche);
	}

}
