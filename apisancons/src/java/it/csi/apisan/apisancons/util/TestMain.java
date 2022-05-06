/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {

	public static void main(String[] args) {
		String strDaconfrontare = "0_3_4";
		String regex = "[0-9][_][0-9][_][0-9]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(strDaconfrontare);
		System.out.println("metccha: " + m.matches());
		if(!m.matches()) {
			throw new IllegalArgumentException("Stringa non nel formato [0-9_][0-9_][0-9_] "+strDaconfrontare);
		}
		
	}

}
