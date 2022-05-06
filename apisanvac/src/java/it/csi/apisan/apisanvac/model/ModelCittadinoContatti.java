/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta i contatti del cittadino per questo servizio ")

public class ModelCittadinoContatti   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String telefono = null;
  private String telefono2 = null;
  private String telefono3 = null;
  private String email = null;

  /**
   * Il numero di telefono
   **/
  
  @ApiModelProperty(required = true, value = "Il numero di telefono")
  @JsonProperty("telefono") 
 
  @NotNull
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * Un altro numero di telefono
   **/
  
  @ApiModelProperty(value = "Un altro numero di telefono")
  @JsonProperty("telefono_2") 
 
  public String getTelefono2() {
    return telefono2;
  }
  public void setTelefono2(String telefono2) {
    this.telefono2 = telefono2;
  }

  /**
   * Un altro numero di telefono
   **/
  
  @ApiModelProperty(value = "Un altro numero di telefono")
  @JsonProperty("telefono_3") 
 
  public String getTelefono3() {
    return telefono3;
  }
  public void setTelefono3(String telefono3) {
    this.telefono3 = telefono3;
  }

  /**
   * L&#39;indirizzo email
   **/
  
  @ApiModelProperty(required = true, value = "L'indirizzo email")
  @JsonProperty("email") 
 
  @NotNull
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
    ModelCittadinoContatti modelCittadinoContatti = (ModelCittadinoContatti) o;
    return Objects.equals(telefono, modelCittadinoContatti.telefono) &&
        Objects.equals(telefono2, modelCittadinoContatti.telefono2) &&
        Objects.equals(telefono3, modelCittadinoContatti.telefono3) &&
        Objects.equals(email, modelCittadinoContatti.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telefono, telefono2, telefono3, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCittadinoContatti {\n");
    
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    telefono2: ").append(toIndentedString(telefono2)).append("\n");
    sb.append("    telefono3: ").append(toIndentedString(telefono3)).append("\n");
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

