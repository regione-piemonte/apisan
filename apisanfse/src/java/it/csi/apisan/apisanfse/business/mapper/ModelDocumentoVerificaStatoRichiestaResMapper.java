/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelDocumento;
import it.csi.apisan.apisanfse.integration.scaricostudi.VerificaStatoRichiestaRes;

public class ModelDocumentoVerificaStatoRichiestaResMapper extends BaseMapper<ModelDocumento, VerificaStatoRichiestaRes>{

	private ModelDocumento modelDocumento;
	public ModelDocumentoVerificaStatoRichiestaResMapper(ModelDocumento modelDocumento) {
		this.modelDocumento = modelDocumento;
	}
	@Override
	public VerificaStatoRichiestaRes to(ModelDocumento source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelDocumento from(VerificaStatoRichiestaRes dest) {
		
		if (dest!=null) {
			this.modelDocumento.setIdPacchetto(dest.getIdPacchetto());
			this.modelDocumento.setStatoRichiesta(new ModelStatoRichiestaStatoRichiestaEnumMapper().from(dest.getStatoRichiesta()));
		}
		return this.modelDocumento;
	}

}
