/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.ptw;

import java.util.Objects;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Cittadino   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String nome = null;
  private String cognome = null;
  private String dataNascita = null;
  private String codiceFiscale = null;
  private String indirizzo = null;
  private String comune = null;
  private String provincia = null;
  private String cap = null;

  /**
   * nome del paziente
   **/
  
  @ApiModelProperty(value = "nome del paziente")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * cognome del paziente
   **/
  
  @ApiModelProperty(value = "cognome del paziente")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * data di nascita del paziente
   **/
  
  @ApiModelProperty(value = "data di nascita del paziente")
  @JsonProperty("data_nascita") 
 
  public String getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(String dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   * codice fiscale del paziente
   **/
  
  @ApiModelProperty(value = "codice fiscale del paziente")
  @JsonProperty("codice_fiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * indirizzo di residenza o di domicilio del paziente
   **/
  
  @ApiModelProperty(value = "indirizzo di residenza o di domicilio del paziente")
  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   * comune di residenza o domicilio del paziente
   **/
  
  @ApiModelProperty(value = "comune di residenza o domicilio del paziente")
  @JsonProperty("comune") 
 
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   * sigla della provincia di residenza o domicilio del paziente
   **/
  
  @ApiModelProperty(value = "sigla della provincia di residenza o domicilio del paziente")
  @JsonProperty("provincia") 
 
  public String getProvincia() {
    return provincia;
  }
  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  /**
   * cap residenza o domicilio del paziente
   **/
  
  @ApiModelProperty(value = "cap residenza o domicilio del paziente")
  @JsonProperty("cap") 
 
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cittadino anagraficaPaziente = (Cittadino) o;
    return Objects.equals(nome, anagraficaPaziente.nome) &&
        Objects.equals(cognome, anagraficaPaziente.cognome) &&
        Objects.equals(dataNascita, anagraficaPaziente.dataNascita) &&
        Objects.equals(codiceFiscale, anagraficaPaziente.codiceFiscale) &&
        Objects.equals(indirizzo, anagraficaPaziente.indirizzo) &&
        Objects.equals(comune, anagraficaPaziente.comune) &&
        Objects.equals(provincia, anagraficaPaziente.provincia) &&
        Objects.equals(cap, anagraficaPaziente.cap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cognome, dataNascita, codiceFiscale, indirizzo, comune, provincia, cap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cittadino {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    comune: ").append(toIndentedString(comune)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
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

