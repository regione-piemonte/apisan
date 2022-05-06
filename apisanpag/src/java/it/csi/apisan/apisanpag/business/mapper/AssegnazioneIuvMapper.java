/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import it.csi.apisan.apisanpag.dto.apisanpag.AssegnazioneIuv;

public class AssegnazioneIuvMapper extends BaseMapper<AssegnazioneIuv, it.csi.apisan.apisanpag.dto.ptw.AssegnazioneIuv> {

	@Override
	public it.csi.apisan.apisanpag.dto.ptw.AssegnazioneIuv to(AssegnazioneIuv source) {
		if(source==null) {
			return null;
		}
		
		it.csi.apisan.apisanpag.dto.ptw.AssegnazioneIuv ai = new it.csi.apisan.apisanpag.dto.ptw.AssegnazioneIuv();
		
		ai.setIuvmod1(new Iuvmod1Mapper().to(source.getIuvmod1()));
		ai.setIuvmod3(new Iuvmod3Mapper().to(source.getIuvmod3()));

		return ai;
	}

	@Override
	public AssegnazioneIuv from(it.csi.apisan.apisanpag.dto.ptw.AssegnazioneIuv dest) {
		if(dest==null) {
			return null;
		}
		
		AssegnazioneIuv ai = new AssegnazioneIuv();
		
		ai.setIuvmod1(new Iuvmod1Mapper().from(dest.getIuvmod1()));
		ai.setIuvmod3(new Iuvmod3Mapper().from(dest.getIuvmod3()));

		return ai;
	}

}
