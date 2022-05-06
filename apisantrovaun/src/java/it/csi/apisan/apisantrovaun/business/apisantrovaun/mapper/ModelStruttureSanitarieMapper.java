/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.mapper;

import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelStrutturaSanitaria;
import it.csi.apisan.apisantrovaun.dto.apisantrovaun.ModelStrutturaSanitaria.NaturaEnum;
import it.csi.apisan.apisantrovaun.dto.loccsi.Feature;

public class ModelStruttureSanitarieMapper extends BaseMapper<ModelStrutturaSanitaria, Feature> {

	@Override
	public Feature to(ModelStrutturaSanitaria source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelStrutturaSanitaria from(Feature dest) {
		if(dest == null) {
			return null;
		}
		ModelStrutturaSanitaria source = new ModelStrutturaSanitaria();
		
		HashMap destProp = dest.getProperties(); 

		if(dest.getGeometry() != null) {
			source.setGeo(new GeoJsonPuntoGeometryMapper().from((dest.getGeometry())));
		}
		
		//TODO manca il codice asl source.setAslCodice((String)destProp.get("cap"));
		source.setAslDescription((String)destProp.get("asl"));
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
		source.setTipoAssistenzaCodice((String)destProp.get("codice_tipo_assistenza"));
		source.setTipoCodice((String)destProp.get("tipologia_struttura"));
		source.setTipoDescrizione((String)destProp.get("desc_tipo_struttura"));
		source.setTipoAssistenzaDescrizione((String)destProp.get("desc_tipo_assistenza"));
		
		
		return source;
		
	}
	
	/*
	 * "natura": "Pubblico",
	"loccsi_label": "Struttura: AMBULATORIO AGOPUNTURA VIA ABETI",
	"denominazione_struttura": "AMBULATORIO AGOPUNTURA VIA ABETI",
	"indirizzo": "VIA DEGLI ABETI 16",
	"desc_tipo_assistenza": "Clinica",
	"provincia": "TORINO",
	"desc_tipo_struttura": "AMBULATORIO/LABORATORIO",
	"cap": 10156,
	"codice_struttura": "001162 ",
	"comune": "TORINO",
	"sito_web": "www.aslto2.piemonte.it",
	"tipologia_struttura": "STRUTTURE SANITARIE",
	"asl": "301 A.S.L. CITTA' DI TORINO",
	"telefono": 112247347,
	"email": "",
	"codice_tipo_assistenza": "TPA_201"
	 * 
	 * */
}
