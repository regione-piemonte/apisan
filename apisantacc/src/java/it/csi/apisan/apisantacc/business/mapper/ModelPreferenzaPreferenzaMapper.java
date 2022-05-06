/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.EntitaCodice;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelEntita;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelPreferenza;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazioneGruppo;
import it.csi.apisan.apisantacc.dto.apisantacc.RilevazioneGruppoCodice;
import it.csi.dma.dmaclbluc.Preferenza;

public class ModelPreferenzaPreferenzaMapper extends BaseMapper<ModelPreferenza, Preferenza> {

	@Override
	public Preferenza to(ModelPreferenza source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelPreferenza from(Preferenza dest) {
		if(dest == null) {
			return null;
		}
		ModelPreferenza source = new ModelPreferenza();
	
		source.setId(dest.getId());
		source.setVisibile(dest.getVisibile().equalsIgnoreCase("1")?true:false);
		if(dest.getEntita()!=null) {
			ModelEntita entita= new ModelEntita();
			entita.setCodice(EntitaCodice.valueOf(dest.getEntita().getCodice()));
			entita.setDescrizione(dest.getEntita().getDescrizione());
			source.setEntita(entita);
			source.setEntitaCodice(entita.getCodice());
		}
		if(dest.getGruppo()!=null) {
			ModelRilevazioneGruppo gruppo= new ModelRilevazioneGruppo();
			gruppo.setCodice(dest.getGruppo().getCodice());
			gruppo.setDescrizione(dest.getGruppo().getDescrizione());
			gruppo.setDescrizioneEstesa(dest.getGruppo().getDescrizioneEstesa());
			source.setGruppo(gruppo);
			source.setGruppoCodice(gruppo.getCodice());
		}
		return source;
	}
	
	boolean ConvertFromString (String valore) {
		boolean flag=true;
		if("0".equalsIgnoreCase(valore)||"N".equalsIgnoreCase(valore)) {
			flag=false;
		}
		return flag;
	}

}
