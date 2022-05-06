/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanvac.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import it.csi.apisan.apisanvac.model.ModelAmbulatorio;
import it.csi.apisan.apisanvac.model.ModelAsl;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta il centro vaccinale ")

public class ModelCentroVaccinale   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codice = null;
  private String descrizione = null;
  private String comune = null;
  private String indirizzo = null;
  private String note = null;
  private String telefono = null;
  private String mail = null;
  private List<ModelAmbulatorio> ambulatori = new ArrayList<ModelAmbulatorio>();
  private ModelAsl asl = null;

  /**
   * Il codice associato al centro vaccinale
   **/
  
  @ApiModelProperty(required = true, value = "Il codice associato al centro vaccinale")
  @JsonProperty("codice") 
 
  @NotNull
  public String getCodice() {
    return codice;
  }
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Il nome del centro
   **/
  
  @ApiModelProperty(required = true, value = "Il nome del centro")
  @JsonProperty("descrizione") 
 
  @NotNull
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Il nome del comune di appartenenza del centro vaccinale
   **/
  
  @ApiModelProperty(required = true, value = "Il nome del comune di appartenenza del centro vaccinale")
  @JsonProperty("comune") 
 
  @NotNull
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   * L&#39;indirizzo del centro vaccinale
   **/
  
  @ApiModelProperty(required = true, value = "L'indirizzo del centro vaccinale")
  @JsonProperty("indirizzo") 
 
  @NotNull
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   * Eventuali note associate al centro vaccinale
   **/
  
  @ApiModelProperty(value = "Eventuali note associate al centro vaccinale")
  @JsonProperty("note") 
 
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * Il numero di telefono del centro vaccinale
   **/
  
  @ApiModelProperty(required = true, value = "Il numero di telefono del centro vaccinale")
  @JsonProperty("telefono") 
 
  @NotNull
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * Mail del centro vaccinale
   **/
  
  @ApiModelProperty(required = true, value = "Mail del centro vaccinale")
  @JsonProperty("mail") 
 
  @NotNull
  public String getMail() {
    return mail;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

  /**
   * Contiene l&#39;elenco degli ambulatori del centro vaccinale. Se la lista è vuota vuol dire che il centro vaccinale non supporta l&#39;agenda elettronica 
   **/
  
  @ApiModelProperty(value = "Contiene l'elenco degli ambulatori del centro vaccinale. Se la lista è vuota vuol dire che il centro vaccinale non supporta l'agenda elettronica ")
  @JsonProperty("ambulatori") 
 
  public List<ModelAmbulatorio> getAmbulatori() {
    return ambulatori;
  }
  public void setAmbulatori(List<ModelAmbulatorio> ambulatori) {
    this.ambulatori = ambulatori;
  }

  /**
   * L&#39;ASL di appartenenza del centro vaccinale &lt;span style&#x3D;\&quot;text-decoration: underline;\&quot;&gt; Non è fornito dallo strato giallo &lt;/span&gt; 
   **/
  
  @ApiModelProperty(required = true, value = "L'ASL di appartenenza del centro vaccinale <span style=\"text-decoration: underline;\"> Non è fornito dallo strato giallo </span> ")
  @JsonProperty("asl") 
 
  @NotNull
  public ModelAsl getAsl() {
    return asl;
  }
  public void setAsl(ModelAsl asl) {
    this.asl = asl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCentroVaccinale modelCentroVaccinale = (ModelCentroVaccinale) o;
    return Objects.equals(codice, modelCentroVaccinale.codice) &&
        Objects.equals(descrizione, modelCentroVaccinale.descrizione) &&
        Objects.equals(comune, modelCentroVaccinale.comune) &&
        Objects.equals(indirizzo, modelCentroVaccinale.indirizzo) &&
        Objects.equals(note, modelCentroVaccinale.note) &&
        Objects.equals(telefono, modelCentroVaccinale.telefono) &&
        Objects.equals(mail, modelCentroVaccinale.mail) &&
        Objects.equals(ambulatori, modelCentroVaccinale.ambulatori) &&
        Objects.equals(asl, modelCentroVaccinale.asl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codice, descrizione, comune, indirizzo, note, telefono, mail, ambulatori, asl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCentroVaccinale {\n");
    
    sb.append("    codice: ").append(toIndentedString(codice)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    ambulatori: ").append(toIndentedString(ambulatori)).append("\n");
    sb.append("    asl: ").append(toIndentedString(asl)).append("\n");
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

