/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelAssociazioneMedici   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String codiceFiscale = null;
  private String nome = null;
  private String cognome = null;
  private String sesso = null;
  private Date dataNascita = null;

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(example = "32568", value = "Identificativo univoco")
  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Il codice fiscale del medico
   **/
  
  @ApiModelProperty(value = "Il codice fiscale del medico")
  @JsonProperty("codiceFiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * Il nome del medico
   **/
  
  @ApiModelProperty(example = "Luigi", value = "Il nome del medico")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Il cognome del medico
   **/
  
  @ApiModelProperty(example = "Verdi", value = "Il cognome del medico")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * Il sesso del medico
   **/
  
  @ApiModelProperty(value = "Il sesso del medico")
  @JsonProperty("sesso") 
 
  public String getSesso() {
    return sesso;
  }
  public void setSesso(String sesso) {
    this.sesso = sesso;
  }

  /**
   * La data di nascita del medico
   **/
  
  @ApiModelProperty(value = "La data di nascita del medico")
  @JsonProperty("dataNascita") 
 
  public Date getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAssociazioneMedici modelAssociazioneMedici = (ModelAssociazioneMedici) o;
    return Objects.equals(id, modelAssociazioneMedici.id) &&
        Objects.equals(codiceFiscale, modelAssociazioneMedici.codiceFiscale) &&
        Objects.equals(nome, modelAssociazioneMedici.nome) &&
        Objects.equals(cognome, modelAssociazioneMedici.cognome) &&
        Objects.equals(sesso, modelAssociazioneMedici.sesso) &&
        Objects.equals(dataNascita, modelAssociazioneMedici.dataNascita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codiceFiscale, nome, cognome, sesso, dataNascita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAssociazioneMedici {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    sesso: ").append(toIndentedString(sesso)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
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

