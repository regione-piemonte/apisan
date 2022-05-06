/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadPrenotaImmagine   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codiceComponenteLocale = null;
  private List<String> accessionNumbers = new ArrayList<String>();
  private String eMail = null;
  private String sistemaOperativo = null;
  private String pin = null;

  /**
   * codice della componente locale
   **/
  
  @ApiModelProperty(value = "codice della componente locale")
  @JsonProperty("codice_componente_locale") 
 
  public String getCodiceComponenteLocale() {
    return codiceComponenteLocale;
  }
  public void setCodiceComponenteLocale(String codiceComponenteLocale) {
    this.codiceComponenteLocale = codiceComponenteLocale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("accession_numbers") 
 
  public List<String> getAccessionNumbers() {
    return accessionNumbers;
  }
  public void setAccessionNumbers(List<String> accessionNumbers) {
    this.accessionNumbers = accessionNumbers;
  }

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
    PayloadPrenotaImmagine payloadPrenotaImmagine = (PayloadPrenotaImmagine) o;
    return Objects.equals(codiceComponenteLocale, payloadPrenotaImmagine.codiceComponenteLocale) &&
        Objects.equals(accessionNumbers, payloadPrenotaImmagine.accessionNumbers) &&
        Objects.equals(eMail, payloadPrenotaImmagine.eMail) &&
        Objects.equals(sistemaOperativo, payloadPrenotaImmagine.sistemaOperativo) &&
        Objects.equals(pin, payloadPrenotaImmagine.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceComponenteLocale, accessionNumbers, eMail, sistemaOperativo, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadPrenotaImmagine {\n");
    
    sb.append("    codiceComponenteLocale: ").append(toIndentedString(codiceComponenteLocale)).append("\n");
    sb.append("    accessionNumbers: ").append(toIndentedString(accessionNumbers)).append("\n");
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

