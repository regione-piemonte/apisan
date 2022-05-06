/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.CartaCommissione;

public class CartaCommissioneConverter extends BaseMapper<CartaCommissione, it.csi.apisan.apisanpag.dto.ptw.CartaCommissione> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.CartaCommissione to(CartaCommissione source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.CartaCommissione cc = new it.csi.apisan.apisanpag.dto.ptw.CartaCommissione();
		cc.setDescrizione(source.getDescrizione());
		cc.setId(source.getId());
		cc.setPathLogo(source.getPathLogo());
		return cc;
	}

	@Override
	public CartaCommissione from(it.csi.apisan.apisanpag.dto.ptw.CartaCommissione dest) {
		if(dest==null) {
			return null;
		}
		CartaCommissione cc = new CartaCommissione();
		cc.setDescrizione(dest.getDescrizione());
		cc.setId(dest.getId());
		cc.setPathLogo(dest.getPathLogo());
		return cc;
	}

}
