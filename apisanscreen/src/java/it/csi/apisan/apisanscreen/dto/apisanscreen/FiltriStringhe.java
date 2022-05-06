/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class FiltriStringhe   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String eq = null;
  private String ne = null;
  private String lt = null;
  private String lte = null;
  private String gt = null;
  private String gte = null;
  private List<String> in = new ArrayList<String>();
  private List<String> nin = new ArrayList<String>();
  private String c = null;
  private String ci = null;
  private String s = null;
  private String si = null;
  private String e = null;
  private String ei = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eq") 
 
  public String getEq() {
    return eq;
  }
  public void setEq(String eq) {
    this.eq = eq;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ne") 
 
  public String getNe() {
    return ne;
  }
  public void setNe(String ne) {
    this.ne = ne;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lt") 
 
  public String getLt() {
    return lt;
  }
  public void setLt(String lt) {
    this.lt = lt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lte") 
 
  public String getLte() {
    return lte;
  }
  public void setLte(String lte) {
    this.lte = lte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gt") 
 
  public String getGt() {
    return gt;
  }
  public void setGt(String gt) {
    this.gt = gt;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gte") 
 
  public String getGte() {
    return gte;
  }
  public void setGte(String gte) {
    this.gte = gte;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("in") 
 
  public List<String> getIn() {
    return in;
  }
  public void setIn(List<String> in) {
    this.in = in;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nin") 
 
  public List<String> getNin() {
    return nin;
  }
  public void setNin(List<String> nin) {
    this.nin = nin;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("c") 
 
  public String getC() {
    return c;
  }
  public void setC(String c) {
    this.c = c;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ci") 
 
  public String getCi() {
    return ci;
  }
  public void setCi(String ci) {
    this.ci = ci;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("s") 
 
  public String getS() {
    return s;
  }
  public void setS(String s) {
    this.s = s;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("si") 
 
  public String getSi() {
    return si;
  }
  public void setSi(String si) {
    this.si = si;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("e") 
 
  public String getE() {
    return e;
  }
  public void setE(String e) {
    this.e = e;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ei") 
 
  public String getEi() {
    return ei;
  }
  public void setEi(String ei) {
    this.ei = ei;
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
        Objects.equals(lt, filtriStringhe.lt) &&
        Objects.equals(lte, filtriStringhe.lte) &&
        Objects.equals(gt, filtriStringhe.gt) &&
        Objects.equals(gte, filtriStringhe.gte) &&
        Objects.equals(in, filtriStringhe.in) &&
        Objects.equals(nin, filtriStringhe.nin) &&
        Objects.equals(c, filtriStringhe.c) &&
        Objects.equals(ci, filtriStringhe.ci) &&
        Objects.equals(s, filtriStringhe.s) &&
        Objects.equals(si, filtriStringhe.si) &&
        Objects.equals(e, filtriStringhe.e) &&
        Objects.equals(ei, filtriStringhe.ei);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq, ne, lt, lte, gt, gte, in, nin, c, ci, s, si, e, ei);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltriStringhe {\n");
    
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    ne: ").append(toIndentedString(ne)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    nin: ").append(toIndentedString(nin)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    ci: ").append(toIndentedString(ci)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    si: ").append(toIndentedString(si)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("    ei: ").append(toIndentedString(ei)).append("\n");
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

