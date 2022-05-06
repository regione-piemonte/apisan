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

public class ModelEsitoDettPraticaRicevuta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String idEsito = null;
  private String dataPagamento = null;
  private String stampa = null;

  /**
   * id esito
   **/
  

  @JsonProperty("id_esito") 
 
  public String getIdEsito() {
    return idEsito;
  }
  public void setIdEsito(String idEsito) {
    this.idEsito = idEsito;
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
   * base64 della daat di pagamento
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
    ModelEsitoDettPraticaRicevuta modelEsitoDettPraticaRicevuta = (ModelEsitoDettPraticaRicevuta) o;
    return Objects.equals(idEsito, modelEsitoDettPraticaRicevuta.idEsito) &&
        Objects.equals(dataPagamento, modelEsitoDettPraticaRicevuta.dataPagamento) &&
        Objects.equals(stampa, modelEsitoDettPraticaRicevuta.stampa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEsito, dataPagamento, stampa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEsitoDettPraticaRicevuta {\n");
    
    sb.append("    idEsito: ").append(toIndentedString(idEsito)).append("\n");
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

