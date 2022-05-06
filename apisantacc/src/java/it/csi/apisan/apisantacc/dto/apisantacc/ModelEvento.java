/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelEvento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Long id = null;
  private String descrizione = null;
  private Date data = null;
  private Date dataCreazione = null;
  private Date dataAggiornamento = null;

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(value = "Identificativo univoco")
  @JsonProperty("id") 
 
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * La descrizione inserita dall&#39;utente
   **/
  
  @ApiModelProperty(value = "La descrizione inserita dall'utente")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * La data dell&#39;evento inserita dall&#39;utente
   **/
  
  @ApiModelProperty(value = "La data dell'evento inserita dall'utente")
  @JsonProperty("data") 
 
  public Date getData() {
    return data;
  }
  public void setData(Date data) {
    this.data = data;
  }

  /**
   * La data di creazione
   **/
  
  @ApiModelProperty(value = "La data di creazione")
  @JsonProperty("data_creazione") 
 
  public Date getDataCreazione() {
    return dataCreazione;
  }
  public void setDataCreazione(Date dataCreazione) {
    this.dataCreazione = dataCreazione;
  }

  /**
   * La data dell&#39;ultimo aggiornamento
   **/
  
  @ApiModelProperty(value = "La data dell'ultimo aggiornamento")
  @JsonProperty("data_aggiornamento") 
 
  public Date getDataAggiornamento() {
    return dataAggiornamento;
  }
  public void setDataAggiornamento(Date dataAggiornamento) {
    this.dataAggiornamento = dataAggiornamento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEvento modelEvento = (ModelEvento) o;
    return Objects.equals(id, modelEvento.id) &&
        Objects.equals(descrizione, modelEvento.descrizione) &&
        Objects.equals(data, modelEvento.data) &&
        Objects.equals(dataCreazione, modelEvento.dataCreazione) &&
        Objects.equals(dataAggiornamento, modelEvento.dataAggiornamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descrizione, data, dataCreazione, dataAggiornamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEvento {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dataCreazione: ").append(toIndentedString(dataCreazione)).append("\n");
    sb.append("    dataAggiornamento: ").append(toIndentedString(dataAggiornamento)).append("\n");
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

