/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util.cxf;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class TraceInInterceptor extends AbstractPhaseInterceptor<Message> {


	public TraceInInterceptor() {
		super(Phase.RECEIVE);
	}
	
	public TraceInInterceptor(String phase, boolean uniqueId) {
		super(phase, uniqueId);
	}

	public TraceInInterceptor(String i, String p, boolean uniqueId) {
		super(i, p, uniqueId);
	}

	public TraceInInterceptor(String i, String p) {
		super(i, p);
	}

	@Override
	public void handleMessage(Message msg) throws Fault {
		
//		Map<String, List<String>> headers = (Map<String, List<String>>)  msg.get(Message.PROTOCOL_HEADERS);
//		System.out.println(headers);
//		System.out.println(msg);

	}
}
