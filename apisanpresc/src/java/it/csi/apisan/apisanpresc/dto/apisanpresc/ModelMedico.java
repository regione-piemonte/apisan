/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.dto.apisanpresc;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Il model generico che rappresenta il medico ")

public class ModelMedico   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String nome = "";
  private String cognome = "";
  private String codiceFiscale = "";

  /**
   * Il nome del medico
   **/
  
  @ApiModelProperty(value = "Il nome del medico")
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
  
  @ApiModelProperty(value = "Il cognome del medico")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * Il codice fiscale del medico
   **/
  
  @ApiModelProperty(required = true, value = "Il codice fiscale del medico")
  @JsonProperty("codice_fiscale") 
 
  @NotNull
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelMedico modelMedico = (ModelMedico) o;
    return Objects.equals(nome, modelMedico.nome) &&
        Objects.equals(cognome, modelMedico.cognome) &&
        Objects.equals(codiceFiscale, modelMedico.codiceFiscale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cognome, codiceFiscale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelMedico {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
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

