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



public class ModelSintomo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Long id = null;
  private String descrizione = null;
  private String areaInteressata = null;
  private Date dataInizio = null;
  private Date dataFine = null;
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
   * L&#39;area interessata inserita dall&#39;utente
   **/
  
  @ApiModelProperty(value = "L'area interessata inserita dall'utente")
  @JsonProperty("area_interessata") 
 
  public String getAreaInteressata() {
    return areaInteressata;
  }
  public void setAreaInteressata(String areaInteressata) {
    this.areaInteressata = areaInteressata;
  }

  /**
   * La data di inizio del dolore
   **/
  
  @ApiModelProperty(value = "La data di inizio del dolore")
  @JsonProperty("data_inizio") 
 
  public Date getDataInizio() {
    return dataInizio;
  }
  public void setDataInizio(Date dataInizio) {
    this.dataInizio = dataInizio;
  }

  /**
   * La data di inizio del dolore
   **/
  
  @ApiModelProperty(value = "La data di inizio del dolore")
  @JsonProperty("data_fine") 
 
  public Date getDataFine() {
    return dataFine;
  }
  public void setDataFine(Date dataFine) {
    this.dataFine = dataFine;
  }

  /**
   * La data dell&#39;ultimo aggiornamento
   **/
  
  @ApiModelProperty(value = "La data dell'ultimo aggiornamento")
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
    ModelSintomo modelSintomo = (ModelSintomo) o;
    return Objects.equals(id, modelSintomo.id) &&
        Objects.equals(descrizione, modelSintomo.descrizione) &&
        Objects.equals(areaInteressata, modelSintomo.areaInteressata) &&
        Objects.equals(dataInizio, modelSintomo.dataInizio) &&
        Objects.equals(dataFine, modelSintomo.dataFine) &&
        Objects.equals(dataCreazione, modelSintomo.dataCreazione) &&
        Objects.equals(dataAggiornamento, modelSintomo.dataAggiornamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descrizione, areaInteressata, dataInizio, dataFine, dataCreazione, dataAggiornamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelSintomo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    areaInteressata: ").append(toIndentedString(areaInteressata)).append("\n");
    sb.append("    dataInizio: ").append(toIndentedString(dataInizio)).append("\n");
    sb.append("    dataFine: ").append(toIndentedString(dataFine)).append("\n");
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

