/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import java.math.BigDecimal;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelRimborso;
import it.csi.gpr.RimborsoType;

public class ModelRimborsoRimborsoTypeMapper extends BaseMapper<ModelRimborso, RimborsoType> {

	@Override
	public RimborsoType to(ModelRimborso source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelRimborso from(RimborsoType dest) {
		if(dest == null) {
			return null;
		}
		ModelRimborso source = new ModelRimborso();
		source.setAvvisoPagamento(new ModelAvvisoPagamentoAVVISOPAGAMENTOtypeMapper().from(getJaxbElement(dest.getAVVISOPAGAMENTO())));
		source.setCodiceVersamento(getJaxbElement(dest.getCODICEVERSAMENTO()));
		source.setDataEmissione( getJaxbElement(dest.getDATAEMISSIONE()));
		source.setDataRimborso(dest.getDATARIMBORSO());
		try {
			source.setImportoRimborsato(new BigDecimal( dest.getIMPORTORIMBORSATO() ));
		} catch (Exception e) {
	
		}
		try {
			source.setImportoRimborsato(new BigDecimal(dest.getIMPORTORIMBORSATO()));
		} catch (Exception e) {

		}
		source.setIuvMod1(getJaxbElement(dest.getIUVMOD1()));
		source.setNumeroRimborso(getJaxbElement(dest.getNUMERORIMBORSO()));
		source.setNumeroSportello(dest.getNUMEROSPORTELLO());
		source.setPraticaPagataConCredito(getJaxbElement(dest.getPRATICAPAGATACONCREDITO()));
		
		
		return source;
	}

}
