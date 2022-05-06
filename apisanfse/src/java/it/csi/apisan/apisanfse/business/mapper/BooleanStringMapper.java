/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

public class BooleanStringMapper extends BaseMapper<Boolean, String> {
	
	private String trueString;
	private String falseString;

	public BooleanStringMapper() {
		this("S","N");
	}
	
	public BooleanStringMapper(String trueString, String falseString) {
		if (trueString == null || falseString == null || trueString.equals(falseString)) {
			throw new IllegalArgumentException(
					"BooleanStringMapper - trueString e falseString devono essere valorizzate e diverse tra loro.");
		}
		this.trueString = trueString;
		this.falseString = falseString;
	}

	@Override
	public String to(Boolean source) {
		if(source==null) {
			return falseString;
		}
		
		return source.booleanValue()?trueString:falseString;
	}

	@Override
	public Boolean from(String dest) {
		if(dest == null) {
			return null;
		}
		return trueString.equals(dest);
	}

}
