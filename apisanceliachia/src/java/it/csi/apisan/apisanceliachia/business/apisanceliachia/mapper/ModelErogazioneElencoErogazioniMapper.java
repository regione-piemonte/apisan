/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia.mapper;

import javax.xml.datatype.XMLGregorianCalendar;

import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelErogazione;
import it.csi.celiachia.celiachiabesrv.output.xsd.ElencoErogazioni;
import it.csi.celiachia.celiachiabesrv.output.xsd.Struttura;

public class ModelErogazioneElencoErogazioniMapper extends BaseMapper<ModelErogazione, ElencoErogazioni> {

	@Override
	public ElencoErogazioni to(ModelErogazione source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelErogazione from(ElencoErogazioni dest) {
		if(dest == null) {
			return null;
		}
		ModelErogazione source = new ModelErogazione();
		source.setData(new DateXMLGregorianCalendarMapper().from(getJaxbElement( dest.getData())));
		source.setId(getJaxbElement( dest.getId()));
		source.setImporto(new BigDecimalDoubleMapper().from(getJaxbElement( dest.getImporto()) ) );
		source.setStruttura(new ModelStrutturaStrutturaMapper().from(getJaxbElement( dest.getStruttura()))   );
		return source;
	}

}
