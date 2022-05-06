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



public class PayloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String note = null;
  private String telefono = null;
  private String mail = null;
  private String idAppuntamento = null;
  private String motivazione = null;
  private String centroVaccinale = null;
  private String cfRichiedente = null;

  /**
   * Eventuali note inserite dall&#39;assistito
   **/
  
  @ApiModelProperty(value = "Eventuali note inserite dall'assistito")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * telefono dell&#39;assistito
   **/
  
  @ApiModelProperty(value = "telefono dell'assistito")
  @JsonProperty("telefono") 
 
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * Mail dell&#39;assistito
   **/
  
  @ApiModelProperty(value = "Mail dell'assistito")
  @JsonProperty("mail") 
 
  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

  /**
   * Id dell&#39;appuntamento da revocare
   **/
  
  @ApiModelProperty(value = "Id dell'appuntamento da revocare")
  @JsonProperty("id_appuntamento") 
 
  public String getIdAppuntamento() {
    return idAppuntamento;
  }
  public void setIdAppuntamento(String idAppuntamento) {
    this.idAppuntamento = idAppuntamento;
  }

  /**
   * Codice della motivazione per l&#39;annullamento
   **/
  
  @ApiModelProperty(value = "Codice della motivazione per l'annullamento")
  @JsonProperty("motivazione") 
 
  public String getMotivazione() {
    return motivazione;
  }
  public void setMotivazione(String motivazione) {
    this.motivazione = motivazione;
  }

  /**
   * Id del centro vaccinale
   **/
  
  @ApiModelProperty(value = "Id del centro vaccinale")
  @JsonProperty("centro_vaccinale") 
 
  public String getCentroVaccinale() {
    return centroVaccinale;
  }
  public void setCentroVaccinale(String centroVaccinale) {
    this.centroVaccinale = centroVaccinale;
  }

  /**
   * Cf del richiedente
   **/
  
  @ApiModelProperty(value = "Cf del richiedente")
  @JsonProperty("cf_richiedente") 
 
  public String getCfRichiedente() {
    return cfRichiedente;
  }
  public void setCfRichiedente(String cfRichiedente) {
    this.cfRichiedente = cfRichiedente;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza payloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza = (PayloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza) o;
    return Objects.equals(note, payloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza.note) &&
        Objects.equals(telefono, payloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza.telefono) &&
        Objects.equals(mail, payloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza.mail) &&
        Objects.equals(idAppuntamento, payloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza.idAppuntamento) &&
        Objects.equals(motivazione, payloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza.motivazione) &&
        Objects.equals(centroVaccinale, payloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza.centroVaccinale) &&
        Objects.equals(cfRichiedente, payloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza.cfRichiedente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, telefono, mail, idAppuntamento, motivazione, centroVaccinale, cfRichiedente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadVaccinazioneAppuntamentoAnnullamentoRichiestaIstanza {\n");
    
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    idAppuntamento: ").append(toIndentedString(idAppuntamento)).append("\n");
    sb.append("    motivazione: ").append(toIndentedString(motivazione)).append("\n");
    sb.append("    centroVaccinale: ").append(toIndentedString(centroVaccinale)).append("\n");
    sb.append("    cfRichiedente: ").append(toIndentedString(cfRichiedente)).append("\n");
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

