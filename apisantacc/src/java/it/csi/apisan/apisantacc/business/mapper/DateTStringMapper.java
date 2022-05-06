/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;


public class DateTStringMapper extends BaseMapper<Date, String> {
	private static DateTimeFormatter fullDTF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.0");
	//protected DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);

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
		/*	try {
				return df.parse(dest);
			} catch (ParseException ex) {
				return null;
			}*/
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
		/*	try {
				return df.parse(dest);
			} catch (ParseException ex) {
				return null;
			}*/
		}
	}

}
