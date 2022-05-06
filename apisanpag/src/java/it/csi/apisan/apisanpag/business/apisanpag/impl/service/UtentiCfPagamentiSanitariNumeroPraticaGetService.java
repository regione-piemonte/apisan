/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagNreRESTBaseService;
import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagRESTBaseService;
import it.csi.apisan.apisanpag.dto.apisanpag.Asr;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario;
import it.csi.apisan.apisanpag.exception.ErroreBuilder;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UtentiCfPagamentiSanitariNumeroPraticaGetService extends PagNreRESTBaseService {
	//@Autowired
	//UtentiMock utenti;
	
	@Autowired
	private PtwServiceClient ptwServiceClient;
	
	String cf;
	String numeroPratica;
	
	public UtentiCfPagamentiSanitariNumeroPraticaGetService(String cf,
			String numeroPratica,SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.numeroPratica = numeroPratica;
	}

	@Override
	protected Response execute() {
		log.debug("execute", "numero pratica: " + numeroPratica);
		checkNotBlank(xRequestID, "Request non valorizzata");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(numeroPratica, "Numero pratica non valorizzato");
		checkCondition(numeroPratica.matches("\\w{27}"),"numero pratica regionale non valido");
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		
		//Eseguo un controllo sul fatto che il numero pratica regionale abbia impostato un id_asr valido
		List<Asr> lista = ptwServiceClient.getAsr(xRequestID, xCodiceServizio);
		checkCondition(lista.stream().anyMatch(c -> c.getId().toString().equals(numeroPratica.substring(1, 4))), "Numero pratica non valido");
		
		/* TODO Modificare come segue:
		  /utenti/{cf}/pagamenti-sanitari/{numero_pratica_regionale} -> numero_pratica_regionale lungo 27 richiamo il servizio del back end 
		  /utenti/{cf}/pagamenti-sanitari, passando come filter param il primo il numero_pratica_regionale e il secondo una substring del secondo, terzo e quarto di numero_pratica_regionale
		*/
		
		
		PagamentoSanitario ps = ptwServiceClient.getPagamentiSanitario(xRequestID, xCodiceServizio, cf, numeroPratica, numeroPratica.substring(1, 4));
		
		
		if(ps ==null || ps.getPaziente()==null || !cf.equals(ps.getPaziente().getCodiceFiscale())){
			//Il codice fiscale del path param non corrisponde al codice fiscale del paziente. Non lo restituisco.
			throw ErroreBuilder.from(404, "Non trovato").exception();
			//return Response.status(Status.NO_CONTENT).build();
		}
		
		List<PagamentoSanitario> listaPagamento = new ArrayList<PagamentoSanitario>();
		listaPagamento.add(ps);
		
		listaPagamento = getPagamentiConNre(listaPagamento);
		return Response.ok(listaPagamento.get(0)).build();
		
	}

}
