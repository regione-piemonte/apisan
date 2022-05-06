/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import it.csi.apisan.apisanfse.integration.scaricostudi.Errore;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseDelegheRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelVerificaStatoRichiestaVerificaStatoRichiestaMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.Dettaglio;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelVerificaStatoRichiesta;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.scaricostudi.CCScaricoStudiServicePortType;
import it.csi.apisan.apisanfse.integration.scaricostudi.VerificaStatoRichiestaReq;
import it.csi.apisan.apisanfse.integration.scaricostudi.VerificaStatoRichiestaRes;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiCodiceDocumentoDipartimentaleStatoImmagineGetService
		extends FseDelegheRESTBaseService {
	
	@Autowired
	private CCScaricoStudiServicePortType scaricoStudiPort;
	
	private String citId;
	private String codiceDocumentoDipartimentale;
	
	
	public CittadiniCitIdDocumentiCodiceDocumentoDipartimentaleStatoImmagineGetService(String citId,
			String codiceDocumentoDipartimentale, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.codiceDocumentoDipartimentale = codiceDocumentoDipartimentale;		
	}


	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Inserire il codice servizio");
		checkNotBlank(xRequestID, "Inserire l'XRequestId");
		checkNotBlank(citId, "Inserire il codice fiscale");
		checkNotBlank(codiceDocumentoDipartimentale, "Inserire il codice documento dipartimenatale");
		checkNotBlank(shibIdentitaCodiceFiscale, "Inserire l'identita");
		
		checkUtenteAutorizzatoOrDelegato(citId);
		
		VerificaStatoRichiestaReq reqStatoRichiesta = new VerificaStatoRichiestaReq();
		reqStatoRichiesta.setCodiceFiscale(citId);
		reqStatoRichiesta.setIdReferto(codiceDocumentoDipartimentale);
		reqStatoRichiesta.setPin("0");
		
		VerificaStatoRichiestaRes resStatoRichiesta = scaricoStudiPort.verificaStatoRichiesta(reqStatoRichiesta);
		ModelVerificaStatoRichiesta res = null;
			
		if(resStatoRichiesta.getEsito().equals(it.csi.apisan.apisanfse.integration.scaricostudi.RisultatoCodice.SUCCESSO)) {
			 res  = new ModelVerificaStatoRichiestaVerificaStatoRichiestaMapper().from(resStatoRichiesta);
		}else {
			toRESTVerificaException(resStatoRichiesta.getErrori());
		}
		
		return Response.ok(res).build();
	}
	
	protected ErroreRESTException toRESTVerificaException(List<Errore> errori) {
		return toRESTVerificaException(errori, 502, "Errore esecuzione servizio "+this.getClass().getSimpleName());
	}
	
	
	protected ErroreRESTException toRESTVerificaException(List<Errore> errori, int status, String msgDefault) {
		return ErroreBuilder.from(status, msgDefault).dettagli(errori, (e -> {
			Dettaglio d = new Dettaglio();
			d.setChiave(e.getCodice());
			d.setValore(e.getDescrizione());
			return d;
		})).exception();
	}

}
