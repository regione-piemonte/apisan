/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseUtilityRESTBaseService;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelParametroAudit;
import it.csi.apisan.apisanfse.dto.apisanfse.PayloadSetAudit;
import it.csi.apisan.apisanfse.integration.utility.dmacc.ParametroAudit;
import it.csi.apisan.apisanfse.integration.utility.dmacc.SetAuditRequest;
import it.csi.apisan.apisanfse.integration.utility.dmacc.SetAuditResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdAuditPostService extends FseUtilityRESTBaseService {
	private String citId;
	private String ruolo;
	private PayloadSetAudit payloadSetAudit;
	
	
	public CittadiniCitIdAuditPostService(String citId, PayloadSetAudit payloadSetAudit,String ruolo,
			SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		this.ruolo = ruolo;
		this.payloadSetAudit = payloadSetAudit;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Valorizzare xRequestId");
		checkNotBlank(xCodiceServizio, "Valorizare X-Codice-Servizio");
		checkNotBlank(shibIdentitaCodiceFiscale, "Valorizzare l'identità");
		checkNotNull(payloadSetAudit, "Valorizzare payload");
		checkCondition(valorizzatoUnoTraVerticaleeAudit(), "Valorizzare il codice verticale o il codice audit");
		
		SetAuditResponse res = serviceUtility.setAudit(createRequest());
		checkSuccessoServiceUtility(res);
		return Response.status(Status.CREATED).build();
	}
	
	private boolean valorizzatoUnoTraVerticaleeAudit() {
		return StringUtils.isNotEmpty(payloadSetAudit.getCodiceVerticale()) || StringUtils.isNotEmpty(payloadSetAudit.getCodiceAudit());
	}
	
	private SetAuditRequest createRequest() {
		SetAuditRequest request = new SetAuditRequest();
		request.setRichiedente(newRichiedenteInfo(payloadSetAudit.getCodiceVerticale(),ruolo));
		request.setCfPaziente(citId);
		String codiceAudit ="";
		
		if(StringUtils.isEmpty(payloadSetAudit.getCodiceAudit())) {
			codiceAudit = "ACC_" + payloadSetAudit.getCodiceVerticale();
		}else {
			codiceAudit = payloadSetAudit.getCodiceAudit();
		}
		ParametroAudit paramUno = new ParametroAudit();
		paramUno.setIndice(1);
		paramUno.setValore(shibIdentitaCodiceFiscale);
		request.getParametroAudit().add(paramUno);
		int i = 1;
		if(!shibIdentitaCodiceFiscale.equalsIgnoreCase(citId) && !("PRESA_IN_CARICO".equalsIgnoreCase(payloadSetAudit.getCodiceAudit()))) {
			codiceAudit += "_DEL";
			ParametroAudit paramDue = new ParametroAudit();
			paramDue.setIndice(2);
			paramDue.setValore(citId);
			request.getParametroAudit().add(paramDue);
			i++;
		}
		request.setCodiceAudit(codiceAudit);
		if(payloadSetAudit.getParametri() != null && payloadSetAudit.getParametri().size() > 0) {
			
			
			List<ModelParametroAudit> listaParametriSorted = payloadSetAudit.getParametri().stream()
					.sorted(Comparator.comparing(ModelParametroAudit::getIndice)).collect(Collectors.toList());
			
			for(ModelParametroAudit par : listaParametriSorted) {
				ParametroAudit paramTmp = new ParametroAudit();
				paramTmp.setIndice(new Integer( par.getIndice()) + i);
				paramTmp.setValore(par.getValore());
				request.getParametroAudit().add(paramTmp);
				
				
			}
		}
		
		return request;
	}

}
