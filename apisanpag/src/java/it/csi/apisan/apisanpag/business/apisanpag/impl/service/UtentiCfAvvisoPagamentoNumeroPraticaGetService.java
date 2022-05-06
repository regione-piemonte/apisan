/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import java.util.Base64;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagRESTBaseService;
import it.csi.apisan.apisanpag.business.mapper.PagamentoSanitarioListItemMapper;
import it.csi.apisan.apisanpag.dto.apisanpag.Asr;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario;
import it.csi.apisan.apisanpag.exception.ErroreBuilder;
import it.csi.apisan.apisanpag.util.ApisanPagStatus;
import it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento.AvvisoPagamentoException_Exception;
import it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento.IPtwsrvServiceAvvisoPagamentoWS;
import it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento.ItemStampaAvvisoPagamento;
import it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento.OutputAvvisoPagamento;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UtentiCfAvvisoPagamentoNumeroPraticaGetService extends PagRESTBaseService {
	@Autowired
	IPtwsrvServiceAvvisoPagamentoWS iPtwsrvServiceAvvisoPagamentoWS;
	
	@Autowired
	private PtwServiceClient ptwServiceClient;
	
	String cf;
	String numeroPratica;
	
	
	public UtentiCfAvvisoPagamentoNumeroPraticaGetService(String cf, String numeroPratica, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.numeroPratica = numeroPratica;
	}


	
	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(cf);
		
		
		//Eseguo un controllo sul fatto che il numero pratica regionale abbia impostato un id_asr valido
		List<Asr> lista = ptwServiceClient.getAsr(xRequestID, xCodiceServizio);
		checkCondition(lista.stream().anyMatch(c -> c.getId().toString().equals(numeroPratica.substring(1, 4))), "Numero pratica non valido");
		
		//prima cosa richiama la getPagamentisanitari
		PagamentoSanitario ps = ptwServiceClient.getPagamentiSanitario(xRequestID, xCodiceServizio, cf, numeroPratica, numeroPratica.substring(1, 4));
		
		List<ItemStampaAvvisoPagamento> listaItemStampaAvviso = new PagamentoSanitarioListItemMapper().to(ps);
		
		OutputAvvisoPagamento output = null;
		//secondo passaggio richiamo avviso pagamento		
		try {
			output = iPtwsrvServiceAvvisoPagamentoWS.avvisoPagamento(listaItemStampaAvviso);
		}catch(AvvisoPagamentoException_Exception e) {
			throw ErroreBuilder.from(500, "Errore chiamata avviso pagamento").exception();
		}
		
		if(!output.getErrore().equalsIgnoreCase("000")) {
			throw ErroreBuilder.from(500, output.getErrore()).title(output.getOutputavviso()).dettaglio(output.getErrore(), output.getOutputavviso()).exception();
		}
		
		byte[] rit2 = output.getOutputavviso().getBytes();
		
		byte[] filePdfDecoder = Base64.getDecoder().decode(rit2);
		
		return Response.ok().entity(filePdfDecoder).type("application/pdf").build();
	
	}

}
