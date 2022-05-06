/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import java.math.BigDecimal;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelElencoPagamenti;
import it.csi.gpr.ElencoPagamentiType;

public class ModelElencoPagamentiElencoPagamentiTypeMapper extends BaseMapper<ModelElencoPagamenti, ElencoPagamentiType> {

	@Override
	public ElencoPagamentiType to(ModelElencoPagamenti source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelElencoPagamenti from(ElencoPagamentiType dest) {
		if(dest == null) {
			return null;
		}
		ModelElencoPagamenti source = new ModelElencoPagamenti();
		source.setAvvisoPagamento(new ModelAvvisoPagamentoAVVISOPAGAMENTOtypeMapper().from( getJaxbElement( dest.getAVVISOPAGAMENTO())));
		source.setDataRicevuta(new DateStringMapper(DateStringMapper.DATEDDMMYYYY).from(getJaxbElement(dest.getDATARICEVUTA())));
		try {
			source.setImportoRicevuta(new BigDecimal( getJaxbElement(dest.getIMPORTORICEVUTA())));
		} catch (Exception e) {
		
		}
		source.setIuvMod1(getJaxbElement(dest.getIUVMOD1()));
		source.setNumeroRicevuta(getJaxbElement(dest.getNUMERORICEVUTA()));
		source.setNumeroSportello(getJaxbElement(dest.getNUMEROSPORTELLO() ));
		
		return source;
	}

}
