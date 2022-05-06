/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelVerificaStatoRichiesta2;
import it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean.VerificaStatoRichiesta2Response;

public class ModelVerificaStatoRichiesta2VerificaStatoRichiesta2Mapper extends BaseMapper<ModelVerificaStatoRichiesta2, VerificaStatoRichiesta2Response> {

	@Override
	public VerificaStatoRichiesta2Response to(ModelVerificaStatoRichiesta2 source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelVerificaStatoRichiesta2 from(VerificaStatoRichiesta2Response dest) {
		if(dest == null) {
			return null;
		}
		ModelVerificaStatoRichiesta2 source = new ModelVerificaStatoRichiesta2();
		source.setChecksum(dest.getChecksum());
		source.setDirectory(dest.getDirectory());
		source.setIdDocumentoIlec(dest.getIdDocumentoIlec()==null?"":dest.getIdDocumentoIlec().toString());
		source.setStatoRichiesta(dest.getStatoRichiesta());
		source.setZipName(dest.getZipName());				
		
		return source;
	}

}
