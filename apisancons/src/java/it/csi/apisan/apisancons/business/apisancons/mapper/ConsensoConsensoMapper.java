/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.mapper;

import it.csi.apisan.apisancons.dto.apisancons.Consenso;

public class ConsensoConsensoMapper extends BaseMapper<Consenso, it.csi.apisan.apisancons.integration.conspref.consensocittadino.Consenso> {

	@Override
	public it.csi.apisan.apisancons.integration.conspref.consensocittadino.Consenso to(Consenso source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisancons.integration.conspref.consensocittadino.Consenso dest = new it.csi.apisan.apisancons.integration.conspref.consensocittadino.Consenso();
		dest.setCfCittadino(source.getCfCittadino());
		dest.setCfDelegato(source.getCfDelegato());
		if(source.getDataAcquisizione() != null) {
			dest.setDataAcquisizione(new DateXMLGregorianCalendarMapper().to(source.getDataAcquisizione()));
		}
		
		dest.setIdAura(source.getIdAura());
		if(source.getUuid() != null) {
			dest.setUuid(source.getUuid().toString());
		}
		
		dest.setTipoStato(new TipoStatoTipoStatoMapper().to(source.getTipoStato()));
		dest.setUuid(new UUIDMapper().to(source.getUuid()));
		dest.setTipoAsr(new TipoAsrTipoAsrMapper().to(source.getAsr()));
		it.csi.apisan.apisancons.integration.conspref.consprefbe.Informativa info = new it.csi.apisan.apisancons.integration.conspref.consprefbe.Informativa();
		info.setIdInformativa(source.getIdInformativa());
		dest.setInformativa(info);
		dest.setValoreConsenso(new ValoreConsensoValoreConsensoMapper().to(source.getValoreConsenso()));
	
		return dest;
	}

	@Override
	public Consenso from(it.csi.apisan.apisancons.integration.conspref.consensocittadino.Consenso dest) {
		if(dest == null) {
			return null;
		}
		Consenso source = new Consenso();
		source.setCfCittadino(dest.getCfCittadino());
		source.setCfDelegato(dest.getCfDelegato());
		source.setCognome(dest.getCognome());
		source.setNome(dest.getNome());
		source.setDataAcquisizione(new DateXMLGregorianCalendarMapper().from(dest.getDataAcquisizione()));
		source.setIdAura(dest.getIdAura());
		source.setTipoStato(new TipoStatoTipoStatoMapper().from(dest.getTipoStato()) );
		source.setUuid(new UUIDMapper().from(dest.getUuid()) );
		source.setIdInformativa(dest.getInformativa().getIdInformativa());
		source.setValoreConsenso(new ValoreConsensoValoreConsensoMapper().from(dest.getValoreConsenso()));
		source.setAsr(new TipoAsrTipoAsrMapper().from(dest.getTipoAsr()));
		return source;
	}

}
