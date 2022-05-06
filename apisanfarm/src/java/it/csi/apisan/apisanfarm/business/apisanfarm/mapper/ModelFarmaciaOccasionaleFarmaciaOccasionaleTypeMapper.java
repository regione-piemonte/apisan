/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.mapper;

import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelFarmacia;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelFarmaciaOccasionale;
import it.csi.dma.farmab.interfacews.msg.farab.FarmaciaOccasionaleType;
import it.csi.dma.farmab.interfacews.msg.farab.IndirizzoType;


public class ModelFarmaciaOccasionaleFarmaciaOccasionaleTypeMapper extends BaseMapper<ModelFarmaciaOccasionale, FarmaciaOccasionaleType> {

	@Override
	public FarmaciaOccasionaleType to(ModelFarmaciaOccasionale source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelFarmaciaOccasionale from(FarmaciaOccasionaleType dest) {
		if(dest == null) {
			return null;
		}
		ModelFarmaciaOccasionale source = new ModelFarmaciaOccasionale();
		source.setDataRichiesta(new DateTStringMapper(DateTStringMapper.FORMATOyyyyMMddHHmmss).from(dest.getDataRichiesta())  );
		source.setId(dest.getIdRich());
		ModelFarmacia farmacia = new ModelFarmacia();
		farmacia.setCodice(dest.getCodFarmacia());
		farmacia.setDescrizione(dest.getDescrFarmacia());
		IndirizzoType indirizzo = dest.getIndirizzoFarmacia();
		if(indirizzo != null) {
			farmacia.setComune(indirizzo.getComune());
			farmacia.setCap(indirizzo.getCap());
			farmacia.setIndirizzo(indirizzo.getIndirizzo());
			farmacia.setProvincia(indirizzo.getProvincia());
		}
		source.setFarmacia(farmacia);
		return source;
	}

}
