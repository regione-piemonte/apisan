/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfarm.business.apisanfarm.impl.base.FarmRESTBaseService;
import it.csi.apisan.apisanfarm.business.integration.dao.ApisanFarmDErroreDao;
import it.csi.apisan.apisanfarm.dto.apisanfarm.ErroreDettaglio;
import it.csi.apisan.apisanfarm.exception.ErroreBuilder;
import it.csi.apisan.apisanfarm.exception.ErroreRESTException;
import it.csi.apisan.apisanfarm.util.ConstantsFarm;
import it.csi.iccws.dma.Errore;
import it.csi.iccws.dmacc.Errori;
import it.csi.iccws.dmacc.FarmaciaAderente;
import it.csi.iccws.dmacc.FarmaciaService;
import it.csi.iccws.dmacc.GetFarmacieAderentiRequest;
import it.csi.iccws.dmacc.GetFarmacieAderentiResponse;
import it.csi.iccws.dmacc.Richiedente;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class FarmacieAderentiCodiceGetService extends FarmRESTBaseService {

	@Autowired
	FarmaciaService service;
	
	@Autowired
	ApisanFarmDErroreDao erroreDao;

	public FarmacieAderentiCodiceGetService(SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);

	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Impostare request id");
		checkNotBlank(xCodiceServizio, "Impostare il codice servizio");
		GetFarmacieAderentiResponse response = service.getFarmacieAderenti(newGetFarmacieAderentiRequest());
		//compongo response
		List<String> res= new ArrayList<String>();
		if (response!=null) {
			checkSuccesso(response.getEsito().value(), response.getErrori(), FarmacieAderentiCodiceGetService.class);
			if (response.getFarmacie()!=null && response.getFarmacie().getFarmaciaAderente()!=null) {
				for (FarmaciaAderente element : response.getFarmacie().getFarmaciaAderente()) {
					res.add(element.getCodice());
				}
			}
		}
		//System.out.println("response: " + response.getEsito());

		return Response.ok().entity(res).build();
	}


	private GetFarmacieAderentiRequest newGetFarmacieAderentiRequest() {
		GetFarmacieAderentiRequest request=new GetFarmacieAderentiRequest();
		Richiedente rich=new Richiedente();
		rich.setApplicazioneChiamante(ConstantsFarm.DEFAULT_APPLICAZIONE_CHIAMANTE);
		rich.setUuid(java.util.UUID.randomUUID().toString());
		request.setRichiedente(rich);
		return request;
	}

protected void checkSuccesso(String esito, Errori errori, Class<?> methodName) {

		if (!ConstantsFarm.SUCCESSO.equals(esito) ) {
			if (errori != null && errori.getErrore() != null && errori.getErrore().size() > 0) {
				log.error(methodName.getName(), "Risposta dal servizio %s andata in errore con codice $s. Errore: %s",
						methodName);
				List<ErroreDettaglio> listaDettagli = errori.getErrore().stream().map( err -> {
					ErroreDettaglio d = new ErroreDettaglio();
					d.setChiave(err.getCodice());
					d.setValore(err.getDescrizione());
					return d;
				}).collect(Collectors.toList()) ;
				
				 it.csi.apisan.apisanfarm.dto.apisanfarm.Errore errorePres =  erroreDao.getMappingErrore(listaDettagli);
				 throw new ErroreRESTException(errorePres);
			}else {
				throw ErroreBuilder.from(502, methodName.getName()).exception();
			}
		}
	}




	protected ErroreRESTException toErroreRESTException(Errori elencoErrori) {
		String title = "Errore esecuzione servizio " + this.getClass().getSimpleName();
		List<Errore> errori = elencoErrori.getErrore();


		return ErroreBuilder.from(502, errori.get(0).getCodice()).title(title).dettagli(errori, elEr -> {
			ErroreDettaglio d = new ErroreDettaglio();
			d.setChiave(elEr.getCodice());
			d.setValore(elEr.getDescrizione());
			return d;
		}).exception(errori.get(0).getDescrizione());



	}
}
