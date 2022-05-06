/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.apisanscerev;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelGeneralitaAssistito   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String nome = null;
  private String cognome = null;
  private Date dataNascita = null;
  private String comuneNascita = null;

  /**
   * nome del cittadino
   **/
  
  @ApiModelProperty(example = "Mario", value = "nome del cittadino")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * cognome del cittadino
   **/
  
  @ApiModelProperty(example = "Rossi", value = "cognome del cittadino")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * data di nascita del cittadino
   **/
  
  @ApiModelProperty(value = "data di nascita del cittadino")
  @JsonProperty("data_nascita") 
 
  public Date getDataNascita() {
    return dataNascita;
  }
  public void setDataNascita(Date dataNascita) {
    this.dataNascita = dataNascita;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("comune_nascita") 
 
  public String getComuneNascita() {
    return comuneNascita;
  }
  public void setComuneNascita(String comuneNascita) {
    this.comuneNascita = comuneNascita;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelGeneralitaAssistito modelGeneralitaAssistito = (ModelGeneralitaAssistito) o;
    return Objects.equals(nome, modelGeneralitaAssistito.nome) &&
        Objects.equals(cognome, modelGeneralitaAssistito.cognome) &&
        Objects.equals(dataNascita, modelGeneralitaAssistito.dataNascita) &&
        Objects.equals(comuneNascita, modelGeneralitaAssistito.comuneNascita);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cognome, dataNascita, comuneNascita);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelGeneralitaAssistito {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    dataNascita: ").append(toIndentedString(dataNascita)).append("\n");
    sb.append("    comuneNascita: ").append(toIndentedString(comuneNascita)).append("\n");
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

