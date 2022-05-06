/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util.cxf;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class TraceOutInterceptor extends AbstractPhaseInterceptor<Message> {


	public TraceOutInterceptor() {
		super(Phase.PRE_STREAM);
	}
	
	public TraceOutInterceptor(String phase, boolean uniqueId) {
		super(phase, uniqueId);
	}

	public TraceOutInterceptor(String i, String p, boolean uniqueId) {
		super(i, p, uniqueId);
	}

	public TraceOutInterceptor(String i, String p) {
		super(i, p);
	}


	@Override
	public void handleMessage(Message message) throws Fault {
		// TODO Auto-generated method stub
		
	}


}
