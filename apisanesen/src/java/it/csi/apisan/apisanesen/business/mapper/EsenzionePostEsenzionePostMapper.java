/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.business.mapper;

import it.csi.apisan.apisanesen.dto.apisanesen.EsenzionePost;

public class EsenzionePostEsenzionePostMapper extends BaseMapper<EsenzionePost,it.csi.apisan.apisanesen.dto.red.EsenzionePost> {

	@Override
	public it.csi.apisan.apisanesen.dto.red.EsenzionePost to(EsenzionePost source) {
		it.csi.apisan.apisanesen.dto.red.EsenzionePost dest = new it.csi.apisan.apisanesen.dto.red.EsenzionePost();
		dest.setCodiceEsenzione(source.getCodiceEsenzione());
		dest.setCreatoPer(new CittadinoPostCittadinoPostMapper().to(source.getCreatoPer()));
		dest.setDisclaimer(source.isDisclaimer());
		dest.setRapportoFamiliare(source.getRapportoFamiliare());
		dest.setTitolare(new CittadinoPostCittadinoPostMapper().to(source.getTitolare()));
		return dest;
	}

	@Override
	public EsenzionePost from(it.csi.apisan.apisanesen.dto.red.EsenzionePost dest) {
		EsenzionePost source = new EsenzionePost();
		source.setCodiceEsenzione(dest.getCodiceEsenzione());
		source.setCreatoPer(new CittadinoPostCittadinoPostMapper().from(dest.getCreatoPer()));
		source.setDisclaimer(dest.isDisclaimer());
		source.setRapportoFamiliare(dest.getRapportoFamiliare());
		source.setTitolare(new CittadinoPostCittadinoPostMapper().from(dest.getTitolare()));
		return source;
	}

}
