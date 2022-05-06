/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.business.apisanscreen.impl;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanscreen.business.apisanscreen.CittadiniApi;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.ServiceExecutor;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdAppuntamentoCitologicoGetService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdAppuntamentoMammograficoGetService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdAppuntamentoPostService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdAppuntamentoTipologiaIdGetService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdAppuntamentoTipologiaIdOperazioniConsentiteGetService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdAppuntamentoTipologiaIdPrenotabileGetService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdAppuntamentoTipologiaIdPutService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdContattiPutService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdDocumentiDocumentoIdGetService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdDocumentiGetService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdGetService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdLuogoPutService;
import it.csi.apisan.apisanscreen.business.apisanscreen.impl.base.service.CittadiniCitIdSessoGetService;
import it.csi.apisan.apisanscreen.dto.apisanscreen.PayloadAppuntamentoModifica;
import it.csi.apisan.apisanscreen.dto.apisanscreen.PayloadAppuntamentoNiovo;
import it.csi.apisan.apisanscreen.dto.apisanscreen.PayloadContattiModifica;
import it.csi.apisan.apisanscreen.dto.apisanscreen.PayloadLuogoModifica;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiServiceImpl implements CittadiniApi {

	@Override
	public Response cittadiniCitIdAppuntamentoCitologicoGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String codiceInterno,
			String codiceInternoPrefisso, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdAppuntamentoCitologicoGetService.class, citId, codiceInterno,
				codiceInternoPrefisso, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdAppuntamentoMammograficoGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String codiceInterno,
			String codiceInternoPrefisso, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdAppuntamentoMammograficoGetService.class, citId,  codiceInterno,
				codiceInternoPrefisso,  securityContext,  httpHeaders);
	}

	@Override
	public Response cittadiniCitIdAppuntamentoPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String codiceInterno,
			String codiceInternoPrefisso, PayloadAppuntamentoNiovo payloadAppuntamentoNiovo,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdAppuntamentoPostService.class, citId,  codiceInterno,
				 codiceInternoPrefisso,  payloadAppuntamentoNiovo,
				 securityContext,  httpHeaders);
	}

	@Override
	public Response cittadiniCitIdAppuntamentoTipologiaIdGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String tipologiaId, String codiceInterno,
			String codiceInternoPrefisso, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdAppuntamentoTipologiaIdGetService.class, citId, tipologiaId, codiceInterno,
				codiceInternoPrefisso, securityContext, httpHeaders);
	}

// TODO DA togliere	@Override
	public Response cittadiniCitIdAppuntamentoTipologiaIdPrenotabileGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String tipologiaId,
			String codiceInterno, String codiceInternoPrefisso, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdAppuntamentoTipologiaIdPrenotabileGetService.class, citId, tipologiaId,
			 codiceInterno,  codiceInternoPrefisso,  securityContext, httpHeaders);
	}

	
	@Override
	public Response cittadiniCitIdAppuntamentoTipologiaIdOperazioniConsentiteGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String tipologiaId,
			String codiceInterno, String codiceInternoPrefisso, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdAppuntamentoTipologiaIdOperazioniConsentiteGetService.class , citId, tipologiaId,
			 codiceInterno, codiceInternoPrefisso, securityContext, httpHeaders);
	}
	
	@Override
	public Response cittadiniCitIdAppuntamentoTipologiaIdPut(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String tipologiaId, String codiceInterno,
			String codiceInternoPrefisso, PayloadAppuntamentoModifica payloadAppuntamentoModifica,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdAppuntamentoTipologiaIdPutService.class, citId, tipologiaId, codiceInterno,
				codiceInternoPrefisso,  payloadAppuntamentoModifica, securityContext, httpHeaders);
	}

	

	@Override
	public Response cittadiniCitIdDocumentiGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String codiceInterno,
			String codiceInternoPrefisso, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdDocumentiGetService.class, citId, codiceInterno,
				codiceInternoPrefisso, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor,
			String xCodiceServizio, String citId, SecurityContext securityContext, HttpHeaders httpHeaders) {
		return ServiceExecutor.execute(CittadiniCitIdGetService.class, citId, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdLuogoPut(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor,
			String xCodiceServizio, String citId, String codiceInterno, String codiceInternoPrefisso,
			PayloadLuogoModifica payloadLuogoModifica, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdLuogoPutService.class, citId,  codiceInterno,  codiceInternoPrefisso,
				 payloadLuogoModifica,  securityContext,  httpHeaders);
	}

	@Override
	public Response cittadiniCitIdSessoGet(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor,
			String xCodiceServizio, String citId, SecurityContext securityContext, HttpHeaders httpHeaders) {

		return ServiceExecutor.execute(CittadiniCitIdSessoGetService.class, shibIdentitaCodiceFiscale, xRequestId, xForwardedFor,
				xCodiceServizio, citId, securityContext, httpHeaders);
	}

	@Override
	public Response cittadiniCitIdContattiPut(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor,
			String xCodiceServizio, String citId, String codiceInterno, String codiceInternoPrefisso,
			PayloadContattiModifica payloadContattiModifica, SecurityContext securityContext, HttpHeaders httpHeaders) {
		
		return ServiceExecutor.execute(CittadiniCitIdContattiPutService.class, citId, codiceInterno, codiceInternoPrefisso, 
				 payloadContattiModifica,  securityContext,  httpHeaders);
	}

	@Override
	public Response cittadiniCitIdDocumentiDocumentoIdGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Integer documentoId,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCitIdDocumentiDocumentoIdGetService.class, citId,  documentoId,  securityContext,  httpHeaders);
	}



	

}
