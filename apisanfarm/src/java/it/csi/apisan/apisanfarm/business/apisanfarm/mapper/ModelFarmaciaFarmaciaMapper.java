/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.mapper;

import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelFarmacia;
import it.csi.dma.farmab.interfacews.msg.getelencofarmacieabituali.Farmacia;
import it.csi.dma.farmab.interfacews.msg.getelencofarmacieabituali.IndirizzoType;

public class ModelFarmaciaFarmaciaMapper extends BaseMapper<ModelFarmacia, Farmacia> {

	@Override
	public Farmacia to(ModelFarmacia source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelFarmacia from(Farmacia dest) {
		ModelFarmacia source = new ModelFarmacia();
		source.setCodice(dest.getCodFarmacia());
		source.setDescrizione(dest.getDescrFarmacia());
		IndirizzoType indirizzo = getJaxbElement(dest.getIndirizzoFarmacia());
		if(indirizzo != null) {
			source.setComune(indirizzo.getComune());
			source.setCap(indirizzo.getCap());
			source.setIndirizzo(indirizzo.getIndirizzo());
			source.setProvincia(indirizzo.getProvincia());
		}
		
		
		return source;
	}

}
