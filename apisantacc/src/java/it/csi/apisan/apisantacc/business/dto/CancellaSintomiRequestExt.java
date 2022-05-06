/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.dto;

import java.util.List;

import it.csi.dma.dmaclbluc.CancellaSintomiRequest;

public class CancellaSintomiRequestExt extends CancellaSintomiRequest {
		
	public CancellaSintomiRequestExt(List<Long> listaIdentificaviSintomo){
		super.idSintomo=listaIdentificaviSintomo;
	}		

}
