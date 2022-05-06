/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Decodifiche   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String campo = null;
  private String valore = null;
  private String decodifica = null;

  /**
   * Raggruppa per tipologia i valori e le relative decodifiche.
   **/
  
  @ApiModelProperty(value = "Raggruppa per tipologia i valori e le relative decodifiche.")
  @JsonProperty("campo") 
 
  public String getCampo() {
    return campo;
  }
  public void setCampo(String campo) {
    this.campo = campo;
  }

  /**
   * Valore che può assumere il campo.
   **/
  
  @ApiModelProperty(value = "Valore che può assumere il campo.")
  @JsonProperty("valore") 
 
  public String getValore() {
    return valore;
  }
  public void setValore(String valore) {
    this.valore = valore;
  }

  /**
   * Decodifica del valore.
   **/
  
  @ApiModelProperty(value = "Decodifica del valore.")
  @JsonProperty("decodifica") 
 
  public String getDecodifica() {
    return decodifica;
  }
  public void setDecodifica(String decodifica) {
    this.decodifica = decodifica;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Decodifiche decodifiche = (Decodifiche) o;
    return Objects.equals(campo, decodifiche.campo) &&
        Objects.equals(valore, decodifiche.valore) &&
        Objects.equals(decodifica, decodifiche.decodifica);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campo, valore, decodifica);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Decodifiche {\n");
    
    sb.append("    campo: ").append(toIndentedString(campo)).append("\n");
    sb.append("    valore: ").append(toIndentedString(valore)).append("\n");
    sb.append("    decodifica: ").append(toIndentedString(decodifica)).append("\n");
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

