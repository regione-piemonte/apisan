/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadRettificaMedico;
import it.csi.apisan.apisanscerev.dto.scerev.Payload2;

public class PayloadRettificaMedicoPayload2Mapper extends BaseMapper<PayloadRettificaMedico, Payload2> {

	@Override
	public Payload2 to(PayloadRettificaMedico source) {
		if(source == null) {
			return null;
		}
		Payload2 dest = new Payload2();
		dest.setNote(source.getNote());
		//dest.setAllegati(new ModelAllegatiCittadinicitIdcambiomedicorichiestaAllegatiMapper().to(source.getAllegati()));
		dest.setAllegati(new ModelAllegatiModelAllegatiMapper().to(source.getAllegati()));
		return dest;
		
	}

	@Override
	public PayloadRettificaMedico from(Payload2 dest) {
		if(dest == null) {
			return null;
		}
		PayloadRettificaMedico source = new PayloadRettificaMedico();
		source.setNote(dest.getNote());
		//source.setAllegati(new ModelAllegatiCittadinicitIdcambiomedicorichiestaAllegatiMapper().from(dest.getAllegati()));
		source.setAllegati(new ModelAllegatiModelAllegatiMapper().from(dest.getAllegati()));
		return source;
	}

}
