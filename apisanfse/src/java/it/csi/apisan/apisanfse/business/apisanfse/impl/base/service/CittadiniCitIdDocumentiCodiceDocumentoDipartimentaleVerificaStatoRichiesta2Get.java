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

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseUtilityRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelVerificaStatoRichiesta2VerificaStatoRichiesta2Mapper;
import it.csi.apisan.apisanfse.dto.apisanfse.Dettaglio;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelVerificaStatoRichiesta2;
import it.csi.apisan.apisanfse.exception.ErroreBuilder;
import it.csi.apisan.apisanfse.exception.ErroreRESTException;
import it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean.ScaricoStudiWSBean;
import it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean.VerificaStatoRichiesta2Request;
import it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean.VerificaStatoRichiesta2Response;
import it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean.Errore;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDocumentiCodiceDocumentoDipartimentaleVerificaStatoRichiesta2Get  extends FseUtilityRESTBaseService {

	private String citId;
	private String codiceDocumentoDipartimentale;
	private String codiceCl;
	
	@Autowired
	ScaricoStudiWSBean scaricoStudiWSBean;
	
	public CittadiniCitIdDocumentiCodiceDocumentoDipartimentaleVerificaStatoRichiesta2Get(String xRequestId,
			String xForwardedFor, String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId,
			String codiceDocumentoDipartimentale, String codiceCl, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
		this.citId=citId;
		this.codiceDocumentoDipartimentale=codiceDocumentoDipartimentale;
		this.codiceCl=codiceCl;
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Valorizzare xRequestId");
		checkNotBlank(xCodiceServizio, "Valorizare X-Codice-Servizio");
		checkNotBlank(shibIdentitaCodiceFiscale, "Valorizzare l'identità");	
		checkNotBlank(citId, "Inserire il codice fiscale");
		checkNotBlank(codiceDocumentoDipartimentale, "Inserire il codice documento dipartimenatale");
		checkNotBlank(codiceCl, "Valorizzare la componente locale");
		
		VerificaStatoRichiesta2Request verificaStatoRichiesta2Request = new VerificaStatoRichiesta2Request();
		verificaStatoRichiesta2Request.setArvchivioDocumentoIlec("FSE");
		verificaStatoRichiesta2Request.setCodCL(codiceCl);
		verificaStatoRichiesta2Request.setCodiceFiscale(citId);
		verificaStatoRichiesta2Request.setCodDocumentoDipartimentale(codiceDocumentoDipartimentale);
		VerificaStatoRichiesta2Response verificaStatoRichiesta2Response = scaricoStudiWSBean.verificaStatoRichiesta2(verificaStatoRichiesta2Request);

		ModelVerificaStatoRichiesta2 res = null;
		
		if(verificaStatoRichiesta2Response.getEsito().equals(it.csi.apisan.apisanfse.integration.ScaricoStudiWSBean.RisultatoCodice.SUCCESSO.toString())) {
			 res  = new ModelVerificaStatoRichiesta2VerificaStatoRichiesta2Mapper().from(verificaStatoRichiesta2Response);
		}else {
			toRESTVerificaException(verificaStatoRichiesta2Response.getErrori());
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
