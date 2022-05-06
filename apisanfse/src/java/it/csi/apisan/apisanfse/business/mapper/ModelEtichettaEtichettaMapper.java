/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.business.mapper.TipologiaEtichettaEnumTipoEtichettaMapper.TipologiaServizi;
import it.csi.apisan.apisanfse.dto.apisanfse.Etichettable;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichetta;

public class ModelEtichettaEtichettaMapper  extends BaseMapper<ModelEtichetta, Etichettable> {
	
	private Etichettable etichetta;
	private TipologiaServizi tipologiaServizi;
	
	public ModelEtichettaEtichettaMapper() {	
		this.tipologiaServizi=TipologiaServizi.ETICHETTE;
	}
	
	public ModelEtichettaEtichettaMapper(Etichettable etichetta,TipologiaServizi tipologiaServizi) {
		this.etichetta=etichetta;
		this.tipologiaServizi=tipologiaServizi;
	}

	@Override
	public Etichettable to(ModelEtichetta source) {
		if(source == null) {
			return null;
		}
		etichetta.setIdEtichetta(source.getId());
		etichetta.setTesto(source.getTesto());   		
		etichetta.setTipoEtichetta(new TipologiaEtichettaEnumTipoEtichettaMapper(tipologiaServizi).to(source.getTipologiaEtichetta()));
    	 
		return etichetta;
	}

	@Override
	public ModelEtichetta from(Etichettable dest) {
		if(dest == null) {
			return null;
		}
		ModelEtichetta modelEtichetta = new ModelEtichetta();
    	modelEtichetta.setId(dest.getIdEtichetta());
    	modelEtichetta.setTesto(dest.getTesto());        	
    	
    	modelEtichetta.setTipologiaEtichetta(new TipologiaEtichettaEnumTipoEtichettaMapper(tipologiaServizi).from(dest.getTipoEtichetta()));
    	    	
		return modelEtichetta;
	}
	
	
}
