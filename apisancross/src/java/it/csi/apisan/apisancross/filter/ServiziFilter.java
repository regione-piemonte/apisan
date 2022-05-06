/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisancross.dto.apisancross.Servizio;
import it.csi.apisan.apisancross.dto.apisancross.ServizioFilter;
import it.csi.apisan.apisancross.util.LogUtil;
import it.csi.apisan.apisancross.util.filter.FilterUtil;

public class ServiziFilter implements ModelFilter<Servizio> {
	protected LogUtil log = new LogUtil(this.getClass());
	
	@Override
	public List<Servizio> doFilter(List<Servizio> list, String filter) {
		final String METHOD_NAME = "doFilter";
		log.debug(METHOD_NAME, "filter: %s", filter);
		
		if (StringUtils.isBlank(filter)) {
			return list;
		}
		
		ServizioFilter f = FilterUtil.init(ServizioFilter.class, filter);
		
		log.debug(METHOD_NAME, "f: "+f);
		
		Stream<Servizio> stream = list.stream();
		
		if(f.getCodiceServizio() !=null && StringUtils.isNotBlank(f.getCodiceServizio().getEq())) {
			stream = stream.filter(c -> f.getCodiceServizio().getEq().equals(c.getCodiceServizio()));
		}
		
		if(f.getArruolabile()!=null) {
			stream = stream.filter(c -> f.getArruolabile().isEq().equals(c.isArruolabile()));
		}
		
		if(f.getDelegabile() != null) {
			stream = stream.filter(c -> f.getDelegabile().isEq().equals(c.isDelegabile()));
		}
		
		if(f.getNotificabile() != null) {
			stream = stream.filter(c -> f.getNotificabile().isEq().equals(c.isNotificabile()));
		}
		
		if(f.getObbligatorioArruolamento() != null) {
			stream = stream.filter(c -> f.getObbligatorioArruolamento().isEq().equals(c.isObbligatorioArruolamento()));
		}		
		
		List<Servizio> result = stream.collect(Collectors.toList());
		return result;
	}

}
