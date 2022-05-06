/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.Payload;

public class PayloadPayloadMapper extends BaseMapper<Payload, it.csi.apisan.apisanscerev.dto.scerev.Payload> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.Payload to(Payload source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.Payload dest = new it.csi.apisan.apisanscerev.dto.scerev.Payload();
		dest.setRinnovoAssistenza(source.isRinnovoAssistenza());
		dest.setCittadinanza(new ModelCittadinanzaModelCittadinanzaMapper().to(source.getCittadinanza()));
		dest.setDomicilio(new ModelCittadinoDomicilioModelCittadinoDomicilioMapper().to(source.getDomicilio()));
		dest.setResidenza(new ModelCittadinoResidenzaModelCittadinoResidenzaMapper().to(source.getResidenza()));
		dest.setMedicoAltraRegione(source.isMedicoAltraRegione());
		return dest;
		
	}

	@Override
	public Payload from(it.csi.apisan.apisanscerev.dto.scerev.Payload dest) {
		if(dest == null) {
			return null;
		}
		Payload source = new Payload();
		source.setRinnovoAssistenza(dest.isRinnovoAssistenza());
		source.setCittadinanza(new ModelCittadinanzaModelCittadinanzaMapper().from(dest.getCittadinanza()));
		source.setDomicilio(new ModelCittadinoDomicilioModelCittadinoDomicilioMapper().from(dest.getDomicilio() ));
		source.setResidenza(new ModelCittadinoResidenzaModelCittadinoResidenzaMapper().from(dest.getResidenza()));
		source.setMedicoAltraRegione(dest.isMedicoAltraRegione());
		return source;
		
	}

}
