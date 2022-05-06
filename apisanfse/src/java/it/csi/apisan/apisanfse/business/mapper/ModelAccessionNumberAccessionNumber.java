/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.ModelAccessionNumber;
import it.csi.apisan.apisanfse.integration.documenti.dmacc.AccessionNumber;

public class ModelAccessionNumberAccessionNumber extends BaseMapper<ModelAccessionNumber, AccessionNumber>{

	@Override
	public AccessionNumber to(ModelAccessionNumber source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAccessionNumber from(AccessionNumber dest) {
		if(dest==null) {
			return null;
		}
		ModelAccessionNumber modelAccessionNumber = new ModelAccessionNumber();
		modelAccessionNumber.setAccessionNumber(dest.getAccessionNumber());
		modelAccessionNumber.setDataNotificaPacs(new DateTStringMapper().from(dest.getDataNotificaPacs()));
		//modelAccessionNumber.setStatoGenerazionePacchetto(dest.getStatoGenerazionePacchetto());
		return modelAccessionNumber;    
	}

}
