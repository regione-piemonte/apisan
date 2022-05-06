/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelLinkImmagine   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String accessionNumber = null;
  private String objectNumber = null;
  private String series = null;
  private String study = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accession_number") 
 
  public String getAccessionNumber() {
    return accessionNumber;
  }
  public void setAccessionNumber(String accessionNumber) {
    this.accessionNumber = accessionNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("object_number") 
 
  public String getObjectNumber() {
    return objectNumber;
  }
  public void setObjectNumber(String objectNumber) {
    this.objectNumber = objectNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("series") 
 
  public String getSeries() {
    return series;
  }
  public void setSeries(String series) {
    this.series = series;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("study") 
 
  public String getStudy() {
    return study;
  }
  public void setStudy(String study) {
    this.study = study;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelLinkImmagine modelLinkImmagine = (ModelLinkImmagine) o;
    return Objects.equals(accessionNumber, modelLinkImmagine.accessionNumber) &&
        Objects.equals(objectNumber, modelLinkImmagine.objectNumber) &&
        Objects.equals(series, modelLinkImmagine.series) &&
        Objects.equals(study, modelLinkImmagine.study);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessionNumber, objectNumber, series, study);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelLinkImmagine {\n");
    
    sb.append("    accessionNumber: ").append(toIndentedString(accessionNumber)).append("\n");
    sb.append("    objectNumber: ").append(toIndentedString(objectNumber)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    study: ").append(toIndentedString(study)).append("\n");
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

