/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.mapper;

import org.springframework.beans.BeanUtils;

import it.csi.apisan.apisanfse.dto.apisanfse.Codifica;
import it.csi.apisan.apisanfse.dto.apisanfse.ComponenteLocaleTipo;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelComponenteLocale;
import it.csi.apisan.apisanfse.integration.documenti.dma.ComponenteLocaleRisposta;
import it.csi.apisan.apisanfse.integration.documenti.dma.SiNo;

public class ModelComponenteLocaleComponenteLocaleMapper extends BaseMapper<ModelComponenteLocale, ComponenteLocaleRisposta> {

	@Override
	public ComponenteLocaleRisposta to(ModelComponenteLocale source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelComponenteLocale from(ComponenteLocaleRisposta dest) {
		if(dest == null) {
			return null;
		}
		ModelComponenteLocale source = new ModelComponenteLocale();
		if(dest.getAziendaSanitaria()!=null) {
			it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria aziendaSanitaria =new it.csi.apisan.apisanfse.dto.apisanfse.AziendaSanitaria();
			BeanUtils.copyProperties(dest.getAziendaSanitaria(), aziendaSanitaria);
			source.setAziendaSanitaria(aziendaSanitaria);
		}
		source.setCodice(dest.getCodice());
		
		if(dest.getComponenteLocaleTipo() != null) {
			ComponenteLocaleTipo componentelocaletipo = new ComponenteLocaleTipo();
			BeanUtils.copyProperties(dest.getComponenteLocaleTipo(), componentelocaletipo); 
			source.setComponenteLocaleTipo(componentelocaletipo);
		}
		
		source.setDescrizione(dest.getDescrizione());
		if(dest.getErroreRegistrazioneConsenso() != null) {
			source.setErroreRegistrazioneConsenso( dest.getErroreRegistrazioneConsenso().equals(SiNo.SI) );
		}
		source.setRiferimento(dest.getRiferimento());
		source.setErrori(new CodificaErroreMapper().fromList(dest.getErrori()));
		source.setServizi(new ModelServizioComponenteLocaleServizioMapper().fromList(dest.getServizi()));
		if(dest.getStato() != null) {
			Codifica stato = new Codifica();
			BeanUtils.copyProperties(dest.getStato(), stato);
			source.setStato(stato);
		}
		
		source.setTempoMaxAttesaClInSec(dest.getTempoMaxAttesaCLInSec());
		source.setTempoMaxRestituzioneDatiInSec(dest.getTempoMaxRestituzioneDatiInSec());
		
		return source;
	}

}
