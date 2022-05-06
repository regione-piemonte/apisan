/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelTicketPagatoRimborsoUtilizzato;
import it.csi.gpr.LMSRimborsiUtilizzatiType;
import it.csi.gpr.LMSRimborsoUtilizzatoType;

public class ModelTicketPagatoRimborsoUtilizzatoLMSRimborsoUtilizzatoTypeMapper extends BaseMapper<ModelTicketPagatoRimborsoUtilizzato, LMSRimborsoUtilizzatoType> {

	@Override
	public LMSRimborsoUtilizzatoType to(ModelTicketPagatoRimborsoUtilizzato source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelTicketPagatoRimborsoUtilizzato from(LMSRimborsoUtilizzatoType dest) {
		if(dest == null) {
			return null;
		}
		ModelTicketPagatoRimborsoUtilizzato source = new ModelTicketPagatoRimborsoUtilizzato();
		source.setId(dest.getIDRIMBORSOUTILIZZATO());
		source.setImporto(new BigDecimalStringMapper() .from(dest.getIMPORTOCREDITOUTILIZZATO()));
		source.setNumeroPraticaRimborsata(dest.getNUMEROPRATICARIMBORSATA());
		return source;
	}



}
