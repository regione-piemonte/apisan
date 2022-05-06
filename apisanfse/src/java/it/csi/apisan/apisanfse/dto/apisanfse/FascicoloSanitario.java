/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class FascicoloSanitario   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Boolean arruolabile = null;
  private Boolean aperto = null;
  private Consenso autorizzazioni = null;

  /**
   * Il soggetto autenticato è in condizione di poter aprire il proprio FSE
   **/
  
  @ApiModelProperty(value = "Il soggetto autenticato è in condizione di poter aprire il proprio FSE")
  @JsonProperty("arruolabile") 
 
  public Boolean isArruolabile() {
    return arruolabile;
  }
  public void setArruolabile(Boolean arruolabile) {
    this.arruolabile = arruolabile;
  }

  /**
   * indica se il fascicolo sanitario è aperto o meno
   **/
  
  @ApiModelProperty(value = "indica se il fascicolo sanitario è aperto o meno")
  @JsonProperty("aperto") 
 
  public Boolean isAperto() {
    return aperto;
  }
  public void setAperto(Boolean aperto) {
    this.aperto = aperto;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("autorizzazioni") 
 
  public Consenso getAutorizzazioni() {
    return autorizzazioni;
  }
  public void setAutorizzazioni(Consenso autorizzazioni) {
    this.autorizzazioni = autorizzazioni;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FascicoloSanitario fascicoloSanitario = (FascicoloSanitario) o;
    return Objects.equals(arruolabile, fascicoloSanitario.arruolabile) &&
        Objects.equals(aperto, fascicoloSanitario.aperto) &&
        Objects.equals(autorizzazioni, fascicoloSanitario.autorizzazioni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arruolabile, aperto, autorizzazioni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FascicoloSanitario {\n");
    
    sb.append("    arruolabile: ").append(toIndentedString(arruolabile)).append("\n");
    sb.append("    aperto: ").append(toIndentedString(aperto)).append("\n");
    sb.append("    autorizzazioni: ").append(toIndentedString(autorizzazioni)).append("\n");
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

