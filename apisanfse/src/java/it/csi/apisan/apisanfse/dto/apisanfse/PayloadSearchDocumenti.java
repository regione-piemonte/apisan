/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanfse.dto.apisanfse.ModelFiltroDocs;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadSearchDocumenti   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  

  /**
   * Gets or Sets area
   */
  public enum AreaEnum {
    ROSSA("ROSSA");
    private String value;

    AreaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private AreaEnum area = null;
  private String applicazioneVerticale = null;
  private ModelFiltroDocs filtroDocs = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("area") 
 
  public AreaEnum getArea() {
    return area;
  }
  public void setArea(AreaEnum area) {
    this.area = area;
  }

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
  @JsonProperty("filtro_docs") 
 
  public ModelFiltroDocs getFiltroDocs() {
    return filtroDocs;
  }
  public void setFiltroDocs(ModelFiltroDocs filtroDocs) {
    this.filtroDocs = filtroDocs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadSearchDocumenti payloadSearchDocumenti = (PayloadSearchDocumenti) o;
    return Objects.equals(area, payloadSearchDocumenti.area) &&
        Objects.equals(applicazioneVerticale, payloadSearchDocumenti.applicazioneVerticale) &&
        Objects.equals(filtroDocs, payloadSearchDocumenti.filtroDocs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(area, applicazioneVerticale, filtroDocs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadSearchDocumenti {\n");
    
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    applicazioneVerticale: ").append(toIndentedString(applicazioneVerticale)).append("\n");
    sb.append("    filtroDocs: ").append(toIndentedString(filtroDocs)).append("\n");
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

