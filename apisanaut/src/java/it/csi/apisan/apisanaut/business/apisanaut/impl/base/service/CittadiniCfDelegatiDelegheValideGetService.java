/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanaut.business.apisanaut.impl.base.AutRESTBaseService;
import it.csi.apisan.apisanaut.business.mapper.DelegaCittadinoMapper;
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaCittadino;
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaValidaFilter;
import it.csi.apisan.apisanaut.util.StatoDelega;
import it.csi.apisan.apisanaut.util.filter.FilterUtil;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.msg.GetDelegati;
import it.csi.deleghe.deleghebe.ws.msg.GetDelegatiResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfDelegatiDelegheValideGetService extends AutRESTBaseService {
	
	@Autowired
	private DelegheCittadiniService delegheCittadiniService;
	
	private String cf;
	private String filter;
	
	
	public CittadiniCfDelegatiDelegheValideGetService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String cf, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale,xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.cf = cf;
		this.filter = filter;
	}
	
	@Override
	protected Response execute() {
		String METHOD_NAME = "execute";
		
		checkUtenteAutorizzato(cf);
		checkCodiceFiscaleValido(cf);
		
		GetDelegati req = new GetDelegati();
		req.setRichiedente(newRichiedente());

		Cittadino cittadinoDelegante = new Cittadino();
		cittadinoDelegante.setCodiceFiscale(cf);
		req.setCittadinoDelegante(cittadinoDelegante);

		DelegaValidaFilter f;
		try {
			//f = new Filter(filter);
			f = FilterUtil.init(DelegaValidaFilter.class, filter);
		} catch (IllegalArgumentException iae) {
			log.error(METHOD_NAME, iae.getMessage(), iae);
			return Response.status(Status.BAD_REQUEST).build();
		}

		populateFilters(req, f);

		GetDelegatiResponse gdRes = delegheCittadiniService.getDelegatiService(req);
		checkSuccesso(gdRes);

		List<DelegaCittadino> result = new DelegaCittadinoMapper().fromList(gdRes.getDelegati());

		return Response.ok(result).build();
	}
	
	private void populateFilters(GetDelegati req, DelegaValidaFilter f) {
		//in questo caso devo aggiungere le deleghe valide quindi codici Attiva e in scadenza
		List<String> statiDelegaValidi = Arrays.asList(StatoDelega.ATTIVA.toString(), StatoDelega.INSCADENZA.toString());
		
		req.setCodiciServizio(FilterUtil.in(f.getCodiceServizio()));
		req.setStatiDelega(statiDelegaValidi);
	
		if(f.getCodiceFiscale() != null && StringUtils.isNotBlank(f.getCodiceFiscale().getEq())){
			Cittadino cittadinoDelegante = new Cittadino();
			cittadinoDelegante.setCodiceFiscale(f.getCodiceFiscale().getEq());
			req.setCittadinoDelegante(cittadinoDelegante);
		}
	}	

}
