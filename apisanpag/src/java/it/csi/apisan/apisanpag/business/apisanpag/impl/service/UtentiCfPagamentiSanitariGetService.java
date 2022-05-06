/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.apisanpag.impl.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagDelegheRESTBaseService;
import it.csi.apisan.apisanpag.business.apisanpag.impl.base.PagNreRESTBaseService;
import it.csi.apisan.apisanpag.dto.apisanpag.Asr;
import it.csi.apisan.apisanpag.dto.apisanpag.Nre;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoFilter;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario;
import it.csi.apisan.apisanpag.util.filter.FilterUtil;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UtentiCfPagamentiSanitariGetService extends PagNreRESTBaseService {
	
	@Autowired
	private PtwServiceClient ptwServiceClient;
	
	private String cf;
	private String filter;
	
	public UtentiCfPagamentiSanitariGetService(String cf, String filter, SecurityContext securityContext, HttpHeaders httpHeaders) {
		super(securityContext, httpHeaders);
		this.cf = cf;
		this.filter = filter;
	}

	@Override
	protected Response execute() {
		checkNotBlank(xRequestID, "Request Id non valorizzato");
		checkNotBlank(xCodiceServizio, "Servizio non valorizzato");
		checkNotBlank(cf, "Codice fiscale non valorizzato");
		checkCodiceFiscaleValido(cf);
		
		
		PagamentoFilter filterPag = FilterUtil.init(PagamentoFilter.class, filter);
		checkPagamentoFilter(filterPag);
		
		List<PagamentoSanitario> pagamentiSantiari = ptwServiceClient.getPagamentiSanitari(xRequestID, xCodiceServizio, cf, 
				isIdAsrEqValorizzato(filterPag)?filterPag.getIdAsr().getEq()+"":null, 
				isNumeroPraticaAsrEqValorizzato(filterPag)?filterPag.getNumeroPraticaAsr().getEq():null,
				isNreEqValorizzato(filterPag)?filterPag.getNre().getEq():null
		); 
		
		List<PagamentoSanitario> result = filter(pagamentiSantiari, filterPag);
		
		
		result = result.stream()
			//elimino i PagamentoSanitario dalla lista con numerpratica_regionale non formattato correttamente (deve essere lungo 27 caratteri)
			.filter(ps ->  ps.getNumeroPraticaRegionale()!=null && ps.getNumeroPraticaRegionale().length()==27)
			
			//elimino i doppioni (sono doppioni quelli con numero_pratica_regionale uguale)
			.map(PagamenoSanitarioWrapper::new)
			.sorted()
			.distinct()
			.map(PagamenoSanitarioWrapper::unwrap)
			
			//Filtro i pagamenti sanitari per i soli pazienti con CF uguale a quello specificato nel PathParm 
			.filter(ps -> ps.getPaziente()!=null && cf.equals(ps.getPaziente().getCodiceFiscale()))
			
			.collect(Collectors.toList());
			
		getPagamentiConNre(result);
		
		return Response.ok(result).build();
	}
	

	/**
	 * Controllo correttezza formale e semantica dei filtri impostati in input.
	 * 
	 *		<ul>
	 *         <li>	id_asr: intero di 3 caratteri, [0..9], es. 301</li>
	 *		   <li>	nre: stringa di 15 caratteri, es. 010D14000000000, composto nel seguente modo:
	 *				-	i primi tre caratteri: [0..9], es. 010
	 *				-	una lettera [A..Z], es. D
	 *				-	11 caratteri: [0..9], es. 14000000000
	 *         </li>
	 *		   <li>numero_pratica_asr: stringa di lunghezza compresa tra 8 e 22 caratteri</li>
	 *      </ul>
     *
	 *
	 * @param pf
	 */
	private void checkPagamentoFilter(PagamentoFilter filterPag) {
		
		//Verificare obbligatorietà parametro shibboletCodiceFiscale solo se NON presenti i query param ( o se presente solo il query param IdAsr)
		if((!isNreEqValorizzato(filterPag))
				&& (!isNumeroPraticaAsrEqValorizzato(filterPag)) 
				) {
			checkNotBlank(shibIdentitaCodiceFiscale, "devi essere autenticato.");
			checkUtenteAutorizzatoOrDelegato(cf); //Verifica presenza della Delega in stato Valido se il CF del path param è diverso dal CF di Shibboleth
		}
		
		//Se pf.getNre è presente allora ignorare tutti gli altri filtri: id_asr, numero_pratica_asr ed numero pratica regionale
		if(isNreEqValorizzato(filterPag)) {
			if(isIdAsrEqValorizzato(filterPag)) {
				filterPag.getIdAsr().setEq(null);
			}
			if(isNumeroPraticaAsrEqValorizzato(filterPag)) {
				filterPag.getNumeroPraticaAsr().setEq(null);
			}
		}
		
		//pf.getNre se presente deve essere lungo 15 caratteri
		checkCondition(!isNreEqValorizzato(filterPag) 
				|| filterPag.getNre().getEq().matches("\\d{3}[A-Za-z]{1}\\d{11}"), 
				"nre non valido");
		
		//pf.getIdAsr se presente deve essere lungo 3 caratteri e deve essere prensente nella listaAsr [api /asr])
		checkCondition(!isIdAsrEqValorizzato(filterPag) 
				|| filterPag.getIdAsr().getEq().toString().matches("\\d{3}"), 
				"id_asr deve contenere 3 caratteri numerici");
		
		//Se presente pf.Numero_pratica_asr deve essere presente pf.id_asr
		checkCondition(filterPag.getNumeroPraticaAsr()==null || 
				(isNumeroPraticaAsrEqValorizzato(filterPag)
				&& isIdAsrEqValorizzato(filterPag)), 
				"se presente numero pratica asr deve essere valorizzato anche id asr");
		
		//verificare che sia presente l'asr sia un id_asr corretto
		if(isIdAsrEqValorizzato(filterPag)) {
			List<Asr> lista = ptwServiceClient.getAsr(xRequestID, xCodiceServizio);
			checkCondition(lista.stream().filter(c -> c.getId().equals(filterPag.getIdAsr().getEq())).findFirst().isPresent(), "id_asr non valido");
		}
	}
	

	/**
	 * Filtro i pagamenti sanitari in input
	 * 
	 * @param pagamentiSantiari
	 * @param pf 
	 * @return
	 */
	private List<PagamentoSanitario> filter(List<PagamentoSanitario> pagamentiSantiari, PagamentoFilter filterPag) {
		if(StringUtils.isBlank(filter)) {
			return pagamentiSantiari;
		}
		
		Stream<PagamentoSanitario> stream = pagamentiSantiari.stream();
		//Numero pratica Asr togliere il controllo dopo telefonata e mail di Michele del 06/06
	/*	if(isNumeroPraticaAsrEqValorizzato(filterPag)){
			stream = stream.filter(c -> c.getNumeroPraticaAsr().equalsIgnoreCase(filterPag.getNumeroPraticaAsr().getEq()));
		} */
		
		//Nre
		if(isNreEqValorizzato(filterPag)){
			stream = stream.filter(c -> c.getNre().stream().allMatch(f -> f.getId().equals(filterPag.getNre().getEq()) ) );
		}
		
		//Stato
		if(filterPag.getStato()!=null && filterPag.getStato().getEq()!=null) {
			stream = stream.filter(c -> c.getStato() != null && c.getStato().equals(filterPag.getStato().getEq()));
		}
		if(filterPag.getStato()!=null && filterPag.getStato().getC()!=null) {
			stream = stream.filter(c -> c.getStato() != null && c.getStato().contains(filterPag.getStato().getC()));
		}
		if(filterPag.getStato()!=null && filterPag.getStato().getCi()!=null) {
			stream = stream.filter(c -> c.getStato() != null && StringUtils.containsIgnoreCase(c.getStato(),filterPag.getStato().getCi()));
		}
		
		//Pagato
		if(filterPag.getPagato()!=null && filterPag.getPagato().getEq()!=null) {
			stream = stream.filter(c -> c.getPagato() != null && c.getPagato().getValore()!=null && c.getPagato().getValore().compareTo(filterPag.getPagato().getEq()) == 0);
		}
		if(filterPag.getPagato()!=null && filterPag.getPagato().getGt()!=null) {
			stream = stream.filter(c -> c.getPagato() != null && c.getPagato().getValore()!=null && c.getPagato().getValore().compareTo(filterPag.getPagato().getGt()) > 0);
		}
		if(filterPag.getPagato()!=null && filterPag.getPagato().getGte()!=null) {
			stream = stream.filter(c -> c.getPagato() != null && c.getPagato().getValore()!=null && c.getPagato().getValore().compareTo(filterPag.getPagato().getGte()) >= 0);
		}
		if(filterPag.getPagato()!=null && filterPag.getPagato().getLt()!=null) {
			stream = stream.filter(c -> c.getPagato() != null && c.getPagato().getValore()!=null && c.getPagato().getValore().compareTo(filterPag.getPagato().getLt()) < 0);
		}
		if(filterPag.getPagato()!=null && filterPag.getPagato().getLte()!=null) {
			stream = stream.filter(c -> c.getPagato() != null && c.getPagato().getValore()!=null && c.getPagato().getValore().compareTo(filterPag.getPagato().getLte()) <= 0);
		}
		
		//Da pagare
		if(filterPag.getDaPagare()!=null && filterPag.getDaPagare().getEq()!=null) {
			stream = stream.filter(c -> c.getDaPagare() != null && c.getDaPagare().getValore()!=null && c.getDaPagare().getValore().compareTo(filterPag.getDaPagare().getEq()) == 0);
		}
		if(filterPag.getDaPagare()!=null && filterPag.getDaPagare().getGt()!=null) {
			stream = stream.filter(c -> c.getDaPagare() != null && c.getDaPagare().getValore()!=null && c.getDaPagare().getValore().compareTo(filterPag.getDaPagare().getGt()) > 0);
		}
		if(filterPag.getDaPagare()!=null && filterPag.getDaPagare().getGte()!=null) {
			stream = stream.filter(c -> c.getDaPagare() != null && c.getDaPagare().getValore()!=null && c.getDaPagare().getValore().compareTo(filterPag.getDaPagare().getGte()) >= 0);
		}
		if(filterPag.getDaPagare()!=null && filterPag.getDaPagare().getLt()!=null) {
			stream = stream.filter(c -> c.getDaPagare() != null && c.getDaPagare().getValore()!=null && c.getDaPagare().getValore().compareTo(filterPag.getDaPagare().getLt()) < 0);
		}
		if(filterPag.getDaPagare()!=null && filterPag.getDaPagare().getLte()!=null) {
			stream = stream.filter(c -> c.getDaPagare() != null && c.getDaPagare().getValore()!=null && c.getDaPagare().getValore().compareTo(filterPag.getDaPagare().getLte()) <= 0);
		}
		
		return stream.collect(Collectors.toList());
		
	}
	
	
	public boolean isNreEqValorizzato(PagamentoFilter pf){
		return pf.getNre()!=null && StringUtils.isNotBlank(pf.getNre().getEq());
	}
	
	public boolean isIdAsrEqValorizzato(PagamentoFilter pf){
		return pf.getIdAsr()!=null && pf.getIdAsr().getEq()!=null;
	}
	
	public boolean isNumeroPraticaAsrEqValorizzato(PagamentoFilter pf) {
		return pf.getNumeroPraticaAsr()!=null && StringUtils.isNotBlank(pf.getNumeroPraticaAsr().getEq());
	}
	
	
	class PagamenoSanitarioWrapper implements Comparable<PagamenoSanitarioWrapper> {
		private final PagamentoSanitario pagamentoSanitario;

		public PagamenoSanitarioWrapper(PagamentoSanitario ps) {
			this.pagamentoSanitario = ps;
		}

		public PagamentoSanitario unwrap() {
			return pagamentoSanitario;
		}

		public boolean equals(Object other) {
			if (other instanceof PagamenoSanitarioWrapper) {
				return ((PagamenoSanitarioWrapper) other).pagamentoSanitario.getNumeroPraticaRegionale()
						.equals(this.pagamentoSanitario.getNumeroPraticaRegionale());
			}
			
			return false;
			
		}

		public int hashCode() {
			return pagamentoSanitario.getNumeroPraticaRegionale().hashCode();
		}

		@Override
		public int compareTo(PagamenoSanitarioWrapper other) {
			
			return other.pagamentoSanitario.getNumeroPraticaRegionale()
						.compareTo(this.pagamentoSanitario.getNumeroPraticaRegionale());
			
		}
		
		
	}
	

}
