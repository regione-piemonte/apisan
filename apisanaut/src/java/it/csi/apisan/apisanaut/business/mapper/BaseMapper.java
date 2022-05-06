/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import java.util.List;
import java.util.stream.Collectors;

import it.csi.deleghe.deleghebe.ws.model.RuoloOperazione;

public abstract class BaseMapper<S, D> implements Mapper<S, D> {
	
	
	public List<D> toList(List<S> list){
		if(list==null) {
			return null;
		}
		return list.stream().map(s -> to(s)).collect(Collectors.toList());
	}
	
	public List<S> fromList(List<D> list){
		if(list==null) {
			return null;
		}
		return list.stream().map(s -> from(s)).collect(Collectors.toList());
	}
	
	protected RuoloOperazione ruoloOperazioneCittadino() {
		RuoloOperazione ruoloOperazione = new RuoloOperazione();
		ruoloOperazione.setCodice("CITTADINO");
		return ruoloOperazione;
	}

}
