/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;

import it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria;
import it.csi.apisan.apisanfse.integration.dma.Codifica;

public class AziendaSanitariaAziendaSanitariaMapper extends FseCodificheBaseMapper<AziendaSanitaria, it.csi.apisan.apisanfse.integration.dma.AziendaSanitaria> {

	public AziendaSanitariaAziendaSanitariaMapper(List<Codifica> codifiche) {
		super(codifiche);
	}

}
