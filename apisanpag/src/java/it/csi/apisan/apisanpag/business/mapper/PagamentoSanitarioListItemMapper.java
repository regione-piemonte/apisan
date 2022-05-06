/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.business.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import it.csi.apisan.apisanpag.dto.apisanpag.PagamentoSanitario;
import it.csi.ptwsrv.business.webservice.ptwsrvavvisopagamento.ItemStampaAvvisoPagamento;

public class PagamentoSanitarioListItemMapper extends BaseMapper<PagamentoSanitario, List<ItemStampaAvvisoPagamento>> {
	
	public static final String LOG_ID  = "log_id";
	public static final String TIPO_RICEVUTA =  "tipoRicevuta";
	public static final String ID_ASR     = "idAsr";
	public static final String PATH_IMG =  "pathImg";
	public static final String CODICE_VERSAMENTO   = "codiceVersamento";
	//public static final String RICETTE = "ricette"; -> non obbligatorio
	public static final String ENTE_CREDITORE = "EnteCreditore";
	public static final String NUMERO_PRATICA = "numeroPratica";
	public static final String TIPO_PAGAMENTO = "tipoPagamento";
	public static final String TIPO_PAGAMENTO_VALUE = "RATA UNICA";
	//public static final String SCADENZA_PAGAMENTO = "scadenzaPagamento"; --> non obbligatorio
	//public static final String INTESTATARIO_CC =  "IntestatarioCC"; --> non obbligatorio
	public static final String TIPO_BOLLETTINO = "tipoBollettino";
	public static final String COGNOME_NOME = "cognomeNome";
	public static final String CODICE_FISCALE = "codiceFiscale";
	//public static final String IMPORTO_PAGATO = "importoPagato"; --> non obbligatorio
	public static final String INDIRIZZO_COMPLETO = "indirizzoCompleto";
	public static final String IMPORTO_PAGARE =  "importoPagare";
	public static final String NUMERO_AVVISO_PAGAMENTO =  "numeroAvvisoPagamento";
	public static final String APPLICATION_CODE = "Application_code";
	public static final String AUX_DIGIT = "Aux_digit";
	public static final String MOTIVO_PAGAMENTO = "motivoPagamento";
	public static final String IUV = "iuv";
	
	//private String xRequestId;
	
	
	public PagamentoSanitarioListItemMapper() {
		//this.xRequestId = xRequestId;
	}
	
