/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.util.rest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class CallBuilder {
	
	private String url;
	private String path;
	private Call call;
	private Map<String, String> queryParams;
	
	public CallBuilder(String url) {
		this.url = url;
	}
	
	private CallBuilder path(String path) {
		this.path=cleanFirstSlash(path);
		return this;
	}
	
	public CallBuilder queryParam(String key, String value) {
		if(this.queryParams == null) {
			this.queryParams = new HashMap<>();
		}
		if(StringUtils.isNotBlank(value)) {
			this.queryParams.put(key, value);
		}
		return this;
	}
	
	
	private String queryParams() {
		if(this.queryParams==null) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder("");
		
		this.queryParams.entrySet().forEach(e -> 
			sb.append("&")
				.append(urlEncode(e.getKey()))
				.append("=")
				.append(urlEncode(e.getValue()))
		);
		
		
		if(sb.length()>0) {
			sb.replace(0, 1, "?"); //sostituisco il primo & con ?.
		}
		return sb.toString();
	}
	
	public Call build() {
		Request request = new Request.Builder()
				.url(url)
				.build();
		
        OkHttpClient client = new OkHttpClient();
        call = client.newCall(request);  
        return call;
	}
	
	
	private static String urlEncode(String filter) {
		try {
			return URLEncoder.encode(filter!=null?filter:"", "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new IllegalArgumentException("UTF-8 encoding not supported.",e);
		}
	}
	
	private static String cleanLastSlash(String url) {
		if(url==null) {
			return null;
		}
		if(url.endsWith("/")) {
			url = url.substring(0, url.length()-1);
		}
		return url;
	}
	
	private static String cleanFirstSlash(String url) {
		if(url==null) {
			return null;
		}
		if(url.startsWith("/")) {
			url = url.substring(1, url.length());
		}
		return url;
	}
}
