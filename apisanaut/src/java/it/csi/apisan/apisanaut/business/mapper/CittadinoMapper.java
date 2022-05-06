/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import it.csi.apisan.apisanaut.dto.apisanaut.Cittadino;

public class CittadinoMapper extends BaseMapper<Cittadino, it.csi.deleghe.deleghebe.ws.model.Cittadino> {

	@Override
	public it.csi.deleghe.deleghebe.ws.model.Cittadino to(Cittadino source) {
		if(source == null) {
			return null;
		}
		it.csi.deleghe.deleghebe.ws.model.Cittadino result = new it.csi.deleghe.deleghebe.ws.model.Cittadino();
		
		result.setIdAura(source.getIdAura()!=null?source.getIdAura().longValue():null);
		result.setCodiceFiscale(source.getCodiceFiscale());
		result.setCognome(source.getCognome());
		result.setNome(source.getNome());
		result.setSesso(source.getSesso());
		result.setDataNascita(source.getDataNascita());
		result.setComuneNascita(source.getComuneNascita());
		result.setDocumento(new DocumentoMapper().to(source.getDocumento()));
		result.setAsl(source.getAslAssistenza());
		return result;
	}

	@Override
	public Cittadino from(it.csi.deleghe.deleghebe.ws.model.Cittadino dest) {
		if(dest == null) {
			return null;
		}
		Cittadino result = new Cittadino();
		
		result.setIdAura(dest.getIdAura()!=null?dest.getIdAura().intValue():null);
		result.setCodiceFiscale(dest.getCodiceFiscale());
		result.setCognome(dest.getCognome());
		result.setNome(dest.getNome());
		result.setSesso(dest.getSesso());
		result.setDataNascita(dest.getDataNascita());
		result.setComuneNascita(dest.getComuneNascita());
		result.setDocumento(new DocumentoMapper().from(dest.getDocumento()));
		result.setAslAssistenza(dest.getAsl());
		return result;
	}

}
