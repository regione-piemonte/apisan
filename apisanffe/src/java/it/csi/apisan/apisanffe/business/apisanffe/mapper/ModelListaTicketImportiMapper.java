/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelListaTicket;
import it.csi.gpr.Importi;

public class ModelListaTicketImportiMapper extends BaseMapper<ModelListaTicket, Importi> {

	@Override
	public Importi to(ModelListaTicket source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelListaTicket from(Importi dest) {
		if(dest == null) {
			return null;
		}
		ModelListaTicket source = new ModelListaTicket();
		source.setPaziente(new ModelListaTicketPazientePazienteMapper().from(dest.getPAZIENTE()) );
		if(dest.getLISTAPRENOTAZIONE() != null) {
			source.setListaPrenotazione(new ModelPraticaListaPrenotazioneMapper().fromList(dest.getLISTAPRENOTAZIONE().getPRATICA()) );
		}
		return source;
		
	}

}
