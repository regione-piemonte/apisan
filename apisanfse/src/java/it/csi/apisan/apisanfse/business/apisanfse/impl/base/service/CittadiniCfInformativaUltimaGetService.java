/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseConsensiRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.InformativaInformativaMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.Informativa;
import it.csi.apisan.apisanfse.integration.consensoini.dma.Errore;
import it.csi.apisan.apisanfse.integration.consensoini.dma.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.consensoini.dmacc.CCConsensoINIExtServicePortType;
import it.csi.apisan.apisanfse.integration.consensoini.dmacc.RecuperoInformativaExtRequeste;
import it.csi.apisan.apisanfse.integration.consensoini.dmacc.RecuperoInformativaResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)	
public class CittadiniCfInformativaUltimaGetService extends FseConsensiRESTBaseService {
	String cf;
	
	@Autowired
	CCConsensoINIExtServicePortType cCConsensoINIExtServicePortType;
	
	public CittadiniCfInformativaUltimaGetService(String cf, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
	}

	@Override
	protected Response execute() {
		
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(cf);
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		
		RecuperoInformativaExtRequeste request = new RecuperoInformativaExtRequeste();
		request.setInformativaIN(newUtimaInformativaIn(cf));
		request.setRichiedente(newRichiedenteConsenso(cf, null));
		
		RecuperoInformativaResponse res = cCConsensoINIExtServicePortType.recuperoInformativa(request);
		
		if(res.getEsito().equals(RisultatoCodice.FALLIMENTO)) {
			for(Errore err : res.getErrori()) {
				throw toRESTConsensiException(res.getErrori());			
			}
		} 
		Informativa result = new InformativaInformativaMapper().from(res.getInformativaOUT());		
		return Response.ok(result).build() ;
	}

}
