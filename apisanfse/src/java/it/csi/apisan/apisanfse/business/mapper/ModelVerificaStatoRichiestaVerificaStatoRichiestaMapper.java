/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelVerificaStatoRichiesta;
import it.csi.apisan.apisanfse.integration.scaricostudi.VerificaStatoRichiestaRes;

public class ModelVerificaStatoRichiestaVerificaStatoRichiestaMapper extends BaseMapper<ModelVerificaStatoRichiesta, VerificaStatoRichiestaRes> {

	@Override
	public VerificaStatoRichiestaRes to(ModelVerificaStatoRichiesta source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelVerificaStatoRichiesta from(VerificaStatoRichiestaRes dest) {
		if(dest == null) {
			return null;
		}
		ModelVerificaStatoRichiesta source = new ModelVerificaStatoRichiesta();
		source.setDimensione(dest.getDimensione());
		source.setIdPacchetto(dest.getIdPacchetto());
		source.setStatoRichiesta(dest.getStatoRichiesta().value());
		
		return source;
	}

}
