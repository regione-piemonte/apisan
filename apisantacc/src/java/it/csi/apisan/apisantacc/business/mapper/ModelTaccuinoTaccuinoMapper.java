/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisantacc.dto.apisantacc.EntitaCodice;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelEntita;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelNoteGenerali;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelPreferenza;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazioneGruppo;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelTaccuino;
import it.csi.dma.dmaclbluc.GetTaccuinoResponse;
import it.csi.dma.dmaclbluc.Preferenza;

public class ModelTaccuinoTaccuinoMapper extends BaseMapper<ModelTaccuino, GetTaccuinoResponse> {

	@Override
	public GetTaccuinoResponse to(ModelTaccuino source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelTaccuino from(GetTaccuinoResponse dest) {
		if(dest == null) {
			return null;
		}
		ModelTaccuino source = new ModelTaccuino();
	
		source.setId(dest.getTaccuino().getId());
		source.setOscurato(ConvertFromString(dest.getTaccuino().getOscurato()));
		DateXMLGregorianCalendarMapper m=new DateXMLGregorianCalendarMapper();
		if(dest.getTaccuino().getNotaGenerale()!=null){
			ModelNoteGenerali noteGenerali = new ModelNoteGenerali();
			noteGenerali.setDataCreazione(m.from(dest.getTaccuino().getNotaGenerale().getDataCreazione()));
			noteGenerali.setDataAggiornamento(m.from(dest.getTaccuino().getNotaGenerale().getDataAggiornamento()));
			noteGenerali.setStatoSalute(dest.getTaccuino().getNotaGenerale().getStatoSalute());
			noteGenerali.setStileVita(dest.getTaccuino().getNotaGenerale().getStileVita());
			source.setNoteGenerali(noteGenerali );
		}

		if(dest.getTaccuino().getListaPreferenze()!=null && dest.getTaccuino().getListaPreferenze().getPreferenza()!= null){
			List<ModelPreferenza> preferenze=new ArrayList<ModelPreferenza>();
			for (Preferenza preferenza : dest.getTaccuino().getListaPreferenze().getPreferenza()) {
	            ModelPreferenza e= new ModelPreferenza();
				e.setId(preferenza.getId());
	            e.setVisibile(ConvertFromString(preferenza.getVisibile()));
	            if(preferenza.getGruppo()!=null) {
	            	e.setGruppoCodice(preferenza.getGruppo().getCodice());					
					ModelRilevazioneGruppo gruppo=new ModelRilevazioneGruppo();
					gruppo.setCodice(e.getGruppoCodice());
					gruppo.setDescrizione(preferenza.getGruppo().getDescrizione());
					gruppo.setDescrizioneEstesa(preferenza.getGruppo().getDescrizioneEstesa());
					e.setGruppo(gruppo);
	            }
	            if(preferenza.getEntita()!=null) {            	
	            	e.setEntitaCodice(EntitaCodice.valueOf(preferenza.getEntita().getCodice()));
	            	ModelEntita entita= new ModelEntita();
	            	entita.setCodice(e.getEntitaCodice());
	            	entita.setDescrizione(preferenza.getEntita().getDescrizione());
					e.setEntita(entita);
	            }
				
	            preferenze.add(e);
	        }
			source.setPreferenze(preferenze);
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
