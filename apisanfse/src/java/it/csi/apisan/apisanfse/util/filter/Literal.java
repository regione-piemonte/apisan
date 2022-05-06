/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.util.filter;

public class Literal {
	
	Operator operator;
	Object value;
	
	public Literal() {
		super();
		this.operator = null;
		this.value = null;
	}
	
	public Literal(Operator operator, Object value) {
		super();
		this.operator = operator;
		this.value = value;
	}
	
	
	public Literal(String operatorString, Object value) {
		this(Operator.valueOf(operatorString.toUpperCase()), value);
	}

	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Literal [operator=" + operator + ", value=" + value + "]";
	}
	
	

}
