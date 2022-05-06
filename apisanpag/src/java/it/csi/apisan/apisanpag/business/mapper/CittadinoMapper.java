/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.Cittadino;

public class CittadinoMapper extends BaseMapper<Cittadino, it.csi.apisan.apisanpag.dto.ptw.Cittadino> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.Cittadino to(Cittadino source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.Cittadino dest = new it.csi.apisan.apisanpag.dto.ptw.Cittadino();
		dest.setCap(source.getCap());
		dest.setCodiceFiscale(source.getCodiceFiscale());
		dest.setCap(source.getCap());
		dest.setCodiceFiscale(source.getCodiceFiscale());
		dest.setCognome(source.getCognome());
		dest.setComune(source.getComune());
		dest.setDataNascita(new DateStringMapper().to( source.getDataNascita()));
		dest.setIndirizzo(source.getIndirizzo());
		dest.setNome(source.getNome());
		dest.setProvincia(source.getProvincia());
		return dest;
	}

	@Override
	public Cittadino from(it.csi.apisan.apisanpag.dto.ptw.Cittadino dest) {
		if(dest == null) {
			return null;
		}
		Cittadino source = new Cittadino();
		source.setCap(dest.getCap());
		source.setCodiceFiscale(dest.getCodiceFiscale());
		source.setCap(dest.getCap());
		source.setCodiceFiscale(dest.getCodiceFiscale());
		source.setCognome(dest.getCognome());
		source.setComune(dest.getComune());
		source.setDataNascita(new DateStringMapper().from(dest.getDataNascita()));
		source.setIndirizzo(dest.getIndirizzo());
		source.setNome(dest.getNome());
		source.setProvincia(dest.getProvincia());
		
		return source;
		
	}

}
