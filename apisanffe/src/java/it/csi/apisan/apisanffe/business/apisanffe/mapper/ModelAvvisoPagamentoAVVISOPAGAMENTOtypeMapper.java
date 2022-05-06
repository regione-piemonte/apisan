/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.mapper;

import it.csi.apisan.apisanffe.dto.apisanffe.ModelAvvisoPagamento;
import it.csi.gpr.AVVISOPAGAMENTOtype;

public class ModelAvvisoPagamentoAVVISOPAGAMENTOtypeMapper extends BaseMapper<ModelAvvisoPagamento, AVVISOPAGAMENTOtype> {

	@Override
	public AVVISOPAGAMENTOtype to(ModelAvvisoPagamento source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAvvisoPagamento from(AVVISOPAGAMENTOtype dest) {
		if(dest == null) {
			return null;
		}
		ModelAvvisoPagamento source = new ModelAvvisoPagamento();
		source.setApplicationCode(dest.getAPPLICATIONCODE());
		try {
			source.setAuxdigit(new Integer(dest.getAUXDIGIT()));
		} catch (NumberFormatException e) {
			
		}
		source.setDataAssociazione(new DateStringMapper(DateStringMapper.DATEDDMMYYYY).from(dest.getDATAASSOCIAZIONE()) );
		source.setIuv(dest.getIUV());
		return source;
	}

}
