/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.mapper;

import java.util.Iterator;

import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAllegati;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelDocumento;



public class ModelAllegatiModelAllegatiMapper extends BaseMapper<ModelAllegati, it.csi.apisan.apisanscerev.dto.scerev.ModelAllegati> {

	@Override
	public it.csi.apisan.apisanscerev.dto.scerev.ModelAllegati to(ModelAllegati source) {
		if(source == null) {
			return null;
		}
		it.csi.apisan.apisanscerev.dto.scerev.ModelAllegati dest = new it.csi.apisan.apisanscerev.dto.scerev.ModelAllegati();
		for(Iterator<ModelDocumento>iter = source.iterator(); iter.hasNext();) {
			dest.add(new ModelDocumentoModelDocumentoMapper().to(iter.next()));
		}
		return dest;
	}

	@Override
	public ModelAllegati from(it.csi.apisan.apisanscerev.dto.scerev.ModelAllegati dest) {
		if(dest == null) {
			return null;
		}
		ModelAllegati source = new ModelAllegati();
		for(Iterator<it.csi.apisan.apisanscerev.dto.scerev.ModelDocumento> iter = dest.iterator(); iter.hasNext();) {
			source.add(new ModelDocumentoModelDocumentoMapper().from(iter.next()));
		}
		return source;
	}

}
