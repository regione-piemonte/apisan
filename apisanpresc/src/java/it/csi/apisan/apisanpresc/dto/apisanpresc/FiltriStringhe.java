/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.dto.apisanpresc;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class FiltriStringhe   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String eq = null;
  private String ne = null;
  private List<String> in = new ArrayList<String>();
  private List<String> nin = new ArrayList<String>();

  /**
   * Equal (&#x3D;)
   **/
  
  @ApiModelProperty(value = "Equal (=)")
  @JsonProperty("eq") 
 
  public String getEq() {
    return eq;
  }
  public void setEq(String eq) {
    this.eq = eq;
  }

  /**
   * Not Equal (&lt;&gt;)
   **/
  
  @ApiModelProperty(value = "Not Equal (<>)")
  @JsonProperty("ne") 
 
  public String getNe() {
    return ne;
  }
  public void setNe(String ne) {
    this.ne = ne;
  }

  /**
   * In Array
   **/
  
  @ApiModelProperty(value = "In Array")
  @JsonProperty("in") 
 
  public List<String> getIn() {
    return in;
  }
  public void setIn(List<String> in) {
    this.in = in;
  }

  /**
   * Not In Array
   **/
  
  @ApiModelProperty(value = "Not In Array")
  @JsonProperty("nin") 
 
  public List<String> getNin() {
    return nin;
  }
  public void setNin(List<String> nin) {
    this.nin = nin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltriStringhe filtriStringhe = (FiltriStringhe) o;
    return Objects.equals(eq, filtriStringhe.eq) &&
        Objects.equals(ne, filtriStringhe.ne) &&
        Objects.equals(in, filtriStringhe.in) &&
        Objects.equals(nin, filtriStringhe.nin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq, ne, in, nin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltriStringhe {\n");
    
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    ne: ").append(toIndentedString(ne)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    nin: ").append(toIndentedString(nin)).append("\n");
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

