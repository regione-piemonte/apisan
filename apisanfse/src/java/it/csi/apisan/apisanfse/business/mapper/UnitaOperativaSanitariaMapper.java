/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;

import it.csi.apisan.apisanfse.dto.apisanfse.UnitaOperativaSanitaria;
import it.csi.apisan.apisanfse.integration.dma.Codifica;

public class UnitaOperativaSanitariaMapper extends FseCodificheBaseMapper<UnitaOperativaSanitaria, it.csi.apisan.apisanfse.integration.dma.UnitaOperativaSanitaria> {

	public UnitaOperativaSanitariaMapper(List<Codifica> codifiche) {
		super(codifiche);
	}

}
