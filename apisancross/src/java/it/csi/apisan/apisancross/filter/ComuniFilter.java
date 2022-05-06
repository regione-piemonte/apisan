/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.filter;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisancross.dto.apisancross.Comune;
import it.csi.apisan.apisancross.dto.apisancross.ComuneFilter;
import it.csi.apisan.apisancross.util.LogUtil;
import it.csi.apisan.apisancross.util.filter.FilterUtil;

public class ComuniFilter implements ModelFilter<Comune> {
	
	protected LogUtil log = new LogUtil(this.getClass());
	private static final Charset UTF_8 = Charset.forName("UTF-8");
	private static final Charset ISO = Charset.forName("ISO-8859-1");
	
	public List<Comune> doFilter(List<Comune> comuni, String filter) {
		final String METHOD_NAME = "doFilter";
		log.debug(METHOD_NAME, "filter: %s", filter);
		
		if (StringUtils.isBlank(filter)) {
			return comuni;
		}
		
		
		
		
		ComuneFilter f = FilterUtil.init(ComuneFilter.class, filter);
		log.debug(METHOD_NAME, "f: "+f);
		
		Stream<Comune> stream = comuni.stream();
		
		if(f.getCodiceCatasto()!=null && StringUtils.isNotBlank(f.getCodiceCatasto().getEq())) {
			stream = stream.filter(c -> f.getCodiceCatasto().getEq().equals(c.getCodiceCatasto()));
		}
		
		if(f.getDesc()!=null && StringUtils.isNotBlank(f.getDesc().getEq())) {
			stream = stream.filter(c -> f.getDesc().getEq().equalsIgnoreCase(c.getDesc()));
		} //aggiungo il filtro si
		if(f.getDesc()!=null && StringUtils.isNotBlank(f.getDesc().getSi())){
			
			//String si =  new String(f.getDesc().getSi().getBytes(ISO), UTF_8);
			//log.debug("ComuniFilter", "filter desc: %s ", si);
			
			stream = stream.filter(c -> c.getDesc().toUpperCase().startsWith(f.getDesc().getSi().toUpperCase()));
			//stream = stream.filter(c -> c.getDesc().toUpperCase().startsWith(si));
		}
		if(f.getDataValidita()!=null && f.getDataValidita().getEq()!=null) {
			//stream.forEach(c -> System.out.println(c.getDesc() + " data Inizio validita " + c.getDataInizioValidita())) ;
			//System.out.println("Data validita: " + f.getDataValidita().getEq());
			stream = stream.filter(c -> f.getDataValidita().getEq().compareTo(c.getDataInizioValidita()) > -1 );
			
			stream = stream.filter( c-> Objects.isNull(c.getDataFineValidita()) || (c.getDataFineValidita().compareTo(f.getDataValidita().getEq()) > -1 ))  ;
				
		}
		
		
		
		List<Comune> result = stream.collect(Collectors.toList());
		return result;
			
		
		
		
//		static final String  FILTER_COD_COMUNE = "istat_comune";
//		static final String  FILTER_COD_REGIONE = "istat_regione";
//		static final String FILTER_NOME = "desc_comune";	
		
		
//		List<Comune> comuniRit = new ArrayList<Comune>();
//		//prima cosa verifico che il filtro passato sia consentito
//		String filtr = null;
//		if(filter.contains(FILTER_COD_COMUNE)) {
//			filtr = FILTER_COD_COMUNE;
//		} else if(filter.contains(FILTER_COD_REGIONE)) {
//			filtr = FILTER_COD_REGIONE;
//		}else if(filter.contains(FILTER_NOME)) {
//			filtr = FILTER_NOME;
//		}		
//			//listaFiltri.stream().anyMatch(f -> f.contains(filter));
//		
//		
//		Filter filtro = new Filter(filter);
//		//gestisco per ora solo la ricerca per cod_istat_comune 
//		Clause clause = filtro.getClause(filtr);
//		Literal literal = clause.getLiteral(Operator.EQ);
//		String codice = (String) literal.getValue();
//		
//		//Le lambda non funzionano con spring 3.1 o passo a spring 4 o uso ciclo for
//		/*for(Iterator<Comune> iter = comuni.iterator(); iter.hasNext();) {
//			Comune comTmp = iter.next();
//			if(comTmp.getCodIstatComune().equals(codice)) {
//				comuniRit.add(comTmp);
//			}
//		}*/
//		//comuniRit.add(comuniOrigin.stream().filter(c -> c.getCodIstatComune().equals(codice)).findFirst().get());
//		
//		if(filter.contains(FILTER_COD_COMUNE)) {
//			comuniRit = comuniOrigin.stream().filter(c -> c.getIstatComune().equals(codice)).collect(Collectors.toList());
//		} else if(filter.contains(FILTER_COD_REGIONE)) {
//			comuniRit = comuniOrigin.stream().filter(c -> c.getIstatRegione().equals(codice)).collect(Collectors.toList());
//		}else if(filter.contains(FILTER_NOME)) {
//			comuniRit = comuniOrigin.stream().filter(c -> c.getDescComune().equalsIgnoreCase(codice)).collect(Collectors.toList());
//		}
//		
//		
//		//comuniRit.add(comuniOrigin.stream().filter(c -> c.getCodIstatComune().equals(codice)).collect(Collectors.toList()));
//		
//		return comuniRit;
	}
	
	
}
