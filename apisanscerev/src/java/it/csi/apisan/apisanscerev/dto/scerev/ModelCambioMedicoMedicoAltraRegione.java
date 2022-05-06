/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.scerev;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Rappresenta le informazioni del medico precedente. (nel caso si tratti di un medico di altra regione). ")

public class ModelCambioMedicoMedicoAltraRegione   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String regione = null;
  private String aziendaSanitaria = null;
  private String nome = null;
  private String cognome = null;

  /**
   * regione di appartenenza del medico.
   **/
  
  @ApiModelProperty(example = "Toscana", value = "regione di appartenenza del medico.")
  @JsonProperty("regione") 
 
  public String getRegione() {
    return regione;
  }
  public void setRegione(String regione) {
    this.regione = regione;
  }

  /**
   * Azienda samìnitaria di appartenenza del medico.
   **/
  
  @ApiModelProperty(example = "Azienda USL Toscana Nord-Ovest", value = "Azienda samìnitaria di appartenenza del medico.")
  @JsonProperty("aziendaSanitaria") 
 
  public String getAziendaSanitaria() {
    return aziendaSanitaria;
  }
  public void setAziendaSanitaria(String aziendaSanitaria) {
    this.aziendaSanitaria = aziendaSanitaria;
  }

  /**
   * Nome del medico.
   **/
  
  @ApiModelProperty(example = "Carlotta", value = "Nome del medico.")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Cognome del medico.
   **/
  
  @ApiModelProperty(example = "Rissone", value = "Cognome del medico.")
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
    ModelCambioMedicoMedicoAltraRegione modelCambioMedicoMedicoAltraRegione = (ModelCambioMedicoMedicoAltraRegione) o;
    return Objects.equals(regione, modelCambioMedicoMedicoAltraRegione.regione) &&
        Objects.equals(aziendaSanitaria, modelCambioMedicoMedicoAltraRegione.aziendaSanitaria) &&
        Objects.equals(nome, modelCambioMedicoMedicoAltraRegione.nome) &&
        Objects.equals(cognome, modelCambioMedicoMedicoAltraRegione.cognome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regione, aziendaSanitaria, nome, cognome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCambioMedicoMedicoAltraRegione {\n");
    
    sb.append("    regione: ").append(toIndentedString(regione)).append("\n");
    sb.append("    aziendaSanitaria: ").append(toIndentedString(aziendaSanitaria)).append("\n");
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

