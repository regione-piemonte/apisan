/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

public class DateTStringMapper extends BaseMapper<Date, String> {
	private static DateTimeFormatter fullDTF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.0");
	//protected DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);

	@Override
	public String to(Date source) {
		// TODO Auto-generated method stub
		return null;
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
		/*	try {
				return df.parse(dest);
			} catch (ParseException ex) {
				return null;
			}*/
		}
	}

}
