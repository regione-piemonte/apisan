/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.PresidioSanitario;

public class PresidioSanitarioMapper extends BaseMapper<PresidioSanitario, it.csi.apisan.apisanpag.dto.ptw.PresidioSanitario> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.PresidioSanitario to(PresidioSanitario source) {
		if(source==null) {
			return null;
		}
		it.csi.apisan.apisanpag.dto.ptw.PresidioSanitario ps = new it.csi.apisan.apisanpag.dto.ptw.PresidioSanitario();
		
		ps.setDescrizione(source.getDescrizione());
		ps.setId(source.getId());
		
		return ps;
	}

	@Override
	public PresidioSanitario from(it.csi.apisan.apisanpag.dto.ptw.PresidioSanitario dest) {
		if(dest==null) {
			return null;
		}
		PresidioSanitario ps = new PresidioSanitario();
		
		ps.setDescrizione(dest.getDescrizione());
		ps.setId(dest.getId());
		
		return ps;
	}

}
