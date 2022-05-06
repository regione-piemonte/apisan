/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl;

import java.math.BigDecimal;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanfse.business.apisanfse.CittadiniApi;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.ServiceExecutor;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCfArruolamentoGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCfArruolamentoPutService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCfConsensoGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCfConsensoPostService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCfConsultazionePreferenzePutService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCfInformativaIdInformativaPdfGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCfInformativaUltimaGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCfInformativaUltimaPdfGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdAccessiGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdAuditPostService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiCodiceDocumentoDipartimentalePrenotazionePostService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiCodiceDocumentoDipartimentaleStatoImmagineGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiCodiceAzioneDocumentoScaricabileExtGet;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiConteggiSearchPostService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiDocumentoPersonalePostService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiEpisodiIdEpisodioDocumentiEpisodioGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiEpisodiSearchPostService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiIdDocumentoDettaglioDocumentoGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiIdDocumentoDocumentiCorrelatiGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiIdDocumentoDocumentiOscuratiGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiIdDocumentoDocumentoGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiIdDocumentoDocumentoPersonaleDeleteService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiIdDocumentoDocumentoPersonaleGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiIdDocumentoRegistraRitiroPostService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiIdDocumentoZipGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiCodiceDocumentoDipartimentaleVerificaDocumentoScaricabileGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiCodiceDocumentoDipartimentaleVerificaStatoRichiesta2Get;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentiSearchPostService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdDocumentoIdDocumentoAssociaEtichettePostService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdEsenzioniGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdEtichetteGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdEtichetteIdEtichettaDeleteService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdEtichetteIdEtichettaGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdEtichetteIdEtichettaPutService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdEtichettePostService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.MessaggiServizioGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdOscuramentoPutService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdRefertiGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdRefertiIdRefertoAnnullamentoPutService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdRefertiIdRefertoGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdRefertiIdRefertoPdfGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdRefertiIdRefertoPrenotazionePostService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdRefertiIdRefertoZipIdpacchettoGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdRefertiPdfGetService;
import it.csi.apisan.apisanfse.business.apisanfse.impl.base.service.CittadiniCitIdScreeningGetService;
import it.csi.apisan.apisanfse.dto.apisanfse.ConsensoFse;
import it.csi.apisan.apisanfse.dto.apisanfse.ImmagineRete;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadAssociaEtichette;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadDocumentoPersonale;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadEtichetta;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadOscuramento;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadPrenotaImmagine;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadRegistraDocumento;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSearchConteggi;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSearchDocumenti;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSearchEpisodi;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSetAudit;



@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiServiceImpl implements CittadiniApi {	
	
	@Override
	public Response cittadiniCitIdRefertiIdRefertoAnnullamentoPut(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String citId, String idReferto, String pin, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		
		
		return ServiceExecutor.execute(CittadiniCitIdRefertiIdRefertoAnnullamentoPutService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				citId, idReferto, pin, securityContext, httpHeaders);
	}
	
	
	@Override
	public Response cittadiniCitIdRefertiGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String citId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdRefertiGetService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				citId, 
				securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdRefertiIdRefertoGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String citId, String idReferto, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdRefertiIdRefertoGetService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				citId, idReferto, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdRefertiIdRefertoPdfGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String citId, String idReferto, String pin, String firmato,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdRefertiIdRefertoPdfGetService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				citId, idReferto, pin, firmato,
				securityContext, httpHeaders);
	}
	
	@Override
	public Response cittadiniCitIdRefertiIdRefertoPrenotazionePost(String shibIdentitaCodiceFiscale,
			String xRequestID, String xCodiceServizio, String xForwardedFor, String citId, String idReferto,
			ImmagineRete prenotazioneImmagine, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCitIdRefertiIdRefertoPrenotazionePostService.class, shibIdentitaCodiceFiscale,
				xRequestID, xCodiceServizio,  xForwardedFor, citId, idReferto, prenotazioneImmagine, securityContext, httpHeaders);
	}	


