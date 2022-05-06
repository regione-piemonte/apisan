/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service.nextcrm.dto;

public class ContainerTicketAndArticle {
	
	private ModelTicket ticket = null;
	private ModelArticle article = null;
	private ModelArticle articleAutomaticallyGenerated = null;
	
	public ContainerTicketAndArticle(ModelTicket ticket, ModelArticle article, ModelArticle articleAutomaticallyGenerated) {
		super();
		this.ticket = ticket;
		this.article = article;
		this.articleAutomaticallyGenerated = articleAutomaticallyGenerated;
	}
	
	public ModelArticle getArticle() {
		return article;
	}
	public void setArticle(ModelArticle article) {
		this.article = article;
	}
	public ModelTicket getTicket() {
		return ticket;
	}
	public void setTicket(ModelTicket ticket) {
		this.ticket = ticket;
	}
	public ModelArticle getArticleAutomaticallyGenerated() {
		return articleAutomaticallyGenerated;
	}
	

}
