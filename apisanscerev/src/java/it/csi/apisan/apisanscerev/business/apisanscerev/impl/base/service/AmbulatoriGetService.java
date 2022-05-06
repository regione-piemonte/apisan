/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanscerev.business.apisanscerev.impl.base.LoccsiScerevRESTBaseService;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelAmbulatorioLoccsiMedicoModelAmbulatorioLoccsiMedicoMapper;
import it.csi.apisan.apisanscerev.business.apisanscerev.mapper.ModelDisponibilitaModelDisponibilitaMapper;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioLoccsi;
import it.csi.apisan.apisanscerev.dto.apisanscerev.ModelAmbulatorioLoccsiMedico;
import it.csi.apisan.apisanscerev.dto.scerev.ModelDisponibilita;
import it.csi.apisan.apisanscerev.exception.ErroreBuilder;
import it.csi.apisan.apisanscerev.exception.RESTException;
import it.csi.apisan.apisanscerev.util.Page;
import it.csi.apisan.apisanscerev.util.rest.ResponseService;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AmbulatoriGetService extends LoccsiScerevRESTBaseService {
	
	String nomeMedico;
	String sesso;
	String tipologia;
	String longitudine;
	String latitudine;
	BigDecimal distanza;
	Integer limit;
	Integer offset;
	Boolean disponibilita;
	@Autowired
	LoccsiServiceClient loccsiService;
	@Autowired
	ScerevServiceClient scerevService;
	
	
	public AmbulatoriGetService(String nomeMedico,String sesso,String tipologia,String longitudine,String latitudine,BigDecimal distanza,Integer limit,Integer offset, Boolean disponibilita, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		
		this.nomeMedico = nomeMedico;
		this.sesso = sesso;
		this.tipologia = tipologia;
		this.longitudine = longitudine;
		this.latitudine = latitudine;
		this.distanza = distanza;
		this.offset = offset == null?Page.DEFAULT_OFFSET.getValue() : offset ;
		this.limit = limit==null? Page.DEFAULT_LIMIT.getValue() : limit;
		this.disponibilita = disponibilita== null? true : disponibilita;
	}

	@Override
	protected Response execute() {
		//controllo obbligatorietà parametri
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		//verifica filter
		boolean nessunoValorizzato = (StringUtils.isEmpty(nomeMedico) && StringUtils.isEmpty(sesso) && StringUtils.isEmpty(tipologia)
				&& ! checkCoordinate() );
			
		checkCondition(!nessunoValorizzato, ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("PARAMETRO", "Impostare almeno un parametro").exception());
		
		ResponseService<List<ModelAmbulatorioLoccsi>> response  = loccsiService.getAmbulatori(nomeMedico, sesso,  tipologia, longitudine,  latitudine,
				distanza,  limit,  offset);
		List<ModelAmbulatorioLoccsi> listaAmbulatori = response.getBody();
		setHeadersResponse(response.getHeaders());
		
		List<ModelAmbulatorioLoccsiMedico> listaMedici = listaAmbulatori.stream().map(c -> c.getMedico()).collect(Collectors.toList());
		List<ModelAmbulatorioLoccsiMedico> listamediciDistinct = loccsiService.getMediciDistinctId(listaMedici);
		
		//da fare solo se disponibilita vale true
		if(disponibilita.booleanValue()) {
			try {
				List<ModelDisponibilita> listaDisponibilita = scerevService.postDisponibilita(new ModelAmbulatorioLoccsiMedicoModelAmbulatorioLoccsiMedicoMapper().toList(listamediciDistinct) , httpHeaders);
				//terzo inserisco le disponibilita sui model dei medici
				listaAmbulatori.stream().map(c -> c.getMedico()).forEach(d -> {

					listaDisponibilita.forEach( s -> {
						if(s.getMedicoId().equals(d.getId())) {
							d.setDisponibilita(new ModelDisponibilitaModelDisponibilitaMapper().from(s));
						}
					});
				}); 

			}catch(RESTException e) {
				log.error("execute", "Errore nella chiamata a disponibilita", e);
			}
			
		}
		
		//Response res = Response.ok().entity(listaAmbulatori).build();
		//res.getMetadata().add(arg0, arg1);
		
		return Response.ok().entity(listaAmbulatori).build();
	}
	
	
	private boolean checkCoordinate() {
		//se imposto una coordinata devo metterle tutte
		return (!StringUtils.isEmpty(longitudine) && ! StringUtils.isEmpty(latitudine) && distanza != null);
	}

}
