/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.integration.mock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanpag.dto.apisanpag.Asr;
import it.csi.apisan.apisanpag.dto.apisanpag.CanalePagamento;
import it.csi.apisan.apisanpag.dto.apisanpag.CartaCommissione;
import it.csi.apisan.apisanpag.dto.apisanpag.CausalePagamento;
import it.csi.apisan.apisanpag.dto.apisanpag.PresidioSanitario;
import it.csi.apisan.apisanpag.dto.apisanpag.Tesoriere;


@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class PresidiAsrMock {
	
	private List<Asr> listaAsr = new ArrayList<Asr>();
	private List<PresidioSanitario> listaPresidi1 = new ArrayList<PresidioSanitario>();
	private List<PresidioSanitario> listaPresidi2 = new ArrayList<PresidioSanitario>();
	private List<CausalePagamento> listaCausaliAsr1 = new ArrayList<CausalePagamento>() ;
	private List<CausalePagamento> listaCausaliAsr2 = new ArrayList<CausalePagamento>() ;
	private List<CanalePagamento> listaCanaliAsr1 = new ArrayList<CanalePagamento>();
	private List<CanalePagamento> listaCanaliAsr2 = new ArrayList<CanalePagamento>();
	CanalePagamento canale;
	CanalePagamento canaleAsr3;
	private Asr asr1;
	private Asr asr2;
	private Asr asr3;
	
	
	@PostConstruct
	public void costruisciListe() {
		//Asr1
		listaPresidi1.add(newPresidioSanitario(301001, "OSPEDALE MARTINI"));
		listaPresidi1.add(newPresidioSanitario(301002, "OSPEDALE OFTALMICO"));
		
		listaPresidi2.add(newPresidioSanitario(301001, "OSPEDALE SANT'ANNA"));
		listaPresidi2.add(newPresidioSanitario(301002, "OSPEDALE MOLINETTE"));
		
		List<CartaCommissione> carteCommissioni = new ArrayList<>();
		carteCommissioni.add(newCartaCommissione(1, "VISA COMMISSIONE 1%", "http://www.sistemapiemonte.it/ris/css/pagamentoTicket/im/visa.jpg"));
		carteCommissioni.add(newCartaCommissione(2, "MASTERCARD COMMISSIONE 0.80%", "http://www.sistemapiemonte.it/ris/css/pagamentoTicket/im/mastercard.jpg"));
		
		List<CartaCommissione> carteCommissioniAsr3 = new ArrayList<>();
		carteCommissioniAsr3.add(newCartaCommissione(1, "VISA E MASTERCARD NON SONO PREVISTE COMMISSIONI", "http://www.sistemapiemonte.it/ris/css/pagamentoTicket/im/visa-mastercard.jpg"));
		
		canale = newCanalePagamento(1, "PAGAMENTO CON CARTA DI CREDITO PREDISPOSTO DAL TESORIERE DELL'AZIENDA SANITARIA", 
				newTesoriere(null, "UniCredit S.p.A.", "http://www.sistemapiemonte.it/ris/css/pagamentoTicket/im/unicreditgroup.jpg"), 
				"POS", carteCommissioni);
		
		canaleAsr3 = newCanalePagamento(1, "PAGAMENTO CON CARTA DI CREDITO PREDISPOSTO DAL TESORIERE DELL'AZIENDA SANITARIA", 
				newTesoriere(null, "UniCredit S.p.A.", "http://www.sistemapiemonte.it/ris/css/pagamentoTicket/im/unicreditgroup.jpg"), 
				"POS", carteCommissioniAsr3);
		
		//causale pagamento1
		CausalePagamento causale1 = new CausalePagamento();
		causale1.setCodiceVersamento("0110");
		causale1.setDescrizione("DIRITTI DI SEGRETERIA");
		//causale pagamento 2
		CausalePagamento causale2 = new CausalePagamento();
		causale2.setCodiceVersamento("1010");
		causale2.setDescrizione("SERVIZIO ASSISTENZA SPECIALIZZATA");
		//causale pagamento 3
		CausalePagamento causale3 = new CausalePagamento();
		causale3.setCodiceVersamento("0011");
		causale3.setDescrizione("PREPARAZIONE UNIVERSITARIA");	
	
		//aggiungo tutte e tre le causali pagamento alla lista della asr1
		listaCausaliAsr1.add(causale1);
		listaCausaliAsr1.add(causale2);
		listaCausaliAsr1.add(causale3);
		
		//aggiungo due causali alla lista associata alla asr2
		listaCausaliAsr2.add(causale1);
		listaCausaliAsr2.add(causale2);
		
		//canale Pagamento1
		CanalePagamento canalePag1 = new CanalePagamento();
		canalePag1.setId(1);
		//canalePag1.setApplicationId("PTW_301");
		canalePag1.setDescrizione("PAGOPA - ELENCO PRESTATORI SERVIZIO DI PAGAMENTO FORNITO DA AGID (AGENZIA PER L'ITALIA DIGITALE)");
		canalePag1.setTipologia("PSP");
		//canalePag1.setTransactionId("TST000000000043240");
		
		CanalePagamento canalePag2 = new CanalePagamento();
		canalePag2.setId(2);
		//canalePag2.setApplicationId("PTW_301");
		canalePag2.setDescrizione("PAGAMENTO CON CARTA DI CREDITO PREDISPOSTO DAL TESORIERE DELL'AZIENDA SANITARIA (NON SONO PREVISTE COMMISSIONI)");
		canalePag2.setTipologia("POS");
		//canalePag2.setTransactionId("TST000000000043240");
		
		//Aggiungo entrambi i canali di pagamento alla lista asr1
		listaCanaliAsr1.add(canalePag1);
		listaCanaliAsr1.add(canalePag2);
		
		//Aggiungo un solo canale di pagamento alla lista asr2
		listaCanaliAsr2.add(canalePag1);
		
		asr1 = newAsr(301, "ASL TO1", true, null, listaCausaliAsr1, listaPresidi1); 
		asr2 = newAsr(909, "CITTA DELLA SALUTE E DELLA SCIENZA DI TORINO", false, canale, null, listaPresidi2);
		asr3 = newAsr(908,  "AZIENDA OSPEDALIERA MAURIZIANO", true, canaleAsr3, listaCausaliAsr2, listaPresidi2);
				
		listaAsr.add(asr1);
		listaAsr.add(asr2);
		listaAsr.add(asr3);
		
	}
	
	
	private Asr newAsr(Integer id, String descr, boolean canalePsp, CanalePagamento canalePos, List<CausalePagamento> causaliVersamento, List<PresidioSanitario> presidiSanitari) {
		Asr asr1 = new Asr();
		asr1.setId(id);
		asr1.setDescrizione(descr);
		asr1.setCanalePsp(canalePsp);
		asr1.setCanalePos(canalePos);
		asr1.setCausaliVersamento(causaliVersamento);
		asr1.setPresidiSanitari(presidiSanitari);
		
		return asr1;
	}
	
	//vedere se e come riutilizzarlo
	private CanalePagamento newCanalePagamento(Integer id, String desc, Tesoriere tesoriere, String tipologia, List<CartaCommissione> carteCommissioni) {
		CanalePagamento canale = new CanalePagamento();
		canale.setId(id);
		canale.setDescrizione(desc);
		canale.setTesoriere(tesoriere);
		canale.setTipologia(tipologia);
		canale.setCarteCommissioni(carteCommissioni);
		
		return canale;
	}
	
	private Tesoriere newTesoriere(Integer id, String descrizione, String url) {
		
		Tesoriere tesoriere1 = new Tesoriere();
		tesoriere1.setId(id);
		tesoriere1.setDescrizione(descrizione);
		tesoriere1.setUrlLogo(url);
		return tesoriere1;
	}
	
	private CartaCommissione newCartaCommissione(Integer id, String descrizione, String pathLogo) {
		CartaCommissione carta1 = new CartaCommissione();
		carta1.setId(id);
		carta1.setDescrizione(descrizione);
		carta1.setPathLogo(pathLogo);
		
		return carta1;
	}
	
	private CausalePagamento newCausalePagamento(BigDecimal id, String descrizione, String codiceVersamento) {
		CausalePagamento causale = new CausalePagamento();
		causale.setId(id);
		causale.setDescrizione(descrizione);
		causale.setCodiceVersamento(codiceVersamento);
		
		return causale;
	}
	
	private PresidioSanitario newPresidioSanitario(Integer id, String descrizione) {
		PresidioSanitario presidio = new PresidioSanitario();
		presidio.setId(id);
		presidio.setDescrizione(descrizione);
		
		return presidio;
	}
	
	/*public List<PresidioSanitario> getAllPresidi(){
		return listaPresidi;
	}*/
	
	public List<Asr> getAllAsr(){
		return listaAsr;
	}
	
	public Asr getAsrPerPagamento() {
		Asr asrRit = new Asr();
		asrRit = newAsr(301, "ASL TO1", true, null, null, null);
		return asrRit;
	}
	
	public Asr getAsrPerPagamento2() {
		Asr asrRit = new Asr();
		asrRit =  newAsr(908,  "AZIENDA OSPEDALIERA MAURIZIANO", true, canaleAsr3, null, null);
		return asrRit;
	}
	
	public Asr getAsr2() {
		return asr2;
	}
	
	
	public List<CanalePagamento> getListaCanaliPerAsr(Integer idAsr) throws MockNoDataFoundException{
		List<CanalePagamento> listaCausaleRet = null;
		switch(idAsr) {
		case 301:
			listaCausaleRet = listaCanaliAsr1;
			break;
		case 909:
			listaCausaleRet = listaCanaliAsr2;
			break;
			default : break;
		}
		if(listaCausaleRet == null) {
			throw new MockNoDataFoundException("No data found");
		}
		return listaCausaleRet;
	}
}
