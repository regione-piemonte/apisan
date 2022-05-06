/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import java.math.BigDecimal;
import java.util.stream.Collectors;

import it.csi.apisan.apisantacc.business.dto.CancellaDoloriRequestExt;
import it.csi.apisan.apisantacc.business.dto.ModelCancellaDoloriRequest;

public class ModelCancellaDoloriReqCancellaDoloriReqMapper extends BaseMapper<ModelCancellaDoloriRequest, CancellaDoloriRequestExt>{

	@Override
	public CancellaDoloriRequestExt to(ModelCancellaDoloriRequest source) {
		CancellaDoloriRequestExt request = new CancellaDoloriRequestExt(source.getPayloadDoloreEliminaMassiva().stream().map(b -> b!=null?b.longValue():null).collect(Collectors.toList()));
	    request.setPaziente(source.getCitId());
	    request.setRichiedente(source.getRichiedenteTaccuino());
	    request.setTaccuino(source.getTaccuinoId());
	    
	    return request;
	}

	@Override
	public ModelCancellaDoloriRequest from(CancellaDoloriRequestExt dest) {
		ModelCancellaDoloriRequest request = new ModelCancellaDoloriRequest();
	    request.setCitId(dest.getPaziente());
	    request.setRichiedenteTaccuino(dest.getRichiedente());
	    request.setTaccuinoId(dest.getTaccuino());
	    request.setPayloadDoloreEliminaMassiva(dest.getListaIdentificaviDolore().stream().map(l -> l!=null?new BigDecimal(l):null).collect(Collectors.toList()));
	    
	    return request;
	}

}
