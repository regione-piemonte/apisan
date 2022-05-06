/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.apisanaut.impl.base.service;

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
import it.csi.apisan.apisanaut.dto.apisanaut.DelegaFilter;
import it.csi.apisan.apisanaut.util.filter.FilterUtil;
import it.csi.deleghe.deleghebe.ws.DelegheCittadiniService;
import it.csi.deleghe.deleghebe.ws.model.Cittadino;
import it.csi.deleghe.deleghebe.ws.msg.GetDeleganti;
import it.csi.deleghe.deleghebe.ws.msg.GetDelegantiResponse;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CittadiniCfDelegantiGetService extends AutRESTBaseService {
	
	@Autowired
	private DelegheCittadiniService delegheCittadiniService;
	
	private String cf;
	private String filter;
	
	
	public CittadiniCfDelegantiGetService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio,
			String cf, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(shibIdentitaCodiceFiscale,xRequestID, xCodiceServizio, securityContext, httpHeaders);
		this.cf = cf;
		this.filter = filter;
	}


	@Override
	protected Response execute() {
		final String METHOD_NAME = "execute";
		checkUtenteAutorizzato(cf);
		checkCodiceFiscaleValido(cf);
		
		GetDeleganti req = new GetDeleganti();
		req.setRichiedente(newRichiedente());

		Cittadino cittadinoDelegato = new Cittadino();
		cittadinoDelegato.setCodiceFiscale(cf);
		req.setCittadinoDelegato(cittadinoDelegato);

		DelegaFilter f;
		try {
			//f = new Filter(filter);
			f = FilterUtil.init(DelegaFilter.class, filter);
		} catch (IllegalArgumentException iae) {
			log.error(METHOD_NAME, iae.getMessage(), iae);
			return Response.status(Status.BAD_REQUEST).build();
		}

		populateFilters(req, f);

		GetDelegantiResponse gdRes = delegheCittadiniService.getDelegantiService(req);
		checkSuccesso(gdRes);

		List<DelegaCittadino> result = new DelegaCittadinoMapper().fromList(gdRes.getDeleganti());

		return Response.ok(result).build();
	}
	
	
	private void populateFilters(GetDeleganti req, DelegaFilter f) {
		
		req.setStatiDelega(FilterUtil.in(f.getStatoDelega()));
		req.setCodiciServizio(FilterUtil.in(f.getCodiceServizio()));
		
		if(f.getCodiceFiscale() != null && StringUtils.isNotBlank(f.getCodiceFiscale().getEq())){
			Cittadino cittadinoDelegante = new Cittadino();
			cittadinoDelegante.setCodiceFiscale(f.getCodiceFiscale().getEq());
			req.setCittadinoDelegante(cittadinoDelegante);
		}
	}
	
	/*
	private void populateFilters(GetDeleganti req, Filter f) {

		f.getString("statoDelega", Operator.EQ).ifPresent(sd -> req.setStatiDelega(Arrays.asList(sd)));
		f.getString("statoDelega", Operator.IN).ifPresent(sd -> req.setStatiDelega(Arrays.asList(sd.split(","))));

		f.getString("codiceServizio", Operator.EQ).ifPresent(cs -> req.setCodiciServizio(Arrays.asList(cs)));
		f.getString("codiceServizio", Operator.IN).ifPresent(cs -> req.setCodiciServizio(Arrays.asList(cs.split(","))));

		f.getString("cfDelegante", Operator.EQ).ifPresent(cfdelegato -> {
			Cittadino cittadinoDelegante = new Cittadino();
			cittadinoDelegante.setCodiceFiscale(cfdelegato);
			req.setCittadinoDelegante(cittadinoDelegante);
		});
	}*/

}
