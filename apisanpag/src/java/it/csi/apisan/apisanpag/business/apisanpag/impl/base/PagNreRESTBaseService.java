/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.base;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.wso2.ws.dataservice.DataServiceFault;
import org.wso2.ws.dataservice.GPRDATASERVICEPortType;
import org.wso2.ws.dataservice.NREDESCRIZIONE;

import it.csi.apisan.apisanpag.dto.apisanpag.Nre;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario;

public abstract class PagNreRESTBaseService extends PagDelegheRESTBaseService {
	@Autowired
	GPRDATASERVICEPortType gprdataServicePortType;
	
	
	public PagNreRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
	}
	
	public PagNreRESTBaseService(String shibIdentitaCodiceFiscale, String xRequestID, String xCodiceServizio, String xForwardedFor,
	SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext,  httpHeaders);
	}
	
	
	public List<PagamentoSanitario> getPagamentiConNre(List<PagamentoSanitario> listaPagamenti){
		if(listaPagamenti != null && listaPagamenti.size() >0 ) {
			List<String> listaTuttiNre = new ArrayList<String>(); 
			listaPagamenti.stream().forEach(c -> {
				c.getNre().stream().forEach(d -> {
					listaTuttiNre.add(d.getId());
				});
			});


			List<String> listaNre = listaTuttiNre.stream().distinct().collect(Collectors.toList());
			List<NREDESCRIZIONE> listaNreDescr = null;
			try {
				listaNreDescr = gprdataServicePortType.gprListaDescrizioneStrutturaByNRE(listaNre);
				if(listaNreDescr != null && listaNreDescr.size() > 0 ) {
					listaNreDescr.stream().forEach(  c-> System.out.println("holder: " +c.getDESCRIZIONESTRUTTURA() ));
				}

			} catch (DataServiceFault e) {
				log.error("getPagamentiConNre", "Errore nel richiamo del servizio gprListaDescrizioneStrutturaByNRE", e);
			}
			for(PagamentoSanitario pagTmp :  listaPagamenti) {

				if(pagTmp.getNre() != null && pagTmp.getNre().size() > 0) {
					for(Nre nreTmp : pagTmp.getNre()) {
						for(NREDESCRIZIONE nreDescr :  listaNreDescr) {				   

							if(nreDescr.getNRE().equalsIgnoreCase(nreTmp.getId())) {
								StringTokenizer split = new StringTokenizer(nreDescr.getDESCRIZIONESTRUTTURA(), "|");
								if(split != null && split.countTokens() == 2) {
									nreTmp.setDescStruttura(split.nextToken());
									nreTmp.setIndirizzo(split.nextToken());
								}

							}
						}

					}


				}
			}
		}

		return listaPagamenti;
	}
}
