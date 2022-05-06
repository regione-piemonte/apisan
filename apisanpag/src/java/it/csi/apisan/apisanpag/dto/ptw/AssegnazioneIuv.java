/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class AssegnazioneIuv   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Iuvmod3 iuvmod3 = null;
  private Iuvmod1 iuvmod1 = null;

  /**
   * valorizzato con iuv mod.3 assegnato alla pratica  Attenzione: puo essere non valorizzato       
   **/
  
  @ApiModelProperty(value = "valorizzato con iuv mod.3 assegnato alla pratica  Attenzione: puo essere non valorizzato       ")
  @JsonProperty("iuvmod3") 
 
  public Iuvmod3 getIuvmod3() {
    return iuvmod3;
  }
  public void setIuvmod3(Iuvmod3 iuvmod3) {
    this.iuvmod3 = iuvmod3;
  }

  /**
   * valorizzato con iuv mod.1 assegnato alla pratica  Attenzione: puo essere non valorizzato
   **/
  
  @ApiModelProperty(value = "valorizzato con iuv mod.1 assegnato alla pratica  Attenzione: puo essere non valorizzato")
  @JsonProperty("iuvmod1") 
 
  public Iuvmod1 getIuvmod1() {
    return iuvmod1;
  }
  public void setIuvmod1(Iuvmod1 iuvmod1) {
    this.iuvmod1 = iuvmod1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssegnazioneIuv assegnazioneIuv = (AssegnazioneIuv) o;
    return Objects.equals(iuvmod3, assegnazioneIuv.iuvmod3) &&
        Objects.equals(iuvmod1, assegnazioneIuv.iuvmod1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iuvmod3, iuvmod1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssegnazioneIuv {\n");
    
    sb.append("    iuvmod3: ").append(toIndentedString(iuvmod3)).append("\n");
    sb.append("    iuvmod1: ").append(toIndentedString(iuvmod1)).append("\n");
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

