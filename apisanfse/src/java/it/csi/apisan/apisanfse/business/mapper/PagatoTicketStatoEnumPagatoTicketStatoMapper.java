/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.Referto.PagatoTicketStatoEnum;
import it.csi.apisan.apisanfse.integration.dma.PagatoTicketStato;

public class PagatoTicketStatoEnumPagatoTicketStatoMapper extends BaseMapper<PagatoTicketStatoEnum,PagatoTicketStato> {

	@Override
	public PagatoTicketStato to(PagatoTicketStatoEnum source) {
		if(source==null) {
			return null;
		}
		return PagatoTicketStato.valueOf(source.name());
	}

	@Override
	public PagatoTicketStatoEnum from(PagatoTicketStato dest) {
		if(dest==null) {
			return null;
		}
		return PagatoTicketStatoEnum.valueOf(dest.name());
	}

	

}
