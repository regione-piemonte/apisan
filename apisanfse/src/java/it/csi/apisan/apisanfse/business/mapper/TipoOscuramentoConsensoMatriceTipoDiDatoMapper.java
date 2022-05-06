/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.integration.oscuramento.dma.ConsensoMatriceTipoDato;
import it.csi.apisan.apisanfse.util.TipoOscuramento;

public class TipoOscuramentoConsensoMatriceTipoDiDatoMapper extends BaseMapper<TipoOscuramento, ConsensoMatriceTipoDato> {

	@Override
	public ConsensoMatriceTipoDato to(TipoOscuramento source) {
		if(source == null) {
			return null;
		}
		ConsensoMatriceTipoDato dest = new ConsensoMatriceTipoDato();
		
		dest.setDescrizione( source.toString());
		dest.setCodice(source.name());  
		
		return dest;
		
	}

	@Override
	public TipoOscuramento from(ConsensoMatriceTipoDato dest) {
		// TODO Auto-generated method stub
		return null;
	}

}
