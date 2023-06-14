/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.util.rest;

import java.io.IOException;

import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Interceptor.Chain;

public class BasicAuthInterceptor implements Interceptor {
	
	private String credentials;
	
	public BasicAuthInterceptor(String user, String password) {
		this.credentials = Credentials.basic(user, password);
	}

	@Override
	public Response intercept(Chain chain) throws IOException {
		Request request = chain.request();
        Request authenticatedRequest = request.newBuilder()
            .header("Authorization", credentials).build();
        return chain.proceed(authenticatedRequest);
	}
}
