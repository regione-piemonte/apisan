/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.dto.apisanffe;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;

public class ModelListaTicketPaziente   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String codiceFiscale = null;
  private String cognome = null;
  private String nome = null;
  private Date dataNascita = null;
  private String provincia = null;
  private String comune = null;
  private String cap = null;
  private String indirizzo = null;

  /**
   * Il codice fiscale del paziente
   **/
  

  @JsonProperty("codice_fiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * Il cognome del paziente
   **/
  

  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * Il nome del paziente
   **/
  

  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * La data di nascita del paziente
   **/
  

  @JsonProperty("data_nascita") 
 
  public Date getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   * La provincia di residenza del paziente
   **/
  

  @JsonProperty("provincia") 
 
  public String getProvincia() {
    return provincia;
  }
  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  /**
   * Il comune di residenza del paziente
   **/
  

  @JsonProperty("comune") 
 
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   * Il CAP di residenza del paziente
   **/
  

  @JsonProperty("cap") 
 
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   * L&#39;indirizzo di residenza del paziente
   **/
  

  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelListaTicketPaziente modelListaTicketPaziente = (ModelListaTicketPaziente) o;
    return Objects.equals(codiceFiscale, modelListaTicketPaziente.codiceFiscale) &&
        Objects.equals(cognome, modelListaTicketPaziente.cognome) &&
        Objects.equals(nome, modelListaTicketPaziente.nome) &&
        Objects.equals(dataNascita, modelListaTicketPaziente.dataNascita) &&
        Objects.equals(provincia, modelListaTicketPaziente.provincia) &&
        Objects.equals(comune, modelListaTicketPaziente.comune) &&
        Objects.equals(cap, modelListaTicketPaziente.cap) &&
        Objects.equals(indirizzo, modelListaTicketPaziente.indirizzo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceFiscale, cognome, nome, dataNascita, provincia, comune, cap, indirizzo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelListaTicketPaziente {\n");
    
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
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

