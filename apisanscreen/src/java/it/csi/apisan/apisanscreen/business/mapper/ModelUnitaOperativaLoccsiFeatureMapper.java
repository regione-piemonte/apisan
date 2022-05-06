/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import java.util.HashMap;

import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelUnitaOperativaLoccsi;
import it.csi.apisan.apisanscreen.dto.loccsi.Feature;

public class ModelUnitaOperativaLoccsiFeatureMapper extends BaseMapper<ModelUnitaOperativaLoccsi, Feature> {

	@Override
	public Feature to(ModelUnitaOperativaLoccsi source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelUnitaOperativaLoccsi from(Feature dest) {
		if(dest == null) {
			return null;
		}
		
		if(dest.getProperties() == null) {
			return null;
		}
		ModelUnitaOperativaLoccsi source = new ModelUnitaOperativaLoccsi();
		HashMap destProp = dest.getProperties(); 

		if(dest.getGeometry() != null) {
			source.setGeo(new GeoJsonPuntoGeometryMapper().from((dest.getGeometry())));
		}
		
		source.setCodice((String)destProp.get("cod_unpr"));
		
		//TODO Verificare manca source.setAgendaCodice(agendaCodice);
		source.setAslCodice((String)destProp.get("cod_azienda"));
		//TODO Verificare manca descrizione Asl source.setAslDescrizione((String)destProp.get("descrizione"));
		//TODO Verificare manca il cap source.setCap((String)destProp.get("descrizione"));
		//TODO Manca il civico source.setCivico(civico);
		source.setComuneDescrizione((String)destProp.get("comune"));
		//TODO Manca il comune istat source.setComuneIstat(comuneIstat);
		source.setDescrizione((String)destProp.get("descrizione"));
		source.setDipartimentoCodice((String)destProp.get("cod_dipartimento"));
		source.setIndirizzo((String)destProp.get("indirizzo"));
		//TODO Manca la provincia source.setProvinciaCodice(provinciaCodice);
		//TODO Campi in piu cod_tiposcreen 
		
		
		return source;
		
	}

}
