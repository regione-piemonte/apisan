/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.util.cxf;

import java.util.Arrays;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import it.csi.util.performance.StopWatch;

public class StopWatchInInterceptor extends AbstractPhaseInterceptor<Message> {
	protected static final ThreadLocal<StopWatch> tlStopWatch = new ThreadLocal<>();
	protected static final ThreadLocal<Message> tlMessage = new ThreadLocal<>();
	
	public StopWatchInInterceptor() {
		super(Phase.RECEIVE);
	}
	
	public StopWatchInInterceptor(String phase, boolean uniqueId) {
		super(phase, uniqueId);
	}

	public StopWatchInInterceptor(String i, String p, boolean uniqueId) {
		super(i, p, uniqueId);
	}

	public StopWatchInInterceptor(String i, String p) {
		super(i, p);
	}

	public StopWatchInInterceptor(String phase) {
		super(phase);
	}


	@Override
	public void handleMessage(Message message) throws Fault {
		StopWatch stopWatch = StopWatchInInterceptor.tlStopWatch.get();
		Message messageRequest = tlMessage.get();
		stopWatch.stop();
		stopWatch.dumpElapsed(StopWatchOutInterceptor.class.getSimpleName(), "handleMessage", context(message), message(message, messageRequest));
		
		
	}

	private String context(Message message) {
		return "entries";
	}
	

	private String message(Message message, Message messageRequest) {
		
		StringBuilder sb = new StringBuilder();
		
		Arrays.asList(
				"org.apache.cxf.message.Message.RESPONSE_CODE",
				"org.apache.cxf.message.Message.ENDPOINT_ADDRESS",
				"org.apache.cxf.service.model.MessageInfo"
				).forEach(k -> 
			sb.append(" - "+ k + ": "+ value(k, message, messageRequest))
		);
		
		
		return sb.toString();
		
		//return entries(message) + entries(messageRequest);
		
	}
	
	
	private Object value(String key, Message message, Message messageRequest) {
		Object result = message.get(key);
		if(result==null) {
			result = messageRequest.get(key);
		}
		return result;
	}

//	private String entries(Message message) {
//		StringBuilder sb = new StringBuilder();
//		message.entrySet().forEach(entry -> 
//			sb.append(" - " + entry.getKey() + ": " + entry.getValue())
//		);
//		return sb.toString();
//	}
	
}
