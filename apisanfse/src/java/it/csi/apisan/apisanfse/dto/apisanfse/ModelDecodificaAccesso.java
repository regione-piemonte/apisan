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



public class ModelDecodificaAccesso   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String codiceVerticale = null;
  private String codiceServizio = null;
  private String descrizioneServizio = null;

  /**
   * codice dell&#39;applicativo verticale a cui fa riferimento
   **/
  
  @ApiModelProperty(value = "codice dell'applicativo verticale a cui fa riferimento")
  @JsonProperty("codice_verticale") 
 
  public String getCodiceVerticale() {
    return codiceVerticale;
  }
  public void setCodiceVerticale(String codiceVerticale) {
    this.codiceVerticale = codiceVerticale;
  }

  /**
   * codice del servizio di accessi servizio
   **/
  
  @ApiModelProperty(value = "codice del servizio di accessi servizio")
  @JsonProperty("codice_servizio") 
 
  public String getCodiceServizio() {
    return codiceServizio;
  }
  public void setCodiceServizio(String codiceServizio) {
    this.codiceServizio = codiceServizio;
  }

  /**
   * descrizione del servizio di accessi servizio
   **/
  
  @ApiModelProperty(value = "descrizione del servizio di accessi servizio")
  @JsonProperty("descrizione_servizio") 
 
  public String getDescrizioneServizio() {
    return descrizioneServizio;
  }
  public void setDescrizioneServizio(String descrizioneServizio) {
    this.descrizioneServizio = descrizioneServizio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDecodificaAccesso modelDecodificaAccesso = (ModelDecodificaAccesso) o;
    return Objects.equals(codiceVerticale, modelDecodificaAccesso.codiceVerticale) &&
        Objects.equals(codiceServizio, modelDecodificaAccesso.codiceServizio) &&
        Objects.equals(descrizioneServizio, modelDecodificaAccesso.descrizioneServizio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceVerticale, codiceServizio, descrizioneServizio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDecodificaAccesso {\n");
    
    sb.append("    codiceVerticale: ").append(toIndentedString(codiceVerticale)).append("\n");
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("    descrizioneServizio: ").append(toIndentedString(descrizioneServizio)).append("\n");
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

