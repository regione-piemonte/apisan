/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanceliachia.business.apisanceliachia.mapper;

import it.csi.apisan.apisanceliachia.dto.apisanceliachia.ModelStruttura;
import it.csi.celiachia.celiachiabesrv.output.xsd.Struttura;

public class ModelStrutturaStrutturaMapper extends BaseMapper<ModelStruttura, Struttura> {

	@Override
	public Struttura to(ModelStruttura source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelStruttura from(Struttura dest) {
		if (dest == null) {
			return null;
		}
		ModelStruttura source = new ModelStruttura();
		source.setCap(getJaxbElement( dest.getCap()));
		source.setCivico(getJaxbElement( dest.getId()));
		source.setComune(getJaxbElement( dest.getComune() ));
		source.setId(getJaxbElement( dest.getId()  ));
		source.setIndirizzo(getJaxbElement( dest.getIndirizzo() ));
		source.setNome(getJaxbElement( dest.getNome()  ));
		source.setProvincia(getJaxbElement( dest.getProvincia() ));
		
		return source;
	}

}
