/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiestaAllegati;

public class ModelCambioMedicoRichiestaAllegatiModelCambioMedicoRichiestaAllegatiMapper extends BaseMapper<ModelCambioMedicoRichiestaAllegati, it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaAllegati> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaAllegati to(
			ModelCambioMedicoRichiestaAllegati source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaAllegati dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaAllegati();
		dest.setCertificatoMedico(new ModelDocumentoLetturaModelDocumentoLetturaMapper().to(source.getCertificatoMedico()));
		dest.setConsensoMedico(new ModelDocumentoLetturaModelDocumentoLetturaMapper().to(source.getCertificatoMedico()));
		dest.setDelegante(new ModelDocumentoLetturaModelDocumentoLetturaMapper().to(source.getDelegante()));
		dest.setIdentitaFronte(new ModelDocumentoLetturaModelDocumentoLetturaMapper().to(source.getIdentitaFronte()));
		dest.setIdentitaRetro(new ModelDocumentoLetturaModelDocumentoLetturaMapper().to(source.getIdentitaRetro()));
		dest.setSoggiorno(new ModelDocumentoLetturaModelDocumentoLetturaMapper().to(source.getSoggiorno()));
		return dest;
	}

	@Override
	public ModelCambioMedicoRichiestaAllegati from(
			it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaAllegati dest) {
		if(dest == null) {
			return null;
		}
		ModelCambioMedicoRichiestaAllegati source = new ModelCambioMedicoRichiestaAllegati();
		source.setCertificatoMedico(new ModelDocumentoLetturaModelDocumentoLetturaMapper().from(dest.getCertificatoMedico()));
		source.setConsensoMedico(new ModelDocumentoLetturaModelDocumentoLetturaMapper().from(dest.getConsensoMedico()));
		source.setDelegante(new ModelDocumentoLetturaModelDocumentoLetturaMapper().from(dest.getDelegante()));
		source.setIdentitaFronte(new ModelDocumentoLetturaModelDocumentoLetturaMapper().from(dest.getIdentitaFronte()));
		source.setIdentitaRetro(new ModelDocumentoLetturaModelDocumentoLetturaMapper().from(dest.getIdentitaRetro()));
		source.setSoggiorno(new ModelDocumentoLetturaModelDocumentoLetturaMapper().from(dest.getSoggiorno()));
		return source;
		
	}

}
