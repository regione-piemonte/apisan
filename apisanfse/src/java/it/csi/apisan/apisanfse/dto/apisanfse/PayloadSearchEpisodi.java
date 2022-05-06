/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelFiltroEpisodi;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadSearchEpisodi   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String applicazioneVerticale = null;
  private ModelFiltroEpisodi filtroEpisodi = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("applicazione_verticale") 
 
  public String getApplicazioneVerticale() {
    return applicazioneVerticale;
  }
  public void setApplicazioneVerticale(String applicazioneVerticale) {
    this.applicazioneVerticale = applicazioneVerticale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("filtro_episodi") 
 
  public ModelFiltroEpisodi getFiltroEpisodi() {
    return filtroEpisodi;
  }
  public void setFiltroEpisodi(ModelFiltroEpisodi filtroEpisodi) {
    this.filtroEpisodi = filtroEpisodi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadSearchEpisodi payloadSearchEpisodi = (PayloadSearchEpisodi) o;
    return Objects.equals(applicazioneVerticale, payloadSearchEpisodi.applicazioneVerticale) &&
        Objects.equals(filtroEpisodi, payloadSearchEpisodi.filtroEpisodi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicazioneVerticale, filtroEpisodi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadSearchEpisodi {\n");
    
    sb.append("    applicazioneVerticale: ").append(toIndentedString(applicazioneVerticale)).append("\n");
    sb.append("    filtroEpisodi: ").append(toIndentedString(filtroEpisodi)).append("\n");
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

