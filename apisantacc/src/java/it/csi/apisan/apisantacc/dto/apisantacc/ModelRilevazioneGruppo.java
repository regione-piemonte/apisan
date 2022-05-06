/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantacc.dto.apisantacc;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelRilevazioneGruppo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codice = null;
  private String descrizione = null;
  private String descrizioneEstesa = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("codice") 
 
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Nome del gruppo
   **/
  
  @ApiModelProperty(value = "Nome del gruppo")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Descrizione estesa del gruppo
   **/
  
  @ApiModelProperty(value = "Descrizione estesa del gruppo")
  @JsonProperty("descrizione_estesa") 
 
  public String getDescrizioneEstesa() {
    return descrizioneEstesa;
  }
  public void setDescrizioneEstesa(String descrizioneEstesa) {
    this.descrizioneEstesa = descrizioneEstesa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRilevazioneGruppo modelRilevazioneGruppo = (ModelRilevazioneGruppo) o;
    return Objects.equals(codice, modelRilevazioneGruppo.codice) &&
        Objects.equals(descrizione, modelRilevazioneGruppo.descrizione) &&
        Objects.equals(descrizioneEstesa, modelRilevazioneGruppo.descrizioneEstesa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, descrizioneEstesa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRilevazioneGruppo {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    descrizioneEstesa: ").append(toIndentedString(descrizioneEstesa)).append("\n");
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

