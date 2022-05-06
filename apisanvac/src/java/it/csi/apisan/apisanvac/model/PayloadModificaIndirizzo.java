/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadModificaIndirizzo   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String indirizzoTemporaneo = null;
  private String comune = null;
  private String cap = null;
  private String mail = null;
  private String telefono = null;
  private String dataInizio = null;
  private String dataFine = null;

  /**
   * L&#39;indirizzo e num civico
   **/
  
  @ApiModelProperty(example = "Via Roma 12", value = "L'indirizzo e num civico")
  @JsonProperty("indirizzo_temporaneo") 
 
  public String getIndirizzoTemporaneo() {
    return indirizzoTemporaneo;
  }
  public void setIndirizzoTemporaneo(String indirizzoTemporaneo) {
    this.indirizzoTemporaneo = indirizzoTemporaneo;
  }

  /**
   * Codice istat del comune
   **/
  
  @ApiModelProperty(required = true, value = "Codice istat del comune")
  @JsonProperty("comune") 
 
  @NotNull
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   * il cap inserito da utente
   **/
  
  @ApiModelProperty(required = true, value = "il cap inserito da utente")
  @JsonProperty("cap") 
 
  @NotNull
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   * L&#39;indirizzo email
   **/
  
  @ApiModelProperty(value = "L'indirizzo email")
  @JsonProperty("mail") 
 
  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

  /**
   * Num di telefono
   **/
  
  @ApiModelProperty(value = "Num di telefono")
  @JsonProperty("telefono") 
 
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * La data di inizio validità dell indirizzo temporaneo
   **/
  
  @ApiModelProperty(example = "2019-11-08T09:21:38.739Z", required = true, value = "La data di inizio validità dell indirizzo temporaneo")
  @JsonProperty("data_inizio") 
 
  @NotNull
  public String getDataInizio() {
    return dataInizio;
  }
  public void setDataInizio(String dataInizio) {
    this.dataInizio = dataInizio;
  }

  /**
   * La data di fine validità dell indirizzo temporaneo
   **/
  
  @ApiModelProperty(example = "2020-11-08T09:21:38.739Z", required = true, value = "La data di fine validità dell indirizzo temporaneo")
  @JsonProperty("data_fine") 
 
  @NotNull
  public String getDataFine() {
    return dataFine;
  }
  public void setDataFine(String dataFine) {
    this.dataFine = dataFine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadModificaIndirizzo payloadModificaIndirizzo = (PayloadModificaIndirizzo) o;
    return Objects.equals(indirizzoTemporaneo, payloadModificaIndirizzo.indirizzoTemporaneo) &&
        Objects.equals(comune, payloadModificaIndirizzo.comune) &&
        Objects.equals(cap, payloadModificaIndirizzo.cap) &&
        Objects.equals(mail, payloadModificaIndirizzo.mail) &&
        Objects.equals(telefono, payloadModificaIndirizzo.telefono) &&
        Objects.equals(dataInizio, payloadModificaIndirizzo.dataInizio) &&
        Objects.equals(dataFine, payloadModificaIndirizzo.dataFine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indirizzoTemporaneo, comune, cap, mail, telefono, dataInizio, dataFine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadModificaIndirizzo {\n");
    
    sb.append("    indirizzoTemporaneo: ").append(toIndentedString(indirizzoTemporaneo)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    dataInizio: ").append(toIndentedString(dataInizio)).append("\n");
    sb.append("    dataFine: ").append(toIndentedString(dataFine)).append("\n");
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

