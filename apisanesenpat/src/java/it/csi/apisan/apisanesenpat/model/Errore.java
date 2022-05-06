/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanesenpat.model.ErroreDettaglio;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="I possibili errori sono:  <table border=\"1\">   <thead>     <th style=\"width: 10%;\">status</th>     <th style=\"width: 40%;\">code</th>     <th style=\"width: 50%;\">title</th>   </thead>   <tbody>     <tr>       <td>400</td>       <td>Parametri obbligatori mancanti</td>       <td>Parametri obbligatori non presenti</td>     </tr>     <tr>       <td>400</td>       <td>Verifica del CF negativa</td>       <td>ATTENZIONE! Codice fiscale del beneficiario non valido perché non è un assistito piemontese</td>     </tr>     <tr>       <td>400</td>       <td>Verifica del CF delegato negativa</td>       <td>ATTENZIONE! Codice fiscale del delegato non valido</td>     </tr>     <tr>       <td>400</td>       <td>Mancata congruità parametri di input</td>       <td>Mancata congruità dei dati di input</td>     </tr>     <tr>       <td>404</td>       <td>Not found</td>       <td></td>     </tr>     <tr>       <td>409</td>       <td>Conflict</td>       <td></td>     </tr>     <tr>       <td>503</td>       <td>Mancata connessione ad AURA</td>       <td>Ci sono problemi di comunicazione con i servizi di AURA</td>     </tr>     <tr>       <td>503</td>       <td>Mancata connessione a deleghe</td>       <td>Ci sono problemi di comunicazione con i servizi di Deleghe</td>     </tr>     <tr>       <td>503</td>       <td>Mancata connessione al Repository</td>       <td>Ci sono problemi di comunicazione con i servizi del repository</td>     </tr>     <tr>       <td>500</td>       <td>Errore generico</td>       <td></td>     </tr>   </tbody> </table> ")

public class Errore   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer status = null;
  private String code = null;
  private String title = null;
  private List<ErroreDettaglio> detail = new ArrayList<>();
  private List<String> links = new ArrayList<>();

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
 
  public List<ErroreDettaglio> getDetail() {
    return detail;
  }
  public void setDetail(List<ErroreDettaglio> detail) {
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

