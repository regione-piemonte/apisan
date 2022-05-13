/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.util.filter;

import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class Clause {
	Set<Literal> literals;
	String field;
	
	
	public Clause() {
		this(null, new HashSet<Literal>());
	}
	
	public Clause(String field, Set<Literal> literals) {
		super();
		this.field = field;
		this.literals = literals;
	}
	
	public Clause(String field,  Map<String, Object> object) {
		this();
		this.field = field;
		
		object.keySet().forEach(k -> this.literals.add(new Literal(k, object.get(k))));
		
	}

	public Set<Literal> getLiterals() {
		return literals;
	}
	
	public Literal getLiteral(Operator operator) {
		return literals.stream().filter(e -> e.getOperator().equals(operator)).findFirst().get();
	}
	
	public Optional<Literal> getLiteralOptional(Operator operator) {
		return literals.stream().filter(e -> e.getOperator().equals(operator)).findFirst();
	}
	
	public void setLiterals(Set<Literal> literals) {
		this.literals = literals;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "Clause [literals=" + literals + ", field=" + field + "]";
	}
	
	
	
	
 
}
