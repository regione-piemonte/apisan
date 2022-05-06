/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.util;

import com.fasterxml.jackson.databind.JsonNode;

public class JsonNodeUtils {
	
	private JsonNodeUtils() {
		//private empty constructor
	}
	
	
	public static String asText(JsonNode jn) {
		if (jn == null) {
			return null;
		}
		return jn.asText();
	}
	
	public static String asText(JsonNode jn, String def) {
		if (jn == null) {
			return def;
		}
		return jn.asText(def);
	}
	
	
	public static Boolean asBoolean(JsonNode jn) {
		if (jn == null) {
			return null;
		}
		return jn.asBoolean();
	}
	
	public static Boolean asBoolean(JsonNode jn, boolean def) {
		if (jn == null) {
			return def;
		}
		return jn.asBoolean(def);
	}
	
	
	public static Double asDouble(JsonNode jn) {
		if (jn == null) {
			return null;
		}
		return jn.asDouble();
	}
	
	public static Double asDouble(JsonNode jn, double def) {
		if (jn == null) {
			return def;
		}
		return jn.asDouble(def);
	}
	
	public static Integer asInt(JsonNode jn) {
		if (jn == null) {
			return null;
		}
		return jn.asInt();
	}
	
	public static Integer asInt(JsonNode jn, int def) {
		if (jn == null) {
			return def;
		}
		return jn.asInt(def);
	}
	
	public static Long asLong(JsonNode jn) {
		if (jn == null) {
			return null;
		}
		return jn.asLong();
	}
	
	public static Long asLong(JsonNode jn, long def) {
		if (jn == null) {
			return def;
		}
		return jn.asLong(def);
	}
	

}
