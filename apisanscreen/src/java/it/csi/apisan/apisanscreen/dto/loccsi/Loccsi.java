/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.loccsi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Loccsi   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer id = null;
  private String name = null;
  private String description = null;
  private List<String> catalogs = new ArrayList<String>();
  private FeatureCollection featureCollection = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name") 
 
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description") 
 
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("catalogs") 
 
  public List<String> getCatalogs() {
    return catalogs;
  }
  public void setCatalogs(List<String> catalogs) {
    this.catalogs = catalogs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("featureCollection") 
 
  public FeatureCollection getFeatureCollection() {
    return featureCollection;
  }
  public void setFeatureCollection(FeatureCollection featureCollection) {
    this.featureCollection = featureCollection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Loccsi loccsi = (Loccsi) o;
    return Objects.equals(id, loccsi.id) &&
        Objects.equals(name, loccsi.name) &&
        Objects.equals(description, loccsi.description) &&
        Objects.equals(catalogs, loccsi.catalogs) &&
        Objects.equals(featureCollection, loccsi.featureCollection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, catalogs, featureCollection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Loccsi {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    catalogs: ").append(toIndentedString(catalogs)).append("\n");
    sb.append("    featureCollection: ").append(toIndentedString(featureCollection)).append("\n");
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

