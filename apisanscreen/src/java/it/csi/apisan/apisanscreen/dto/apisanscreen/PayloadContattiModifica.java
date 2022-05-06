/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadContattiModifica   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String telefono1 = null;
  private String telefono2 = null;
  private String email = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("telefono_1") 
 
  public String getTelefono1() {
    return telefono1;
  }
  public void setTelefono1(String telefono1) {
    this.telefono1 = telefono1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("telefono_2") 
 
  public String getTelefono2() {
    return telefono2;
  }
  public void setTelefono2(String telefono2) {
    this.telefono2 = telefono2;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email") 
 
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadContattiModifica payloadContattiModifica = (PayloadContattiModifica) o;
    return Objects.equals(telefono1, payloadContattiModifica.telefono1) &&
        Objects.equals(telefono2, payloadContattiModifica.telefono2) &&
        Objects.equals(email, payloadContattiModifica.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telefono1, telefono2, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadContattiModifica {\n");
    
    sb.append("    telefono1: ").append(toIndentedString(telefono1)).append("\n");
    sb.append("    telefono2: ").append(toIndentedString(telefono2)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

