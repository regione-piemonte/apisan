/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicketPayload;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.PayloadRichiestaNuovaMapper;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.IdentitaDigitale;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelDocumentoScrittura;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaCittadino;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadRichiestaNuova;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.RichiesteMessaggio;

class Richiesta2Ticket {

	
	@Test
	void shouldConvertAPayloadRichiestaToTicket() throws Exception {
		EntityBuilderForTesting builder = new EntityBuilderForTesting();
		
		String email = "a";
		String codiceFiscale = "b";
		IdentitaDigitale identitaDigitale = builder.identitaDigitale(email, codiceFiscale);
		PayloadRichiestaNuova nuovaRichiesta = builder.buildAFakeRichiestaNuova(identitaDigitale);
		
		MapperObjectApisanNextCrm mapperObjectApisanNextCrm = new MapperObjectApisanNextCrm();
		ModelTicketPayload ticket = mapperObjectApisanNextCrm.mapRichiestaOnTicket(identitaDigitale, nuovaRichiesta);
		assertTrue(ticket instanceof ModelTicketPayload);
		assertNotNull(ticket);
		
		ModelTicketPayload ticketMapper = new PayloadRichiestaNuovaMapper(identitaDigitale).to(nuovaRichiesta);
		assertTrue(ticketMapper instanceof ModelTicketPayload);
		assertNotNull(ticketMapper);

		assertEquals(ticket, ticketMapper);
	}




	@Test
	void test() {
		assertTrue(true);
	}	

}
