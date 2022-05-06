/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.util.trace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import it.csi.apisan.apisanprof.business.integration.dao.ApisanTLogDao;
import it.csi.apisan.apisanprof.business.integration.dao.dto.ApisanTrace;
import it.csi.apisan.apisanprof.util.LogUtil;

public class ApisanTraceOperationDB implements ApisanTraceOperation {
	@Autowired
	ApisanTLogDao apisanDao;
	protected LogUtil log = new LogUtil(this.getClass());
	
	public ApisanTraceOperationDB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public long traceRequest(ApisanTrace at) {
		long id = 0;
		try {
			id = apisanDao.insertTLogChiamata(at);
		} catch (DataAccessException e) {
			log.error("traceRequest", "Errore in traceRequest", e);
		}
		return id;
	}

	@Override
	public void traceResponse(ApisanTrace at, Long id) {
		try {
			apisanDao.updateTLogChiamata(at, id);
		}catch (Exception e) {
			log.error("traceResponse", "Errore in traceResponse", e);
		}
		

	}

	@Override
	public long traceAll(ApisanTrace at) {
		long id = 0;
		try {
			id = apisanDao.insertTLogChiamata(at);
		} catch (DataAccessException e) {
			log.error("traceAll", "Errore in traceAll", e);
		}
		return id;
	}


}
