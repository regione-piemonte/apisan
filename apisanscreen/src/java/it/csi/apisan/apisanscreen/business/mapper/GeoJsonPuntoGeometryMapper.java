/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.mapper;

import java.math.BigDecimal;

import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint;
import it.csi.apisan.apisanscreen.dto.apisanscreen.GeoJsonPoint3D;
import it.csi.apisan.apisanscreen.dto.loccsi.Geometry;


public class GeoJsonPuntoGeometryMapper extends BaseMapper<GeoJsonPoint, Geometry> {

	@Override
	public Geometry to(GeoJsonPoint source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GeoJsonPoint from(Geometry dest) {
		if(dest == null) {
			return null;
		}
		GeoJsonPoint source = new GeoJsonPoint();
		if(dest.getType() != null) {
			source.setType(GeoJsonPoint.TypeEnum.valueOf(dest.getType().toUpperCase()));
		}
			
		GeoJsonPoint3D coordinate = new GeoJsonPoint3D();
		for(String coord : dest.getCoordinates()) {
			coordinate.add(new BigDecimal(coord) );
		}
		
		source.setCoordinates(coordinate);
		return source;
	}

}
