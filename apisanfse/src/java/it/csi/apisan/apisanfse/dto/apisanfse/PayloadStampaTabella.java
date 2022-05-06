/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadStampaTabella   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private List<String> colonne = new ArrayList<String>();
  private List<List<String>> dati = new ArrayList<List<String>>();

  /**
   * L&#39;elenco delle colonne ordinato
   **/
  
  @ApiModelProperty(value = "L'elenco delle colonne ordinato")
  @JsonProperty("colonne") 
 
  public List<String> getColonne() {
    return colonne;
  }
  public void setColonne(List<String> colonne) {
    this.colonne = colonne;
  }

  /**
   * L&#39;elenco delle righe
   **/
  
  @ApiModelProperty(value = "L'elenco delle righe")
  @JsonProperty("dati") 
 
  public List<List<String>> getDati() {
    return dati;
  }
  public void setDati(List<List<String>> dati) {
    this.dati = dati;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadStampaTabella payloadStampaTabella = (PayloadStampaTabella) o;
    return Objects.equals(colonne, payloadStampaTabella.colonne) &&
        Objects.equals(dati, payloadStampaTabella.dati);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colonne, dati);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadStampaTabella {\n");
    
    sb.append("    colonne: ").append(toIndentedString(colonne)).append("\n");
    sb.append("    dati: ").append(toIndentedString(dati)).append("\n");
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

