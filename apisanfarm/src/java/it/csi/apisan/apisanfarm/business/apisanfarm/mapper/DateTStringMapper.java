/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.mapper;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;


public class DateTStringMapper extends BaseMapper<Date, String> {
	DateTimeFormatter fullDTF = null;
	public static final String FORMATOyyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";

	public DateTStringMapper(String format) {
		fullDTF = DateTimeFormatter.ofPattern(format);
	}


	@Override
	public String to(Date source) {
		if(source == null) {
			return null;
		}

		try {
			LocalDateTime ldt = source.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
			return ldt.format(fullDTF);
		}catch(Exception e) {
			return null;

		}
	}

	@Override
	public Date from(String dest) {
		if(StringUtils.isBlank(dest)) {
			return null;
		}
		try {
			LocalDateTime ldt = LocalDateTime.parse(dest, fullDTF);
			return Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
		}catch(Exception e) {
			return null;
		}
	}

}
