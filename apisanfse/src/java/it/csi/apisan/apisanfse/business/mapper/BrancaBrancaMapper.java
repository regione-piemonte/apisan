/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;

import it.csi.apisan.apisanfse.dto.apisanfse.Branca;

public class BrancaBrancaMapper extends FseCodificheBaseMapper<Branca, it.csi.apisan.apisanfse.integration.dma.Branca> {

	
	public BrancaBrancaMapper(List<it.csi.apisan.apisanfse.integration.dma.Codifica> codifiche){
		super(codifiche);
	}
	/*@Override
	public it.csi.apisan.apisanfse.integration.dma.Branca to(Branca source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanfse.integration.dma.Branca dest = new it.csi.apisan.apisanfse.integration.dma.Branca();
		dest.setCodice(source.getCodice());
		dest.setDescrizione(source.getDescrizione());
		dest.setRiferimento(source.getRiferimento());
		return dest;
	}

	@Override
	public Branca from(it.csi.apisan.apisanfse.integration.dma.Branca dest) {
		if(dest == null) {
			return null;
		}
		Branca source = new Branca();
		source.setCodice(dest.getCodice());
		source.setDescrizione(dest.getDescrizione());
		source.setRiferimento(dest.getRiferimento());
		return source;
	}*/


}
