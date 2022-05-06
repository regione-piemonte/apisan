/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import it.csi.apisan.apisanvac.model.ModelVaccinoNoDose;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class PayloadVaccinazioneAppuntamentoSpostamentoRichiesta   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String telefono = null;
  private String mail = null;
  private String nome = null;
  private String cognome = null;
  private String note = null;
  private String motivazione = null;
  private String centroVaccinale = null;
  private List<ModelVaccinoNoDose> vaccini = new ArrayList<ModelVaccinoNoDose>();

  /**
   * Il telefono su cui l&#39;assistito vuole essere contattato
   **/
  
  @ApiModelProperty(required = true, value = "Il telefono su cui l'assistito vuole essere contattato")
  @JsonProperty("telefono") 
 
  @NotNull
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * L&#39;indirizzo email su cui l&#39;assisito vuole essere contattato
   **/
  
  @ApiModelProperty(value = "L'indirizzo email su cui l'assisito vuole essere contattato")
  @JsonProperty("mail") 
 
  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

  /**
   * Il nome dell&#39;utente che sta richiedendo l&#39;appuntamento
   **/
  
  @ApiModelProperty(value = "Il nome dell'utente che sta richiedendo l'appuntamento")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Il cognome dell&#39;utente che sta richiedendo l&#39;appuntamento
   **/
  
  @ApiModelProperty(value = "Il cognome dell'utente che sta richiedendo l'appuntamento")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

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
   * Il motivo per cui si richiede lo spostamento
   **/
  
  @ApiModelProperty(required = true, value = "Il motivo per cui si richiede lo spostamento")
  @JsonProperty("motivazione") 
 
  @NotNull
  public String getMotivazione() {
    return motivazione;
  }
  public void setMotivazione(String motivazione) {
    this.motivazione = motivazione;
  }

  /**
   * L id del centro vaccinale
   **/
  
  @ApiModelProperty(value = "L id del centro vaccinale")
  @JsonProperty("centro_vaccinale") 
 
  public String getCentroVaccinale() {
    return centroVaccinale;
  }
  public void setCentroVaccinale(String centroVaccinale) {
    this.centroVaccinale = centroVaccinale;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vaccini") 
 
  public List<ModelVaccinoNoDose> getVaccini() {
    return vaccini;
  }
  public void setVaccini(List<ModelVaccinoNoDose> vaccini) {
    this.vaccini = vaccini;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadVaccinazioneAppuntamentoSpostamentoRichiesta payloadVaccinazioneAppuntamentoSpostamentoRichiesta = (PayloadVaccinazioneAppuntamentoSpostamentoRichiesta) o;
    return Objects.equals(telefono, payloadVaccinazioneAppuntamentoSpostamentoRichiesta.telefono) &&
        Objects.equals(mail, payloadVaccinazioneAppuntamentoSpostamentoRichiesta.mail) &&
        Objects.equals(nome, payloadVaccinazioneAppuntamentoSpostamentoRichiesta.nome) &&
        Objects.equals(cognome, payloadVaccinazioneAppuntamentoSpostamentoRichiesta.cognome) &&
        Objects.equals(note, payloadVaccinazioneAppuntamentoSpostamentoRichiesta.note) &&
        Objects.equals(motivazione, payloadVaccinazioneAppuntamentoSpostamentoRichiesta.motivazione) &&
        Objects.equals(centroVaccinale, payloadVaccinazioneAppuntamentoSpostamentoRichiesta.centroVaccinale) &&
        Objects.equals(vaccini, payloadVaccinazioneAppuntamentoSpostamentoRichiesta.vaccini);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telefono, mail, nome, cognome, note, motivazione, centroVaccinale, vaccini);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadVaccinazioneAppuntamentoSpostamentoRichiesta {\n");
    
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    motivazione: ").append(toIndentedString(motivazione)).append("\n");
    sb.append("    centroVaccinale: ").append(toIndentedString(centroVaccinale)).append("\n");
    sb.append("    vaccini: ").append(toIndentedString(vaccini)).append("\n");
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

