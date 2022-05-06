/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.FarabFarmRESTBaseService;
import it.csi.apisan.apisanfarm.dto.apisanfarm.PayloadDeviceCertificatoOtp;
import it.csi.dma.farmab.interfacews.msg.farab.Dispositivo;
import it.csi.dma.farmab.interfacews.msg.farab.ElencoErroriType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DeviceCertificatoPostService extends FarabFarmRESTBaseService {
	
	private PayloadDeviceCertificatoOtp payloadDeviceCertificatoOtp;
	private String codiceVerticaleDelega;
	
	public DeviceCertificatoPostService(String codiceVerticaleDelega, PayloadDeviceCertificatoOtp payloadDeviceCertificatoOtp, SecurityContext securityContext,
			HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.payloadDeviceCertificatoOtp = payloadDeviceCertificatoOtp;
		this.codiceVerticaleDelega = codiceVerticaleDelega;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Impostare il codice del servizio");
		checkNotNull(payloadDeviceCertificatoOtp, "Impostare il payload");
		checkNotBlank(xRequestID, "Impostare xrequest id");
		checkNotBlank(xForwardedFor, "Impostare forwarded for");
		checkNotBlank(codiceVerticaleDelega, "Impostare codice verticale delega");
		Holder<String> esito = new Holder<String>();
		Holder<ElencoErroriType> elencoErrori = new Holder<ElencoErroriType>();
		
		Dispositivo dispositivo = new Dispositivo();
		
		dispositivo.setBrowser(payloadDeviceCertificatoOtp.getBrowser());
		dispositivo.setModello(payloadDeviceCertificatoOtp.getModello());
		dispositivo.setSistemaOperativo(payloadDeviceCertificatoOtp.getSistemaOperativo());
		
		
		service.certificaDeviceConOtp(createNewRichiedente(codiceVerticaleDelega, payloadDeviceCertificatoOtp.getCodiceFiscale() ), payloadDeviceCertificatoOtp.getUuid(), payloadDeviceCertificatoOtp.getOtp(), 
				payloadDeviceCertificatoOtp.getCodiceFiscale(), dispositivo, esito, elencoErrori);
		
		checkSuccesso(esito, elencoErrori, this.getClass());
		
		return Response.ok().build();
	}
	
	private void checkPayload() {
		checkNotBlank(payloadDeviceCertificatoOtp.getCodiceFiscale(), "Impostare codice fiscale del cittadino");
		checkNotBlank(payloadDeviceCertificatoOtp.getUuid(), "Impostare codice uuid");
		checkNotBlank(payloadDeviceCertificatoOtp.getOtp(), "Impostare codice OTP");
		checkNotBlank(payloadDeviceCertificatoOtp.getModello(), "Impostare il modello");
		checkNotBlank(payloadDeviceCertificatoOtp.getBrowser(), "Impostare il modello");
		checkNotBlank(payloadDeviceCertificatoOtp.getSistemaOperativo(), "Impostare il modello");
	}
}
