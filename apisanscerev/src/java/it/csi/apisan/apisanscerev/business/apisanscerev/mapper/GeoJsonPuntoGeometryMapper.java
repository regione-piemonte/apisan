/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import it.csi.apisan.apisanscerev.dto.apisanscerev.GeoJsonPunto;
import it.csi.apisan.apisanscerev.dto.loccsi.Geometry;

public class GeoJsonPuntoGeometryMapper extends BaseMapper<GeoJsonPunto, Geometry> {

	@Override
	public Geometry to(GeoJsonPunto source) {
		if(source == null) {
			return null;
		}
		Geometry dest = new Geometry();
		dest.setCoordinates( new BigDecimalStringMapper().toList(source.getCoordinates()));
		dest.setType(source.getType());
		return dest;
	}

	@Override
	public GeoJsonPunto from(Geometry dest) {
		if(dest == null) {
			return null;
		}
		GeoJsonPunto source = new GeoJsonPunto();
		source.setType(dest.getType());
		source.setCoordinates(new BigDecimalStringMapper().fromList(dest.getCoordinates()));
		return source;
		
	}
	
	
	
}
