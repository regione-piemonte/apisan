/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.dto.apisanaut;

import java.util.Objects;
import java.util.ArrayList;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;



public class DocumentoFile   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String nome = null;
  private Integer dimensioneInBytes = null;
  private String baseFile = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("nome") 
 
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dimensione_in_bytes") 
 
  public Integer getDimensioneInBytes() {
    return dimensioneInBytes;
  }
  public void setDimensioneInBytes(Integer dimensioneInBytes) {
    this.dimensioneInBytes = dimensioneInBytes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("base_file") 
 
  public String getBaseFile() {
    return baseFile;
  }
  public void setBaseFile(String baseFile) {
    this.baseFile = baseFile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoFile documentoFile = (DocumentoFile) o;
    return Objects.equals(nome, documentoFile.nome) &&
        Objects.equals(dimensioneInBytes, documentoFile.dimensioneInBytes) &&
        Objects.equals(baseFile, documentoFile.baseFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, dimensioneInBytes, baseFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoFile {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    dimensioneInBytes: ").append(toIndentedString(dimensioneInBytes)).append("\n");
    sb.append("    baseFile: ").append(toIndentedString(baseFile)).append("\n");
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

