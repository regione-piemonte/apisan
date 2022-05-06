/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class DateCrit   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Date eq = null;
  private Date ne = null;
  private Date lt = null;
  private Date lte = null;
  private Date gt = null;
  private Date gte = null;
  private List<Date> in = new ArrayList<Date>();
  private List<Date> nin = new ArrayList<Date>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eq") 
 
  public Date getEq() {
    return eq;
  }
  public void setEq(Date eq) {
    this.eq = eq;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ne") 
 
  public Date getNe() {
    return ne;
  }
  public void setNe(Date ne) {
    this.ne = ne;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lt") 
 
  public Date getLt() {
    return lt;
  }
  public void setLt(Date lt) {
    this.lt = lt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lte") 
 
  public Date getLte() {
    return lte;
  }
  public void setLte(Date lte) {
    this.lte = lte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gt") 
 
  public Date getGt() {
    return gt;
  }
  public void setGt(Date gt) {
    this.gt = gt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gte") 
 
  public Date getGte() {
    return gte;
  }
  public void setGte(Date gte) {
    this.gte = gte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("in") 
 
  public List<Date> getIn() {
    return in;
  }
  public void setIn(List<Date> in) {
    this.in = in;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nin") 
 
  public List<Date> getNin() {
    return nin;
  }
  public void setNin(List<Date> nin) {
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
    DateCrit dateCrit = (DateCrit) o;
    return Objects.equals(eq, dateCrit.eq) &&
        Objects.equals(ne, dateCrit.ne) &&
        Objects.equals(lt, dateCrit.lt) &&
        Objects.equals(lte, dateCrit.lte) &&
        Objects.equals(gt, dateCrit.gt) &&
        Objects.equals(gte, dateCrit.gte) &&
        Objects.equals(in, dateCrit.in) &&
        Objects.equals(nin, dateCrit.nin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq, ne, lt, lte, gt, gte, in, nin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateCrit {\n");
    
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

