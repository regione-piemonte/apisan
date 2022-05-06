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



public class ModelDocumento   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  
  private String tipo = null;
  private String nomeFile = null;
  private String descrizione = null;
  private String base64 = null;
  private Boolean stranieri = null;

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
   * Il file codificato in base_64
   **/
  
  @ApiModelProperty(example = "ZGVsZmlubyBjdXJpb3NvIDop", value = "Il file codificato in base_64")
  @JsonProperty("base_64") 
 
  public String getBase64() {
    return base64;
  }
  public void setBase64(String base64) {
    this.base64 = base64;
  }

  /**
   * true se il documento è richiesto solo per i cittadini stranieri, false se per tutte le cittadinanze
   **/
  
  @ApiModelProperty(example = "true", value = "true se il documento è richiesto solo per i cittadini stranieri, false se per tutte le cittadinanze")
  @JsonProperty("stranieri") 
 
  public Boolean isStranieri() {
    return stranieri;
  }
  public void setStranieri(Boolean stranieri) {
    this.stranieri = stranieri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelDocumento modelDocumento = (ModelDocumento) o;
    return Objects.equals(tipo, modelDocumento.tipo) &&
        Objects.equals(nomeFile, modelDocumento.nomeFile) &&
        Objects.equals(descrizione, modelDocumento.descrizione) &&
        Objects.equals(base64, modelDocumento.base64) &&
        Objects.equals(stranieri, modelDocumento.stranieri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipo, nomeFile, descrizione, base64, stranieri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelDocumento {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    nomeFile: ").append(toIndentedString(nomeFile)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    base64: ").append(toIndentedString(base64)).append("\n");
    sb.append("    stranieri: ").append(toIndentedString(stranieri)).append("\n");
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

