/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelTicketPagatoRicevutaRimborso;
import it.csi.gpr.LMSRicevuteRimborsoPagamentoType;

public class ModelTicketPagatoRicevutaRimborsoLMSRicevuteRimborsoPagamentoTypeMapper extends BaseMapper<ModelTicketPagatoRicevutaRimborso, LMSRicevuteRimborsoPagamentoType> {

	@Override
	public LMSRicevuteRimborsoPagamentoType to(ModelTicketPagatoRicevutaRimborso source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelTicketPagatoRicevutaRimborso from(LMSRicevuteRimborsoPagamentoType dest) {
		if(dest == null) {
			return null;
		}
		ModelTicketPagatoRicevutaRimborso source = new ModelTicketPagatoRicevutaRimborso();
		source.setDataRimborso(new DateStringMapper(DateStringMapper.DATEYYYMMDD).from(dest.getDATARIMBORSOPAGAMENTO()) );
		source.setId(dest.getIDRIMBORSO());
		source.setImportoRimborso(new BigDecimalStringMapper( ).from(dest.getIMPORTORIMBORSATO()));
		source.setPraticaId(dest.getPRATICAPAGATACONCREDITO());
		source.setNumeroRimborso(dest.getNUMERORIMBORSO());

		return source;
	}

}
