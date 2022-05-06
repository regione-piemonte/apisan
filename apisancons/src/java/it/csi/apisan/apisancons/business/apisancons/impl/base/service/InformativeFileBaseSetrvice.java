/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.impl.base.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;

import it.csi.apisan.apisancons.business.apisancons.impl.base.ConsRESTBaseService;

import it.csi.apisan.apisancons.dto.apisancons.InformativaFilter;
import it.csi.apisan.apisancons.exception.ErroreBuilder;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsensoBeService;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaInformativa;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.ConsultaInformativaResponse;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.Informativa;
import it.csi.apisan.apisancons.integration.conspref.consprefbe.Richiedente;
import it.csi.apisan.apisancons.util.filter.FilterUtil;

public abstract class InformativeFileBaseSetrvice extends ConsRESTBaseService {
	protected String filter;
	@Autowired
	ConsensoBeService service;	
	
	public InformativeFileBaseSetrvice( String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.filter = filter;
	}

	
	protected byte[] getByte(boolean isPdf) {
		String METHOD_NAME = "getByte";
		checkNotNull(filter,"Campo Filter obbligatorio");
		//recupero la lista delle informative
		Richiedente richiedenteRequest = newRichiedente();
		List<Informativa> listaRet = recuperaInformative(richiedenteRequest);
		InformativaFilter filterInf ;
		try {
		 filterInf = FilterUtil.init(InformativaFilter.class, filter);
		} catch (IllegalArgumentException iae) {
			log.error(METHOD_NAME, iae.getMessage(), iae);
			//return Response.status(Status.BAD_REQUEST).build();
			 throw ErroreBuilder.from(Status.BAD_REQUEST).dettaglio("FILTER", filter).exception();
		}

		Optional<Informativa> info = listaRet.stream().filter(c -> c.getTipoConsenso().getCodice().equals(filterInf.getCodiceTipoConsenso().getEq())  
				&& c.getSottoTipoConsenso().getCodice().equals(filterInf.getCodiceSottoTipoConsenso().getEq())).findFirst();
		
		if(!info.isPresent()) {
			 throw ErroreBuilder.from(Status.NOT_FOUND).dettaglio("FILTER non TROVATO", filter).exception();
		}
		byte[] informativaPdf = null;
		try {
			if(isPdf) {
				informativaPdf = IOUtils.toByteArray(new URI(info.get().getPdfInformativa()));
			}else {
				informativaPdf = IOUtils.toByteArray(new URI(info.get().getHtmlInformativa()));
			}
			
		} catch (IOException e) {
			
			throw ErroreBuilder.from(Status.NOT_FOUND).dettaglio("", "NON TROVATO").exception();
		} catch (URISyntaxException e) {
			
			throw ErroreBuilder.from(Status.NOT_FOUND).dettaglio("", "NON TROVATO").exception();
		}
		
		return informativaPdf;
	}
	
	private List<Informativa> recuperaInformative(Richiedente richiedenteRequest){
		ConsultaInformativa request = new ConsultaInformativa();
		request.setRichiedente(richiedenteRequest);
		ConsultaInformativaResponse response = service.consultaInformativaBeService(request);
		checkSuccesso(response, "Ricerca informative");
		//return new InformativaInformativaMapper().fromList(response.getInformative().getInformativa());
		return response.getInformative().getInformativa();
	}	

}
