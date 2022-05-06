/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;

import it.csi.apisan.apisanfse.dto.apisanfse.StrutturaSanitaria;
import it.csi.apisan.apisanfse.integration.dma.Codifica;

public class StrutturaSanitariaMapper extends FseCodificheBaseMapper<StrutturaSanitaria, it.csi.apisan.apisanfse.integration.dma.StrutturaSanitaria> {

	public StrutturaSanitariaMapper(List<Codifica> codifiche) {
		super(codifiche);
	}

}
