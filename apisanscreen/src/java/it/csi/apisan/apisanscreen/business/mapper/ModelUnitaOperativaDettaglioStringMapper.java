/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import java.math.BigDecimal;

import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint;
import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint3D;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelIndirizzoGeo;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelUnitaOperativaDettaglio;

public class ModelUnitaOperativaDettaglioStringMapper extends BaseMapper<ModelUnitaOperativaDettaglio, String> {

	@Override
	public String to(ModelUnitaOperativaDettaglio source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelUnitaOperativaDettaglio from(String dest) {
		if(dest == null) {
			return null;
		}
		ModelUnitaOperativaDettaglio source = new ModelUnitaOperativaDettaglio();
		String[] unita = dest.split("\\~");
		try {
			source.setDipartimentoCodice(unita[0]);
		}catch(Exception e) {
		}
		try {
			source.setAslCodice(unita[1]);
		}catch(Exception e) {
		}
		try {
			source.setCodice(unita[2]);
		}catch(Exception e) {
		}
		try {
			source.setAgendaCodice(unita[3]);
		}catch(Exception e) {
		}
		try {
			source.setDescrizione(unita[4]);
		}catch(Exception e) {
		}
		try {
			source.setIndirizzo(unita[5]);
		}catch(Exception e) {
		}
		try {
			source.setCivico(unita[6]);
		}catch(Exception e) {
		}
		try {
			source.setCap(unita[7]);
		}catch(Exception e) {
		}
		try {
			source.setComuneDescrizione(unita[8]);
		}catch(Exception e) {	
		}
		ModelIndirizzoGeo indirizzoGeo = new ModelIndirizzoGeo(); 
		try {
			GeoJsonPoint punto = new GeoJsonPoint(); 
			punto.setType(GeoJsonPoint.TypeEnum.POINT);
			GeoJsonPoint3D coordinate = new GeoJsonPoint3D();
			coordinate.add(new BigDecimal(unita[9]));
			coordinate.add(new BigDecimal(unita[10]));
			punto.setCoordinates(coordinate);
			indirizzoGeo.setCoordinate(punto);
		}catch(Exception e) {	
		}
		try {
			indirizzoGeo.setCivico(unita[14]); // CIVICO_STRA
			indirizzoGeo.setComune( unita[15]); //COMUNE_STRA 
			indirizzoGeo.setPrepStradario(unita[12]); // PREP_STRA 
			indirizzoGeo.setTipoViaStradario(unita[11]); // TIPOV_STRA
			indirizzoGeo.setVia(unita[13]); // VIA_STRA );
		}catch(Exception e) {	
		}
		source.setIndirizzoGeo(indirizzoGeo);
		try {
			source.setDataPrimoAppuntamentoDisponibile(new DateStringMapper().from(unita[16]));
		}catch(Exception e) {			
		}
		
		return source;
	}
	
}