	@Override
	public List<ItemStampaAvvisoPagamento> to(PagamentoSanitario source) {
		if(source == null) {
			return null;
		}

		
		List<ItemStampaAvvisoPagamento> dest = new ArrayList<ItemStampaAvvisoPagamento>();
		
		/*ItemStampaAvvisoPagamento logid = new ItemStampaAvvisoPagamento();
		logid.setKey(LOG_ID);
		logid.setValue(xRequestId);
		dest.add(logid);*/
		
		ItemStampaAvvisoPagamento tipoRicevuta = new ItemStampaAvvisoPagamento();
		tipoRicevuta.setKey(TIPO_RICEVUTA);
		tipoRicevuta.setValue("5");
		dest.add(tipoRicevuta);
		
		ItemStampaAvvisoPagamento asr = new ItemStampaAvvisoPagamento();
		asr.setKey(ID_ASR);
		asr.setValue("" + source.getAsr().getId());
		dest.add(asr);		
		
		ItemStampaAvvisoPagamento pathimg = new ItemStampaAvvisoPagamento();
		pathimg.setKey(PATH_IMG);
		pathimg.setValue("/appserv/jboss/ajb640/images/");
		dest.add(pathimg);
		
		ItemStampaAvvisoPagamento codiceversamento = new ItemStampaAvvisoPagamento();
		codiceversamento.setKey(CODICE_VERSAMENTO);
		if(source.getAsr() != null && source.getAsr().getCausaliVersamento() != null && source.getAsr().getCausaliVersamento().get(0) != null) {
			codiceversamento.setValue(source.getAsr().getCausaliVersamento().get(0).getCodiceVersamento());
			dest.add(codiceversamento);
		}else {
			dest.add(null);
		}
		
		ItemStampaAvvisoPagamento tipoPagamento = new ItemStampaAvvisoPagamento();
		tipoPagamento.setKey(TIPO_PAGAMENTO);
		tipoPagamento.setValue(TIPO_PAGAMENTO_VALUE);
		dest.add(tipoPagamento);
		
		ItemStampaAvvisoPagamento entecreditore = new ItemStampaAvvisoPagamento();
		entecreditore.setKey(ENTE_CREDITORE);
		entecreditore.setValue(source.getAsr().getDescrizione());
		dest.add(entecreditore);		
		
		
		ItemStampaAvvisoPagamento numeropratica = new ItemStampaAvvisoPagamento();
		numeropratica.setKey(NUMERO_PRATICA);
		numeropratica.setValue(source.getNumeroPraticaRegionale());
		dest.add(numeropratica);
		
		ItemStampaAvvisoPagamento cognomenome = new ItemStampaAvvisoPagamento();
		cognomenome.setKey(COGNOME_NOME);
		cognomenome.setValue(source.getPaziente().getCognome() + " " + source.getPaziente().getNome());
		dest.add(cognomenome);	
		
		ItemStampaAvvisoPagamento codicefiscale = new ItemStampaAvvisoPagamento();
		codicefiscale.setKey(CODICE_FISCALE);
		codicefiscale.setValue(source.getPaziente().getCodiceFiscale());
		dest.add(codicefiscale);			
		
		
		ItemStampaAvvisoPagamento indirizzocompleto = new ItemStampaAvvisoPagamento();
		indirizzocompleto.setKey(INDIRIZZO_COMPLETO);
		indirizzocompleto.setValue(source.getPaziente().getIndirizzo() + " " + source.getPaziente().getProvincia() + " " + source.getPaziente().getComune() + " " + source.getPaziente().getCap());
		dest.add(indirizzocompleto);			
		
		ItemStampaAvvisoPagamento importodapagare = new ItemStampaAvvisoPagamento();
		importodapagare.setKey(IMPORTO_PAGARE);
		importodapagare.setValue(getImportoAsString(source.getDaPagare().getValore()));
		dest.add(importodapagare);					
		
		ItemStampaAvvisoPagamento numeroavvisopagamento = new ItemStampaAvvisoPagamento();
		numeroavvisopagamento.setKey(NUMERO_AVVISO_PAGAMENTO);
		numeroavvisopagamento.setValue(source.getAssegnazioneIuv().getIuvmod3().getAuxDigit()  + source.getAssegnazioneIuv().getIuvmod3().getApplicationCode() + 
				source.getAssegnazioneIuv().getIuvmod3().getIuv());
		dest.add(numeroavvisopagamento);							
		
		
		ItemStampaAvvisoPagamento applicationcode = new ItemStampaAvvisoPagamento();
		applicationcode.setKey(APPLICATION_CODE);
		applicationcode.setValue(source.getAssegnazioneIuv().getIuvmod3().getApplicationCode());
		dest.add(applicationcode);
		
		ItemStampaAvvisoPagamento auxdigit = new ItemStampaAvvisoPagamento();
		auxdigit.setKey(AUX_DIGIT);
		auxdigit.setValue(source.getAssegnazioneIuv().getIuvmod3().getAuxDigit());
		dest.add(auxdigit);			
		
		ItemStampaAvvisoPagamento motivopagamento = new ItemStampaAvvisoPagamento();
		motivopagamento.setKey(MOTIVO_PAGAMENTO);
		motivopagamento.setValue(source.getMotivo());
		dest.add(motivopagamento);			
		
		
		ItemStampaAvvisoPagamento tipoBollettino = new ItemStampaAvvisoPagamento();
		tipoBollettino.setKey(TIPO_BOLLETTINO);
		tipoBollettino.setValue("P1");
		dest.add(tipoBollettino);
		
		ItemStampaAvvisoPagamento iuv = new ItemStampaAvvisoPagamento();
		iuv.setKey(IUV);
		iuv.setValue(source.getAssegnazioneIuv().getIuvmod3().getIuv());
		dest.add(iuv);			
		
		return dest;
	}
	
	
	private String getImportoAsString(BigDecimal importo) {
		String strImporto = getImportoAsStringWithoutDot(importo);
		return addZeroEnd(strImporto);
	}
	
	private String getImportoAsStringWithoutDot(BigDecimal importo) {
		return importo.toString().replace(".",",");
	}
	
	private String addZeroEnd(String importo) {
		try {
			String[] split = importo.split(",");
			while(split[1].length() < 2) {
				split[1] += "0";
			}
			return split[0] + "," + split[1] ;
		}catch(ArrayIndexOutOfBoundsException e) {
			return importo + ",00";
		}
		
	}
	
	@Override
	public PagamentoSanitario from(List<ItemStampaAvvisoPagamento> dest) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
