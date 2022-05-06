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



public class ModelFarmaco   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Long id = null;
  private String farmaco = null;
  private String quantita = null;
  private Date dataAssunzione = null;
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
   * La descrizione del farmaco inserita dall&#39;utente
   **/
  
  @ApiModelProperty(value = "La descrizione del farmaco inserita dall'utente")
  @JsonProperty("farmaco") 
 
  public String getFarmaco() {
    return farmaco;
  }
  public void setFarmaco(String farmaco) {
    this.farmaco = farmaco;
  }

  /**
   * La quantità in forma descrittiva inserita dall&#39;utente
   **/
  
  @ApiModelProperty(value = "La quantità in forma descrittiva inserita dall'utente")
  @JsonProperty("quantita") 
 
  public String getQuantita() {
    return quantita;
  }
  public void setQuantita(String quantita) {
    this.quantita = quantita;
  }

  /**
   * La data di assunzione del farmaco inserita dall&#39;utente
   **/
  
  @ApiModelProperty(value = "La data di assunzione del farmaco inserita dall'utente")
  @JsonProperty("data_assunzione") 
 
  public Date getDataAssunzione() {
    return dataAssunzione;
  }
  public void setDataAssunzione(Date dataAssunzione) {
    this.dataAssunzione = dataAssunzione;
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
    ModelFarmaco modelFarmaco = (ModelFarmaco) o;
    return Objects.equals(id, modelFarmaco.id) &&
        Objects.equals(farmaco, modelFarmaco.farmaco) &&
        Objects.equals(quantita, modelFarmaco.quantita) &&
        Objects.equals(dataAssunzione, modelFarmaco.dataAssunzione) &&
        Objects.equals(dataCreazione, modelFarmaco.dataCreazione) &&
        Objects.equals(dataAggiornamento, modelFarmaco.dataAggiornamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, farmaco, quantita, dataAssunzione, dataCreazione, dataAggiornamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelFarmaco {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    farmaco: ").append(toIndentedString(farmaco)).append("\n");
    sb.append("    quantita: ").append(toIndentedString(quantita)).append("\n");
    sb.append("    dataAssunzione: ").append(toIndentedString(dataAssunzione)).append("\n");
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

