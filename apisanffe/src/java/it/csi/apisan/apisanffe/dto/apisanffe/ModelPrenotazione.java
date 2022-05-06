/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelAvvisoPagamento;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelElencoPagamenti;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelRimborso;
import java.math.BigDecimal;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelPrenotazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String numeroPratica = null;
  private BigDecimal importoDaPagare = null;
  private BigDecimal importoPagato = null;
  private List<ModelElencoPagamenti> listaFattura = new ArrayList<ModelElencoPagamenti>();
  private String numeroQuietanza = null;
  private String motivoPagamento = null;
  private String asrBeneficiaria = null;
  private String codiceServizio = null;
  private String dataCreazionePrenotazione = null;
  private ModelAvvisoPagamento avvisoPagamento = null;
  private String iuvMod1 = null;
  private Integer opposizione730 = null;
  private List<String> listaNre = new ArrayList<String>();
  private List<ModelRimborso> listaRimborsi = new ArrayList<ModelRimborso>();
  private BigDecimal importoDaRimborsare = null;
  private BigDecimal importoRimborsato = null;
  private String rimborsoInErogazione = null;
  private String modalitaRimborso = null;
  private String ibanRimborso = null;

  /**
   * Il numero univoco del ticket
   **/
  

  @JsonProperty("numero_pratica") 
 
  public String getNumeroPratica() {
    return numeroPratica;
  }
  public void setNumeroPratica(String numeroPratica) {
    this.numeroPratica = numeroPratica;
  }

  /**
   * L&#39;importo che il paziente deve pagare
   **/
  

  @JsonProperty("importo_da_pagare") 
 
  public BigDecimal getImportoDaPagare() {
    return importoDaPagare;
  }
  public void setImportoDaPagare(BigDecimal importoDaPagare) {
    this.importoDaPagare = importoDaPagare;
  }

  /**
   * L&#39;importo che il paziente ha pagato
   **/
  

  @JsonProperty("importo_pagato") 
 
  public BigDecimal getImportoPagato() {
    return importoPagato;
  }
  public void setImportoPagato(BigDecimal importoPagato) {
    this.importoPagato = importoPagato;
  }

  /**
   **/
  

  @JsonProperty("lista_fattura") 
 
  public List<ModelElencoPagamenti> getListaFattura() {
    return listaFattura;
  }
  public void setListaFattura(List<ModelElencoPagamenti> listaFattura) {
    this.listaFattura = listaFattura;
  }

  /**
   * Il numero della quietanza
   **/
  

  @JsonProperty("numero_quietanza") 
 
  public String getNumeroQuietanza() {
    return numeroQuietanza;
  }
  public void setNumeroQuietanza(String numeroQuietanza) {
    this.numeroQuietanza = numeroQuietanza;
  }

  /**
   * Il motivo del pagamento
   **/
  

  @JsonProperty("motivo_pagamento") 
 
  public String getMotivoPagamento() {
    return motivoPagamento;
  }
  public void setMotivoPagamento(String motivoPagamento) {
    this.motivoPagamento = motivoPagamento;
  }

  /**
   * Il codice dell&#39;asr beneficiaria del pagamento
   **/
  

  @JsonProperty("asr_beneficiaria") 
 
  public String getAsrBeneficiaria() {
    return asrBeneficiaria;
  }
  public void setAsrBeneficiaria(String asrBeneficiaria) {
    this.asrBeneficiaria = asrBeneficiaria;
  }

  /**
   * Il codice del servizio
   **/
  

  @JsonProperty("codice_servizio") 
 
  public String getCodiceServizio() {
    return codiceServizio;
  }
  public void setCodiceServizio(String codiceServizio) {
    this.codiceServizio = codiceServizio;
  }

  /**
   * La data in cui è stata effettuata la prenotazione
   **/
  

  @JsonProperty("data_creazione_prenotazione") 
 
  public String getDataCreazionePrenotazione() {
    return dataCreazionePrenotazione;
  }
  public void setDataCreazionePrenotazione(String dataCreazionePrenotazione) {
    this.dataCreazionePrenotazione = dataCreazionePrenotazione;
  }

  /**
   **/
  

  @JsonProperty("avviso_pagamento") 
 
  public ModelAvvisoPagamento getAvvisoPagamento() {
    return avvisoPagamento;
  }
  public void setAvvisoPagamento(ModelAvvisoPagamento avvisoPagamento) {
    this.avvisoPagamento = avvisoPagamento;
  }

  /**
   * Lo IUV
   **/
  

  @JsonProperty("iuv_mod1") 
 
  public String getIuvMod1() {
    return iuvMod1;
  }
  public void setIuvMod1(String iuvMod1) {
    this.iuvMod1 = iuvMod1;
  }

  /**
   * Indica se il cittadino si è opposto o meno al 730
   **/
  

  @JsonProperty("opposizione_730") 
 
  public Integer getOpposizione730() {
    return opposizione730;
  }
  public void setOpposizione730(Integer opposizione730) {
    this.opposizione730 = opposizione730;
  }

  /**
   **/
  

  @JsonProperty("lista_nre") 
 
  public List<String> getListaNre() {
    return listaNre;
  }
  public void setListaNre(List<String> listaNre) {
    this.listaNre = listaNre;
  }

  /**
   * Ne contiene sempre almeno 1
   **/
  

  @JsonProperty("lista_rimborsi") 
 
  public List<ModelRimborso> getListaRimborsi() {
    return listaRimborsi;
  }
  public void setListaRimborsi(List<ModelRimborso> listaRimborsi) {
    this.listaRimborsi = listaRimborsi;
  }

  /**
   * L&#39;importo che deve essere rimborsato al cittadino
   **/
  

  @JsonProperty("importo_da_rimborsare") 
 
  public BigDecimal getImportoDaRimborsare() {
    return importoDaRimborsare;
  }
  public void setImportoDaRimborsare(BigDecimal importoDaRimborsare) {
    this.importoDaRimborsare = importoDaRimborsare;
  }

  /**
   * L&#39;importo già rimborsato al cittadino
   **/
  

  @JsonProperty("importo_rimborsato") 
 
  public BigDecimal getImportoRimborsato() {
    return importoRimborsato;
  }
  public void setImportoRimborsato(BigDecimal importoRimborsato) {
    this.importoRimborsato = importoRimborsato;
  }

  /**
   * indica se il rimborso è in erogazione
   **/
  

  @JsonProperty("rimborso_in_erogazione") 
 
  public String getRimborsoInErogazione() {
    return rimborsoInErogazione;
  }
  public void setRimborsoInErogazione(String rimborsoInErogazione) {
    this.rimborsoInErogazione = rimborsoInErogazione;
  }

  /**
   * codice della modalità di rimborso
   **/
  

  @JsonProperty("modalita_rimborso") 
 
  public String getModalitaRimborso() {
    return modalitaRimborso;
  }
  public void setModalitaRimborso(String modalitaRimborso) {
    this.modalitaRimborso = modalitaRimborso;
  }

  /**
   * L&#39;IBAN su cui il cittadino vuole ricevere il rimborso
   **/
  

  @JsonProperty("iban_rimborso") 
 
  public String getIbanRimborso() {
    return ibanRimborso;
  }
  public void setIbanRimborso(String ibanRimborso) {
    this.ibanRimborso = ibanRimborso;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPrenotazione modelPrenotazione = (ModelPrenotazione) o;
    return Objects.equals(numeroPratica, modelPrenotazione.numeroPratica) &&
        Objects.equals(importoDaPagare, modelPrenotazione.importoDaPagare) &&
        Objects.equals(importoPagato, modelPrenotazione.importoPagato) &&
        Objects.equals(listaFattura, modelPrenotazione.listaFattura) &&
        Objects.equals(numeroQuietanza, modelPrenotazione.numeroQuietanza) &&
        Objects.equals(motivoPagamento, modelPrenotazione.motivoPagamento) &&
        Objects.equals(asrBeneficiaria, modelPrenotazione.asrBeneficiaria) &&
        Objects.equals(codiceServizio, modelPrenotazione.codiceServizio) &&
        Objects.equals(dataCreazionePrenotazione, modelPrenotazione.dataCreazionePrenotazione) &&
        Objects.equals(avvisoPagamento, modelPrenotazione.avvisoPagamento) &&
        Objects.equals(iuvMod1, modelPrenotazione.iuvMod1) &&
        Objects.equals(opposizione730, modelPrenotazione.opposizione730) &&
        Objects.equals(listaNre, modelPrenotazione.listaNre) &&
        Objects.equals(listaRimborsi, modelPrenotazione.listaRimborsi) &&
        Objects.equals(importoDaRimborsare, modelPrenotazione.importoDaRimborsare) &&
        Objects.equals(importoRimborsato, modelPrenotazione.importoRimborsato) &&
        Objects.equals(rimborsoInErogazione, modelPrenotazione.rimborsoInErogazione) &&
        Objects.equals(modalitaRimborso, modelPrenotazione.modalitaRimborso) &&
        Objects.equals(ibanRimborso, modelPrenotazione.ibanRimborso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroPratica, importoDaPagare, importoPagato, listaFattura, numeroQuietanza, motivoPagamento, asrBeneficiaria, codiceServizio, dataCreazionePrenotazione, avvisoPagamento, iuvMod1, opposizione730, listaNre, listaRimborsi, importoDaRimborsare, importoRimborsato, rimborsoInErogazione, modalitaRimborso, ibanRimborso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPrenotazione {\n");
    
    sb.append("    numeroPratica: ").append(toIndentedString(numeroPratica)).append("\n");
    sb.append("    importoDaPagare: ").append(toIndentedString(importoDaPagare)).append("\n");
    sb.append("    importoPagato: ").append(toIndentedString(importoPagato)).append("\n");
    sb.append("    listaFattura: ").append(toIndentedString(listaFattura)).append("\n");
    sb.append("    numeroQuietanza: ").append(toIndentedString(numeroQuietanza)).append("\n");
    sb.append("    motivoPagamento: ").append(toIndentedString(motivoPagamento)).append("\n");
    sb.append("    asrBeneficiaria: ").append(toIndentedString(asrBeneficiaria)).append("\n");
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("    dataCreazionePrenotazione: ").append(toIndentedString(dataCreazionePrenotazione)).append("\n");
    sb.append("    avvisoPagamento: ").append(toIndentedString(avvisoPagamento)).append("\n");
    sb.append("    iuvMod1: ").append(toIndentedString(iuvMod1)).append("\n");
    sb.append("    opposizione730: ").append(toIndentedString(opposizione730)).append("\n");
    sb.append("    listaNre: ").append(toIndentedString(listaNre)).append("\n");
    sb.append("    listaRimborsi: ").append(toIndentedString(listaRimborsi)).append("\n");
    sb.append("    importoDaRimborsare: ").append(toIndentedString(importoDaRimborsare)).append("\n");
    sb.append("    importoRimborsato: ").append(toIndentedString(importoRimborsato)).append("\n");
    sb.append("    rimborsoInErogazione: ").append(toIndentedString(rimborsoInErogazione)).append("\n");
    sb.append("    modalitaRimborso: ").append(toIndentedString(modalitaRimborso)).append("\n");
    sb.append("    ibanRimborso: ").append(toIndentedString(ibanRimborso)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

