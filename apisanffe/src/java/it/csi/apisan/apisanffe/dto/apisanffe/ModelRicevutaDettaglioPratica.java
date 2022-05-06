/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelRicevutaDettaglioPratica   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String idRicevuta = null;
  private String dataPagamento = null;
  private String stampa = null;

  /**
   * id della ricevuta
   **/
  

  @JsonProperty("id_ricevuta") 
 
  public String getIdRicevuta() {
    return idRicevuta;
  }
  public void setIdRicevuta(String idRicevuta) {
    this.idRicevuta = idRicevuta;
  }

  /**
   * data del pagamento
   **/
  

  @JsonProperty("data_pagamento") 
 
  public String getDataPagamento() {
    return dataPagamento;
  }
  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  /**
   * base64 del file
   **/
  

  @JsonProperty("stampa") 
 
  public String getStampa() {
    return stampa;
  }
  public void setStampa(String stampa) {
    this.stampa = stampa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRicevutaDettaglioPratica modelRicevutaDettaglioPratica = (ModelRicevutaDettaglioPratica) o;
    return Objects.equals(idRicevuta, modelRicevutaDettaglioPratica.idRicevuta) &&
        Objects.equals(dataPagamento, modelRicevutaDettaglioPratica.dataPagamento) &&
        Objects.equals(stampa, modelRicevutaDettaglioPratica.stampa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idRicevuta, dataPagamento, stampa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRicevutaDettaglioPratica {\n");
    
    sb.append("    idRicevuta: ").append(toIndentedString(idRicevuta)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    stampa: ").append(toIndentedString(stampa)).append("\n");
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

