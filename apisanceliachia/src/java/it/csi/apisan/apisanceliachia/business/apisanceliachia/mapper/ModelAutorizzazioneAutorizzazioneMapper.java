/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia.mapper;

import javax.xml.datatype.XMLGregorianCalendar;

import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelAutorizzazione;
import it.csi.celiachia.celiachiabesrv.output.xsd.Autorizzazione;

public class ModelAutorizzazioneAutorizzazioneMapper extends BaseMapper<ModelAutorizzazione, Autorizzazione> {

	@Override
	public Autorizzazione to(ModelAutorizzazione source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAutorizzazione from(Autorizzazione dest) {
		if(dest == null) {
			return null;
		} 
		ModelAutorizzazione source = new ModelAutorizzazione();
		source.setCodice( getJaxbElement( dest.getCodice()) );
		source.setDataValiditaFine(new DateXMLGregorianCalendarMapper().from(getJaxbElement( dest.getDataValiditaFine() )) );
		source.setDataValiditaInizio(new DateXMLGregorianCalendarMapper().from(getJaxbElement( dest.getDataValiditaInizio() ))  );
		
		return source;
		
	}

}
