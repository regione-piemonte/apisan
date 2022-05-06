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



public class Nre   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String descStruttura = null;
  private String indirizzo = null;

  /**
   * identificativi emesso dal sistema ricetta elettronica
   **/
  
  @ApiModelProperty(value = "identificativi emesso dal sistema ricetta elettronica")
  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * descrizione della struttura
   **/
  
  @ApiModelProperty(value = "descrizione della struttura")
  @JsonProperty("desc_struttura") 
 
  public String getDescStruttura() {
    return descStruttura;
  }
  public void setDescStruttura(String descStruttura) {
    this.descStruttura = descStruttura;
  }

  /**
   * indirizzo della struttura
   **/
  
  @ApiModelProperty(value = "indirizzo della struttura")
  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nre nre = (Nre) o;
    return Objects.equals(id, nre.id) &&
        Objects.equals(descStruttura, nre.descStruttura) &&
        Objects.equals(indirizzo, nre.indirizzo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descStruttura, indirizzo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nre {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descStruttura: ").append(toIndentedString(descStruttura)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
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

