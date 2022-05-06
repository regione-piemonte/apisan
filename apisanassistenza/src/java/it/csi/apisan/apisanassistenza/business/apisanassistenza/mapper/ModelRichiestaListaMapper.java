/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelTicket;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsStatusTicket;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.util.RichiestaUtils;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelMessaggio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaLista;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelRichiestaStato;

public class ModelRichiestaListaMapper extends BaseMapper<ModelRichiestaLista, ModelTicket> {
	
	ModelArticle lastArticle;
	ModelArticle articleAutomaticallyGenerated;
	
	public ModelRichiestaListaMapper(ModelArticle lastArticle, ModelArticle articleAutomaticallyGenerated) {
		super();
		this.lastArticle = lastArticle;
		this.articleAutomaticallyGenerated = articleAutomaticallyGenerated;
	}

	@Override
	public ModelTicket to(ModelRichiestaLista source) {
		return null;
	}

	@Override
	public ModelRichiestaLista from(ModelTicket dest) {
		if (dest == null) {
			return null;
		}
		
		ModelRichiestaLista richiesta = new ModelRichiestaLista();
		richiesta.setId(dest.getId().toString());
		richiesta.setDataCreazione(dest.getCreatedAt());
		richiesta.setDataAggiornamento(dest.getUpdatedAt());
		
		if (dest.getStateId() != null) {
			richiesta.setModificabile(RichiestaUtils.isRichiestaModificabile(dest.getStateId()));
			richiesta.setArchiviata(RichiestaUtils.isRichiestaArchiviata(dest.getStateId()));
		}
		
		if (dest.getNotificationEmail() != null)
			richiesta.setEmail(dest.getNotificationEmail());
		
		if (dest.getRecallPhone() != null)
			richiesta.setTelefono(dest.getRecallPhone());
		
		if (dest.getAssetId() != null)
			richiesta.setAssetId(dest.getAssetId().toString());
		
		if (dest.getNumber() != null)
			richiesta.setRichiestaNumero(dest.getNumber());
		
		ModelRichiestaStato stato = new ModelRichiestaStato();
		stato.setCodice(dest.getStateId().toString());
		stato.setDescrizione(dest.getState());
		richiesta.setStato(stato);
		
		richiesta.setTipologia(dest.getTitle());
		
		if (articleAutomaticallyGenerated != null) {
			richiesta.setAssegnatario(articleAutomaticallyGenerated.getBody());	
		}		

		ModelMessaggio messaggio = null;
		if (lastArticle != null) {
			messaggio = new ModelMessaggioMapper().from(lastArticle);
		}
		richiesta.setUltimoMessaggio(messaggio);
		
		return richiesta;		
		
	}

}
