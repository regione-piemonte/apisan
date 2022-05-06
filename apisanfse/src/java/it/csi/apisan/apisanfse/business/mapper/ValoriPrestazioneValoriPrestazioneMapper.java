/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ValoriPrestazione;

public class ValoriPrestazioneValoriPrestazioneMapper extends BaseMapper<ValoriPrestazione, it.csi.apisan.apisanfse.integration.dma.ValoriPrestazione> {

	@Override
	public it.csi.apisan.apisanfse.integration.dma.ValoriPrestazione to(ValoriPrestazione source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanfse.integration.dma.ValoriPrestazione dest = new it.csi.apisan.apisanfse.integration.dma.ValoriPrestazione();
		dest.setQuantita(source.getQuantita());
		return dest;
	}

	@Override
	public ValoriPrestazione from(it.csi.apisan.apisanfse.integration.dma.ValoriPrestazione dest) {
		if(dest == null) {
			return null;
		}
		ValoriPrestazione source = new ValoriPrestazione();
		source.setQuantita(dest.getQuantita());
		return source;
	}

}
