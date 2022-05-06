/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.impl.base.service.rest;

import java.io.IOException;

import it.csi.apisan.apisantrovaun.util.LogUtil;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HttpLoggingInterceptor implements Interceptor {
	LogUtil log = new LogUtil(this.getClass());
	
	
	@Override
	public Response intercept(Chain chain) throws IOException {
		Request request = chain.request();

		long t1 = System.nanoTime();
		log.debug("OkHttp", String.format("Sending request %s on %s%n%s",
				request.url(), chain.connection(), request.headers()));

		Response response = chain.proceed(request);

		long t2 = System.nanoTime();
		log.debug("OkHttp", String.format("Received response for %s in %.1fms%n%s",
				response.request().url(), (t2 - t1) / 1e6d, response.headers()));

		return response;
	}
	
	
	
	
	/*
	 * class LoggingInterceptor implements Interceptor {
  @Override public Response intercept(Chain chain) throws IOException {
    Request request = chain.request();

    long t1 = System.nanoTime();
    Log.d("OkHttp", String.format("Sending request %s on %s%n%s",
        request.url(), chain.connection(), request.headers()));

    Response response = chain.proceed(request);

    long t2 = System.nanoTime();
    Log.d("OkHttp", String.format("Received response for %s in %.1fms%n%s",
        response.request().url(), (t2 - t1) / 1e6d, response.headers()));

    return response;
  }
}
	 * 
	 * */
}
