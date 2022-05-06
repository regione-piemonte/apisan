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
import it.csi.apisan.apisanfarm.business.apisanfarm.mapper.ModelFarmaciaOccasionaleFarmaciaOccasionaleTypeMapper;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ModelFarmaciaOccasionale;
import it.csi.apisan.apisanfarm.dto.apisanfarm.PayloadFarmaciaOccasionaleAutorizzazione;
import it.csi.dma.farmab.interfacews.msg.farab.ElencoErroriType;
import it.csi.dma.farmab.interfacews.msg.farab.FarmaciaOccasionaleType;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class FarmaciaOccasionaleAutorizzazionePostService extends FarabFarmRESTBaseService {
	
	private String codiceVerticaleDelega;
	private PayloadFarmaciaOccasionaleAutorizzazione payloadFarmaciaOccasionaleAutorizzazione;
	
	public FarmaciaOccasionaleAutorizzazionePostService(String codiceVerticaleDelega,
			PayloadFarmaciaOccasionaleAutorizzazione payloadFarmaciaOccasionaleAutorizzazione,
			SecurityContext securityContext, HttpHeaders httpHeaders, HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		this.codiceVerticaleDelega = codiceVerticaleDelega;
		this.payloadFarmaciaOccasionaleAutorizzazione = payloadFarmaciaOccasionaleAutorizzazione;
		
	}

	@Override
	protected Response execute() {
		checkNotBlank(xCodiceServizio, "Impostare il codice del servizio");
		checkNotBlank(xRequestID, "Impostare xrequest id");
		checkNotBlank(xForwardedFor, "Impostare forwarded for");
		checkNotBlank(codiceVerticaleDelega, "Impostare codice verticale delega");
		checkNotNull(payloadFarmaciaOccasionaleAutorizzazione, "Valorizzare il payload");
		
		Holder<String> esito = new Holder<String>();
		Holder<ElencoErroriType> elencoErrori = new Holder<ElencoErroriType>();
		Holder<FarmaciaOccasionaleType> farmaciaOccasionale = new Holder<FarmaciaOccasionaleType>(); 

		
		service.autorizzaFarmaciaOccasionale(createNewRichiedente(codiceVerticaleDelega, null), payloadFarmaciaOccasionaleAutorizzazione.getUuid(), esito, elencoErrori, farmaciaOccasionale);
		checkSuccesso(esito, elencoErrori, FarmaciaOccasionaleAutorizzazionePostService.class);
		 
		ModelFarmaciaOccasionale res = new ModelFarmaciaOccasionaleFarmaciaOccasionaleTypeMapper().from(farmaciaOccasionale.value);  
		
		return Response.ok().entity(res).build();
	}
	
	private void checkPayload() {
		checkNotBlank(payloadFarmaciaOccasionaleAutorizzazione.getUuid(), "Impostare l'uuid del device");
	}

}
