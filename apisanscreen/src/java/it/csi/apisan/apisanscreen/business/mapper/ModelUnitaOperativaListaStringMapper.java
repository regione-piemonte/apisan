/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import java.math.BigDecimal;

import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint;
import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint3D;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelIndirizzoGeo;
import it.csi.apisan.apisanscreen.dto.apisanscreen.ModelUnitaOperativaLista;

public class ModelUnitaOperativaListaStringMapper extends BaseMapper<ModelUnitaOperativaLista, String> {

	@Override
	public String to(ModelUnitaOperativaLista source) {
		return null;
	}

	@Override
	public ModelUnitaOperativaLista from(String dest) {
		if(dest == null) {
			return null;
		}
		ModelUnitaOperativaLista source = new ModelUnitaOperativaLista();
		String[] unitaOperativa = dest.split("\\~");
		
		source.setComuneIstat (unitaOperativa[0]);
		source.setComuneDescrizione(unitaOperativa[1]);
		source.setAslCodice(unitaOperativa[2]);
		source.setProvinciaCodice(unitaOperativa[3]);
		source.setDescrizione(unitaOperativa[4]);
		source.setIndirizzo(unitaOperativa[5]);
		source.setCodice(unitaOperativa[6]);
		
		ModelIndirizzoGeo indirizzoGeo = new ModelIndirizzoGeo(); 
		try {
			GeoJsonPoint punto = new GeoJsonPoint(); 
			punto.setType(GeoJsonPoint.TypeEnum.POINT);
			GeoJsonPoint3D coordinate = new GeoJsonPoint3D();
			coordinate.add(new BigDecimal(unitaOperativa[7]));
			coordinate.add(new BigDecimal(unitaOperativa[8]));
			punto.setCoordinates(coordinate);
			indirizzoGeo.setCoordinate(punto);
		}catch(Exception e) {	
		}
		try {
			indirizzoGeo.setTipoViaStradario(unitaOperativa[9]); // TIPOV_STRA
			indirizzoGeo.setPrepStradario(unitaOperativa[10]); // PREP_STRA
			indirizzoGeo.setVia(unitaOperativa[11]); // VIA_STRA );
			indirizzoGeo.setCivico(unitaOperativa[12]); // CIVICO_STRA
			indirizzoGeo.setComune(unitaOperativa[13]); //COMUNE_STRA 
			
			/*
			 * 006001*
ACQUI TERME*
213*
AL*
ACQUI TERME - OSPEDALE-RADIOLO*
VIA FATEBENEFRATELLI (1)*
M1*
8.453200499556754*
44.67749384581822*
VIA*
*
FATEBENEFRATELLI*
1*
ACQUI TERME
			 * */
			 	
		}catch(Exception e) {	
		}
		source.setIndirizzoGeo(indirizzoGeo);
			
		return source;
		
	}
	
}
