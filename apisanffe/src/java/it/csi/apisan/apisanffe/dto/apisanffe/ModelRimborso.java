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
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelRimborso   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String numeroSportello = null;
  private String numeroRimborso = null;
  private String dataRimborso = null;
  private BigDecimal importoRimborsato = null;
  private String codiceVersamento = null;
  private ModelAvvisoPagamento avvisoPagamento = null;
  private String iuvMod1 = null;
  private String dataEmissione = null;
  private String praticaPagataConCredito = null;

  /**
   **/
  

  @JsonProperty("numero_sportello") 
 
  @NotNull
  public String getNumeroSportello() {
    return numeroSportello;
  }
  public void setNumeroSportello(String numeroSportello) {
    this.numeroSportello = numeroSportello;
  }

  /**
   **/
  

  @JsonProperty("numero_rimborso") 
 
  public String getNumeroRimborso() {
    return numeroRimborso;
  }
  public void setNumeroRimborso(String numeroRimborso) {
    this.numeroRimborso = numeroRimborso;
  }

  /**
   **/
  

  @JsonProperty("data_rimborso") 
 
  @NotNull
  public String getDataRimborso() {
    return dataRimborso;
  }
  public void setDataRimborso(String dataRimborso) {
    this.dataRimborso = dataRimborso;
  }

  /**
   **/
  

  @JsonProperty("importo_rimborsato") 
 
  @NotNull
  public BigDecimal getImportoRimborsato() {
    return importoRimborsato;
  }
  public void setImportoRimborsato(BigDecimal importoRimborsato) {
    this.importoRimborsato = importoRimborsato;
  }

  /**
   **/
  

  @JsonProperty("codice_versamento") 
 
  public String getCodiceVersamento() {
    return codiceVersamento;
  }
  public void setCodiceVersamento(String codiceVersamento) {
    this.codiceVersamento = codiceVersamento;
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

  /**
   **/
  

  @JsonProperty("data_emissione") 
 
  public String getDataEmissione() {
    return dataEmissione;
  }
  public void setDataEmissione(String dataEmissione) {
    this.dataEmissione = dataEmissione;
  }

  /**
   **/
  

  @JsonProperty("pratica_pagata_con_credito") 
 
  public String getPraticaPagataConCredito() {
    return praticaPagataConCredito;
  }
  public void setPraticaPagataConCredito(String praticaPagataConCredito) {
    this.praticaPagataConCredito = praticaPagataConCredito;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRimborso modelRimborso = (ModelRimborso) o;
    return Objects.equals(numeroSportello, modelRimborso.numeroSportello) &&
        Objects.equals(numeroRimborso, modelRimborso.numeroRimborso) &&
        Objects.equals(dataRimborso, modelRimborso.dataRimborso) &&
        Objects.equals(importoRimborsato, modelRimborso.importoRimborsato) &&
        Objects.equals(codiceVersamento, modelRimborso.codiceVersamento) &&
        Objects.equals(avvisoPagamento, modelRimborso.avvisoPagamento) &&
        Objects.equals(iuvMod1, modelRimborso.iuvMod1) &&
        Objects.equals(dataEmissione, modelRimborso.dataEmissione) &&
        Objects.equals(praticaPagataConCredito, modelRimborso.praticaPagataConCredito);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroSportello, numeroRimborso, dataRimborso, importoRimborsato, codiceVersamento, avvisoPagamento, iuvMod1, dataEmissione, praticaPagataConCredito);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRimborso {\n");
    
    sb.append("    numeroSportello: ").append(toIndentedString(numeroSportello)).append("\n");
    sb.append("    numeroRimborso: ").append(toIndentedString(numeroRimborso)).append("\n");
    sb.append("    dataRimborso: ").append(toIndentedString(dataRimborso)).append("\n");
    sb.append("    importoRimborsato: ").append(toIndentedString(importoRimborsato)).append("\n");
    sb.append("    codiceVersamento: ").append(toIndentedString(codiceVersamento)).append("\n");
    sb.append("    avvisoPagamento: ").append(toIndentedString(avvisoPagamento)).append("\n");
    sb.append("    iuvMod1: ").append(toIndentedString(iuvMod1)).append("\n");
    sb.append("    dataEmissione: ").append(toIndentedString(dataEmissione)).append("\n");
    sb.append("    praticaPagataConCredito: ").append(toIndentedString(praticaPagataConCredito)).append("\n");
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

