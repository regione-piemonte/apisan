/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AutRESTBaseService;
import it.csi.apisan.apisanaut.business.mapper.DichiarazioneMapper;
import it.csi.apisan.apisanaut.dto.apisanaut.DichiarazioneFilter;
import it.csi.apisan.apisanaut.util.filter.FilterUtil;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.model.Dichiarazione;
import it.csi.deleghe.deleghebe.ws.model.DichiarazioneDettaglio;
import it.csi.deleghe.deleghebe.ws.msg.RicercaDichiarazioni;
import it.csi.deleghe.deleghebe.ws.msg.RicercaDichiarazioniResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfDichiarazioniGetService extends AutRESTBaseService {

	@Autowired
	private DelegheCittadiniService delegheCittadiniService;
	
	private String cf;
	private String filter;
	
	public CittadiniCfDichiarazioniGetService(String shibIdentitaCodiceFiscale, String xRequestID,
			String xCodiceServizio, String cf, String filter, SecurityContext securityContext,
			HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale, xRequestID, xCodiceServizio, securityContext, httpHeaders);
		
		this.cf = cf;
		this.filter = filter;
	}

	@Override
	protected Response execute() {
		String METHOD_NAME = "execute";
		checkUtenteAutorizzato(cf);
		checkCodiceFiscaleValido(cf);
		
		RicercaDichiarazioni req = new RicercaDichiarazioni();
		req.setRichiedente(newRichiedente());
		
		Dichiarazione dichiarazione = new Dichiarazione();
		List<DichiarazioneDettaglio> dettagli = new ArrayList<>();
		DichiarazioneDettaglio dd = new DichiarazioneDettaglio();
		Cittadino cittadino1 = new Cittadino();
		cittadino1.setCodiceFiscale(cf);
		dd.setCittadino1(cittadino1);
		dettagli.add(dd);
		dichiarazione.setDettagli(dettagli);
		req.setDichiarazione(dichiarazione);
		
		DichiarazioneFilter f;
		try {
			//f = new Filter(filter);
			f = FilterUtil.init(DichiarazioneFilter.class, filter);
		} catch (IllegalArgumentException iae) {
			log.error(METHOD_NAME, iae.getMessage(), iae);
			return Response.status(Status.BAD_REQUEST).build();
		}

		populateFilters(req, f);
		
		RicercaDichiarazioniResponse res = delegheCittadiniService.ricercaDichiarazioniService(req);
		checkSuccesso(res);
		
		List<Dichiarazione> dichiarazioni = res.getDichiarazioni();
		
		List<it.csi.apisan.apisanaut.dto.apisanaut.Dichiarazione> result = new DichiarazioneMapper().fromList(dichiarazioni);
		if(result == null) {
			result = new ArrayList<it.csi.apisan.apisanaut.dto.apisanaut.Dichiarazione>();
		}
		
		return Response.ok(result).build();
	}

	private void populateFilters(RicercaDichiarazioni req, DichiarazioneFilter f) {
		if(req.getDichiarazione()==null) {
			req.setDichiarazione(new Dichiarazione());
		}
		Dichiarazione dichiarazione = req.getDichiarazione();
		
		if(dichiarazione.getCittadino()==null) {
			dichiarazione.setCittadino(new Cittadino());
		}
		Cittadino cittadino = dichiarazione.getCittadino();
		
		if(f.getCodiceFiscale() != null && StringUtils.isNotBlank(f.getCodiceFiscale().getEq())){
			cittadino.setCodiceFiscale(f.getCodiceFiscale().getEq());
		}
		
	}

}
