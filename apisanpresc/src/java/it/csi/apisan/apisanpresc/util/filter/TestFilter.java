/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.util.filter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestFilter {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String filterParam = new String(Files.readAllBytes(Paths.get("C:\\workspaces\\apisan\\testFilter\\src\\it\\csi\\apisan\\apisancross\\util\\filter\\filterParam.txt")), "UTF-8");
		
		
		Filter filter = new Filter(filterParam);
		
		
		System.out.println(filter);
		
		Clause clause = filter.getClause("scarpe");
		System.out.println("clause: "+ clause);
		
		Literal literal = clause.getLiteral(Operator.GT);
		System.out.println("literal: " + literal);
		
		System.out.println("value: " + literal.getValue()); //filter.getClause("scarpe").getLiteral(Operator.GT).getValue());
		
		Optional<Object> scarpeGt = filter.get("scarpe", Operator.GT);
		System.out.println("scarpeGt: " + scarpeGt);
		System.out.println("scarpeGt.get(): " + scarpeGt.get());
		
		Optional<String> scarpeLt = filter.getString("scarpe", Operator.IN);
		System.out.println("scarpeLt: " + scarpeLt);
		scarpeLt.ifPresent(v -> System.out.println("scarpeLt.get(): " +v));

	}

}
