/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanesen.business.mapper.BaseMapper;
import it.csi.apisan.apisanesen.business.mapper.DateStringMapper;
import it.csi.apisan.apisanesen.util.LogUtil;

public class DateStringMapper extends BaseMapper<Date, String> {
	
	private LogUtil log = new LogUtil(DateStringMapper.class);
	
	protected SimpleDateFormat sd;
	
	
	public DateStringMapper() {
		this("dd/MM/yyyy");
	}
	
	public DateStringMapper(String pattern) {
		this.sd = new SimpleDateFormat(pattern);
	}
	
	
	@Override
	public String to(Date source) {
		if(source == null) {
			return null;
		}
		return sd.format(source);
	}

	@Override
	public Date from(String dest) {
		final String METHOD_NAME = "from";
		
		if(StringUtils.isBlank(dest)) {
			return null;
		}
		try {
			return sd.parse(dest);
		}catch(ParseException pe) {
			//nel caso in cui mi trovo una data formattata in modo non corretto metto null 
			log.warn(METHOD_NAME, "Error while parsing java.util.Date from String: \"%s\". Return null.", pe, dest);
			return null;
		}
	}




}