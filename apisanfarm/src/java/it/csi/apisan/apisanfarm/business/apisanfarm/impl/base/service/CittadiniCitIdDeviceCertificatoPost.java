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
import it.csi.apisan.apisanfarm.business.apisanfarm.mapper.ModelDeviceCertificatoCertificazioneTypeMapper;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelDeviceCertificato;
import it.csi.apisan.apisanfarm.dto.apisanfarm.PayloadDeviceCertificato;
import it.csi.dma.farmab.interfacews.msg.farab.CertificazioneType;
import it.csi.dma.farmab.interfacews.msg.farab.Codifica;
import it.csi.dma.farmab.interfacews.msg.farab.Dispositivo;
import it.csi.dma.farmab.interfacews.msg.farab.ElencoErroriType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdDeviceCertificatoPost extends FarabFarmRESTBaseService {
	
	private PayloadDeviceCertificato payloadDeviceCertificato;
	private String codiceVerticaleDelega;
	private String citId;
	
	public CittadiniCitIdDeviceCertificatoPost(String citId, String codiceVerticaleDelega,
			PayloadDeviceCertificato payloadDeviceCertificato, SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.payloadDeviceCertificato = payloadDeviceCertificato;
		this.codiceVerticaleDelega = codiceVerticaleDelega;
		this.citId = citId;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Impostare il codice del servizio");
		checkNotNull(payloadDeviceCertificato, "Impostare il payload");
		checkNotBlank(xRequestID, "Impostare xrequest id");
		checkNotBlank(xForwardedFor, "Impostare forwarded for");
		checkNotNull(shibIdentitaCodiceFiscale, "Impostare l'identità");
		checkNotBlank(codiceVerticaleDelega, "Impostare codice verticale delega");
		Holder<String> esito = new Holder<String>();
		Holder<ElencoErroriType> elencoErrori = new Holder<ElencoErroriType>();
		Holder<java.lang.String> statoCertificazione = new Holder<java.lang.String> ();
		Holder<CertificazioneType> datiCertificazione = new Holder<CertificazioneType>();
		
		Codifica fonte = new Codifica();
		fonte.setCodice(payloadDeviceCertificato.getFonteCodice());
		Dispositivo dispositivo = new Dispositivo();
		dispositivo.setBrowser(payloadDeviceCertificato.getBrowser());
		dispositivo.setModello(payloadDeviceCertificato.getModello());
		dispositivo.setSistemaOperativo(payloadDeviceCertificato.getSistemaOperativo());
		
		service.certificaDevice(createNewRichiedente(codiceVerticaleDelega, null), citId, 
				payloadDeviceCertificato.getUuid(), fonte, payloadDeviceCertificato.getTelefono(), dispositivo, 
				esito, elencoErrori, statoCertificazione, datiCertificazione);
		
		checkSuccesso(esito, elencoErrori, CittadiniCitIdDeviceCertificatoPost.class);
		ModelDeviceCertificato res = new ModelDeviceCertificatoCertificazioneTypeMapper().from(datiCertificazione.value);
		
		return Response.ok().entity(res).build();
	}
	
	private void checkPayload() {
		
		checkNotBlank(payloadDeviceCertificato.getUuid(), "Impostare codice uuid");
		checkNotBlank(payloadDeviceCertificato.getFonteCodice(), "Impostare codice OTP");
		checkNotBlank(payloadDeviceCertificato.getModello(), "Impostare il modello");
		checkNotBlank(payloadDeviceCertificato.getBrowser(), "Impostare il modello");
		checkNotBlank(payloadDeviceCertificato.getTelefono(), "Impostare il modello");
		checkNotBlank(payloadDeviceCertificato.getSistemaOperativo(), "Impostare il modello");
	}
}
