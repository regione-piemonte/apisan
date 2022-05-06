/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscreen.dto.apisanscreen;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelDocumentoDettaglio   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String base64 = null;
  private Boolean letto = null;
  private String nomeFile = null;

  /**
   * Il contenuto del file in base64
   **/
  
  @ApiModelProperty(value = "Il contenuto del file in base64")
  @JsonProperty("base_64") 
 
  public String getBase64() {
    return base64;
  }
  public void setBase64(String base64) {
    this.base64 = base64;
  }

  /**
   * Indica se il documento è stato aperto o meno
   **/
  
  @ApiModelProperty(value = "Indica se il documento è stato aperto o meno")
  @JsonProperty("letto") 
 
  public Boolean isLetto() {
    return letto;
  }
  public void setLetto(Boolean letto) {
    this.letto = letto;
  }

  /**
   * nome del file
   **/
  
  @ApiModelProperty(value = "nome del file")
  @JsonProperty("nome_file") 
 
  public String getNomeFile() {
    return nomeFile;
  }
  public void setNomeFile(String nomeFile) {
    this.nomeFile = nomeFile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDocumentoDettaglio modelDocumentoDettaglio = (ModelDocumentoDettaglio) o;
    return Objects.equals(base64, modelDocumentoDettaglio.base64) &&
        Objects.equals(letto, modelDocumentoDettaglio.letto) &&
        Objects.equals(nomeFile, modelDocumentoDettaglio.nomeFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64, letto, nomeFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumentoDettaglio {\n");
    
    sb.append("    base64: ").append(toIndentedString(base64)).append("\n");
    sb.append("    letto: ").append(toIndentedString(letto)).append("\n");
    sb.append("    nomeFile: ").append(toIndentedString(nomeFile)).append("\n");
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

