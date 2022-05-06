/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Tesoriere   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private Integer id = null;
  private String descrizione = null;
  private String urlLogo = null;

  /**
   * id della tesoreria di pagamento
   **/
  
  @ApiModelProperty(example = "1", value = "id della tesoreria di pagamento")
  @JsonProperty("id") 
 
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * descrizione del tesoriere di pagamento
   **/
  
  @ApiModelProperty(example = "UniCredit S.p.A.", value = "descrizione del tesoriere di pagamento")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * link all&#39;url del logo del tesoriere di pagamento
   **/
  
  @ApiModelProperty(example = "http://www.sistemapiemonte.it/ris/css/pagamentoTicket/im/unicreditgroup.jpg", value = "link all'url del logo del tesoriere di pagamento")
  @JsonProperty("url_logo") 
 
  public String getUrlLogo() {
    return urlLogo;
  }
  public void setUrlLogo(String urlLogo) {
    this.urlLogo = urlLogo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tesoriere tesoriere = (Tesoriere) o;
    return Objects.equals(id, tesoriere.id) &&
        Objects.equals(descrizione, tesoriere.descrizione) &&
        Objects.equals(urlLogo, tesoriere.urlLogo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descrizione, urlLogo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tesoriere {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    urlLogo: ").append(toIndentedString(urlLogo)).append("\n");
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

