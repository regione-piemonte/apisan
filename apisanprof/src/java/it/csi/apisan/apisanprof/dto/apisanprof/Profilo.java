/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.dto.apisanprof;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanprof.dto.apisanprof.InfoAnagrafiche;
import it.csi.apisan.apisanprof.dto.apisanprof.InfoSanitarie;
import java.math.BigDecimal;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Profilo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private BigDecimal idAura = null;
  private InfoAnagrafiche infoAnag = null;
  private InfoSanitarie infoSan = null;

  /**
   * valutare se mettere o meno idAura del medico
   **/
  
  @ApiModelProperty(value = "valutare se mettere o meno idAura del medico")
  @JsonProperty("idAura") 
 
  public BigDecimal getIdAura() {
    return idAura;
  }
  public void setIdAura(BigDecimal idAura) {
    this.idAura = idAura;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("info_anag") 
 
  public InfoAnagrafiche getInfoAnag() {
    return infoAnag;
  }
  public void setInfoAnag(InfoAnagrafiche infoAnag) {
    this.infoAnag = infoAnag;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("info_san") 
 
  public InfoSanitarie getInfoSan() {
    return infoSan;
  }
  public void setInfoSan(InfoSanitarie infoSan) {
    this.infoSan = infoSan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profilo profilo = (Profilo) o;
    return Objects.equals(idAura, profilo.idAura) &&
        Objects.equals(infoAnag, profilo.infoAnag) &&
        Objects.equals(infoSan, profilo.infoSan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAura, infoAnag, infoSan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profilo {\n");
    
    sb.append("    idAura: ").append(toIndentedString(idAura)).append("\n");
    sb.append("    infoAnag: ").append(toIndentedString(infoAnag)).append("\n");
    sb.append("    infoSan: ").append(toIndentedString(infoSan)).append("\n");
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

