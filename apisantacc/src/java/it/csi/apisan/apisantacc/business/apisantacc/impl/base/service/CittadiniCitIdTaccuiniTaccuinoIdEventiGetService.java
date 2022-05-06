/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import java.util.Date;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseService;
import it.csi.apisan.apisantacc.business.mapper.ModelEventoEventoMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelEvento;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.GetEventiRequest;
import it.csi.dma.dmaclbluc.GetEventiResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdEventiGetService extends TaccTaccuinoRESTBaseService {

	static int i = 0;
	String citId;
	String taccuinoId;
	Integer limit;
	Integer offset;
	String ordinamento;
	Date da;
	Date a;
	GetEventiRequest eventiRequest;

	public CittadiniCitIdTaccuiniTaccuinoIdEventiGetService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId, Integer limit,
			Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		eventiRequest=newRequestCommonGet(taccuinoId, limit, offset, ordinamento, da, a);
	}

	
	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "xRequestID non impostato");
		checkNotBlank(xCodiceServizio, "xRequestID non impostato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Cittadino non autenticato");
		checkNotBlank(xForwardedFor, "xForwardedFor non impostato");
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		GetEventiResponse response = taccuinoService.getEventi(eventiRequest);
		if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			toRESTException(response.getErrori());
		} else {
			List<ModelEvento> eventi =  new ModelEventoEventoMapper().fromList(response.getListaEventi().getEvento());
			return Response.ok(eventi).build();
		}
		return null;
		
		//return Response.ok(buildMockedListEventi()).build();
	}
/*
	public List<ModelEvento> buildMockedListEventi(){
		List<ModelEvento> listEventi = new ArrayList<ModelEvento>();
		
		listEventi.add(buildMockedEvento("viaggio alle maldive"));
		listEventi.add(buildMockedEvento("ho smesso di lavorare"));
		listEventi.add(buildMockedEvento("frattura caviglia"));
		listEventi.add(buildMockedEvento("sono andata in ferie"));
		listEventi.add(buildMockedEvento("insolazione"));
		
		i = 0;
		
		return listEventi;
	}
	
	public ModelEvento buildMockedEvento(String descrizione) {
		ModelEvento modelEvento = new ModelEvento();
		modelEvento.setId(new Long(++i));
		modelEvento.setDescrizione(descrizione);
		modelEvento.setData(new Date());
		modelEvento.setDataCreazione(modelEvento.getData());
		modelEvento.setDataAggiornamento(modelEvento.getData());
		
		return modelEvento;
	}
*/	
	private GetEventiRequest newRequestCommonGet( 
			Long taccuinoId, 
			Integer limit,
			Integer offset, 
			String ordinamento, 	
			String da, 
			String a) {
		GetEventiRequest request = new GetEventiRequest();
		request= (GetEventiRequest)setGenericGetRequest(request, taccuinoId, limit, offset, ordinamento, da, a);
		request.setPaziente(citId);				
		return request;
			}
}
