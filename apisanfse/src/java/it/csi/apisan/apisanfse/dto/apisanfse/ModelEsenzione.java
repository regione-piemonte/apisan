/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelEsenzioneEsenzioni;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelEsenzione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String oscuramentoEsenzioni = null;
  private List<ModelEsenzioneEsenzioni> esenzioni = new ArrayList<ModelEsenzioneEsenzioni>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("oscuramento_esenzioni") 
 
  public String getOscuramentoEsenzioni() {
    return oscuramentoEsenzioni;
  }
  public void setOscuramentoEsenzioni(String oscuramentoEsenzioni) {
    this.oscuramentoEsenzioni = oscuramentoEsenzioni;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("esenzioni") 
 
  public List<ModelEsenzioneEsenzioni> getEsenzioni() {
    return esenzioni;
  }
  public void setEsenzioni(List<ModelEsenzioneEsenzioni> esenzioni) {
    this.esenzioni = esenzioni;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelEsenzione modelEsenzione = (ModelEsenzione) o;
    return Objects.equals(oscuramentoEsenzioni, modelEsenzione.oscuramentoEsenzioni) &&
        Objects.equals(esenzioni, modelEsenzione.esenzioni);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oscuramentoEsenzioni, esenzioni);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelEsenzione {\n");
    
    sb.append("    oscuramentoEsenzioni: ").append(toIndentedString(oscuramentoEsenzioni)).append("\n");
    sb.append("    esenzioni: ").append(toIndentedString(esenzioni)).append("\n");
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

