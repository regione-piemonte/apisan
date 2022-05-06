/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.mapper;

import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelDeviceCertificato;
import it.csi.dma.farmab.interfacews.msg.farab.CertificazioneType;

public class ModelDeviceCertificatoCertificazioneTypeMapper extends BaseMapper<ModelDeviceCertificato, CertificazioneType> {

	@Override
	public CertificazioneType to(ModelDeviceCertificato source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelDeviceCertificato from(CertificazioneType dest) {
		if(dest == null) {
			return null;
		}
		ModelDeviceCertificato source = new ModelDeviceCertificato();
		source.setCodiceFiscale(dest.getCfCittadino());
		source.setDataCertificazione(new DateTStringMapper(DateTStringMapper.FORMATOyyyyMMddHHmmss).from(dest.getDataCertificazione()));
		if(dest.getFonte() != null) {
			source.setFonteCodice(dest.getFonte().getCodice());
			source.setFonteDescrizione(dest.getFonte().getDescrizione());			
		}
		source.setId(dest.getId());
		if (dest.getDispositivo() != null) {
			source.setModello(dest.getDispositivo().getModello());
			source.setSistemaOperativo(dest.getDispositivo().getSistemaOperativo());
			source.setBrowser(dest.getDispositivo().getBrowser());
		}
		source.setTelefono(dest.getNumTelefono());
		source.setUuid(dest.getUuidDevice());
		return source;
	}

}
