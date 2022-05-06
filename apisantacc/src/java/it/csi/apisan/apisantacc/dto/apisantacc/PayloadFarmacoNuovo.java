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



public class PayloadFarmacoNuovo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String farmaco = null;
  private String quantita = null;
  private Date dataAssunzione = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadFarmacoNuovo payloadFarmacoNuovo = (PayloadFarmacoNuovo) o;
    return Objects.equals(farmaco, payloadFarmacoNuovo.farmaco) &&
        Objects.equals(quantita, payloadFarmacoNuovo.quantita) &&
        Objects.equals(dataAssunzione, payloadFarmacoNuovo.dataAssunzione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(farmaco, quantita, dataAssunzione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadFarmacoNuovo {\n");
    
    sb.append("    farmaco: ").append(toIndentedString(farmaco)).append("\n");
    sb.append("    quantita: ").append(toIndentedString(quantita)).append("\n");
    sb.append("    dataAssunzione: ").append(toIndentedString(dataAssunzione)).append("\n");
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

