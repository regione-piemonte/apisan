/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanprof.dto.apisanprof;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanprof.dto.apisanprof.Dettaglio;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Errore   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private Integer status = null;
  private String code = null;
  private String title = null;
  private List<Dettaglio> detail = new ArrayList<Dettaglio>();
  private List<String> links = new ArrayList<String>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status") 
 
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("code") 
 
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title") 
 
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("detail") 
 
  public List<Dettaglio> getDetail() {
    return detail;
  }
  public void setDetail(List<Dettaglio> detail) {
    this.detail = detail;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("links") 
 
  public List<String> getLinks() {
    return links;
  }
  public void setLinks(List<String> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Errore errore = (Errore) o;
    return Objects.equals(status, errore.status) &&
        Objects.equals(code, errore.code) &&
        Objects.equals(title, errore.title) &&
        Objects.equals(detail, errore.detail) &&
        Objects.equals(links, errore.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, title, detail, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Errore {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

