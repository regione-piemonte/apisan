/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesen.dto.apisanesen;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class Revoca   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String motivazioneRevoca = null;
  private String codiceEsenzione = null;
  private String cfBeneficiario = null;

  /**
   * La motivazione delle revoca inserita probabilmente dal cittadino
   **/
  
  @ApiModelProperty(example = "questa è la motivazione della revoca inserita dal cittadino", required = true, value = "La motivazione delle revoca inserita probabilmente dal cittadino")
  @JsonProperty("motivazione_revoca") 
 
  @NotNull
  public String getMotivazioneRevoca() {
    return motivazioneRevoca;
  }
  public void setMotivazioneRevoca(String motivazioneRevoca) {
    this.motivazioneRevoca = motivazioneRevoca;
  }

  /**
   * Codice esenzione obbligatorio per la revoca di esenzioni certificate ovvero quelle a cui manca l&#39;id
   **/
  
  @ApiModelProperty(value = "Codice esenzione obbligatorio per la revoca di esenzioni certificate ovvero quelle a cui manca l'id")
  @JsonProperty("codice_esenzione") 
 
  public String getCodiceEsenzione() {
    return codiceEsenzione;
  }
  public void setCodiceEsenzione(String codiceEsenzione) {
    this.codiceEsenzione = codiceEsenzione;
  }

  /**
   * codice fiscale del beneficiario obbligatorio per esenzioni autocertificate
   **/
  
  @ApiModelProperty(value = "codice fiscale del beneficiario obbligatorio per esenzioni autocertificate")
  @JsonProperty("cf_beneficiario") 
 
  public String getCfBeneficiario() {
    return cfBeneficiario;
  }
  public void setCfBeneficiario(String cfBeneficiario) {
    this.cfBeneficiario = cfBeneficiario;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Revoca revoca = (Revoca) o;
    return Objects.equals(motivazioneRevoca, revoca.motivazioneRevoca) &&
        Objects.equals(codiceEsenzione, revoca.codiceEsenzione) &&
        Objects.equals(cfBeneficiario, revoca.cfBeneficiario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(motivazioneRevoca, codiceEsenzione, cfBeneficiario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Revoca {\n");
    
    sb.append("    motivazioneRevoca: ").append(toIndentedString(motivazioneRevoca)).append("\n");
    sb.append("    codiceEsenzione: ").append(toIndentedString(codiceEsenzione)).append("\n");
    sb.append("    cfBeneficiario: ").append(toIndentedString(cfBeneficiario)).append("\n");
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

