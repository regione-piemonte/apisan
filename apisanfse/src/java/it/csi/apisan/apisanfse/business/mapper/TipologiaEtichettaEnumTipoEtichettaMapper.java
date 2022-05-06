/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.HashMap;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichetta.TipologiaEtichettaEnum;
import it.csi.apisan.apisanfse.integration.etichette.dma.TipoEtichetta;

public class TipologiaEtichettaEnumTipoEtichettaMapper  extends BaseMapper<TipologiaEtichettaEnum, Object>{
	
	HashMap<TipologiaEtichettaEnum, Object> tipoEtichettaToMap;	
	HashMap<Object, TipologiaEtichettaEnum> tipoEtichettaFromMap;
	
	public enum TipologiaServizi {
	    DOCUMENTI("DOCUMENTI"),
	    ETICHETTE("ETICHETTE");		
		
	    private String value;

	    TipologiaServizi(String value) {
	      this.value = value;
	    }
	
	    public String toString() {
	      return String.valueOf(value);
	    }
	  }
	
	public TipologiaEtichettaEnumTipoEtichettaMapper(TipologiaServizi tipologiaServizi){
		this.tipoEtichettaFromMap = new HashMap<Object, TipologiaEtichettaEnum>();		
		this.tipoEtichettaToMap =	new HashMap<TipologiaEtichettaEnum, Object>();
		
		tipoEtichettaFromMap.put(TipoEtichetta.ANATOMICA, TipologiaEtichettaEnum.ANATOMICA);
		tipoEtichettaFromMap.put(TipoEtichetta.PERSONALE, TipologiaEtichettaEnum.PERSONALE);
		
		tipoEtichettaFromMap.put(it.csi.apisan.apisanfse.integration.documenti.dma.TipoEtichetta.ANATOMICA, TipologiaEtichettaEnum.ANATOMICA);
		tipoEtichettaFromMap.put(it.csi.apisan.apisanfse.integration.documenti.dma.TipoEtichetta.PERSONALE, TipologiaEtichettaEnum.PERSONALE);

		switch (tipologiaServizi) {
			case ETICHETTE:
				tipoEtichettaToMap.put(TipologiaEtichettaEnum.ANATOMICA,TipoEtichetta.ANATOMICA);
				tipoEtichettaToMap.put(TipologiaEtichettaEnum.PERSONALE,TipoEtichetta.PERSONALE);
				break;
	
			case DOCUMENTI:
				tipoEtichettaToMap.put(TipologiaEtichettaEnum.ANATOMICA,it.csi.apisan.apisanfse.integration.documenti.dma.TipoEtichetta.ANATOMICA);
				tipoEtichettaToMap.put(TipologiaEtichettaEnum.PERSONALE,it.csi.apisan.apisanfse.integration.documenti.dma.TipoEtichetta.PERSONALE);
				break;
			default:
				tipoEtichettaToMap.put(TipologiaEtichettaEnum.ANATOMICA,TipoEtichetta.ANATOMICA);
				tipoEtichettaToMap.put(TipologiaEtichettaEnum.PERSONALE,TipoEtichetta.PERSONALE);
				break;
		}
		
	}
		 

	@Override
	public Object to(TipologiaEtichettaEnum source) {
		if(source == null) {
			return null;
		}
		return tipoEtichettaToMap.get(source);							
	}

	@Override
	public TipologiaEtichettaEnum from(Object dest) {
		if(dest == null) {
			return null;
		}
		return tipoEtichettaFromMap.get(dest);
	}

}
