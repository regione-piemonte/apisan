/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisanfse.dto.apisanfse.Referto;
import it.csi.apisan.apisanfse.util.LogUtil;
import it.csi.apisan.apisanfse.util.filter.Filter;
import it.csi.apisan.apisanfse.util.filter.FilterUtil;
import it.csi.apisan.apisanfse.util.filter.Operator;

public class RefertoFilter implements ModelFilter<Referto> {
	
	protected LogUtil log = new LogUtil(this.getClass());
	
	public List<Referto> doFilter(List<Referto> referti, String filter) {
		final String METHOD_NAME = "doFilter";
		log.debug(METHOD_NAME, "filter: %s", filter);
		if (StringUtils.isBlank(filter)) {
			return referti;
		}
		
		Filter f;
		try {
			f = FilterUtil.init(filter);
			log.debug(METHOD_NAME, "f: "+f);
		} catch(IllegalArgumentException iae) {
			log.warn(METHOD_NAME, "filtro errato. Verra' ignorato. JSON: %s", filter);
			return referti;
		}
		
		
		Stream<Referto> stream = referti.stream();
	
		
		
		f.get("data_annullamento", Operator.EQ)
				.ifPresent(dataAnnullamento -> stream.filter(referto -> dataAnnullamento.equals(referto.getDataAnnullamento())));
		
		f.get("data_episodio", Operator.EQ).ifPresent(
				dataAnnullamento -> stream.filter(referto -> dataAnnullamento.equals(referto.getDataEpisodio())));
		
		
		List<Referto> result = stream.collect(Collectors.toList());
		return result;
	}

	
	
}
