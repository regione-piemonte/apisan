/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.PayloadCambioMedico;
import it.csi.apisan.apisanscerev.dto.scerev.Payload1;

public class PayloadCambioMedicoPayload1Mapper extends BaseMapper<PayloadCambioMedico, Payload1> {

	@Override
	public Payload1 to(PayloadCambioMedico source) {
		if(source == null) {
			return null;
		}
		Payload1 dest = new Payload1();
		dest.setRinnovoAssistenza(source.isRinnovoAssistenza());
		//dest.setAllegati(new ModelAllegatiCittadinicitIdcambiomedicorichiestaAllegatiMapper().to(source.getAllegati())   );
		dest.setAllegati(new ModelAllegatiModelAllegatiMapper().to(source.getAllegati()));
		dest.setBozza(source.isBozza());
		dest.setCittadinanza(new ModelCittadinanzaModelCittadinanzaMapper().to(source.getCittadinanza()));
		dest.setControlloCombinazione(new ModelControlloCombinazioneModelControlloCombinazioneMapper().to(source.getControlloCombinazione()));
		dest.setDatiAggiuntivi(new ModelCambioMedicoRichiestaDatiAggiuntiviMapper().to(source.getDatiAggiuntivi()));
		//dest.setDelegato(delegato);
		dest.setDomicilio(new ModelCittadinoDomicilioModelCittadinoDomicilioMapper().to(source.getDomicilio()));
		dest.setMedicoAltraRegione(new ModelCambioMedicoMedicoAltraRegioneMapper().to(source.getMedicoAltraRegione()));
		dest.setRecapiti(new ModelCittadinoRecapitiMapper().to(source.getRecapiti()));
		dest.setResidenza(new ModelCittadinoResidenzaModelCittadinoResidenzaMapper().to(source.getResidenza()));
		return dest;
	}

	@Override
	public PayloadCambioMedico from(Payload1 dest) {
		if(dest == null) {
			return null;
		}
		PayloadCambioMedico source = new PayloadCambioMedico();
		source.setRinnovoAssistenza(dest.isRinnovoAssistenza());
		//source.setAllegati(new ModelAllegatiCittadinicitIdcambiomedicorichiestaAllegatiMapper().from(dest.getAllegati())   );
		source.setAllegati(new ModelAllegatiModelAllegatiMapper().from(dest.getAllegati()));
		source.setBozza(dest.isBozza());
		source.setCittadinanza(new ModelCittadinanzaModelCittadinanzaMapper().from(dest.getCittadinanza()));
		source.setControlloCombinazione(new ModelControlloCombinazioneModelControlloCombinazioneMapper().from(dest.getControlloCombinazione()));
		source.setDatiAggiuntivi(new ModelCambioMedicoRichiestaDatiAggiuntiviMapper().from(dest.getDatiAggiuntivi()));
		//dest.setDelegato(delegato);
		source.setDomicilio(new ModelCittadinoDomicilioModelCittadinoDomicilioMapper().from(dest.getDomicilio()));
		source.setMedicoAltraRegione(new ModelCambioMedicoMedicoAltraRegioneMapper().from(dest.getMedicoAltraRegione()));
		source.setRecapiti(new ModelCittadinoRecapitiMapper().from(dest.getRecapiti()));
		source.setResidenza(new ModelCittadinoResidenzaModelCittadinoResidenzaMapper().from(dest.getResidenza()));

		return source;
	}

}
