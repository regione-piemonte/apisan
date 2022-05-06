/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.dto;

import java.util.List;

import it.csi.dma.dmaclbluc.CancellaDoloriRequest;

public class CancellaDoloriRequestExt extends CancellaDoloriRequest {
		
	public CancellaDoloriRequestExt(List<Long> listaIdentificaviDolore){
		super.idDolore=listaIdentificaviDolore;
	}
	
	public List<Long> getListaIdentificaviDolore(){
		return super.idDolore;
	}

}
