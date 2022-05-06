/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.dto;

import java.util.List;

import it.csi.dma.dmaclbluc.ListaPreferenzeRequest;
import it.csi.dma.dmaclbluc.PreferenzaRequest;

public class ListaPreferenzeRequestExt extends ListaPreferenzeRequest{
	
	public ListaPreferenzeRequestExt(List<PreferenzaRequest> preferenze) {
		super.preferenza=preferenze;
	}
	

}
