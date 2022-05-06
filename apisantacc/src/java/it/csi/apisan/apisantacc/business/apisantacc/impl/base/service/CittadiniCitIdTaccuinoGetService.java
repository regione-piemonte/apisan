/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.business.apisantacc.impl.base.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisantacc.business.apisantacc.impl.base.TaccTaccuinoRESTBaseService;
import it.csi.apisan.apisantacc.business.mapper.ModelSintomoSintomoMapper;
import it.csi.apisan.apisantacc.business.mapper.ModelTaccuinoTaccuinoMapper;
import it.csi.apisan.apisantacc.dto.apisantacc.EntitaCodice;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelEntita;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelNoteGenerali;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelPreferenza;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelRilevazioneGruppo;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelSintomo;
import it.csi.apisan.apisantacc.dto.apisantacc.ModelTaccuino;
import it.csi.apisan.apisantacc.dto.apisantacc.RilevazioneGruppoCodice;
import it.csi.dma.RisultatoCodice;
import it.csi.dma.dmaclbluc.GetSintomiResponse;
import it.csi.dma.dmaclbluc.GetTaccuinoRequest;
import it.csi.dma.dmaclbluc.GetTaccuinoResponse;


@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCitIdTaccuinoGetService extends TaccTaccuinoRESTBaseService{

	//static String[] descrizioniGruppo = {"Pressione","Peso","Temperatura","Insulina","Glicemia","Ossimetria","Colesterolo","Emoglobina","Freq. resp"};
	String citId;
	GetTaccuinoRequest taccuinoRequest= new GetTaccuinoRequest();
	
	// shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
	//SecurityContext securityContext, HttpHeaders httpHeaders
	public CittadiniCitIdTaccuinoGetService(String shibIdentitaCodiceFiscale, String xRequestId, String xForwardedFor,
			String xCodiceServizio,  String citId,  SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.citId = citId;
		taccuinoRequest.setRichiedente(newRichiedenteTaccuino());
		taccuinoRequest.setPaziente(citId);
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkNotBlank(citId, "Codice fiscale non valorizzato");
		GetTaccuinoResponse response = taccuinoService.getTaccuino(taccuinoRequest);
		if (!response.getEsito().name().equalsIgnoreCase(RisultatoCodice.SUCCESSO.value())) {
			throw toRESTException(response.getErrori());
		} else {
			ModelTaccuino taccuino = new ModelTaccuinoTaccuinoMapper().from(response);
			return Response.ok(taccuino).build();
		}

		
		//ModelTaccuino modelTaccuino = buildMockedTaccuino();

		//Response.ok(modelTaccuino).build();
	}

/*	
	public ModelTaccuino buildMockedTaccuino() {
		
		ModelTaccuino modelTaccuino = new ModelTaccuino();
		modelTaccuino.setId(1L);
		modelTaccuino.setOscurato(false);
		
		ModelNoteGenerali modelNoteGenerali = new ModelNoteGenerali();
		modelNoteGenerali.setStatoSalute("Una meraviglia");
		modelNoteGenerali.setStileVita("Mi diverto tantissimo");
		modelNoteGenerali.setDataAggiornamento(new Date());
		modelNoteGenerali.setDataCreazione(new Date());
		modelTaccuino.setNoteGenerali(modelNoteGenerali);
		
		
		int i = 0;
		List<ModelPreferenza> listPreferenza = new ArrayList<ModelPreferenza>();
		
		for (RilevazioneGruppoCodice rilevazioneGruppoCodice : RilevazioneGruppoCodice.values()) { 
			ModelPreferenza modelPreferenza = new ModelPreferenza();
			modelPreferenza.setEntitaCodice(EntitaCodice.RILEVAZIONI);
			modelPreferenza.setGruppoCodice(rilevazioneGruppoCodice);
			modelPreferenza.setId(new Long(i+1));
			modelPreferenza.setVisibile(true);
			
			ModelEntita modelEntita = new ModelEntita();
			modelEntita.setCodice(EntitaCodice.RILEVAZIONI);
			modelEntita.setDescrizione("Rilevazioni");
			modelPreferenza.setEntita(modelEntita);
			
			ModelRilevazioneGruppo modelRilevazioneGruppo = new ModelRilevazioneGruppo();
			modelRilevazioneGruppo.setCodice(rilevazioneGruppoCodice);
			modelRilevazioneGruppo.setDescrizione(descrizioniGruppo[i]);
			modelRilevazioneGruppo.setDescrizioneEstesa(descrizioniGruppo[i] + " estesa");
			modelPreferenza.setGruppo(modelRilevazioneGruppo);
			
			
			listPreferenza.add(modelPreferenza);
			
			i++;
		}
		
		for(EntitaCodice entitaCodice: EntitaCodice.values()) {
			if(!entitaCodice.toString().equalsIgnoreCase("rilevazioni")) {
			ModelPreferenza modelPreferenza = new ModelPreferenza();
			modelPreferenza.setVisibile(true);
			modelPreferenza.setId(new Long(++i));
			modelPreferenza.setEntitaCodice(entitaCodice);
			
			ModelEntita modelEntita = new ModelEntita();
			modelEntita.setCodice(entitaCodice);
			modelEntita.setDescrizione(StringUtils.capitalize(entitaCodice.toString().toLowerCase()));
			modelPreferenza.setEntita(modelEntita);
			
			listPreferenza.add(modelPreferenza);
			}
		}
		
		modelTaccuino.setPreferenze(listPreferenza);
		
		return modelTaccuino;
	}*/
}
