/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadControlloAllegati;
import it.csi.apisan.apisanscerev.dto.scerev.Payload4;

public class PayloadControlloAllegatiPayload4Mapper extends BaseMapper<PayloadControlloAllegati, Payload4> {

	@Override
	public Payload4 to(PayloadControlloAllegati source) {
		if(source == null) {
			return null;
		}
		Payload4 dest = new Payload4();
		dest.setAslDomicilio(new ModelAslModelAslMapper().to(source.getAslDomicilio()));
		dest.setAslIscrizione(new ModelAslModelAslMapper().to(source.getAslIscrizione()));
		dest.setAslResidenza(new ModelAslModelAslMapper().to(source.getAslResidenza()));
		dest.setCittadinanza(new ModelCittadinanzaModelCittadinanzaMapper().to(source.getCittadinanza()));
		dest.setMotivazioneSoggiorno(new ModelMotivazioneSoggiornoMapper().to(source.getMotivazioneSoggiorno()));
		return dest;
	}

	@Override
	public PayloadControlloAllegati from(Payload4 dest) {
		if(dest == null) {
			return null;
		}
		PayloadControlloAllegati source = new PayloadControlloAllegati();
		source.setAslDomicilio(new ModelAslModelAslMapper().from(dest.getAslDomicilio()));
		source.setAslIscrizione(new ModelAslModelAslMapper().from(dest.getAslIscrizione()));
		source.setAslResidenza(new ModelAslModelAslMapper().from(dest.getAslResidenza()));
		source.setCittadinanza(new ModelCittadinanzaModelCittadinanzaMapper().from(dest.getCittadinanza()));
		source.setMotivazioneSoggiorno(new ModelMotivazioneSoggiornoMapper().from(dest.getMotivazioneSoggiorno()));
		
		return source;
	}

}
