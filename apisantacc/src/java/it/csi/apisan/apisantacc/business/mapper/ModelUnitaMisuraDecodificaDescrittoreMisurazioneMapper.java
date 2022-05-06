/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.ModelUnitaMisuraDecodifica;
import it.csi.dma.dmaclbluc.DescrittoreMisurazione;

public class ModelUnitaMisuraDecodificaDescrittoreMisurazioneMapper extends BaseMapper<ModelUnitaMisuraDecodifica, DescrittoreMisurazione>{

	@Override
	public DescrittoreMisurazione to(ModelUnitaMisuraDecodifica source) {
		if(source==null) {
			return null;
		}

		DescrittoreMisurazione target = new DescrittoreMisurazione();
		
		target.setEntitaCodice(source.getEntitaCodice());
		target.setGruppoCodice(source.getGruppoCodice());
		target.setDescrittoreCodice(source.getDescrittoreCodice());
		target.setDescrittoreDescrizione(source.getDescrittoreDescrizione());
		target.setDescrittoreDescrizioneEstesa(source.getDescrittoreDescrizioneEstesa());
		target.setUnitaMisuraCodice(source.getUnitaMisuraCodice());
		target.setUnitaMisuraDescrizione(source.getUnitaMisuraDescrizione());
		return target;
	}

	@Override
	public ModelUnitaMisuraDecodifica from(DescrittoreMisurazione dest) {
		if(dest==null) {
			return null;
		}

		ModelUnitaMisuraDecodifica target = new ModelUnitaMisuraDecodifica();	
		target.setEntitaCodice(dest.getEntitaCodice());
		target.setGruppoCodice(dest.getGruppoCodice());
		target.setDescrittoreCodice(dest.getDescrittoreCodice());
		target.setDescrittoreDescrizione(dest.getDescrittoreDescrizione());
		target.setDescrittoreDescrizioneEstesa(dest.getDescrittoreDescrizioneEstesa());
		target.setUnitaMisuraCodice(dest.getUnitaMisuraCodice());
		target.setUnitaMisuraDescrizione(dest.getUnitaMisuraDescrizione());
		return target;
	}

}
