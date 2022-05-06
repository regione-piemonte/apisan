/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import it.csi.apisan.apisanfse.dto.apisanfse.CittadinoArruolabile;


public class CittadinoArruolabileFascicoloMapper extends BaseMapper<CittadinoArruolabile, it.csi.apisan.apisanfse.integration.arruolamento.dma.FascicoloArruolabile> {

	@Override
	//non serve arruolabile o meno lo si legge solo (solo get) per la post si da il consenso
	public it.csi.apisan.apisanfse.integration.arruolamento.dma.FascicoloArruolabile to(CittadinoArruolabile source) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public CittadinoArruolabile from(it.csi.apisan.apisanfse.integration.arruolamento.dma.FascicoloArruolabile dest) {
		if(dest == null) {
			return null;
		}
		CittadinoArruolabile cittadino = new CittadinoArruolabile();
		cittadino.setCodiceRisposta(dest.getCodiceRisposta());
		cittadino.setDettaglioRisposta(dest.getDettaglioRisposta());
		cittadino.setRisposta(dest.getRisposta() != null && dest.getRisposta().equalsIgnoreCase("SI"));
		return cittadino;
	}

}
