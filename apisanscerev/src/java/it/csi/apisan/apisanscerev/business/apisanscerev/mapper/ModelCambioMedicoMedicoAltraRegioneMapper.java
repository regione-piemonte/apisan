/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoMedicoAltraRegione;

public class ModelCambioMedicoMedicoAltraRegioneMapper extends BaseMapper<ModelCambioMedicoMedicoAltraRegione, it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoMedicoAltraRegione> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoMedicoAltraRegione to(
			ModelCambioMedicoMedicoAltraRegione source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoMedicoAltraRegione dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoMedicoAltraRegione();
		dest.setAziendaSanitaria(source.getAziendaSanitaria());
		dest.setCognome(source.getCognome());
		dest.setNome(source.getNome());
		dest.setRegione(source.getRegione());
		return dest;
	}

	@Override
	public ModelCambioMedicoMedicoAltraRegione from(
			it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoMedicoAltraRegione dest) {
		if(dest == null) {
			return null;
		}
		ModelCambioMedicoMedicoAltraRegione source = new ModelCambioMedicoMedicoAltraRegione();
		source.setAziendaSanitaria(dest.getAziendaSanitaria());
		source.setCognome(dest.getCognome());
		source.setNome(dest.getNome());
		source.setRegione(dest.getRegione());
		
		return source;
		
	}

}
