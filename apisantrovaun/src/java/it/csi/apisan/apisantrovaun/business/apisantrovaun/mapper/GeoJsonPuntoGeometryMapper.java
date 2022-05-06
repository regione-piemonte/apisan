/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.business.apisantrovaun.mapper;

import it.csi.apisan.apisantrovaun.dto.apisantrovaun.GeoJsonPunto;
import it.csi.apisan.apisantrovaun.dto.loccsi.Geometry;

public class GeoJsonPuntoGeometryMapper extends BaseMapper<GeoJsonPunto, Geometry> {

	@Override
	public Geometry to(GeoJsonPunto source) {
		// TODO Auto-generated method stub
		return null;
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
