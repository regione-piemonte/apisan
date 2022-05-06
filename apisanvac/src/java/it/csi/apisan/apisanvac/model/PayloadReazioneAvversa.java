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



public class PayloadReazioneAvversa   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String telefono = null;
  private String mail = null;
  private String farmaco = null;
  private String note = null;
  private String dataReazione = null;
  private String tipologia = null;
  private String idVaccinazione = null;

  /**
   * Contatto telefonico
   **/
  
  @ApiModelProperty(value = "Contatto telefonico")
  @JsonProperty("telefono") 
 
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * Contatto mail
   **/
  
  @ApiModelProperty(value = "Contatto mail")
  @JsonProperty("mail") 
 
  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

  /**
   * Farmaco assunto ha causato la reazione avversa
   **/
  
  @ApiModelProperty(value = "Farmaco assunto ha causato la reazione avversa")
  @JsonProperty("farmaco") 
 
  public String getFarmaco() {
    return farmaco;
  }
  public void setFarmaco(String farmaco) {
    this.farmaco = farmaco;
  }

  /**
   * note utente
   **/
  
  @ApiModelProperty(value = "note utente")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * data in cui è avvenuta
   **/
  
  @ApiModelProperty(required = true, value = "data in cui è avvenuta")
  @JsonProperty("data_reazione") 
 
  @NotNull
  public String getDataReazione() {
    return dataReazione;
  }
  public void setDataReazione(String dataReazione) {
    this.dataReazione = dataReazione;
  }

  /**
   * tipologia
   **/
  
  @ApiModelProperty(required = true, value = "tipologia")
  @JsonProperty("tipologia") 
 
  @NotNull
  public String getTipologia() {
    return tipologia;
  }
  public void setTipologia(String tipologia) {
    this.tipologia = tipologia;
  }

  /**
   * id della vaccinazione relativa
   **/
  
  @ApiModelProperty(required = true, value = "id della vaccinazione relativa")
  @JsonProperty("id_vaccinazione") 
 
  @NotNull
  public String getIdVaccinazione() {
    return idVaccinazione;
  }
  public void setIdVaccinazione(String idVaccinazione) {
    this.idVaccinazione = idVaccinazione;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadReazioneAvversa payloadReazioneAvversa = (PayloadReazioneAvversa) o;
    return Objects.equals(telefono, payloadReazioneAvversa.telefono) &&
        Objects.equals(mail, payloadReazioneAvversa.mail) &&
        Objects.equals(farmaco, payloadReazioneAvversa.farmaco) &&
        Objects.equals(note, payloadReazioneAvversa.note) &&
        Objects.equals(dataReazione, payloadReazioneAvversa.dataReazione) &&
        Objects.equals(tipologia, payloadReazioneAvversa.tipologia) &&
        Objects.equals(idVaccinazione, payloadReazioneAvversa.idVaccinazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telefono, mail, farmaco, note, dataReazione, tipologia, idVaccinazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadReazioneAvversa {\n");
    
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    farmaco: ").append(toIndentedString(farmaco)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    dataReazione: ").append(toIndentedString(dataReazione)).append("\n");
    sb.append("    tipologia: ").append(toIndentedString(tipologia)).append("\n");
    sb.append("    idVaccinazione: ").append(toIndentedString(idVaccinazione)).append("\n");
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

