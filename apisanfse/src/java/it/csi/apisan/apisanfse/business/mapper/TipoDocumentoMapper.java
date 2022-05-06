/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;

import it.csi.apisan.apisanfse.dto.apisanfse.TipoDocumento;
import it.csi.apisan.apisanfse.integration.dma.Codifica;

public class TipoDocumentoMapper extends FseCodificheBaseMapper<TipoDocumento, it.csi.apisan.apisanfse.integration.dma.TipoDocumento> {

	public TipoDocumentoMapper(List<Codifica> codifiche) {
		super(codifiche);
	}

}
