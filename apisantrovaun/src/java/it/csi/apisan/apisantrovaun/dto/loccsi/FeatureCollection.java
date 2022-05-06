/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisantrovaun.dto.loccsi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class FeatureCollection   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String type = null;
  private List<Feature> features = new ArrayList<Feature>();
  private Crs crs = null;
  private List<String> bbox = new ArrayList<String>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type") 
 
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("features") 
 
  public List<Feature> getFeatures() {
    return features;
  }
  public void setFeatures(List<Feature> features) {
    this.features = features;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("crs") 
 
  public Crs getCrs() {
    return crs;
  }
  public void setCrs(Crs crs) {
    this.crs = crs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bbox") 
 
  public List<String> getBbox() {
    return bbox;
  }
  public void setBbox(List<String> bbox) {
    this.bbox = bbox;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureCollection featureCollection = (FeatureCollection) o;
    return Objects.equals(type, featureCollection.type) &&
        Objects.equals(features, featureCollection.features) &&
        Objects.equals(crs, featureCollection.crs) &&
        Objects.equals(bbox, featureCollection.bbox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, features, crs, bbox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureCollection {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    crs: ").append(toIndentedString(crs)).append("\n");
    sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
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

