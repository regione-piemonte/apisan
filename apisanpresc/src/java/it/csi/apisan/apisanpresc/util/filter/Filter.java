/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.util.filter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class Filter {
	
	Set<Clause> clauses;
	
	public Filter() {
		this(new HashSet<Clause>());
	}

	public Filter(Set<Clause> clauses) {
		super();
		this.clauses = clauses;
	}
	
	@SuppressWarnings("unchecked")
	public Filter(String filterJSONParam) {
		this();
		if(filterJSONParam==null) {
			return;
		}
		ObjectMapper om = new ObjectMapper();
		Map<String, Map<String, Object>> filter;
		try {
			filter = om.readValue(filterJSONParam, Map.class);
		} catch (JsonParseException e) {
			throw new IllegalArgumentException("Errore nel parsing del parametro JSON. Verificarne la sintassi.", e);
		} catch (JsonMappingException e) {
			throw new IllegalArgumentException("Errore nel mapping del parametro JSON.", e);
		} catch (IOException e) {
			throw new IllegalArgumentException("Errore di IO nella lettura del parametro JSON.", e);
		} catch (ClassCastException cce) {
			throw new IllegalArgumentException("Errore nel parametro JSON. Verificare formato.", cce);
		}
		
		filter.entrySet().stream().forEach(entry -> this.clauses.add(new Clause(entry.getKey(), entry.getValue())));
	}
	
	public Clause getClause(String clause) {
		return clauses.stream().filter(c -> c.field.equals(clause)).findFirst().get();
	}
	
	public Optional<Clause> getClauseOptional(String clause) {
		return clauses.stream().filter(c -> c.field.equals(clause)).findFirst();
	}

	public Set<Clause> getClauses() {
		return clauses;
	}

	public void setClauses(Set<Clause> clauses) {
		this.clauses = clauses;
	}
	
	public Optional<Literal> getLiteral(String clause, Operator operator) {
		return this.getClauseOptional(clause).map(c -> c.getLiteral(operator));
	}
	
	public Optional<Object> get(String clause, Operator operator) {
		return this.getClauseOptional(clause).map(c -> c.getLiteralOptional(operator)).map(literalOptional -> {
			
			Optional<Object> value = literalOptional.map(lit -> lit.getValue());
			return value.isPresent()? value.get(): null;
		});
	}
	
	public Optional<String> getString(String clause, Operator operator) {
		Optional<Object> value = get(clause, operator);
		return value.map(s -> (String)s);
	}
	
	public Optional<Integer> getInteger(String clause, Operator operator) {
		Optional<Object> value = get(clause, operator);
		return value.map(s -> (Integer)s);
	}

	@Override
	public String toString() {
		return "Filter [clauses=" + clauses + "]";
	}
	
	
	
	
	
	

}
