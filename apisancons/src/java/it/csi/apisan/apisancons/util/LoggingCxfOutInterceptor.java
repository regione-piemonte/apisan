/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.util;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import it.csi.util.performance.StopWatch;

public class LoggingCxfOutInterceptor extends  AbstractPhaseInterceptor<Message> {
	public LoggingCxfOutInterceptor() {
		super(Phase.PRE_STREAM);
	}
	
	public LoggingCxfOutInterceptor(String phase, boolean uniqueId) {
		super(phase, uniqueId);
	}

	public LoggingCxfOutInterceptor(String i, String p, boolean uniqueId) {
		super(i, p, uniqueId);
	}

	public LoggingCxfOutInterceptor(String i, String p) {
		super(i, p);
	}


	public LoggingCxfOutInterceptor(String phase) {
		super(phase);
	}


	@Override
	public void handleMessage(Message message) throws Fault {
		/*StopWatch stopWatch = new StopWatch(Constants.STOP_WATCH_CATEGORY);
		StopWatchInInterceptor.tlStopWatch.set(stopWatch);
		StopWatchInInterceptor.tlMessage.set(message);
		stopWatch.start();*/
	}

}

