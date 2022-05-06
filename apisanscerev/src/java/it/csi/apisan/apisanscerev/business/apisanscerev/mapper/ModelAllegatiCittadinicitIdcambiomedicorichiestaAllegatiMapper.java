/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAllegati;
import it.csi.apisan.apisanscerev.dto.scerev.CittadinicitIdcambiomedicorichiestaAllegati;

public class ModelAllegatiCittadinicitIdcambiomedicorichiestaAllegatiMapper extends BaseMapper<ModelAllegati, CittadinicitIdcambiomedicorichiestaAllegati> {

	@Override
	public CittadinicitIdcambiomedicorichiestaAllegati to(ModelAllegati source) {
		if(source == null) {
			//pare sia un problema del back end ricevere questo dato a null
			return new CittadinicitIdcambiomedicorichiestaAllegati();
		}
		/*CittadinicitIdcambiomedicorichiestaAllegati dest = new CittadinicitIdcambiomedicorichiestaAllegati();
		dest.setCertificatoMedico(new ModelDocumentoModelDocumentoMapper().to(source.getCertificatoMedico()));
		dest.setConsensoMedico(new ModelDocumentoModelDocumentoMapper().to(source.getConsensoMedico()));
		dest.setDelegante(new ModelDocumentoModelDocumentoMapper().to(source.getDelegante()));
		dest.setIdentitaFronte(new ModelDocumentoModelDocumentoMapper().to(source.getIdentitaFronte()));
		dest.setIdentitaRetro(new ModelDocumentoModelDocumentoMapper().to(source.getIdentitaRetro()));
		dest.setSoggiorno(new ModelDocumentoModelDocumentoMapper().to(source.getSoggiorno()));
		return dest;*/
		return null;
	}

	@Override
	public ModelAllegati from(CittadinicitIdcambiomedicorichiestaAllegati dest) {
		if(dest == null) {
			return null;
		}
		/*ModelAllegati source = new ModelAllegati();
		source.setCertificatoMedico(new ModelDocumentoModelDocumentoMapper().from(dest.getCertificatoMedico()));
		source.setConsensoMedico(new ModelDocumentoModelDocumentoMapper().from(dest.getConsensoMedico()));
		source.setDelegante(new ModelDocumentoModelDocumentoMapper().from(dest.getDelegante()));
		source.setIdentitaFronte(new ModelDocumentoModelDocumentoMapper().from(dest.getIdentitaFronte()));
		source.setIdentitaRetro(new ModelDocumentoModelDocumentoMapper().from(dest.getIdentitaRetro()));
		source.setSoggiorno(new ModelDocumentoModelDocumentoMapper().from(dest.getSoggiorno()));
		return source;*/
		return null;
	}

}
