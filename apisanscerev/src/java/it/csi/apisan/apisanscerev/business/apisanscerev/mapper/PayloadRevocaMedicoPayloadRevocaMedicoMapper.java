/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadRevocaMedico;

public class PayloadRevocaMedicoPayloadRevocaMedicoMapper extends BaseMapper<PayloadRevocaMedico, it.csi.apisan.apisanscerev.dto.scerev.PayloadRevocaMedico> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.PayloadRevocaMedico to(PayloadRevocaMedico source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.PayloadRevocaMedico dest = new it.csi.apisan.apisanscerev.dto.scerev.PayloadRevocaMedico();
		dest.setMotivoRevoca(source.getMotivoRevoca());
		return dest;
		
	}

	@Override
	public PayloadRevocaMedico from(it.csi.apisan.apisanscerev.dto.scerev.PayloadRevocaMedico dest) {
		// TODO Auto-generated method stub
		return null;
	}

}
