/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanfse.dto.apisanfse;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelMedico   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String nome = null;
  private String cognome = null;
  private String codiceFiscale = null;
  private String tipoMedico = null;

  /**
   * nome del medico
   **/
  
  @ApiModelProperty(value = "nome del medico")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * cognome del medico
   **/
  
  @ApiModelProperty(value = "cognome del medico")
  @JsonProperty("cognome") 
 
  public String getCognome() {
    return cognome;
  }
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * codice fiscale del medico
   **/
  
  @ApiModelProperty(value = "codice fiscale del medico")
  @JsonProperty("codice_fiscale") 
 
  public String getCodiceFiscale() {
    return codiceFiscale;
  }
  public void setCodiceFiscale(String codiceFiscale) {
    this.codiceFiscale = codiceFiscale;
  }

  /**
   * tipo del medico
   **/
  
  @ApiModelProperty(value = "tipo del medico")
  @JsonProperty("tipo_medico") 
 
  public String getTipoMedico() {
    return tipoMedico;
  }
  public void setTipoMedico(String tipoMedico) {
    this.tipoMedico = tipoMedico;
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
        Objects.equals(codiceFiscale, modelMedico.codiceFiscale) &&
        Objects.equals(tipoMedico, modelMedico.tipoMedico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, cognome, codiceFiscale, tipoMedico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelMedico {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    codiceFiscale: ").append(toIndentedString(codiceFiscale)).append("\n");
    sb.append("    tipoMedico: ").append(toIndentedString(tipoMedico)).append("\n");
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

