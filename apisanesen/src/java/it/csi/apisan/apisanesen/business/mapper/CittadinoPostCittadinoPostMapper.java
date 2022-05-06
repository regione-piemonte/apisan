/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.mapper;

import it.csi.apisan.apisanesen.dto.apisanesen.CittadinoPost;
import it.csi.apisan.apisanesen.dto.apisanesen.Luogo;

public class CittadinoPostCittadinoPostMapper extends BaseMapper<CittadinoPost, it.csi.apisan.apisanesen.dto.red.CittadinoPost> {
	String pattern = "yyyy-MM-dd";
	
	@Override
	public it.csi.apisan.apisanesen.dto.red.CittadinoPost to(CittadinoPost source) {
		it.csi.apisan.apisanesen.dto.red.CittadinoPost dest = new it.csi.apisan.apisanesen.dto.red.CittadinoPost();
		dest.setCodiceFiscale(source.getCodiceFiscale());
		dest.setCognome(source.getCognome());
		dest.setDataNascita(new DateStringMapper(pattern).to(source.getDataNascita()));
		dest.setLuogoNascita(source.getLuogoNascita().getCodice());
		dest.setNome(source.getNome());
		dest.setSesso(source.getSesso());
		return dest;
	}

	@Override
	public CittadinoPost from(it.csi.apisan.apisanesen.dto.red.CittadinoPost dest) {
		CittadinoPost source = new CittadinoPost();
		source.setCodiceFiscale(dest.getCodiceFiscale());
		source.setCognome(dest.getCognome());
		source.setDataNascita(new DateStringMapper(pattern).from(dest.getDataNascita()));
		if(dest.getLuogoNascita() != null) {
			Luogo luogoNascita = new Luogo();
			luogoNascita.setCodice(dest.getLuogoNascita());
		}
		source.setNome(dest.getNome());
		source.setSesso(source.getSesso());
		return source;
	}

}
