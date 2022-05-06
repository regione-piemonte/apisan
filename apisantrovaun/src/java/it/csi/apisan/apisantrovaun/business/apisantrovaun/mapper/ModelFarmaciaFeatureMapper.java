/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.mapper;

import java.util.HashMap;

import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelFarmacia;
import it.csi.apisan.apisantrovaun.dto.loccsi.Feature;

public class ModelFarmaciaFeatureMapper extends BaseMapper<ModelFarmacia, Feature> {
	private String disponibiliAlimentiCeliaci;
	
	
	public ModelFarmaciaFeatureMapper(String disponibiliAlimentiCeliaci) {
		this.disponibiliAlimentiCeliaci = disponibiliAlimentiCeliaci;
	}
	
	@Override
	public Feature to(ModelFarmacia source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelFarmacia from(Feature dest) {
		if(dest == null) {
			return null;
		}
		if(dest.getProperties() == null) {
			return null;
		}
		ModelFarmacia source = new ModelFarmacia();
		HashMap destProp = dest.getProperties(); 

		if(dest.getGeometry() != null) {
			source.setGeo(new GeoJsonPuntoGeometryMapper().from((dest.getGeometry())));
		}
		
		//source.setCodice(dest.getId().toString());
		source.setCodice((String)destProp.get("codice_CNU"));
		source.setCap((String)destProp.get("cap"));
		
		source.setComune((String)destProp.get("comune"));
		
		source.setDescrizione((String)destProp.get("denominazione_farmacia"));
		source.setEmail((String)destProp.get("email"));
		source.setIndirizzo((String)destProp.get("indirizzo"));
		source.setProvincia((String)destProp.get("provincia"));
		source.setSitoWeb((String)destProp.get("sito_web"));
		source.setTelefono((String)destProp.get("telefono"));
		source.setTipoCodice((String)destProp.get("tipologia_struttura"));
		source.setDisponibiliAlimentiCeliaci(disponibiliAlimentiCeliaci);
		return source;
	}

}
