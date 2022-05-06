/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.integration.mock;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import it.csi.apisan.apisanpag.dto.apisanpag.Cittadino;
import it.csi.apisan.apisanpag.dto.apisanpag.Asr;
import it.csi.apisan.apisanpag.dto.apisanpag.AssegnazioneIuv;
import it.csi.apisan.apisanpag.dto.apisanpag.Importo;
import it.csi.apisan.apisanpag.dto.apisanpag.Iuvmod1;
import it.csi.apisan.apisanpag.dto.apisanpag.Iuvmod3;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoFilter;
import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario;
import it.csi.apisan.apisanpag.dto.apisanpag.Prestazione;
import it.csi.apisan.apisanpag.util.filter.FilterUtil;


@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class UtentiMock {
	
	@Autowired
	PresidiAsrMock asrPresidi;

	List<PagamentoSanitario> lista = new ArrayList<PagamentoSanitario>();
	PagamentoSanitario pagamento1;
	PagamentoSanitario pagamento2;
	PagamentoSanitario pagamento3;
	
	
	List<PagamentoSanitario> listaPagamentiRicevute = new ArrayList<PagamentoSanitario>();
	PagamentoSanitario pagamentoRic1;
	PagamentoSanitario pagamentoRic2;
	PagamentoSanitario pagamentoRic3;
	
	@PostConstruct
	public void costruisciLista() {
		DateFormat dz = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		try {
			System.out.println("[UtentiMock::costruisciLista] BEGIN");
			//Costruzione di una lista di pagamenti: ne aggiungo 2 per csi.demo20 e 1 per csi.demo 21
			String opposizione730 = "autorizzata";
			String numeroPraticaRegionale = "S30101123456789012345602670";
			String numeroPraticaAsr = "123456723456";
			String dataCreazione = "2017-05-04T09:11:00";
			String nre = "010D14000000000";
			List<String> listaNre = new ArrayList<>();
			listaNre.add(nre);
			//pagamento1.setPrestazioni(listaPrest);
			
			pagamento1 = getPagamentoSanitario(getMockAnagraficaPaziente("Tex", "Willer", "1978-05-04T09:11:00", "AAAAAA00B77B000F", "via Torino 123", "Torino", "TO", "10154"), asrPresidi.getAsrPerPagamento(),
					"S", null, getMockImporto(new BigDecimal("45.50"), "EUR"), getMockImporto(new BigDecimal("2.00"), "EUR"), null, null, 1, opposizione730, "DA PAGARE",numeroPraticaRegionale, numeroPraticaAsr,
					null, getMockIuv3("2017-05-01T09:11:00", "0", "1", "9966171590007"), listaNre, dz.parse(dataCreazione), "550e8400-e29b-41d4-a716-446655440000");
			
			
			lista.add(pagamento1);
			
			String numeroPraticaRegionale2 = "S30101123456789012345602671";
			String numeroPraticaAsr2 = "123456723457";
			String dataCreazione2 = "2017-07-04T09:11:00";
			String nre2 = "020D14000000000";
			List<String> listaNre2 = new ArrayList<>();
			listaNre.add(nre2);
			
			
			pagamento2 = getPagamentoSanitario(getMockAnagraficaPaziente("Tex", "Willer", "1978-05-04T09:11:00", "AAAAAA00B77B000F", "via Torino 123", "Torino", "TO", "10154"), asrPresidi.getAsrPerPagamento2(),
					"N", null, getMockImporto(new BigDecimal("45.50"), "EUR"), getMockImporto(new BigDecimal("2.00"), "EUR"), getMockImporto(new BigDecimal("1.11"), "EUR"), "6%", 1, opposizione730, "DA PAGARE",numeroPraticaRegionale2, null,
					null, getMockIuv1("2017-05-03T09:11:00", "RF90171710003S00000005"), listaNre2, dz.parse(dataCreazione2), "550e8400-e29b-41d4-a716-446655440000");
			
			lista.add(pagamento2);
			
			
			String numeroPraticaRegionale3 = "S30101123456789012345602672";
			String numeroPraticaAsr3 = "123456723458";
			String dataCreazione3 = "2017-08-04T09:11:00";
			String nre3 = "030D14000000000";
			List<String> listaNre3 = new ArrayList<>();
			listaNre.add(nre3);
			
			pagamento3 = getPagamentoSanitario(getMockAnagraficaPaziente("Tex", "Willer", "1978-05-04T09:11:00", "AAAAAA00B77B000F", "via Torino 123", "Torino", "TO", "10154"), asrPresidi.getAsrPerPagamento(),
					"S", null, getMockImporto(new BigDecimal("45.50"), "EUR"), getMockImporto(new BigDecimal("2.00"), "EUR"), getMockImporto(new BigDecimal(1.50).setScale(2), "EUR"), "6%", 1, opposizione730, "DA PAGARE",numeroPraticaRegionale3, null,
					null, getMockIuv1("2017-05-03T09:11:00", "RF90171710003S00000005"), listaNre3, dz.parse(dataCreazione3), "550e8400-e29b-41d4-a716-446655440000");
			
			
			lista.add(pagamento3);
			
			if(lista != null) {
				System.out.println("Lista != null size: " + lista.size());
			}
			
			
			/**
			 *  vecchio modo
			 *  		AssegnazioneIuv iuv1 = getMockIuv3("2017-05-01T09:11:00", "0", "1", "9966171590007");
			
			pagamento1.setPaziente(getMockAnagraficaPaziente("Tex", "Willer", "1978-05-04T09:11:00", "AAAAAA00B77B000F", "via Torino 123", "Torino", "TO", "10154"));//
			
			pagamento1.setAsr(asrPresidi.getAsr1());
			pagamento1.setMotivo("S");
			pagamento1.setDaPagare(new BigDecimal(0));
			pagamento1.setPagato(new BigDecimal(45.5));
			pagamento1.setMarcaDaBollo(new BigDecimal(2));
			pagamento1.setIva(new BigDecimal(1.11));
			pagamento1.setIvaPerStampaVideo("4%");
			pagamento1.setOpposizione730(1);
			pagamento1.setDescrizioneOpposizione730("autorizzata");
			pagamento1.setStato("P");
			pagamento1.setNumeroPraticaRegionale("S30101123456789012345602670");
			pagamento1.setNumeroPraticaAsr("123456723456");
			//pagamento1.setIdRicevuta(idRicevuta);
			pagamento1.setAssegnazioneIuv(iuv1);
			pagamento1.setDataCreazione(dz.parse("2017-05-04T09:11:00"));
			
			

			
			Prestazione prest1 = getMockPrestazione("89.7", "VISITA CHIRURGICA PRIMA", "2018-05-04T09:11:00", "Ospedale Mauriziano Umberto I di Torino Largo Turati 62 10128 Torino To");
			Prestazione prest2 = getMockPrestazione("n.a.", "Accesso di Pronto Soccorso", "2018-05-05T09:11:00", "Ospedale Mauriziano Umberto I di Torino Largo Turati 62 10128 Torino To");
			Prestazione prest3 = getMockPrestazione("89.01", "VISITA ENDOCRINOLOGICA DI CONTROLLO", "2018-05-06T09:11:00", "Ospedale Mauriziano Umberto I di Torino Largo Turati 62 10128 Torino To");
			List<Prestazione> listaPrest = new ArrayList<Prestazione>();
			listaPrest.add(prest1);
			listaPrest.add(prest2);
			listaPrest.add(prest3);
			pagamento1.setNre(listaNre);
			
						AssegnazioneIuv iuv12 = getMockIuv1("2017-05-03T09:11:00", "RF90171710003S00000005");
			
			pagamento2.setAsr(asrPresidi.getAsr2());
			pagamento2.setAssegnazioneIuv(iuv12);
			pagamento2.setStato("P");
			pagamento2.setDataCreazione(dz.parse("2017-05-04T09:11:00"));
			pagamento2.setDescrizioneOpposizione730("autorizzata");
			pagamento2.setMotivo("S");
			//pagamento2.setNre("nre11111111");
			//pagamento2.setNumeroPratica("S90801908100000604467002030");
			//pagamento2.setNumeroRicevuta("1");
			pagamento2.setOpposizione730(1);
			//pagamento2.setPagato(1);
			pagamento2.setPaziente(getMockAnagraficaPaziente("Tex", "Willer", "1978-05-04T09:11:00", "AAAAAA00B77B000F", "via Torino 123", "Torino", "TO", "10154"));//
			Prestazione prest11 = getMockPrestazione("89.7", "VISITA CHIRURGICA PRIMA", "2018-05-04T09:11:00", "Ospedale Mauriziano Umberto I di Torino Largo Turati 62 10128 Torino To");
			Prestazione prest22 = getMockPrestazione("n.a.", "Accesso di Pronto Soccorso", "2018-05-05T09:11:00", "Ospedale Mauriziano Umberto I di Torino Largo Turati 62 10128 Torino To");
			Prestazione prest33 = getMockPrestazione("89.01", "VISITA ENDOCRINOLOGICA DI CONTROLLO", "2018-05-06T09:11:00", "Ospedale Mauriziano Umberto I di Torino Largo Turati 62 10128 Torino To");
			List<Prestazione> listaPrest2 = new ArrayList<Prestazione>();
			listaPrest2.add(prest11);
			listaPrest2.add(prest22);
			listaPrest2.add(prest33);
			//pagamento2.setPrestazioni(listaPrest2);
			 * 
			 * 
				AssegnazioneIuv iuv23 =getMockIuv1("2017-05-04T09:11:00", "RF66171590007S00000006");
			
			pagamento3.setAsr(asrPresidi.getAsr1());
			pagamento3.setAssegnazioneIuv(iuv23);
			pagamento3.setStato("P");
			pagamento3.setDataCreazione(dz.parse("2017-05-02T09:11:00"));
			pagamento3.setDescrizioneOpposizione730("autorizzata");
			pagamento3.setMotivo("S");
			//pagamento3.setNre("NRE123456789012");
			//pagamento3.setNumeroPratica("S90801908100000605101702670");
			//pagamento3.setNumeroRicevuta("1");
			pagamento3.setOpposizione730(1);
			//pagamento3.setPagato(1);
			pagamento3.setPaziente(getMockAnagraficaPaziente("Demo", "Ventuno", "1976-06-04T09:11:00", "AAAAAA00A11B000J", "via Torino 123", "Torino", "TO", "10154"));//
			Prestazione prest13 = getMockPrestazione("89.7", "VISITA CHIRURGICA PRIMA", "2018-05-04T09:11:00", "Ospedale Mauriziano Umberto I di Torino Largo Turati 62 10128 Torino To");
			Prestazione prest23 = getMockPrestazione("n.a.", "Accesso di Pronto Soccorso", "2018-05-05T09:11:00", "Ospedale Mauriziano Umberto I di Torino Largo Turati 62 10128 Torino To");
		
			List<Prestazione> listaPrest3 = new ArrayList<Prestazione>();
			listaPrest3.add(prest13);
			listaPrest3.add(prest23);
			
			//pagamento3.setPrestazioni(listaPrest3);
			 */
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	private Importo getMockImporto(BigDecimal valore, String valuta) {
		Importo importo = new Importo();
		importo.setValore(valore);
		importo.setValuta(valuta);
		return importo;
	}
	
	private AssegnazioneIuv getMockIuv3(String dataAssegnazione, String auxDigit, String applicationCode, String iuv) {
		AssegnazioneIuv iuv3 = null;
		try {
			iuv3 = new AssegnazioneIuv();
			DateFormat dz = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
			Iuvmod3 iuvMod3 = new Iuvmod3();
			iuvMod3.setApplicationCode(applicationCode);
			iuvMod3.setAuxDigit(auxDigit);
			iuvMod3.setDataAssegnazione(dz.parse(dataAssegnazione));
			iuvMod3.setIuv(iuv);
			
			iuv3.setIuvmod3(iuvMod3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return iuv3;
	}
	
	
	private AssegnazioneIuv getMockIuv1(String dataAssegnazione, String iuv) {
		AssegnazioneIuv iuv1 = null;
		try {
			iuv1 = new AssegnazioneIuv();
			DateFormat dz = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
			Iuvmod1 iuvMod1 = new Iuvmod1();
			iuvMod1.setIuv(iuv);
			iuvMod1.setDataAssegnazione(dz.parse(dataAssegnazione));
			iuv1.setIuvmod1(iuvMod1);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return iuv1;
	}	
	private Cittadino getMockAnagraficaPaziente(String nome,String cognome,String dataNascita,String codiceFiscale,
			String indirizzo,String comune,String provincia,String cap) {
		
		Cittadino paziente = null;
		try {
			paziente = new Cittadino();
			DateFormat dz = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
			paziente.setNome(nome);
			 paziente.setCognome(cognome);
			 paziente.setDataNascita(dz.parse(dataNascita));
			 paziente.setCodiceFiscale(codiceFiscale);
			 paziente.setIndirizzo(indirizzo);
			 paziente.setComune(comune);
			 paziente.setProvincia(provincia);
			 paziente.setCap(cap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return paziente;
	}
	
	private Prestazione getMockPrestazione(String codice,String descrizione,String dataAppuntamento,String luogoApputamento) {
		
		Prestazione prestazione = null;
		try {
			prestazione = new Prestazione();
			DateFormat dz = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
			prestazione.setCodice(codice);
			prestazione.setDescrizione(descrizione);
			prestazione.setDataAppuntamento(dz.parse(dataAppuntamento)) ;
			prestazione.setLuogoApputamento(luogoApputamento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prestazione;
	}
	
	
	/**TODO
	 * da usare
	 * @param paziente
	 * @param asr
	 * @param motivo
	 * @param daPagare
	 * @param pagato
	 * @param marcaDaBollo
	 * @param iva
	 * @param ivaPerStampaVideo
	 * @param opposizione730
	 * @param descrizioneOpposizione730
	 * @param stato
	 * @param numeroPraticaRegionale
	 * @param numeroPraticaAsr
	 * @param idRicevuta
	 * @param assegnazioneIuv
	 * @param nre
	 * @param dataCreazione
	 * @param uuid
	 * @return
	 */
	private PagamentoSanitario getPagamentoSanitario(Cittadino paziente,  Asr asr,  String motivo ,  Importo daPagare ,  Importo pagato ,  Importo marcaDaBollo ,  
			Importo iva ,  String ivaPerStampaVideo ,  Integer opposizione730 ,  String descrizioneOpposizione730 ,  String stato ,  
			String numeroPraticaRegionale ,  String numeroPraticaAsr ,  Integer idRicevuta ,  AssegnazioneIuv assegnazioneIuv ,  
			List<String> nre, Date dataCreazione ,  String uuid){

		PagamentoSanitario pagamento = new PagamentoSanitario();
		pagamento.setPaziente(paziente);
		pagamento.setAsr(asr);
		pagamento.setMotivo(motivo);
		pagamento.setDaPagare(daPagare);
		pagamento.setPagato(pagato);
		pagamento.setMarcaDaBollo(marcaDaBollo);
		pagamento.setIva(iva);
		pagamento.setIvaPerStampaVideo(ivaPerStampaVideo);
		pagamento.setOpposizione730(opposizione730);
		pagamento.setDescrizioneOpposizione730(descrizioneOpposizione730);
		pagamento.setStato(stato);
		pagamento.setNumeroPraticaRegionale(numeroPraticaRegionale);
		pagamento.setNumeroPraticaAsr(numeroPraticaAsr);
		pagamento.setIdRicevuta(idRicevuta);
		pagamento.setAssegnazioneIuv(assegnazioneIuv);
		//pagamento.setNre(nre);
		pagamento.setDataCreazione(dataCreazione);
		pagamento.setUuid(uuid);
		
		return pagamento;
	}
	
	public List<PagamentoSanitario> getAllPagamentiSanitari(String filter){
		
		System.out.println("getAllPagamentiSanitari filter: " + filter);
		if(StringUtils.isBlank(filter)) {
			return this.lista;
		}else {
			//Gestione del filter
			Stream<PagamentoSanitario> stream = lista.stream();
			PagamentoFilter filterPag = FilterUtil.init(PagamentoFilter.class, filter);
//			if(filterPag.getNumeroPraticaRegionale() != null && StringUtils.isNotBlank(filterPag.getNumeroPraticaRegionale().getEq())){
//				stream = stream.filter(c -> c.getNumeroPraticaRegionale().equalsIgnoreCase(filterPag.getNumeroPraticaRegionale().getEq()));
//			}
			if(filterPag.getNumeroPraticaAsr() != null && StringUtils.isNotBlank(filterPag.getNumeroPraticaAsr().getEq() )){
				stream = stream.filter(c -> c.getNumeroPraticaAsr().equalsIgnoreCase(filterPag.getNumeroPraticaAsr().getEq()));
			}
			if(filterPag.getNre() != null && StringUtils.isNotBlank(filterPag.getNre().getEq() )){
				stream = stream.filter(c -> c.getNre().stream().allMatch(f -> f.equals(filterPag.getNre().getEq()) ) );
			}
			
			return stream.collect(Collectors.toList());
		}
		
	}
	
	public PagamentoSanitario getPagamentoSanitarioPerNumeroPratica(String numeroPratica) {
		System.out.println("numero pratica: " + numeroPratica);
		//seleziono con lambda
		return lista.stream().filter(c -> c.getNumeroPraticaRegionale().equalsIgnoreCase(numeroPratica)).findFirst().orElse(null);
		
	}
	
	public List<PagamentoSanitario> getPagamentiSanitariFromCf(String codFisc) throws MockNoDataFoundException{
		List<PagamentoSanitario> listaRet = new ArrayList<PagamentoSanitario>(); 
		boolean trovatoAlmenoUno = false;
		if (codFisc != null){
			Iterator<PagamentoSanitario> it = lista.iterator();
			while (it.hasNext()) {
				PagamentoSanitario pagamento = (PagamentoSanitario) it.next();
				if (pagamento.getPaziente().getCodiceFiscale().equals(codFisc)){
					listaRet.add(pagamento);
					trovatoAlmenoUno = true;
				}
			}
		}
		if(trovatoAlmenoUno) {
			return listaRet;
		}else {
			throw new MockNoDataFoundException("No data found");
		}
	}
	
	public byte[] getFileFromTransazione() throws IOException{

		try {
			//FileInputStream in = new FileInputStream(new File("templatemock/ricevuta.pdf"));

			InputStream is = this.getClass().getResourceAsStream("/templatemock/ricevuta.pdf");
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();

			int nRead;
			byte[] data = new byte[16384];

			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
			}

			buffer.flush();
			is.close();
			buffer.close();
			return buffer.toByteArray();

		}catch(IOException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
