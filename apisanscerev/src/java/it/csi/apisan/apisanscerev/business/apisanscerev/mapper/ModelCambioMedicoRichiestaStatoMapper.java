/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelCambioMedicoRichiestaStato;

public class ModelCambioMedicoRichiestaStatoMapper extends BaseMapper<ModelCambioMedicoRichiestaStato, it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaStato> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaStato to(
			ModelCambioMedicoRichiestaStato source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaStato dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaStato();
		dest.setId(source.getId());
		dest.setNome(source.getNome());
		return dest;
	}

	@Override
	public ModelCambioMedicoRichiestaStato from(
			it.csi.apisan.apisanscerev.dto.scerev.ModelCambioMedicoRichiestaStato dest) {
		if(dest == null) {
			return null;
		}
		ModelCambioMedicoRichiestaStato source = new ModelCambioMedicoRichiestaStato();
		source.setId(dest.getId());
		source.setNome(dest.getNome());
		return source;
	}

}
