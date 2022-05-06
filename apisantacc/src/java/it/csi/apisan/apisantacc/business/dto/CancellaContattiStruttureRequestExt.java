/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.dto;

import java.util.List;

import it.csi.dma.dmaclbluc.CancellaContattiStruttureRequest;

public class CancellaContattiStruttureRequestExt extends CancellaContattiStruttureRequest{
	
	public CancellaContattiStruttureRequestExt(List<Long> listaIdentificaviContatto) {
		super.idContatto=listaIdentificaviContatto;
	}

}