/*	@Override
	public Response cittadiniCitIdRefertiIdRefertoZipGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String citId, String idReferto, String pin, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdRefertiIdRefertoZipGetService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				citId, idReferto, pin, 
				securityContext, httpHeaders);
	}
*/

	
	@Override
	public Response cittadiniCfArruolamentoGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String cf, String servizio, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCfArruolamentoGetService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				xForwardedFor, cf,  servizio, securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCfArruolamentoPut(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String cf, SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCfArruolamentoPutService.class, shibIdentitaCodiceFiscale,  xRequestID,
				 xCodiceServizio, xForwardedFor, cf,  securityContext,  httpHeaders) ;
	}


	@Override
	public Response cittadiniCitIdRefertiIdRefertoZipIdpacchettoGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String citId, String idReferto, String idpacchetto, String pin,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCitIdRefertiIdRefertoZipIdpacchettoGetService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				citId, idReferto, idpacchetto, pin, 
				securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCfConsensoGet(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String xForwardedFor, String cf, String servizio, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCfConsensoGetService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
				cf,  servizio, securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCfConsensoPost(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String xForwardedFor, String cf, ConsensoFse consensoFse, String servizio, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		 return ServiceExecutor.execute(CittadiniCfConsensoPostService.class, shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio,
					cf, consensoFse, servizio, securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCfInformativaIdInformativaPdfGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String cf, String idInformativa,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCfInformativaIdInformativaPdfGetService.class, cf, idInformativa, securityContext, httpHeaders);
	}



	@Override
	public Response cittadiniCfInformativaUltimaGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String cf, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCfInformativaUltimaGetService.class, cf, securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCfInformativaUltimaPdfGet(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String cf, SecurityContext securityContext,
			HttpHeaders httpHeaders) {	
		return ServiceExecutor.execute(CittadiniCfInformativaUltimaPdfGetService.class, cf, securityContext, httpHeaders);
	}

    // ---------------------------------------------------------------------------------------------
    //                                SERVIZI ETICHETTE
	@Override
	public Response cittadiniCitIdEtichetteGet(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, String citId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdEtichetteGetService.class, shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, citId, securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCitIdEtichetteIdEtichettaDelete(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, Long idEtichetta,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdEtichetteIdEtichettaDeleteService.class, shibIdentitaCodiceFiscale, xRequestId, citId, idEtichetta, xCodiceServizio, securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCitIdEtichetteIdEtichettaGet(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, Long idEtichetta,
			String tipologiaEtichetta, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdEtichetteIdEtichettaGetService.class, xRequestId, xForwardedFor,
			xCodiceServizio, shibIdentitaCodiceFiscale, citId, idEtichetta,
			tipologiaEtichetta, securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCitIdEtichetteIdEtichettaPut(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, Long idEtichetta,
			PayloadEtichetta payloadEtichetta, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdEtichetteIdEtichettaPutService.class, shibIdentitaCodiceFiscale, xRequestId, citId, idEtichetta, payloadEtichetta, xCodiceServizio, securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCitIdEtichettePost(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, String citId, PayloadEtichetta payloadEtichetta,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdEtichettePostService.class, shibIdentitaCodiceFiscale, xRequestId, citId, payloadEtichetta, xCodiceServizio, securityContext, httpHeaders);
	}
	
	@Override
	public Response cittadiniCitIdDocumentoIdDocumentoAssociaEtichettePost(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento,
			PayloadAssociaEtichette payloadAssociaEtichette, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentoIdDocumentoAssociaEtichettePostService.class, xRequestId, xForwardedFor, xCodiceServizio, shibIdentitaCodiceFiscale, citId, idDocumento, payloadAssociaEtichette, securityContext, httpHeaders);
	}
	
    // ---------------------------------------------------------------------------------------------
    //                                SERVIZI DOCUMENTI		


	@Override
	public Response cittadiniCitIdDocumentiIdDocumentoRegistraRitiroPost(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento,
			PayloadRegistraDocumento payloadRegistraDocumento, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiIdDocumentoRegistraRitiroPostService.class, xRequestId, xForwardedFor,
				 xCodiceServizio,  shibIdentitaCodiceFiscale, citId, idDocumento,
				 payloadRegistraDocumento, securityContext,
				 httpHeaders);
	}


	@Override
	public Response cittadiniCitIdDocumentiDocumentoPersonalePost(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId,
			PayloadDocumentoPersonale payloadDocumentoPersonale, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiDocumentoPersonalePostService.class, xRequestId, xForwardedFor,
				xCodiceServizio, shibIdentitaCodiceFiscale, citId,
				payloadDocumentoPersonale, securityContext,
				httpHeaders);		
	}


	@Override
	public Response cittadiniCitIdDocumentiIdDocumentoDocumentiCorrelatiGet(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento, String codiceCl,
			String tipoCorrelazioneDocumento, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiIdDocumentoDocumentiCorrelatiGetService.class, xRequestId, xForwardedFor,
				 xCodiceServizio, shibIdentitaCodiceFiscale, citId, idDocumento, codiceCl,tipoCorrelazioneDocumento,
				 securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCitIdDocumentiIdDocumentoDocumentiOscuratiGet(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento, String codiceCl,
			String azione, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiIdDocumentoDocumentiOscuratiGetService.class, xRequestId, xForwardedFor,
				 xCodiceServizio, shibIdentitaCodiceFiscale, citId, idDocumento, codiceCl, azione,
				 securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCitIdDocumentiIdDocumentoDocumentoPersonaleDelete(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiIdDocumentoDocumentoPersonaleDeleteService.class, xRequestId, xForwardedFor,
				xCodiceServizio, shibIdentitaCodiceFiscale, citId, idDocumento,
				securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCitIdDocumentiIdDocumentoDocumentoPersonaleGet(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiIdDocumentoDocumentoPersonaleGetService.class, xRequestId, xForwardedFor,
			 xCodiceServizio, shibIdentitaCodiceFiscale, citId, idDocumento,
			 securityContext, httpHeaders);
	}

    // ---------------------------------------------------------------------------------------------
    //                                SERVIZI ESENZIONI		
	
	@Override
	public Response cittadiniCitIdEsenzioniGet(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, String citId, String servizio, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdEsenzioniGetService.class, xRequestId, xForwardedFor,
				xCodiceServizio, shibIdentitaCodiceFiscale, citId, servizio, securityContext, httpHeaders);
	}

    // ---------------------------------------------------------------------------------------------
    //                                SERVIZI SCRINING		


	@Override
	public Response cittadiniCitIdScreeningGet(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, String citId, String servizio, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdScreeningGetService.class, xRequestId, xForwardedFor,
				xCodiceServizio, shibIdentitaCodiceFiscale, citId, servizio, securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCitIdOscuramentoPut(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, String citId, String servizio, PayloadOscuramento payloadOscuramento,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdOscuramentoPutService.class, xRequestId, xForwardedFor, xCodiceServizio,
			 shibIdentitaCodiceFiscale, citId, servizio, payloadOscuramento,
			 securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCitIdDocumentiSearchPost(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, String citId, Integer limit, Integer offset,
			PayloadSearchDocumenti payloadSearchDocumenti, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiSearchPostService.class, xRequestId, xForwardedFor, xCodiceServizio,
			shibIdentitaCodiceFiscale, citId, limit, offset,
			payloadSearchDocumenti, securityContext, httpHeaders);
	}


	
	
	@Override
	public Response cittadiniCitIdDocumentiEpisodiSearchPost(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, Integer limit, Integer offset,
			PayloadSearchEpisodi payloadSearchEpisodi, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdDocumentiEpisodiSearchPostService.class, citId, limit, offset,
				payloadSearchEpisodi, securityContext,  httpHeaders);
	}


	@Override
	public Response cittadiniCitIdDocumentiConteggiSearchPost(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId,
			PayloadSearchConteggi payloadSearchConteggi, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdDocumentiConteggiSearchPostService.class, citId,
				payloadSearchConteggi, securityContext, httpHeaders);
	}


/*	@Override
	public Response cittadiniCitIdDocumentiIdDocumentoDettaglioDocumentoGet(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento,
			String categoria, String componenteLocale, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdDocumentiIdDocumentoDettaglioDocumentoGetService.class, citId, idDocumento,
				categoria, componenteLocale, securityContext, httpHeaders);
	}
*/
	
	
	@Override
	public Response cittadiniCitIdDocumentiIdDocumentoDettaglioDocumentoGet(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento,
			String categoria, String componenteLocale, String flagRol, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdDocumentiIdDocumentoDettaglioDocumentoGetService.class, citId, idDocumento,
				categoria, componenteLocale, flagRol, securityContext, httpHeaders);
	}
	
	@Override
	public Response cittadiniCitIdDocumentiEpisodiIdEpisodioDocumentiEpisodioGet(String xRequestId,
			String xForwardedFor, String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId,
			BigDecimal idEpisodio, String componenteLocale, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdDocumentiEpisodiIdEpisodioDocumentiEpisodioGetService.class, citId,
				idEpisodio, componenteLocale, securityContext, httpHeaders);
	}




	@Override
	public Response cittadiniCitIdRefertiPdfGet(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, String citId, String componenteLocale, String idDocumentoCl, String pin,
			String firmato, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdRefertiPdfGetService.class, citId, componenteLocale, idDocumentoCl,  pin,
				firmato, securityContext, httpHeaders) ;
	}


	@Override
	public Response cittadiniCitIdAccessiGet(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, String citId, String dataInizioRicerca, String dataFineRicerca,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdAccessiGetService.class,  citId, dataInizioRicerca, dataFineRicerca,
			securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCitIdDocumentiCodiceDocumentoDipartimentalePrenotazionePost(String xRequestId,
			String xForwardedFor, String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId,
			String codiceDocumentoDipartimentale, PayloadPrenotaImmagine payloadPrenotaImmagine,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdDocumentiCodiceDocumentoDipartimentalePrenotazionePostService.class, citId, codiceDocumentoDipartimentale, payloadPrenotaImmagine,
				securityContext, httpHeaders);
	}




