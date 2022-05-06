/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.mapper;

import it.csi.apisan.apisantacc.dto.apisantacc.ModelContatto;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelContattoStrutturaTipo;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelContattoTipo;
import it.csi.dma.dmaclbluc.ContattoStrutturaResponse;

public class ModelContattoContattiStruttureMapper extends BaseMapper<ModelContatto, ContattoStrutturaResponse> {

	@Override
	public ContattoStrutturaResponse to(ModelContatto source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelContatto from(ContattoStrutturaResponse dest) {
		if(dest == null) {
			return null;
		}
		ModelContatto source = new ModelContatto();
		
		source.setId(dest.getId());	
		DateXMLGregorianCalendarMapper m=new DateXMLGregorianCalendarMapper();
		source.setDataCreazione(m.from(dest.getDataCreazione()));
		source.setDataAggiornamento(m.from(dest.getDataAggiornamento()));
		
		if(dest.getContattoStruttura() != null) {
			source.setDenominazione(dest.getContattoStruttura().getDenominazioneStruttura());
			source.setDataContattoInizio(m.from(dest.getContattoStruttura().getDataInizioContatto()));
			source.setDataContattoFine(m.from(dest.getContattoStruttura().getDataFineContatto()));
			source.setMotivazione(dest.getContattoStruttura().getMotivazioneContatto());
			source.setMedicinaNonConvenzionaleTipoContatto(dest.getContattoStruttura().getTipoContattoMedNonConvenz());
			if(dest.getContattoStruttura().getTipologiaContatto().getCodice() !=null) {
				source.setTipoContattoCodice(dest.getContattoStruttura().getTipologiaContatto().getCodice().value());
				ModelContattoTipo mc=new ModelContattoTipo();
				mc.setCodice(dest.getContattoStruttura().getTipologiaContatto().getCodice().value());
				mc.setDescrizione(dest.getContattoStruttura().getTipologiaContatto().getDescrizione());
				source.setTipoContatto(mc);
			}
			if(dest.getContattoStruttura().getTipologiaStruttura().getCodice() !=null) {
				source.setStrutturaTipoCodice(dest.getContattoStruttura().getTipologiaStruttura().getCodice().value());
				ModelContattoStrutturaTipo ms= new ModelContattoStrutturaTipo();
				ms.setCodice(dest.getContattoStruttura().getTipologiaStruttura().getCodice().value());
				ms.setDescrizione(dest.getContattoStruttura().getTipologiaStruttura().getDescrizione());
				source.setStrutturaTipo(ms);
			}			
		}
		/*
		
		if(dest.getDolore() != null) {
			source.setDescrizione(dest.getDolore().getDescrizione());
			source.setAreaInteressata(dest.getDolore().getAreaInteressata());
			source.setIntensitaValore(dest.getDolore().getIntensitaValore());
			ModelDoloreIntensita md=new ModelDoloreIntensita();
			md.setValore(dest.getDolore().getIntensitaValore());
			md.setDescrizione(dest.getDolore().getDescrizione());
			source.setIntensita(md);
			
		}*/
		return source;
	}

}
