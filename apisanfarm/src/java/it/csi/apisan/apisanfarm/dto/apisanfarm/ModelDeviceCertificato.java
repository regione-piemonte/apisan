/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfarm.dto.apisanfarm;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelDeviceCertificato   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String uuid = null;
  private Date dataCertificazione = null;
  private String fonteCodice = null;
  private String fonteDescrizione = null;
  private String codiceFiscale = null;
  private String telefono = null;
  private String sistemaOperativo = null;
  private String browser = null;
  private String modello = null;

  /**
   * Un id univoco
   **/
  

  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * L&#39;id univoco del device (nel formato UUID v4)
   **/
  

  @JsonProperty("uuid") 
 
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * La data e ora in cui è stato certificato il dispositivo
   **/
  

  @JsonProperty("data_certificazione") 
 
  public Date getDataCertificazione() {
    return dataCertificazione;
  }
  public void setDataCertificazione(Date dataCertificazione) {
    this.dataCertificazione = dataCertificazione;
  }

  /**
   * Indica da dove è stato certificato il device. Può valere \&quot;Cittadino\&quot; o \&quot;Operatore\&quot; 
   **/
  

  @JsonProperty("fonte_codice") 
 
  public String getFonteCodice() {
    return fonteCodice;
  }
  public void setFonteCodice(String fonteCodice) {
    this.fonteCodice = fonteCodice;
  }

  /**
   * La descrizione della fonte da mostrare sulla UI
   **/
  

  @JsonProperty("fonte_descrizione") 
 
  public String getFonteDescrizione() {
    return fonteDescrizione;
  }
  public void setFonteDescrizione(String fonteDescrizione) {
    this.fonteDescrizione = fonteDescrizione;
  }

  /**
   * Il codice fiscale del cittadino a cui si riferisce il device
   **/
  

  @JsonProperty("codice_fiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * Il numero di telefono del cittadino certificato sul notificatore 
   **/
  

  @JsonProperty("telefono") 
 
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
    ModelDeviceCertificato modelDeviceCertificato = (ModelDeviceCertificato) o;
    return Objects.equals(id, modelDeviceCertificato.id) &&
        Objects.equals(uuid, modelDeviceCertificato.uuid) &&
        Objects.equals(dataCertificazione, modelDeviceCertificato.dataCertificazione) &&
        Objects.equals(fonteCodice, modelDeviceCertificato.fonteCodice) &&
        Objects.equals(fonteDescrizione, modelDeviceCertificato.fonteDescrizione) &&
        Objects.equals(codiceFiscale, modelDeviceCertificato.codiceFiscale) &&
        Objects.equals(telefono, modelDeviceCertificato.telefono) &&
        Objects.equals(sistemaOperativo, modelDeviceCertificato.sistemaOperativo) &&
        Objects.equals(browser, modelDeviceCertificato.browser) &&
        Objects.equals(modello, modelDeviceCertificato.modello);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, dataCertificazione, fonteCodice, fonteDescrizione, codiceFiscale, telefono, sistemaOperativo, browser, modello);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDeviceCertificato {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    dataCertificazione: ").append(toIndentedString(dataCertificazione)).append("\n");
    sb.append("    fonteCodice: ").append(toIndentedString(fonteCodice)).append("\n");
    sb.append("    fonteDescrizione: ").append(toIndentedString(fonteDescrizione)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
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

