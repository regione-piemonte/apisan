/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.util;

import org.apache.commons.lang3.StringUtils;

public class ApisanscerevUtil {
	
	public static boolean verificaStringaValorizzata(String daVisualizzare) {
		return (StringUtils.isNotEmpty(daVisualizzare) && StringUtils.isNotBlank(daVisualizzare));
	}
}
