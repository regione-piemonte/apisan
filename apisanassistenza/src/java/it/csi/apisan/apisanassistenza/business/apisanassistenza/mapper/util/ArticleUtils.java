/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.mapper.util;

import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto.ModelArticle;
import it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.util.ConstantsArticle;

public class ArticleUtils {
	
	public static boolean isTipologiaAutoreAutomatico(ModelArticle article) {
		return article.getTypeId() != null && article.getTypeId() == ConstantsArticle.TYPE_ID_OPERATORE_OR_AUTOMATICO
				&& article.getFrom() != null && article.getFrom().toUpperCase().equalsIgnoreCase(ConstantsArticle.FROM_OPERATORE.toUpperCase()) 
				&& article.getSubject() != null && article.getSubject().toUpperCase().startsWith(ConstantsArticle.SUBJECT_AUTOMATICO.toUpperCase());
	}

	public static boolean isTipologiaAutoreCittadino(ModelArticle article) {
		return article.getTypeId() != null && article.getTypeId() == ConstantsArticle.TYPE_ID_API;
	}	
	
	public static  boolean isTipologiaAutoreOperatore (ModelArticle article) {
		return article.getTypeId() != null && article.getTypeId() == ConstantsArticle.TYPE_ID_OPERATORE_OR_AUTOMATICO
				&& article.getFrom() != null && article.getFrom().toUpperCase().equalsIgnoreCase(ConstantsArticle.FROM_OPERATORE.toUpperCase())
				&& article.getSubject() != null && article.getSubject().toUpperCase().startsWith(ConstantsArticle.SUBJECT_OPERATORE.toUpperCase());
	}
	

}
