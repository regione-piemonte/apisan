/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.util.ArticleUtils;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelDocumentoLettura;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelMessaggio;
import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelTipologiaMessaggio;

public class ModelMessaggioMapper extends BaseMapper<ModelMessaggio, ModelArticle> {

	@Override
	public ModelArticle to(ModelMessaggio source) {
		return null;
	}

	@Override
	public ModelMessaggio from(ModelArticle dest) {
		if (dest == null) {
			return null;
		}
		// messaggio da escludere
		if (dest.getTypeId() != null && dest.getTypeId() == ConstantsArticle.TYPE_ID_EMAIL_TO_EXCLUDE) {
			return null;
		}
		if (dest.getTypeId() != null && dest.getTypeId() == ConstantsArticle.TYPE_ID_OPERATORE_OR_AUTOMATICO
				&& dest.getSubject() != null && dest.getSubject().toUpperCase().startsWith("[EXT]")) {
			return null;
		}
		ModelMessaggio messaggio;
		messaggio = new ModelMessaggio();
		messaggio.setId(dest.getId().toString());
		messaggio.setAutore(dest.getFrom());
		messaggio.setTesto(dest.getBody());
		messaggio.setDataCreazione(dest.getCreatedAt());
		String tipologiaAutore = null;
		if (ArticleUtils.isTipologiaAutoreCittadino(dest)) {
			tipologiaAutore = ModelTipologiaMessaggio.CITTADINO.toString();
		} else 	if (ArticleUtils.isTipologiaAutoreOperatore(dest)) {
			tipologiaAutore = ModelTipologiaMessaggio.OPERATORE.toString();
		} else if  (
				ArticleUtils.isTipologiaAutoreAutomatico(dest)) {
			tipologiaAutore = ModelTipologiaMessaggio.AUTOMATICO.toString();
		} else {
			// ERROR?
		}
		
		messaggio.setTipologiaAutore(tipologiaAutore);
		ModelDocumentoLettura documento = null;
		if (dest.getAttachments().size() > 0) {
			documento = new ModelDocumentoLetturaMapper().from(dest.getAttachments().get(0));
		}
		messaggio.setAllegato(documento);
		return messaggio;
	}
	
}
