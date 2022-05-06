/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.mapper;

import it.csi.apisan.apisancons.dto.apisancons.Informativa;

public class InformativaInformativaMapper extends BaseMapper<Informativa, it.csi.apisan.apisancons.integration.conspref.consprefbe.Informativa> {

	@Override
	public it.csi.apisan.apisancons.integration.conspref.consprefbe.Informativa to(Informativa source) {
		it.csi.apisan.apisancons.integration.conspref.consprefbe.Informativa dest = new it.csi.apisan.apisancons.integration.conspref.consprefbe.Informativa();
		dest.setIdInformativa(source.getIdInformativa());
		dest.setDescInformativa(source.getDescInformativa());
		dest.setDataDecorrenza(new DateXMLGregorianCalendarMapper().to(source.getDataDecorrenza()));
		dest.setDataScadenza(new DateXMLGregorianCalendarMapper().to(source.getDataScadenza()));
		dest.setSottoTipoConsenso(new SottoTipoConsensoSottoTipoConsensoMapper().to(source.getSottoTipoConsenso()));
		dest.setTipoConsenso(new TipoConsensoTipoConsensoMapper().to(source.getTipoConsenso()) );
	
		return dest;
	}

	@Override
	public Informativa from(it.csi.apisan.apisancons.integration.conspref.consprefbe.Informativa dest) {
		Informativa source = new Informativa();
		source.setIdInformativa(dest.getIdInformativa());
		source.setDescInformativa(dest.getDescInformativa());
		source.setDataDecorrenza(new DateXMLGregorianCalendarMapper().from(dest.getDataDecorrenza()));
		source.setDataScadenza(new DateXMLGregorianCalendarMapper().from(dest.getDataScadenza()));
		source.setSottoTipoConsenso(new SottoTipoConsensoSottoTipoConsensoMapper().from(dest.getSottoTipoConsenso()));
		source.setTipoConsenso(new TipoConsensoTipoConsensoMapper().from(dest.getTipoConsenso()));
		
		return source;
	}

}
