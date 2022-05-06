/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelTicketPagatoRicevutaPagamento;
import it.csi.gpr.LMSRicevutePagamentoTicketPagatiType;

public class ModelTicketPagatoRicevutaPagamentoLMSRicevutePagamentoTicketPagatiTypeMapper extends BaseMapper<ModelTicketPagatoRicevutaPagamento, LMSRicevutePagamentoTicketPagatiType> {

	@Override
	public LMSRicevutePagamentoTicketPagatiType to(ModelTicketPagatoRicevutaPagamento source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelTicketPagatoRicevutaPagamento from(LMSRicevutePagamentoTicketPagatiType dest) {
		if(dest == null) {
			return null;
		}
		ModelTicketPagatoRicevutaPagamento source = new ModelTicketPagatoRicevutaPagamento();
		source.setDataPagamento(new DateStringMapper(DateStringMapper.DATEYYYMMDD).from(dest.getDATAPAGAMENTO())  );
		source.setEsitoId(dest.getIDESITO());
		source.setId(dest.getIDRICEVUTA());
		source.setRtId(dest.getIDRT());
		return source;
		
	}

}
