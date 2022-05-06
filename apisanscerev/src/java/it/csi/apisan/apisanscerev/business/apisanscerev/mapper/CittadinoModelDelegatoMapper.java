/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.scerev.ModelDelegato;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;

public class CittadinoModelDelegatoMapper extends BaseMapper<Cittadino, ModelDelegato> {

	@Override
	public ModelDelegato to(Cittadino source) {
		if(source == null) {
			return null;
		}
		ModelDelegato dest = new ModelDelegato();
		dest.setCodiceFiscale(source.getCodiceFiscale());
		dest.setCognome(source.getCognome());
		dest.setNome(source.getNome());
		return dest;
	}

	@Override
	public Cittadino from(ModelDelegato dest) {
		if(dest == null) {
			return null;
		}
		Cittadino source = new Cittadino();
		source.setCodiceFiscale(dest.getCodiceFiscale());
		source.setCognome(dest.getCognome());
		source.setNome(dest.getNome());
		return source;
		
	}

}
