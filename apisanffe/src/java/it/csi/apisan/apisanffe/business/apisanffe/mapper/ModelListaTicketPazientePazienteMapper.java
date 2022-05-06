/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelListaTicketPaziente;
import it.csi.gpr.Paziente;

public class ModelListaTicketPazientePazienteMapper extends BaseMapper<ModelListaTicketPaziente, Paziente> {

	@Override
	public Paziente to(ModelListaTicketPaziente source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelListaTicketPaziente from(Paziente dest) {
		if(dest == null) {
			return null;
		}
		ModelListaTicketPaziente source = new ModelListaTicketPaziente();
		source.setCap(dest.getCAP());
		source.setCodiceFiscale(dest.getCODICEFISCALE());
		source.setCognome(dest.getCOGNOME());
		source.setComune(dest.getCOMUNE());
		source.setDataNascita(new DateStringMapper(DateStringMapper.DATEDDMMYYYY).from(dest.getDATANASCITA()) );
		source.setIndirizzo(dest.getINDIRIZZO());
		source.setNome(dest.getNOME());
		source.setProvincia(dest.getPROVINCIA());
		return source;
		
	}

}
