/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.util;

import java.util.List;
import java.util.stream.Collectors;

public class ApisanCrossUtil {
	
	/**
	 * Restituisce un sottoinsieme della lista che parte da "offset" ed ha un massimo di "limit" elementi.
	 * 
	 * @param list lista di partenza
	 * @param offset posizione elemento da cui partire
	 * @param limit massimo elementi restituiti (se null considera 10)
	 * @return
	 */
	public static <T> List<T> applyOffsetAndLimit(List<T> list, Integer offset, Integer limit) {
		if(offset == null) {
			offset = Integer.valueOf(0);
		}
		
		if(limit == null) {
			limit = Integer.valueOf(10);
		}
		
		return list.stream().skip(offset).limit(limit).collect(Collectors.toList());
		
//		int size = list.size();
//		if(size <= offset) {
//			int toIntex = offset + limit;
//			
//			if(toIntex > size) {
//				toIntex = size;
//			}
//			list = list.subList(offset, toIntex);
//		}
//		return list;
	}
}
