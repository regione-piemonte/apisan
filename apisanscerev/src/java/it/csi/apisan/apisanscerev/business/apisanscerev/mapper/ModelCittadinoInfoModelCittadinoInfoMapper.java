/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCittadinoInfo;

public class ModelCittadinoInfoModelCittadinoInfoMapper extends BaseMapper<ModelCittadinoInfo, it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfo> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfo to(ModelCittadinoInfo source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfo dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfo();
		dest.setAslAssistenza(new ModelAslModelAslMapper().to(source.getAslAssistenza()));
		dest.setCittadinanza(new ModelCittadinanzaModelCittadinanzaMapper().to(source.getCittadinanza()));
		dest.setCodiceFiscale(source.getCodiceFiscale());
		dest.setCognome(source.getCognome());
		dest.setComuneNascita(source.getComuneNascita());
		dest.setDataFineAssistenza(source.getDataFineAssistenza());
		dest.setDataInizioAssistenza(source.getDataInizioAssistenza());
		dest.setDataInizioAssistenzaMedico(source.getDataInizioAssistenzaMedico());
		dest.setDataNascita(source.getDataNascita());
		dest.setDataRevocaAssistenza(source.getDataRevocaAssistenza());
		dest.setDataRevocaMedico(source.getDataRevocaMedico());
		dest.setDomicilio(new ModelCittadinoDomicilioModelCittadinoDomicilioMapper().to(source.getDomicilio()));
		dest.setIdAura(source.getIdAura());
		dest.setMedico(new ModelCittadinoInfoMedicoModelCittadinoInfoMedicoMapper().to(source.getMedico()));
		dest.setMedicoAltraRegione(source.isMedicoAltraRegione());
		dest.setNome(source.getNome());
		dest.setRecapiti(new ModelCittadinoRecapitiMapper().to(source.getRecapiti()));
		dest.setResidenza(new ModelCittadinoResidenzaModelCittadinoResidenzaMapper().to(source.getResidenza()));
		dest.setRichiestaCambio(new ModelCambioMedicoRichiestaModelCambioMedicoRichiestaMapper().to(source.getRichiestaCambio()));
		dest.setSesso(source.getSesso());
		dest.setStatoAssistenza(source.getStatoAssistenza());
		return dest;
	}

	@Override
	public ModelCittadinoInfo from(it.csi.apisan.apisanscerev.dto.scerev.ModelCittadinoInfo dest) {
		if(dest == null) {
			return null;
		}
		ModelCittadinoInfo source = new ModelCittadinoInfo();
		source.setAslAssistenza(new ModelAslModelAslMapper().from(dest.getAslAssistenza()));
		source.setCittadinanza(new ModelCittadinanzaModelCittadinanzaMapper().from(dest.getCittadinanza()));
		source.setCodiceFiscale(dest.getCodiceFiscale());
		source.setCognome(dest.getCognome());
		source.setComuneNascita(dest.getComuneNascita());
		source.setDataFineAssistenza(dest.getDataFineAssistenza());
		source.setDataInizioAssistenza(dest.getDataInizioAssistenza());
		source.setDataInizioAssistenzaMedico(dest.getDataInizioAssistenzaMedico());
		source.setDataNascita(dest.getDataNascita());
		source.setDataRevocaAssistenza(dest.getDataRevocaAssistenza());
		source.setDataRevocaMedico(dest.getDataRevocaMedico());
		source.setDomicilio(new ModelCittadinoDomicilioModelCittadinoDomicilioMapper().from(dest.getDomicilio()));
		source.setIdAura(dest.getIdAura());
		source.setMedico(new ModelCittadinoInfoMedicoModelCittadinoInfoMedicoMapper().from(dest.getMedico()));
		source.setMedicoAltraRegione(dest.isMedicoAltraRegione());
		source.setNome(dest.getNome());
		source.setRecapiti(new ModelCittadinoRecapitiMapper().from(dest.getRecapiti()));
		source.setResidenza(new ModelCittadinoResidenzaModelCittadinoResidenzaMapper().from(dest.getResidenza()));
		source.setRichiestaCambio(new ModelCambioMedicoRichiestaModelCambioMedicoRichiestaMapper().from(dest.getRichiestaCambio()));
		source.setSesso(dest.getSesso());
		source.setStatoAssistenza(dest.getStatoAssistenza());		
		return source;
	}

}
