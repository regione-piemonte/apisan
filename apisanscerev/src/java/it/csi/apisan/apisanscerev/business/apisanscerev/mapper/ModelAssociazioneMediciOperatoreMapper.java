/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAssociazioneMedici;
import it.csi.operatori.def.opessanws.opessan.Operatore;

public class ModelAssociazioneMediciOperatoreMapper extends BaseMapper<ModelAssociazioneMedici, Operatore> {

	@Override
	public Operatore to(ModelAssociazioneMedici source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAssociazioneMedici from(Operatore dest) {
		if(dest == null) {
			return null;
		}
		ModelAssociazioneMedici source = new ModelAssociazioneMedici();
		source.setCodiceFiscale(dest.getCodFiscale());
		source.setCognome(dest.getCognome());
		source.setDataNascita(new DateXMLGregorianCalendarMapper().from(dest.getDataNascita()) );
		source.setId(dest.getIdAura());
		source.setNome(dest.getNome());
		source.setSesso(dest.getSesso());
		return source;
	}

}
