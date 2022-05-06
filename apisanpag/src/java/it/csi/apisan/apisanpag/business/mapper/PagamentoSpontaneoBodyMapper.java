/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import java.nio.charset.StandardCharsets;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSpontaneoBody;

public class PagamentoSpontaneoBodyMapper extends BaseMapper<PagamentoSpontaneoBody, it.csi.apisan.apisanpag.dto.ptw.PagamentoSpontaneoBody> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.PagamentoSpontaneoBody to(PagamentoSpontaneoBody source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.PagamentoSpontaneoBody dest = new it.csi.apisan.apisanpag.dto.ptw.PagamentoSpontaneoBody();
		
		dest.setIdAsr(source.getIdAsr());
		dest.setCausaleVersamento(source.getCausaleVersamento());
		dest.setMail(source.getMail());
		dest.setPagato(new ImportoMapper().to(source.getPagato()));
		dest.setPagatore(new CittadinoMapper().to(source.getPagatore()));
		dest.setVersante(new CittadinoMapper().to(source.getVersante()) );
		if(StringUtils.isNotEmpty(source.getNote())) {
			dest.setNote(new String(source.getNote().getBytes(), StandardCharsets.UTF_8) );
		}
		
		return dest;
	}

	@Override
	public PagamentoSpontaneoBody from(it.csi.apisan.apisanpag.dto.ptw.PagamentoSpontaneoBody dest) {
		if(dest == null) {
			return null;
		}
		PagamentoSpontaneoBody source = new PagamentoSpontaneoBody();
		source.setIdAsr(dest.getIdAsr());
		source.setCausaleVersamento(dest.getCausaleVersamento() );
		source.setMail(dest.getMail());
		source.setPagato(new ImportoMapper().from(dest.getPagato()));
		source.setPagatore(new CittadinoMapper().from(dest.getPagatore()));
		source.setVersante(new CittadinoMapper().from(dest.getVersante()));
		if(StringUtils.isNotEmpty(dest.getNote())) {
			source.setNote(new String(dest.getNote().getBytes(), StandardCharsets.UTF_8));
		}
		
		return source;
	}


	
}
