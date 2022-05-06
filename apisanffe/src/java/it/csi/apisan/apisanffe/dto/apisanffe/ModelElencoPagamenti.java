/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import it.csi.apisan.apisanffe.dto.apisanffe.ModelAvvisoPagamento;
import java.math.BigDecimal;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelElencoPagamenti   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String numeroSportello = null;
  private String numeroRicevuta = null;
  private Date dataRicevuta = null;
  private BigDecimal importoRicevuta = null;
  private ModelAvvisoPagamento avvisoPagamento = null;
  private String iuvMod1 = null;

  /**
   **/
  

  @JsonProperty("numero_sportello") 
 
  public String getNumeroSportello() {
    return numeroSportello;
  }
  public void setNumeroSportello(String numeroSportello) {
    this.numeroSportello = numeroSportello;
  }

  /**
   **/
  

  @JsonProperty("numero_ricevuta") 
 
  public String getNumeroRicevuta() {
    return numeroRicevuta;
  }
  public void setNumeroRicevuta(String numeroRicevuta) {
    this.numeroRicevuta = numeroRicevuta;
  }

  /**
   **/
  

  @JsonProperty("data_ricevuta") 
 
  public Date getDataRicevuta() {
    return dataRicevuta;
  }
  public void setDataRicevuta(Date dataRicevuta) {
    this.dataRicevuta = dataRicevuta;
  }

  /**
   **/
  

  @JsonProperty("importo_ricevuta") 
 
  public BigDecimal getImportoRicevuta() {
    return importoRicevuta;
  }
  public void setImportoRicevuta(BigDecimal importoRicevuta) {
    this.importoRicevuta = importoRicevuta;
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
   **/
  

  @JsonProperty("iuv_mod1") 
 
  public String getIuvMod1() {
    return iuvMod1;
  }
  public void setIuvMod1(String iuvMod1) {
    this.iuvMod1 = iuvMod1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelElencoPagamenti modelElencoPagamenti = (ModelElencoPagamenti) o;
    return Objects.equals(numeroSportello, modelElencoPagamenti.numeroSportello) &&
        Objects.equals(numeroRicevuta, modelElencoPagamenti.numeroRicevuta) &&
        Objects.equals(dataRicevuta, modelElencoPagamenti.dataRicevuta) &&
        Objects.equals(importoRicevuta, modelElencoPagamenti.importoRicevuta) &&
        Objects.equals(avvisoPagamento, modelElencoPagamenti.avvisoPagamento) &&
        Objects.equals(iuvMod1, modelElencoPagamenti.iuvMod1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroSportello, numeroRicevuta, dataRicevuta, importoRicevuta, avvisoPagamento, iuvMod1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelElencoPagamenti {\n");
    
    sb.append("    numeroSportello: ").append(toIndentedString(numeroSportello)).append("\n");
    sb.append("    numeroRicevuta: ").append(toIndentedString(numeroRicevuta)).append("\n");
    sb.append("    dataRicevuta: ").append(toIndentedString(dataRicevuta)).append("\n");
    sb.append("    importoRicevuta: ").append(toIndentedString(importoRicevuta)).append("\n");
    sb.append("    avvisoPagamento: ").append(toIndentedString(avvisoPagamento)).append("\n");
    sb.append("    iuvMod1: ").append(toIndentedString(iuvMod1)).append("\n");
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

