/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.ServizioAttivoGet;
import junit.framework.TestCase;

public class ServizioAttivoTest extends TestCase {

	public void testGet() {
		ServizioAttivoGet servizioAttivo = new ServizioAttivoGet();
		assertNotNull(servizioAttivo.get());
		assertTrue(servizioAttivo.get().isServizioAttivo());
	}

}
