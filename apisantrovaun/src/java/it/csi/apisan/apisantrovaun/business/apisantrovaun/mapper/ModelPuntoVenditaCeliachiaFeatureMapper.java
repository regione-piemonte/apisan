/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.mapper;

import java.util.HashMap;

import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelPuntoVenditaCeliachia;
import it.csi.apisan.apisantrovaun.dto.loccsi.Feature;

public class ModelPuntoVenditaCeliachiaFeatureMapper extends BaseMapper<ModelPuntoVenditaCeliachia, Feature> {

	@Override
	public Feature to(ModelPuntoVenditaCeliachia source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelPuntoVenditaCeliachia from(Feature dest) {
		
		if(dest == null) {
			return null;
		}
		
		if(dest.getProperties() == null) {
			return null;
		}
		ModelPuntoVenditaCeliachia source = new ModelPuntoVenditaCeliachia();
		HashMap destProp = dest.getProperties(); 

		if(dest.getGeometry() != null) {
			source.setGeo(new GeoJsonPuntoGeometryMapper().from((dest.getGeometry())));
		}
		
		source.setAslCodice((String)destProp.get("asl"));
		//source.setAslDescrizione(aslDescrizione);  manca non lo trovo
		source.setCap((String)destProp.get("cap"));
		source.setCodice((String)destProp.get("id_univoco"));
		source.setComune((String)destProp.get("nome_comune"));
		source.setDescrizione((String)destProp.get("denominazione"));
		source.setEmail((String)destProp.get("email"));
		source.setIndirizzo((String)destProp.get("nome_via")); //vedo anche parte dell'indirizzo su loccsilabel
		source.setProvincia((String)destProp.get("provincia"));
		source.setSitoWeb((String)destProp.get("sito_web"));
		source.setTelefono((String)destProp.get("telefono"));
		source.setTipoCodice((String)destProp.get("tipologia_struttura"));
		//source.setTipoDescrizione((String)destProp.get("telefono")); manca non la trovo
		
		return source;
	}

}
