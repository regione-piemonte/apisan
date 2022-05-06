/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagRESTBaseService;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitarioBody;
import it.csi.apisan.apisanpag.dto.apisanpag.PraticaInCarrello;
import it.csi.apisan.apisanpag.dto.ptw.ResponsePost;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class PagamentoPostService extends PagRESTBaseService {
	
	@Autowired
	private PtwServiceClient ptwServiceClient;

	private PagamentoSanitarioBody elencoPraticheEVersante;
	
	
	public PagamentoPostService(String xRequestID, String xCodiceServizio, String xForwardedFor,
			PagamentoSanitarioBody elencoPraticheEVersante, SecurityContext securityContext,  HttpHeaders httpHeaders) {
		super(null, xRequestID, xCodiceServizio, xForwardedFor,securityContext, httpHeaders);
		
		this.elencoPraticheEVersante = elencoPraticheEVersante;
	}

	@Override
	protected Response execute() {
		checkNotNull(elencoPraticheEVersante, "Pratiche ");
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkPagamentoSanitarioBody(elencoPraticheEVersante);
		
		ResponsePost res = ptwServiceClient.inserisciPagamento(xRequestID, xCodiceServizio, elencoPraticheEVersante);
		System.out.println("Risposta code: " + res.getCode() + " description: " + res.getDescription());
		// Response.status(this.getStatus()).type(this.getMediaType()).entity(this.getEntity())
		return Response.status(res.getCode()).type(MediaType.APPLICATION_JSON).entity(res.getDescription()).build();
	}
	
	
	private void checkPagamentoSanitarioBody(PagamentoSanitarioBody body) {
		checkCondition(body.getPraticheDaPagare() != null, "Inserire la pratica da pagare");
		checkCondition(!(!body.isPsp() && body.getPraticheDaPagare().size() > 1), "Inserire al massimo una pratica");
		//Verificare la condizione che ci sia o psp o pos
		checkCondition(!( body.getPos() != null && body.isPsp()), "Scegliere un solo metodo di pagamento");
		checkPratica(body.getPraticheDaPagare());
		
	}
	
	private void checkPratica(List<PraticaInCarrello> pratiche) {
		
		pratiche.stream().forEach(c -> {
			checkCodiceFiscaleValido(c.getCodiceFiscale()  );
			checkCondition(c.getNumeroPraticaRegionale().length() == 27, "Numero pratica regionale non valido");
			checkCondition((c.getOpposizione730() == 0 || c.getOpposizione730() == 1), "Opposizione730 non corretto");
		});
		
		//pratiche.stream().forEach(c -> checkCodiceFiscaleValido(c.getCodiceFiscale()  ); 
		//checkCodiceFiscaleValido(pratica.getCodiceFiscale());
		//checkCondition(pratica.getNumeroPraticaRegionale().length() == 27, "Numero pratica regionale non valido");
	}

}
