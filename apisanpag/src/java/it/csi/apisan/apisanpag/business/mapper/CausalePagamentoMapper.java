/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.CausalePagamento;

public class CausalePagamentoMapper extends BaseMapper<CausalePagamento, it.csi.apisan.apisanpag.dto.ptw.CausalePagamento> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.CausalePagamento to(CausalePagamento source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.CausalePagamento cp = new it.csi.apisan.apisanpag.dto.ptw.CausalePagamento();
		cp.setCodiceVersamento(source.getCodiceVersamento());
		cp.setDescrizione(source.getDescrizione());
		cp.setId(source.getId());
		
		return cp;
	}

	@Override
	public CausalePagamento from(it.csi.apisan.apisanpag.dto.ptw.CausalePagamento dest) {
		if(dest==null) {
			return null;
		}
		CausalePagamento cp = new CausalePagamento();
		cp.setCodiceVersamento(dest.getCodiceVersamento());
		cp.setDescrizione(dest.getDescrizione());
		cp.setId(dest.getId());
		
		return cp;
	}

}
