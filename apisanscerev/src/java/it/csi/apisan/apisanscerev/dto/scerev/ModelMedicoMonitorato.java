/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelMedicoMonitorato   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String codiceFiscale = null;
  private String nome = null;
  private String cognome = null;

  /**
   * Identificativo univoco
   **/
  
  @ApiModelProperty(example = "6545486", value = "Identificativo univoco")
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
  
  @ApiModelProperty(example = "MRARSS78M14I235F", value = "Il codice fiscale del medico")
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
  
  @ApiModelProperty(example = "Mario", value = "Il nome del medico")
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
  
  @ApiModelProperty(example = "Rossi", value = "Il cognome del medico")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelMedicoMonitorato modelMedicoMonitorato = (ModelMedicoMonitorato) o;
    return Objects.equals(id, modelMedicoMonitorato.id) &&
        Objects.equals(codiceFiscale, modelMedicoMonitorato.codiceFiscale) &&
        Objects.equals(nome, modelMedicoMonitorato.nome) &&
        Objects.equals(cognome, modelMedicoMonitorato.cognome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codiceFiscale, nome, cognome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelMedicoMonitorato {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
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

