/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.PingGet;
import junit.framework.TestCase;

public class PingTest extends TestCase {
	
	public void testAdd() {
		int result = 1 + 1;
		assertTrue(result == 2);
	}

	public void testGet() {
		PingGet ping = new PingGet();
		assertEquals("pong", ping.get());
	}

	public void testNow() {
		PingGet ping = new PingGet();
		assertTrue(ping.now() > 0);
	}

}
