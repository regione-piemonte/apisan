/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateIsoStringUtil {
	
	public static List<DateTimeFormatter> RFC_339 = new ArrayList<DateTimeFormatter>() {
		
		private static final long serialVersionUID = 6127276418366794192L;

		{
			add(DateTimeFormatter.ISO_INSTANT);
			add(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
			add(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
			
		}

	};
	
	
	public static Date parseRFC339(String date) throws DateTimeParseException{
		Date dateIso = null;
		int count = 0;
			for(DateTimeFormatter tmpFormatter : RFC_339) {
				try {
					count++;
					dateIso = Date.from(tmpFormatter.parse(date, Instant::from));
					
				} catch (DateTimeParseException e) {
					if(count == RFC_339.size()) {
						try {
							LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
							dateIso=  Date.from(ldt.atStartOfDay(ZoneId.systemDefault()).toInstant());
						} catch (Exception e1) {
							throw e1;
						}
					}
				}
			}
			return dateIso;
		}
		
	
	
	public static Date from(String date) throws DateTimeParseException{
		Date dateIso = null;
		try {
			dateIso = Date.from(DateTimeFormatter.ISO_INSTANT.parse(date, Instant::from));
			
		}  catch (DateTimeParseException e) {
			
			try {
				LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
				dateIso = Date.from(ldt.atStartOfDay(ZoneId.systemDefault()).toInstant());
			} catch (DateTimeParseException e1) {
				
				dateIso = Date.from(DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(date, Instant::from));
			}
		}
		return dateIso;
	}

}
