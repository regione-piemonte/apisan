/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDelegheRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.CittadinoArruolabileFascicoloMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.CittadinoArruolabile;
import it.csi.apisan.apisanfse.dto.apisanfse.Delega;
import it.csi.apisan.apisanfse.integration.arruolamento.dma.FascicoloArruolabile;
import it.csi.apisan.apisanfse.integration.arruolamento.dma.RichiedenteArruolamento;
import it.csi.apisan.apisanfse.integration.arruolamento.dmacc.CCArruolabileExtFSEServicePortType;
import it.csi.apisan.apisanfse.util.CostantiConsenso;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfArruolamentoGetService extends FseDelegheRESTBaseService {
	
	@Autowired
	CCArruolabileExtFSEServicePortType arruolabileFSEService;
	
	private String cf;
	private String servizio;
	

	public CittadiniCfArruolamentoGetService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String cf, String servizio, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.servizio = servizio;
	}



	@Override
	protected Response execute() {
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(cf);
		
		Delega delega = null;
		/*
		 *  Verifica del 09/06/2021 con Veronica e Santina non si deve più fare la verifica sulle deleghe per isArruolabile
		 *  in attesa dell'evolutiva di isArruolabile che restituià messaggi diversi in base al grado di delega
		 */ 
		 /* if(StringUtils.isNotBlank(servizio)) {
			delega = new Delega();
			verificaUtenteAutorizzatoODelegato(cf, servizio,  delega);
		} else {
			checkUtenteAutorizzato(cf);  
		}*/
		FascicoloArruolabile risposta = arruolabileFSEService.isArruolabile(cf, newRichiedenteArruolabile(delega));
		
		CittadinoArruolabile rispostaArr = new CittadinoArruolabileFascicoloMapper().from(risposta);
		rispostaArr.setDelega(delega);
		
		return Response.ok(rispostaArr).build();
		
	}
	
	
	private RichiedenteArruolamento newRichiedenteArruolabile(Delega delega) {
		RichiedenteArruolamento richiedente = new RichiedenteArruolamento();
		
		richiedente.setCodiceFiscale(shibIdentitaCodiceFiscale);  //identita
		/*richiedente.setCodiceFiscale(cf); /* Verifica del 09/06/2021 con Veronica e Santina non si deve più fare la verifica sulle deleghe per isArruolabile
		   in attesa dell'evolutiva di isArruolabile che restituià messaggi diversi in base al grado di delega */
		richiedente.setCodiceServizio(xCodiceServizio); 
		
		if(delega != null && delega.getTipoDelega() != null) {
			richiedente.setTipoDelega(delega.getTipoDelega());
			richiedente.setGradoDelega(delega.getGradoDelega()); //grado delega
		}
		richiedente.setRuolo(CostantiConsenso.RUOLO); //tipo delega
		
		richiedente.setIpRichiedente(xForwardedFor);
		richiedente.setRequestID(xRequestID);
		
		return richiedente;
	}

}
