/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.dto;

import java.math.BigDecimal;
import java.util.List;

public class ModelCancellaDoloriRequest extends ModelRequestCommon{

	private List<BigDecimal>  payloadDoloreEliminaMassiva;

	public List<BigDecimal> getPayloadDoloreEliminaMassiva() {
		return payloadDoloreEliminaMassiva;
	}

	public void setPayloadDoloreEliminaMassiva(List<BigDecimal> payloadDoloreEliminaMassiva) {
		this.payloadDoloreEliminaMassiva = payloadDoloreEliminaMassiva;
	}

	
	
	 
}
