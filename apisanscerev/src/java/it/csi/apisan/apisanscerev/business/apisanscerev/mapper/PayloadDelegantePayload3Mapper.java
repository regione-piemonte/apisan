/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadDelegante;
import it.csi.apisan.apisanscerev.dto.scerev.Payload;
import it.csi.apisan.apisanscerev.dto.scerev.Payload3;

public class PayloadDelegantePayload3Mapper extends BaseMapper<PayloadDelegante, Payload3> {

	@Override
	public Payload3 to(PayloadDelegante source) {
		if(source == null) {
			return null;
		}
		Payload3 dest = new Payload3();
		
		dest.setCittadinanza(new ModelCittadinanzaModelCittadinanzaMapper().to(source.getCittadinanza()));
		dest.setDatiAggiuntivi(new ModelCambioMedicoRichiestaDatiAggiuntiviMapper().to(source.getDatiAggiuntivi()));
		dest.setDomicilio(new ModelCittadinoDomicilioModelCittadinoDomicilioMapper().to(source.getDomicilio()));
		dest.setMedicoAltraRegione(new ModelCambioMedicoMedicoAltraRegioneMapper().to(source.getMedicoAltraRegione()));
		dest.setRecapiti(new ModelCittadinoRecapitiMapper().to(source.getRecapiti()));
		dest.setResidenza(new ModelCittadinoResidenzaModelCittadinoResidenzaMapper().to(source.getResidenza()));
		dest.setGeneralitaAssistito(new ModelGeneralitaAssistitoModelGeneralitaAssistitoMapper().to(source.getGeneralitaAssistito()));
		
		return dest;
	}

	@Override
	public PayloadDelegante from(Payload3 dest) {
		if(dest == null) {
			return null;
		}
		PayloadDelegante source = new PayloadDelegante();
	
		source.setCittadinanza(new ModelCittadinanzaModelCittadinanzaMapper().from(dest.getCittadinanza()));
		source.setDatiAggiuntivi(new ModelCambioMedicoRichiestaDatiAggiuntiviMapper().from(dest.getDatiAggiuntivi()));
		source.setDomicilio(new ModelCittadinoDomicilioModelCittadinoDomicilioMapper().from(dest.getDomicilio()));
		source.setMedicoAltraRegione(new ModelCambioMedicoMedicoAltraRegioneMapper().from(dest.getMedicoAltraRegione()));
		source.setRecapiti(new ModelCittadinoRecapitiMapper().from(dest.getRecapiti()));
		source.setResidenza(new ModelCittadinoResidenzaModelCittadinoResidenzaMapper().from(dest.getResidenza()));
		source.setGeneralitaAssistito(new ModelGeneralitaAssistitoModelGeneralitaAssistitoMapper().from(dest.getGeneralitaAssistito()));
		
		return source;
	}

}
