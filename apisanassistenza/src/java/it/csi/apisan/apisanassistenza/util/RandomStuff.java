/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.util;

import java.util.Random;

public final class RandomStuff {
	
	public static String aString() {
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	    
	    return generatedString;

	}
	
	public static Integer anInteger() {
		int min = 1;
		int max = 10000;
		return (int) ((Math.random() * (max - min)) + min);
	}	
	
	public static String anEmail() {
		StringBuilder email = new StringBuilder();
		email.append(aString());
		email.append("@");
		email.append(aString());
		email.append(".com");
	    return email.toString();

	}		

}
