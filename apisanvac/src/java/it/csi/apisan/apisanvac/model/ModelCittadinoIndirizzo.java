/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta un indirizzo del cittadino ")

public class ModelCittadinoIndirizzo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String indirizzo = null;
  private String cap = null;
  private String comune = null;
  private String dataInizio = null;
  private String dataFine = null;

  /**
   * L&#39;indirizzo
   **/
  
  @ApiModelProperty(example = "Via Roma, 12", required = true, value = "L'indirizzo")
  @JsonProperty("indirizzo") 
 
  @NotNull
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   * Il CAP di appartenenza dell&#39;indirizzo
   **/
  
  @ApiModelProperty(example = "12100", required = true, value = "Il CAP di appartenenza dell'indirizzo")
  @JsonProperty("cap") 
 
  @NotNull
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   * Il comune di appartenenza dell&#39;indirizzo
   **/
  
  @ApiModelProperty(example = "Cuneo", required = true, value = "Il comune di appartenenza dell'indirizzo")
  @JsonProperty("comune") 
 
  @NotNull
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", required = true, value = "")
  @JsonProperty("data_inizio") 
 
  @NotNull
  public String getDataInizio() {
    return dataInizio;
  }
  public void setDataInizio(String dataInizio) {
    this.dataInizio = dataInizio;
  }

  /**
   **/
  
  @ApiModelProperty(example = "2021-11-08T09:21:38.739Z", required = true, value = "")
  @JsonProperty("data_fine") 
 
  @NotNull
  public String getDataFine() {
    return dataFine;
  }
  public void setDataFine(String dataFine) {
    this.dataFine = dataFine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCittadinoIndirizzo modelCittadinoIndirizzo = (ModelCittadinoIndirizzo) o;
    return Objects.equals(indirizzo, modelCittadinoIndirizzo.indirizzo) &&
        Objects.equals(cap, modelCittadinoIndirizzo.cap) &&
        Objects.equals(comune, modelCittadinoIndirizzo.comune) &&
        Objects.equals(dataInizio, modelCittadinoIndirizzo.dataInizio) &&
        Objects.equals(dataFine, modelCittadinoIndirizzo.dataFine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indirizzo, cap, comune, dataInizio, dataFine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCittadinoIndirizzo {\n");
    
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    dataInizio: ").append(toIndentedString(dataInizio)).append("\n");
    sb.append("    dataFine: ").append(toIndentedString(dataFine)).append("\n");
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

