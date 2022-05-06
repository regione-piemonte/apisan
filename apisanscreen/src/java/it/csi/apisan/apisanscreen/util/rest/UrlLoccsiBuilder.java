/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.util.rest;

import org.apache.commons.lang3.StringUtils;



public class UrlLoccsiBuilder {
	String url;
	String path;
	String limitAndOffset;
	String query;
	
	public UrlLoccsiBuilder(String url) {
		this.url = url;
	}
	
	public UrlLoccsiBuilder path(String path) {
		
		if(this.path == null) {
			this.path = new String();
		}
			this.path += "/" + path;
			
		return this;
	}
	
	public UrlLoccsiBuilder query(String paramName, String paramValue) {
		if(!StringUtils.isEmpty(paramName) && !StringUtils.isEmpty(paramValue)) {
			if(this.query == null) {
				this.query = new String("?" + paramName + "=" + paramValue);
			}else {
				this.query += new StringBuffer("&" + paramName + "=" + paramValue).toString();
			}
			
		}
		return this;
	}
	
	
	public UrlLoccsiBuilder query(String query) {
		if(!StringUtils.isEmpty(query)) {
			if(this.query == null) {
				this.query = new String("?q=" + query);
			}else {
				this.query += " "  + query;
			}
			
		}
		return this;
	}
	
	public UrlLoccsiBuilder limitOffset(String limitoffset, Integer value) {
		if(this.limitAndOffset == null) {
			if(this.query == null) {
				this.limitAndOffset = limitoffset + "=" +value.toString();
			}else {
				this.limitAndOffset = "&" + limitoffset + "=" +value.toString();
			}
			
		} else {
			this.limitAndOffset += "&" + limitoffset + "=" + value.toString();
		}
		
		return this;
	}
	
	public String buildUrl() {
		if(!StringUtils.isEmpty(this.path)) {
			this.url += this.path;
		}
		if(!StringUtils.isEmpty(this.query)) {
			this.url += this.query;
		}else {
			this.url +="?";
		}
		if(!StringUtils.isEmpty(this.limitAndOffset)) {
			this.url += this.limitAndOffset;
		}
		return this.url;
		
		/*try {
			return URLEncoder.encode(url, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new IllegalArgumentException("UTF-8 encoding not supported.",e);
		}*/
	}

}
