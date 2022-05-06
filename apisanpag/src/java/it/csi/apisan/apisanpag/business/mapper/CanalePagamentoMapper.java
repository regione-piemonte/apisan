/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.CanalePagamento;

public class CanalePagamentoMapper extends BaseMapper<CanalePagamento, it.csi.apisan.apisanpag.dto.ptw.CanalePagamento> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.CanalePagamento to(CanalePagamento source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.CanalePagamento cp = new it.csi.apisan.apisanpag.dto.ptw.CanalePagamento();
		cp.setCarteCommissioni(new CartaCommissioneConverter().toList(source.getCarteCommissioni()));
		cp.setDescrizione(source.getDescrizione());
		cp.setId(source.getId());
		cp.setTesoriere(new TesoriereConverter().to(source.getTesoriere()));
		cp.setTipologia(source.getTipologia());
		return cp;
	}

	@Override
	public CanalePagamento from(it.csi.apisan.apisanpag.dto.ptw.CanalePagamento dest) {
		if(dest==null) {
			return null;
		}
		CanalePagamento cp = new CanalePagamento();
		cp.setCarteCommissioni(new CartaCommissioneConverter().fromList(dest.getCarteCommissioni()));
		cp.setDescrizione(dest.getDescrizione());
		cp.setId(dest.getId());
		cp.setTesoriere(new TesoriereConverter().from(dest.getTesoriere()));
		cp.setTipologia(dest.getTipologia());
		return cp;
	}

}
