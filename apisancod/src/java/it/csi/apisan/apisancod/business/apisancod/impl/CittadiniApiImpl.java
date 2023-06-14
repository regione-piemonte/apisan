/*******************************************************************************

* Copyright Regione Piemonte - 2023

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancod.business.apisancod.impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisancod.business.apisancod.CittadiniApi;
import it.csi.apisan.apisancod.business.apisancod.impl.base.ServiceExecutor;
import it.csi.apisan.apisancod.business.apisancod.impl.base.service.CittadiniCitIdAbilitazioneGetService;
import it.csi.apisan.apisancod.business.apisancod.impl.base.service.CittadiniCitIdConversazioniGetService;
import it.csi.apisan.apisancod.business.apisancod.impl.base.service.CittadiniCitIdConversazioniIdConversazioneMessaggiGetService;
import it.csi.apisan.apisancod.business.apisancod.impl.base.service.CittadiniCitIdConversazioniIdConversazioneMessaggiIdMessaggioLettoPutService;
import it.csi.apisan.apisancod.business.apisancod.impl.base.service.CittadiniCitIdConversazioniIdConversazioneMessaggiIdMessaggioPutService;
import it.csi.apisan.apisancod.business.apisancod.impl.base.service.CittadiniCitIdConversazioniIdConversazioneMessaggiPostService;
import it.csi.apisan.apisancod.business.apisancod.impl.base.service.CittadiniCitIdConversazioniPostService;
import it.csi.apisan.apisancod.business.apisancod.impl.base.service.CittadiniCitIdInfoMedicoGetService;
import it.csi.apisan.apisancod.dto.apisancod.PayloadConversazione;
import it.csi.apisan.apisancod.dto.apisancod.PayloadMessaggio;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class CittadiniApiImpl implements CittadiniApi {

	public CittadiniApiImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Response cittadiniCitIdAbilitazioneGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String cfMedico,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdAbilitazioneGetService.class, citId, cfMedico,
				securityContext, httpHeaders, httpRequest);
	}

	@Override
	public Response cittadiniCitIdConversazioniGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, String solaLettura, Integer limit,
			Integer offset, String cfMedico, String argomento, String idConversazione, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdConversazioniGetService.class,  citId, solaLettura, limit,
				offset, cfMedico, argomento, idConversazione, securityContext,
				httpHeaders, httpRequest);
	}

	@Override
	public Response cittadiniCitIdConversazioniIdConversazioneMessaggiGet(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String idConversazione,
			Integer limit, Integer offset, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdConversazioniIdConversazioneMessaggiGetService.class, citId, idConversazione,
				limit, offset, securityContext, httpHeaders,httpRequest);
	}


	@Override
	public Response cittadiniCitIdConversazioniIdConversazioneMessaggiIdMessaggioPut(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String idConversazione,
			String idMessaggio, PayloadMessaggio payloadMessaggio, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCitIdConversazioniIdConversazioneMessaggiIdMessaggioPutService.class, citId, idConversazione,
				idMessaggio, payloadMessaggio, securityContext, httpHeaders, httpRequest);
	}

	@Override
	public Response cittadiniCitIdConversazioniIdConversazioneMessaggiPost(String shibIdentitaCodiceFiscale,
			String xRequestId, String xForwardedFor, String xCodiceServizio, String citId, String idConversazione,
			PayloadMessaggio payloadMessaggio, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdConversazioniIdConversazioneMessaggiPostService.class, citId, idConversazione,
				payloadMessaggio, securityContext, httpHeaders, httpRequest);
	}

	@Override
	public Response cittadiniCitIdConversazioniPost(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, PayloadConversazione payloadConversazione,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdConversazioniPostService.class, citId, payloadConversazione,
				securityContext, httpHeaders, httpRequest);
	}

	@Override
	public Response cittadiniCitIdInfoMedicoGet(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		// TODO Auto-generated method stub
		return ServiceExecutor.execute(CittadiniCitIdInfoMedicoGetService.class, citId, securityContext,
				httpHeaders, httpRequest);
	}

	@Override
	public Response cittadiniCitIdConversazioniIdConversazioneMessaggiIdMessaggioLettoPut(
			String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor, String xCodiceServizio,
			String citId, String idConversazione, String idMessaggio, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		
		return ServiceExecutor.execute(CittadiniCitIdConversazioniIdConversazioneMessaggiIdMessaggioLettoPutService.class, citId, idConversazione, idMessaggio, securityContext,
				httpHeaders, httpRequest);
	}

}
