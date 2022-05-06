/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanassistenza.business.apisanassistenza.impl.service;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanassistenza.dto.apisanassistenza.ModelConfigurazione;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ConfigurazioneGet extends AssistenzaRESTService{
	
	public ConfigurazioneGet() {
	}

	public ConfigurazioneGet(SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
	}

	@Override
	protected Response execute() {
		validateCommonRequiredData();
		return Response.ok().entity(get()).build();
	}

	public ModelConfigurazione get() {
		ModelConfigurazione configurazione = new ModelConfigurazione();
		configurazione.setDocumentoDimensioneMassima(1048576); // in bytes
		String fileFormat[] = new String[] { "doc", "docx", "xls", "xlsx", "pdf", "jpg", "png"};
		configurazione.setDocumentoFormatiSupportati(Arrays.asList(fileFormat));
		configurazione.setTestoNumeroMassimoCaratteri(500);
		return configurazione;
	}
	
}
