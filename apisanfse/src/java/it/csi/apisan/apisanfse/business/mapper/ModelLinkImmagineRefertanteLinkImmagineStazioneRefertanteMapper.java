/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelLinkImmagineRefertante;
import it.csi.apisan.apisanfse.integration.documenti.dma.LinkImmagineStazioneRefertante;

public class ModelLinkImmagineRefertanteLinkImmagineStazioneRefertanteMapper extends BaseMapper<ModelLinkImmagineRefertante, LinkImmagineStazioneRefertante> {

	@Override
	public LinkImmagineStazioneRefertante to(ModelLinkImmagineRefertante source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelLinkImmagineRefertante from(LinkImmagineStazioneRefertante dest) {
		if(dest == null) {
			return null;
		}
		ModelLinkImmagineRefertante source = new ModelLinkImmagineRefertante();
		source.setLink(dest.getLink());
		return source;
	}

}
