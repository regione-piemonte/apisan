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

public class PayloadDeviceCertificatoOtp   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String uuid = null;
  private String otp = null;
  private String codiceFiscale = null;
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
   * L&#39;OTP ricevuto dal punto assistito 
   **/
  

  @JsonProperty("otp") 
 
  @NotNull
  public String getOtp() {
    return otp;
  }
  public void setOtp(String otp) {
    this.otp = otp;
  }

  /**
   * Il codice fiscale del cittadino. Arriva tramite il link inviato al cittadino 
   **/
  

  @JsonProperty("codice_fiscale") 
 
  @NotNull
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
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
    PayloadDeviceCertificatoOtp payloadDeviceCertificatoOtp = (PayloadDeviceCertificatoOtp) o;
    return Objects.equals(uuid, payloadDeviceCertificatoOtp.uuid) &&
        Objects.equals(otp, payloadDeviceCertificatoOtp.otp) &&
        Objects.equals(codiceFiscale, payloadDeviceCertificatoOtp.codiceFiscale) &&
        Objects.equals(sistemaOperativo, payloadDeviceCertificatoOtp.sistemaOperativo) &&
        Objects.equals(browser, payloadDeviceCertificatoOtp.browser) &&
        Objects.equals(modello, payloadDeviceCertificatoOtp.modello);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, otp, codiceFiscale, sistemaOperativo, browser, modello);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadDeviceCertificatoOtp {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
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

