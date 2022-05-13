/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.soap;

import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpHeaderInterceptor extends AbstractPhaseInterceptor<Message> {
	
	public HttpHeaderInterceptor() {
		super(Phase.POST_LOGICAL);
	}

	public void handleMessage(Message message) {
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put("", Arrays.asList(""));
		message.put(Message.PROTOCOL_HEADERS, headers);
	}
}
