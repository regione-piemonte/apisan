/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.mapper;

import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelOspedale;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelOspedale.NaturaEnum;
import it.csi.apisan.apisantrovaun.dto.loccsi.Feature;

public class ModelOspedaleFeatureMapper extends BaseMapper<ModelOspedale, Feature> {

	@Override
	public Feature to(ModelOspedale source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelOspedale from(Feature dest) {
		if(dest == null) {
			return null;
		}
		
		if(dest.getProperties() == null) {
			return null;
		}
		ModelOspedale source = new ModelOspedale();
		HashMap destProp = dest.getProperties(); 

		if(dest.getGeometry() != null) {
			source.setGeo(new GeoJsonPuntoGeometryMapper().from((dest.getGeometry())));
		}
		//TODO Manca il codice asl source.setAslCodice((String)destProp.get("asl"));
		source.setAslDescrizione((String)destProp.get("asl"));
		source.setCap((String)destProp.get("cap"));
		source.setCodice((String)destProp.get("codice_struttura"));
		source.setComune((String)destProp.get("comune"));
		source.setDescrizione((String)destProp.get("denominazione_struttura"));
		source.setEmail((String)destProp.get("email"));
		source.setIndirizzo((String)destProp.get("indirizzo"));
		String natura = ((String)destProp.get("natura"));
		if(!StringUtils.isEmpty(natura)) {
			source.setNatura( NaturaEnum.valueOf(natura.toUpperCase()));
		}
		source.setProvincia((String)destProp.get("provincia"));
		source.setSitoWeb((String)destProp.get("sito_web"));
		source.setTelefono((String)destProp.get("telefono"));
		source.setTipoCodice((String)destProp.get("tipologia_struttura"));
		source.setTipoStrutturaDescrizione((String)destProp.get("desc_tipo_struttura"));
		
		return source;
	}

}
