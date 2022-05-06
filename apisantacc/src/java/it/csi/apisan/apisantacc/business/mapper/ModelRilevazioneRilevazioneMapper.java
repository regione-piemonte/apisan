/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import java.math.BigDecimal;

import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazione;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazioneModalita;
import it.csi.apisan.apisantacc.dto.apisantacc.RilevazioneDescrittoreCodice;
import it.csi.apisan.apisantacc.dto.apisantacc.RilevazioneGruppoCodice;
import it.csi.dma.dmaclbluc.Rilevazione;

public class ModelRilevazioneRilevazioneMapper extends BaseMapper<ModelRilevazione, Rilevazione>{

	@Override
	public Rilevazione to(ModelRilevazione source) {
		
		if(source==null) {
			return null;
		}
		
		Rilevazione rilevazione = new Rilevazione();
		
		rilevazione.setData(new DateXMLGregorianCalendarMapper().to(source.getData()));			
		rilevazione.setDescrittore(new ModelRilevazioneDescrittoreDescrittoreMapper().to(source.getDescrittore()));						
		rilevazione.setGruppo(new ModelRilevazioneGruppoGruppoMapper().to(source.getGruppo()));			
		rilevazione.setUnitaMisura(new ModelRilevazioneUnitaMisuraUnitaMisuraMapper().to(source.getUnitaMisura()));		
		if(source.getValoreNumerico()!=null) {
			rilevazione.setValoreNumerico(source.getValoreNumerico().floatValue());
		}
		rilevazione.setValoreTestuale(source.getValoreTestuale());
		
		return rilevazione;
	}

	@Override
	public ModelRilevazione from(Rilevazione dest) {
		if(dest==null) {
			return null;
		}
		
		ModelRilevazione modelRilevazione = new ModelRilevazione();		
		if(dest.getValoreNumerico()!=null) {
			modelRilevazione.setValoreNumerico(new BigDecimal(dest.getValoreNumerico()));
		}
		modelRilevazione.setValoreTestuale(dest.getValoreTestuale());
		modelRilevazione.setData(new DateXMLGregorianCalendarMapper().from(dest.getData()));
		if(dest.getUnitaMisura()!=null && dest.getUnitaMisura().getCodice()!=null) {
			modelRilevazione.setUnitaMisuraCodice(dest.getUnitaMisura().getCodice());
		}
		if(dest.getGruppo()!=null && dest.getGruppo().getCodice()!=null) {
			modelRilevazione.setGruppoCodice(dest.getGruppo().getCodice());
		}
		if(dest.getDescrittore()!=null && dest.getDescrittore().getCodice()!=null) {
			modelRilevazione.setDescrittoreCodice(dest.getDescrittore().getCodice());
		}
		
		modelRilevazione.setUnitaMisura(new ModelRilevazioneUnitaMisuraUnitaMisuraMapper().from(dest.getUnitaMisura()));
		modelRilevazione.setDescrittore(new ModelRilevazioneDescrittoreDescrittoreMapper().from(dest.getDescrittore()));		
		modelRilevazione.setGruppo(new ModelRilevazioneGruppoGruppoMapper().from(dest.getGruppo()));
		
		if(dest.getModalitaRilevazione()!=null &&
		   dest.getModalitaRilevazione().getCodice() != null) {
			modelRilevazione.setModalitaCodice(dest.getModalitaRilevazione().getCodice());		
			ModelRilevazioneModalita modalita = new ModelRilevazioneModalita();
			modalita.setCodice(dest.getModalitaRilevazione().getCodice());
			modalita.setDescrizioneNazionale(dest.getModalitaRilevazione().getDescrizioneNazionale());
			modalita.setDescrizioneRegionale(dest.getModalitaRilevazione().getDescrizioneRegionale());
			
			modelRilevazione.setModalita(modalita);
		}
		return modelRilevazione;
		
	}

}
