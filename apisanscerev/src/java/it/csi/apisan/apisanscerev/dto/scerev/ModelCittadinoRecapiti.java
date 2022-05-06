/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta i recapiti del cittadino")

public class ModelCittadinoRecapiti   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String telefono = null;
  private String telefonoSecondario = null;
  private String indirizzoEmail = null;

  /**
   * Il numero di telefono inserito dall&#39;utente
   **/
  
  @ApiModelProperty(example = "3384258847", value = "Il numero di telefono inserito dall'utente")
  @JsonProperty("telefono") 
 
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * Il numero di telefono secondario inserito dall&#39;utente
   **/
  
  @ApiModelProperty(example = "0119875985", value = "Il numero di telefono secondario inserito dall'utente")
  @JsonProperty("telefonoSecondario") 
 
  public String getTelefonoSecondario() {
    return telefonoSecondario;
  }
  public void setTelefonoSecondario(String telefonoSecondario) {
    this.telefonoSecondario = telefonoSecondario;
  }

  /**
   * L&#39;indirizzo email inserito dall&#39;utente
   **/
  
  @ApiModelProperty(example = "alessandro.napoli@email.com", value = "L'indirizzo email inserito dall'utente")
  @JsonProperty("indirizzoEmail") 
 
  public String getIndirizzoEmail() {
    return indirizzoEmail;
  }
  public void setIndirizzoEmail(String indirizzoEmail) {
    this.indirizzoEmail = indirizzoEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCittadinoRecapiti modelCittadinoRecapiti = (ModelCittadinoRecapiti) o;
    return Objects.equals(telefono, modelCittadinoRecapiti.telefono) &&
        Objects.equals(telefonoSecondario, modelCittadinoRecapiti.telefonoSecondario) &&
        Objects.equals(indirizzoEmail, modelCittadinoRecapiti.indirizzoEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telefono, telefonoSecondario, indirizzoEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCittadinoRecapiti {\n");
    
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    telefonoSecondario: ").append(toIndentedString(telefonoSecondario)).append("\n");
    sb.append("    indirizzoEmail: ").append(toIndentedString(indirizzoEmail)).append("\n");
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

