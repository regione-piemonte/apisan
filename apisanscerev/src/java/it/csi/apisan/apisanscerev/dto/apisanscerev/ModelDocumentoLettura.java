/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.apisanscerev;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class ModelDocumentoLettura   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String id = null;
  private String tipo = null;
  private String descrizione = null;
  private String nomeFile = null;

  /**
   **/
  
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty("id") 
 
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Identificativo univoco - Tipologia dell&#39;allegato richiesto
   **/
  
  @ApiModelProperty(example = "17", value = "Identificativo univoco - Tipologia dell'allegato richiesto")
  @JsonProperty("tipo") 
 
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  /**
   * Descrizione dell&#39;allegato richiesto
   **/
  
  @ApiModelProperty(example = "Attestato di soggiorno permanente", value = "Descrizione dell'allegato richiesto")
  @JsonProperty("descrizione") 
 
  public String getDescrizione() {
    return descrizione;
  }
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * il nome del file
   **/
  
  @ApiModelProperty(example = "nome-file.pdf", value = "il nome del file")
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
    ModelDocumentoLettura modelDocumentoLettura = (ModelDocumentoLettura) o;
    return Objects.equals(id, modelDocumentoLettura.id) &&
        Objects.equals(tipo, modelDocumentoLettura.tipo) &&
        Objects.equals(descrizione, modelDocumentoLettura.descrizione) &&
        Objects.equals(nomeFile, modelDocumentoLettura.nomeFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tipo, descrizione, nomeFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumentoLettura {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
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

