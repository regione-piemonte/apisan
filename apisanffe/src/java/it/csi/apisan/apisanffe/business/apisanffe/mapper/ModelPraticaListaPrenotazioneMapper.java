/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelPratica;
import it.csi.gpr.ListaPrenotazione;

public class ModelPraticaListaPrenotazioneMapper extends BaseMapper<ModelPratica, ListaPrenotazione> {

	@Override
	public ListaPrenotazione to(ModelPratica source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelPratica from(ListaPrenotazione dest) {
		if(dest == null) {
			return null;
		}
		ModelPratica source = new ModelPratica();
		
		source.setCodiceVersamento(dest.getCODICEVERSAMENTO());
		source.setImportoIva(dest.getIMPORTOIVA());
		source.setImportoMarcaBollo(dest.getIMPORTOMARCABOLLO());
		source.setImportoPratica(dest.getIMPORTOPRATICA());
		try {
			source.setPercentualeIva(new Integer(dest.getPERCENTUALEIVA()));
		} catch (NumberFormatException e) {
			
		}
		source.setPrenotazione(new ModelPrenotazionePrenotazioneMapper( ).from(dest.getPRENOTAZIONE()));
		source.setPrestazioneErogata(dest.getPRESTAZIONEEROGATA());
		return source;
		
	}

}
