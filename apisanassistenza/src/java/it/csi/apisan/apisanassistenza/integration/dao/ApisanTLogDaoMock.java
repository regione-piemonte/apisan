/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.integration.dao;

import org.springframework.stereotype.Repository;

import it.csi.apisan.apisanassistenza.integration.dao.dto.ApisanTrace;

@Repository
public class ApisanTLogDaoMock{

	public long insertTLogChiamata(ApisanTrace trace){
		return 1;
	}
	
	public int updateTLogChiamata(ApisanTrace trace, Long id) {
		return 1;
	}
	
	
}
