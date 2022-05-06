/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.dto.apisanfarm;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class PayloadDeviceCertificato   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String uuid = null;
  private String fonteCodice = null;
  private String telefono = null;
  private String sistemaOperativo = null;
  private String browser = null;
  private String modello = null;

  /**
   * Id univoco che rappresenta il device. In formato UUID v4 
   **/
  

  @JsonProperty("uuid") 
 
  @NotNull
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * Indica da dove è stato certificato il device. Può valere \&quot;Cittadino\&quot; o \&quot;Operatore\&quot; e dal front-end dobbiamo passare \&quot;Cittadino\&quot; 
   **/
  

  @JsonProperty("fonte_codice") 
 
  @NotNull
  public String getFonteCodice() {
    return fonteCodice;
  }
  public void setFonteCodice(String fonteCodice) {
    this.fonteCodice = fonteCodice;
  }

  /**
   * Il numero di telefono del cittadino certificato sul notificatore 
   **/
  

  @JsonProperty("telefono") 
 
  @NotNull
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * Il sistema operativo del device
   **/
  

  @JsonProperty("sistema_operativo") 
 
  @NotNull
  public String getSistemaOperativo() {
    return sistemaOperativo;
  }
  public void setSistemaOperativo(String sistemaOperativo) {
    this.sistemaOperativo = sistemaOperativo;
  }

  /**
   * Il browser su cui sta girando la webapp
   **/
  

  @JsonProperty("browser") 
 
  @NotNull
  public String getBrowser() {
    return browser;
  }
  public void setBrowser(String browser) {
    this.browser = browser;
  }

  /**
   * Il modello del device
   **/
  

  @JsonProperty("modello") 
 
  public String getModello() {
    return modello;
  }
  public void setModello(String modello) {
    this.modello = modello;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadDeviceCertificato payloadDeviceCertificato = (PayloadDeviceCertificato) o;
    return Objects.equals(uuid, payloadDeviceCertificato.uuid) &&
        Objects.equals(fonteCodice, payloadDeviceCertificato.fonteCodice) &&
        Objects.equals(telefono, payloadDeviceCertificato.telefono) &&
        Objects.equals(sistemaOperativo, payloadDeviceCertificato.sistemaOperativo) &&
        Objects.equals(browser, payloadDeviceCertificato.browser) &&
        Objects.equals(modello, payloadDeviceCertificato.modello);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, fonteCodice, telefono, sistemaOperativo, browser, modello);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadDeviceCertificato {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    fonteCodice: ").append(toIndentedString(fonteCodice)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    sistemaOperativo: ").append(toIndentedString(sistemaOperativo)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    modello: ").append(toIndentedString(modello)).append("\n");
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

