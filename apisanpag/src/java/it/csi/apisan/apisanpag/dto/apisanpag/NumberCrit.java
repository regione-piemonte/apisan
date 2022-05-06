/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class NumberCrit   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private BigDecimal eq = null;
  private BigDecimal ne = null;
  private BigDecimal lt = null;
  private BigDecimal lte = null;
  private BigDecimal gt = null;
  private BigDecimal gte = null;
  private List<BigDecimal> in = new ArrayList<BigDecimal>();
  private List<BigDecimal> nin = new ArrayList<BigDecimal>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eq") 
 
  public BigDecimal getEq() {
    return eq;
  }
  public void setEq(BigDecimal eq) {
    this.eq = eq;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ne") 
 
  public BigDecimal getNe() {
    return ne;
  }
  public void setNe(BigDecimal ne) {
    this.ne = ne;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lt") 
 
  public BigDecimal getLt() {
    return lt;
  }
  public void setLt(BigDecimal lt) {
    this.lt = lt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lte") 
 
  public BigDecimal getLte() {
    return lte;
  }
  public void setLte(BigDecimal lte) {
    this.lte = lte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gt") 
 
  public BigDecimal getGt() {
    return gt;
  }
  public void setGt(BigDecimal gt) {
    this.gt = gt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gte") 
 
  public BigDecimal getGte() {
    return gte;
  }
  public void setGte(BigDecimal gte) {
    this.gte = gte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("in") 
 
  public List<BigDecimal> getIn() {
    return in;
  }
  public void setIn(List<BigDecimal> in) {
    this.in = in;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nin") 
 
  public List<BigDecimal> getNin() {
    return nin;
  }
  public void setNin(List<BigDecimal> nin) {
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
    NumberCrit numberCrit = (NumberCrit) o;
    return Objects.equals(eq, numberCrit.eq) &&
        Objects.equals(ne, numberCrit.ne) &&
        Objects.equals(lt, numberCrit.lt) &&
        Objects.equals(lte, numberCrit.lte) &&
        Objects.equals(gt, numberCrit.gt) &&
        Objects.equals(gte, numberCrit.gte) &&
        Objects.equals(in, numberCrit.in) &&
        Objects.equals(nin, numberCrit.nin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq, ne, lt, lte, gt, gte, in, nin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberCrit {\n");
    
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    ne: ").append(toIndentedString(ne)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
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

