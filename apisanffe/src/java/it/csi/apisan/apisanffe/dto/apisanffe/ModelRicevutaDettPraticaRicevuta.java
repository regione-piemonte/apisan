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

public class ModelRicevutaDettPraticaRicevuta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String idRt = null;
  private String dataPagamento = null;
  private String stampa = null;

  /**
   * id rt
   **/
  

  @JsonProperty("id_rt") 
 
  public String getIdRt() {
    return idRt;
  }
  public void setIdRt(String idRt) {
    this.idRt = idRt;
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
   * base64 della stampa
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
    ModelRicevutaDettPraticaRicevuta modelRicevutaDettPraticaRicevuta = (ModelRicevutaDettPraticaRicevuta) o;
    return Objects.equals(idRt, modelRicevutaDettPraticaRicevuta.idRt) &&
        Objects.equals(dataPagamento, modelRicevutaDettPraticaRicevuta.dataPagamento) &&
        Objects.equals(stampa, modelRicevutaDettPraticaRicevuta.stampa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idRt, dataPagamento, stampa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRicevutaDettPraticaRicevuta {\n");
    
    sb.append("    idRt: ").append(toIndentedString(idRt)).append("\n");
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

