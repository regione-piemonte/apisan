/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;

import it.csi.apisan.apisanfse.dto.apisanfse.ComponenteLocale;
import it.csi.apisan.apisanfse.integration.dma.Codifica;

public class ComponenteLocaleComponenteLocaleMapper extends FseCodificheBaseMapper<ComponenteLocale, it.csi.apisan.apisanfse.integration.dma.ComponenteLocale> {

	public ComponenteLocaleComponenteLocaleMapper(List<Codifica> codifiche) {
		super(codifiche);
	}

	@Override
	public it.csi.apisan.apisanfse.integration.dma.ComponenteLocale to(ComponenteLocale source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanfse.integration.dma.ComponenteLocale dest = super.to(source);
		dest.setCodice(source.getCodice());
		dest.setDescrizione(source.getDescrizione());
		dest.setRiferimento(dest.getRiferimento());
		dest.setAziendaSanitaria(new AziendaSanitariaAziendaSanitariaMapper(null).to(source.getAziendaSanitaria()));
		dest.setComponenteLocaleTipo(new ComponenteLocaleTipoComponenteLocaleTipoMapper().to(source.getComponenteLocaleTipo()));
		return dest;
	}

	@Override
	public ComponenteLocale from(it.csi.apisan.apisanfse.integration.dma.ComponenteLocale dest) {
		if(dest ==null) {
			return null;
		}
		ComponenteLocale from = new ComponenteLocale();
		from.setCodice(dest.getCodice());
		from.setDescrizione(dest.getDescrizione());
		from.setRiferimento(dest.getRiferimento());
		from.setAziendaSanitaria(new AziendaSanitariaAziendaSanitariaMapper(codifiche).from(dest.getAziendaSanitaria()));
		from.setComponenteLocaleTipo(new ComponenteLocaleTipoComponenteLocaleTipoMapper().from(dest.getComponenteLocaleTipo()));
		return from;
	}

}
