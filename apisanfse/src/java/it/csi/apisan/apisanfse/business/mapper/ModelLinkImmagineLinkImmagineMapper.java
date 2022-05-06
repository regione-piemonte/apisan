/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelLinkImmagine;
import it.csi.apisan.apisanfse.integration.documenti.dma.LinkImmagine;

public class ModelLinkImmagineLinkImmagineMapper extends BaseMapper<ModelLinkImmagine, LinkImmagine> {

	@Override
	public LinkImmagine to(ModelLinkImmagine source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelLinkImmagine from(LinkImmagine dest) {
		if(dest == null) {
			return null;
		}
		ModelLinkImmagine source = new ModelLinkImmagine();
		source.setAccessionNumber(dest.getAccessionNumber());
		source.setObjectNumber(dest.getObjectNumber());
		source.setSeries(dest.getSeries());
		source.setStudy(dest.getStudy());
		
		return source;
	}

}
