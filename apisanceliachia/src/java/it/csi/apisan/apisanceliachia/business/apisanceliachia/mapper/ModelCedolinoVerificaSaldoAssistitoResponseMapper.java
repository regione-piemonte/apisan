/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia.mapper;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelCedolino;
import it.csi.celiachia.celiachiabesrv.output.xsd.Autorizzazione;
import it.csi.celiachia.celiachiabesrv.output.xsd.VerificaSaldoAssistitoResponse;

public class ModelCedolinoVerificaSaldoAssistitoResponseMapper extends BaseMapper<ModelCedolino, VerificaSaldoAssistitoResponse> {

	@Override
	public VerificaSaldoAssistitoResponse to(ModelCedolino source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelCedolino from(VerificaSaldoAssistitoResponse dest) {
		if(dest == null) {
			return null;
		}
		ModelCedolino source = new ModelCedolino();
		source.setDataFine(new DateXMLGregorianCalendarMapper().from(getJaxbElement( dest.getDataFine())) );
		source.setDataInizio(new DateXMLGregorianCalendarMapper().from(getJaxbElement( dest.getDataInizio())) );
		BigDecimal importoDisponibile = new BigDecimal((getJaxbElement(dest.getImportoDisponibile()) ));
		if(importoDisponibile.compareTo(BigDecimal.ZERO) < 0 ) {
			importoDisponibile = BigDecimal.ZERO;
		}
		//source.setImportoDisponibile(new BigDecimal((getJaxbElement(dest.getImportoDisponibile()) )));
		source.setImportoDisponibile(importoDisponibile);
		source.setImportoTotale(new BigDecimal((getJaxbElement(dest.getImportoTotale()  )))  );
		source.setAutorizzazione( new ModelAutorizzazioneAutorizzazioneMapper().from(getJaxbElement( dest.getAutorizzazione() )) );
		
		return source;
	}

}
