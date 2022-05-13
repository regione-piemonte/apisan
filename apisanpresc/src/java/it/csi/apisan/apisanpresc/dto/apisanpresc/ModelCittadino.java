/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.dto.apisanpresc;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Il model generico del cittadino. <br> In caso venga usato per determinare l'assistito di una ricetta, questi campi dovrebbero contenere le informazioni valide al momento della creazione. ")

public class ModelCittadino   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String nome = "";
  private String cognome = "";
  private Date dataNascita = null;
  private String codiceFiscale = "";
  private String siglaProvincia = "";
  private String provincia = "";
  private String comune = "";
  private String cap = "";
  private String indirizzo = "";

  /**
   * Il nome del cittadino
   **/
  
  @ApiModelProperty(value = "Il nome del cittadino")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Il cognome del cittadino
   **/
  
  @ApiModelProperty(value = "Il cognome del cittadino")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * La data di nascita del cittadino
   **/
  
  @ApiModelProperty(value = "La data di nascita del cittadino")
  @JsonProperty("data_nascita") 
 
  public Date getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   * Il cognome del cittadino
   **/
  
  @ApiModelProperty(required = true, value = "Il cognome del cittadino")
  @JsonProperty("codice_fiscale") 
 
  @NotNull
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * La sigla della provincia di domicilio del cittadino
   **/
  
  @ApiModelProperty(value = "La sigla della provincia di domicilio del cittadino")
  @JsonProperty("sigla_provincia") 
 
  public String getSiglaProvincia() {
    return siglaProvincia;
  }
  public void setSiglaProvincia(String siglaProvincia) {
    this.siglaProvincia = siglaProvincia;
  }

  /**
   * La provincia di domicilio del cittadino
   **/
  
  @ApiModelProperty(value = "La provincia di domicilio del cittadino")
  @JsonProperty("provincia") 
 
  public String getProvincia() {
    return provincia;
  }
  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  /**
   * La città di domicilio del cittadino
   **/
  
  @ApiModelProperty(value = "La città di domicilio del cittadino")
  @JsonProperty("comune") 
 
  public String getComune() {
    return comune;
  }
  public void setComune(String comune) {
    this.comune = comune;
  }

  /**
   * Il CAP del domicilio del cittadino
   **/
  
  @ApiModelProperty(value = "Il CAP del domicilio del cittadino")
  @JsonProperty("cap") 
 
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   * L&#39;indirizzo del domicilio del cittadino
   **/
  
  @ApiModelProperty(value = "L'indirizzo del domicilio del cittadino")
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
    ModelCittadino modelCittadino = (ModelCittadino) o;
    return Objects.equals(nome, modelCittadino.nome) &&
        Objects.equals(cognome, modelCittadino.cognome) &&
        Objects.equals(dataNascita, modelCittadino.dataNascita) &&
        Objects.equals(codiceFiscale, modelCittadino.codiceFiscale) &&
        Objects.equals(siglaProvincia, modelCittadino.siglaProvincia) &&
        Objects.equals(provincia, modelCittadino.provincia) &&
        Objects.equals(comune, modelCittadino.comune) &&
        Objects.equals(cap, modelCittadino.cap) &&
        Objects.equals(indirizzo, modelCittadino.indirizzo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cognome, dataNascita, codiceFiscale, siglaProvincia, provincia, comune, cap, indirizzo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCittadino {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    siglaProvincia: ").append(toIndentedString(siglaProvincia)).append("\n");
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

