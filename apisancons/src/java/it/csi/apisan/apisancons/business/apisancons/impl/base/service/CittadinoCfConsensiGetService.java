/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisancons.business.apisancons.impl.base.ConsAuraRESTBaseService;
import it.csi.apisan.apisancons.business.apisancons.mapper.ConsensoConsensoMapper;
import it.csi.apisan.apisancons.business.apisancons.mapper.TipoAsrTipoAsrMapper;
import it.csi.apisan.apisancons.dto.apisancons.Consenso;
import it.csi.apisan.apisancons.dto.apisancons.IdInformativaFilter;
import it.csi.apisan.apisancons.dto.apisancons.TipoAsr;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsensoBeService;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaAsrBeResponse;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaConsensoBe;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaConsensoBeResponse;
import it.csi.apisan.apisancons.util.filter.FilterUtil;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadinoCfConsensiGetService extends ConsAuraRESTBaseService {
	private String cf;
	@Autowired
	ConsensoBeService service;
	private String filter;
	//SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	
	
	
	public CittadinoCfConsensiGetService(String cf, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.filter = filter;
	}

	
	
	@Override
	protected Response execute() {		
		//richiamo a consultainformativa
		checkNotBlank(xRequestID, "Requestid non valorizzato");
		checkNotBlank(xCodiceServizio, "Codice Servizio non valorizzato");
		checkNotBlank(shibIdentitaCodiceFiscale, "Utente non autorizzato");
		checkNotBlank(filter, "Parametro filter obbligatorio");
		checkUtenteAutorizzatoOrDelegato(cf);
		
		IdInformativaFilter filterInf = null;
		try {
			 filterInf = FilterUtil.init(IdInformativaFilter.class, filter);
			
		}catch(IllegalStateException e) {
			log.error("CittadinoCfConsensiGetService", e.getMessage(), e);
			return Response.status(Status.BAD_REQUEST).build();
		}
		//
		ConsultaConsensoBe request = new ConsultaConsensoBe();
		
		request.setFonte(newFonteCittadinoRequest());
		request.setCfCittadino(cf);
		request.setRichiedente(newRichiedente());
		request.setIdInformativa(filterInf.getIdInformativa().getEq().toString());
		request.setVerificaAura(true);
		ConsultaConsensoBeResponse response =  service.consultaConsensoBeService(request);
		
		checkSuccesso(response, "CittadinoCfConsensiGetService");
		
		List<Consenso> listaConsensi = new ArrayList<Consenso>();
		
		if(!erroreNonTrovateOccorrenze(response)) {
			listaConsensi =		new ConsensoConsensoMapper().fromList(response.getConsensi().getConsenso());
			
		}
		
		//richiamo il servizio delle asr il tutto se listaConsensi maggiore di 0
		if(listaConsensi.size() > 0) {
			if(isConsensoAziendale(response)) {
				ConsultaAsrBeResponse responseAsr = service.consultaAsrBeService(newRequestConsultaCodifiche());
				checkSuccesso(responseAsr, "ConsultaAsr");

				List<TipoAsr> listaAsr = new TipoAsrTipoAsrMapper().fromList(responseAsr.getAsr().getAsr());

				List<TipoAsr> asrNonContenute = listaAsrNonContenute(listaAsr, listaConsensi);

				for(TipoAsr asrTmp : asrNonContenute) {
					listaConsensi.add(newConsensoNonEspresso(asrTmp, listaConsensi.get(0).getCfCittadino(), listaConsensi.get(0).getIdInformativa()));
				}				

			}
			
		}
		listaConsensi.forEach(c -> arricchisciCittadinoEDelegato(c));
		//consprefService.consultaInformativaService(consultaInformativa)
		return Response.ok(listaConsensi).build();
	}
	
	

	
	public static class TipoAsrWrapper implements Comparable<TipoAsrWrapper>{
		private final TipoAsr asr;

		public TipoAsrWrapper(TipoAsr asr) {
			this.asr = asr;
		}

		public TipoAsr unwrap() {
			return asr;
		}

		public boolean equals(Object other) {
			if (other instanceof TipoAsrWrapper) {
				return ((TipoAsrWrapper) other).asr.getCodice()
						.equals(this.asr.getCodice());
			}

			return false;

		}

		public int hashCode() {
			return asr.getCodice().hashCode();
		}

		@Override
		public int compareTo(TipoAsrWrapper other) {
			/*
			 * return other.pagamentoSanitario.getNumeroPraticaRegionale()
						.compareTo(this.pagamentoSanitario.getNumeroPraticaRegionale());
			 * */
			return other.asr.getCodice().compareTo(this.asr.getCodice());

		}
		
		public boolean different(TipoAsrWrapper other) {
			return !other.asr.getCodice().equals(this.asr.getCodice());
		}

	}
	

	

}
