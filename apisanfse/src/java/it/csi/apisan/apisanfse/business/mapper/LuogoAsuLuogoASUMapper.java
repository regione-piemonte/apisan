/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import java.util.List;

import it.csi.apisan.apisanfse.dto.apisanfse.LuogoAsu;
import it.csi.apisan.apisanfse.integration.dma.Codifica;
import it.csi.apisan.apisanfse.integration.dma.LuogoASU;

public class LuogoAsuLuogoASUMapper extends BaseMapper<LuogoAsu, LuogoASU> {
	
	private List<Codifica> codifiche;

	public LuogoAsuLuogoASUMapper(List<Codifica> codifiche) {
		this.codifiche = codifiche;
	}

	
	
	@Override
	public LuogoASU to(LuogoAsu source) {
		if(source==null) {
			return null;
		}
		LuogoASU result = new LuogoASU();
		result.setAzienda(new AziendaSanitariaAziendaSanitariaMapper(null).to(source.getAzienda()));
		result.setStruttura(new StrutturaSanitariaMapper(null).to(source.getStruttura()));
		result.setUnitaOperativa(new UnitaOperativaSanitariaMapper(null).to(source.getUnitaOperativa()));
		return result;
	}

	@Override
	public LuogoAsu from(LuogoASU dest) {
		if(dest==null) {
			return null;
		}
		LuogoAsu result = new LuogoAsu();
		result.setAzienda(new AziendaSanitariaAziendaSanitariaMapper(codifiche).from(dest.getAzienda()));
		result.setStruttura(new StrutturaSanitariaMapper(codifiche).from(dest.getStruttura()));
		result.setUnitaOperativa(new UnitaOperativaSanitariaMapper(codifiche).from(dest.getUnitaOperativa()));
		return result;
	}

}
