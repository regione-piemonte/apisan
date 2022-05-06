/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.Asr;

public class AsrMapper extends BaseMapper<Asr, it.csi.apisan.apisanpag.dto.ptw.Asr> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.Asr to(Asr source) {
		if(source==null) {
			return null;
		}
		
		it.csi.apisan.apisanpag.dto.ptw.Asr a = new it.csi.apisan.apisanpag.dto.ptw.Asr();
		a.setCanalePos(new CanalePagamentoMapper().to(source.getCanalePos()));
		a.setCanalePsp(source.isCanalePsp());
		a.setCausaliVersamento(new CausalePagamentoMapper().toList(source.getCausaliVersamento()));
		a.setDescrizione(source.getDescrizione());
		a.setId(source.getId());
		a.setPresidiSanitari(new PresidioSanitarioMapper().toList(source.getPresidiSanitari()));
		
		return a;
	}

	@Override
	public Asr from(it.csi.apisan.apisanpag.dto.ptw.Asr dest) {
		if(dest==null) {
			return null;
		}
		
		Asr a = new Asr();
		a.setCanalePos(new CanalePagamentoMapper().from(dest.getCanalePos()));
		a.setCanalePsp(dest.isCanalePsp());
		a.setCausaliVersamento(new CausalePagamentoMapper().fromList(dest.getCausaliVersamento()));
		a.setDescrizione(dest.getDescrizione());
		a.setId(dest.getId());
		a.setPresidiSanitari(new PresidioSanitarioMapper().fromList(dest.getPresidiSanitari()));
		
		return a;
	}

}
