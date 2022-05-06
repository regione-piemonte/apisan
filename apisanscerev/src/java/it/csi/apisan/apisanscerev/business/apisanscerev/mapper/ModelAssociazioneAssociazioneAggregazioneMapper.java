/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAssociazione;
import it.csi.associazioni.def.opessanws.opessan.Associazioni.AssociazioneAggregazione;
import it.csi.associazioni.def.opessanws.opessan.ElencoAssociazioniBody;
import it.csi.associazioni.def.opessanws.opessan.InfoRapportoDiLavoro;

public class ModelAssociazioneAssociazioneAggregazioneMapper extends BaseMapper<ModelAssociazione, AssociazioneAggregazione> {

	@Override
	public AssociazioneAggregazione to(ModelAssociazione source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAssociazione from(AssociazioneAggregazione dest) {
		if(dest == null) {
			return null;
		}
		ModelAssociazione source = new ModelAssociazione();
		source.setCap(dest.getCap());
		source.setComune(dest.getComune());
		source.setCodAsl(dest.getCodAzienda());
		source.setCodAssociazione(dest.getCodice());
		source.setIndirizzo(dest.getIndirizzo());
		source.setNome(dest.getDenominazione());
		source.setNumeroCivico(dest.getNumCivico());
		source.setTelefono(dest.getTel());
		
		return source;
	}





}
