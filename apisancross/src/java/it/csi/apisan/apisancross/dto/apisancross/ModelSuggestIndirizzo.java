/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancross.dto.apisancross;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisancross.dto.apisancross.FeatureCollection;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelSuggestIndirizzo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer id = null;
  private String name = null;
  private List<String> catalogs = new ArrayList<String>();
  private FeatureCollection featureCollection = null;

  /**
   * id del catalogo
   **/
  
  @ApiModelProperty(value = "id del catalogo")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * nome del catalogo
   **/
  
  @ApiModelProperty(value = "nome del catalogo")
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
    ModelSuggestIndirizzo modelSuggestIndirizzo = (ModelSuggestIndirizzo) o;
    return Objects.equals(id, modelSuggestIndirizzo.id) &&
        Objects.equals(name, modelSuggestIndirizzo.name) &&
        Objects.equals(catalogs, modelSuggestIndirizzo.catalogs) &&
        Objects.equals(featureCollection, modelSuggestIndirizzo.featureCollection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, catalogs, featureCollection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelSuggestIndirizzo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

