/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanpag.dto.apisanpag.Importo;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Prenotazione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String numeroPratica = null;
  private Importo importoDaPagare = null;
  private Importo importoPagato = null;
  private String numeroQuietanza = null;
  private String asrBeneficiaria = null;
  private String codiceServizio = null;
  private Date dataCreazionePrenotazione = null;
  private BigDecimal opposizione730 = null;
  private Importo importoDaRimborsare = null;
  private Importo importoRimborsato = null;
  private Importo rimborsoInErogazione = null;
  private String modalitaRimborso = null;
  private String motivoPagamento = null;
  private String iban = null;
  private List<String> listaNre = new ArrayList<String>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_pratica") 
 
  public String getNumeroPratica() {
    return numeroPratica;
  }
  public void setNumeroPratica(String numeroPratica) {
    this.numeroPratica = numeroPratica;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_da_pagare") 
 
  public Importo getImportoDaPagare() {
    return importoDaPagare;
  }
  public void setImportoDaPagare(Importo importoDaPagare) {
    this.importoDaPagare = importoDaPagare;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_pagato") 
 
  public Importo getImportoPagato() {
    return importoPagato;
  }
  public void setImportoPagato(Importo importoPagato) {
    this.importoPagato = importoPagato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numero_quietanza") 
 
  public String getNumeroQuietanza() {
    return numeroQuietanza;
  }
  public void setNumeroQuietanza(String numeroQuietanza) {
    this.numeroQuietanza = numeroQuietanza;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asr_beneficiaria") 
 
  public String getAsrBeneficiaria() {
    return asrBeneficiaria;
  }
  public void setAsrBeneficiaria(String asrBeneficiaria) {
    this.asrBeneficiaria = asrBeneficiaria;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice_servizio") 
 
  public String getCodiceServizio() {
    return codiceServizio;
  }
  public void setCodiceServizio(String codiceServizio) {
    this.codiceServizio = codiceServizio;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data_creazione_prenotazione") 
 
  public Date getDataCreazionePrenotazione() {
    return dataCreazionePrenotazione;
  }
  public void setDataCreazionePrenotazione(Date dataCreazionePrenotazione) {
    this.dataCreazionePrenotazione = dataCreazionePrenotazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("opposizione_730") 
 
  public BigDecimal getOpposizione730() {
    return opposizione730;
  }
  public void setOpposizione730(BigDecimal opposizione730) {
    this.opposizione730 = opposizione730;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_da_rimborsare") 
 
  public Importo getImportoDaRimborsare() {
    return importoDaRimborsare;
  }
  public void setImportoDaRimborsare(Importo importoDaRimborsare) {
    this.importoDaRimborsare = importoDaRimborsare;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("importo_rimborsato") 
 
  public Importo getImportoRimborsato() {
    return importoRimborsato;
  }
  public void setImportoRimborsato(Importo importoRimborsato) {
    this.importoRimborsato = importoRimborsato;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rimborso_in_erogazione") 
 
  public Importo getRimborsoInErogazione() {
    return rimborsoInErogazione;
  }
  public void setRimborsoInErogazione(Importo rimborsoInErogazione) {
    this.rimborsoInErogazione = rimborsoInErogazione;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("modalita_rimborso") 
 
  public String getModalitaRimborso() {
    return modalitaRimborso;
  }
  public void setModalitaRimborso(String modalitaRimborso) {
    this.modalitaRimborso = modalitaRimborso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("motivo_pagamento") 
 
  public String getMotivoPagamento() {
    return motivoPagamento;
  }
  public void setMotivoPagamento(String motivoPagamento) {
    this.motivoPagamento = motivoPagamento;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("iban") 
 
  public String getIban() {
    return iban;
  }
  public void setIban(String iban) {
    this.iban = iban;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lista_nre") 
 
  public List<String> getListaNre() {
    return listaNre;
  }
  public void setListaNre(List<String> listaNre) {
    this.listaNre = listaNre;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prenotazione prenotazione = (Prenotazione) o;
    return Objects.equals(numeroPratica, prenotazione.numeroPratica) &&
        Objects.equals(importoDaPagare, prenotazione.importoDaPagare) &&
        Objects.equals(importoPagato, prenotazione.importoPagato) &&
        Objects.equals(numeroQuietanza, prenotazione.numeroQuietanza) &&
        Objects.equals(asrBeneficiaria, prenotazione.asrBeneficiaria) &&
        Objects.equals(codiceServizio, prenotazione.codiceServizio) &&
        Objects.equals(dataCreazionePrenotazione, prenotazione.dataCreazionePrenotazione) &&
        Objects.equals(opposizione730, prenotazione.opposizione730) &&
        Objects.equals(importoDaRimborsare, prenotazione.importoDaRimborsare) &&
        Objects.equals(importoRimborsato, prenotazione.importoRimborsato) &&
        Objects.equals(rimborsoInErogazione, prenotazione.rimborsoInErogazione) &&
        Objects.equals(modalitaRimborso, prenotazione.modalitaRimborso) &&
        Objects.equals(motivoPagamento, prenotazione.motivoPagamento) &&
        Objects.equals(iban, prenotazione.iban) &&
        Objects.equals(listaNre, prenotazione.listaNre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroPratica, importoDaPagare, importoPagato, numeroQuietanza, asrBeneficiaria, codiceServizio, dataCreazionePrenotazione, opposizione730, importoDaRimborsare, importoRimborsato, rimborsoInErogazione, modalitaRimborso, motivoPagamento, iban, listaNre);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prenotazione {\n");
    
    sb.append("    numeroPratica: ").append(toIndentedString(numeroPratica)).append("\n");
    sb.append("    importoDaPagare: ").append(toIndentedString(importoDaPagare)).append("\n");
    sb.append("    importoPagato: ").append(toIndentedString(importoPagato)).append("\n");
    sb.append("    numeroQuietanza: ").append(toIndentedString(numeroQuietanza)).append("\n");
    sb.append("    asrBeneficiaria: ").append(toIndentedString(asrBeneficiaria)).append("\n");
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("    dataCreazionePrenotazione: ").append(toIndentedString(dataCreazionePrenotazione)).append("\n");
    sb.append("    opposizione730: ").append(toIndentedString(opposizione730)).append("\n");
    sb.append("    importoDaRimborsare: ").append(toIndentedString(importoDaRimborsare)).append("\n");
    sb.append("    importoRimborsato: ").append(toIndentedString(importoRimborsato)).append("\n");
    sb.append("    rimborsoInErogazione: ").append(toIndentedString(rimborsoInErogazione)).append("\n");
    sb.append("    modalitaRimborso: ").append(toIndentedString(modalitaRimborso)).append("\n");
    sb.append("    motivoPagamento: ").append(toIndentedString(motivoPagamento)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    listaNre: ").append(toIndentedString(listaNre)).append("\n");
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

