/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.business.apisanfse.impl.base.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanfse.business.apisanfse.impl.base.FseScreeningRESTBaseService;
import it.csi.apisan.apisanfse.business.mapper.ModelEsameScreeningMapper;
import it.csi.apisan.apisanfse.business.mapper.ModelInformazioniSistemiScreeningInformazioniSistemiScreeningMapper;
import it.csi.apisan.apisanfse.business.mapper.ModelPazienteScreeningMapper;
import it.csi.apisan.apisanfse.dto.apisanfse.Codifica;
import it.csi.apisan.apisanfse.dto.apisanfse.Delega;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEsameScreening;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelInformazioniSistemiScreening;
import it.csi.apisan.apisanfse.integration.screening.dma.InformazioniSistemiScreening;
import it.csi.apisan.apisanfse.integration.screening.dma.PazienteSOL;
import it.csi.apisan.apisanfse.integration.screening.dma.RisultatoCodice;
import it.csi.apisan.apisanfse.integration.screening.dmacc.ScreeningRequest;
import it.csi.apisan.apisanfse.integration.screening.dmacc.ScreeningResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdScreeningGetService extends FseScreeningRESTBaseService {
	
	private String citId;
	private String servizio;
	
	public CittadiniCitIdScreeningGetService(String xRequestId, String xForwardedFor, String xCodiceServizio,
	String shibIdentitaCodiceFiscale, String citId, String servizio, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestId, xCodiceServizio, securityContext, httpHeaders);
		this.citId=citId;	
		this.servizio=servizio;
	}

	@Override
	protected Response execute() {
		
		String METHOD_NAME = "execute";
		log.info(METHOD_NAME, "GetScreening versione 1.0.0");
		checkNotNull(xRequestID, "Request non valorizzata");
		checkNotNull(xForwardedFor, "ip chiamante non valorizzato");
		checkNotBlank(xForwardedFor, "ip chiamante non valorizzato");
		checkNotBlank(citId, "Codice fiscale non valorizzato");			
		checkNotNull(servizio, "Codice del servizio non valorizzata");
		checkNotBlank(servizio, "Codice del servizio non valorizzato");
		checkCodiceFiscaleValido(citId);	
		verificaUtenteAutorizzatoODelegato(citId, servizio, new Delega());
			    
	    ScreeningRequest request = new ScreeningRequest();
	    PazienteSOL pazienteSOL = new PazienteSOL();
	    pazienteSOL.setCodiceFiscale(this.citId);
	    request.setPaziente(pazienteSOL);
	    request.setRichiedente(newRichiedenteInfo(this.servizio));
	    
	    ScreeningResponse response = screeningService.getScreening(request);

	    //In caso di fallimento torno errore
        if(response.getEsito().equals(RisultatoCodice.FALLIMENTO)) {
        	throw toRESTScreeningException(response.getErrori());
        }
        
        List<InformazioniSistemiScreening> informazioniSistemiScreening = response.getInformazioniSistemiScreening();
        
        List<ModelInformazioniSistemiScreening> modelInformazioniSistemiScreening = new ModelInformazioniSistemiScreeningInformazioniSistemiScreeningMapper().fromList(informazioniSistemiScreening);
        
       /* List<ModelEsameScreening> modelEsameScreeningList = new ArrayList<ModelEsameScreening>();
        informazioniSistemiScreening.stream().forEach(s -> {        	                	
            modelInformazioniSistemiScreening.setPaziente(new ModelPazienteScreeningMapper().from(s.getPaziente()));            
            Codifica tipo = new Codifica();
            BeanUtils.copyProperties(s.getTipo(), tipo);
            modelInformazioniSistemiScreening.setTipo(tipo);                                   
            modelEsameScreeningList.addAll(new ModelEsameScreeningMapper().fromList(s.getEsami())); 
        });                
        
        modelInformazioniSistemiScreening.setEsami(modelEsameScreeningList);*/	    	    	    	                   
	    	                			
		return Response.ok(modelInformazioniSistemiScreening).build();

	}
}
