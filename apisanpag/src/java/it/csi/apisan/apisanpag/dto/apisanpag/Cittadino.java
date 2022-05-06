/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpag.dto.apisanpag;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Cittadino   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String nome = null;
  private String cognome = null;
  private Date dataNascita = null;
  private String codiceFiscale = null;
  private String indirizzo = null;
  private String comune = null;
  private String provincia = null;
  private String cap = null;

  /**
   * nome del versante
   **/
  
  @ApiModelProperty(value = "nome del versante")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * cognome del versante
   **/
  
  @ApiModelProperty(value = "cognome del versante")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * data di nascita del versante
   **/
  
  @ApiModelProperty(value = "data di nascita del versante")
  @JsonProperty("data_nascita") 
 
  public Date getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   * codice fiscale del versante
   **/
  
  @ApiModelProperty(value = "codice fiscale del versante")
  @JsonProperty("codice_fiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * indirizzo di residenza o di domicilio del versante
   **/
  
  @ApiModelProperty(value = "indirizzo di residenza o di domicilio del versante")
  @JsonProperty("indirizzo") 
 
  public String getIndirizzo() {
    return indirizzo;
  }
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   * comune di residenza o domicilio del versante
   **/
  
  @ApiModelProperty(value = "comune di residenza o domicilio del versante")
  @JsonProperty("comune") 
 
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   * sigla della provincia di residenza o domicilio del versante
   **/
  
  @ApiModelProperty(value = "sigla della provincia di residenza o domicilio del versante")
  @JsonProperty("provincia") 
 
  public String getProvincia() {
    return provincia;
  }
  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  /**
   * cap residenza o domicilio del versante
   **/
  
  @ApiModelProperty(value = "cap residenza o domicilio del versante")
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
    Cittadino cittadino = (Cittadino) o;
    return Objects.equals(nome, cittadino.nome) &&
        Objects.equals(cognome, cittadino.cognome) &&
        Objects.equals(dataNascita, cittadino.dataNascita) &&
        Objects.equals(codiceFiscale, cittadino.codiceFiscale) &&
        Objects.equals(indirizzo, cittadino.indirizzo) &&
        Objects.equals(comune, cittadino.comune) &&
        Objects.equals(provincia, cittadino.provincia) &&
        Objects.equals(cap, cittadino.cap);
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

