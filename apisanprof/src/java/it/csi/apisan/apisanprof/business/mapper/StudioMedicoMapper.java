/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.business.mapper;

import java.util.Iterator;

import it.csi.apisan.apisanprof.dto.apisanprof.GiornoApertura;
import it.csi.apisan.apisanprof.dto.apisanprof.StudioMedico;
import it.csi.def.opessanws.opessan.GiorniApertura;


public class StudioMedicoMapper extends BaseMapper<StudioMedico, it.csi.def.opessanws.opessan.StudioMedico> {

	@Override
	public it.csi.def.opessanws.opessan.StudioMedico to(StudioMedico source) {
		// TODO Auto-generated method stub
		//non si può mappare non offre la set sui giorni di apertura
		it.csi.def.opessanws.opessan.StudioMedico dest = new it.csi.def.opessanws.opessan.StudioMedico();
		
		GiorniApertura giorni = new GiorniApertura();
		for(Iterator<GiornoApertura> i = source.getGiorniApertura().iterator(); i.hasNext();) {
			giorni.getGiornoApertura().add(new GiornoAperturaMapper().to(i.next()));
		}
		dest.setASL(source.getAsl());
		dest.setCap(source.getCap());
		dest.setCodASL(source.getCodAsl());
		dest.setComune(source.getComune());
		dest.setDenominazione(source.getDenominazione());
		dest.setEmail(source.getEmail());
		
		dest.setIndicatoreAmbCondiviso(source.getIndicatoreAmbCondiviso());
		dest.setIndicatoreAmbPubblico(source.getIndicatoreAmbPubblico());
		dest.setIndirizzo(source.getIndirizzo());
		dest.setNumCivico(source.getNumCivico());
		dest.setQualifica(source.getQualifica());
		dest.setTelPrimario(source.getTelPrimario());
		dest.setTelSecondario(source.getTelSecondario());
		dest.setTipo(source.getTipo());

		return dest;
	}

	@Override
	public StudioMedico from(it.csi.def.opessanws.opessan.StudioMedico dest) {
		// TODO Auto-generated method stub
		StudioMedico source = new StudioMedico();
		
		source.setAsl(dest.getASL());
		source.setCap(dest.getCap());
		source.setCodAsl(dest.getCodASL());
		source.setComune(dest.getComune());
		source.setDenominazione(dest.getDenominazione());
		source.setEmail(dest.getEmail());
		
		//new GiornoAperturaMapper().from(dest)
		source.setGiorniApertura(new GiornoAperturaMapper().fromList(dest.getGiorniApertura().getGiornoApertura()));
		
		source.setIndicatoreAmbCondiviso(dest.getIndicatoreAmbCondiviso());
		source.setIndicatoreAmbPubblico(dest.getIndicatoreAmbPubblico());
		source.setIndirizzo(dest.getIndirizzo());
		source.setNumCivico(dest.getNumCivico());
		source.setQualifica(dest.getQualifica());
		source.setTelPrimario(dest.getTelPrimario());
		source.setTelSecondario(dest.getTelSecondario());
		source.setTipo(dest.getTipo());
		return source;
	}

}
