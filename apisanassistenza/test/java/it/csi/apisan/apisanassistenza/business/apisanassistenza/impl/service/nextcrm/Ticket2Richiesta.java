/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicketNew;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.ModelRichiestaDettaglioMapper;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.IdentitaDigitale;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelDocumentoScrittura;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaCittadino;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaDettaglio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.PayloadRichiestaNuova;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.RichiesteMessaggio;

class Ticket2Richiesta {

	@Test
	void shouldConvertATicketToRichiesta() throws Exception {
		EntityBuilderForTesting builder = new EntityBuilderForTesting();
		
		String email = "a";
		String codiceFiscale = "b";
		IdentitaDigitale identitaDigitale = builder.identitaDigitale(email, codiceFiscale);
		PayloadRichiestaNuova nuovaRichiesta = builder.buildAFakeRichiestaNuova(identitaDigitale);
		ModelTicketNew newTicket = builder.buildAFakeTIcketNew(nuovaRichiesta.getAssetId());
		
		MapperObjectApisanNextCrm mapperObjectApisanNextCrm = new MapperObjectApisanNextCrm();
		ModelRichiestaDettaglio nuovaRichiestaCreata = mapperObjectApisanNextCrm
				.mapNewTicketOnRichiestaDettaglio(newTicket, nuovaRichiesta, identitaDigitale);
		assertTrue(nuovaRichiestaCreata instanceof ModelRichiestaDettaglio);
		assertNotNull(nuovaRichiestaCreata);
		
		
		ModelRichiestaDettaglio nuovaRichiestaCreataMapper = new ModelRichiestaDettaglioMapper(identitaDigitale, nuovaRichiesta).from(newTicket);

		assertTrue(nuovaRichiestaCreataMapper instanceof ModelRichiestaDettaglio);
		assertNotNull(nuovaRichiestaCreataMapper);
		
		assertTrue(nuovaRichiestaCreata.equals(nuovaRichiestaCreataMapper));
		
		nuovaRichiestaCreataMapper.setAssetId("99");
		assertFalse(nuovaRichiestaCreata.equals(nuovaRichiestaCreataMapper));
		
	}

	@Test
	void test() {
		assertTrue(true);
	}

}
