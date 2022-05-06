/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Branca;

public class BrancaDocumentiBrancaMapper extends BaseMapper<Branca, it.csi.apisan.apisanfse.integration.documenti.dmacc.Branca> {

	@Override
	public it.csi.apisan.apisanfse.integration.documenti.dmacc.Branca to(Branca source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanfse.integration.documenti.dmacc.Branca dest = new it.csi.apisan.apisanfse.integration.documenti.dmacc.Branca();
		dest.setCodice(source.getCodice());
		dest.setDescrizione(source.getDescrizione());
		return dest;
	}

	@Override
	public Branca from(it.csi.apisan.apisanfse.integration.documenti.dmacc.Branca dest) {
		if(dest == null) {
			return null;
		}
		Branca source = new Branca();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		return source;
	}

}
