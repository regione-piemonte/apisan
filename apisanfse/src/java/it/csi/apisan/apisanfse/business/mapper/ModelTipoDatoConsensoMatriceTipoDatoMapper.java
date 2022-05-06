/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelTipoDato;
import it.csi.apisan.apisanfse.integration.oscuramento.dma.ConsensoMatriceTipoDato;

public class ModelTipoDatoConsensoMatriceTipoDatoMapper extends BaseMapper<ModelTipoDato, ConsensoMatriceTipoDato> {

	@Override
	public ConsensoMatriceTipoDato to(ModelTipoDato source) {
		if(source == null) {
			return null;
		}
		ConsensoMatriceTipoDato dest = new ConsensoMatriceTipoDato();
		dest.setCodice(source.getCodice());
		dest.setDescrizione(source.getDescrizione());
		dest.setRiferimento(source.getRiferimento());
		return dest;
	}

	@Override
	public ModelTipoDato from(ConsensoMatriceTipoDato dest) {
		if(dest == null) {
			return null;
		}
		ModelTipoDato source = new ModelTipoDato();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		source.setRiferimento(dest.getRiferimento());
		return source;
	}

}
