/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelTicketPagatoRicevutaPagamento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private Date dataPagamento = null;
  private String rtId = null;
  private String esitoId = null;

  /**
   * Id univoco
   **/
  

  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * La data in cui è stato effettuato il pagamento
   **/
  

  @JsonProperty("data_pagamento") 
 
  public Date getDataPagamento() {
    return dataPagamento;
  }
  public void setDataPagamento(Date dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  /**
   * identificativo della Ricevuta Telematica generata a seguito del pagamento del modello 1 e 3 (Esito di pagamento contenuto nella RT) 
   **/
  

  @JsonProperty("rt_id") 
 
  public String getRtId() {
    return rtId;
  }
  public void setRtId(String rtId) {
    this.rtId = rtId;
  }

  /**
   * identificativo dell’esiti di pagamento generato a seguito del pagamento del modello 3 (che secondo le specifiche AgID posso essere create senza Richieste di Pagamento Telematico) 
   **/
  

  @JsonProperty("esito_id") 
 
  public String getEsitoId() {
    return esitoId;
  }
  public void setEsitoId(String esitoId) {
    this.esitoId = esitoId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelTicketPagatoRicevutaPagamento modelTicketPagatoRicevutaPagamento = (ModelTicketPagatoRicevutaPagamento) o;
    return Objects.equals(id, modelTicketPagatoRicevutaPagamento.id) &&
        Objects.equals(dataPagamento, modelTicketPagatoRicevutaPagamento.dataPagamento) &&
        Objects.equals(rtId, modelTicketPagatoRicevutaPagamento.rtId) &&
        Objects.equals(esitoId, modelTicketPagatoRicevutaPagamento.esitoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataPagamento, rtId, esitoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelTicketPagatoRicevutaPagamento {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    rtId: ").append(toIndentedString(rtId)).append("\n");
    sb.append("    esitoId: ").append(toIndentedString(esitoId)).append("\n");
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

