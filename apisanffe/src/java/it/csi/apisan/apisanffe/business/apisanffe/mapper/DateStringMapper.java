/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class DateStringMapper extends BaseMapper<Date, String> {
	public static final String DATEYYYMMDD = "yyyy-MM-dd";
	public static final String DATEDDMMYYYY =  "dd/MM/yyyy";
	private static DateTimeFormatter dF =  DateTimeFormatter.ISO_LOCAL_DATE;
	
	
	public DateStringMapper(String formato) {
		dF = DateTimeFormatter.ofPattern(formato);
	}
	
	@Override
	public String to(Date source) {

		if(source == null) {
			return null;
		}
				
		try {
			LocalDate ldt = source.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			return ldt.format(dF);
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
			LocalDate ldt = LocalDate.parse(dest, dF);
			return  Date.from(ldt.atStartOfDay(ZoneId.systemDefault()).toInstant());
		}catch(Exception e) {
			return null;
		}
	}

}
