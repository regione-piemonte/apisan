/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.mapper;

import it.csi.apisan.apisanesen.dto.apisanesen.Revoca;

public class RevocaRevocaMapper extends BaseMapper<Revoca, it.csi.apisan.apisanesen.dto.red.Revoca> {

	@Override
	public it.csi.apisan.apisanesen.dto.red.Revoca to(Revoca source) {
		it.csi.apisan.apisanesen.dto.red.Revoca dest = new it.csi.apisan.apisanesen.dto.red.Revoca();
		dest.setMotivazioneRevoca(source.getMotivazioneRevoca());
		return dest;
	}

	@Override
	public Revoca from(it.csi.apisan.apisanesen.dto.red.Revoca dest) {
		Revoca source = new Revoca();
		source.setMotivazioneRevoca(dest.getMotivazioneRevoca());
		return source;
	}

}
