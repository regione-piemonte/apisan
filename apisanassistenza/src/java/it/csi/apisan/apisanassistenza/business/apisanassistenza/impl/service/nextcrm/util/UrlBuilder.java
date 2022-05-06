/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanassistenza.util.LogUtil.ToLog;

public class UrlBuilder {
	String url;
	String path;
	String limitAndOffset;
	String query;

	public UrlBuilder(String url) {
		this.url = url;
	}

	public UrlBuilder path(String path) {

		if (this.path == null) {
			this.path = new String();
		}
		this.path += "/" + path;

		return this;
	}
	
	public UrlBuilder path(String path, Object... args) {
		String output = formatMessage(path, args);
		if (this.path == null) {
			this.path = new String();
		}
		this.path += "/" + output;
		return this;
	}
	
	private static String formatMessage(String message, Object... args) {
		try {
			return String.format(message, toArgs(args));
		} catch (Exception e) {
			return message 
					+ " - args: " + Arrays.toString(args) 
					+ " - formatMessage warn: " + e.getMessage();
		}
	}	
	
	private static Object[] toArgs(Object[] args) {
		for (int i = 0; i<args.length; i++) {
			Object arg = args[i];
			if(arg instanceof ToLog) {
				ToLog f = (ToLog) (arg);
				args[i] = f.apply();
			}
		}
		return args;
	}
	
	public UrlBuilder query(String paramName, String paramValue) {
		if (!StringUtils.isEmpty(paramName) && !StringUtils.isEmpty(paramValue)) {
			if (this.query == null) {
				this.query = new String("?" + paramName + "=" + paramValue);
			} else {
				this.query += new StringBuffer("&" + paramName + "=" + paramValue).toString();
			}

		}
		return this;
	}

	public UrlBuilder filter(String filter) {
		if (!StringUtils.isEmpty(filter)) {
			if (this.query == null) {
				this.query = new String("?filter=" + filter);
			} else {
				this.query += new String("&filter=" + filter);
				// this.query += " " + filter;
			}

		}
		return this;
	}

	public UrlBuilder limitOffset(String limitoffset, Integer value) {
		if (this.limitAndOffset == null) {
			if (this.query == null) {
				this.limitAndOffset = limitoffset + "=" + value.toString();
			} else {
				this.limitAndOffset = "&" + limitoffset + "=" + value.toString();
			}

		} else {
			this.limitAndOffset += "&" + limitoffset + "=" + value.toString();
		}

		return this;
	}

	public String buildUrl() {
		if (!StringUtils.isEmpty(this.path)) {
			this.url += this.path;
		}
		if (!StringUtils.isEmpty(this.query)) {
			this.url += this.query;
		} else {
			this.url += "?";
		}
		if (!StringUtils.isEmpty(this.limitAndOffset)) {
			this.url += this.limitAndOffset;
		}
		return this.url;
	}
}