/*	@Override
	public Response cittadiniCitIdDocumentiIdDocumentoDocumentoGet(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento,
			String idEpisodio, String componenteLocale, Boolean firmatoDigitalmente, Boolean criptato,
			String tipoDocumento, String codiceRuolo, String idRepository, String documentoDipartimentale,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiIdDocumentoDocumentoGetService.class,  citId,  idDocumento,
				idEpisodio, componenteLocale, firmatoDigitalmente, criptato, tipoDocumento, idRepository,  documentoDipartimentale,codiceRuolo,
				securityContext, httpHeaders);
	}*/

	
	@Override
	public Response cittadiniCitIdDocumentiIdDocumentoDocumentoGet(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento,
			String idEpisodio, String componenteLocale, Boolean firmatoDigitalmente, Boolean criptato,
			String tipoDocumento, String codiceRuolo, String codiceAppVerticale, String idRepository,
			String documentoDipartimentale, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiIdDocumentoDocumentoGetService.class,  citId,  idDocumento,
				idEpisodio, componenteLocale, firmatoDigitalmente, criptato, tipoDocumento, idRepository,  documentoDipartimentale,codiceRuolo, codiceAppVerticale,
				securityContext, httpHeaders);
	}	


	@Override
	public Response cittadiniCitIdDocumentiCodiceDocumentoDipartimentaleStatoImmagineGet(String xRequestId,
			String xForwardedFor, String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId,
			String codiceDocumentoDipartimentale, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdDocumentiCodiceDocumentoDipartimentaleStatoImmagineGetService.class, citId,
				codiceDocumentoDipartimentale, securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCitIdDocumentiCodiceDocumentoDipartimentaleVerificaDocumentoScaricabileGet(
			String xRequestId, String xForwardedFor, String xCodiceServizio, String shibIdentitaCodiceFiscale,
			String citId, String codiceDocumentoDipartimentale, String codiceAppVerticale, String componenteLocale,String codiceRuolo,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiCodiceDocumentoDipartimentaleVerificaDocumentoScaricabileGetService.class, citId,
				codiceDocumentoDipartimentale, codiceAppVerticale, componenteLocale, codiceRuolo,securityContext, httpHeaders);
	}
	
	


	@Override
	public Response cittadiniTaxCodeDocumentiCodiceAzioneDocumentoScaricabileExtGet(String xRequestId,
			String xForwardedFor, String xCodiceServizio, String shibIdentitaCodiceFiscale, String taxCode,
			String codiceAzione, String codiceAppVerticale, String documentoId, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiCodiceAzioneDocumentoScaricabileExtGet.class, taxCode,
				codiceAzione, codiceAppVerticale, documentoId, securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCfConsultazionePreferenzePut(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String xForwardedFor, String cf, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCfConsultazionePreferenzePutService.class, shibIdentitaCodiceFiscale,  xRequestID,
				 xCodiceServizio, xForwardedFor, cf,  securityContext,  httpHeaders) ;
	}


	@Override
	public Response cittadiniCitIdAuditPost(String xRequestId, String xForwardedFor, String xCodiceServizio,
			String shibIdentitaCodiceFiscale, String citId, PayloadSetAudit payloadSetAudit, String ruolo,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdAuditPostService.class, citId,  payloadSetAudit,ruolo,
				securityContext, httpHeaders);
	}


	@Override
	public Response cittadiniCitIdDocumentiIdDocumentoZipGet(String xRequestId, String xForwardedFor,
			String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId, String idDocumento, String codiceCl,
			String archivioDocumentoIlec, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdDocumentiIdDocumentoZipGetService.class, citId, idDocumento, codiceCl, archivioDocumentoIlec,
				securityContext, httpHeaders) ;
	}
	

	@Override
	public Response cittadiniCitIdDocumentiCodiceDocumentoDipartimentaleVerificaStatoRichiesta2Get(String xRequestId,
			String xForwardedFor, String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId,
			String codiceDocumentoDipartimentale, String codiceCl, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiCodiceDocumentoDipartimentaleVerificaStatoRichiesta2Get.class, xRequestId,
				xForwardedFor, xCodiceServizio, shibIdentitaCodiceFiscale, citId,
				codiceDocumentoDipartimentale, codiceCl, securityContext,
				httpHeaders);
	}

	

/*	@Override
	public Response cittadiniCitIdDocumentiIdDocumentoVerificaDocumentoScaricabileGet(String xRequestId,
			String xForwardedFor, String xCodiceServizio, String shibIdentitaCodiceFiscale, String citId,
			String idDocumento, String codiceAppVerticale, String componenteLocale, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdDocumentiIdDocumentoVerificaDocumentoScaricabileGet.class, citId,
				idDocumento, codiceAppVerticale, componenteLocale, securityContext, httpHeaders);
	}
	*/





	




	
}
