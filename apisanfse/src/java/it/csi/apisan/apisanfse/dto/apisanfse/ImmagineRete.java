/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ImmagineRete   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String eMail = null;
  private String sistemaOperativo = null;
  private String pin = null;

  /**
   * email della persona che richiede l&#39;immagine
   **/
  
  @ApiModelProperty(value = "email della persona che richiede l'immagine")
  @JsonProperty("e_mail") 
 
  public String getEMail() {
    return eMail;
  }
  public void setEMail(String eMail) {
    this.eMail = eMail;
  }

  /**
   * nome del sistema operativo dove si desidera visualizzare l&#39;immagine possibili valori - WINDOWS, - LINUX, - MAC;
   **/
  
  @ApiModelProperty(value = "nome del sistema operativo dove si desidera visualizzare l'immagine possibili valori - WINDOWS, - LINUX, - MAC;")
  @JsonProperty("sistema_operativo") 
 
  public String getSistemaOperativo() {
    return sistemaOperativo;
  }
  public void setSistemaOperativo(String sistemaOperativo) {
    this.sistemaOperativo = sistemaOperativo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pin") 
 
  public String getPin() {
    return pin;
  }
  public void setPin(String pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImmagineRete immagineRete = (ImmagineRete) o;
    return Objects.equals(eMail, immagineRete.eMail) &&
        Objects.equals(sistemaOperativo, immagineRete.sistemaOperativo) &&
        Objects.equals(pin, immagineRete.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eMail, sistemaOperativo, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImmagineRete {\n");
    
    sb.append("    eMail: ").append(toIndentedString(eMail)).append("\n");
    sb.append("    sistemaOperativo: ").append(toIndentedString(sistemaOperativo)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

