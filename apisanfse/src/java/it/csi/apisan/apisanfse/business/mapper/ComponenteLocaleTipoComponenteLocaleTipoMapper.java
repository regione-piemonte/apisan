/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ComponenteLocaleTipo;

public class ComponenteLocaleTipoComponenteLocaleTipoMapper extends BaseMapper<ComponenteLocaleTipo, it.csi.apisan.apisanfse.integration.dma.ComponenteLocaleTipo> {

	@Override
	public it.csi.apisan.apisanfse.integration.dma.ComponenteLocaleTipo to(ComponenteLocaleTipo source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanfse.integration.dma.ComponenteLocaleTipo dest = new it.csi.apisan.apisanfse.integration.dma.ComponenteLocaleTipo();
		dest.setCodice(source.getCodice());
		dest.setDescrizione(source.getDescrizione());
		dest.setRiferimento(source.getRiferimento());
		return dest;
	}

	@Override
	public ComponenteLocaleTipo from(it.csi.apisan.apisanfse.integration.dma.ComponenteLocaleTipo dest) {
		if(dest == null) {
			return null;
		}
		ComponenteLocaleTipo source = new ComponenteLocaleTipo();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		source.setRiferimento(dest.getRiferimento());
		return source;
	}

}
