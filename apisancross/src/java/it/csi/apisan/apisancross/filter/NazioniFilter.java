/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.filter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisancross.dto.apisancross.Nazione;
import it.csi.apisan.apisancross.dto.apisancross.NazioneFilter;
import it.csi.apisan.apisancross.util.LogUtil;
import it.csi.apisan.apisancross.util.filter.FilterUtil;

public class NazioniFilter implements ModelFilter<Nazione> {
	
	protected LogUtil log = new LogUtil(this.getClass());
	
	public List<Nazione> doFilter(List<Nazione> nazioni, String filter) {
		final String METHOD_NAME = "doFilter";
		log.debug(METHOD_NAME, "filter: %s", filter);
		if (StringUtils.isBlank(filter)) {
			return nazioni;
		}
		

		NazioneFilter f = FilterUtil.init(NazioneFilter.class, filter);
		log.debug(METHOD_NAME, "f: "+f);
		
		Stream<Nazione> stream = nazioni.stream();
		
		if(f.getCodiceIstat()!=null && StringUtils.isNotBlank(f.getCodiceIstat().getEq())) {
			stream = stream.filter(c -> f.getCodiceIstat().getEq().equals(c.getCodiceIstat()));
		}
		
		if(f.getDesc()!=null && StringUtils.isNotBlank(f.getDesc().getEq())) {
			stream = stream.filter(c -> f.getDesc().getEq().equals(c.getDesc()));
		}
		if(f.getDesc()!=null && StringUtils.isNotBlank(f.getDesc().getSi())) {
			stream = stream.filter(c -> c.getDesc().toUpperCase().startsWith(f.getDesc().getSi().toUpperCase()));
		}
		if(f.getTerritorio() != null && StringUtils.isNotBlank(f.getTerritorio().getEq()) ) {
			stream = stream.filter(c -> f.getTerritorio().getEq().equals(c.getTerritorio()));
		}
		if(f.getTerritorio() != null && StringUtils.isNotBlank(f.getTerritorio().getSi())) {
			stream = stream.filter(c -> c.getTerritorio().toUpperCase().startsWith(f.getTerritorio().getSi()) );
		}
		
		if(f.getDataValidita()!=null && f.getDataValidita().getEq()!=null) {
			
			stream = stream.filter(c -> f.getDataValidita().getEq().compareTo(c.getDataInizioValidita()) > -1 );
			
			stream = stream.filter( c-> Objects.isNull(c.getDataFineValidita()) || (c.getDataFineValidita().compareTo(f.getDataValidita().getEq()) > -1 ))  ;
				
		}
		
		List<Nazione> result = stream.collect(Collectors.toList());
		return result;
			

	}
	
	
}
