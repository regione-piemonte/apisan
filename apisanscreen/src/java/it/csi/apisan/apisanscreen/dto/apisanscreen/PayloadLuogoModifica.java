/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadLuogoModifica   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codComune = null;
  private String cap = null;
  private String indirizzo = null;
  private String civico = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cod_comune") 
 
  public String getCodComune() {
    return codComune;
  }
  public void setCodComune(String codComune) {
    this.codComune = codComune;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cap") 
 
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("civico") 
 
  public String getCivico() {
    return civico;
  }
  public void setCivico(String civico) {
    this.civico = civico;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadLuogoModifica payloadLuogoModifica = (PayloadLuogoModifica) o;
    return Objects.equals(codComune, payloadLuogoModifica.codComune) &&
        Objects.equals(cap, payloadLuogoModifica.cap) &&
        Objects.equals(indirizzo, payloadLuogoModifica.indirizzo) &&
        Objects.equals(civico, payloadLuogoModifica.civico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codComune, cap, indirizzo, civico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadLuogoModifica {\n");
    
    sb.append("    codComune: ").append(toIndentedString(codComune)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    civico: ").append(toIndentedString(civico)).append("\n");
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

