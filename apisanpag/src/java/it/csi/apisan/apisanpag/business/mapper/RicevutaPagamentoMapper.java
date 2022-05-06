/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.RicevutaPagamento;

public class RicevutaPagamentoMapper extends BaseMapper<RicevutaPagamento, it.csi.apisan.apisanpag.dto.ptw.RicevutaPagamento> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.RicevutaPagamento to(RicevutaPagamento source) {

		if(source == null) {
			return null;
		}
		
		it.csi.apisan.apisanpag.dto.ptw.RicevutaPagamento dest = new it.csi.apisan.apisanpag.dto.ptw.RicevutaPagamento();
		dest.setIdMandatoPagamento(source.getIdMandatoPagamento());
		dest.setPagamenti(new PagamentoSanitarioMapper().toList(source.getPagamenti()));
		return dest;
	}

	@Override
	public RicevutaPagamento from(it.csi.apisan.apisanpag.dto.ptw.RicevutaPagamento dest) {

		if(dest == null) {
			return null;
		}
		RicevutaPagamento source = new RicevutaPagamento();
		source.setIdMandatoPagamento(dest.getIdMandatoPagamento());
		source.setPagamenti(new PagamentoSanitarioMapper().fromList(dest.getPagamenti()));
		return source;
	}

	
	

}
