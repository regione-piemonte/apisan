/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.util.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseRESTBaseService.MetadatiDocumentoSRWrapper;
import it.csi.apisan.apisanfse.business.mapper.ModelEtichettaEtichetta2Mapper;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEtichetta;
import it.csi.apisan.apisanfse.integration.dma.MetadatiDocumentoSR;
import it.csi.apisan.apisanfse.integration.etichette.dma.Etichetta;
import it.csi.apisan.apisanfse.util.ConstantsFse;
import it.csi.apisan.apisanfse.util.CostantiConsenso;

public class TestFilter {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		
		String url = String.format("prova"+"?cfRichiedente=%s&cfAssistito=%s&idDocumentoIlec=%s&codCL=%s&archivioDocumentoIlec=%s&codApplicazione=%s&codVerticale=%s&codRuolo=%s&pin=%s", 
				"shibIdentitaCodiceFiscale", "citId", "idDocumento", "codiceCl", "archivioDocumentoIlec", ConstantsFse.WEBAPP_DMA, ConstantsFse.WEBAPP_DMA, CostantiConsenso.CODICE_REGIME, 
				ConstantsFse.PIN_CODE);
		

		
		System.out.println("url " + url);
		
		/*Etichetta etichetta = new Etichetta();
		etichetta.setTesto("prova");
		etichetta.setIdEtichetta(new Long(45));
		ModelEtichettaEtichetta2Mapper mapper = new ModelEtichettaEtichetta2Mapper(Etichetta.class);
		
		ModelEtichetta cc = mapper.from(etichetta);
		
		System.out.println("testo: " + cc.getTesto() + "idEtichetta: " + cc.getId());
		
		// prova test

		TestFilter test = new TestFilter();
		test.testGetMetadati();
*/
		/*
		 * String filterParam = new String(Files.readAllBytes(Paths.get(
		 * "C:\\workspaces\\apisan\\testFilter\\src\\it\\csi\\apisan\\apisancross\\util\\filter\\filterParam.txt"
		 * )), "UTF-8");
		 * 
		 * 
		 * Filter filter = new Filter(filterParam);
		 * 
		 * 
		 * System.out.println(filter);
		 * 
		 * Clause clause = filter.getClause("scarpe"); System.out.println("clause: "+
		 * clause);
		 * 
		 * Literal literal = clause.getLiteral(Operator.GT);
		 * System.out.println("literal: " + literal);
		 * 
		 * System.out.println("value: " + literal.getValue());
		 * //filter.getClause("scarpe").getLiteral(Operator.GT).getValue());
		 * 
		 * Optional<Object> scarpeGt = filter.get("scarpe", Operator.GT);
		 * System.out.println("scarpeGt: " + scarpeGt);
		 * System.out.println("scarpeGt.get(): " + scarpeGt.get());
		 * 
		 * Optional<String> scarpeLt = filter.getString("scarpe", Operator.IN);
		 * System.out.println("scarpeLt: " + scarpeLt); scarpeLt.ifPresent(v ->
		 * System.out.println("scarpeLt.get(): " +v));
		 */

	}

	protected void testGetMetadati() {

			List<MetadatiDocumentoSR> metadati = new ArrayList<>();

			metadati.add(newMetadatiDocumentoSR("metadato1", new GregorianCalendar(2019, 2 /*0-based*/, 20, 10, 53)));
			metadati.add(newMetadatiDocumentoSR("metadato3", new GregorianCalendar(2019, 2 /*0-based*/, 20, 8, 54)));
			metadati.add(newMetadatiDocumentoSR("metadato1", new GregorianCalendar(2019, 2 /*0-based*/, 21, 11, 53)));
			metadati.add(newMetadatiDocumentoSR("metadato1", null));
			metadati.add(newMetadatiDocumentoSR("metadato2", new GregorianCalendar(2019, 2 /*0-based*/, 20, 9, 53)));
			metadati.add(newMetadatiDocumentoSR("metadato3", new GregorianCalendar(2019, 2 /*0-based*/, 20, 8, 53)));
			metadati.add(newMetadatiDocumentoSR("metadato1", new GregorianCalendar(2019, 2 /*0-based*/, 20, 11, 53)));
			metadati.add(newMetadatiDocumentoSR("metadato4", null));

			metadati.forEach(d -> System.out.println(d.getCodiceDocumentoDipartimentale() + " - "+ d.getDataInserimento()));

			List<MetadatiDocumentoSR> metadatiSdoppiati = getMetadatiDocumentoSdoppiati(metadati);
			metadatiSdoppiati.stream().forEach(d -> System.out.println("Codice dipartimentale: "
					+ d.getCodiceDocumentoDipartimentale() + " data: " + d.getDataInserimento()));


	}

	private MetadatiDocumentoSR newMetadatiDocumentoSR(String codiceDocuentoDipartimentale, GregorianCalendar gc) {
		MetadatiDocumentoSR metadato = new MetadatiDocumentoSR();
		metadato.setCodiceDocumentoDipartimentale(codiceDocuentoDipartimentale);
		try {
			metadato.setDataInserimento(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
		} catch (DatatypeConfigurationException e) {
			throw new IllegalArgumentException("Errore configurazione della data.", e);
		} catch (NullPointerException npe) {
			metadato.setDataInserimento(null);
		}
		return metadato;
	}

	protected List<MetadatiDocumentoSR> getMetadatiDocumentoSdoppiati(List<MetadatiDocumentoSR> metadatiDocumenti) {
		/*
		 * List<MetadatiDocumentoSR> nuovaLista = new ArrayList(); int i = 0;
		 * for(MetadatiDocumentoSR tmp : metadatiDocumenti) { if(i > 0) { for(int x = i;
		 * x ==0; x --) { if(tmp.getCodiceDocumentoDipartimentale() ==
		 * metadatiDocumenti.get(i -1).getCodiceDocumentoDipartimentale()) {
		 * 
		 * } }
		 * 
		 * } }
		 * 
		 * return nuovaLista;
		 */
		// return
		// metadatiDocumenti.stream().map(MetadatiDocumentoSRWrapper::new).sorted().max()
		// metadatiDocumenti.stream().max(Comparator.comparing(keyExtractor))
		return metadatiDocumenti.stream().map(MetadatiDocumentoSRWrapper::new).sorted().distinct()
				.map(MetadatiDocumentoSRWrapper::unwrap).collect(Collectors.toList());
	}


}
