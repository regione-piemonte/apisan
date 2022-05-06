/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.util.trace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import it.csi.apisan.apisanffe.business.integration.dao.ApisanTLogDao;
import it.csi.apisan.apisanffe.business.integration.dao.dto.ApisanTrace;

public class ApisanTraceOperationDB implements ApisanTraceOperation {
	@Autowired
	ApisanTLogDao apisanDao;
	
	public ApisanTraceOperationDB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public long traceRequest(ApisanTrace at) {
		long id = 0;
		try {
			id = apisanDao.insertTLogChiamata(at);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public void traceResponse(ApisanTrace at, Long id) {
		try {
			apisanDao.updateTLogChiamata(at, id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public long traceAll(ApisanTrace at) {
		long id = 0;
		try {
			id = apisanDao.insertTLogChiamata(at);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return id;
	}


}
