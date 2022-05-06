/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;

import it.csi.apisan.apisanfse.dto.apisanfse.Prestazione;
import it.csi.apisan.apisanfse.integration.dma.Codifica;

public class PrestazionePrestazioneMapper extends FseCodificheBaseMapper<Prestazione, it.csi.apisan.apisanfse.integration.dma.Prestazione> {
	
	
	public PrestazionePrestazioneMapper(List<Codifica> codifiche) {
		super(codifiche);
	}

	@Override
	public it.csi.apisan.apisanfse.integration.dma.Prestazione to(Prestazione source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanfse.integration.dma.Prestazione dest = super.to(source);
		dest.setBranca(new BrancaBrancaMapper(codifiche).to(source.getBranca()));
		dest.setDataOra(new DateXMLGregorianCalendarMapper().to(source.getDataOra()));
		dest.setIdPrestazione(source.getIdPrestazione());
		dest.setValoriPrestazione(new ValoriPrestazioneValoriPrestazioneMapper().to(source.getValoriPrestazione()));
		return dest;
	}

	@Override
	public Prestazione from(it.csi.apisan.apisanfse.integration.dma.Prestazione dest) {
		if(dest == null) {
			return null;
		}
		Prestazione source = new Prestazione();
		source = (Prestazione)super.from(dest);
		source.setBranca(new BrancaBrancaMapper(codifiche).from(dest.getBranca()));
		source.setDataOra(new DateXMLGregorianCalendarMapper().from(dest.getDataOra()));
		source.setIdPrestazione(dest.getIdPrestazione());
		source.setValoriPrestazione(new ValoriPrestazioneValoriPrestazioneMapper().from(dest.getValoriPrestazione()));
		return source;
		
	}
	

}
