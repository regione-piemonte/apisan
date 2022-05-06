/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.dto.apisancons;

import java.util.Objects;
import java.util.UUID;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class ConsensoAsr   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private TipoAsr tipoAsr = null;
  private ValoreConsenso valoreConsenso = null;
  private UUID uuid = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tipo_asr") 
 
  public TipoAsr getTipoAsr() {
    return tipoAsr;
  }
  public void setTipoAsr(TipoAsr tipoAsr) {
    this.tipoAsr = tipoAsr;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("valore_consenso") 
 
  public ValoreConsenso getValoreConsenso() {
    return valoreConsenso;
  }
  public void setValoreConsenso(ValoreConsenso valoreConsenso) {
    this.valoreConsenso = valoreConsenso;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uuid") 
 
  public UUID getUuid() {
    return uuid;
  }
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsensoAsr consensoAsr = (ConsensoAsr) o;
    return Objects.equals(tipoAsr, consensoAsr.tipoAsr) &&
        Objects.equals(valoreConsenso, consensoAsr.valoreConsenso) &&
        Objects.equals(uuid, consensoAsr.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoAsr, valoreConsenso, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsensoAsr {\n");
    
    sb.append("    tipoAsr: ").append(toIndentedString(tipoAsr)).append("\n");
    sb.append("    valoreConsenso: ").append(toIndentedString(valoreConsenso)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

