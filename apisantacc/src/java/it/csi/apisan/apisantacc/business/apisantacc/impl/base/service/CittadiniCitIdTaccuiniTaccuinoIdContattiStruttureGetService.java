/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseService;
import it.csi.apisan.apisantacc.business.mapper.ModelContattoContattiStruttureMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelContatto;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.GetContattiStruttureRequest;
import it.csi.dma.dmaclbluc.GetContattiStruttureResponse;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuiniTaccuinoIdContattiStruttureGetService extends TaccTaccuinoRESTBaseService {



	String citId;
	GetContattiStruttureRequest contattiStruttureRequest;
	

	public CittadiniCitIdTaccuiniTaccuinoIdContattiStruttureGetService(String shibIdentitaCodiceFiscale, String xRequestId,
			String xForwardedFor, String xCodiceServizio, String citId, Long taccuinoId, Integer limit,
			Integer offset, String ordinamento, String da, String a, SecurityContext securityContext,
			HttpHeaders httpHeaders)  {
		super(securityContext, httpHeaders);
		this.citId = citId;
		contattiStruttureRequest = newRequestCommonGet(taccuinoId, limit, offset, ordinamento, da, a);
	}
	
	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "xRequestID non impostato");
		checkNotBlank(xCodiceServizio, "xRequestID non impostato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Cittadino non autenticato");
		checkNotBlank(xForwardedFor, "xForwardedFor non impostato");
		//checkNotNull(requestCommonGet.get, re);
		
		GetContattiStruttureResponse response = taccuinoService.getContattiStrutture(contattiStruttureRequest);
		if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			toRESTException(response.getErrori());
		} else {
			List<ModelContatto> contatti = new ModelContattoContattiStruttureMapper().fromList(response.getListaContattiStrutture().getContattoStruttura());
			return Response.ok(contatti).build();
		}
		return null;
		
	}
	
	private GetContattiStruttureRequest newRequestCommonGet( 
			Long taccuinoId, 
			Integer limit,
			Integer offset, 
			String ordinamento, 	
			String da, 
			String a) {
		GetContattiStruttureRequest request = new GetContattiStruttureRequest();
		request= (GetContattiStruttureRequest)setGenericGetRequest(request, taccuinoId, limit, offset, ordinamento, da, a);
				request.setPaziente(citId);				
				return request;
			}
/*	
	public List<ModelContatto> buildMockedListContattiStrutture(){
		
		List<ModelContatto> listContattiStrutture = new ArrayList<ModelContatto>();
		listContattiStrutture.add(buildMockedContatto("ospedale valdese",
				"ecografia pancia", "", ContattoTipoCodice.VIS, StrutturaTipoCodice.STRUT_SAN));
		listContattiStrutture.add(buildMockedContatto("ospedale martini",
				"ecografia tiroide", "", ContattoTipoCodice.TRATMED, StrutturaTipoCodice.STRUT_SAN));
		listContattiStrutture.add(buildMockedContatto("ospedale mauriziano",
				"radiografia bacino", "", ContattoTipoCodice.PS, StrutturaTipoCodice.STRUT_SAN));
		listContattiStrutture.add(buildMockedContatto("agopuntura dr.bianchi",
				"", "sedute", null, StrutturaTipoCodice.MNC));
		listContattiStrutture.add(buildMockedContatto("Pranoterapeuta Marco Rossi centro \"naturopatia e yoga\" di Chivasso",
				"", "sedute private", null, StrutturaTipoCodice.MNC));
		
		i = 0;

		return listContattiStrutture;
	}
	
	public ModelContatto buildMockedContatto(String descrizione, String motivazione,
			String medicinaNonConvenzionaleTipoContatto, ContattoTipoCodice contattoTipoCodice,
			StrutturaTipoCodice strutturaTipoCodice) {
		
		ModelContatto modelContatto = new ModelContatto();
		modelContatto.setId(new Long(++i));
		//modelContatto.setDescrizione(descrizione);
		modelContatto.setDataContattoInizio(new Date());
		modelContatto.setMedicinaNonConvenzionaleTipoContatto(medicinaNonConvenzionaleTipoContatto);
		modelContatto.setMotivazione(motivazione);
		modelContatto.setDataCreazione(new Date());
		modelContatto.setTipoContattoCodice(contattoTipoCodice);
		modelContatto.setStrutturaTipoCodice(strutturaTipoCodice);
		
		ModelContattoTipo modelContattoTipo = new ModelContattoTipo();
		modelContattoTipo.setCodice(contattoTipoCodice);
		modelContattoTipo.setDescrizione("descrizione tipo contatto");
		modelContatto.setTipoContatto(modelContattoTipo);
		
		ModelContattoStrutturaTipo modelContattoStrutturaTipo = new ModelContattoStrutturaTipo();
		modelContattoStrutturaTipo.setCodice(strutturaTipoCodice);
		modelContattoStrutturaTipo.setDescrizione("descrizione struttura tipo");
		modelContatto.setStrutturaTipo(modelContattoStrutturaTipo);
		
		
		return modelContatto;
	}
	*/
	
}
