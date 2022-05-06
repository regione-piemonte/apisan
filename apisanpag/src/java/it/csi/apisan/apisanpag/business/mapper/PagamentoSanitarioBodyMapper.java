/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitarioBody;

public class PagamentoSanitarioBodyMapper extends BaseMapper<PagamentoSanitarioBody, it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitarioBody> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitarioBody to(PagamentoSanitarioBody source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitarioBody dest = new it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitarioBody();
		dest.setMail(source.getMail());
		dest.setPos(new CartaCommissioneConverter().to(source.getPos()));
		dest.setPraticheDaPagare(new PraticaInCarrelloMapper().toList(source.getPraticheDaPagare()));
		if(source.getPraticheDaRimborsare() != null) {
			dest.setPraticheDaRimborsare(new PraticadaRimborsareMapper().toList(source.getPraticheDaRimborsare()));
		}
		dest.setPsp(source.isPsp());
		dest.setVersante(new CittadinoMapper().to(source.getVersante()));
		
		return dest;
	}

	@Override
	public PagamentoSanitarioBody from(it.csi.apisan.apisanpag.dto.ptw.PagamentoSanitarioBody dest) {
		if(dest == null) {
			return null;
		}
		PagamentoSanitarioBody source = new PagamentoSanitarioBody();
		
		source.setMail(dest.getMail());
		source.setPos(new CartaCommissioneConverter().from(dest.getPos()));
		source.setPraticheDaPagare(new PraticaInCarrelloMapper().fromList(dest.getPraticheDaPagare()));
		if(dest.getPraticheDaRimborsare() != null) {
			source.setPraticheDaRimborsare(new PraticadaRimborsareMapper().fromList(dest.getPraticheDaRimborsare()) );
		}
		source.setPsp(dest.isPsp());
		source.setVersante(new CittadinoMapper().from(dest.getVersante()));
		
		return source;
	}

}
