/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelControlloCombinazione;

public class ModelControlloCombinazioneModelControlloCombinazioneMapper extends BaseMapper<ModelControlloCombinazione, it.csi.apisan.apisanscerev.dto.scerev.ModelControlloCombinazione> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelControlloCombinazione to(ModelControlloCombinazione source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelControlloCombinazione dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelControlloCombinazione();
		dest.setAmmessa(source.isAmmessa());
		dest.setAslDomicilio(new ModelAslModelAslMapper().to(source.getAslDomicilio()));
		dest.setAslIscrizione(new ModelAslModelAslMapper().to(source.getAslIscrizione()) );
		dest.setAslResidenza(new ModelAslModelAslMapper().to(source.getAslResidenza()));
		dest.setDerogaAssociazione(source.isDerogaAssociazione());
		dest.setDerogaMmg(source.isDerogaMmg());
		dest.setDerogaPls(source.isDerogaPls());
		dest.setDerogaTerritoriale(source.isDerogaTerritoriale());
		dest.setVariazioneAsl(source.isVariazioneAsl());
		return dest;
		
	}

	@Override
	public ModelControlloCombinazione from(it.csi.apisan.apisanscerev.dto.scerev.ModelControlloCombinazione dest) {
		if(dest == null) {
			return null;
		}
		ModelControlloCombinazione source = new ModelControlloCombinazione();
		source.setAmmessa(dest.isAmmessa());
		source.setAslDomicilio(new ModelAslModelAslMapper().from(dest.getAslDomicilio()));
		source.setAslIscrizione(new ModelAslModelAslMapper().from(dest.getAslIscrizione()));
		source.setAslResidenza(new ModelAslModelAslMapper().from(dest.getAslResidenza()));
		source.setDerogaAssociazione(dest.isDerogaAssociazione());
		source.setDerogaMmg(dest.isDerogaMmg());
		source.setDerogaPls(dest.isDerogaPls());
		source.setDerogaTerritoriale(dest.isDerogaTerritoriale());
		source.setVariazioneAsl(dest.isVariazioneAsl());
		source.setRicusazione(dest.isRicusazione());
		
		return source;
	}

}
