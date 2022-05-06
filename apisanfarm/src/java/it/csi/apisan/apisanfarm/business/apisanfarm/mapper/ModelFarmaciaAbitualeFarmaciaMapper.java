/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.mapper;

import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelFarmaciaAbituale;
import it.csi.dma.farmab.interfacews.msg.getelencofarmacieabituali.Farmacia;

public class ModelFarmaciaAbitualeFarmaciaMapper extends BaseMapper<ModelFarmaciaAbituale, Farmacia> {

	@Override
	public Farmacia to(ModelFarmaciaAbituale source) {
		
		return null;
	}

	@Override
	public ModelFarmaciaAbituale from(Farmacia dest) {
		ModelFarmaciaAbituale source = new ModelFarmaciaAbituale();
		source.setDataValiditaFine(new DateTStringMapper(DateTStringMapper.FORMATOyyyyMMddHHmmss).from(dest.getDataFineVal()) );
		source.setDataValiditaInizio(new DateTStringMapper(DateTStringMapper.FORMATOyyyyMMddHHmmss).from(dest.getDataInizioVal()));
		source.setId(dest.getId());
		source.setFarmacia(new ModelFarmaciaFarmaciaMapper().from(dest));
		
		return source;
	}

}
