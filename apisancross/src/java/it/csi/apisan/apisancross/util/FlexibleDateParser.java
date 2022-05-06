/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlexibleDateParser {
	  private  List<ThreadLocal<SimpleDateFormat>> threadLocals = new  ArrayList();

	    public FlexibleDateParser(List<String> formats){
	        threadLocals.clear();
	        
	        for (final String format : formats) {
	        	ThreadLocal<SimpleDateFormat> dateFormatTL = ThreadLocal.withInitial(() -> {return new SimpleDateFormat(format);});
	            threadLocals.add(dateFormatTL);
	        }       
	    }

	    public Date parseDate(String dateStr) throws ParseException {
	        for (ThreadLocal<SimpleDateFormat> tl : threadLocals) {
	            SimpleDateFormat sdf = tl.get();
	            try {
	                return sdf.parse(dateStr);
	            } catch (ParseException e) {
	            }
	        }
	        // All parsers failed
	        return null;
	    }       
	}
